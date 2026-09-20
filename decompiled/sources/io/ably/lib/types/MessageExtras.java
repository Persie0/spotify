package io.ably.lib.types;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.Objects;
import org.msgpack.core.MessagePacker;
import org.msgpack.core.MessageUnpacker;
import org.msgpack.value.ImmutableMapValue;
import org.msgpack.value.ImmutableValue;
import org.msgpack.value.Value;
import org.msgpack.value.ValueFactory;
import p204p.qtz0;

/* JADX INFO: loaded from: classes16.dex */
public final class MessageExtras {
    private static final String DELTA = "delta";
    private static final String TAG = "io.ably.lib.types.MessageExtras";
    private final DeltaExtras delta;
    private final JsonObject jsonObject;

    public static class Serializer implements JsonSerializer<MessageExtras> {
        @Override // com.google.gson.JsonSerializer
        public JsonElement serialize(MessageExtras messageExtras, Type type, JsonSerializationContext jsonSerializationContext) {
            return messageExtras.jsonObject;
        }
    }

    public MessageExtras(JsonObject jsonObject) {
        this(jsonObject, null);
    }

    public static MessageExtras read(MessageUnpacker messageUnpacker) throws IOException {
        DeltaExtras deltaExtras;
        Value value;
        ImmutableValue immutableValueUnpackValue = messageUnpacker.unpackValue();
        if (!(immutableValueUnpackValue instanceof ImmutableMapValue) || (value = ((ImmutableMapValue) immutableValueUnpackValue).map().get(ValueFactory.newString(DELTA))) == null) {
            deltaExtras = null;
        } else {
            if (!(value instanceof ImmutableMapValue)) {
                throw new IOException("The delta extras unpacked to the wrong type \"" + value.getClass() + "\" when expected a map.");
            }
            deltaExtras = DeltaExtras.read(((ImmutableMapValue) value).map());
        }
        JsonElement jsonElementM73856b = qtz0.m73856b(immutableValueUnpackValue);
        if (jsonElementM73856b instanceof JsonObject) {
            return new MessageExtras((JsonObject) jsonElementM73856b, deltaExtras);
        }
        throw new IOException("The extras unpacked to the wrong type \"" + jsonElementM73856b.getClass() + "\" when expected a JsonObject.");
    }

    public JsonObject asJsonObject() {
        return this.jsonObject;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || MessageExtras.class != obj.getClass()) {
            return false;
        }
        return Objects.equals(this.jsonObject, ((MessageExtras) obj).jsonObject);
    }

    public DeltaExtras getDelta() {
        return this.delta;
    }

    public int hashCode() {
        return Objects.hashCode(this.jsonObject);
    }

    public String toString() {
        return "MessageExtras{delta=" + this.delta + ", raw=" + this.jsonObject + '}';
    }

    public void write(MessagePacker messagePacker) {
        qtz0.m73855a(this.jsonObject, messagePacker);
    }

    private MessageExtras(JsonObject jsonObject, DeltaExtras deltaExtras) {
        if (jsonObject == null) {
            throw new NullPointerException("jsonObject cannot be null.");
        }
        this.jsonObject = jsonObject;
        this.delta = deltaExtras;
    }

    public static MessageExtras read(JsonObject jsonObject) throws MessageDecodeException {
        DeltaExtras deltaExtras;
        JsonElement jsonElement = jsonObject.get(DELTA);
        if (jsonElement instanceof JsonObject) {
            deltaExtras = DeltaExtras.read((JsonObject) jsonElement);
        } else {
            if (jsonElement != null) {
                throw MessageDecodeException.fromDescription("The value under the delta key is of the wrong type \"" + jsonElement.getClass() + "\" when expected a map.");
            }
            deltaExtras = null;
        }
        return new MessageExtras(jsonObject, deltaExtras);
    }
}
