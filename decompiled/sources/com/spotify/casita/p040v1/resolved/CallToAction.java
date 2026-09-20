package com.spotify.casita.p040v1.resolved;

import com.google.protobuf.AbstractC0269h;
import p204p.m6b;
import p204p.ore0;
import p204p.osa;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes.dex */
public final class CallToAction extends AbstractC0269h implements sre0 {
    private static final CallToAction DEFAULT_INSTANCE;
    public static final int DJ_CALL_TO_ACTION_FIELD_NUMBER = 3;
    private static volatile r2n0 PARSER = null;
    public static final int RICH_CALL_TO_ACTION_FIELD_NUMBER = 1;
    public static final int SIMPLE_CALL_TO_ACTION_FIELD_NUMBER = 2;
    private int variantCase_ = 0;
    private Object variant_;

    static {
        CallToAction callToAction = new CallToAction();
        DEFAULT_INSTANCE = callToAction;
        AbstractC0269h.registerDefaultInstance(CallToAction.class, callToAction);
    }

    private CallToAction() {
    }

    /* JADX INFO: renamed from: o */
    public static CallToAction m5593o() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0001\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000", new Object[]{"variant_", "variantCase_", RichCallToAction.class, SimpleCallToAction.class, DjCallToAction.class});
        }
        if (iOrdinal == 3) {
            return new CallToAction();
        }
        if (iOrdinal == 4) {
            return new osa(4);
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
        synchronized (CallToAction.class) {
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

    /* JADX INFO: renamed from: p */
    public final DjCallToAction m5594p() {
        return this.variantCase_ == 3 ? (DjCallToAction) this.variant_ : DjCallToAction.m5610o();
    }

    /* JADX INFO: renamed from: q */
    public final RichCallToAction m5595q() {
        return this.variantCase_ == 1 ? (RichCallToAction) this.variant_ : RichCallToAction.m5779o();
    }

    /* JADX INFO: renamed from: r */
    public final SimpleCallToAction m5596r() {
        return this.variantCase_ == 2 ? (SimpleCallToAction) this.variant_ : SimpleCallToAction.m5841o();
    }

    /* JADX INFO: renamed from: s */
    public final int m5597s() {
        return m6b.m60986a(this.variantCase_);
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
