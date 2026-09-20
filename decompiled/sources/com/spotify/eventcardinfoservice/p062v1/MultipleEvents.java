package com.spotify.eventcardinfoservice.p062v1;

import com.google.protobuf.AbstractC0269h;
import p204p.ae50;
import p204p.d2i0;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes6.dex */
public final class MultipleEvents extends AbstractC0269h implements sre0 {
    private static final MultipleEvents DEFAULT_INSTANCE;
    public static final int EVENTS_FIELD_NUMBER = 4;
    public static final int FIRSTEVENTDATE_FIELD_NUMBER = 2;
    public static final int LASTEVENTDATE_FIELD_NUMBER = 3;
    public static final int NUMBEROFEVENTS_FIELD_NUMBER = 1;
    private static volatile r2n0 PARSER;
    private int bitField0_;
    private ae50 events_ = AbstractC0269h.emptyProtobufList();
    private DateWithOffset firstEventDate_;
    private DateWithOffset lastEventDate_;
    private int numberOfEvents_;

    static {
        MultipleEvents multipleEvents = new MultipleEvents();
        DEFAULT_INSTANCE = multipleEvents;
        AbstractC0269h.registerDefaultInstance(MultipleEvents.class, multipleEvents);
    }

    private MultipleEvents() {
    }

    /* JADX INFO: renamed from: n */
    public static MultipleEvents m9749n() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001\u0004\u0002ဉ\u0000\u0003ဉ\u0001\u0004\u001b", new Object[]{"bitField0_", "numberOfEvents_", "firstEventDate_", "lastEventDate_", "events_", SingleEvent.class});
        }
        if (iOrdinal == 3) {
            return new MultipleEvents();
        }
        if (iOrdinal == 4) {
            return new d2i0(DEFAULT_INSTANCE, 9);
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
        synchronized (MultipleEvents.class) {
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
    public final ae50 m9750o() {
        return this.events_;
    }

    /* JADX INFO: renamed from: p */
    public final DateWithOffset m9751p() {
        DateWithOffset dateWithOffset = this.firstEventDate_;
        return dateWithOffset == null ? DateWithOffset.m9734o() : dateWithOffset;
    }

    /* JADX INFO: renamed from: q */
    public final DateWithOffset m9752q() {
        DateWithOffset dateWithOffset = this.lastEventDate_;
        return dateWithOffset == null ? DateWithOffset.m9734o() : dateWithOffset;
    }

    /* JADX INFO: renamed from: r */
    public final int m9753r() {
        return this.numberOfEvents_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
