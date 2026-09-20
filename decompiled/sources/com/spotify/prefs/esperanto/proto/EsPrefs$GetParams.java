package com.spotify.prefs.esperanto.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.gnw;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes9.dex */
public final class EsPrefs$GetParams extends AbstractC0269h implements sre0 {
    private static final EsPrefs$GetParams DEFAULT_INSTANCE;
    public static final int KEY_FIELD_NUMBER = 1;
    private static volatile r2n0 PARSER;
    private String key_ = "";

    static {
        EsPrefs$GetParams esPrefs$GetParams = new EsPrefs$GetParams();
        DEFAULT_INSTANCE = esPrefs$GetParams;
        AbstractC0269h.registerDefaultInstance(EsPrefs$GetParams.class, esPrefs$GetParams);
    }

    private EsPrefs$GetParams() {
    }

    /* JADX INFO: renamed from: n */
    public static void m19511n(EsPrefs$GetParams esPrefs$GetParams, String str) {
        esPrefs$GetParams.getClass();
        esPrefs$GetParams.key_ = str;
    }

    /* JADX INFO: renamed from: o */
    public static gnw m19512o() {
        return (gnw) DEFAULT_INSTANCE.createBuilder();
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"key_"});
        }
        if (iOrdinal == 3) {
            return new EsPrefs$GetParams();
        }
        if (iOrdinal == 4) {
            return new gnw(DEFAULT_INSTANCE);
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
        synchronized (EsPrefs$GetParams.class) {
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
