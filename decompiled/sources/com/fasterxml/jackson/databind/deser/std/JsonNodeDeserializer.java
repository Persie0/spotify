package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;

/* JADX INFO: loaded from: classes3.dex */
public class JsonNodeDeserializer extends BaseNodeDeserializer<JsonNode> {
    private static final JsonNodeDeserializer instance = new JsonNodeDeserializer();

    public static final class ArrayDeserializer extends BaseNodeDeserializer<ArrayNode> {
        protected static final ArrayDeserializer _instance = new ArrayDeserializer();

        public ArrayDeserializer() {
            super(ArrayNode.class, Boolean.TRUE);
        }
    }

    public static final class ObjectDeserializer extends BaseNodeDeserializer<ObjectNode> {
        protected static final ObjectDeserializer _instance = new ObjectDeserializer();

        public ObjectDeserializer() {
            super(ObjectNode.class, Boolean.TRUE);
        }
    }

    public JsonNodeDeserializer() {
        super(JsonNode.class, null);
    }
}
