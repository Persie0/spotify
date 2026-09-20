package com.spotify.musicquizservice.p113v1;

import com.google.protobuf.AbstractC0269h;
import p204p.gjb;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes8.dex */
public final class ChallengeCompletionMetadata extends AbstractC0269h implements sre0 {
    private static final ChallengeCompletionMetadata DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER = null;
    public static final int RUNNER_UP_DISPLAY_NAME_FIELD_NUMBER = 5;
    public static final int RUNNER_UP_PROFILE_PICTURE_FIELD_NUMBER = 4;
    public static final int RUNNER_UP_SCORE_PERCENTAGE_VALUE_FIELD_NUMBER = 6;
    public static final int RUNNER_UP_TIME_FIELD_NUMBER = 8;
    public static final int WINNER_DISPLAY_NAME_FIELD_NUMBER = 2;
    public static final int WINNER_PROFILE_PICTURE_FIELD_NUMBER = 1;
    public static final int WINNER_SCORE_PERCENTAGE_VALUE_FIELD_NUMBER = 3;
    public static final int WINNER_TIME_FIELD_NUMBER = 7;
    private String winnerProfilePicture_ = "";
    private String winnerDisplayName_ = "";
    private String winnerScorePercentageValue_ = "";
    private String runnerUpProfilePicture_ = "";
    private String runnerUpDisplayName_ = "";
    private String runnerUpScorePercentageValue_ = "";
    private String winnerTime_ = "";
    private String runnerUpTime_ = "";

    static {
        ChallengeCompletionMetadata challengeCompletionMetadata = new ChallengeCompletionMetadata();
        DEFAULT_INSTANCE = challengeCompletionMetadata;
        AbstractC0269h.registerDefaultInstance(ChallengeCompletionMetadata.class, challengeCompletionMetadata);
    }

    private ChallengeCompletionMetadata() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\b\u0000\u0000\u0001\b\b\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004Ȉ\u0005Ȉ\u0006Ȉ\u0007Ȉ\bȈ", new Object[]{"winnerProfilePicture_", "winnerDisplayName_", "winnerScorePercentageValue_", "runnerUpProfilePicture_", "runnerUpDisplayName_", "runnerUpScorePercentageValue_", "winnerTime_", "runnerUpTime_"});
        }
        if (iOrdinal == 3) {
            return new ChallengeCompletionMetadata();
        }
        if (iOrdinal == 4) {
            return new gjb(DEFAULT_INSTANCE, 26);
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
        synchronized (ChallengeCompletionMetadata.class) {
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
