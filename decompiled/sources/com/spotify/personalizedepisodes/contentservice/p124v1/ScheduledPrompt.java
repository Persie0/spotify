package com.spotify.personalizedepisodes.contentservice.p124v1;

import com.google.protobuf.AbstractC0269h;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.six0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes9.dex */
public final class ScheduledPrompt extends AbstractC0269h implements sre0 {
    private static final ScheduledPrompt DEFAULT_INSTANCE;
    public static final int HAS_DISCONNECTED_CONNECTORS_FIELD_NUMBER = 8;
    public static final int ID_FIELD_NUMBER = 1;
    public static final int IS_ENABLED_FIELD_NUMBER = 6;
    public static final int LAST_RUN_FIELD_NUMBER = 4;
    public static final int LOCATION_FIELD_NUMBER = 10;
    private static volatile r2n0 PARSER = null;
    public static final int PROMPT_FIELD_NUMBER = 3;
    public static final int SCHEDULE_FIELD_NUMBER = 2;
    public static final int TOOL_SELECTION_FIELD_NUMBER = 9;
    public static final int VOICE_FIELD_NUMBER = 7;
    public static final int VOICE_ID_FIELD_NUMBER = 5;
    private int bitField0_;
    private boolean hasDisconnectedConnectors_;
    private boolean isEnabled_;
    private PromptDetails prompt_;
    private Schedule schedule_;
    private ToolSelection toolSelection_;
    private Voice voice_;
    private String id_ = "";
    private String lastRun_ = "";
    private String voiceId_ = "";
    private String location_ = "";

    static {
        ScheduledPrompt scheduledPrompt = new ScheduledPrompt();
        DEFAULT_INSTANCE = scheduledPrompt;
        AbstractC0269h.registerDefaultInstance(ScheduledPrompt.class, scheduledPrompt);
    }

    private ScheduledPrompt() {
    }

    /* JADX INFO: renamed from: n */
    public static ScheduledPrompt m17491n() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\n\u0000\u0001\u0001\n\n\u0000\u0000\u0000\u0001Ȉ\u0002ဉ\u0000\u0003ဉ\u0001\u0004Ȉ\u0005Ȉ\u0006\u0007\u0007ဉ\u0002\b\u0007\tဉ\u0003\nለ\u0004", new Object[]{"bitField0_", "id_", "schedule_", "prompt_", "lastRun_", "voiceId_", "isEnabled_", "voice_", "hasDisconnectedConnectors_", "toolSelection_", "location_"});
        }
        if (iOrdinal == 3) {
            return new ScheduledPrompt();
        }
        if (iOrdinal == 4) {
            return new six0(DEFAULT_INSTANCE, 15);
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
        synchronized (ScheduledPrompt.class) {
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

    public final String getId() {
        return this.id_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final boolean m17492o() {
        return this.hasDisconnectedConnectors_;
    }

    /* JADX INFO: renamed from: p */
    public final boolean m17493p() {
        return this.isEnabled_;
    }

    /* JADX INFO: renamed from: q */
    public final String m17494q() {
        return this.lastRun_;
    }

    /* JADX INFO: renamed from: r */
    public final String m17495r() {
        return this.location_;
    }

    /* JADX INFO: renamed from: s */
    public final PromptDetails m17496s() {
        PromptDetails promptDetails = this.prompt_;
        return promptDetails == null ? PromptDetails.m17469o() : promptDetails;
    }

    /* JADX INFO: renamed from: t */
    public final Schedule m17497t() {
        Schedule schedule = this.schedule_;
        return schedule == null ? Schedule.m17487q() : schedule;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }

    /* JADX INFO: renamed from: u */
    public final ToolSelection m17498u() {
        ToolSelection toolSelection = this.toolSelection_;
        return toolSelection == null ? ToolSelection.m17526o() : toolSelection;
    }

    /* JADX INFO: renamed from: v */
    public final Voice m17499v() {
        Voice voice = this.voice_;
        return voice == null ? Voice.m17548n() : voice;
    }

    /* JADX INFO: renamed from: w */
    public final boolean m17500w() {
        return (this.bitField0_ & 4) != 0;
    }
}
