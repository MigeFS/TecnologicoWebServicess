
package org.tecnologico;

import javax.jws.WebService;

@WebService(endpointInterface = "org.tecnologico.HelloWorld")
public class HelloWorldImpl implements HelloWorld {

    public String sayHi(String text) {
        return "Hello " + text;
    }
}

