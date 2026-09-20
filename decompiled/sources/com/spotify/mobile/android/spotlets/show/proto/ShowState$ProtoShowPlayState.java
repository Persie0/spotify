package com.spotify.mobile.android.spotlets.show.proto;

import com.google.protobuf.AbstractC0269h;
import com.spotify.cosmos.util.libs.proto.PlayabilityRestriction;
import p204p.g6f0;
import p204p.ore0;
import p204p.pre0;
import p204p.qr11;
import p204p.r110;
import p204p.r2n0;
import p204p.sr11;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes8.dex */
public final class ShowState$ProtoShowPlayState extends AbstractC0269h implements sre0 {
    private static final ShowState$ProtoShowPlayState DEFAULT_INSTANCE;
    public static final int IS_PLAYABLE_FIELD_NUMBER = 3;
    public static final int LABEL_FIELD_NUMBER = 5;
    public static final int LATEST_PLAYED_EPISODE_LINK_FIELD_NUMBER = 1;
    private static volatile r2n0 PARSER = null;
    public static final int PLAYABILITY_RESTRICTION_FIELD_NUMBER = 4;
    public static final int PLAYED_PERCENTAGE_FIELD_NUMBER = 6;
    public static final int PLAYED_TIME_FIELD_NUMBER = 2;
    public static final int RESUME_EPISODE_LINK_FIELD_NUMBER = 7;
    private int bitField0_;
    private boolean isPlayable_;
    private int label_;
    private int playabilityRestriction_;
    private int playedPercentage_;
    private long playedTime_;
    private String latestPlayedEpisodeLink_ = "";
    private String resumeEpisodeLink_ = "";

    static {
        ShowState$ProtoShowPlayState showState$ProtoShowPlayState = new ShowState$ProtoShowPlayState();
        DEFAULT_INSTANCE = showState$ProtoShowPlayState;
        AbstractC0269h.registerDefaultInstance(ShowState$ProtoShowPlayState.class, showState$ProtoShowPlayState);
    }

    private ShowState$ProtoShowPlayState() {
    }

    /* JADX INFO: renamed from: n */
    public static ShowState$ProtoShowPlayState m15545n() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဃ\u0001\u0003ဇ\u0002\u0004᠌\u0003\u0005᠌\u0004\u0006ဋ\u0005\u0007ဈ\u0006", new Object[]{"bitField0_", "latestPlayedEpisodeLink_", "playedTime_", "isPlayable_", "playabilityRestriction_", PlayabilityRestriction.internalGetVerifier(), "label_", g6f0.f77041n, "playedPercentage_", "resumeEpisodeLink_"});
        }
        if (iOrdinal == 3) {
            return new ShowState$ProtoShowPlayState();
        }
        if (iOrdinal == 4) {
            return new qr11(DEFAULT_INSTANCE, 6);
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
        synchronized (ShowState$ProtoShowPlayState.class) {
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

    public final boolean getIsPlayable() {
        return this.isPlayable_;
    }

    public final String getLatestPlayedEpisodeLink() {
        return this.latestPlayedEpisodeLink_;
    }

    public final int getPlayedPercentage() {
        return this.playedPercentage_;
    }

    public final long getPlayedTime() {
        return this.playedTime_;
    }

    public final String getResumeEpisodeLink() {
        return this.resumeEpisodeLink_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final sr11 m15546o() {
        sr11 sr11VarM78985a = sr11.m78985a(this.label_);
        return sr11VarM78985a == null ? sr11.UNKNOWN_LABEL : sr11VarM78985a;
    }

    /* JADX INFO: renamed from: p */
    public final PlayabilityRestriction m15547p() {
        PlayabilityRestriction playabilityRestrictionForNumber = PlayabilityRestriction.forNumber(this.playabilityRestriction_);
        return playabilityRestrictionForNumber == null ? PlayabilityRestriction.UNKNOWN : playabilityRestrictionForNumber;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
