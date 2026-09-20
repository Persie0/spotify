package com.spotify.extendedmetadata.extensions.concertcampaignuserstateimpl.proto;

import com.google.protobuf.AbstractC0269h;
import com.google.protobuf.Timestamp;
import p204p.ore0;
import p204p.osa;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes6.dex */
public final class CampaignUserStateFCFS extends AbstractC0269h implements sre0 {
    public static final int ALLOCATED_COUNT_FIELD_NUMBER = 1;
    private static final CampaignUserStateFCFS DEFAULT_INSTANCE;
    public static final int FEW_LEFT_FIELD_NUMBER = 6;
    private static volatile r2n0 PARSER = null;
    public static final int SALE_END_FIELD_NUMBER = 4;
    public static final int SALE_START_FIELD_NUMBER = 3;
    private int allocatedCount_;
    private int bitField0_;
    private boolean fewLeft_;
    private Timestamp saleEnd_;
    private Timestamp saleStart_;

    static {
        CampaignUserStateFCFS campaignUserStateFCFS = new CampaignUserStateFCFS();
        DEFAULT_INSTANCE = campaignUserStateFCFS;
        AbstractC0269h.registerDefaultInstance(CampaignUserStateFCFS.class, campaignUserStateFCFS);
    }

    private CampaignUserStateFCFS() {
    }

    /* JADX INFO: renamed from: o */
    public static CampaignUserStateFCFS m10014o() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0006\u0004\u0000\u0000\u0000\u0001\u0004\u0003ဉ\u0000\u0004ဉ\u0001\u0006\u0007", new Object[]{"bitField0_", "allocatedCount_", "saleStart_", "saleEnd_", "fewLeft_"});
        }
        if (iOrdinal == 3) {
            return new CampaignUserStateFCFS();
        }
        if (iOrdinal == 4) {
            return new osa(DEFAULT_INSTANCE, 22);
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
        synchronized (CampaignUserStateFCFS.class) {
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
    public final int m10015n() {
        return this.allocatedCount_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: p */
    public final boolean m10016p() {
        return this.fewLeft_;
    }

    /* JADX INFO: renamed from: q */
    public final Timestamp m10017q() {
        Timestamp timestamp = this.saleEnd_;
        return timestamp == null ? Timestamp.m1965q() : timestamp;
    }

    /* JADX INFO: renamed from: r */
    public final Timestamp m10018r() {
        Timestamp timestamp = this.saleStart_;
        return timestamp == null ? Timestamp.m1965q() : timestamp;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
