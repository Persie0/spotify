package com.spotify.connectivity.pubsub.esperanto.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.vkw;
import p204p.z110;

/* JADX INFO: loaded from: classes.dex */
public final class EsIdent$Ident extends AbstractC0269h implements sre0 {
    private static final EsIdent$Ident DEFAULT_INSTANCE;
    public static final int IDENT_FIELD_NUMBER = 1;
    private static volatile r2n0 PARSER;
    private String ident_ = "";

    static {
        EsIdent$Ident esIdent$Ident = new EsIdent$Ident();
        DEFAULT_INSTANCE = esIdent$Ident;
        AbstractC0269h.registerDefaultInstance(EsIdent$Ident.class, esIdent$Ident);
    }

    private EsIdent$Ident() {
    }

    /* JADX INFO: renamed from: n */
    public static EsIdent$Ident m7535n() {
        return DEFAULT_INSTANCE;
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"ident_"});
        }
        if (iOrdinal == 3) {
            return new EsIdent$Ident();
        }
        if (iOrdinal == 4) {
            return new vkw(DEFAULT_INSTANCE, 0);
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
        synchronized (EsIdent$Ident.class) {
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

    /* JADX INFO: renamed from: o */
    public final String m7536o() {
        return this.ident_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
