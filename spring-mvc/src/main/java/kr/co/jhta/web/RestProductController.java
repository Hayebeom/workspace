package kr.co.jhta.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kr.co.jhta.service.ProductService;
import kr.co.jhta.vo.Product;

////json으로 주는 응답이 너무 많다, responsebody 쓰기 싫어서 @RestController를 붙이면 Responsebody 생략 (default)
@RestController
@RequestMapping("/rest")
public class RestProductController {

	@Autowired
	ProductService productService;
	
	@GetMapping("/products/")
	public List<Product> products() {
		List<Product> products = productService.getAllProducts();
		return products;
	}
	
	@GetMapping("/products/{no}")
	public Product product(@PathVariable("no") int productNo) {
		Product product = productService.getProductDetail(productNo);
		return product;
	}

}
