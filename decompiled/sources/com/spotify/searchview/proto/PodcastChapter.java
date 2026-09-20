package com.spotify.searchview.proto;

import com.google.protobuf.AbstractC0269h;
import com.google.protobuf.Duration;
import com.google.protobuf.Timestamp;
import p204p.ore0;
import p204p.ozp0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;
import p204p.zmp0;

/* JADX INFO: loaded from: classes10.dex */
public final class PodcastChapter extends AbstractC0269h implements sre0 {
    public static final int AGE_ASSURED_FIELD_NUMBER = 6;
    private static final PodcastChapter DEFAULT_INSTANCE;
    public static final int DURATION_FIELD_NUMBER = 3;
    public static final int EXPLICIT_FIELD_NUMBER = 4;
    public static final int MOGEF19_FIELD_NUMBER = 5;
    private static volatile r2n0 PARSER = null;
    public static final int PUBLICATION_TIME_FIELD_NUMBER = 7;
    public static final int SHOW_NAME_FIELD_NUMBER = 2;
    public static final int SUBTITLE_FIELD_NUMBER = 1;
    public static final int TYPE_FIELD_NUMBER = 10;
    public static final int VIDEO_FIELD_NUMBER = 8;
    public static final int VIDEO_IMAGE_URI_FIELD_NUMBER = 9;
    private boolean ageAssured_;
    private int bitField0_;
    private Duration duration_;
    private boolean explicit_;
    private boolean mogef19_;
    private Timestamp publicationTime_;
    private int type_;
    private boolean video_;
    private String subtitle_ = "";
    private String showName_ = "";
    private String videoImageUri_ = "";

    static {
        PodcastChapter podcastChapter = new PodcastChapter();
        DEFAULT_INSTANCE = podcastChapter;
        AbstractC0269h.registerDefaultInstance(PodcastChapter.class, podcastChapter);
    }

    private PodcastChapter() {
    }

    /* JADX INFO: renamed from: o */
    public static PodcastChapter m20884o() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\n\u0000\u0001\u0001\n\n\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003ဉ\u0000\u0004\u0007\u0005\u0007\u0006\u0007\u0007ဉ\u0001\b\u0007\tȈ\n\f", new Object[]{"bitField0_", "subtitle_", "showName_", "duration_", "explicit_", "mogef19_", "ageAssured_", "publicationTime_", "video_", "videoImageUri_", "type_"});
        }
        if (iOrdinal == 3) {
            return new PodcastChapter();
        }
        if (iOrdinal == 4) {
            return new zmp0(DEFAULT_INSTANCE, 28);
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
        synchronized (PodcastChapter.class) {
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

    public final Duration getDuration() {
        Duration duration = this.duration_;
        return duration == null ? Duration.m1928p() : duration;
    }

    public final String getSubtitle() {
        return this.subtitle_;
    }

    /* JADX INFO: renamed from: n */
    public final boolean m20885n() {
        return this.ageAssured_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: p */
    public final boolean m20886p() {
        return this.explicit_;
    }

    /* JADX INFO: renamed from: q */
    public final boolean m20887q() {
        return this.mogef19_;
    }

    /* JADX INFO: renamed from: r */
    public final Timestamp m20888r() {
        Timestamp timestamp = this.publicationTime_;
        return timestamp == null ? Timestamp.m1965q() : timestamp;
    }

    /* JADX INFO: renamed from: s */
    public final String m20889s() {
        return this.showName_;
    }

    /* JADX INFO: renamed from: t */
    public final ozp0 m20890t() {
        ozp0 ozp0Var;
        int i = this.type_;
        if (i == 0) {
            ozp0Var = ozp0.CHAPTER_TYPE_UNKNOWN;
        } else if (i != 1) {
            ozp0Var = i != 2 ? null : ozp0.CHAPTER_TYPE_MUSIC;
        } else {
            ozp0Var = ozp0.CHAPTER_TYPE_TALK;
        }
        return ozp0Var == null ? ozp0.UNRECOGNIZED : ozp0Var;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }

    /* JADX INFO: renamed from: u */
    public final boolean m20891u() {
        return this.video_;
    }

    /* JADX INFO: renamed from: v */
    public final String m20892v() {
        return this.videoImageUri_;
    }
}
