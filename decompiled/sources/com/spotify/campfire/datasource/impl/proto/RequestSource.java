package com.spotify.campfire.datasource.impl.proto;

import p204p.od50;
import p204p.rd50;
import p204p.sd50;

/* JADX INFO: loaded from: classes5.dex */
public enum RequestSource implements od50 {
    REQUEST_SOURCE_UNSPECIFIED(0),
    REQUEST_SOURCE_CLIENT(1),
    REQUEST_SOURCE_BACKEND(2),
    REQUEST_SOURCE_EVOLUTION(3),
    REQUEST_SOURCE_BACKEND_SHARE_HISTORY(4),
    UNRECOGNIZED(-1);

    public static final int REQUEST_SOURCE_BACKEND_SHARE_HISTORY_VALUE = 4;
    public static final int REQUEST_SOURCE_BACKEND_VALUE = 2;
    public static final int REQUEST_SOURCE_CLIENT_VALUE = 1;
    public static final int REQUEST_SOURCE_EVOLUTION_VALUE = 3;
    public static final int REQUEST_SOURCE_UNSPECIFIED_VALUE = 0;
    private static final rd50 internalValueMap = new rd50() { // from class: com.spotify.campfire.datasource.impl.proto.RequestSource.1
        @Override // p204p.rd50
        public RequestSource findValueByNumber(int i) {
            return RequestSource.forNumber(i);
        }
    };
    private final int value;

    public static final class RequestSourceVerifier implements sd50 {
        static final sd50 INSTANCE = new RequestSourceVerifier();

        private RequestSourceVerifier() {
        }

        @Override // p204p.sd50
        public boolean isInRange(int i) {
            return RequestSource.forNumber(i) != null;
        }
    }

    RequestSource(int i) {
        this.value = i;
    }

    public static RequestSource forNumber(int i) {
        if (i == 0) {
            return REQUEST_SOURCE_UNSPECIFIED;
        }
        if (i == 1) {
            return REQUEST_SOURCE_CLIENT;
        }
        if (i == 2) {
            return REQUEST_SOURCE_BACKEND;
        }
        if (i == 3) {
            return REQUEST_SOURCE_EVOLUTION;
        }
        if (i != 4) {
            return null;
        }
        return REQUEST_SOURCE_BACKEND_SHARE_HISTORY;
    }

    public static rd50 internalGetValueMap() {
        return internalValueMap;
    }

    public static sd50 internalGetVerifier() {
        return RequestSourceVerifier.INSTANCE;
    }

    @Override // p204p.od50
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Deprecated
    public static RequestSource valueOf(int i) {
        return forNumber(i);
    }
}
