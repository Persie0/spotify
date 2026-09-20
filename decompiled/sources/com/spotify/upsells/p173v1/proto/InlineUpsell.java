package com.spotify.upsells.p173v1.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;
import p204p.zc40;

/* JADX INFO: loaded from: classes9.dex */
public final class InlineUpsell extends AbstractC0269h implements sre0 {
    public static final int BADGE_FIELD_NUMBER = 3;
    public static final int BODY_FIELD_NUMBER = 2;
    private static final InlineUpsell DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER = null;
    public static final int SIGNIFIER_FIELD_NUMBER = 5;
    public static final int TARGET_FIELD_NUMBER = 4;
    public static final int TITLE_FIELD_NUMBER = 1;
    private Badge badge_;
    private int bitField0_;
    private SignifierDisplay signifier_;
    private String title_ = "";
    private String body_ = "";
    private String target_ = "";

    static {
        InlineUpsell inlineUpsell = new InlineUpsell();
        DEFAULT_INSTANCE = inlineUpsell;
        AbstractC0269h.registerDefaultInstance(InlineUpsell.class, inlineUpsell);
    }

    private InlineUpsell() {
    }

    /* JADX INFO: renamed from: o */
    public static InlineUpsell m22072o() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003ဉ\u0000\u0004Ȉ\u0005ဉ\u0001", new Object[]{"bitField0_", "title_", "body_", "badge_", "target_", "signifier_"});
        }
        if (iOrdinal == 3) {
            return new InlineUpsell();
        }
        if (iOrdinal == 4) {
            return new zc40(DEFAULT_INSTANCE, 12);
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
        synchronized (InlineUpsell.class) {
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

    public final String getTitle() {
        return this.title_;
    }

    /* JADX INFO: renamed from: n */
    public final String m22073n() {
        return this.body_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: p */
    public final SignifierDisplay m22074p() {
        SignifierDisplay signifierDisplay = this.signifier_;
        return signifierDisplay == null ? SignifierDisplay.m22081o() : signifierDisplay;
    }

    /* JADX INFO: renamed from: q */
    public final String m22075q() {
        return this.target_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
