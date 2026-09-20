package com.spotify.voting.proto.p180v1;

import com.google.protobuf.AbstractC0269h;
import p204p.eyc1;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes11.dex */
public final class VotingPlaylistData extends AbstractC0269h implements sre0 {
    private static final VotingPlaylistData DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER = null;
    public static final int VOTING_AVAILABLE_FIELD_NUMBER = 2;
    public static final int VOTING_AVAILABLE_VOTES_USED_FIELD_NUMBER = 3;
    public static final int VOTING_CLOSED_FIELD_NUMBER = 4;
    public static final int VOTING_INELIGIBLE_FIELD_NUMBER = 6;
    public static final int VOTING_PRE_RELEASE_FIELD_NUMBER = 1;
    public static final int VOTING_RESULTS_FIELD_NUMBER = 5;
    private int valueCase_ = 0;
    private Object value_;

    static {
        VotingPlaylistData votingPlaylistData = new VotingPlaylistData();
        DEFAULT_INSTANCE = votingPlaylistData;
        AbstractC0269h.registerDefaultInstance(VotingPlaylistData.class, votingPlaylistData);
    }

    private VotingPlaylistData() {
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: t */
    public static VotingPlaylistData m22434t(byte[] bArr) {
        return (VotingPlaylistData) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0001\u0000\u0001\u0006\u0006\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000\u0006<\u0000", new Object[]{"value_", "valueCase_", VotingPreRelease.class, VotingAvailable.class, VotingAvailableVotesUsed.class, VotingClosed.class, VotingResults.class, VotingIneligible.class});
        }
        if (iOrdinal == 3) {
            return new VotingPlaylistData();
        }
        if (iOrdinal == 4) {
            return new eyc1(DEFAULT_INSTANCE, 5);
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
        synchronized (VotingPlaylistData.class) {
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
    public final int m22435n() {
        switch (this.valueCase_) {
            case 0:
                return 7;
            case 1:
                return 1;
            case 2:
                return 2;
            case 3:
                return 3;
            case 4:
                return 4;
            case 5:
                return 5;
            case 6:
                return 6;
            default:
                return 0;
        }
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final VotingAvailable m22436o() {
        return this.valueCase_ == 2 ? (VotingAvailable) this.value_ : VotingAvailable.m22418o();
    }

    /* JADX INFO: renamed from: p */
    public final VotingAvailableVotesUsed m22437p() {
        return this.valueCase_ == 3 ? (VotingAvailableVotesUsed) this.value_ : VotingAvailableVotesUsed.m22424o();
    }

    /* JADX INFO: renamed from: q */
    public final VotingClosed m22438q() {
        return this.valueCase_ == 4 ? (VotingClosed) this.value_ : VotingClosed.m22429o();
    }

    /* JADX INFO: renamed from: r */
    public final VotingPreRelease m22439r() {
        return this.valueCase_ == 1 ? (VotingPreRelease) this.value_ : VotingPreRelease.m22441n();
    }

    /* JADX INFO: renamed from: s */
    public final VotingResults m22440s() {
        return this.valueCase_ == 5 ? (VotingResults) this.value_ : VotingResults.m22443p();
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
