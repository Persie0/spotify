package com.spotify.prefs.esperanto.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.knw;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes2.dex */
public final class EsPrefs$SubParams extends AbstractC0269h implements sre0 {
    private static final EsPrefs$SubParams DEFAULT_INSTANCE;
    public static final int KEY_FIELD_NUMBER = 1;
    private static volatile r2n0 PARSER;
    private String key_ = "";

    static {
        EsPrefs$SubParams esPrefs$SubParams = new EsPrefs$SubParams();
        DEFAULT_INSTANCE = esPrefs$SubParams;
        AbstractC0269h.registerDefaultInstance(EsPrefs$SubParams.class, esPrefs$SubParams);
    }

    private EsPrefs$SubParams() {
    }

    /* JADX INFO: renamed from: n */
    public static void m19520n(EsPrefs$SubParams esPrefs$SubParams, String str) {
        esPrefs$SubParams.getClass();
        esPrefs$SubParams.key_ = str;
    }

    /* JADX INFO: renamed from: o */
    public static knw m19521o() {
        return (knw) DEFAULT_INSTANCE.createBuilder();
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
            return new EsPrefs$SubParams();
        }
        if (iOrdinal == 4) {
            return new knw(DEFAULT_INSTANCE);
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
        synchronized (EsPrefs$SubParams.class) {
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
