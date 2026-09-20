package com.spotify.messages;

import com.google.protobuf.AbstractC0269h;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.yyr;
import p204p.z110;

/* JADX INFO: loaded from: classes8.dex */
public final class DjInteractivityConnectionAttempt extends AbstractC0269h implements sre0 {
    public static final int CONNECTION_ID_FIELD_NUMBER = 1;
    public static final int CONNECTION_RESULT_FIELD_NUMBER = 4;
    private static final DjInteractivityConnectionAttempt DEFAULT_INSTANCE;
    public static final int DETAILS_FIELD_NUMBER = 6;
    private static volatile r2n0 PARSER = null;
    public static final int STATUS_CODE_FIELD_NUMBER = 5;
    public static final int TIMESTAMP_CONNECTION_INITIATED_FIELD_NUMBER = 2;
    public static final int TIMESTAMP_CONNECTION_RESOLVED_FIELD_NUMBER = 3;
    private int bitField0_;
    private String connectionId_ = "";
    private String connectionResult_ = "";
    private String details_ = "";
    private int statusCode_;
    private long timestampConnectionInitiated_;
    private long timestampConnectionResolved_;

    static {
        DjInteractivityConnectionAttempt djInteractivityConnectionAttempt = new DjInteractivityConnectionAttempt();
        DEFAULT_INSTANCE = djInteractivityConnectionAttempt;
        AbstractC0269h.registerDefaultInstance(DjInteractivityConnectionAttempt.class, djInteractivityConnectionAttempt);
    }

    private DjInteractivityConnectionAttempt() {
    }

    /* JADX INFO: renamed from: n */
    public static void m13834n(DjInteractivityConnectionAttempt djInteractivityConnectionAttempt, String str) {
        djInteractivityConnectionAttempt.getClass();
        str.getClass();
        djInteractivityConnectionAttempt.bitField0_ |= 1;
        djInteractivityConnectionAttempt.connectionId_ = str;
    }

    /* JADX INFO: renamed from: o */
    public static void m13835o(DjInteractivityConnectionAttempt djInteractivityConnectionAttempt, String str) {
        djInteractivityConnectionAttempt.getClass();
        str.getClass();
        djInteractivityConnectionAttempt.bitField0_ |= 8;
        djInteractivityConnectionAttempt.connectionResult_ = str;
    }

    /* JADX INFO: renamed from: p */
    public static void m13836p(DjInteractivityConnectionAttempt djInteractivityConnectionAttempt, String str) {
        djInteractivityConnectionAttempt.getClass();
        str.getClass();
        djInteractivityConnectionAttempt.bitField0_ |= 32;
        djInteractivityConnectionAttempt.details_ = str;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static void m13837q(DjInteractivityConnectionAttempt djInteractivityConnectionAttempt, int i) {
        djInteractivityConnectionAttempt.bitField0_ |= 16;
        djInteractivityConnectionAttempt.statusCode_ = i;
    }

    /* JADX INFO: renamed from: r */
    public static void m13838r(DjInteractivityConnectionAttempt djInteractivityConnectionAttempt, long j) {
        djInteractivityConnectionAttempt.bitField0_ |= 2;
        djInteractivityConnectionAttempt.timestampConnectionInitiated_ = j;
    }

    /* JADX INFO: renamed from: s */
    public static void m13839s(DjInteractivityConnectionAttempt djInteractivityConnectionAttempt, long j) {
        djInteractivityConnectionAttempt.bitField0_ |= 4;
        djInteractivityConnectionAttempt.timestampConnectionResolved_ = j;
    }

    /* JADX INFO: renamed from: t */
    public static yyr m13840t() {
        return (yyr) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0004ဈ\u0003\u0005င\u0004\u0006ဈ\u0005", new Object[]{"bitField0_", "connectionId_", "timestampConnectionInitiated_", "timestampConnectionResolved_", "connectionResult_", "statusCode_", "details_"});
        }
        if (iOrdinal == 3) {
            return new DjInteractivityConnectionAttempt();
        }
        if (iOrdinal == 4) {
            return new yyr(DEFAULT_INSTANCE);
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
        synchronized (DjInteractivityConnectionAttempt.class) {
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
