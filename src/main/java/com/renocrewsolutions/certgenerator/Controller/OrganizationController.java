package com.renocrewsolutions.certgenerator.Controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.renocrewsolutions.certgenerator.Service.OrganizationService;
import com.renocrewsolutions.certgenerator.Service.UserService;
import com.renocrewsolutions.certgenerator.entity.Organization;
import com.renocrewsolutions.certgenerator.entity.User;

//import com.renocrewsolutions.certgenerator.entity.Organization;

	
	@RestController
	@RequestMapping("/organization")
	public class OrganizationController {
	    private final OrganizationService organizationService;

	    @Autowired
	    public OrganizationController (OrganizationService organizationService) {
	        this.organizationService= organizationService;
	    }

	    @GetMapping
	    public ResponseEntity<List<Organization>> getAllOrganization() {
	        List<Organization> organizations = organizationService.getAllOrganization();
	        return new ResponseEntity<>(organizations, HttpStatus.OK);
	    }

	    @GetMapping("/{id}")
	    public ResponseEntity<Organization> getOrganizationById(@PathVariable Long orgId) {
	        return organizationService.getOrganizationById(orgId)
	                .map(organization -> new ResponseEntity<>(organization, HttpStatus.OK))
	                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
	    }

	    @PostMapping
	    public ResponseEntity<Organization> createOrganization(@RequestBody Organization organization) {
	        Organization createdOrganization = organizationService.createdOrganization(organization);
	        return new ResponseEntity<>(createdOrganization, HttpStatus.CREATED);
	    }

	    @PutMapping("/{id}")
	    public ResponseEntity<Organization> updateOrganization(@PathVariable Long orgId, @RequestBody Organization organization) {
	        organization.setorgId(orgId);
	        Organization updatedOrganization = organizationService.updateOrganization(organization);
	        return new ResponseEntity<>(updatedOrganization, HttpStatus.OK);
	    }

	    @DeleteMapping("/{id}")
	    public ResponseEntity<Void> deleteOrganization(@PathVariable Long orgId) {
	    	OrganizationService.deleteOrganization(orgId);
	        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	    }
	

	
	}
