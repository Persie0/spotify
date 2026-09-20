package com.spotify.personalizedepisodes.contentservice.p124v1;

import com.google.protobuf.AbstractC0269h;
import p204p.ae50;
import p204p.nwo0;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.v9k;
import p204p.z110;

/* JADX INFO: loaded from: classes9.dex */
public final class CreateGenerationResponse extends AbstractC0269h implements sre0 {
    private static final CreateGenerationResponse DEFAULT_INSTANCE;
    public static final int DEFAULT_NEW_SHOW_ARTWORK_FIELD_NUMBER = 8;
    public static final int GENERATION_ID_FIELD_NUMBER = 1;
    private static volatile r2n0 PARSER = null;
    public static final int PREVIEW_FIELD_NUMBER = 2;
    public static final int RECOMMENDED_PLAYBACK_CONTROL_FIELD_NUMBER = 9;
    public static final int RECOMMENDED_SCHEDULE_FIELD_NUMBER = 5;
    public static final int RECOMMENDED_TOOLS_FIELD_NUMBER = 7;
    public static final int SCHEDULE_LOCKED_FIELD_NUMBER = 6;
    public static final int SHOWS_FIELD_NUMBER = 3;
    public static final int VOICE_FIELD_NUMBER = 4;
    private int bitField0_;
    private Preview preview_;
    private int recommendedPlaybackControl_;
    private Schedule recommendedSchedule_;
    private boolean scheduleLocked_;
    private Voice voice_;
    private String generationId_ = "";
    private ae50 shows_ = AbstractC0269h.emptyProtobufList();
    private ae50 recommendedTools_ = AbstractC0269h.emptyProtobufList();
    private String defaultNewShowArtwork_ = "";

    static {
        CreateGenerationResponse createGenerationResponse = new CreateGenerationResponse();
        DEFAULT_INSTANCE = createGenerationResponse;
        AbstractC0269h.registerDefaultInstance(CreateGenerationResponse.class, createGenerationResponse);
    }

    private CreateGenerationResponse() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\t\u0000\u0001\u0001\t\t\u0000\u0002\u0000\u0001Ȉ\u0002ဉ\u0000\u0003\u001b\u0004ဉ\u0001\u0005ဉ\u0002\u0006\u0007\u0007\u001b\bȈ\t\f", new Object[]{"bitField0_", "generationId_", "preview_", "shows_", ShowItem.class, "voice_", "recommendedSchedule_", "scheduleLocked_", "recommendedTools_", RecommendedTool.class, "defaultNewShowArtwork_", "recommendedPlaybackControl_"});
        }
        if (iOrdinal == 3) {
            return new CreateGenerationResponse();
        }
        if (iOrdinal == 4) {
            return new v9k(DEFAULT_INSTANCE, 25);
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
        synchronized (CreateGenerationResponse.class) {
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
    public final String m17382n() {
        return this.defaultNewShowArtwork_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final String m17383o() {
        return this.generationId_;
    }

    /* JADX INFO: renamed from: p */
    public final Preview m17384p() {
        Preview preview = this.preview_;
        return preview == null ? Preview.m17463o() : preview;
    }

    /* JADX INFO: renamed from: q */
    public final nwo0 m17385q() {
        nwo0 nwo0VarM65801a = nwo0.m65801a(this.recommendedPlaybackControl_);
        return nwo0VarM65801a == null ? nwo0.UNRECOGNIZED : nwo0VarM65801a;
    }

    /* JADX INFO: renamed from: r */
    public final Schedule m17386r() {
        Schedule schedule = this.recommendedSchedule_;
        return schedule == null ? Schedule.m17487q() : schedule;
    }

    /* JADX INFO: renamed from: s */
    public final ae50 m17387s() {
        return this.recommendedTools_;
    }

    /* JADX INFO: renamed from: t */
    public final boolean m17388t() {
        return this.scheduleLocked_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }

    /* JADX INFO: renamed from: u */
    public final ae50 m17389u() {
        return this.shows_;
    }

    /* JADX INFO: renamed from: v */
    public final Voice m17390v() {
        Voice voice = this.voice_;
        return voice == null ? Voice.m17548n() : voice;
    }

    /* JADX INFO: renamed from: w */
    public final boolean m17391w() {
        return (this.bitField0_ & 4) != 0;
    }
}
