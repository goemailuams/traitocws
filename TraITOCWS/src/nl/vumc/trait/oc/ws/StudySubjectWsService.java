/*
	
	Copyright 2012 VU Medical Center Amsterdam
	
	Licensed under the Apache License, Version 2.0 (the "License");
	you may not use this file except in compliance with the License.
	You may obtain a copy of the License at
	
	    http://www.apache.org/licenses/LICENSE-2.0
	
	Unless required by applicable law or agreed to in writing, software
	distributed under the License is distributed on an "AS IS" BASIS,
	WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
	See the License for the specific language governing permissions and
	limitations under the License.
	
*/

package nl.vumc.trait.oc.ws;

import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.namespace.QName;

import org.openclinica.ws.studysubject.v1.ObjectFactory;
import org.openclinica.ws.studysubject.v1.WsService;

/**
 * Use this as a shortcut to set some default values for this web service.
 * 
 * @author Arjan van der Velde (ag.vandervelde@vumc.nl)
 */
public class StudySubjectWsService extends WsService {

	/**
	 * Default WSDL URL for this web service
	 */
	public static final String DEFAULT_URL = "https://appserv2.ctms/OpenClinica-ws/ws/studySubject/v1/studySubjectWsdl.wsdl";

	/**
	 * Inherited from super class
	 * @param wsdlLocation WSDL URL
	 * @param serviceName Service QName
	 */
	public StudySubjectWsService(URL wsdlLocation, QName serviceName) {
		super(wsdlLocation, serviceName);
	}

	/**
	 * Setup using WSDL location specified as String
	 * @param wsdlLocation WSDL location In case of invalid URL
	 * @throws MalformedURLException 
	 */
	public StudySubjectWsService(String wsdlLocation) throws MalformedURLException {
		this(new URL(org.openclinica.ws.studysubject.v1.WsService.class.getResource("."), wsdlLocation), new QName(
				"http://openclinica.org/ws/studySubject/v1", "wsService"));
	}

	/**
	 * Default constructor using default WSDL URL
	 * In case of invalid URL
	 * @throws MalformedURLException 
	 */
	public StudySubjectWsService() throws MalformedURLException {
		this(DEFAULT_URL);
	}

	/**
	 * @return ObjectFactory for this web service
	 */
	public static ObjectFactory getObjectFactory() {
		return new ObjectFactory();
	}

}
