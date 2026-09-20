package com.spotify.music.instrumentation.events.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.y95;
import p204p.z110;

/* JADX INFO: loaded from: classes2.dex */
public final class AppFocusStateNonAuth extends AbstractC0269h implements sre0 {
    private static final AppFocusStateNonAuth DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER = null;
    public static final int STATE_FIELD_NUMBER = 1;
    public static final int TIMESTAMP_FIELD_NUMBER = 2;
    private int bitField0_;
    private String state_ = "";
    private long timestamp_;

    static {
        AppFocusStateNonAuth appFocusStateNonAuth = new AppFocusStateNonAuth();
        DEFAULT_INSTANCE = appFocusStateNonAuth;
        AbstractC0269h.registerDefaultInstance(AppFocusStateNonAuth.class, appFocusStateNonAuth);
    }

    private AppFocusStateNonAuth() {
    }

    /* JADX INFO: renamed from: n */
    public static void m15715n(AppFocusStateNonAuth appFocusStateNonAuth, String str) {
        appFocusStateNonAuth.getClass();
        appFocusStateNonAuth.bitField0_ |= 1;
        appFocusStateNonAuth.state_ = str;
    }

    /* JADX INFO: renamed from: o */
    public static void m15716o(AppFocusStateNonAuth appFocusStateNonAuth, long j) {
        appFocusStateNonAuth.bitField0_ |= 2;
        appFocusStateNonAuth.timestamp_ = j;
    }

    /* JADX INFO: renamed from: p */
    public static y95 m15717p() {
        return (y95) DEFAULT_INSTANCE.createBuilder();
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဂ\u0001", new Object[]{"bitField0_", "state_", "timestamp_"});
        }
        if (iOrdinal == 3) {
            return new AppFocusStateNonAuth();
        }
        if (iOrdinal == 4) {
            return new y95(DEFAULT_INSTANCE);
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
        synchronized (AppFocusStateNonAuth.class) {
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
