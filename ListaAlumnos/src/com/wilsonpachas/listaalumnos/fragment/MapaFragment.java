package com.wilsonpachas.listaalumnos.fragment;

import java.util.List;

import com.wilsonpachas.listaalumnos.dao.AlumnoDAO;
import com.wilsonpachas.listaalumnos.listener.AcualizadorDePosicion;
import com.wilsonpachas.listaalumnos.modelo.Alumno;
import util.Localizador;
import android.support.v4.app.FragmentActivity;

import com.google.android.gms.maps.CameraUpdate;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapaFragment extends SupportMapFragment {
	
	@Override
	public void onResume()
	{
		super.onResume();
		
		getMap().setMyLocationEnabled(true);
		new AcualizadorDePosicion(getActivity(), this);
	}

	
	
//	@Override
//	public void onResume() {
//	super.onResume();
//		
//		FragmentActivity context = getActivity();
//		Localizador coderUtil = new Localizador(context);
//     	LatLng local = 
//			coderUtil.getCoordenada("Av Don jose san martin," +
//						" Huaura, Lima");
//		central(local);
//		
//		AlumnoDAO dao = new AlumnoDAO(context);
//		List<Alumno> alumnos = dao.getLista();
//		dao.close();
//		
//		for(Alumno alumno: alumnos){
//			
//			
//			LatLng coordenada = new Localizador(context).
//					getCoordenada(alumno.getDireccion());
//
//			if(coordenada!=null){
//				MarkerOptions marcador = new MarkerOptions()
//			.position(coordenada).title(alumno.getNombre())
//				.snippet(alumno.getDireccion());
//				
//				//configurar marcador o titulo
//				getMap().addMarker(marcador);
//			}
//
//		}
//	}
	
	public void central(LatLng local) {
		GoogleMap map = getMap();
		CameraUpdate update = CameraUpdateFactory.newLatLngZoom(local, 17);
		map.animateCamera(update);
	}
}
