package com.spotify.upsells.p173v1.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;
import p204p.z79;

/* JADX INFO: loaded from: classes9.dex */
public final class BottomSheet extends AbstractC0269h implements sre0 {
    public static final int BADGE_FIELD_NUMBER = 2;
    public static final int BODY_TEXT_FIELD_NUMBER = 5;
    private static final BottomSheet DEFAULT_INSTANCE;
    public static final int HEADER_IMAGE_URL_FIELD_NUMBER = 1;
    public static final int LIMIT_MESSAGE_FIELD_NUMBER = 4;
    private static volatile r2n0 PARSER = null;
    public static final int PRIMARY_CTA_FIELD_NUMBER = 6;
    public static final int SECONDARY_CTA_FIELD_NUMBER = 7;
    public static final int TITLE_FIELD_NUMBER = 3;
    private Badge badge_;
    private int bitField0_;
    private LimitMessage limitMessage_;
    private CTA primaryCta_;
    private CTA secondaryCta_;
    private String headerImageUrl_ = "";
    private String title_ = "";
    private String bodyText_ = "";

    static {
        BottomSheet bottomSheet = new BottomSheet();
        DEFAULT_INSTANCE = bottomSheet;
        AbstractC0269h.registerDefaultInstance(BottomSheet.class, bottomSheet);
    }

    private BottomSheet() {
    }

    /* JADX INFO: renamed from: o */
    public static BottomSheet m22050o() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001Ȉ\u0002ဉ\u0000\u0003Ȉ\u0004ဉ\u0001\u0005Ȉ\u0006ဉ\u0002\u0007ဉ\u0003", new Object[]{"bitField0_", "headerImageUrl_", "badge_", "title_", "limitMessage_", "bodyText_", "primaryCta_", "secondaryCta_"});
        }
        if (iOrdinal == 3) {
            return new BottomSheet();
        }
        if (iOrdinal == 4) {
            return new z79(DEFAULT_INSTANCE, 15);
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
        synchronized (BottomSheet.class) {
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
    public final String m22051n() {
        return this.bodyText_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: p */
    public final CTA m22052p() {
        CTA cta = this.primaryCta_;
        return cta == null ? CTA.m22055n() : cta;
    }

    /* JADX INFO: renamed from: q */
    public final CTA m22053q() {
        CTA cta = this.secondaryCta_;
        return cta == null ? CTA.m22055n() : cta;
    }

    /* JADX INFO: renamed from: r */
    public final boolean m22054r() {
        return (this.bitField0_ & 8) != 0;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
