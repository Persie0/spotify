package com.spotify.collection_esperanto.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.ore0;
import p204p.pre0;
import p204p.ps8;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes5.dex */
public final class BanInPlayContextRequest extends AbstractC0269h implements sre0 {
    public static final int CONTEXT_URI_FIELD_NUMBER = 1;
    private static final BanInPlayContextRequest DEFAULT_INSTANCE;
    public static final int ITEM_URI_FIELD_NUMBER = 2;
    private static volatile r2n0 PARSER = null;
    public static final int PROVIDER_FIELD_NUMBER = 3;
    private String contextUri_ = "";
    private String itemUri_ = "";
    private String provider_ = "";

    static {
        BanInPlayContextRequest banInPlayContextRequest = new BanInPlayContextRequest();
        DEFAULT_INSTANCE = banInPlayContextRequest;
        AbstractC0269h.registerDefaultInstance(BanInPlayContextRequest.class, banInPlayContextRequest);
    }

    private BanInPlayContextRequest() {
    }

    /* JADX INFO: renamed from: n */
    public static void m6833n(BanInPlayContextRequest banInPlayContextRequest, String str) {
        banInPlayContextRequest.getClass();
        str.getClass();
        banInPlayContextRequest.contextUri_ = str;
    }

    /* JADX INFO: renamed from: o */
    public static void m6834o(BanInPlayContextRequest banInPlayContextRequest, String str) {
        banInPlayContextRequest.getClass();
        str.getClass();
        banInPlayContextRequest.itemUri_ = str;
    }

    /* JADX INFO: renamed from: p */
    public static void m6835p(BanInPlayContextRequest banInPlayContextRequest, String str) {
        banInPlayContextRequest.getClass();
        str.getClass();
        banInPlayContextRequest.provider_ = str;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static ps8 m6836q() {
        return (ps8) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ", new Object[]{"contextUri_", "itemUri_", "provider_"});
        }
        if (iOrdinal == 3) {
            return new BanInPlayContextRequest();
        }
        if (iOrdinal == 4) {
            return new ps8(DEFAULT_INSTANCE);
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
        synchronized (BanInPlayContextRequest.class) {
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
