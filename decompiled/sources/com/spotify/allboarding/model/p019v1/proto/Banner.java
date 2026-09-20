package com.spotify.allboarding.model.p019v1.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.ae50;
import p204p.na8;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes3.dex */
public final class Banner extends AbstractC0269h implements sre0 {
    private static final Banner DEFAULT_INSTANCE;
    public static final int IMAGE_URL_FIELD_NUMBER = 4;
    public static final int LOGGING_FIELD_NUMBER = 5;
    private static volatile r2n0 PARSER = null;
    public static final int SELECTED_FIELD_NUMBER = 3;
    public static final int TAG_URIS_FIELD_NUMBER = 6;
    public static final int TEXT_FIELD_NUMBER = 2;
    public static final int URI_FIELD_NUMBER = 1;
    private int bitField0_;
    private Logging logging_;
    private boolean selected_;
    private String uri_ = "";
    private String text_ = "";
    private String imageUrl_ = "";
    private ae50 tagUris_ = AbstractC0269h.emptyProtobufList();

    static {
        Banner banner = new Banner();
        DEFAULT_INSTANCE = banner;
        AbstractC0269h.registerDefaultInstance(Banner.class, banner);
    }

    private Banner() {
    }

    /* JADX INFO: renamed from: n */
    public static Banner m3117n() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001Ȉ\u0002Ȉ\u0003\u0007\u0004Ȉ\u0005ဉ\u0000\u0006Ț", new Object[]{"bitField0_", "uri_", "text_", "selected_", "imageUrl_", "logging_", "tagUris_"});
        }
        if (iOrdinal == 3) {
            return new Banner();
        }
        if (iOrdinal == 4) {
            return new na8(DEFAULT_INSTANCE, 19);
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
        synchronized (Banner.class) {
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

    public final String getImageUrl() {
        return this.imageUrl_;
    }

    public final String getUri() {
        return this.uri_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final boolean m3118o() {
        return this.selected_;
    }

    /* JADX INFO: renamed from: p */
    public final ae50 m3119p() {
        return this.tagUris_;
    }

    /* JADX INFO: renamed from: q */
    public final String m3120q() {
        return this.text_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
