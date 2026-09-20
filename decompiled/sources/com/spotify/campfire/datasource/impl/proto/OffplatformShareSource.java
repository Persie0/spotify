package com.spotify.campfire.datasource.impl.proto;

import p204p.od50;
import p204p.rd50;
import p204p.sd50;

/* JADX INFO: loaded from: classes5.dex */
public enum OffplatformShareSource implements od50 {
    OFFPLATFORM_SHARE_SOURCE_UNSPECIFIED(0),
    OFFPLATFORM_SHARE_SOURCE_PUBSUB(1),
    OFFPLATFORM_SHARE_SOURCE_BACKFILL(2),
    OFFPLATFORM_SHARE_SOURCE_OPEN(3),
    UNRECOGNIZED(-1);

    public static final int OFFPLATFORM_SHARE_SOURCE_BACKFILL_VALUE = 2;
    public static final int OFFPLATFORM_SHARE_SOURCE_OPEN_VALUE = 3;
    public static final int OFFPLATFORM_SHARE_SOURCE_PUBSUB_VALUE = 1;
    public static final int OFFPLATFORM_SHARE_SOURCE_UNSPECIFIED_VALUE = 0;
    private static final rd50 internalValueMap = new rd50() { // from class: com.spotify.campfire.datasource.impl.proto.OffplatformShareSource.1
        @Override // p204p.rd50
        public OffplatformShareSource findValueByNumber(int i) {
            return OffplatformShareSource.forNumber(i);
        }
    };
    private final int value;

    public static final class OffplatformShareSourceVerifier implements sd50 {
        static final sd50 INSTANCE = new OffplatformShareSourceVerifier();

        private OffplatformShareSourceVerifier() {
        }

        @Override // p204p.sd50
        public boolean isInRange(int i) {
            return OffplatformShareSource.forNumber(i) != null;
        }
    }

    OffplatformShareSource(int i) {
        this.value = i;
    }

    public static OffplatformShareSource forNumber(int i) {
        if (i == 0) {
            return OFFPLATFORM_SHARE_SOURCE_UNSPECIFIED;
        }
        if (i == 1) {
            return OFFPLATFORM_SHARE_SOURCE_PUBSUB;
        }
        if (i == 2) {
            return OFFPLATFORM_SHARE_SOURCE_BACKFILL;
        }
        if (i != 3) {
            return null;
        }
        return OFFPLATFORM_SHARE_SOURCE_OPEN;
    }

    public static rd50 internalGetValueMap() {
        return internalValueMap;
    }

    public static sd50 internalGetVerifier() {
        return OffplatformShareSourceVerifier.INSTANCE;
    }

    @Override // p204p.od50
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Deprecated
    public static OffplatformShareSource valueOf(int i) {
        return forNumber(i);
    }
}
