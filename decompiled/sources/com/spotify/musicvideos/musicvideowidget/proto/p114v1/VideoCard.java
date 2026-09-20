package com.spotify.musicvideos.musicvideowidget.proto.p114v1;

import com.google.protobuf.AbstractC0269h;
import com.google.protobuf.Duration;
import com.google.protobuf.Timestamp;
import p204p.chb1;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes8.dex */
public final class VideoCard extends AbstractC0269h implements sre0 {
    public static final int ARTIST_URI_FIELD_NUMBER = 14;
    private static final VideoCard DEFAULT_INSTANCE;
    public static final int END_FIELD_NUMBER = 10;
    public static final int IS_EXPLICIT_FIELD_NUMBER = 3;
    public static final int MOGEF19_FIELD_NUMBER = 15;
    public static final int NAVIGATE_URI_FIELD_NUMBER = 16;
    private static volatile r2n0 PARSER = null;
    public static final int RELEASE_DATE_FIELD_NUMBER = 13;
    public static final int START_FIELD_NUMBER = 9;
    public static final int SUBTITLE_FIELD_NUMBER = 2;
    public static final int THUMBNAIL_URI_FIELD_NUMBER = 8;
    public static final int TITLE_FIELD_NUMBER = 1;
    public static final int VIDEO_GID_FIELD_NUMBER = 5;
    public static final int VIDEO_TRACK_URI_FIELD_NUMBER = 7;
    private int bitField0_;
    private Duration end_;
    private boolean isExplicit_;
    private boolean mogef19_;
    private Timestamp releaseDate_;
    private Duration start_;
    private String title_ = "";
    private String subtitle_ = "";
    private String videoGid_ = "";
    private String videoTrackUri_ = "";
    private String thumbnailUri_ = "";
    private String artistUri_ = "";
    private String navigateUri_ = "";

    static {
        VideoCard videoCard = new VideoCard();
        DEFAULT_INSTANCE = videoCard;
        AbstractC0269h.registerDefaultInstance(VideoCard.class, videoCard);
    }

    private VideoCard() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\f\u0000\u0001\u0001\u0010\f\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003\u0007\u0005Ȉ\u0007Ȉ\bȈ\tဉ\u0000\nဉ\u0001\rဉ\u0002\u000eȈ\u000f\u0007\u0010Ȉ", new Object[]{"bitField0_", "title_", "subtitle_", "isExplicit_", "videoGid_", "videoTrackUri_", "thumbnailUri_", "start_", "end_", "releaseDate_", "artistUri_", "mogef19_", "navigateUri_"});
        }
        if (iOrdinal == 3) {
            return new VideoCard();
        }
        if (iOrdinal == 4) {
            return new chb1(DEFAULT_INSTANCE, 7);
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
        synchronized (VideoCard.class) {
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
    public final String m15962n() {
        return this.videoTrackUri_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
