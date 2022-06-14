package aulia.haris.jokesapp.controller;

import aulia.haris.jokesapp.service.QuoteService;
import aulia.haris.jokesapp.service.QuoteServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class QuotesController {

    public final QuoteService quoteService;

    public QuotesController(QuoteService quoteService) {
        this.quoteService = quoteService;
    }

    @RequestMapping("/")
    public String getQuotes(Model model){
        String randomQuote = quoteService.getRandomQuote();
        model.addAttribute("quote", randomQuote);
        return "directory/quote";
    }
}
