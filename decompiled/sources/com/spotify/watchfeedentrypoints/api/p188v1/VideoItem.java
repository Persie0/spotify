package com.spotify.watchfeedentrypoints.api.p188v1;

import com.google.protobuf.AbstractC0269h;
import p204p.chb1;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.uyb1;
import p204p.z110;

/* JADX INFO: loaded from: classes11.dex */
public final class VideoItem extends AbstractC0269h implements sre0 {
    public static final int ASPECT_RATIO_FIELD_NUMBER = 5;
    public static final int DECISION_ID_FIELD_NUMBER = 3;
    private static final VideoItem DEFAULT_INSTANCE;
    public static final int FIRST_ITEM_URI_FIELD_NUMBER = 2;
    public static final int NAVIGATION_URI_FIELD_NUMBER = 4;
    private static volatile r2n0 PARSER = null;
    public static final int URI_FIELD_NUMBER = 1;
    private int aspectRatio_;
    private String uri_ = "";
    private String firstItemUri_ = "";
    private String decisionId_ = "";
    private String navigationUri_ = "";

    static {
        VideoItem videoItem = new VideoItem();
        DEFAULT_INSTANCE = videoItem;
        AbstractC0269h.registerDefaultInstance(VideoItem.class, videoItem);
    }

    private VideoItem() {
    }

    /* JADX INFO: renamed from: p */
    public static VideoItem m22979p() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004Ȉ\u0005\f", new Object[]{"uri_", "firstItemUri_", "decisionId_", "navigationUri_", "aspectRatio_"});
        }
        if (iOrdinal == 3) {
            return new VideoItem();
        }
        if (iOrdinal == 4) {
            return new chb1(DEFAULT_INSTANCE, 21);
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
        synchronized (VideoItem.class) {
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
    public final uyb1 m22980n() {
        uyb1 uyb1Var;
        int i = this.aspectRatio_;
        if (i != 0) {
            uyb1Var = i != 1 ? null : uyb1.NINE_BY_SIXTEEN;
        } else {
            uyb1Var = uyb1.THREE_BY_FOUR;
        }
        return uyb1Var == null ? uyb1.UNRECOGNIZED : uyb1Var;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final String m22981o() {
        return this.decisionId_;
    }

    /* JADX INFO: renamed from: q */
    public final String m22982q() {
        return this.firstItemUri_;
    }

    /* JADX INFO: renamed from: r */
    public final String m22983r() {
        return this.navigationUri_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
