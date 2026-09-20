package com.spotify.culturalmoments.stories.p056v1;

import com.google.protobuf.AbstractC0269h;
import p204p.az8;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes6.dex */
public final class BaseStory extends AbstractC0269h implements sre0 {
    public static final int ACCESSIBILITY_TITLE_FIELD_NUMBER = 3;
    public static final int AUDIO_TRACK_URL_FIELD_NUMBER = 4;
    private static final BaseStory DEFAULT_INSTANCE;
    public static final int DURATION_MILLIS_FIELD_NUMBER = 2;
    public static final int LOGGING_ID_FIELD_NUMBER = 5;
    private static volatile r2n0 PARSER = null;
    public static final int POSITION_FIELD_NUMBER = 1;
    private long durationMillis_;
    private int position_;
    private String accessibilityTitle_ = "";
    private String audioTrackUrl_ = "";
    private String loggingId_ = "";

    static {
        BaseStory baseStory = new BaseStory();
        DEFAULT_INSTANCE = baseStory;
        AbstractC0269h.registerDefaultInstance(BaseStory.class, baseStory);
    }

    private BaseStory() {
    }

    /* JADX INFO: renamed from: p */
    public static BaseStory m9056p() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001\u0004\u0002\u0002\u0003Ȉ\u0004Ȉ\u0005Ȉ", new Object[]{"position_", "durationMillis_", "accessibilityTitle_", "audioTrackUrl_", "loggingId_"});
        }
        if (iOrdinal == 3) {
            return new BaseStory();
        }
        if (iOrdinal == 4) {
            return new az8(DEFAULT_INSTANCE, 5);
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
        synchronized (BaseStory.class) {
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
    public final String m9057n() {
        return this.accessibilityTitle_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final String m9058o() {
        return this.audioTrackUrl_;
    }

    /* JADX INFO: renamed from: q */
    public final long m9059q() {
        return this.durationMillis_;
    }

    /* JADX INFO: renamed from: r */
    public final String m9060r() {
        return this.loggingId_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
