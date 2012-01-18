/*
 * @(#)RmiConnectorServerObjectImpl_Skel.java	1.5
 *
 * 
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS HEADER.
 * 
 * Copyright (c) 2007 Sun Microsystems, Inc. All Rights Reserved.
 * 
 * The contents of this file are subject to the terms of either the GNU General
 * Public License Version 2 only ("GPL") or the Common Development and
 * Distribution License("CDDL")(collectively, the "License"). You may not use
 * this file except in compliance with the License. You can obtain a copy of the
 * License at http://opendmk.dev.java.net/legal_notices/licenses.txt or in the 
 * LEGAL_NOTICES folder that accompanied this code. See the License for the 
 * specific language governing permissions and limitations under the License.
 * 
 * When distributing the software, include this License Header Notice in each
 * file and include the License file found at
 *     http://opendmk.dev.java.net/legal_notices/licenses.txt
 * or in the LEGAL_NOTICES folder that accompanied this code.
 * Sun designates this particular file as subject to the "Classpath" exception
 * as provided by Sun in the GPL Version 2 section of the License file that
 * accompanied this code.
 * 
 * If applicable, add the following below the License Header, with the fields
 * enclosed by brackets [] replaced by your own identifying information:
 * 
 *       "Portions Copyrighted [year] [name of copyright owner]"
 * 
 * Contributor(s):
 * 
 * If you wish your version of this file to be governed by only the CDDL or
 * only the GPL Version 2, indicate your decision by adding
 * 
 *       "[Contributor] elects to include this software in this distribution
 *        under the [CDDL or GPL Version 2] license."
 * 
 * If you don't indicate a single choice of license, a recipient has the option
 * to distribute your version of this file under either the CDDL or the GPL
 * Version 2, or to extend the choice of license to its licensees as provided
 * above. However, if you add GPL Version 2 code and therefore, elected the
 * GPL Version 2 license, then the option applies only if the new code is made
 * subject to such option by the copyright holder.
 * 
 *
 */
// Skeleton class generated by rmic, do not edit.
// Contents subject to change without notice.

package com.sun.jdmk.comm;

