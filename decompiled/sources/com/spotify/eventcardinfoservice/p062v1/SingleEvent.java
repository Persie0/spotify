package com.spotify.eventcardinfoservice.p062v1;

import com.google.protobuf.AbstractC0269h;
import p204p.ne21;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes6.dex */
public final class SingleEvent extends AbstractC0269h implements sre0 {
    public static final int DATE_FIELD_NUMBER = 3;
    private static final SingleEvent DEFAULT_INSTANCE;
    public static final int EVENTURI_FIELD_NUMBER = 1;
    private static volatile r2n0 PARSER = null;
    public static final int TITLE_FIELD_NUMBER = 4;
    public static final int VENUELOCATION_FIELD_NUMBER = 2;
    private int bitField0_;
    private DateWithOffset date_;
    private String eventUri_ = "";
    private String venueLocation_ = "";
    private String title_ = "";

    static {
        SingleEvent singleEvent = new SingleEvent();
        DEFAULT_INSTANCE = singleEvent;
        AbstractC0269h.registerDefaultInstance(SingleEvent.class, singleEvent);
    }

    private SingleEvent() {
    }

    /* JADX INFO: renamed from: o */
    public static SingleEvent m9754o() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003ဉ\u0000\u0004Ȉ", new Object[]{"bitField0_", "eventUri_", "venueLocation_", "date_", "title_"});
        }
        if (iOrdinal == 3) {
            return new SingleEvent();
        }
        if (iOrdinal == 4) {
            return new ne21(DEFAULT_INSTANCE, 1);
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
        synchronized (SingleEvent.class) {
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
    public final DateWithOffset m9755n() {
        DateWithOffset dateWithOffset = this.date_;
        return dateWithOffset == null ? DateWithOffset.m9734o() : dateWithOffset;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: p */
    public final String m9756p() {
        return this.eventUri_;
    }

    /* JADX INFO: renamed from: q */
    public final String m9757q() {
        return this.venueLocation_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
