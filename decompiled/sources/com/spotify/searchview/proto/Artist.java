package com.spotify.searchview.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.aw2;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes10.dex */
public final class Artist extends AbstractC0269h implements sre0 {
    public static final int AI_PERSONA_FIELD_NUMBER = 5;
    public static final int CONCERT_CAMPAIGN_FIELD_NUMBER = 4;
    private static final Artist DEFAULT_INSTANCE;
    public static final int HAS_CONCERTS_FIELD_NUMBER = 2;
    private static volatile r2n0 PARSER = null;
    public static final int USER_LOCAL_CONCERT_FIELD_NUMBER = 3;
    public static final int VERIFIED_FIELD_NUMBER = 1;
    private AiPersona aiPersona_;
    private int bitField0_;
    private ConcertCampaign concertCampaign_;
    private boolean hasConcerts_;
    private Concert userLocalConcert_;
    private boolean verified_;

    static {
        Artist artist = new Artist();
        DEFAULT_INSTANCE = artist;
        AbstractC0269h.registerDefaultInstance(Artist.class, artist);
    }

    private Artist() {
    }

    /* JADX INFO: renamed from: p */
    public static Artist m20740p() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001\u0007\u0002\u0007\u0003ဉ\u0000\u0004ဉ\u0001\u0005ဉ\u0002", new Object[]{"bitField0_", "verified_", "hasConcerts_", "userLocalConcert_", "concertCampaign_", "aiPersona_"});
        }
        if (iOrdinal == 3) {
            return new Artist();
        }
        if (iOrdinal == 4) {
            return new aw2(DEFAULT_INSTANCE, 21);
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
        synchronized (Artist.class) {
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
    public final AiPersona m20741n() {
        AiPersona aiPersona = this.aiPersona_;
        return aiPersona == null ? AiPersona.m20730o() : aiPersona;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final ConcertCampaign m20742o() {
        ConcertCampaign concertCampaign = this.concertCampaign_;
        return concertCampaign == null ? ConcertCampaign.m20791n() : concertCampaign;
    }

    /* JADX INFO: renamed from: q */
    public final Concert m20743q() {
        Concert concert = this.userLocalConcert_;
        return concert == null ? Concert.m20789o() : concert;
    }

    /* JADX INFO: renamed from: r */
    public final boolean m20744r() {
        return this.verified_;
    }

    /* JADX INFO: renamed from: s */
    public final boolean m20745s() {
        return (this.bitField0_ & 4) != 0;
    }

    /* JADX INFO: renamed from: t */
    public final boolean m20746t() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }

    /* JADX INFO: renamed from: u */
    public final boolean m20747u() {
        return (this.bitField0_ & 1) != 0;
    }
}
