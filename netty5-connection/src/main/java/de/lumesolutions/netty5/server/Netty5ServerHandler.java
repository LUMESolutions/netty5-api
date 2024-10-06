package de.lumesolutions.netty5.server;

/*
 * Copyright 2023-2024 netty5-api contributors
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

import de.lumesolutions.netty5.common.packet.Packet;
import io.netty5.channel.ChannelHandlerContext;
import io.netty5.channel.SimpleChannelInboundHandler;
import lombok.AllArgsConstructor;

import java.io.IOException;

@AllArgsConstructor
public final class Netty5ServerHandler extends SimpleChannelInboundHandler<Packet> {

    private final Netty5Server server;

    @Override
    protected void messageReceived(ChannelHandlerContext channelHandlerContext, Packet packet) throws Exception {

    }

    @Override
    public void channelActive(ChannelHandlerContext ctx) throws Exception {

    }

    @Override
    public void channelInactive(ChannelHandlerContext ctx) throws Exception {

    }

    @Override
    public void channelExceptionCaught(ChannelHandlerContext ctx, Throwable cause) throws Exception {
        if (!(cause instanceof IOException)) {
            System.err.println(cause.getMessage());
        }
    }
}
