/*
 * Copyright 2009 Toni Menzel.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or
 * implied.
 *
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.ops4j.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.ops4j.pax.exam.Option;
import org.ops4j.pax.exam.container.def.internal.PaxRunnerTestContainerFactory;
import org.ops4j.pax.exam.junit.Configuration;
import org.ops4j.pax.exam.junit.JUnit4TestRunner;

import static org.ops4j.pax.exam.CoreOptions.*;

/**
 * @author Toni Menzel
 * @since Mar 15, 2010
 */
@RunWith( JUnit4TestRunner.class )
public class SingleTest
{

    @Configuration
    public Option[] config()
    {
        return options(
            //executionPolicy().testContainer( PaxRunnerTestContainerFactory.class )
        );
    }

    @Test
    public void hello()
    {
        System.out.println( "Hello from Felix!" );
    }
}
