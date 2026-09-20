package com.spotify.musicquizservice.p113v1;

import com.google.protobuf.AbstractC0269h;
import p204p.d2i0;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes8.dex */
public final class MusicIdentifierQuestion extends AbstractC0269h implements sre0 {
    public static final int AUDIO_DURATION_MS_FIELD_NUMBER = 3;
    public static final int AUDIO_PREVIEW_URL_FIELD_NUMBER = 1;
    public static final int AUDIO_START_OFFSET_MS_FIELD_NUMBER = 2;
    private static final MusicIdentifierQuestion DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER = null;
    public static final int QUESTION_TEXT_FIELD_NUMBER = 4;
    public static final int TRACK_URI_FIELD_NUMBER = 5;
    private int audioDurationMs_;
    private int audioStartOffsetMs_;
    private String audioPreviewUrl_ = "";
    private String questionText_ = "";
    private String trackUri_ = "";

    static {
        MusicIdentifierQuestion musicIdentifierQuestion = new MusicIdentifierQuestion();
        DEFAULT_INSTANCE = musicIdentifierQuestion;
        AbstractC0269h.registerDefaultInstance(MusicIdentifierQuestion.class, musicIdentifierQuestion);
    }

    private MusicIdentifierQuestion() {
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static MusicIdentifierQuestion m15868q() {
        return DEFAULT_INSTANCE;
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001Ȉ\u0002\u0004\u0003\u0004\u0004Ȉ\u0005Ȉ", new Object[]{"audioPreviewUrl_", "audioStartOffsetMs_", "audioDurationMs_", "questionText_", "trackUri_"});
        }
        if (iOrdinal == 3) {
            return new MusicIdentifierQuestion();
        }
        if (iOrdinal == 4) {
            return new d2i0(DEFAULT_INSTANCE, 12);
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
        synchronized (MusicIdentifierQuestion.class) {
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
    public final int m15869n() {
        return this.audioDurationMs_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final String m15870o() {
        return this.audioPreviewUrl_;
    }

    /* JADX INFO: renamed from: p */
    public final int m15871p() {
        return this.audioStartOffsetMs_;
    }

    /* JADX INFO: renamed from: r */
    public final String m15872r() {
        return this.questionText_;
    }

    /* JADX INFO: renamed from: s */
    public final String m15873s() {
        return this.trackUri_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
