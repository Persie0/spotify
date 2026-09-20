package com.spotify.voting.proto.p180v1;

import com.google.protobuf.AbstractC0269h;
import com.google.protobuf.Timestamp;
import p204p.eyc1;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes11.dex */
public final class VotingAvailableVotesUsed extends AbstractC0269h implements sre0 {
    public static final int BUTTON_REDIRECT_URI_FIELD_NUMBER = 3;
    private static final VotingAvailableVotesUsed DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER = null;
    public static final int PREMIUM_UPSELL_FIELD_NUMBER = 4;
    public static final int VOTING_ENDS_UTC_FIELD_NUMBER = 2;
    public static final int VOTING_SECTION_TEXT_FIELD_NUMBER = 1;
    private int bitField0_;
    private String buttonRedirectUri_ = "";
    private PremiumUpsell premiumUpsell_;
    private Timestamp votingEndsUtc_;
    private VotingSectionText votingSectionText_;

    static {
        VotingAvailableVotesUsed votingAvailableVotesUsed = new VotingAvailableVotesUsed();
        DEFAULT_INSTANCE = votingAvailableVotesUsed;
        AbstractC0269h.registerDefaultInstance(VotingAvailableVotesUsed.class, votingAvailableVotesUsed);
    }

    private VotingAvailableVotesUsed() {
    }

    /* JADX INFO: renamed from: o */
    public static VotingAvailableVotesUsed m22424o() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003Ȉ\u0004ဉ\u0002", new Object[]{"bitField0_", "votingSectionText_", "votingEndsUtc_", "buttonRedirectUri_", "premiumUpsell_"});
        }
        if (iOrdinal == 3) {
            return new VotingAvailableVotesUsed();
        }
        if (iOrdinal == 4) {
            return new eyc1(DEFAULT_INSTANCE, 2);
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
        synchronized (VotingAvailableVotesUsed.class) {
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
    public final String m22425n() {
        return this.buttonRedirectUri_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: p */
    public final PremiumUpsell m22426p() {
        PremiumUpsell premiumUpsell = this.premiumUpsell_;
        return premiumUpsell == null ? PremiumUpsell.m22396n() : premiumUpsell;
    }

    /* JADX INFO: renamed from: q */
    public final VotingSectionText m22427q() {
        VotingSectionText votingSectionText = this.votingSectionText_;
        return votingSectionText == null ? VotingSectionText.m22447o() : votingSectionText;
    }

    /* JADX INFO: renamed from: r */
    public final boolean m22428r() {
        return (this.bitField0_ & 4) != 0;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
