package com.spotify.collection_esperanto.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.lc31;
import p204p.mc31;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes5.dex */
public final class SnoozeRequest extends AbstractC0269h implements sre0 {
    private static final SnoozeRequest DEFAULT_INSTANCE;
    public static final int DURATION_FIELD_NUMBER = 3;
    private static volatile r2n0 PARSER = null;
    public static final int SNOOZE_CONTEXT_URI_FIELD_NUMBER = 2;
    public static final int URI_FIELD_NUMBER = 1;
    private int duration_;
    private String uri_ = "";
    private String snoozeContextUri_ = "";

    static {
        SnoozeRequest snoozeRequest = new SnoozeRequest();
        DEFAULT_INSTANCE = snoozeRequest;
        AbstractC0269h.registerDefaultInstance(SnoozeRequest.class, snoozeRequest);
    }

    private SnoozeRequest() {
    }

    /* JADX INFO: renamed from: n */
    public static void m6845n(SnoozeRequest snoozeRequest) {
        snoozeRequest.getClass();
        snoozeRequest.duration_ = mc31.SNOOZE_DURATION_30_DAYS.getNumber();
    }

    /* JADX INFO: renamed from: o */
    public static void m6846o(SnoozeRequest snoozeRequest, String str) {
        snoozeRequest.getClass();
        str.getClass();
        snoozeRequest.snoozeContextUri_ = str;
    }

    /* JADX INFO: renamed from: p */
    public static void m6847p(SnoozeRequest snoozeRequest, String str) {
        snoozeRequest.getClass();
        str.getClass();
        snoozeRequest.uri_ = str;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static lc31 m6848q() {
        return (lc31) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003\f", new Object[]{"uri_", "snoozeContextUri_", "duration_"});
        }
        if (iOrdinal == 3) {
            return new SnoozeRequest();
        }
        if (iOrdinal == 4) {
            return new lc31(DEFAULT_INSTANCE);
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
        synchronized (SnoozeRequest.class) {
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
