/*
 * Copyright 2012 Harald Wellmann
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 *
 */
package org.ops4j.pax.exam.regression.maven;

import static org.ops4j.pax.exam.CoreOptions.*;
import static org.junit.Assert.assertNotNull;

import org.ops4j.pax.exam.Configuration;
import org.ops4j.pax.exam.Option;

public class ServerConfiguration {

    @Configuration
    public Option[] configuration() {
        verify_PAXEXAM_529();

        return options(systemProperty("org.osgi.service.http.port").value("8181"),
            frameworkProperty("osgi.console").value("6666"),

            mavenBundle("org.ops4j.pax.web", "pax-web-spi").version("2.0.2"),
            mavenBundle("org.ops4j.pax.web", "pax-web-api").version("2.0.2"),
            mavenBundle("org.ops4j.pax.web", "pax-web-extender-war").version("2.0.2"),
            mavenBundle("org.ops4j.pax.web", "pax-web-extender-whiteboard").version("2.0.2"),
            mavenBundle("org.ops4j.pax.web", "pax-web-jetty").version("2.0.2"),
            mavenBundle("org.ops4j.pax.web", "pax-web-runtime").version("2.0.2"),
            mavenBundle("org.ops4j.pax.web", "pax-web-jsp").version("2.0.2"),
            mavenBundle("org.eclipse.jdt.core.compiler", "ecj").version("3.5.1"),

            linkBundle("org.eclipse.jetty.util"),
            linkBundle("org.eclipse.jetty.io"),
            linkBundle("org.eclipse.jetty.http"),
            linkBundle("org.eclipse.jetty.continuation"),
            linkBundle("org.eclipse.jetty.server"),
            linkBundle("org.eclipse.jetty.security"),
            linkBundle("org.eclipse.jetty.xml"),
            linkBundle("org.eclipse.jetty.servlet"),
            
            mavenBundle("org.apache.geronimo.specs", "geronimo-servlet_3.0_spec").version("1.0"),
            mavenBundle("org.osgi", "org.osgi.compendium", "4.3.0"),

            mavenBundle("org.slf4j", "slf4j-api").versionAsInProject(),
            mavenBundle("org.slf4j", "slf4j-simple").versionAsInProject().noStart(),

            mavenBundle("org.ops4j.pax.exam.samples", "pax-exam-sample11-wab").versionAsInProject()

        );
    }

    private void verify_PAXEXAM_529() {
       	assertNotNull("System property \"basedir\" not set (PAXEXAM-529)", System.getProperty("basedir"));
    }
}