public final class RmiConnectorServerObjectImpl_Skel
    implements java.rmi.server.Skeleton
{
    private static final java.rmi.server.Operation[] operations = {
	new java.rmi.server.Operation("javax.management.ObjectInstance createMBean(java.lang.String, javax.management.ObjectName)"),
	new java.rmi.server.Operation("javax.management.ObjectInstance createMBean(java.lang.String, javax.management.ObjectName, javax.management.ObjectName)"),
	new java.rmi.server.Operation("javax.management.ObjectInstance createMBean(java.lang.String, javax.management.ObjectName, javax.management.ObjectName, java.lang.Object[], java.lang.String[])"),
	new java.rmi.server.Operation("javax.management.ObjectInstance createMBean(java.lang.String, javax.management.ObjectName, java.lang.Object[], java.lang.String[])"),
	new java.rmi.server.Operation("java.lang.Object getAttribute(javax.management.ObjectName, java.lang.String)"),
	new java.rmi.server.Operation("javax.management.AttributeList getAttributes(javax.management.ObjectName, java.lang.String[])"),
	new java.rmi.server.Operation("java.lang.String getDefaultDomain()"),
	new java.rmi.server.Operation("java.lang.Integer getMBeanCount()"),
	new java.rmi.server.Operation("javax.management.MBeanInfo getMBeanInfo(javax.management.ObjectName)"),
	new java.rmi.server.Operation("javax.management.ObjectInstance getObjectInstance(javax.management.ObjectName)"),
	new java.rmi.server.Operation("java.lang.Object invoke(javax.management.ObjectName, java.lang.String, java.lang.Object[], java.lang.String[])"),
	new java.rmi.server.Operation("boolean isRegistered(javax.management.ObjectName)"),
	new java.rmi.server.Operation("java.lang.String pingHeartBeatServer(java.lang.String, int, int, java.lang.Long)"),
	new java.rmi.server.Operation("java.util.Set queryMBeans(javax.management.ObjectName, javax.management.QueryExp)"),
	new java.rmi.server.Operation("java.util.Set queryNames(javax.management.ObjectName, javax.management.QueryExp)"),
	new java.rmi.server.Operation("java.lang.Object remoteRequest(int, java.lang.Object[])[]"),
	new java.rmi.server.Operation("void setAttribute(javax.management.ObjectName, javax.management.Attribute)"),
	new java.rmi.server.Operation("javax.management.AttributeList setAttributes(javax.management.ObjectName, javax.management.AttributeList)"),
	new java.rmi.server.Operation("void unregisterMBean(javax.management.ObjectName)")
    };
    
    private static final long interfaceHash = 8752061702242540596L;
    
    public java.rmi.server.Operation[] getOperations() {
	return (java.rmi.server.Operation[]) operations.clone();
    }
    
    public void dispatch(java.rmi.Remote obj, java.rmi.server.RemoteCall call, int opnum, long hash)
	throws java.lang.Exception
    {
	if (opnum < 0) {
	    if (hash == -7360614118430494563L) {
		opnum = 0;
	    } else if (hash == -2492717635587988707L) {
		opnum = 1;
	    } else if (hash == 3610539940275463274L) {
		opnum = 2;
	    } else if (hash == -1935813891928601151L) {
		opnum = 3;
	    } else if (hash == -4328545079311516219L) {
		opnum = 4;
	    } else if (hash == -1339030121734381123L) {
		opnum = 5;
	    } else if (hash == -8353033044113668180L) {
		opnum = 6;
	    } else if (hash == 3242680704292914065L) {
		opnum = 7;
	    } else if (hash == 9086993577903682056L) {
		opnum = 8;
	    } else if (hash == 262409328737475861L) {
		opnum = 9;
	    } else if (hash == 4929733317032488605L) {
		opnum = 10;
	    } else if (hash == 7945132848729715466L) {
		opnum = 11;
	    } else if (hash == 2796684047924183521L) {
		opnum = 12;
	    } else if (hash == 7847323131051008573L) {
		opnum = 13;
	    } else if (hash == 985189993453941395L) {
		opnum = 14;
	    } else if (hash == -5203888509662801705L) {
		opnum = 15;
	    } else if (hash == 1136233045049201314L) {
		opnum = 16;
	    } else if (hash == 4016793913958708484L) {
		opnum = 17;
	    } else if (hash == -8507645316636479080L) {
		opnum = 18;
	    } else {
		throw new java.rmi.UnmarshalException("invalid method hash");
	    }
	} else {
	    if (hash != interfaceHash)
		throw new java.rmi.server.SkeletonMismatchException("interface hash mismatch");
	}
	
	com.sun.jdmk.comm.RmiConnectorServerObjectImpl server = (com.sun.jdmk.comm.RmiConnectorServerObjectImpl) obj;
	switch (opnum) {
	case 0: // createMBean(String, ObjectName)
	{
	    java.lang.String $param_String_1;
	    javax.management.ObjectName $param_ObjectName_2;
	    try {
		java.io.ObjectInput in = call.getInputStream();
		$param_String_1 = (java.lang.String) in.readObject();
		$param_ObjectName_2 = (javax.management.ObjectName) in.readObject();
	    } catch (java.io.IOException e) {
		throw new java.rmi.UnmarshalException("error unmarshalling arguments", e);
	    } catch (java.lang.ClassNotFoundException e) {
		throw new java.rmi.UnmarshalException("error unmarshalling arguments", e);
	    } finally {
		call.releaseInputStream();
	    }
	    javax.management.ObjectInstance $result = server.createMBean($param_String_1, $param_ObjectName_2);
	    try {
		java.io.ObjectOutput out = call.getResultStream(true);
		out.writeObject($result);
	    } catch (java.io.IOException e) {
		throw new java.rmi.MarshalException("error marshalling return", e);
	    }
	    break;
	}
	    
	case 1: // createMBean(String, ObjectName, ObjectName)
	{
	    java.lang.String $param_String_1;
	    javax.management.ObjectName $param_ObjectName_2;
	    javax.management.ObjectName $param_ObjectName_3;
	    try {
		java.io.ObjectInput in = call.getInputStream();
		$param_String_1 = (java.lang.String) in.readObject();
		$param_ObjectName_2 = (javax.management.ObjectName) in.readObject();
		$param_ObjectName_3 = (javax.management.ObjectName) in.readObject();
	    } catch (java.io.IOException e) {
		throw new java.rmi.UnmarshalException("error unmarshalling arguments", e);
	    } catch (java.lang.ClassNotFoundException e) {
		throw new java.rmi.UnmarshalException("error unmarshalling arguments", e);
	    } finally {
		call.releaseInputStream();
	    }
	    javax.management.ObjectInstance $result = server.createMBean($param_String_1, $param_ObjectName_2, $param_ObjectName_3);
	    try {
		java.io.ObjectOutput out = call.getResultStream(true);
		out.writeObject($result);
	    } catch (java.io.IOException e) {
		throw new java.rmi.MarshalException("error marshalling return", e);
	    }
	    break;
	}
	    
	case 2: // createMBean(String, ObjectName, ObjectName, Object[], String[])
	{
	    java.lang.String $param_String_1;
	    javax.management.ObjectName $param_ObjectName_2;
	    javax.management.ObjectName $param_ObjectName_3;
	    java.lang.Object[] $param_arrayOf_Object_4;
	    java.lang.String[] $param_arrayOf_String_5;
	    try {
		java.io.ObjectInput in = call.getInputStream();
		$param_String_1 = (java.lang.String) in.readObject();
		$param_ObjectName_2 = (javax.management.ObjectName) in.readObject();
		$param_ObjectName_3 = (javax.management.ObjectName) in.readObject();
		$param_arrayOf_Object_4 = (java.lang.Object[]) in.readObject();
		$param_arrayOf_String_5 = (java.lang.String[]) in.readObject();
	    } catch (java.io.IOException e) {
		throw new java.rmi.UnmarshalException("error unmarshalling arguments", e);
	    } catch (java.lang.ClassNotFoundException e) {
		throw new java.rmi.UnmarshalException("error unmarshalling arguments", e);
	    } finally {
		call.releaseInputStream();
	    }
	    javax.management.ObjectInstance $result = server.createMBean($param_String_1, $param_ObjectName_2, $param_ObjectName_3, $param_arrayOf_Object_4, $param_arrayOf_String_5);
	    try {
		java.io.ObjectOutput out = call.getResultStream(true);
		out.writeObject($result);
	    } catch (java.io.IOException e) {
		throw new java.rmi.MarshalException("error marshalling return", e);
	    }
	    break;
	}
	    
	case 3: // createMBean(String, ObjectName, Object[], String[])
	{
	    java.lang.String $param_String_1;
	    javax.management.ObjectName $param_ObjectName_2;
	    java.lang.Object[] $param_arrayOf_Object_3;
	    java.lang.String[] $param_arrayOf_String_4;
	    try {
		java.io.ObjectInput in = call.getInputStream();
		$param_String_1 = (java.lang.String) in.readObject();
		$param_ObjectName_2 = (javax.management.ObjectName) in.readObject();
		$param_arrayOf_Object_3 = (java.lang.Object[]) in.readObject();
		$param_arrayOf_String_4 = (java.lang.String[]) in.readObject();
	    } catch (java.io.IOException e) {
		throw new java.rmi.UnmarshalException("error unmarshalling arguments", e);
	    } catch (java.lang.ClassNotFoundException e) {
		throw new java.rmi.UnmarshalException("error unmarshalling arguments", e);
	    } finally {
		call.releaseInputStream();
	    }
	    javax.management.ObjectInstance $result = server.createMBean($param_String_1, $param_ObjectName_2, $param_arrayOf_Object_3, $param_arrayOf_String_4);
	    try {
		java.io.ObjectOutput out = call.getResultStream(true);
		out.writeObject($result);
	    } catch (java.io.IOException e) {
		throw new java.rmi.MarshalException("error marshalling return", e);
	    }
	    break;
	}
	    
	case 4: // getAttribute(ObjectName, String)
	{
	    javax.management.ObjectName $param_ObjectName_1;
	    java.lang.String $param_String_2;
	    try {
		java.io.ObjectInput in = call.getInputStream();
		$param_ObjectName_1 = (javax.management.ObjectName) in.readObject();
		$param_String_2 = (java.lang.String) in.readObject();
	    } catch (java.io.IOException e) {
		throw new java.rmi.UnmarshalException("error unmarshalling arguments", e);
	    } catch (java.lang.ClassNotFoundException e) {
		throw new java.rmi.UnmarshalException("error unmarshalling arguments", e);
	    } finally {
		call.releaseInputStream();
	    }
	    java.lang.Object $result = server.getAttribute($param_ObjectName_1, $param_String_2);
	    try {
		java.io.ObjectOutput out = call.getResultStream(true);
		out.writeObject($result);
	    } catch (java.io.IOException e) {
		throw new java.rmi.MarshalException("error marshalling return", e);
	    }
	    break;
	}
	    
	case 5: // getAttributes(ObjectName, String[])
	{
	    javax.management.ObjectName $param_ObjectName_1;
	    java.lang.String[] $param_arrayOf_String_2;
	    try {
		java.io.ObjectInput in = call.getInputStream();
		$param_ObjectName_1 = (javax.management.ObjectName) in.readObject();
		$param_arrayOf_String_2 = (java.lang.String[]) in.readObject();
	    } catch (java.io.IOException e) {
		throw new java.rmi.UnmarshalException("error unmarshalling arguments", e);
	    } catch (java.lang.ClassNotFoundException e) {
		throw new java.rmi.UnmarshalException("error unmarshalling arguments", e);
	    } finally {
		call.releaseInputStream();
	    }
	    javax.management.AttributeList $result = server.getAttributes($param_ObjectName_1, $param_arrayOf_String_2);
	    try {
		java.io.ObjectOutput out = call.getResultStream(true);
		out.writeObject($result);
	    } catch (java.io.IOException e) {
		throw new java.rmi.MarshalException("error marshalling return", e);
	    }
	    break;
	}
	    
	case 6: // getDefaultDomain()
	{
	    call.releaseInputStream();
	    java.lang.String $result = server.getDefaultDomain();
	    try {
		java.io.ObjectOutput out = call.getResultStream(true);
		out.writeObject($result);
	    } catch (java.io.IOException e) {
		throw new java.rmi.MarshalException("error marshalling return", e);
	    }
	    break;
	}
	    
	case 7: // getMBeanCount()
	{
	    call.releaseInputStream();
	    java.lang.Integer $result = server.getMBeanCount();
	    try {
		java.io.ObjectOutput out = call.getResultStream(true);
		out.writeObject($result);
	    } catch (java.io.IOException e) {
		throw new java.rmi.MarshalException("error marshalling return", e);
	    }
	    break;
	}
	    
	case 8: // getMBeanInfo(ObjectName)
	{
	    javax.management.ObjectName $param_ObjectName_1;
	    try {
		java.io.ObjectInput in = call.getInputStream();
		$param_ObjectName_1 = (javax.management.ObjectName) in.readObject();
	    } catch (java.io.IOException e) {
		throw new java.rmi.UnmarshalException("error unmarshalling arguments", e);
	    } catch (java.lang.ClassNotFoundException e) {
		throw new java.rmi.UnmarshalException("error unmarshalling arguments", e);
	    } finally {
		call.releaseInputStream();
	    }
	    javax.management.MBeanInfo $result = server.getMBeanInfo($param_ObjectName_1);
	    try {
		java.io.ObjectOutput out = call.getResultStream(true);
		out.writeObject($result);
	    } catch (java.io.IOException e) {
		throw new java.rmi.MarshalException("error marshalling return", e);
	    }
	    break;
	}
	    
	case 9: // getObjectInstance(ObjectName)
	{
	    javax.management.ObjectName $param_ObjectName_1;
	    try {
		java.io.ObjectInput in = call.getInputStream();
		$param_ObjectName_1 = (javax.management.ObjectName) in.readObject();
	    } catch (java.io.IOException e) {
		throw new java.rmi.UnmarshalException("error unmarshalling arguments", e);
	    } catch (java.lang.ClassNotFoundException e) {
		throw new java.rmi.UnmarshalException("error unmarshalling arguments", e);
	    } finally {
		call.releaseInputStream();
	    }
	    javax.management.ObjectInstance $result = server.getObjectInstance($param_ObjectName_1);
	    try {
		java.io.ObjectOutput out = call.getResultStream(true);
		out.writeObject($result);
	    } catch (java.io.IOException e) {
		throw new java.rmi.MarshalException("error marshalling return", e);
	    }
	    break;
	}
	    
	case 10: // invoke(ObjectName, String, Object[], String[])
	{
	    javax.management.ObjectName $param_ObjectName_1;
	    java.lang.String $param_String_2;
	    java.lang.Object[] $param_arrayOf_Object_3;
	    java.lang.String[] $param_arrayOf_String_4;
	    try {
		java.io.ObjectInput in = call.getInputStream();
		$param_ObjectName_1 = (javax.management.ObjectName) in.readObject();
		$param_String_2 = (java.lang.String) in.readObject();
		$param_arrayOf_Object_3 = (java.lang.Object[]) in.readObject();
		$param_arrayOf_String_4 = (java.lang.String[]) in.readObject();
	    } catch (java.io.IOException e) {
		throw new java.rmi.UnmarshalException("error unmarshalling arguments", e);
	    } catch (java.lang.ClassNotFoundException e) {
		throw new java.rmi.UnmarshalException("error unmarshalling arguments", e);
	    } finally {
		call.releaseInputStream();
	    }
	    java.lang.Object $result = server.invoke($param_ObjectName_1, $param_String_2, $param_arrayOf_Object_3, $param_arrayOf_String_4);
	    try {
		java.io.ObjectOutput out = call.getResultStream(true);
		out.writeObject($result);
	    } catch (java.io.IOException e) {
		throw new java.rmi.MarshalException("error marshalling return", e);
	    }
	    break;
	}
	    
	case 11: // isRegistered(ObjectName)
	{
	    javax.management.ObjectName $param_ObjectName_1;
	    try {
		java.io.ObjectInput in = call.getInputStream();
		$param_ObjectName_1 = (javax.management.ObjectName) in.readObject();
	    } catch (java.io.IOException e) {
		throw new java.rmi.UnmarshalException("error unmarshalling arguments", e);
	    } catch (java.lang.ClassNotFoundException e) {
		throw new java.rmi.UnmarshalException("error unmarshalling arguments", e);
	    } finally {
		call.releaseInputStream();
	    }
	    boolean $result = server.isRegistered($param_ObjectName_1);
	    try {
		java.io.ObjectOutput out = call.getResultStream(true);
		out.writeBoolean($result);
	    } catch (java.io.IOException e) {
		throw new java.rmi.MarshalException("error marshalling return", e);
	    }
	    break;
	}
	    
	case 12: // pingHeartBeatServer(String, int, int, Long)
	{
	    java.lang.String $param_String_1;
	    int $param_int_2;
	    int $param_int_3;
	    java.lang.Long $param_Long_4;
	    try {
		java.io.ObjectInput in = call.getInputStream();
		$param_String_1 = (java.lang.String) in.readObject();
		$param_int_2 = in.readInt();
		$param_int_3 = in.readInt();
		$param_Long_4 = (java.lang.Long) in.readObject();
	    } catch (java.io.IOException e) {
		throw new java.rmi.UnmarshalException("error unmarshalling arguments", e);
	    } catch (java.lang.ClassNotFoundException e) {
		throw new java.rmi.UnmarshalException("error unmarshalling arguments", e);
	    } finally {
		call.releaseInputStream();
	    }
	    java.lang.String $result = server.pingHeartBeatServer($param_String_1, $param_int_2, $param_int_3, $param_Long_4);
	    try {
		java.io.ObjectOutput out = call.getResultStream(true);
		out.writeObject($result);
	    } catch (java.io.IOException e) {
		throw new java.rmi.MarshalException("error marshalling return", e);
	    }
	    break;
	}
	    
	case 13: // queryMBeans(ObjectName, QueryExp)
	{
	    javax.management.ObjectName $param_ObjectName_1;
	    javax.management.QueryExp $param_QueryExp_2;
	    try {
		java.io.ObjectInput in = call.getInputStream();
		$param_ObjectName_1 = (javax.management.ObjectName) in.readObject();
		$param_QueryExp_2 = (javax.management.QueryExp) in.readObject();
	    } catch (java.io.IOException e) {
		throw new java.rmi.UnmarshalException("error unmarshalling arguments", e);
	    } catch (java.lang.ClassNotFoundException e) {
		throw new java.rmi.UnmarshalException("error unmarshalling arguments", e);
	    } finally {
		call.releaseInputStream();
	    }
	    java.util.Set $result = server.queryMBeans($param_ObjectName_1, $param_QueryExp_2);
	    try {
		java.io.ObjectOutput out = call.getResultStream(true);
		out.writeObject($result);
	    } catch (java.io.IOException e) {
		throw new java.rmi.MarshalException("error marshalling return", e);
	    }
	    break;
	}
	    
	case 14: // queryNames(ObjectName, QueryExp)
	{
	    javax.management.ObjectName $param_ObjectName_1;
	    javax.management.QueryExp $param_QueryExp_2;
	    try {
		java.io.ObjectInput in = call.getInputStream();
		$param_ObjectName_1 = (javax.management.ObjectName) in.readObject();
		$param_QueryExp_2 = (javax.management.QueryExp) in.readObject();
	    } catch (java.io.IOException e) {
		throw new java.rmi.UnmarshalException("error unmarshalling arguments", e);
	    } catch (java.lang.ClassNotFoundException e) {
		throw new java.rmi.UnmarshalException("error unmarshalling arguments", e);
	    } finally {
		call.releaseInputStream();
	    }
	    java.util.Set $result = server.queryNames($param_ObjectName_1, $param_QueryExp_2);
	    try {
		java.io.ObjectOutput out = call.getResultStream(true);
		out.writeObject($result);
	    } catch (java.io.IOException e) {
		throw new java.rmi.MarshalException("error marshalling return", e);
	    }
	    break;
	}
	    
	case 15: // remoteRequest(int, Object[])
	{
	    int $param_int_1;
	    java.lang.Object[] $param_arrayOf_Object_2;
	    try {
		java.io.ObjectInput in = call.getInputStream();
		$param_int_1 = in.readInt();
		$param_arrayOf_Object_2 = (java.lang.Object[]) in.readObject();
	    } catch (java.io.IOException e) {
		throw new java.rmi.UnmarshalException("error unmarshalling arguments", e);
	    } catch (java.lang.ClassNotFoundException e) {
		throw new java.rmi.UnmarshalException("error unmarshalling arguments", e);
	    } finally {
		call.releaseInputStream();
	    }
	    java.lang.Object[] $result = server.remoteRequest($param_int_1, $param_arrayOf_Object_2);
	    try {
		java.io.ObjectOutput out = call.getResultStream(true);
		out.writeObject($result);
	    } catch (java.io.IOException e) {
		throw new java.rmi.MarshalException("error marshalling return", e);
	    }
	    break;
	}
	    
	case 16: // setAttribute(ObjectName, Attribute)
	{
	    javax.management.ObjectName $param_ObjectName_1;
	    javax.management.Attribute $param_Attribute_2;
	    try {
		java.io.ObjectInput in = call.getInputStream();
		$param_ObjectName_1 = (javax.management.ObjectName) in.readObject();
		$param_Attribute_2 = (javax.management.Attribute) in.readObject();
	    } catch (java.io.IOException e) {
		throw new java.rmi.UnmarshalException("error unmarshalling arguments", e);
	    } catch (java.lang.ClassNotFoundException e) {
		throw new java.rmi.UnmarshalException("error unmarshalling arguments", e);
	    } finally {
		call.releaseInputStream();
	    }
	    server.setAttribute($param_ObjectName_1, $param_Attribute_2);
	    try {
		call.getResultStream(true);
	    } catch (java.io.IOException e) {
		throw new java.rmi.MarshalException("error marshalling return", e);
	    }
	    break;
	}
	    
	case 17: // setAttributes(ObjectName, AttributeList)
	{
	    javax.management.ObjectName $param_ObjectName_1;
	    javax.management.AttributeList $param_AttributeList_2;
	    try {
		java.io.ObjectInput in = call.getInputStream();
		$param_ObjectName_1 = (javax.management.ObjectName) in.readObject();
		$param_AttributeList_2 = (javax.management.AttributeList) in.readObject();
	    } catch (java.io.IOException e) {
		throw new java.rmi.UnmarshalException("error unmarshalling arguments", e);
	    } catch (java.lang.ClassNotFoundException e) {
		throw new java.rmi.UnmarshalException("error unmarshalling arguments", e);
	    } finally {
		call.releaseInputStream();
	    }
	    javax.management.AttributeList $result = server.setAttributes($param_ObjectName_1, $param_AttributeList_2);
	    try {
		java.io.ObjectOutput out = call.getResultStream(true);
		out.writeObject($result);
	    } catch (java.io.IOException e) {
		throw new java.rmi.MarshalException("error marshalling return", e);
	    }
	    break;
	}
	    
	case 18: // unregisterMBean(ObjectName)
	{
	    javax.management.ObjectName $param_ObjectName_1;
	    try {
		java.io.ObjectInput in = call.getInputStream();
		$param_ObjectName_1 = (javax.management.ObjectName) in.readObject();
	    } catch (java.io.IOException e) {
		throw new java.rmi.UnmarshalException("error unmarshalling arguments", e);
	    } catch (java.lang.ClassNotFoundException e) {
		throw new java.rmi.UnmarshalException("error unmarshalling arguments", e);
	    } finally {
		call.releaseInputStream();
	    }
	    server.unregisterMBean($param_ObjectName_1);
	    try {
		call.getResultStream(true);
	    } catch (java.io.IOException e) {
		throw new java.rmi.MarshalException("error marshalling return", e);
	    }
	    break;
	}
	    
	default:
	    throw new java.rmi.UnmarshalException("invalid method number");
	}
    }
}