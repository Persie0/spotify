package com.spotify.concertpageview.p048v1;

import com.google.protobuf.AbstractC0269h;
import com.google.type.DateTime;
import java.util.List;
import p204p.ae50;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.y7l0;
import p204p.z110;

/* JADX INFO: loaded from: classes6.dex */
public final class PageHeader extends AbstractC0269h implements sre0 {
    public static final int ARTISTS_FIELD_NUMBER = 2;
    public static final int CONCEPTS_FIELD_NUMBER = 7;
    public static final int CONCERT_URI_FIELD_NUMBER = 3;
    public static final int DATE_FIELD_NUMBER = 5;
    private static final PageHeader DEFAULT_INSTANCE;
    public static final int HEADER_BACKGROUND_COLOR_FIELD_NUMBER = 1;
    private static volatile r2n0 PARSER = null;
    public static final int TITLE_FIELD_NUMBER = 4;
    public static final int VENUE_FIELD_NUMBER = 6;
    private int bitField0_;
    private DateTime date_;
    private HeaderVenue venue_;
    private String headerBackgroundColor_ = "";
    private ae50 artists_ = AbstractC0269h.emptyProtobufList();
    private String concertUri_ = "";
    private String title_ = "";
    private ae50 concepts_ = AbstractC0269h.emptyProtobufList();

    static {
        PageHeader pageHeader = new PageHeader();
        DEFAULT_INSTANCE = pageHeader;
        AbstractC0269h.registerDefaultInstance(PageHeader.class, pageHeader);
    }

    private PageHeader() {
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static PageHeader m7077q() {
        return DEFAULT_INSTANCE;
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0002\u0000\u0001Ȉ\u0002\u001b\u0003Ȉ\u0004Ȉ\u0005ဉ\u0000\u0006ဉ\u0001\u0007\u001b", new Object[]{"bitField0_", "headerBackgroundColor_", "artists_", HeaderArtist.class, "concertUri_", "title_", "date_", "venue_", "concepts_", HeaderConcept.class});
        }
        if (iOrdinal == 3) {
            return new PageHeader();
        }
        if (iOrdinal == 4) {
            return new y7l0(DEFAULT_INSTANCE, 16);
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
        synchronized (PageHeader.class) {
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

    public final List getArtistsList() {
        return this.artists_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.sre0
    public final /* bridge */ /* synthetic */ pre0 getDefaultInstanceForType() {
        return getDefaultInstanceForType();
    }

    public final String getTitle() {
        return this.title_;
    }

    /* JADX INFO: renamed from: n */
    public final ae50 m7078n() {
        return this.concepts_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final String m7079o() {
        return this.concertUri_;
    }

    /* JADX INFO: renamed from: p */
    public final DateTime m7080p() {
        DateTime dateTime = this.date_;
        return dateTime == null ? DateTime.m2198o() : dateTime;
    }

    /* JADX INFO: renamed from: r */
    public final String m7081r() {
        return this.headerBackgroundColor_;
    }

    /* JADX INFO: renamed from: s */
    public final HeaderVenue m7082s() {
        HeaderVenue headerVenue = this.venue_;
        return headerVenue == null ? HeaderVenue.m7057n() : headerVenue;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
