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
public final class VotingAvailable extends AbstractC0269h implements sre0 {
    public static final int BUTTON_REDIRECT_URI_FIELD_NUMBER = 4;
    private static final VotingAvailable DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER = null;
    public static final int PREMIUM_UPSELL_FIELD_NUMBER = 6;
    public static final int VOTES_LEFT_FIELD_NUMBER = 3;
    public static final int VOTING_ENDS_HEADER_FIELD_NUMBER = 5;
    public static final int VOTING_ENDS_UTC_FIELD_NUMBER = 2;
    public static final int VOTING_SECTION_TEXT_FIELD_NUMBER = 1;
    private int bitField0_;
    private PremiumUpsell premiumUpsell_;
    private int votesLeft_;
    private Timestamp votingEndsUtc_;
    private VotingSectionText votingSectionText_;
    private String buttonRedirectUri_ = "";
    private String votingEndsHeader_ = "";

    static {
        VotingAvailable votingAvailable = new VotingAvailable();
        DEFAULT_INSTANCE = votingAvailable;
        AbstractC0269h.registerDefaultInstance(VotingAvailable.class, votingAvailable);
    }

    private VotingAvailable() {
    }

    /* JADX INFO: renamed from: o */
    public static VotingAvailable m22418o() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003\u0004\u0004Ȉ\u0005Ȉ\u0006ဉ\u0002", new Object[]{"bitField0_", "votingSectionText_", "votingEndsUtc_", "votesLeft_", "buttonRedirectUri_", "votingEndsHeader_", "premiumUpsell_"});
        }
        if (iOrdinal == 3) {
            return new VotingAvailable();
        }
        if (iOrdinal == 4) {
            return new eyc1(DEFAULT_INSTANCE, 1);
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
        synchronized (VotingAvailable.class) {
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
    public final String m22419n() {
        return this.buttonRedirectUri_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: p */
    public final PremiumUpsell m22420p() {
        PremiumUpsell premiumUpsell = this.premiumUpsell_;
        return premiumUpsell == null ? PremiumUpsell.m22396n() : premiumUpsell;
    }

    /* JADX INFO: renamed from: q */
    public final String m22421q() {
        return this.votingEndsHeader_;
    }

    /* JADX INFO: renamed from: r */
    public final Timestamp m22422r() {
        Timestamp timestamp = this.votingEndsUtc_;
        return timestamp == null ? Timestamp.m1965q() : timestamp;
    }

    /* JADX INFO: renamed from: s */
    public final VotingSectionText m22423s() {
        VotingSectionText votingSectionText = this.votingSectionText_;
        return votingSectionText == null ? VotingSectionText.m22447o() : votingSectionText;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
