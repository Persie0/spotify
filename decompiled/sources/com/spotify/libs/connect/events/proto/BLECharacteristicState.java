package com.spotify.libs.connect.events.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.wc8;
import p204p.z110;

/* JADX INFO: loaded from: classes7.dex */
public final class BLECharacteristicState extends AbstractC0269h implements sre0 {
    public static final int ADVERTISING_READ_FAILURE_COUNT_FIELD_NUMBER = 6;
    public static final int ADVERTISING_READ_SUCCESS_COUNT_FIELD_NUMBER = 5;
    public static final int ADVERTISING_WRITE_FAILURE_COUNT_FIELD_NUMBER = 8;
    public static final int ADVERTISING_WRITE_SUCCESS_COUNT_FIELD_NUMBER = 7;
    private static final BLECharacteristicState DEFAULT_INSTANCE;
    public static final int END_DATE_FIELD_NUMBER = 10;
    private static volatile r2n0 PARSER = null;
    public static final int SCANNING_READ_FAILURE_COUNT_FIELD_NUMBER = 2;
    public static final int SCANNING_READ_SUCCESS_COUNT_FIELD_NUMBER = 1;
    public static final int SCANNING_WRITE_FAILURE_COUNT_FIELD_NUMBER = 4;
    public static final int SCANNING_WRITE_SUCCESS_COUNT_FIELD_NUMBER = 3;
    public static final int START_DATE_FIELD_NUMBER = 9;
    private int advertisingReadFailureCount_;
    private int advertisingReadSuccessCount_;
    private int advertisingWriteFailureCount_;
    private int advertisingWriteSuccessCount_;
    private int bitField0_;
    private int scanningReadFailureCount_;
    private int scanningReadSuccessCount_;
    private int scanningWriteFailureCount_;
    private int scanningWriteSuccessCount_;
    private String startDate_ = "";
    private String endDate_ = "";

    static {
        BLECharacteristicState bLECharacteristicState = new BLECharacteristicState();
        DEFAULT_INSTANCE = bLECharacteristicState;
        AbstractC0269h.registerDefaultInstance(BLECharacteristicState.class, bLECharacteristicState);
    }

    private BLECharacteristicState() {
    }

    /* JADX INFO: renamed from: n */
    public static void m12650n(BLECharacteristicState bLECharacteristicState) {
        bLECharacteristicState.bitField0_ |= 32;
        bLECharacteristicState.advertisingReadFailureCount_ = 0;
    }

    /* JADX INFO: renamed from: o */
    public static void m12651o(BLECharacteristicState bLECharacteristicState) {
        bLECharacteristicState.bitField0_ |= 16;
        bLECharacteristicState.advertisingReadSuccessCount_ = 0;
    }

    /* JADX INFO: renamed from: p */
    public static void m12652p(BLECharacteristicState bLECharacteristicState, int i) {
        bLECharacteristicState.bitField0_ |= 128;
        bLECharacteristicState.advertisingWriteFailureCount_ = i;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static void m12653q(BLECharacteristicState bLECharacteristicState, int i) {
        bLECharacteristicState.bitField0_ |= 64;
        bLECharacteristicState.advertisingWriteSuccessCount_ = i;
    }

    /* JADX INFO: renamed from: r */
    public static void m12654r(BLECharacteristicState bLECharacteristicState, String str) {
        bLECharacteristicState.getClass();
        str.getClass();
        bLECharacteristicState.bitField0_ |= 512;
        bLECharacteristicState.endDate_ = str;
    }

    /* JADX INFO: renamed from: s */
    public static void m12655s(BLECharacteristicState bLECharacteristicState, int i) {
        bLECharacteristicState.bitField0_ |= 2;
        bLECharacteristicState.scanningReadFailureCount_ = i;
    }

    /* JADX INFO: renamed from: t */
    public static void m12656t(BLECharacteristicState bLECharacteristicState, int i) {
        bLECharacteristicState.bitField0_ |= 1;
        bLECharacteristicState.scanningReadSuccessCount_ = i;
    }

    /* JADX INFO: renamed from: u */
    public static void m12657u(BLECharacteristicState bLECharacteristicState, int i) {
        bLECharacteristicState.bitField0_ |= 8;
        bLECharacteristicState.scanningWriteFailureCount_ = i;
    }

    /* JADX INFO: renamed from: v */
    public static void m12658v(BLECharacteristicState bLECharacteristicState, int i) {
        bLECharacteristicState.bitField0_ |= 4;
        bLECharacteristicState.scanningWriteSuccessCount_ = i;
    }

    /* JADX INFO: renamed from: w */
    public static void m12659w(BLECharacteristicState bLECharacteristicState, String str) {
        bLECharacteristicState.getClass();
        str.getClass();
        bLECharacteristicState.bitField0_ |= 256;
        bLECharacteristicState.startDate_ = str;
    }

    /* JADX INFO: renamed from: x */
    public static wc8 m12660x() {
        return (wc8) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\n\u0000\u0001\u0001\n\n\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0002\u0004င\u0003\u0005င\u0004\u0006င\u0005\u0007င\u0006\bင\u0007\tဈ\b\nဈ\t", new Object[]{"bitField0_", "scanningReadSuccessCount_", "scanningReadFailureCount_", "scanningWriteSuccessCount_", "scanningWriteFailureCount_", "advertisingReadSuccessCount_", "advertisingReadFailureCount_", "advertisingWriteSuccessCount_", "advertisingWriteFailureCount_", "startDate_", "endDate_"});
        }
        if (iOrdinal == 3) {
            return new BLECharacteristicState();
        }
        if (iOrdinal == 4) {
            return new wc8(DEFAULT_INSTANCE);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        r2n0 r2n0Var = PARSER;
        if (r2n0Var != null) {
            return r2n0Var;
        }
        synchronized (BLECharacteristicState.class) {
            try {
                r110Var = PARSER;
                if (r110Var == null) {
                    r110Var = new r110(DEFAULT_INSTANCE);
                    PARSER = r110Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return r110Var;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.sre0
    public final /* bridge */ /* synthetic */ pre0 getDefaultInstanceForType() {
        return getDefaultInstanceForType();
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
