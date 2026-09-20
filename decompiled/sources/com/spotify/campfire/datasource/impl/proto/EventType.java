package com.spotify.campfire.datasource.impl.proto;

import p204p.od50;
import p204p.rd50;
import p204p.sd50;

/* JADX INFO: loaded from: classes5.dex */
public enum EventType implements od50 {
    EVENT_TYPE_UNSPECIFIED(0),
    EVENT_TYPE_ADD(1),
    EVENT_TYPE_BULK_ADD(2),
    EVENT_TYPE_DELETE(3),
    EVENT_TYPE_MODIFY(4),
    UNRECOGNIZED(-1);

    public static final int EVENT_TYPE_ADD_VALUE = 1;
    public static final int EVENT_TYPE_BULK_ADD_VALUE = 2;
    public static final int EVENT_TYPE_DELETE_VALUE = 3;
    public static final int EVENT_TYPE_MODIFY_VALUE = 4;
    public static final int EVENT_TYPE_UNSPECIFIED_VALUE = 0;
    private static final rd50 internalValueMap = new rd50() { // from class: com.spotify.campfire.datasource.impl.proto.EventType.1
        @Override // p204p.rd50
        public EventType findValueByNumber(int i) {
            return EventType.forNumber(i);
        }
    };
    private final int value;

    public static final class EventTypeVerifier implements sd50 {
        static final sd50 INSTANCE = new EventTypeVerifier();

        private EventTypeVerifier() {
        }

        @Override // p204p.sd50
        public boolean isInRange(int i) {
            return EventType.forNumber(i) != null;
        }
    }

    EventType(int i) {
        this.value = i;
    }

    public static EventType forNumber(int i) {
        if (i == 0) {
            return EVENT_TYPE_UNSPECIFIED;
        }
        if (i == 1) {
            return EVENT_TYPE_ADD;
        }
        if (i == 2) {
            return EVENT_TYPE_BULK_ADD;
        }
        if (i == 3) {
            return EVENT_TYPE_DELETE;
        }
        if (i != 4) {
            return null;
        }
        return EVENT_TYPE_MODIFY;
    }

    public static rd50 internalGetValueMap() {
        return internalValueMap;
    }

    public static sd50 internalGetVerifier() {
        return EventTypeVerifier.INSTANCE;
    }

    @Override // p204p.od50
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Deprecated
    public static EventType valueOf(int i) {
        return forNumber(i);
    }
}
