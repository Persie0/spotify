package com.spotify.searchview.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.nuh;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes10.dex */
public final class ConcertCampaignUserState extends AbstractC0269h implements sre0 {
    public static final int BEFORE_SALE_FIELD_NUMBER = 1;
    private static final ConcertCampaignUserState DEFAULT_INSTANCE;
    public static final int ON_SALE_FIELD_NUMBER = 2;
    private static volatile r2n0 PARSER;
    private int stateCase_ = 0;
    private Object state_;

    static {
        ConcertCampaignUserState concertCampaignUserState = new ConcertCampaignUserState();
        DEFAULT_INSTANCE = concertCampaignUserState;
        AbstractC0269h.registerDefaultInstance(ConcertCampaignUserState.class, concertCampaignUserState);
    }

    private ConcertCampaignUserState() {
    }

    /* JADX INFO: renamed from: n */
    public static ConcertCampaignUserState m20795n() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000", new Object[]{"state_", "stateCase_", CampaignUserStateBeforeSale.class, CampaignUserStateOnSale.class});
        }
        if (iOrdinal == 3) {
            return new ConcertCampaignUserState();
        }
        if (iOrdinal == 4) {
            return new nuh(DEFAULT_INSTANCE, 4);
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

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final CampaignUserStateOnSale m20796o() {
        return this.stateCase_ == 2 ? (CampaignUserStateOnSale) this.state_ : CampaignUserStateOnSale.m20783n();
    }

    /* JADX INFO: renamed from: p */
    public final int m20797p() {
        int i = this.stateCase_;
        if (i == 0) {
            return 3;
        }
        int i2 = 1;
        if (i != 1) {
            i2 = 2;
            if (i != 2) {
                return 0;
            }
        }
        return i2;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
