package com.spotify.searchview.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.ore0;
import p204p.pof;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes10.dex */
public final class ConcertCampaign extends AbstractC0269h implements sre0 {
    private static final ConcertCampaign DEFAULT_INSTANCE;
    public static final int FEATURED_PERFORMERS_FIELD_NUMBER = 4;
    public static final int IMAGE_URL_FIELD_NUMBER = 3;
    public static final int NAME_FIELD_NUMBER = 2;
    private static volatile r2n0 PARSER = null;
    public static final int UBI_REASON_FIELD_NUMBER = 6;
    public static final int URI_FIELD_NUMBER = 1;
    public static final int USER_STATE_FIELD_NUMBER = 5;
    private int bitField0_;
    private ConcertCampaignUserState userState_;
    private String uri_ = "";
    private String name_ = "";
    private String imageUrl_ = "";
    private String featuredPerformers_ = "";
    private String ubiReason_ = "";

    static {
        ConcertCampaign concertCampaign = new ConcertCampaign();
        DEFAULT_INSTANCE = concertCampaign;
        AbstractC0269h.registerDefaultInstance(ConcertCampaign.class, concertCampaign);
    }

    private ConcertCampaign() {
    }

    /* JADX INFO: renamed from: n */
    public static ConcertCampaign m20791n() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004Ȉ\u0005ဉ\u0000\u0006Ȉ", new Object[]{"bitField0_", "uri_", "name_", "imageUrl_", "featuredPerformers_", "userState_", "ubiReason_"});
        }
        if (iOrdinal == 3) {
            return new ConcertCampaign();
        }
        if (iOrdinal == 4) {
            return new pof(DEFAULT_INSTANCE, 29);
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

    public final String getImageUrl() {
        return this.imageUrl_;
    }

    public final String getName() {
        return this.name_;
    }

    public final String getUri() {
        return this.uri_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final String m20792o() {
        return this.featuredPerformers_;
    }

    /* JADX INFO: renamed from: p */
    public final String m20793p() {
        return this.ubiReason_;
    }

    /* JADX INFO: renamed from: q */
    public final ConcertCampaignUserState m20794q() {
        ConcertCampaignUserState concertCampaignUserState = this.userState_;
        return concertCampaignUserState == null ? ConcertCampaignUserState.m20795n() : concertCampaignUserState;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
