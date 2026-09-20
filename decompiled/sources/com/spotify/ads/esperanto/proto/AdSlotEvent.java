package com.spotify.ads.esperanto.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.iu0;
import p204p.nv0;
import p204p.oo0;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes4.dex */
public final class AdSlotEvent extends AbstractC0269h implements sre0 {
    public static final int AD_FIELD_NUMBER = 4;
    private static final AdSlotEvent DEFAULT_INSTANCE;
    public static final int EVENT_TYPE_FIELD_NUMBER = 1;
    public static final int FORMAT_FIELD_NUMBER = 3;
    private static volatile r2n0 PARSER = null;
    public static final int SLOT_ID_FIELD_NUMBER = 2;
    private C0295Ad ad_;
    private int bitField0_;
    private int eventType_;
    private int format_;
    private String slotId_ = "";

    static {
        AdSlotEvent adSlotEvent = new AdSlotEvent();
        DEFAULT_INSTANCE = adSlotEvent;
        AbstractC0269h.registerDefaultInstance(AdSlotEvent.class, adSlotEvent);
    }

    private AdSlotEvent() {
    }

    /* JADX INFO: renamed from: o */
    public static AdSlotEvent m2592o() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\f\u0002Ȉ\u0003\f\u0004ဉ\u0000", new Object[]{"bitField0_", "eventType_", "slotId_", "format_", "ad_"});
        }
        if (iOrdinal == 3) {
            return new AdSlotEvent();
        }
        if (iOrdinal == 4) {
            return new iu0(DEFAULT_INSTANCE, 1);
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
        synchronized (AdSlotEvent.class) {
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
    public final C0295Ad m2593n() {
        C0295Ad c0295Ad = this.ad_;
        return c0295Ad == null ? C0295Ad.m2563r() : c0295Ad;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: p */
    public final nv0 m2594p() {
        nv0 nv0Var;
        int i = this.eventType_;
        if (i == 0) {
            nv0Var = nv0.AVAILABLE;
        } else if (i != 1) {
            nv0Var = i != 2 ? null : nv0.DISCARD;
        } else {
            nv0Var = nv0.PLAY;
        }
        return nv0Var == null ? nv0.UNRECOGNIZED : nv0Var;
    }

    /* JADX INFO: renamed from: q */
    public final oo0 m2595q() {
        oo0 oo0VarM67447a = oo0.m67447a(this.format_);
        return oo0VarM67447a == null ? oo0.UNRECOGNIZED : oo0VarM67447a;
    }

    /* JADX INFO: renamed from: r */
    public final String m2596r() {
        return this.slotId_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
