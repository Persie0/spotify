package com.spotify.extendedmetadata.extensions.concertcampaignuserstateimpl.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.nuh;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes6.dex */
public final class ConcertCampaignUserState extends AbstractC0269h implements sre0 {
    public static final int CAMPAIGN_URI_FIELD_NUMBER = 7;
    private static final ConcertCampaignUserState DEFAULT_INSTANCE;
    public static final int FCFS_FIELD_NUMBER = 2;
    public static final int INELIGIBLE_FIELD_NUMBER = 5;
    private static volatile r2n0 PARSER = null;
    public static final int PURCHASED_FIELD_NUMBER = 6;
    public static final int RESERVED_FIELD_NUMBER = 1;
    public static final int WAITLISTABLE_FIELD_NUMBER = 3;
    public static final int WAITLISTED_FIELD_NUMBER = 4;
    private Object state_;
    private int stateCase_ = 0;
    private String campaignUri_ = "";

    static {
        ConcertCampaignUserState concertCampaignUserState = new ConcertCampaignUserState();
        DEFAULT_INSTANCE = concertCampaignUserState;
        AbstractC0269h.registerDefaultInstance(ConcertCampaignUserState.class, concertCampaignUserState);
    }

    private ConcertCampaignUserState() {
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: t */
    public static ConcertCampaignUserState m10031t(byte[] bArr) {
        return (ConcertCampaignUserState) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0007\u0001\u0000\u0001\u0007\u0007\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000\u0006<\u0000\u0007Ȉ", new Object[]{"state_", "stateCase_", CampaignUserStateReserved.class, CampaignUserStateFCFS.class, CampaignUserStateWaitlistable.class, CampaignUserStateWaitlisted.class, CampaignUserStateIneligible.class, CampaignUserStatePurchased.class, "campaignUri_"});
        }
        if (iOrdinal == 3) {
            return new ConcertCampaignUserState();
        }
        if (iOrdinal == 4) {
            return new nuh(DEFAULT_INSTANCE, 5);
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
        synchronized (ConcertCampaignUserState.class) {
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
    public final String m10032n() {
        return this.campaignUri_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final CampaignUserStateFCFS m10033o() {
        return this.stateCase_ == 2 ? (CampaignUserStateFCFS) this.state_ : CampaignUserStateFCFS.m10014o();
    }

    /* JADX INFO: renamed from: p */
    public final CampaignUserStateIneligible m10034p() {
        return this.stateCase_ == 5 ? (CampaignUserStateIneligible) this.state_ : CampaignUserStateIneligible.m10019n();
    }

    /* JADX INFO: renamed from: q */
    public final CampaignUserStatePurchased m10035q() {
        return this.stateCase_ == 6 ? (CampaignUserStatePurchased) this.state_ : CampaignUserStatePurchased.m10023n();
    }

    /* JADX INFO: renamed from: r */
    public final CampaignUserStateReserved m10036r() {
        return this.stateCase_ == 1 ? (CampaignUserStateReserved) this.state_ : CampaignUserStateReserved.m10026o();
    }

    /* JADX INFO: renamed from: s */
    public final int m10037s() {
        switch (this.stateCase_) {
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
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
