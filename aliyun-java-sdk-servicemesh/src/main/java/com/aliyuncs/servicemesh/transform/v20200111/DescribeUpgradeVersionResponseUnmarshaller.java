/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.aliyuncs.servicemesh.transform.v20200111;

import com.aliyuncs.servicemesh.model.v20200111.DescribeUpgradeVersionResponse;
import com.aliyuncs.servicemesh.model.v20200111.DescribeUpgradeVersionResponse.Version;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeUpgradeVersionResponseUnmarshaller {

	public static DescribeUpgradeVersionResponse unmarshall(DescribeUpgradeVersionResponse describeUpgradeVersionResponse, UnmarshallerContext _ctx) {
		
		describeUpgradeVersionResponse.setRequestId(_ctx.stringValue("DescribeUpgradeVersionResponse.RequestId"));

		Version version = new Version();
		version.setIstioVersion(_ctx.stringValue("DescribeUpgradeVersionResponse.Version.IstioVersion"));
		version.setIstioOperatorVersion(_ctx.stringValue("DescribeUpgradeVersionResponse.Version.IstioOperatorVersion"));
		version.setKubernetesVersion(_ctx.stringValue("DescribeUpgradeVersionResponse.Version.KubernetesVersion"));
		describeUpgradeVersionResponse.setVersion(version);
	 
	 	return describeUpgradeVersionResponse;
	}
}