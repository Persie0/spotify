package com.spotify.concertpageview.p048v1;

import com.google.protobuf.AbstractC0269h;
import p204p.ae50;
import p204p.ore0;
import p204p.pre0;
import p204p.q610;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes6.dex */
public final class GetConcertPageResponse extends AbstractC0269h implements sre0 {
    private static final GetConcertPageResponse DEFAULT_INSTANCE;
    public static final int EVENT_HERO_FIELD_NUMBER = 5;
    public static final int HEADER_FIELD_NUMBER = 1;
    public static final int NOT_INTERESTED_BOTTOM_SHEET_FIELD_NUMBER = 4;
    private static volatile r2n0 PARSER = null;
    public static final int ROWS_FIELD_NUMBER = 2;
    public static final int TABS_FIELD_NUMBER = 3;
    private int bitField0_;
    private EventHero eventHero_;
    private PageHeader header_;
    private NotInterestedBottomSheet notInterestedBottomSheet_;
    private ae50 rows_ = AbstractC0269h.emptyProtobufList();
    private ae50 tabs_ = AbstractC0269h.emptyProtobufList();

    static {
        GetConcertPageResponse getConcertPageResponse = new GetConcertPageResponse();
        DEFAULT_INSTANCE = getConcertPageResponse;
        AbstractC0269h.registerDefaultInstance(GetConcertPageResponse.class, getConcertPageResponse);
    }

    private GetConcertPageResponse() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0002\u0000\u0001ဉ\u0000\u0002\u001b\u0003\u001b\u0004ဉ\u0001\u0005ဉ\u0002", new Object[]{"bitField0_", "header_", "rows_", Row.class, "tabs_", Tab.class, "notInterestedBottomSheet_", "eventHero_"});
        }
        if (iOrdinal == 3) {
            return new GetConcertPageResponse();
        }
        if (iOrdinal == 4) {
            return new q610(DEFAULT_INSTANCE, 15);
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
        synchronized (GetConcertPageResponse.class) {
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
    public final EventHero m7044n() {
        EventHero eventHero = this.eventHero_;
        return eventHero == null ? EventHero.m7038n() : eventHero;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final PageHeader m7045o() {
        PageHeader pageHeader = this.header_;
        return pageHeader == null ? PageHeader.m7077q() : pageHeader;
    }

    /* JADX INFO: renamed from: p */
    public final ae50 m7046p() {
        return this.rows_;
    }

    /* JADX INFO: renamed from: q */
    public final ae50 m7047q() {
        return this.tabs_;
    }

    /* JADX INFO: renamed from: r */
    public final boolean m7048r() {
        return (this.bitField0_ & 4) != 0;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
