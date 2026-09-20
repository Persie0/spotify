package com.spotify.collection_esperanto.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.n0a1;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes5.dex */
public final class UnbanInPlayContextRequest extends AbstractC0269h implements sre0 {
    public static final int CONTEXT_URI_FIELD_NUMBER = 1;
    private static final UnbanInPlayContextRequest DEFAULT_INSTANCE;
    public static final int ITEM_URI_FIELD_NUMBER = 2;
    private static volatile r2n0 PARSER;
    private String contextUri_ = "";
    private String itemUri_ = "";

    static {
        UnbanInPlayContextRequest unbanInPlayContextRequest = new UnbanInPlayContextRequest();
        DEFAULT_INSTANCE = unbanInPlayContextRequest;
        AbstractC0269h.registerDefaultInstance(UnbanInPlayContextRequest.class, unbanInPlayContextRequest);
    }

    private UnbanInPlayContextRequest() {
    }

    /* JADX INFO: renamed from: n */
    public static void m6854n(UnbanInPlayContextRequest unbanInPlayContextRequest, String str) {
        unbanInPlayContextRequest.getClass();
        str.getClass();
        unbanInPlayContextRequest.contextUri_ = str;
    }

    /* JADX INFO: renamed from: o */
    public static void m6855o(UnbanInPlayContextRequest unbanInPlayContextRequest, String str) {
        unbanInPlayContextRequest.getClass();
        str.getClass();
        unbanInPlayContextRequest.itemUri_ = str;
    }

    /* JADX INFO: renamed from: p */
    public static n0a1 m6856p() {
        return (n0a1) DEFAULT_INSTANCE.createBuilder();
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ", new Object[]{"contextUri_", "itemUri_"});
        }
        if (iOrdinal == 3) {
            return new UnbanInPlayContextRequest();
        }
        if (iOrdinal == 4) {
            return new n0a1(DEFAULT_INSTANCE);
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
        synchronized (UnbanInPlayContextRequest.class) {
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
