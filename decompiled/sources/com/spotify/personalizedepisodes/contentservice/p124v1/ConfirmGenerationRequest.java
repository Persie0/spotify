package com.spotify.personalizedepisodes.contentservice.p124v1;

import com.google.protobuf.AbstractC0269h;
import p204p.nwo0;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.wni;
import p204p.z110;

/* JADX INFO: loaded from: classes9.dex */
public final class ConfirmGenerationRequest extends AbstractC0269h implements sre0 {
    public static final int CREATE_SHOW_FIELD_NUMBER = 8;
    private static final ConfirmGenerationRequest DEFAULT_INSTANCE;
    public static final int GENERATION_ID_FIELD_NUMBER = 1;
    public static final int LOCATION_FIELD_NUMBER = 9;
    private static volatile r2n0 PARSER = null;
    public static final int PLAYBACK_CONTROL_FIELD_NUMBER = 7;
    public static final int SCHEDULE_FIELD_NUMBER = 2;
    public static final int SCHEDULE_ID_FIELD_NUMBER = 4;
    public static final int SHOW_ITEM_FIELD_NUMBER = 3;
    public static final int TOOL_SELECTION_FIELD_NUMBER = 6;
    public static final int VOICE_ID_FIELD_NUMBER = 5;
    private int bitField0_;
    private boolean createShow_;
    private int playbackControl_;
    private Schedule schedule_;
    private ShowItem showItem_;
    private ToolSelection toolSelection_;
    private String generationId_ = "";
    private String scheduleId_ = "";
    private String voiceId_ = "";
    private String location_ = "";

    static {
        ConfirmGenerationRequest confirmGenerationRequest = new ConfirmGenerationRequest();
        DEFAULT_INSTANCE = confirmGenerationRequest;
        AbstractC0269h.registerDefaultInstance(ConfirmGenerationRequest.class, confirmGenerationRequest);
    }

    private ConfirmGenerationRequest() {
    }

    /* JADX INFO: renamed from: n */
    public static void m17362n(ConfirmGenerationRequest confirmGenerationRequest) {
        confirmGenerationRequest.bitField0_ |= 64;
        confirmGenerationRequest.createShow_ = true;
    }

    /* JADX INFO: renamed from: o */
    public static void m17363o(ConfirmGenerationRequest confirmGenerationRequest, String str) {
        confirmGenerationRequest.getClass();
        str.getClass();
        confirmGenerationRequest.generationId_ = str;
    }

    /* JADX INFO: renamed from: p */
    public static void m17364p(ConfirmGenerationRequest confirmGenerationRequest, String str) {
        confirmGenerationRequest.getClass();
        str.getClass();
        confirmGenerationRequest.bitField0_ |= 128;
        confirmGenerationRequest.location_ = str;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static void m17365q(ConfirmGenerationRequest confirmGenerationRequest, nwo0 nwo0Var) {
        confirmGenerationRequest.getClass();
        confirmGenerationRequest.playbackControl_ = nwo0Var.getNumber();
        confirmGenerationRequest.bitField0_ |= 32;
    }

    /* JADX INFO: renamed from: r */
    public static void m17366r(ConfirmGenerationRequest confirmGenerationRequest, Schedule schedule) {
        confirmGenerationRequest.getClass();
        confirmGenerationRequest.schedule_ = schedule;
        confirmGenerationRequest.bitField0_ |= 1;
    }

    /* JADX INFO: renamed from: s */
    public static void m17367s(ConfirmGenerationRequest confirmGenerationRequest, ShowItem showItem) {
        confirmGenerationRequest.getClass();
        showItem.getClass();
        confirmGenerationRequest.showItem_ = showItem;
        confirmGenerationRequest.bitField0_ |= 2;
    }

    /* JADX INFO: renamed from: t */
    public static void m17368t(ConfirmGenerationRequest confirmGenerationRequest, ToolSelection toolSelection) {
        confirmGenerationRequest.getClass();
        toolSelection.getClass();
        confirmGenerationRequest.toolSelection_ = toolSelection;
        confirmGenerationRequest.bitField0_ |= 16;
    }

    /* JADX INFO: renamed from: u */
    public static void m17369u(ConfirmGenerationRequest confirmGenerationRequest, String str) {
        confirmGenerationRequest.getClass();
        str.getClass();
        confirmGenerationRequest.bitField0_ |= 8;
        confirmGenerationRequest.voiceId_ = str;
    }

    /* JADX INFO: renamed from: v */
    public static wni m17370v() {
        return (wni) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\t\u0000\u0001\u0001\t\t\u0000\u0000\u0000\u0001Ȉ\u0002ဉ\u0000\u0003ဉ\u0001\u0004ለ\u0002\u0005ለ\u0003\u0006ဉ\u0004\u0007ဌ\u0005\bဇ\u0006\tለ\u0007", new Object[]{"bitField0_", "generationId_", "schedule_", "showItem_", "scheduleId_", "voiceId_", "toolSelection_", "playbackControl_", "createShow_", "location_"});
        }
        if (iOrdinal == 3) {
            return new ConfirmGenerationRequest();
        }
        if (iOrdinal == 4) {
            return new wni(DEFAULT_INSTANCE);
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
        synchronized (ConfirmGenerationRequest.class) {
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

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
