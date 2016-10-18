package be.insaneprogramming.cleanarch.rest.viewmodel;

import java.util.List;

import org.immutables.value.Value;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;

@Value.Immutable
@JsonSerialize
public interface BuildingJson {
	String getId();
	String getName();
	List<TenantJson> getTenants();
}