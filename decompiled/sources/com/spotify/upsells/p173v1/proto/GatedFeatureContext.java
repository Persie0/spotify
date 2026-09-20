package com.spotify.upsells.p173v1.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.vu00;
import p204p.wu00;
import p204p.z110;

/* JADX INFO: loaded from: classes9.dex */
public final class GatedFeatureContext extends AbstractC0269h implements sre0 {
    public static final int ACTION_FIELD_NUMBER = 3;
    public static final int CONTENT_URI_FIELD_NUMBER = 1;
    private static final GatedFeatureContext DEFAULT_INSTANCE;
    public static final int FEATURE_ID_FIELD_NUMBER = 2;
    private static volatile r2n0 PARSER = null;
    public static final int REASON_FIELD_NUMBER = 4;
    private Object entity_;
    private int reason_;
    private int entityCase_ = 0;
    private String action_ = "";

    static {
        GatedFeatureContext gatedFeatureContext = new GatedFeatureContext();
        DEFAULT_INSTANCE = gatedFeatureContext;
        AbstractC0269h.registerDefaultInstance(GatedFeatureContext.class, gatedFeatureContext);
    }

    private GatedFeatureContext() {
    }

    /* JADX INFO: renamed from: n */
    public static void m22058n(GatedFeatureContext gatedFeatureContext, String str) {
        gatedFeatureContext.getClass();
        str.getClass();
        gatedFeatureContext.action_ = str;
    }

    /* JADX INFO: renamed from: o */
    public static void m22059o(GatedFeatureContext gatedFeatureContext, String str) {
        gatedFeatureContext.getClass();
        str.getClass();
        gatedFeatureContext.entityCase_ = 2;
        gatedFeatureContext.entity_ = str;
    }

    /* JADX INFO: renamed from: p */
    public static void m22060p(GatedFeatureContext gatedFeatureContext, wu00 wu00Var) {
        gatedFeatureContext.getClass();
        gatedFeatureContext.reason_ = wu00Var.getNumber();
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: s */
    public static vu00 m22061s() {
        return (vu00) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0001\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȼ\u0000\u0002Ȼ\u0000\u0003Ȉ\u0004\f", new Object[]{"entity_", "entityCase_", "action_", "reason_"});
        }
        if (iOrdinal == 3) {
            return new GatedFeatureContext();
        }
        if (iOrdinal == 4) {
            return new vu00(DEFAULT_INSTANCE);
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
        synchronized (GatedFeatureContext.class) {
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
    public final String m22062q() {
        return this.action_;
    }

    /* JADX INFO: renamed from: r */
    public final String m22063r() {
        return this.entityCase_ == 2 ? (String) this.entity_ : "";
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
