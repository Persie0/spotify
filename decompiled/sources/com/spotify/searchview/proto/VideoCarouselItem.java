package com.spotify.searchview.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.chb1;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes10.dex */
public final class VideoCarouselItem extends AbstractC0269h implements sre0 {
    private static final VideoCarouselItem DEFAULT_INSTANCE;
    public static final int END_FIELD_NUMBER = 6;
    public static final int ISEXPLICIT_FIELD_NUMBER = 7;
    public static final int MOGEF19_FIELD_NUMBER = 9;
    private static volatile r2n0 PARSER = null;
    public static final int START_FIELD_NUMBER = 5;
    public static final int SUBTITLE_FIELD_NUMBER = 2;
    public static final int THUMBNAILURI_FIELD_NUMBER = 3;
    public static final int TITLE_FIELD_NUMBER = 1;
    public static final int VIDEOID_FIELD_NUMBER = 4;
    public static final int VIDEOSPOTIFYURI_FIELD_NUMBER = 8;
    private int end_;
    private boolean isExplicit_;
    private boolean mogef19_;
    private int start_;
    private String title_ = "";
    private String subtitle_ = "";
    private String thumbnailUri_ = "";
    private String videoId_ = "";
    private String videoSpotifyUri_ = "";

    static {
        VideoCarouselItem videoCarouselItem = new VideoCarouselItem();
        DEFAULT_INSTANCE = videoCarouselItem;
        AbstractC0269h.registerDefaultInstance(VideoCarouselItem.class, videoCarouselItem);
    }

    private VideoCarouselItem() {
    }

    /* JADX INFO: renamed from: n */
    public static VideoCarouselItem m20936n() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\t\u0000\u0000\u0001\t\t\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004Ȉ\u0005\u0004\u0006\u0004\u0007\u0007\bȈ\t\u0007", new Object[]{"title_", "subtitle_", "thumbnailUri_", "videoId_", "start_", "end_", "isExplicit_", "videoSpotifyUri_", "mogef19_"});
        }
        if (iOrdinal == 3) {
            return new VideoCarouselItem();
        }
        if (iOrdinal == 4) {
            return new chb1(DEFAULT_INSTANCE, 10);
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
        synchronized (VideoCarouselItem.class) {
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

    public final boolean getIsExplicit() {
        return this.isExplicit_;
    }

    public final String getSubtitle() {
        return this.subtitle_;
    }

    public final String getTitle() {
        return this.title_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final int m20937o() {
        return this.end_;
    }

    /* JADX INFO: renamed from: p */
    public final boolean m20938p() {
        return this.mogef19_;
    }

    /* JADX INFO: renamed from: q */
    public final int m20939q() {
        return this.start_;
    }

    /* JADX INFO: renamed from: r */
    public final String m20940r() {
        return this.thumbnailUri_;
    }

    /* JADX INFO: renamed from: s */
    public final String m20941s() {
        return this.videoId_;
    }

    /* JADX INFO: renamed from: t */
    public final String m20942t() {
        return this.videoSpotifyUri_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
