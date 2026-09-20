package com.spotify.searchview.proto;

import com.google.protobuf.AbstractC0269h;
import com.google.protobuf.Duration;
import com.google.protobuf.Int64Value;
import com.google.protobuf.Timestamp;
import java.util.List;
import p204p.ae50;
import p204p.hr6;
import p204p.ore0;
import p204p.pre0;
import p204p.qw6;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes10.dex */
public final class AudioEpisode extends AbstractC0269h implements sre0 {
    public static final int AGE_ASSURED_FIELD_NUMBER = 16;
    private static final AudioEpisode DEFAULT_INSTANCE;
    public static final int DESCRIPTION_FIELD_NUMBER = 7;
    public static final int DURATION_FIELD_NUMBER = 3;
    public static final int EXPLICIT_FIELD_NUMBER = 2;
    public static final int MOGEF19_FIELD_NUMBER = 9;
    public static final int MUSIC_AND_TALK_FIELD_NUMBER = 6;
    private static volatile r2n0 PARSER = null;
    public static final int PUBLICATION_TIME_FIELD_NUMBER = 8;
    public static final int SHOW_NAME_FIELD_NUMBER = 1;
    public static final int SHOW_URI_FIELD_NUMBER = 2000;
    public static final int SNIPPET_FIELD_NUMBER = 10;
    public static final int STREAM_COUNT_FIELD_NUMBER = 17;
    public static final int TAGS_FIELD_NUMBER = 15;
    public static final int TYPE_FIELD_NUMBER = 18;
    public static final int VIDEO_FIELD_NUMBER = 12;
    public static final int VIDEO_FORMAT_FIELD_NUMBER = 2002;
    public static final int VIDEO_IMAGE_URI_FIELD_NUMBER = 14;
    private boolean ageAssured_;
    private int bitField0_;
    private Duration duration_;
    private boolean explicit_;
    private boolean mogef19_;
    private boolean musicAndTalk_;
    private Timestamp publicationTime_;
    private Snippet snippet_;
    private Int64Value streamCount_;
    private int type_;
    private boolean videoFormat_;
    private boolean video_;
    private String showName_ = "";
    private String description_ = "";
    private String videoImageUri_ = "";
    private ae50 tags_ = AbstractC0269h.emptyProtobufList();
    private String showUri_ = "";

    static {
        AudioEpisode audioEpisode = new AudioEpisode();
        DEFAULT_INSTANCE = audioEpisode;
        AbstractC0269h.registerDefaultInstance(AudioEpisode.class, audioEpisode);
    }

    private AudioEpisode() {
    }

    /* JADX INFO: renamed from: o */
    public static AudioEpisode m20748o() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0010\u0000\u0001\u0001ߒ\u0010\u0000\u0001\u0000\u0001Ȉ\u0002\u0007\u0003ဉ\u0000\u0006\u0007\u0007Ȉ\bဉ\u0001\t\u0007\nဉ\u0002\f\u0007\u000eȈ\u000f\u001b\u0010\u0007\u0011ဉ\u0003\u0012\fߐȈߒ\u0007", new Object[]{"bitField0_", "showName_", "explicit_", "duration_", "musicAndTalk_", "description_", "publicationTime_", "mogef19_", "snippet_", "video_", "videoImageUri_", "tags_", Tag.class, "ageAssured_", "streamCount_", "type_", "showUri_", "videoFormat_"});
        }
        if (iOrdinal == 3) {
            return new AudioEpisode();
        }
        if (iOrdinal == 4) {
            return new hr6(DEFAULT_INSTANCE, 13);
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
        synchronized (AudioEpisode.class) {
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

    public final String getDescription() {
        return this.description_;
    }

    public final Duration getDuration() {
        Duration duration = this.duration_;
        return duration == null ? Duration.m1928p() : duration;
    }

    /* JADX INFO: renamed from: n */
    public final boolean m20749n() {
        return this.ageAssured_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: p */
    public final boolean m20750p() {
        return this.explicit_;
    }

    /* JADX INFO: renamed from: q */
    public final boolean m20751q() {
        return this.mogef19_;
    }

    /* JADX INFO: renamed from: r */
    public final Timestamp m20752r() {
        Timestamp timestamp = this.publicationTime_;
        return timestamp == null ? Timestamp.m1965q() : timestamp;
    }

    /* JADX INFO: renamed from: s */
    public final String m20753s() {
        return this.showName_;
    }

    /* JADX INFO: renamed from: t */
    public final Snippet m20754t() {
        Snippet snippet = this.snippet_;
        return snippet == null ? Snippet.m20913n() : snippet;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }

    /* JADX INFO: renamed from: u */
    public final Int64Value m20755u() {
        Int64Value int64Value = this.streamCount_;
        return int64Value == null ? Int64Value.m1946n() : int64Value;
    }

    /* JADX INFO: renamed from: v */
    public final List m20756v() {
        return this.tags_;
    }

    /* JADX INFO: renamed from: w */
    public final qw6 m20757w() {
        qw6 qw6Var;
        int i = this.type_;
        if (i == 0) {
            qw6Var = qw6.AUDIO_EPISODE_TYPE_UNSPECIFIED;
        } else if (i != 1) {
            qw6Var = i != 2 ? null : qw6.AUDIO_EPISODE_TYPE_MUSIC;
        } else {
            qw6Var = qw6.AUDIO_EPISODE_TYPE_TALK;
        }
        return qw6Var == null ? qw6.UNRECOGNIZED : qw6Var;
    }

    /* JADX INFO: renamed from: x */
    public final boolean m20758x() {
        return this.video_;
    }

    /* JADX INFO: renamed from: y */
    public final String m20759y() {
        return this.videoImageUri_;
    }
}
