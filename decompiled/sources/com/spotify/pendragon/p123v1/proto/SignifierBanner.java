package com.spotify.pendragon.p123v1.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.ore0;
import p204p.pre0;
import p204p.qr11;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes9.dex */
public final class SignifierBanner extends AbstractC0269h implements sre0 {
    public static final int ALIGNMENT_FIELD_NUMBER = 1;
    public static final int BACKGROUND_COLOR_FIELD_NUMBER = 2;
    public static final int BODY_COLOR_FIELD_NUMBER = 6;
    public static final int BODY_TEXT_FIELD_NUMBER = 5;
    private static final SignifierBanner DEFAULT_INSTANCE;
    public static final int HEADLINE_COLOR_FIELD_NUMBER = 4;
    public static final int HEADLINE_TEXT_FIELD_NUMBER = 3;
    private static volatile r2n0 PARSER = null;
    public static final int SIGNIFIER_FIELD_NUMBER = 7;
    private int alignment_;
    private int bitField0_;
    private Signifier signifier_;
    private String backgroundColor_ = "";
    private String headlineText_ = "";
    private String headlineColor_ = "";
    private String bodyText_ = "";
    private String bodyColor_ = "";

    static {
        SignifierBanner signifierBanner = new SignifierBanner();
        DEFAULT_INSTANCE = signifierBanner;
        AbstractC0269h.registerDefaultInstance(SignifierBanner.class, signifierBanner);
    }

    private SignifierBanner() {
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static SignifierBanner m17277q() {
        return DEFAULT_INSTANCE;
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001\f\u0002Ȉ\u0003Ȉ\u0004Ȉ\u0005Ȉ\u0006Ȉ\u0007ဉ\u0000", new Object[]{"bitField0_", "alignment_", "backgroundColor_", "headlineText_", "headlineColor_", "bodyText_", "bodyColor_", "signifier_"});
        }
        if (iOrdinal == 3) {
            return new SignifierBanner();
        }
        if (iOrdinal == 4) {
            return new qr11(DEFAULT_INSTANCE, 22);
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
        synchronized (SignifierBanner.class) {
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

    /* JADX INFO: renamed from: n */
    public final String m17278n() {
        return this.backgroundColor_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final String m17279o() {
        return this.bodyColor_;
    }

    /* JADX INFO: renamed from: p */
    public final String m17280p() {
        return this.bodyText_;
    }

    /* JADX INFO: renamed from: r */
    public final String m17281r() {
        return this.headlineColor_;
    }

    /* JADX INFO: renamed from: s */
    public final String m17282s() {
        return this.headlineText_;
    }

    /* JADX INFO: renamed from: t */
    public final Signifier m17283t() {
        Signifier signifier = this.signifier_;
        return signifier == null ? Signifier.m17273o() : signifier;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
