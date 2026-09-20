package com.spotify.party.mobile.p121v2;

import com.google.protobuf.AbstractC0269h;
import com.google.protobuf.Timestamp;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sj80;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes9.dex */
public final class ListeningParty extends AbstractC0269h implements sre0 {
    private static final ListeningParty DEFAULT_INSTANCE;
    public static final int IMAGE_URL_FIELD_NUMBER = 3;
    public static final int ORGANIZER_URI_FIELD_NUMBER = 2;
    private static volatile r2n0 PARSER = null;
    public static final int PREMIUM_ONLY_FIELD_NUMBER = 4;
    public static final int SCHEDULED_FOR_FIELD_NUMBER = 5;
    public static final int SCHEDULED_FOR_MILLIS_FIELD_NUMBER = 6;
    public static final int URI_FIELD_NUMBER = 1;
    private int bitField0_;
    private boolean premiumOnly_;
    private long scheduledForMillis_;
    private Timestamp scheduledFor_;
    private String uri_ = "";
    private String organizerUri_ = "";
    private String imageUrl_ = "";

    static {
        ListeningParty listeningParty = new ListeningParty();
        DEFAULT_INSTANCE = listeningParty;
        AbstractC0269h.registerDefaultInstance(ListeningParty.class, listeningParty);
    }

    private ListeningParty() {
    }

    /* JADX INFO: renamed from: n */
    public static ListeningParty m16620n() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004\u0007\u0005ဉ\u0000\u0006\u0002", new Object[]{"bitField0_", "uri_", "organizerUri_", "imageUrl_", "premiumOnly_", "scheduledFor_", "scheduledForMillis_"});
        }
        if (iOrdinal == 3) {
            return new ListeningParty();
        }
        if (iOrdinal == 4) {
            return new sj80(DEFAULT_INSTANCE, 25);
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
        synchronized (ListeningParty.class) {
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

    public final String getUri() {
        return this.uri_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final boolean m16621o() {
        return this.premiumOnly_;
    }

    /* JADX INFO: renamed from: p */
    public final Timestamp m16622p() {
        Timestamp timestamp = this.scheduledFor_;
        return timestamp == null ? Timestamp.m1965q() : timestamp;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
