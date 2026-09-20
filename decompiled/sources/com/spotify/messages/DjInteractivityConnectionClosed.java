package com.spotify.messages;

import com.google.protobuf.AbstractC0269h;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;
import p204p.zyr;

/* JADX INFO: loaded from: classes8.dex */
public final class DjInteractivityConnectionClosed extends AbstractC0269h implements sre0 {
    public static final int CONNECTION_ID_FIELD_NUMBER = 1;
    private static final DjInteractivityConnectionClosed DEFAULT_INSTANCE;
    public static final int END_OF_SPEECH_RECEIVED_FIELD_NUMBER = 4;
    private static volatile r2n0 PARSER = null;
    public static final int REASON_FIELD_NUMBER = 3;
    public static final int STATUS_CODE_FIELD_NUMBER = 2;
    private int bitField0_;
    private boolean endOfSpeechReceived_;
    private int statusCode_;
    private String connectionId_ = "";
    private String reason_ = "";

    static {
        DjInteractivityConnectionClosed djInteractivityConnectionClosed = new DjInteractivityConnectionClosed();
        DEFAULT_INSTANCE = djInteractivityConnectionClosed;
        AbstractC0269h.registerDefaultInstance(DjInteractivityConnectionClosed.class, djInteractivityConnectionClosed);
    }

    private DjInteractivityConnectionClosed() {
    }

    /* JADX INFO: renamed from: n */
    public static void m13841n(DjInteractivityConnectionClosed djInteractivityConnectionClosed, String str) {
        djInteractivityConnectionClosed.getClass();
        str.getClass();
        djInteractivityConnectionClosed.bitField0_ |= 1;
        djInteractivityConnectionClosed.connectionId_ = str;
    }

    /* JADX INFO: renamed from: o */
    public static void m13842o(DjInteractivityConnectionClosed djInteractivityConnectionClosed, boolean z) {
        djInteractivityConnectionClosed.bitField0_ |= 8;
        djInteractivityConnectionClosed.endOfSpeechReceived_ = z;
    }

    /* JADX INFO: renamed from: p */
    public static void m13843p(DjInteractivityConnectionClosed djInteractivityConnectionClosed, String str) {
        djInteractivityConnectionClosed.getClass();
        str.getClass();
        djInteractivityConnectionClosed.bitField0_ |= 4;
        djInteractivityConnectionClosed.reason_ = str;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static void m13844q(DjInteractivityConnectionClosed djInteractivityConnectionClosed, int i) {
        djInteractivityConnectionClosed.bitField0_ |= 2;
        djInteractivityConnectionClosed.statusCode_ = i;
    }

    /* JADX INFO: renamed from: r */
    public static zyr m13845r() {
        return (zyr) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002င\u0001\u0003ဈ\u0002\u0004ဇ\u0003", new Object[]{"bitField0_", "connectionId_", "statusCode_", "reason_", "endOfSpeechReceived_"});
        }
        if (iOrdinal == 3) {
            return new DjInteractivityConnectionClosed();
        }
        if (iOrdinal == 4) {
            return new zyr(DEFAULT_INSTANCE);
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
        synchronized (DjInteractivityConnectionClosed.class) {
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
