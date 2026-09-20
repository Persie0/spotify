package p204p;

import androidx.car.app.model.Alert;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonNull;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.JsonPrimitive;
import io.ably.lib.types.Message;
import io.ably.lib.types.MessageExtras;
import io.ably.lib.types.PresenceMessage;
import io.ably.lib.types.ProtocolMessage;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.msgpack.core.MessagePack;
import org.msgpack.core.MessagePacker;
import org.msgpack.value.Value;

/* JADX INFO: loaded from: classes16.dex */
public abstract class qtz0 {

    /* JADX INFO: renamed from: a */
    public static final JsonParser f192514a = new JsonParser();

    /* JADX INFO: renamed from: b */
    public static final Gson f192515b;

    /* JADX INFO: renamed from: c */
    public static final MessagePack.PackerConfig f192516c;

    /* JADX INFO: renamed from: d */
    public static final MessagePack.UnpackerConfig f192517d;

    static {
        GsonBuilder gsonBuilder = new GsonBuilder();
        gsonBuilder.registerTypeAdapter(Message.class, new Message.Serializer());
        gsonBuilder.registerTypeAdapter(MessageExtras.class, new MessageExtras.Serializer());
        gsonBuilder.registerTypeAdapter(PresenceMessage.class, new PresenceMessage.Serializer());
        gsonBuilder.registerTypeAdapter(PresenceMessage.Action.class, new PresenceMessage.ActionSerializer());
        gsonBuilder.registerTypeAdapter(ProtocolMessage.Action.class, new ProtocolMessage.ActionSerializer());
        f192515b = gsonBuilder.create();
        f192516c = new MessagePack.PackerConfig().withSmallStringOptimizationThreshold(Alert.DURATION_SHOW_INDEFINITELY);
        f192517d = MessagePack.DEFAULT_UNPACKER_CONFIG;
    }

    /* JADX INFO: renamed from: a */
    public static void m73855a(JsonElement jsonElement, MessagePacker messagePacker) {
        try {
            if (jsonElement.isJsonArray()) {
                JsonArray jsonArray = (JsonArray) jsonElement;
                messagePacker.packArrayHeader(jsonArray.size());
                Iterator<JsonElement> it = jsonArray.iterator();
                while (it.hasNext()) {
                    m73855a(it.next(), messagePacker);
                }
                return;
            }
            if (jsonElement.isJsonObject()) {
                Set<Map.Entry<String, JsonElement>> setEntrySet = ((JsonObject) jsonElement).entrySet();
                messagePacker.packMapHeader(setEntrySet.size());
                for (Map.Entry<String, JsonElement> entry : setEntrySet) {
                    messagePacker.packString(entry.getKey());
                    m73855a(entry.getValue(), messagePacker);
                }
                return;
            }
            if (jsonElement.isJsonNull()) {
                messagePacker.packNil();
                return;
            }
            if (!jsonElement.isJsonPrimitive()) {
                throw new RuntimeException("unreachable");
            }
            JsonPrimitive jsonPrimitive = (JsonPrimitive) jsonElement;
            if (jsonPrimitive.isBoolean()) {
                messagePacker.packBoolean(jsonPrimitive.getAsBoolean());
                return;
            }
            if (!jsonPrimitive.isNumber()) {
                messagePacker.packString(jsonPrimitive.getAsString());
                return;
            }
            Number asNumber = jsonPrimitive.getAsNumber();
            if (!(asNumber instanceof BigDecimal) && !(asNumber instanceof Double)) {
                if (asNumber instanceof Float) {
                    messagePacker.packFloat(asNumber.floatValue());
                    return;
                }
                if (!(asNumber instanceof BigInteger) && !(asNumber instanceof Long)) {
                    if (asNumber instanceof Integer) {
                        messagePacker.packInt(asNumber.intValue());
                        return;
                    }
                    if (asNumber instanceof Short) {
                        messagePacker.packShort(asNumber.shortValue());
                        return;
                    } else if (asNumber instanceof Byte) {
                        messagePacker.packByte(asNumber.byteValue());
                        return;
                    } else {
                        messagePacker.packString(jsonPrimitive.getAsString());
                        return;
                    }
                }
                messagePacker.packLong(asNumber.longValue());
                return;
            }
            messagePacker.packDouble(asNumber.doubleValue());
        } catch (IOException unused) {
        }
    }

    /* JADX INFO: renamed from: b */
    public static JsonElement m73856b(Value value) {
        switch (ptz0.f181278a[value.getValueType().ordinal()]) {
            case 1:
                return JsonNull.INSTANCE;
            case 2:
                return new JsonPrimitive(Boolean.valueOf(value.asBooleanValue().getBoolean()));
            case 3:
                return new JsonPrimitive(Long.valueOf(value.asIntegerValue().asLong()));
            case 4:
                return new JsonPrimitive(Double.valueOf(value.asFloatValue().toDouble()));
            case 5:
                return new JsonPrimitive(value.asStringValue().asString());
            case 6:
                byte[] bArrAsByteArray = value.asBinaryValue().asByteArray();
                char[] cArr = vx8.f245637a;
                return new JsonPrimitive(new String(vx8.m86643b(bArrAsByteArray, bArrAsByteArray.length)));
            case 7:
                JsonArray jsonArray = new JsonArray();
                Iterator<Value> it = value.asArrayValue().iterator();
                while (it.hasNext()) {
                    jsonArray.add(m73856b(it.next()));
                }
                return jsonArray;
            case 8:
                JsonObject jsonObject = new JsonObject();
                for (Map.Entry<Value, Value> entry : value.asMapValue().entrySet()) {
                    jsonObject.add(entry.getKey().asStringValue().asString(), m73856b(entry.getValue()));
                }
                return jsonObject;
            default:
                return null;
        }
    }
}
