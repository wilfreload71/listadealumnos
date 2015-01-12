package com.wilsonpachas.listaalumnos.listener;

import com.google.android.gms.maps.model.LatLng;
import com.wilsonpachas.listaalumnos.fragment.MapaFragment;

import android.app.Activity;
import android.content.Context;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;


public class AcualizadorDePosicion implements LocationListener{

	private LocationManager locationManager;
	private MapaFragment mapa;
	
	public AcualizadorDePosicion(Activity activity , MapaFragment mapa)
	{
		this.mapa =mapa;
		locationManager = (LocationManager) activity
				.getSystemService(Context.LOCATION_SERVICE);
		String provider = LocationManager.GPS_PROVIDER;
		long tiempoMinimo =20000;		
		float distanciaMinimo = 20;
		locationManager.requestLocationUpdates(provider, tiempoMinimo,
				distanciaMinimo, this);
				
	}
	
	
	@Override
	public void onLocationChanged(Location location) {
		// TODO Auto-generated method stub
		double latitude = location.getLatitude();
		double longitude = location.getLongitude();
		
		LatLng local = new LatLng(latitude, longitude);
		mapa.central(local);
	}


	@Override
	public void onStatusChanged(String provider, int status, Bundle extras) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void onProviderEnabled(String provider) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void onProviderDisabled(String provider) {
		// TODO Auto-generated method stub
		
	}

	public void  cancelar() {
		locationManager.removeUpdates(this);
	}
}
