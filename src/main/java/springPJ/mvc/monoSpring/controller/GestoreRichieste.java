package springPJ.mvc.monoSpring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import jakarta.validation.Valid;
import springPJ.mvc.monoSpring.model.Utente;
import springPJ.mvc.monoSpring.repository.IRepoUtente;

@Controller
public class GestoreRichieste {

    @Autowired
    IRepoUtente iru;
    
    @PostMapping("/upsert")
    public String upsert(@Valid Utente utente, BindingResult result, Model model) {
        if (result.hasErrors()) {
            model.addAttribute("utente", utente);
            return "form"; // Torna alla pagina del form con gli errori
        }
        iru.save(utente); // Salva l'utente nel database
        return "redirect:/index"; // Reindirizza alla home dopo il salvataggio
    }

    
    @GetMapping("/readAll")
    public String readAll(Model model) {
        List<Utente> utenti = iru.findAll();
        model.addAttribute("utenti", utenti);
        return "tabella";
    }
    
    @GetMapping("/delete")
    public String delete(@RequestParam int id) {
        iru.deleteById(id);
        return "redirect:/index";
    }
    
    @GetMapping("/form")
    public String showForm(Model model) {
        model.addAttribute("utente", new Utente());  // Passa un oggetto vuoto per Thymeleaf
        return "form"; // Assicurati che il nome corrisponda a quello della tua pagina HTML
    }
    
    @GetMapping("/index")
    public String home(Model model) {
        // Puoi aggiungere dati al modello, se necessario
        return "index"; // Nome della vista della tua home page
    }
}
