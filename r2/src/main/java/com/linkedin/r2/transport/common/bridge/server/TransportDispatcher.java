/*
   Copyright (c) 2012 LinkedIn Corp.

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

/* $Id$ */
package com.linkedin.r2.transport.common.bridge.server;

import com.linkedin.r2.message.rest.RestRequest;
import com.linkedin.r2.message.rest.RestResponse;
import com.linkedin.r2.message.rpc.RpcRequest;
import com.linkedin.r2.message.rpc.RpcResponse;
import com.linkedin.r2.transport.common.bridge.common.TransportCallback;

import java.util.Map;

/**
 * Interface for dispatching inbound requests to handlers.
 *
 * @author Chris Pettitt
 * @version $Revision$
 */
public interface TransportDispatcher
{
  /**
   * Dispatch an {@link RpcRequest}.
   *
   * @param req the {@link RpcRequest} to be dispatched.
   * @param wireAttrs the wire attributes of the request.
   * @param callback a {@link TransportCallback} to be called with the {@link RpcResponse}.
   */
  void handleRpcRequest(RpcRequest req, Map<String, String> wireAttrs,
                        TransportCallback<RpcResponse> callback);

  /**
   * Dispatch a {@link RestRequest}.
   *
   * @param req the {@link RestRequest} to be dispatched.
   * @param wireAttrs the wire attributes of the request.
   * @param callback a {@link TransportCallback} to be called with the {@link RestResponse}.
   */
  void handleRestRequest(RestRequest req, Map<String, String> wireAttrs,
                         TransportCallback<RestResponse> callback);
}