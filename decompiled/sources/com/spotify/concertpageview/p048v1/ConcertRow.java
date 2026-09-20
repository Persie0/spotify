package com.spotify.concertpageview.p048v1;

import com.google.protobuf.AbstractC0269h;
import com.google.type.DateTime;
import p204p.nuh;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes6.dex */
public final class ConcertRow extends AbstractC0269h implements sre0 {
    public static final int CONCERT_URI_FIELD_NUMBER = 1;
    public static final int DATE_FIELD_NUMBER = 3;
    private static final ConcertRow DEFAULT_INSTANCE;
    public static final int LOCATION_FIELD_NUMBER = 4;
    private static volatile r2n0 PARSER = null;
    public static final int TITLE_FIELD_NUMBER = 2;
    private int bitField0_;
    private DateTime date_;
    private String concertUri_ = "";
    private String title_ = "";
    private String location_ = "";

    static {
        ConcertRow concertRow = new ConcertRow();
        DEFAULT_INSTANCE = concertRow;
        AbstractC0269h.registerDefaultInstance(ConcertRow.class, concertRow);
    }

    private ConcertRow() {
    }

    /* JADX INFO: renamed from: p */
    public static ConcertRow m7028p() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003ဉ\u0000\u0004Ȉ", new Object[]{"bitField0_", "concertUri_", "title_", "date_", "location_"});
        }
        if (iOrdinal == 3) {
            return new ConcertRow();
        }
        if (iOrdinal == 4) {
            return new nuh(DEFAULT_INSTANCE, 7);
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
        synchronized (ConcertRow.class) {
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

    public final String getTitle() {
        return this.title_;
    }

    /* JADX INFO: renamed from: n */
    public final String m7029n() {
        return this.concertUri_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final DateTime m7030o() {
        DateTime dateTime = this.date_;
        return dateTime == null ? DateTime.m2198o() : dateTime;
    }

    /* JADX INFO: renamed from: q */
    public final String m7031q() {
        return this.location_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
