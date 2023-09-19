
package com.csis3275.controller_jsh_35;


import com.csis3275.model_jsh_35.Book;
import com.csis3275.model_jsh_35.FictionBook;
import com.csis3275.model_jsh_35.NonFictionBook;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BookController {

    @GetMapping("/books")
    public String viewBooks(Model model) {
        // Instantiate the classes
        FictionBook fictionBook = new FictionBook("The Great Gatsby", "F. Scott Fitzgerald", 250);
        NonFictionBook nonFictionBook = new NonFictionBook("Sapiens", "Yuval Noah Harari", "History");

        // Execute methods and add results to the model
        String fictionBookInfo = fictionBook.getFictionBookInfo();
        String nonFictionBookInfo = nonFictionBook.getNonFictionBookInfo();

        model.addAttribute("fictionBookInfo", fictionBookInfo);
        model.addAttribute("nonFictionBookInfo", nonFictionBookInfo);

        return "BookView";
    }
}

