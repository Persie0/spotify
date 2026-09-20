package com.spotify.prefs.esperanto.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.lnw;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes2.dex */
public final class EsPrefs$Value extends AbstractC0269h implements sre0 {
    public static final int BOOL_FIELD_NUMBER = 2;
    private static final EsPrefs$Value DEFAULT_INSTANCE;
    public static final int NUMBER_FIELD_NUMBER = 1;
    private static volatile r2n0 PARSER = null;
    public static final int STRING_FIELD_NUMBER = 3;
    private int valueCase_ = 0;
    private Object value_;

    static {
        EsPrefs$Value esPrefs$Value = new EsPrefs$Value();
        DEFAULT_INSTANCE = esPrefs$Value;
        AbstractC0269h.registerDefaultInstance(EsPrefs$Value.class, esPrefs$Value);
    }

    private EsPrefs$Value() {
    }

    /* JADX INFO: renamed from: n */
    public static void m19522n(EsPrefs$Value esPrefs$Value, boolean z) {
        esPrefs$Value.valueCase_ = 2;
        esPrefs$Value.value_ = Boolean.valueOf(z);
    }

    /* JADX INFO: renamed from: o */
    public static void m19523o(EsPrefs$Value esPrefs$Value, long j) {
        esPrefs$Value.valueCase_ = 1;
        esPrefs$Value.value_ = Long.valueOf(j);
    }

    /* JADX INFO: renamed from: p */
    public static void m19524p(EsPrefs$Value esPrefs$Value, String str) {
        esPrefs$Value.getClass();
        esPrefs$Value.valueCase_ = 3;
        esPrefs$Value.value_ = str;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: r */
    public static EsPrefs$Value m19525r() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: renamed from: t */
    public static lnw m19526t() {
        return (lnw) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0001\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u00015\u0000\u0002:\u0000\u0003Ȼ\u0000", new Object[]{"value_", "valueCase_"});
        }
        if (iOrdinal == 3) {
            return new EsPrefs$Value();
        }
        if (iOrdinal == 4) {
            return new lnw(DEFAULT_INSTANCE);
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
        synchronized (EsPrefs$Value.class) {
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

    /* JADX INFO: renamed from: q */
    public final boolean m19527q() {
        if (this.valueCase_ == 2) {
            return ((Boolean) this.value_).booleanValue();
        }
        return false;
    }

    /* JADX INFO: renamed from: s */
    public final long m19528s() {
        if (this.valueCase_ == 1) {
            return ((Long) this.value_).longValue();
        }
        return 0L;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
