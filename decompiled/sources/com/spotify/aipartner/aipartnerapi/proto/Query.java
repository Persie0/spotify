package com.spotify.aipartner.aipartnerapi.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.git0;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.uit0;
import p204p.z110;

/* JADX INFO: loaded from: classes4.dex */
public final class Query extends AbstractC0269h implements sre0 {
    private static final Query DEFAULT_INSTANCE;
    public static final int LANGUAGE_FIELD_NUMBER = 3;
    private static volatile r2n0 PARSER = null;
    public static final int PROMPT_FIELD_NUMBER = 1;
    public static final int TYPE_FIELD_NUMBER = 2;
    private int type_;
    private String prompt_ = "";
    private String language_ = "";

    static {
        Query query = new Query();
        DEFAULT_INSTANCE = query;
        AbstractC0269h.registerDefaultInstance(Query.class, query);
    }

    private Query() {
    }

    /* JADX INFO: renamed from: n */
    public static void m3061n(Query query, String str) {
        query.getClass();
        str.getClass();
        query.language_ = str;
    }

    /* JADX INFO: renamed from: o */
    public static void m3062o(Query query, String str) {
        query.getClass();
        str.getClass();
        query.prompt_ = str;
    }

    /* JADX INFO: renamed from: p */
    public static void m3063p(Query query, uit0 uit0Var) {
        query.getClass();
        query.type_ = uit0Var.getNumber();
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static Query m3064q() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: renamed from: r */
    public static git0 m3065r() {
        return (git0) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\f\u0003Ȉ", new Object[]{"prompt_", "type_", "language_"});
        }
        if (iOrdinal == 3) {
            return new Query();
        }
        if (iOrdinal == 4) {
            return new git0(DEFAULT_INSTANCE);
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
        synchronized (Query.class) {
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

    public final String getPrompt() {
        return this.prompt_;
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
