package com.spotify.allboarding.model.p019v1.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.ae50;
import p204p.ct31;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes3.dex */
public final class SquircleShow extends AbstractC0269h implements sre0 {
    private static final SquircleShow DEFAULT_INSTANCE;
    public static final int EXPANSION_LIMIT_FIELD_NUMBER = 8;
    public static final int IMAGE_URL_FIELD_NUMBER = 6;
    public static final int LOGGING_FIELD_NUMBER = 7;
    public static final int MORE_URL_FIELD_NUMBER = 5;
    private static volatile r2n0 PARSER = null;
    public static final int RELATED_ITEMS_FIELD_NUMBER = 4;
    public static final int SELECTED_FIELD_NUMBER = 3;
    public static final int SHOULD_FOLLOW_UPON_SELECTION_FIELD_NUMBER = 11;
    public static final int SUBTITLE_FIELD_NUMBER = 10;
    public static final int TAG_URIS_FIELD_NUMBER = 9;
    public static final int TEXT_FIELD_NUMBER = 2;
    public static final int URI_FIELD_NUMBER = 1;
    private int bitField0_;
    private int expansionLimit_;
    private NullableString imageUrl_;
    private Logging logging_;
    private NullableString moreUrl_;
    private boolean selected_;
    private boolean shouldFollowUponSelection_;
    private NullableString subtitle_;
    private String uri_ = "";
    private String text_ = "";
    private ae50 relatedItems_ = AbstractC0269h.emptyProtobufList();
    private ae50 tagUris_ = AbstractC0269h.emptyProtobufList();

    static {
        SquircleShow squircleShow = new SquircleShow();
        DEFAULT_INSTANCE = squircleShow;
        AbstractC0269h.registerDefaultInstance(SquircleShow.class, squircleShow);
    }

    private SquircleShow() {
    }

    /* JADX INFO: renamed from: n */
    public static SquircleShow m3159n() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u000b\u0000\u0001\u0001\u000b\u000b\u0000\u0002\u0000\u0001Ȉ\u0002Ȉ\u0003\u0007\u0004\u001b\u0005ဉ\u0000\u0006ဉ\u0001\u0007ဉ\u0002\b\u0004\tȚ\nဉ\u0003\u000b\u0007", new Object[]{"bitField0_", "uri_", "text_", "selected_", "relatedItems_", SquircleShow.class, "moreUrl_", "imageUrl_", "logging_", "expansionLimit_", "tagUris_", "subtitle_", "shouldFollowUponSelection_"});
        }
        if (iOrdinal == 3) {
            return new SquircleShow();
        }
        if (iOrdinal == 4) {
            return new ct31(DEFAULT_INSTANCE, 17);
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
        synchronized (SquircleShow.class) {
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

    public final String getUri() {
        return this.uri_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final int m3160o() {
        return this.expansionLimit_;
    }

    /* JADX INFO: renamed from: p */
    public final NullableString m3161p() {
        NullableString nullableString = this.imageUrl_;
        return nullableString == null ? NullableString.m3129n() : nullableString;
    }

    /* JADX INFO: renamed from: q */
    public final NullableString m3162q() {
        NullableString nullableString = this.moreUrl_;
        return nullableString == null ? NullableString.m3129n() : nullableString;
    }

    /* JADX INFO: renamed from: r */
    public final ae50 m3163r() {
        return this.relatedItems_;
    }

    /* JADX INFO: renamed from: s */
    public final boolean m3164s() {
        return this.selected_;
    }

    /* JADX INFO: renamed from: t */
    public final boolean m3165t() {
        return this.shouldFollowUponSelection_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }

    /* JADX INFO: renamed from: u */
    public final ae50 m3166u() {
        return this.tagUris_;
    }

    /* JADX INFO: renamed from: v */
    public final String m3167v() {
        return this.text_;
    }
}
