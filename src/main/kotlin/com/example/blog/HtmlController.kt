package com.example.blog

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.ui.set
import org.springframework.web.bind.annotation.*

@Controller
class HtmlController {
  @GetMapping("/")
  fun blog(model: Model): String {
    model["title"] = "Blog"
    model["blog"] = Blog()
    return "blog"
  }

  @PostMapping("/")
  fun blogInput(@ModelAttribute blog:Blog, model: Model): String {
    model["title"] = "Blog"
    model["blog"] = blog
    return "result"
  }

}

data class Blog (
    var author: String = "",
    var content: String = ""
)