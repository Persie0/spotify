package com.spotify.eventcardinfoservice.p062v1;

import com.google.protobuf.AbstractC0269h;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.vnw;
import p204p.z110;

/* JADX INFO: loaded from: classes6.dex */
public final class EventCardInfoResponse extends AbstractC0269h implements sre0 {
    public static final int ARTISTCONCERTSURI_FIELD_NUMBER = 2;
    public static final int ARTWORK_FIELD_NUMBER = 1;
    private static final EventCardInfoResponse DEFAULT_INSTANCE;
    public static final int ISNEARBY_FIELD_NUMBER = 3;
    public static final int LOCATION_FIELD_NUMBER = 4;
    public static final int MULTI_EVENT_DETAILS_FIELD_NUMBER = 6;
    private static volatile r2n0 PARSER = null;
    public static final int SINGLE_EVENT_DETAILS_FIELD_NUMBER = 5;
    private int bitField0_;
    private Object details_;
    private boolean isNearby_;
    private int detailsCase_ = 0;
    private String artwork_ = "";
    private String artistConcertsUri_ = "";
    private String location_ = "";

    static {
        EventCardInfoResponse eventCardInfoResponse = new EventCardInfoResponse();
        DEFAULT_INSTANCE = eventCardInfoResponse;
        AbstractC0269h.registerDefaultInstance(EventCardInfoResponse.class, eventCardInfoResponse);
    }

    private EventCardInfoResponse() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0001\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003\u0007\u0004ለ\u0000\u0005<\u0000\u0006<\u0000", new Object[]{"details_", "detailsCase_", "bitField0_", "artwork_", "artistConcertsUri_", "isNearby_", "location_", SingleEvent.class, MultipleEvents.class});
        }
        if (iOrdinal == 3) {
            return new EventCardInfoResponse();
        }
        if (iOrdinal == 4) {
            return new vnw(DEFAULT_INSTANCE, 21);
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
        synchronized (EventCardInfoResponse.class) {
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
    public final String m9740n() {
        return this.artistConcertsUri_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final String m9741o() {
        return this.artwork_;
    }

    /* JADX INFO: renamed from: p */
    public final int m9742p() {
        int i = this.detailsCase_;
        if (i == 0) {
            return 3;
        }
        if (i != 5) {
            return i != 6 ? 0 : 2;
        }
        return 1;
    }

    /* JADX INFO: renamed from: q */
    public final boolean m9743q() {
        return this.isNearby_;
    }

    /* JADX INFO: renamed from: r */
    public final String m9744r() {
        return this.location_;
    }

    /* JADX INFO: renamed from: s */
    public final MultipleEvents m9745s() {
        return this.detailsCase_ == 6 ? (MultipleEvents) this.details_ : MultipleEvents.m9749n();
    }

    /* JADX INFO: renamed from: t */
    public final SingleEvent m9746t() {
        return this.detailsCase_ == 5 ? (SingleEvent) this.details_ : SingleEvent.m9754o();
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }

    /* JADX INFO: renamed from: u */
    public final boolean m9747u() {
        return (this.bitField0_ & 1) != 0;
    }

    /* JADX INFO: renamed from: v */
    public final boolean m9748v() {
        return this.detailsCase_ == 5;
    }
}
