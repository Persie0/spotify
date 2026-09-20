package com.spotify.venueview.p179v1;

import com.google.protobuf.AbstractC0269h;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.wzl;
import p204p.z110;

/* JADX INFO: loaded from: classes11.dex */
public final class DateTimeWithOffset extends AbstractC0269h implements sre0 {
    public static final int DATE_TIME_FIELD_NUMBER = 1;
    private static final DateTimeWithOffset DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER = null;
    public static final int UTC_OFFSET_IN_MINUTES_FIELD_NUMBER = 2;
    private String dateTime_ = "";
    private int utcOffsetInMinutes_;

    static {
        DateTimeWithOffset dateTimeWithOffset = new DateTimeWithOffset();
        DEFAULT_INSTANCE = dateTimeWithOffset;
        AbstractC0269h.registerDefaultInstance(DateTimeWithOffset.class, dateTimeWithOffset);
    }

    private DateTimeWithOffset() {
    }

    /* JADX INFO: renamed from: o */
    public static DateTimeWithOffset m22290o() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002\u0004", new Object[]{"dateTime_", "utcOffsetInMinutes_"});
        }
        if (iOrdinal == 3) {
            return new DateTimeWithOffset();
        }
        if (iOrdinal == 4) {
            return new wzl(DEFAULT_INSTANCE, 12);
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
        synchronized (DateTimeWithOffset.class) {
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
    public final String m22291n() {
        return this.dateTime_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
