/*
 * Copyright 1999-2004 The Apache Software Foundation.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.commons.pool;

/**
 * A base implemenation of {@link KeyedPoolableObjectFactory KeyedPoolableObjectFactory}.
 * <p>
 * All operations defined here are essentially no-op's.
 *
 * @see KeyedPoolableObjectFactory
 *
 * @author Rodney Waldhoff
 * @version $Revision$ $Date$ 
 */
public abstract class BaseKeyedPoolableObjectFactory implements KeyedPoolableObjectFactory {
    public abstract Object makeObject(Object key)
        throws Exception;

    /** No-op. */
    public void destroyObject(Object key, Object obj)
        throws Exception {
    }

    /**
     * This implementation always returns <tt>true</tt>.
     * @return <tt>true</tt>
     */
    public boolean validateObject(Object key, Object obj) {
        return true;
    }

    /** No-op. */
    public void activateObject(Object key, Object obj)
        throws Exception {
    }

    /** No-op. */
    public void passivateObject(Object key, Object obj) 
        throws Exception {
    }
}
