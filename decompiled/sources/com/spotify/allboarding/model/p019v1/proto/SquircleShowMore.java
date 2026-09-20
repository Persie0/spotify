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
public final class SquircleShowMore extends AbstractC0269h implements sre0 {
    public static final int COLOR_FIELD_NUMBER = 5;
    private static final SquircleShowMore DEFAULT_INSTANCE;
    public static final int EXPANSION_LIMIT_FIELD_NUMBER = 7;
    public static final int LOGGING_FIELD_NUMBER = 6;
    public static final int MORE_URL_FIELD_NUMBER = 4;
    private static volatile r2n0 PARSER = null;
    public static final int RELATED_ITEMS_FIELD_NUMBER = 3;
    public static final int TAG_URIS_FIELD_NUMBER = 8;
    public static final int TEXT_FIELD_NUMBER = 2;
    public static final int URI_FIELD_NUMBER = 1;
    private int bitField0_;
    private int expansionLimit_;
    private Logging logging_;
    private NullableString moreUrl_;
    private String uri_ = "";
    private String text_ = "";
    private ae50 relatedItems_ = AbstractC0269h.emptyProtobufList();
    private String color_ = "";
    private ae50 tagUris_ = AbstractC0269h.emptyProtobufList();

    static {
        SquircleShowMore squircleShowMore = new SquircleShowMore();
        DEFAULT_INSTANCE = squircleShowMore;
        AbstractC0269h.registerDefaultInstance(SquircleShowMore.class, squircleShowMore);
    }

    private SquircleShowMore() {
    }

    /* JADX INFO: renamed from: o */
    public static SquircleShowMore m3168o() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\b\u0000\u0001\u0001\b\b\u0000\u0002\u0000\u0001Ȉ\u0002Ȉ\u0003\u001b\u0004ဉ\u0000\u0005Ȉ\u0006ဉ\u0001\u0007\u0004\bȚ", new Object[]{"bitField0_", "uri_", "text_", "relatedItems_", SquircleShow.class, "moreUrl_", "color_", "logging_", "expansionLimit_", "tagUris_"});
        }
        if (iOrdinal == 3) {
            return new SquircleShowMore();
        }
        if (iOrdinal == 4) {
            return new ct31(DEFAULT_INSTANCE, 18);
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
        synchronized (SquircleShowMore.class) {
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

    /* JADX INFO: renamed from: n */
    public final String m3169n() {
        return this.color_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: p */
    public final int m3170p() {
        return this.expansionLimit_;
    }

    /* JADX INFO: renamed from: q */
    public final NullableString m3171q() {
        NullableString nullableString = this.moreUrl_;
        return nullableString == null ? NullableString.m3129n() : nullableString;
    }

    /* JADX INFO: renamed from: r */
    public final ae50 m3172r() {
        return this.relatedItems_;
    }

    /* JADX INFO: renamed from: s */
    public final ae50 m3173s() {
        return this.tagUris_;
    }

    /* JADX INFO: renamed from: t */
    public final String m3174t() {
        return this.text_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
