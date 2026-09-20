package io.ably.lib.types;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import java.lang.reflect.Type;
import java.util.Map;
import org.msgpack.core.MessageFormat;
import org.msgpack.core.MessagePacker;
import org.msgpack.core.MessageUnpacker;
import p204p.tx8;

/* JADX INFO: loaded from: classes16.dex */
public class ProtocolMessage {
    private static final String TAG = "io.ably.lib.types.ProtocolMessage";
    public Action action;
    public AuthDetails auth;
    public String channel;
    public String channelSerial;
    public ConnectionDetails connectionDetails;
    public String connectionId;
    public int count;
    public ErrorInfo error;
    public int flags;

    /* JADX INFO: renamed from: id */
    public String f7167id;
    public Message[] messages;
    public Long msgSerial;
    public Map<String, String> params;
    public PresenceMessage[] presence;
    public long timestamp;

    public enum Action {
        heartbeat,
        ack,
        nack,
        connect,
        connected,
        disconnect,
        disconnected,
        close,
        closed,
        error,
        attach,
        attached,
        detach,
        detached,
        presence,
        message,
        sync,
        auth;

        public static Action findByValue(int i) {
            return values()[i];
        }

        public int getValue() {
            return ordinal();
        }
    }

    public static class ActionSerializer implements JsonSerializer<Action>, JsonDeserializer<Action> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.google.gson.JsonDeserializer
        public Action deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) {
            return Action.findByValue(jsonElement.getAsInt());
        }

        @Override // com.google.gson.JsonSerializer
        public JsonElement serialize(Action action, Type type, JsonSerializationContext jsonSerializationContext) {
            return new JsonPrimitive(Integer.valueOf(action.getValue()));
        }
    }

    public static class AuthDetails {
        public String accessToken;

        private AuthDetails() {
        }

        public static AuthDetails fromMsgpack(MessageUnpacker messageUnpacker) {
            return new AuthDetails().readMsgpack(messageUnpacker);
        }

        public AuthDetails readMsgpack(MessageUnpacker messageUnpacker) {
            int iUnpackMapHeader = messageUnpacker.unpackMapHeader();
            for (int i = 0; i < iUnpackMapHeader; i++) {
                String strIntern = messageUnpacker.unpackString().intern();
                if (messageUnpacker.getNextFormat().equals(MessageFormat.NIL)) {
                    messageUnpacker.unpackNil();
                } else {
                    strIntern.getClass();
                    if (strIntern.equals("accessToken")) {
                        this.accessToken = messageUnpacker.unpackString();
                    } else {
                        tx8.m81897l(ProtocolMessage.TAG, "Unexpected field: ".concat(strIntern));
                        messageUnpacker.skipValue();
                    }
                }
            }
            return this;
        }

        public void writeMsgpack(MessagePacker messagePacker) {
            messagePacker.packMapHeader(this.accessToken != null ? 1 : 0);
            if (this.accessToken != null) {
                messagePacker.packString("accessToken");
                messagePacker.packString(this.accessToken);
            }
        }

        public AuthDetails(String str) {
            this.accessToken = str;
        }
    }

    public enum Flag {
        has_presence(0),
        has_backlog(1),
        resumed(2),
        attach_resume(5),
        presence(16),
        publish(17),
        subscribe(18),
        presence_subscribe(19);

        private final int mask;

        Flag(int i) {
            this.mask = 1 << i;
        }

        public int getMask() {
            return this.mask;
        }
    }

    public ProtocolMessage() {
    }

    public static boolean ackRequired(ProtocolMessage protocolMessage) {
        Action action = protocolMessage.action;
        return action == Action.message || action == Action.presence;
    }

    public static ProtocolMessage fromMsgpack(MessageUnpacker messageUnpacker) {
        return new ProtocolMessage().readMsgpack(messageUnpacker);
    }

    public boolean hasFlag(Flag flag) {
        return (this.flags & flag.getMask()) == flag.getMask();
    }

    public ProtocolMessage readMsgpack(MessageUnpacker messageUnpacker) {
        int iUnpackMapHeader = messageUnpacker.unpackMapHeader();
        for (int i = 0; i < iUnpackMapHeader; i++) {
            String strIntern = messageUnpacker.unpackString().intern();
            if (!messageUnpacker.getNextFormat().equals(MessageFormat.NIL)) {
                strIntern.getClass();
                switch (strIntern) {
                    case "msgSerial":
                        this.msgSerial = Long.valueOf(messageUnpacker.unpackLong());
                        break;
                    case "action":
                        this.action = Action.findByValue(messageUnpacker.unpackInt());
                        break;
                    case "presence":
                        this.presence = PresenceSerializer.readMsgpackArray(messageUnpacker);
                        break;
                    case "params":
                        this.params = MessageSerializer.readStringMap(messageUnpacker);
                        break;
                    case "connectionKey":
                        messageUnpacker.unpackString();
                        break;
                    case "messages":
                        this.messages = MessageSerializer.readMsgpackArray(messageUnpacker);
                        break;
                    case "id":
                        this.f7167id = messageUnpacker.unpackString();
                        break;
                    case "auth":
                        this.auth = AuthDetails.fromMsgpack(messageUnpacker);
                        break;
                    case "timestamp":
                        this.timestamp = messageUnpacker.unpackLong();
                        break;
                    case "count":
                        this.count = messageUnpacker.unpackInt();
                        break;
                    case "error":
                        this.error = ErrorInfo.fromMsgpack(messageUnpacker);
                        break;
                    case "flags":
                        this.flags = messageUnpacker.unpackInt();
                        break;
                    case "connectionDetails":
                        this.connectionDetails = ConnectionDetails.fromMsgpack(messageUnpacker);
                        break;
                    case "channel":
                        this.channel = messageUnpacker.unpackString();
                        break;
                    case "channelSerial":
                        this.channelSerial = messageUnpacker.unpackString();
                        break;
                    case "connectionId":
                        this.connectionId = messageUnpacker.unpackString();
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

    public void setFlag(Flag flag) {
        this.flags = flag.getMask() | this.flags;
    }

    public void setFlags(int i) {
        this.flags = i | this.flags;
    }

    public void writeMsgpack(MessagePacker messagePacker) {
        int i = this.channel != null ? 2 : 1;
        if (this.msgSerial != null) {
            i++;
        }
        if (this.messages != null) {
            i++;
        }
        if (this.presence != null) {
            i++;
        }
        if (this.auth != null) {
            i++;
        }
        if (this.flags != 0) {
            i++;
        }
        if (this.params != null) {
            i++;
        }
        if (this.channelSerial != null) {
            i++;
        }
        messagePacker.packMapHeader(i);
        messagePacker.packString("action");
        messagePacker.packInt(this.action.getValue());
        if (this.channel != null) {
            messagePacker.packString("channel");
            messagePacker.packString(this.channel);
        }
        if (this.msgSerial != null) {
            messagePacker.packString("msgSerial");
            messagePacker.packLong(this.msgSerial.longValue());
        }
        if (this.messages != null) {
            messagePacker.packString("messages");
            MessageSerializer.writeMsgpackArray(this.messages, messagePacker);
        }
        if (this.presence != null) {
            messagePacker.packString("presence");
            PresenceSerializer.writeMsgpackArray(this.presence, messagePacker);
        }
        if (this.auth != null) {
            messagePacker.packString("auth");
            this.auth.writeMsgpack(messagePacker);
        }
        if (this.flags != 0) {
            messagePacker.packString("flags");
            messagePacker.packInt(this.flags);
        }
        if (this.params != null) {
            messagePacker.packString("params");
            MessageSerializer.write(this.params, messagePacker);
        }
        if (this.channelSerial != null) {
            messagePacker.packString("channelSerial");
            messagePacker.packString(this.channelSerial);
        }
    }

    public ProtocolMessage(Action action) {
        this.action = action;
    }

    public ProtocolMessage(Action action, String str) {
        this.action = action;
        this.channel = str;
    }
}
