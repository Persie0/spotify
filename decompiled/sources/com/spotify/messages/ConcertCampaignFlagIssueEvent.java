package com.spotify.messages;

import com.google.protobuf.AbstractC0269h;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.xyh;
import p204p.z110;

/* JADX INFO: loaded from: classes8.dex */
public final class ConcertCampaignFlagIssueEvent extends AbstractC0269h implements sre0 {
    public static final int CAMPAIGN_ID_FIELD_NUMBER = 1;
    private static final ConcertCampaignFlagIssueEvent DEFAULT_INSTANCE;
    public static final int ISSUE_FIELD_NUMBER = 2;
    private static volatile r2n0 PARSER;
    private int bitField0_;
    private String campaignId_ = "";
    private String issue_ = "";

    static {
        ConcertCampaignFlagIssueEvent concertCampaignFlagIssueEvent = new ConcertCampaignFlagIssueEvent();
        DEFAULT_INSTANCE = concertCampaignFlagIssueEvent;
        AbstractC0269h.registerDefaultInstance(ConcertCampaignFlagIssueEvent.class, concertCampaignFlagIssueEvent);
    }

    private ConcertCampaignFlagIssueEvent() {
    }

    /* JADX INFO: renamed from: n */
    public static void m13759n(ConcertCampaignFlagIssueEvent concertCampaignFlagIssueEvent, String str) {
        concertCampaignFlagIssueEvent.getClass();
        concertCampaignFlagIssueEvent.bitField0_ |= 1;
        concertCampaignFlagIssueEvent.campaignId_ = str;
    }

    /* JADX INFO: renamed from: o */
    public static void m13760o(ConcertCampaignFlagIssueEvent concertCampaignFlagIssueEvent, String str) {
        concertCampaignFlagIssueEvent.getClass();
        str.getClass();
        concertCampaignFlagIssueEvent.bitField0_ |= 2;
        concertCampaignFlagIssueEvent.issue_ = str;
    }

    /* JADX INFO: renamed from: p */
    public static xyh m13761p() {
        return (xyh) DEFAULT_INSTANCE.createBuilder();
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"bitField0_", "campaignId_", "issue_"});
        }
        if (iOrdinal == 3) {
            return new ConcertCampaignFlagIssueEvent();
        }
        if (iOrdinal == 4) {
            return new xyh(DEFAULT_INSTANCE);
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
        synchronized (ConcertCampaignFlagIssueEvent.class) {
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
