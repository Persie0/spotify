package io.ably.lib.types;

import org.msgpack.core.MessageFormat;
import org.msgpack.core.MessageUnpacker;
import p204p.ejq;
import p204p.tx8;

/* JADX INFO: loaded from: classes16.dex */
public class ConnectionDetails {
    private static final String TAG = "io.ably.lib.types.ConnectionDetails";
    public String clientId;
    public String connectionKey;
    public Long connectionStateTtl;
    public Long maxFrameSize;
    public Long maxIdleInterval;
    public Long maxInboundRate;
    public Long maxMessageSize;
    public Long maxOutboundRate;
    public String serverId;

    public ConnectionDetails() {
        String[] strArr = ejq.f60272a;
        this.maxIdleInterval = 20000L;
        this.connectionStateTtl = 120000L;
    }

    public static ConnectionDetails fromMsgpack(MessageUnpacker messageUnpacker) {
        return new ConnectionDetails().readMsgpack(messageUnpacker);
    }

    public ConnectionDetails readMsgpack(MessageUnpacker messageUnpacker) {
        int iUnpackMapHeader = messageUnpacker.unpackMapHeader();
        for (int i = 0; i < iUnpackMapHeader; i++) {
            String strIntern = messageUnpacker.unpackString().intern();
            if (!messageUnpacker.getNextFormat().equals(MessageFormat.NIL)) {
                strIntern.getClass();
                switch (strIntern) {
                    case "maxIdleInterval":
                        this.maxIdleInterval = Long.valueOf(messageUnpacker.unpackLong());
                        break;
                    case "maxFrameSize":
                        this.maxFrameSize = Long.valueOf(messageUnpacker.unpackLong());
                        break;
                    case "connectionKey":
                        this.connectionKey = messageUnpacker.unpackString();
                        break;
                    case "clientId":
                        this.clientId = messageUnpacker.unpackString();
                        break;
                    case "maxInboundRate":
                        this.maxInboundRate = Long.valueOf(messageUnpacker.unpackLong());
                        break;
                    case "serverId":
                        this.serverId = messageUnpacker.unpackString();
                        break;
                    case "maxMessageSize":
                        this.maxMessageSize = Long.valueOf(messageUnpacker.unpackLong());
                        break;
                    case "connectionStateTtl":
                        this.connectionStateTtl = Long.valueOf(messageUnpacker.unpackLong());
                        break;
                    case "maxOutboundRate":
                        this.maxOutboundRate = Long.valueOf(messageUnpacker.unpackLong());
                        break;
                    default:
                        tx8.m81897l(TAG, "Unexpected field: ".concat(strIntern));
                        messageUnpacker.skipValue();
                        break;
                }
            } else {
                messageUnpacker.unpackNil();
            }
        }
        return this;
    }
}
