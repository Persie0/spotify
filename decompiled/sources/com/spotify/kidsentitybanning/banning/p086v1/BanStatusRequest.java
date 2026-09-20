package com.spotify.kidsentitybanning.banning.p086v1;

import com.google.protobuf.AbstractC0269h;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.ts8;
import p204p.z110;

/* JADX INFO: loaded from: classes7.dex */
public final class BanStatusRequest extends AbstractC0269h implements sre0 {
    private static final BanStatusRequest DEFAULT_INSTANCE;
    public static final int ENTITY_FIELD_NUMBER = 1;
    private static volatile r2n0 PARSER;
    private String entity_ = "";

    static {
        BanStatusRequest banStatusRequest = new BanStatusRequest();
        DEFAULT_INSTANCE = banStatusRequest;
        AbstractC0269h.registerDefaultInstance(BanStatusRequest.class, banStatusRequest);
    }

    private BanStatusRequest() {
    }

    /* JADX INFO: renamed from: n */
    public static void m12172n(BanStatusRequest banStatusRequest, String str) {
        banStatusRequest.getClass();
        str.getClass();
        banStatusRequest.entity_ = str;
    }

    /* JADX INFO: renamed from: o */
    public static ts8 m12173o() {
        return (ts8) DEFAULT_INSTANCE.createBuilder();
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"entity_"});
        }
        if (iOrdinal == 3) {
            return new BanStatusRequest();
        }
        if (iOrdinal == 4) {
            return new ts8(DEFAULT_INSTANCE);
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
        synchronized (BanStatusRequest.class) {
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
