package io.ably.lib.types;

import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import java.lang.reflect.Type;
import org.msgpack.core.MessageFormat;
import org.msgpack.core.MessagePacker;
import org.msgpack.core.MessageUnpacker;
import p204p.qtz0;
import p204p.tx8;

/* JADX INFO: loaded from: classes16.dex */
public class PresenceMessage extends BaseMessage implements Cloneable {
    private static final String TAG = "io.ably.lib.types.PresenceMessage";
    public Action action;

    public enum Action {
        absent,
        present,
        enter,
        leave,
        update;

        public static Action findByValue(int i) {
            return values()[i];
        }

        public int getValue() {
            return ordinal();
        }
    }

    public static class ActionSerializer implements JsonDeserializer<Action> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.google.gson.JsonDeserializer
        public Action deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) {
            return Action.findByValue(jsonElement.getAsInt());
        }
    }

    public static class Serializer implements JsonSerializer<PresenceMessage> {
        @Override // com.google.gson.JsonSerializer
        public JsonElement serialize(PresenceMessage presenceMessage, Type type, JsonSerializationContext jsonSerializationContext) {
            JsonObject jsonObject = BaseMessage.toJsonObject(presenceMessage);
            Action action = presenceMessage.action;
            if (action != null) {
                jsonObject.addProperty("action", Integer.valueOf(action.getValue()));
            }
            return jsonObject;
        }
    }

    public PresenceMessage() {
    }

    public static PresenceMessage fromEncoded(JsonObject jsonObject, ChannelOptions channelOptions) throws MessageDecodeException {
        try {
            PresenceMessage presenceMessage = (PresenceMessage) qtz0.f192515b.fromJson((JsonElement) jsonObject, PresenceMessage.class);
            presenceMessage.decode(channelOptions);
            if (presenceMessage.action != null) {
                return presenceMessage;
            }
            throw MessageDecodeException.fromDescription("Action cannot be null/empty");
        } catch (Exception e) {
            tx8.m81890e(PresenceMessage.class.getName(), e.getMessage(), e);
            throw MessageDecodeException.fromDescription(e.getMessage());
        }
    }

    public static PresenceMessage[] fromEncodedArray(JsonArray jsonArray, ChannelOptions channelOptions) throws MessageDecodeException {
        try {
            PresenceMessage[] presenceMessageArr = new PresenceMessage[jsonArray.size()];
            for (int i = 0; i < jsonArray.size(); i++) {
                JsonElement jsonElement = jsonArray.get(i);
                if (!jsonElement.isJsonObject()) {
                    throw new JsonParseException("Not all JSON elements are of type JSON Object.");
                }
                presenceMessageArr[i] = fromEncoded(jsonElement.getAsJsonObject(), channelOptions);
            }
            return presenceMessageArr;
        } catch (Exception e) {
            tx8.m81890e(PresenceMessage.class.getName(), e.getMessage(), e);
            throw MessageDecodeException.fromDescription(e.getMessage());
        }
    }

    public static PresenceMessage fromMsgpack(MessageUnpacker messageUnpacker) {
        return new PresenceMessage().readMsgpack(messageUnpacker);
    }

    public Object clone() {
        PresenceMessage presenceMessage = new PresenceMessage();
        presenceMessage.f7166id = this.f7166id;
        presenceMessage.timestamp = this.timestamp;
        presenceMessage.clientId = this.clientId;
        presenceMessage.connectionId = this.connectionId;
        presenceMessage.encoding = this.encoding;
        presenceMessage.data = this.data;
        presenceMessage.action = this.action;
        return presenceMessage;
    }

    public String memberKey() {
        return this.connectionId + ':' + this.clientId;
    }

    public PresenceMessage readMsgpack(MessageUnpacker messageUnpacker) {
        int iUnpackMapHeader = messageUnpacker.unpackMapHeader();
        for (int i = 0; i < iUnpackMapHeader; i++) {
            String strIntern = messageUnpacker.unpackString().intern();
            MessageFormat nextFormat = messageUnpacker.getNextFormat();
            if (nextFormat.equals(MessageFormat.NIL)) {
                messageUnpacker.unpackNil();
            } else if (!super.readField(messageUnpacker, strIntern, nextFormat)) {
                if (strIntern.equals("action")) {
                    this.action = Action.findByValue(messageUnpacker.unpackInt());
                } else {
                    tx8.m81897l(TAG, "Unexpected field: ".concat(strIntern));
                    messageUnpacker.skipValue();
                }
            }
        }
        return this;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{PresenceMessage");
        super.getDetails(sb);
        sb.append(" action=");
        sb.append(this.action.name());
        sb.append('}');
        return sb.toString();
    }

    public void writeMsgpack(MessagePacker messagePacker) {
        messagePacker.packMapHeader(super.countFields() + 1);
        super.writeFields(messagePacker);
        messagePacker.packString("action");
        messagePacker.packInt(this.action.getValue());
    }

    public PresenceMessage(Action action, String str) {
        this(action, str, null);
    }

    public PresenceMessage(Action action, String str, Object obj) {
        this.action = action;
        this.clientId = str;
        this.data = obj;
    }

    public static PresenceMessage fromEncoded(String str, ChannelOptions channelOptions) throws MessageDecodeException {
        try {
            return fromEncoded((JsonObject) qtz0.f192515b.fromJson(str, JsonObject.class), channelOptions);
        } catch (Exception e) {
            tx8.m81890e(PresenceMessage.class.getName(), e.getMessage(), e);
            throw MessageDecodeException.fromDescription(e.getMessage());
        }
    }

    public static PresenceMessage[] fromEncodedArray(String str, ChannelOptions channelOptions) throws MessageDecodeException {
        try {
            return fromEncodedArray((JsonArray) qtz0.f192515b.fromJson(str, JsonArray.class), channelOptions);
        } catch (Exception e) {
            tx8.m81890e(PresenceMessage.class.getName(), e.getMessage(), e);
            throw MessageDecodeException.fromDescription(e.getMessage());
        }
    }
}
