package com.spotify.extendedmetadata.extensions.concertcampaignimpl.proto;

import com.google.protobuf.AbstractC0269h;
import com.google.protobuf.Timestamp;
import p204p.ae50;
import p204p.djb;
import p204p.ore0;
import p204p.pof;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes6.dex */
public final class ConcertCampaign extends AbstractC0269h implements sre0 {
    public static final int ANNOUNCE_DATE_FIELD_NUMBER = 8;
    public static final int CAMPAIGN_URI_FIELD_NUMBER = 1;
    private static final ConcertCampaign DEFAULT_INSTANCE;
    public static final int DISPLAY_NAME_FIELD_NUMBER = 3;
    public static final int FEATURED_PERFORMERS_FIELD_NUMBER = 7;
    public static final int NAME_FIELD_NUMBER = 2;
    private static volatile r2n0 PARSER = null;
    public static final int PERFORMERS_FIELD_NUMBER = 5;
    public static final int ROUTINGS_FIELD_NUMBER = 6;
    public static final int STATE_FIELD_NUMBER = 4;
    private Timestamp announceDate_;
    private int bitField0_;
    private int state_;
    private String campaignUri_ = "";
    private String name_ = "";
    private String displayName_ = "";
    private ae50 performers_ = AbstractC0269h.emptyProtobufList();
    private ae50 routings_ = AbstractC0269h.emptyProtobufList();
    private String featuredPerformers_ = "";

    static {
        ConcertCampaign concertCampaign = new ConcertCampaign();
        DEFAULT_INSTANCE = concertCampaign;
        AbstractC0269h.registerDefaultInstance(ConcertCampaign.class, concertCampaign);
    }

    private ConcertCampaign() {
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: u */
    public static ConcertCampaign m9976u(byte[] bArr) {
        return (ConcertCampaign) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\b\u0000\u0001\u0001\b\b\u0000\u0002\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004\f\u0005\u001b\u0006\u001b\u0007Ȉ\bဉ\u0000", new Object[]{"bitField0_", "campaignUri_", "name_", "displayName_", "state_", "performers_", CampaignPerformer.class, "routings_", CampaignRouting.class, "featuredPerformers_", "announceDate_"});
        }
        if (iOrdinal == 3) {
            return new ConcertCampaign();
        }
        if (iOrdinal == 4) {
            return new pof(DEFAULT_INSTANCE, 27);
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
        synchronized (ConcertCampaign.class) {
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

    public final String getDisplayName() {
        return this.displayName_;
    }

    public final String getName() {
        return this.name_;
    }

    /* JADX INFO: renamed from: n */
    public final Timestamp m9977n() {
        Timestamp timestamp = this.announceDate_;
        return timestamp == null ? Timestamp.m1965q() : timestamp;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final String m9978o() {
        return this.campaignUri_;
    }

    /* JADX INFO: renamed from: p */
    public final String m9979p() {
        return this.featuredPerformers_;
    }

    /* JADX INFO: renamed from: q */
    public final ae50 m9980q() {
        return this.performers_;
    }

    /* JADX INFO: renamed from: r */
    public final ae50 m9981r() {
        return this.routings_;
    }

    /* JADX INFO: renamed from: s */
    public final djb m9982s() {
        djb djbVar;
        int i = this.state_;
        if (i == 0) {
            djbVar = djb.CAMPAIGN_STATE_UNSPECIFIED;
        } else if (i == 1) {
            djbVar = djb.CAMPAIGN_STATE_ACTIVE;
        } else if (i == 2) {
            djbVar = djb.CAMPAIGN_STATE_PAUSED;
        } else if (i != 3) {
            djbVar = i != 4 ? null : djb.CAMPAIGN_STATE_COMPLETED;
        } else {
            djbVar = djb.CAMPAIGN_STATE_CANCELLED;
        }
        return djbVar == null ? djb.UNRECOGNIZED : djbVar;
    }

    /* JADX INFO: renamed from: t */
    public final boolean m9983t() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
