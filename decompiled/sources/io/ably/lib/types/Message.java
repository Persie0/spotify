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
import java.util.Collection;
import org.msgpack.core.MessageFormat;
import org.msgpack.core.MessagePacker;
import org.msgpack.core.MessageUnpacker;
import p204p.qtz0;
import p204p.tx8;

/* JADX INFO: loaded from: classes16.dex */
public class Message extends BaseMessage {
    private static final String CONNECTION_KEY = "connectionKey";
    private static final String EXTRAS = "extras";
    private static final String NAME = "name";
    private static final String TAG = "io.ably.lib.types.Message";
    public String connectionKey;
    public MessageExtras extras;
    public String name;

    public static class Serializer implements JsonSerializer<Message>, JsonDeserializer<Message> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.google.gson.JsonDeserializer
        public Message deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) {
            if (!(jsonElement instanceof JsonObject)) {
                throw new JsonParseException("Expected an object but got \"" + jsonElement.getClass() + "\".");
            }
            Message message = new Message();
            try {
                message.read((JsonObject) jsonElement);
                return message;
            } catch (MessageDecodeException e) {
                tx8.m81890e(Message.class.getName(), e.getMessage(), e);
                throw new JsonParseException("Failed to deserialize Message from JSON.", e);
            }
        }

        @Override // com.google.gson.JsonSerializer
        public JsonElement serialize(Message message, Type type, JsonSerializationContext jsonSerializationContext) {
            JsonObject jsonObject = BaseMessage.toJsonObject(message);
            String str = message.name;
            if (str != null) {
                jsonObject.addProperty(Message.NAME, str);
            }
            MessageExtras messageExtras = message.extras;
            if (messageExtras != null) {
                jsonObject.add(Message.EXTRAS, qtz0.f192515b.toJsonTree(messageExtras));
            }
            String str2 = message.connectionKey;
            if (str2 != null) {
                jsonObject.addProperty(Message.CONNECTION_KEY, str2);
            }
            return jsonObject;
        }
    }

    public Message() {
    }

    public static Message fromEncoded(JsonObject jsonObject, ChannelOptions channelOptions) throws MessageDecodeException {
        try {
            Message message = (Message) qtz0.f192515b.fromJson((JsonElement) jsonObject, Message.class);
            message.decode(channelOptions);
            return message;
        } catch (Exception e) {
            tx8.m81890e(Message.class.getName(), e.getMessage(), e);
            throw MessageDecodeException.fromDescription(e.getMessage());
        }
    }

    public static Message[] fromEncodedArray(JsonArray jsonArray, ChannelOptions channelOptions) throws MessageDecodeException {
        try {
            Message[] messageArr = new Message[jsonArray.size()];
            for (int i = 0; i < jsonArray.size(); i++) {
                JsonElement jsonElement = jsonArray.get(i);
                if (!jsonElement.isJsonObject()) {
                    throw new JsonParseException("Not all JSON elements are of type JSON Object.");
                }
                messageArr[i] = fromEncoded(jsonElement.getAsJsonObject(), channelOptions);
            }
            return messageArr;
        } catch (Exception e) {
            tx8.m81890e(Message.class.getName(), e.getMessage(), e);
            throw MessageDecodeException.fromDescription(e.getMessage());
        }
    }

    public static Message fromMsgpack(MessageUnpacker messageUnpacker) {
        return new Message().readMsgpack(messageUnpacker);
    }

    @Override // io.ably.lib.types.BaseMessage
    public void read(JsonObject jsonObject) throws MessageDecodeException {
        super.read(jsonObject);
        this.name = readString(jsonObject, NAME);
        JsonElement jsonElement = jsonObject.get(EXTRAS);
        if (jsonElement != null) {
            if (jsonElement instanceof JsonObject) {
                this.extras = MessageExtras.read((JsonObject) jsonElement);
                return;
            }
            throw MessageDecodeException.fromDescription("Message extras is of type \"" + jsonElement.getClass() + "\" when expected a JSON object.");
        }
    }

    public Message readMsgpack(MessageUnpacker messageUnpacker) {
        int iUnpackMapHeader = messageUnpacker.unpackMapHeader();
        for (int i = 0; i < iUnpackMapHeader; i++) {
            String strIntern = messageUnpacker.unpackString().intern();
            MessageFormat nextFormat = messageUnpacker.getNextFormat();
            if (nextFormat.equals(MessageFormat.NIL)) {
                messageUnpacker.unpackNil();
            } else if (!super.readField(messageUnpacker, strIntern, nextFormat)) {
                if (strIntern.equals(NAME)) {
                    this.name = messageUnpacker.unpackString();
                } else if (strIntern.equals(EXTRAS)) {
                    this.extras = MessageExtras.read(messageUnpacker);
                } else {
                    tx8.m81897l(TAG, "Unexpected field: ".concat(strIntern));
                    messageUnpacker.skipValue();
                }
            }
        }
        return this;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{Message");
        super.getDetails(sb);
        if (this.name != null) {
            sb.append(" name=");
            sb.append(this.name);
        }
        sb.append('}');
        return sb.toString();
    }

    public void writeMsgpack(MessagePacker messagePacker) {
        int iCountFields = super.countFields();
        if (this.name != null) {
            iCountFields++;
        }
        if (this.extras != null) {
            iCountFields++;
        }
        messagePacker.packMapHeader(iCountFields);
        super.writeFields(messagePacker);
        if (this.name != null) {
            messagePacker.packString(NAME);
            messagePacker.packString(this.name);
        }
        if (this.extras != null) {
            messagePacker.packString(EXTRAS);
            this.extras.write(messagePacker);
        }
    }

    public Message(String str, Object obj) {
        this(str, obj, null, null);
    }

    public Message(String str, Object obj, String str2) {
        this(str, obj, str2, null);
    }

    public Message(String str, Object obj, MessageExtras messageExtras) {
        this(str, obj, null, messageExtras);
    }

    public Message(String str, Object obj, String str2, MessageExtras messageExtras) {
        this.name = str;
        this.clientId = str2;
        this.data = obj;
        this.extras = messageExtras;
    }

    public static Message fromEncoded(String str, ChannelOptions channelOptions) throws MessageDecodeException {
        try {
            return fromEncoded(((JsonObject) qtz0.f192515b.fromJson(str, JsonObject.class)).getAsJsonObject(), channelOptions);
        } catch (Exception e) {
            tx8.m81890e(Message.class.getName(), e.getMessage(), e);
            throw MessageDecodeException.fromDescription(e.getMessage());
        }
    }

    public static class Batch {
        public String[] channels;
        public Message[] messages;

        public Batch(String str, Message[] messageArr) {
            if (str == null || str.isEmpty()) {
                throw new IllegalArgumentException("A Batch spec cannot have an empty set of channels");
            }
            if (messageArr == null || messageArr.length == 0) {
                throw new IllegalArgumentException("A Batch spec cannot have an empty set of messages");
            }
            this.channels = new String[]{str};
            this.messages = messageArr;
        }

        public void writeMsgpack(MessagePacker messagePacker) {
            messagePacker.packMapHeader(2);
            messagePacker.packString("channels");
            messagePacker.packArrayHeader(this.channels.length);
            for (String str : this.channels) {
                messagePacker.packString(str);
            }
            messagePacker.packString("messages");
            MessageSerializer.writeMsgpackArray(this.messages, messagePacker);
        }

        public Batch(String[] strArr, Message[] messageArr) {
            if (strArr != null && strArr.length != 0) {
                if (messageArr != null && messageArr.length != 0) {
                    this.channels = strArr;
                    this.messages = messageArr;
                    return;
                }
                throw new IllegalArgumentException("A Batch spec cannot have an empty set of messages");
            }
            throw new IllegalArgumentException("A Batch spec cannot have an empty set of channels");
        }

        public Batch(Collection<String> collection, Collection<Message> collection2) {
            this((String[]) collection.toArray(new String[0]), (Message[]) collection2.toArray(new Message[0]));
        }
    }

    public static Message[] fromEncodedArray(String str, ChannelOptions channelOptions) throws MessageDecodeException {
        try {
            return fromEncodedArray((JsonArray) qtz0.f192515b.fromJson(str, JsonArray.class), channelOptions);
        } catch (Exception e) {
            tx8.m81890e(Message.class.getName(), e.getMessage(), e);
            throw MessageDecodeException.fromDescription(e.getMessage());
        }
    }
}
