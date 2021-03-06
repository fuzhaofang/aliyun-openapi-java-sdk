/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package com.aliyuncs.iot.transform.v20170420;

import com.aliyuncs.iot.model.v20170420.RegistDeviceResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class RegistDeviceResponseUnmarshaller {

	public static RegistDeviceResponse unmarshall(RegistDeviceResponse registDeviceResponse, UnmarshallerContext context) {
		
		registDeviceResponse.setRequestId(context.stringValue("RegistDeviceResponse.RequestId"));
		registDeviceResponse.setSuccess(context.booleanValue("RegistDeviceResponse.Success"));
		registDeviceResponse.setErrorMessage(context.stringValue("RegistDeviceResponse.ErrorMessage"));
		registDeviceResponse.setDeviceId(context.stringValue("RegistDeviceResponse.DeviceId"));
		registDeviceResponse.setDeviceSecret(context.stringValue("RegistDeviceResponse.DeviceSecret"));
		registDeviceResponse.setDeviceStatus(context.stringValue("RegistDeviceResponse.DeviceStatus"));
		registDeviceResponse.setDeviceName(context.stringValue("RegistDeviceResponse.DeviceName"));
	 
	 	return registDeviceResponse;
	}
}