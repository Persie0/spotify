package com.spotify.highlightsstats.data.proto.p076v2;

import com.google.protobuf.AbstractC0269h;
import com.spotify.highlightsstats.Person;
import com.spotify.highlightsstats.TextWithOverride;
import com.spotify.wrapped.p194v1.proto.Paragraph;
import p204p.ae50;
import p204p.ne21;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes7.dex */
public final class SocialArtistsTile extends AbstractC0269h implements sre0 {
    public static final int ACCESSIBILITY_DESCRIPTION_FIELD_NUMBER = 7;
    private static final SocialArtistsTile DEFAULT_INSTANCE;
    public static final int FALLBACK_IMAGE_URL_FIELD_NUMBER = 4;
    public static final int HEADER_FIELD_NUMBER = 1;
    public static final int IMAGE_URLS_FIELD_NUMBER = 3;
    public static final int IS_EMPTY_FIELD_NUMBER = 8;
    private static volatile r2n0 PARSER = null;
    public static final int POSITION_CHANGE_FIELD_NUMBER = 6;
    public static final int SOCIAL_USERS_FIELD_NUMBER = 5;
    public static final int TITLE_FIELD_NUMBER = 2;
    private TextWithOverride accessibilityDescription_;
    private int bitField0_;
    private boolean isEmpty_;
    private int positionChange_;
    private Paragraph title_;
    private String header_ = "";
    private ae50 imageUrls_ = AbstractC0269h.emptyProtobufList();
    private String fallbackImageUrl_ = "";
    private ae50 socialUsers_ = AbstractC0269h.emptyProtobufList();

    static {
        SocialArtistsTile socialArtistsTile = new SocialArtistsTile();
        DEFAULT_INSTANCE = socialArtistsTile;
        AbstractC0269h.registerDefaultInstance(SocialArtistsTile.class, socialArtistsTile);
    }

    private SocialArtistsTile() {
    }

    /* JADX INFO: renamed from: o */
    public static SocialArtistsTile m11610o() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\b\u0000\u0001\u0001\b\b\u0000\u0002\u0000\u0001Ȉ\u0002ဉ\u0000\u0003Ț\u0004Ȉ\u0005\u001b\u0006\u000f\u0007ဉ\u0001\b\u0007", new Object[]{"bitField0_", "header_", "title_", "imageUrls_", "fallbackImageUrl_", "socialUsers_", Person.class, "positionChange_", "accessibilityDescription_", "isEmpty_"});
        }
        if (iOrdinal == 3) {
            return new SocialArtistsTile();
        }
        if (iOrdinal == 4) {
            return new ne21(DEFAULT_INSTANCE, 9);
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
        synchronized (SocialArtistsTile.class) {
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
    public final TextWithOverride m11611n() {
        TextWithOverride textWithOverride = this.accessibilityDescription_;
        return textWithOverride == null ? TextWithOverride.m11295o() : textWithOverride;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: p */
    public final String m11612p() {
        return this.fallbackImageUrl_;
    }

    /* JADX INFO: renamed from: q */
    public final String m11613q() {
        return this.header_;
    }

    /* JADX INFO: renamed from: r */
    public final ae50 m11614r() {
        return this.imageUrls_;
    }

    /* JADX INFO: renamed from: s */
    public final boolean m11615s() {
        return this.isEmpty_;
    }

    /* JADX INFO: renamed from: t */
    public final int m11616t() {
        return this.positionChange_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }

    /* JADX INFO: renamed from: u */
    public final ae50 m11617u() {
        return this.socialUsers_;
    }

    /* JADX INFO: renamed from: v */
    public final Paragraph m11618v() {
        Paragraph paragraph = this.title_;
        return paragraph == null ? Paragraph.m23150p() : paragraph;
    }

    /* JADX INFO: renamed from: w */
    public final boolean m11619w() {
        return (this.bitField0_ & 1) != 0;
    }
}
