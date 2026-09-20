package com.spotify.messages;

import com.google.protobuf.AbstractC0269h;
import p204p.gva;
import p204p.mnk0;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes2.dex */
public final class ObservationEventGroupNonAuth extends AbstractC0269h implements sre0 {
    private static final ObservationEventGroupNonAuth DEFAULT_INSTANCE;
    public static final int EVENTS_FIELD_NUMBER = 3;
    public static final int EVENT_GROUP_ID_FIELD_NUMBER = 1;
    private static volatile r2n0 PARSER = null;
    public static final int SEGMENT_FIELD_NUMBER = 2;
    private int bitField0_;
    private String eventGroupId_ = "";
    private gva events_ = gva.f84678b;
    private int segment_;

    static {
        ObservationEventGroupNonAuth observationEventGroupNonAuth = new ObservationEventGroupNonAuth();
        DEFAULT_INSTANCE = observationEventGroupNonAuth;
        AbstractC0269h.registerDefaultInstance(ObservationEventGroupNonAuth.class, observationEventGroupNonAuth);
    }

    private ObservationEventGroupNonAuth() {
    }

    /* JADX INFO: renamed from: n */
    public static void m14255n(ObservationEventGroupNonAuth observationEventGroupNonAuth, String str) {
        observationEventGroupNonAuth.getClass();
        str.getClass();
        observationEventGroupNonAuth.bitField0_ |= 1;
        observationEventGroupNonAuth.eventGroupId_ = str;
    }

    /* JADX INFO: renamed from: o */
    public static void m14256o(ObservationEventGroupNonAuth observationEventGroupNonAuth, gva gvaVar) {
        observationEventGroupNonAuth.getClass();
        gvaVar.getClass();
        observationEventGroupNonAuth.bitField0_ |= 4;
        observationEventGroupNonAuth.events_ = gvaVar;
    }

    /* JADX INFO: renamed from: p */
    public static void m14257p(ObservationEventGroupNonAuth observationEventGroupNonAuth, int i) {
        observationEventGroupNonAuth.bitField0_ |= 2;
        observationEventGroupNonAuth.segment_ = i;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: r */
    public static mnk0 m14258r() {
        return (mnk0) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002င\u0001\u0003ည\u0002", new Object[]{"bitField0_", "eventGroupId_", "segment_", "events_"});
        }
        if (iOrdinal == 3) {
            return new ObservationEventGroupNonAuth();
        }
        if (iOrdinal == 4) {
            return new mnk0(DEFAULT_INSTANCE);
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
        synchronized (ObservationEventGroupNonAuth.class) {
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

    /* JADX INFO: renamed from: q */
    public final String m14259q() {
        return this.eventGroupId_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
