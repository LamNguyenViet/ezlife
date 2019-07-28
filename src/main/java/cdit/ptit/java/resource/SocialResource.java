package cdit.ptit.java.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import cdit.ptit.java.model.Social;
import cdit.ptit.java.service.SocialService;

@RestController
@RequestMapping("/ezlife/api/v1/socials")
public class SocialResource {
	@Autowired
	private SocialService service;
	
	@RequestMapping(value = "/list", method = RequestMethod.GET, produces = { MediaType.APPLICATION_JSON_UTF8_VALUE })
	public ResponseEntity<List<Social>> getAll() {
		return new ResponseEntity<List<Social>>(service.getAll(),HttpStatus.OK);
	}
	@RequestMapping(value = "/page", method = RequestMethod.GET, produces = { MediaType.APPLICATION_JSON_UTF8_VALUE })
	public ResponseEntity<Page<Social>> getPage(Pageable pageable) {
		return new ResponseEntity<Page<Social>>(service.getPage(pageable),HttpStatus.OK);
	}
	@RequestMapping(value = "/list/{id}", method = RequestMethod.GET, produces = { MediaType.APPLICATION_JSON_UTF8_VALUE })
	public ResponseEntity<Social> findOne(@PathVariable("id") int id) {
		return new ResponseEntity<Social>(service.findOne(id),HttpStatus.OK);
	}
	@RequestMapping(value = "/create", method = RequestMethod.POST, produces = { MediaType.APPLICATION_JSON_UTF8_VALUE })
	public ResponseEntity<Integer> save(@RequestBody Social social) {
		return new ResponseEntity<Integer>(service.save(social),HttpStatus.OK);
	}
	@RequestMapping(value = "/update", method = RequestMethod.PUT, produces = { MediaType.APPLICATION_JSON_UTF8_VALUE })
	public ResponseEntity<Integer> update(@RequestBody Social social) {
		return new ResponseEntity<Integer>(service.update(social),HttpStatus.OK);
	}
	@RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE, produces = { MediaType.APPLICATION_JSON_UTF8_VALUE })
	public ResponseEntity<Integer> delete(@PathVariable("id") int id) {
		return new ResponseEntity<Integer>(service.delete(id),HttpStatus.OK);
	}
}
