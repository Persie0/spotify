package com.spotify.musicquizservice.p113v1;

import com.google.protobuf.AbstractC0269h;
import p204p.ne21;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes8.dex */
public final class SoloCompletionMetadata extends AbstractC0269h implements sre0 {
    public static final int CALL_TO_ACTION_FIELD_NUMBER = 4;
    private static final SoloCompletionMetadata DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER = null;
    public static final int SCORE_PERCENTAGE_VALUE_FIELD_NUMBER = 5;
    public static final int SCORE_PREFIX_FIELD_NUMBER = 2;
    public static final int SCORE_SUBTITLE_FIELD_NUMBER = 3;
    public static final int USER_DISPLAY_NAME_FIELD_NUMBER = 6;
    public static final int USER_PROFILE_PICTURE_FIELD_NUMBER = 1;
    private String userProfilePicture_ = "";
    private String scorePrefix_ = "";
    private String scoreSubtitle_ = "";
    private String callToAction_ = "";
    private String scorePercentageValue_ = "";
    private String userDisplayName_ = "";

    static {
        SoloCompletionMetadata soloCompletionMetadata = new SoloCompletionMetadata();
        DEFAULT_INSTANCE = soloCompletionMetadata;
        AbstractC0269h.registerDefaultInstance(SoloCompletionMetadata.class, soloCompletionMetadata);
    }

    private SoloCompletionMetadata() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0000\u0001\u0006\u0006\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004Ȉ\u0005Ȉ\u0006Ȉ", new Object[]{"userProfilePicture_", "scorePrefix_", "scoreSubtitle_", "callToAction_", "scorePercentageValue_", "userDisplayName_"});
        }
        if (iOrdinal == 3) {
            return new SoloCompletionMetadata();
        }
        if (iOrdinal == 4) {
            return new ne21(DEFAULT_INSTANCE, 22);
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
        synchronized (SoloCompletionMetadata.class) {
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
