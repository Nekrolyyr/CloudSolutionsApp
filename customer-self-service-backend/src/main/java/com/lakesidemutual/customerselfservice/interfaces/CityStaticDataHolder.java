package com.lakesidemutual.customerselfservice.interfaces;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lakesidemutual.customerselfservice.infrastructure.CustomerCoreRemoteProxy;
import com.lakesidemutual.customerselfservice.interfaces.dtos.city.CitiesResponseDto;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;

/**
 * This REST controller allows clients to retrieve a list of cities that match a given postal code. It is an application of
 * the <a href="https://microservice-api-patterns.org/patterns/responsibility/informationHolderEndpoints/StaticDataHolder">Static Data Holder</a> pattern.
 * A Static Data Holder is a dedicated endpoint that serves as single point of reference for static data (i.e., data that almost never changes).
 *
 * @see <a href=
 *      "https://microservice-api-patterns.org/patterns/responsibility/informationHolderEndpoints/StaticDataHolder">https://microservice-api-patterns.org/patterns/responsibility/informationHolderEndpoints/StaticDataHolder</a>
 */
@RestController
@RequestMapping("/cities")
public class CityStaticDataHolder {
	@Autowired
	private CustomerCoreRemoteProxy customerCoreRemoteProxy;

	@ApiOperation(value = "Get the cities for a particular postal code.")
	@GetMapping(value = "/{postalCode}")
	public ResponseEntity<CitiesResponseDto> getCitiesForPostalCode(
			@ApiParam(value = "the postal code", required = true) @PathVariable String postalCode) {

		return customerCoreRemoteProxy.getCitiesForPostalCode(postalCode);
	}
}
