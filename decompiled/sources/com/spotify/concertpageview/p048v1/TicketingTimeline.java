package com.spotify.concertpageview.p048v1;

import com.google.protobuf.AbstractC0269h;
import com.google.protobuf.Timestamp;
import p204p.ae50;
import p204p.ore0;
import p204p.pre0;
import p204p.qn61;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes6.dex */
public final class TicketingTimeline extends AbstractC0269h implements sre0 {
    private static final TicketingTimeline DEFAULT_INSTANCE;
    public static final int ENTRIES_FIELD_NUMBER = 3;
    public static final int FOOTER_LEGAL_HTML_FIELD_NUMBER = 4;
    public static final int GENERATED_AT_FIELD_NUMBER = 1;
    public static final int NEXT_REFRESH_AT_FIELD_NUMBER = 2;
    private static volatile r2n0 PARSER;
    private int bitField0_;
    private ae50 entries_ = AbstractC0269h.emptyProtobufList();
    private String footerLegalHtml_ = "";
    private Timestamp generatedAt_;
    private Timestamp nextRefreshAt_;

    static {
        TicketingTimeline ticketingTimeline = new TicketingTimeline();
        DEFAULT_INSTANCE = ticketingTimeline;
        AbstractC0269h.registerDefaultInstance(TicketingTimeline.class, ticketingTimeline);
    }

    private TicketingTimeline() {
    }

    /* JADX INFO: renamed from: n */
    public static TicketingTimeline m7135n() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003\u001b\u0004ለ\u0002", new Object[]{"bitField0_", "generatedAt_", "nextRefreshAt_", "entries_", TimelineEntry.class, "footerLegalHtml_"});
        }
        if (iOrdinal == 3) {
            return new TicketingTimeline();
        }
        if (iOrdinal == 4) {
            return new qn61(DEFAULT_INSTANCE, 22);
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
        synchronized (TicketingTimeline.class) {
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
    public final int m7136o() {
        return this.entries_.size();
    }

    /* JADX INFO: renamed from: p */
    public final ae50 m7137p() {
        return this.entries_;
    }

    /* JADX INFO: renamed from: q */
    public final String m7138q() {
        return this.footerLegalHtml_;
    }

    /* JADX INFO: renamed from: r */
    public final Timestamp m7139r() {
        Timestamp timestamp = this.generatedAt_;
        return timestamp == null ? Timestamp.m1965q() : timestamp;
    }

    /* JADX INFO: renamed from: s */
    public final Timestamp m7140s() {
        Timestamp timestamp = this.nextRefreshAt_;
        return timestamp == null ? Timestamp.m1965q() : timestamp;
    }

    /* JADX INFO: renamed from: t */
    public final boolean m7141t() {
        return (this.bitField0_ & 4) != 0;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }

    /* JADX INFO: renamed from: u */
    public final boolean m7142u() {
        return (this.bitField0_ & 1) != 0;
    }

    /* JADX INFO: renamed from: v */
    public final boolean m7143v() {
        return (this.bitField0_ & 2) != 0;
    }
}
