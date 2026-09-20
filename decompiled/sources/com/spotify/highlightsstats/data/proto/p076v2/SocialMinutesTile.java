package com.spotify.highlightsstats.data.proto.p076v2;

import com.google.protobuf.AbstractC0269h;
import com.spotify.highlightsstats.TextWithOverride;
import com.spotify.wrapped.p194v1.proto.Paragraph;
import p204p.ne21;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes7.dex */
public final class SocialMinutesTile extends AbstractC0269h implements sre0 {
    public static final int ACCESSIBILITY_DESCRIPTION_FIELD_NUMBER = 4;
    private static final SocialMinutesTile DEFAULT_INSTANCE;
    public static final int HEADER_FIELD_NUMBER = 1;
    private static volatile r2n0 PARSER = null;
    public static final int SUBTITLE_FIELD_NUMBER = 3;
    public static final int TITLE_FIELD_NUMBER = 2;
    private TextWithOverride accessibilityDescription_;
    private int bitField0_;
    private String header_ = "";
    private Paragraph subtitle_;
    private Paragraph title_;

    static {
        SocialMinutesTile socialMinutesTile = new SocialMinutesTile();
        DEFAULT_INSTANCE = socialMinutesTile;
        AbstractC0269h.registerDefaultInstance(SocialMinutesTile.class, socialMinutesTile);
    }

    private SocialMinutesTile() {
    }

    /* JADX INFO: renamed from: o */
    public static SocialMinutesTile m11628o() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002ဉ\u0000\u0003ဉ\u0001\u0004ဉ\u0002", new Object[]{"bitField0_", "header_", "title_", "subtitle_", "accessibilityDescription_"});
        }
        if (iOrdinal == 3) {
            return new SocialMinutesTile();
        }
        if (iOrdinal == 4) {
            return new ne21(DEFAULT_INSTANCE, 13);
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
        synchronized (SocialMinutesTile.class) {
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
    public final TextWithOverride m11629n() {
        TextWithOverride textWithOverride = this.accessibilityDescription_;
        return textWithOverride == null ? TextWithOverride.m11295o() : textWithOverride;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: p */
    public final String m11630p() {
        return this.header_;
    }

    /* JADX INFO: renamed from: q */
    public final Paragraph m11631q() {
        Paragraph paragraph = this.subtitle_;
        return paragraph == null ? Paragraph.m23150p() : paragraph;
    }

    /* JADX INFO: renamed from: r */
    public final Paragraph m11632r() {
        Paragraph paragraph = this.title_;
        return paragraph == null ? Paragraph.m23150p() : paragraph;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
