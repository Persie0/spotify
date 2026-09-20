package com.spotify.personalizedepisodes.contentservice.p124v1;

import com.google.protobuf.AbstractC0269h;
import p204p.ae50;
import p204p.nwo0;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.x2q0;
import p204p.z110;

/* JADX INFO: loaded from: classes9.dex */
public final class Preset extends AbstractC0269h implements sre0 {
    public static final int ARTWORK_SUBCATEGORY_FIELD_NUMBER = 14;
    public static final int ARTWORK_URL_FIELD_NUMBER = 5;
    public static final int AUDIO_PREVIEW_URL_FIELD_NUMBER = 13;
    private static final Preset DEFAULT_INSTANCE;
    public static final int DESCRIPTION_FIELD_NUMBER = 4;
    public static final int ESTIMATED_LENGTH_FIELD_NUMBER = 6;
    public static final int ID_FIELD_NUMBER = 1;
    private static volatile r2n0 PARSER = null;
    public static final int PLAYBACK_CONTROL_FIELD_NUMBER = 10;
    public static final int PROMPT_FIELD_NUMBER = 12;
    public static final int SCHEDULE_FIELD_NUMBER = 7;
    public static final int STEPS_FIELD_NUMBER = 9;
    public static final int SYNOPSIS_FIELD_NUMBER = 3;
    public static final int TITLE_FIELD_NUMBER = 2;
    public static final int VOICE_FIELD_NUMBER = 8;
    private int bitField0_;
    private int playbackControl_;
    private Schedule schedule_;
    private Voice voice_;
    private String id_ = "";
    private String title_ = "";
    private String synopsis_ = "";
    private String description_ = "";
    private String artworkUrl_ = "";
    private String estimatedLength_ = "";
    private ae50 steps_ = AbstractC0269h.emptyProtobufList();
    private String prompt_ = "";
    private String audioPreviewUrl_ = "";
    private String artworkSubcategory_ = "";

    static {
        Preset preset = new Preset();
        DEFAULT_INSTANCE = preset;
        AbstractC0269h.registerDefaultInstance(Preset.class, preset);
    }

    private Preset() {
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static Preset m17446q() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\r\u0000\u0001\u0001\u000e\r\u0000\u0001\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004Ȉ\u0005Ȉ\u0006Ȉ\u0007ဉ\u0000\bဉ\u0001\t\u001b\n\f\fȈ\rȈ\u000eȈ", new Object[]{"bitField0_", "id_", "title_", "synopsis_", "description_", "artworkUrl_", "estimatedLength_", "schedule_", "voice_", "steps_", PresetStep.class, "playbackControl_", "prompt_", "audioPreviewUrl_", "artworkSubcategory_"});
        }
        if (iOrdinal == 3) {
            return new Preset();
        }
        if (iOrdinal == 4) {
            return new x2q0(DEFAULT_INSTANCE, 26);
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
        synchronized (Preset.class) {
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

    public final String getId() {
        return this.id_;
    }

    public final String getPrompt() {
        return this.prompt_;
    }

    public final String getTitle() {
        return this.title_;
    }

    /* JADX INFO: renamed from: n */
    public final String m17447n() {
        return this.artworkSubcategory_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final String m17448o() {
        return this.artworkUrl_;
    }

    /* JADX INFO: renamed from: p */
    public final String m17449p() {
        return this.audioPreviewUrl_;
    }

    /* JADX INFO: renamed from: r */
    public final String m17450r() {
        return this.estimatedLength_;
    }

    /* JADX INFO: renamed from: s */
    public final nwo0 m17451s() {
        nwo0 nwo0VarM65801a = nwo0.m65801a(this.playbackControl_);
        return nwo0VarM65801a == null ? nwo0.UNRECOGNIZED : nwo0VarM65801a;
    }

    /* JADX INFO: renamed from: t */
    public final Schedule m17452t() {
        Schedule schedule = this.schedule_;
        return schedule == null ? Schedule.m17487q() : schedule;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }

    /* JADX INFO: renamed from: u */
    public final ae50 m17453u() {
        return this.steps_;
    }

    /* JADX INFO: renamed from: v */
    public final String m17454v() {
        return this.synopsis_;
    }

    /* JADX INFO: renamed from: w */
    public final Voice m17455w() {
        Voice voice = this.voice_;
        return voice == null ? Voice.m17548n() : voice;
    }

    /* JADX INFO: renamed from: x */
    public final boolean m17456x() {
        return (this.bitField0_ & 1) != 0;
    }

    /* JADX INFO: renamed from: y */
    public final boolean m17457y() {
        return (this.bitField0_ & 2) != 0;
    }
}
