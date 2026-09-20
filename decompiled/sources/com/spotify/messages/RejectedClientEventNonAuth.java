package com.spotify.messages;

import com.google.protobuf.AbstractC0269h;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.xwv0;
import p204p.z110;

/* JADX INFO: loaded from: classes8.dex */
public final class RejectedClientEventNonAuth extends AbstractC0269h implements sre0 {
    private static final RejectedClientEventNonAuth DEFAULT_INSTANCE;
    public static final int EVENT_NAME_FIELD_NUMBER = 2;
    private static volatile r2n0 PARSER = null;
    public static final int REJECT_REASON_FIELD_NUMBER = 1;
    private int bitField0_;
    private String rejectReason_ = "";
    private String eventName_ = "";

    static {
        RejectedClientEventNonAuth rejectedClientEventNonAuth = new RejectedClientEventNonAuth();
        DEFAULT_INSTANCE = rejectedClientEventNonAuth;
        AbstractC0269h.registerDefaultInstance(RejectedClientEventNonAuth.class, rejectedClientEventNonAuth);
    }

    private RejectedClientEventNonAuth() {
    }

    /* JADX INFO: renamed from: n */
    public static void m14412n(RejectedClientEventNonAuth rejectedClientEventNonAuth, String str) {
        rejectedClientEventNonAuth.getClass();
        str.getClass();
        rejectedClientEventNonAuth.bitField0_ |= 2;
        rejectedClientEventNonAuth.eventName_ = str;
    }

    /* JADX INFO: renamed from: o */
    public static void m14413o(RejectedClientEventNonAuth rejectedClientEventNonAuth, String str) {
        rejectedClientEventNonAuth.getClass();
        rejectedClientEventNonAuth.bitField0_ |= 1;
        rejectedClientEventNonAuth.rejectReason_ = str;
    }

    /* JADX INFO: renamed from: p */
    public static xwv0 m14414p() {
        return (xwv0) DEFAULT_INSTANCE.createBuilder();
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"bitField0_", "rejectReason_", "eventName_"});
        }
        if (iOrdinal == 3) {
            return new RejectedClientEventNonAuth();
        }
        if (iOrdinal == 4) {
            return new xwv0(DEFAULT_INSTANCE);
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
        synchronized (RejectedClientEventNonAuth.class) {
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
