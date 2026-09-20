package com.spotify.personalizedepisodes.contentservice.p124v1;

import com.google.protobuf.AbstractC0269h;
import p204p.dal;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes9.dex */
public final class CreateOrUpdateScheduleRequest extends AbstractC0269h implements sre0 {
    private static final CreateOrUpdateScheduleRequest DEFAULT_INSTANCE;
    public static final int ENTITY_URI_FIELD_NUMBER = 1;
    public static final int IS_ENABLED_FIELD_NUMBER = 6;
    public static final int LOCATION_FIELD_NUMBER = 8;
    private static volatile r2n0 PARSER = null;
    public static final int PROMPT_FIELD_NUMBER = 4;
    public static final int SCHEDULE_FIELD_NUMBER = 3;
    public static final int SCHEDULE_ID_FIELD_NUMBER = 2;
    public static final int TOOL_SELECTION_FIELD_NUMBER = 7;
    public static final int VOICE_ID_FIELD_NUMBER = 5;
    private int bitField0_;
    private boolean isEnabled_;
    private Schedule schedule_;
    private ToolSelection toolSelection_;
    private String entityUri_ = "";
    private String scheduleId_ = "";
    private String prompt_ = "";
    private String voiceId_ = "";
    private String location_ = "";

    static {
        CreateOrUpdateScheduleRequest createOrUpdateScheduleRequest = new CreateOrUpdateScheduleRequest();
        DEFAULT_INSTANCE = createOrUpdateScheduleRequest;
        AbstractC0269h.registerDefaultInstance(CreateOrUpdateScheduleRequest.class, createOrUpdateScheduleRequest);
    }

    private CreateOrUpdateScheduleRequest() {
    }

    /* JADX INFO: renamed from: n */
    public static void m17396n(CreateOrUpdateScheduleRequest createOrUpdateScheduleRequest, String str) {
        createOrUpdateScheduleRequest.getClass();
        str.getClass();
        createOrUpdateScheduleRequest.entityUri_ = str;
    }

    /* JADX INFO: renamed from: o */
    public static void m17397o(CreateOrUpdateScheduleRequest createOrUpdateScheduleRequest, boolean z) {
        createOrUpdateScheduleRequest.bitField0_ |= 8;
        createOrUpdateScheduleRequest.isEnabled_ = z;
    }

    /* JADX INFO: renamed from: p */
    public static void m17398p(CreateOrUpdateScheduleRequest createOrUpdateScheduleRequest, String str) {
        createOrUpdateScheduleRequest.getClass();
        str.getClass();
        createOrUpdateScheduleRequest.bitField0_ |= 32;
        createOrUpdateScheduleRequest.location_ = str;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static void m17399q(CreateOrUpdateScheduleRequest createOrUpdateScheduleRequest, String str) {
        createOrUpdateScheduleRequest.getClass();
        str.getClass();
        createOrUpdateScheduleRequest.bitField0_ |= 2;
        createOrUpdateScheduleRequest.prompt_ = str;
    }

    /* JADX INFO: renamed from: r */
    public static void m17400r(CreateOrUpdateScheduleRequest createOrUpdateScheduleRequest, Schedule schedule) {
        createOrUpdateScheduleRequest.getClass();
        createOrUpdateScheduleRequest.schedule_ = schedule;
        createOrUpdateScheduleRequest.bitField0_ |= 1;
    }

    /* JADX INFO: renamed from: s */
    public static void m17401s(CreateOrUpdateScheduleRequest createOrUpdateScheduleRequest, String str) {
        createOrUpdateScheduleRequest.getClass();
        str.getClass();
        createOrUpdateScheduleRequest.scheduleId_ = str;
    }

    /* JADX INFO: renamed from: t */
    public static void m17402t(CreateOrUpdateScheduleRequest createOrUpdateScheduleRequest, ToolSelection toolSelection) {
        createOrUpdateScheduleRequest.getClass();
        toolSelection.getClass();
        createOrUpdateScheduleRequest.toolSelection_ = toolSelection;
        createOrUpdateScheduleRequest.bitField0_ |= 16;
    }

    /* JADX INFO: renamed from: u */
    public static void m17403u(CreateOrUpdateScheduleRequest createOrUpdateScheduleRequest, String str) {
        createOrUpdateScheduleRequest.getClass();
        str.getClass();
        createOrUpdateScheduleRequest.bitField0_ |= 4;
        createOrUpdateScheduleRequest.voiceId_ = str;
    }

    /* JADX INFO: renamed from: v */
    public static dal m17404v() {
        return (dal) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003ဉ\u0000\u0004ለ\u0001\u0005ለ\u0002\u0006ဇ\u0003\u0007ဉ\u0004\bለ\u0005", new Object[]{"bitField0_", "entityUri_", "scheduleId_", "schedule_", "prompt_", "voiceId_", "isEnabled_", "toolSelection_", "location_"});
        }
        if (iOrdinal == 3) {
            return new CreateOrUpdateScheduleRequest();
        }
        if (iOrdinal == 4) {
            return new dal(DEFAULT_INSTANCE);
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
        synchronized (CreateOrUpdateScheduleRequest.class) {
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
