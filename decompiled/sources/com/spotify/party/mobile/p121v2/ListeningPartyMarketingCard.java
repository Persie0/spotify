package com.spotify.party.mobile.p121v2;

import com.google.protobuf.AbstractC0269h;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sj80;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes9.dex */
public final class ListeningPartyMarketingCard extends AbstractC0269h implements sre0 {
    private static final ListeningPartyMarketingCard DEFAULT_INSTANCE;
    public static final int OBSERVE_PARTY_FIELD_NUMBER = 4;
    public static final int ORGANIZER_FIELD_NUMBER = 3;
    private static volatile r2n0 PARSER = null;
    public static final int PARTY_FIELD_NUMBER = 1;
    public static final int STATUS_FIELD_NUMBER = 2;
    private int bitField0_;
    private ObserveParty observeParty_;
    private ListeningPartyOrganizer organizer_;
    private ListeningParty party_;
    private ListeningPartyStatus status_;

    static {
        ListeningPartyMarketingCard listeningPartyMarketingCard = new ListeningPartyMarketingCard();
        DEFAULT_INSTANCE = listeningPartyMarketingCard;
        AbstractC0269h.registerDefaultInstance(ListeningPartyMarketingCard.class, listeningPartyMarketingCard);
    }

    private ListeningPartyMarketingCard() {
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: r */
    public static ListeningPartyMarketingCard m16623r(byte[] bArr) {
        return (ListeningPartyMarketingCard) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003", new Object[]{"bitField0_", "party_", "status_", "organizer_", "observeParty_"});
        }
        if (iOrdinal == 3) {
            return new ListeningPartyMarketingCard();
        }
        if (iOrdinal == 4) {
            return new sj80(DEFAULT_INSTANCE, 27);
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
        synchronized (ListeningPartyMarketingCard.class) {
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
    public final ObserveParty m16624n() {
        ObserveParty observeParty = this.observeParty_;
        return observeParty == null ? ObserveParty.m16631n() : observeParty;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final ListeningPartyOrganizer m16625o() {
        ListeningPartyOrganizer listeningPartyOrganizer = this.organizer_;
        return listeningPartyOrganizer == null ? ListeningPartyOrganizer.m16628n() : listeningPartyOrganizer;
    }

    /* JADX INFO: renamed from: p */
    public final ListeningParty m16626p() {
        ListeningParty listeningParty = this.party_;
        return listeningParty == null ? ListeningParty.m16620n() : listeningParty;
    }

    /* JADX INFO: renamed from: q */
    public final ListeningPartyStatus m16627q() {
        ListeningPartyStatus listeningPartyStatus = this.status_;
        return listeningPartyStatus == null ? ListeningPartyStatus.m16629n() : listeningPartyStatus;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
