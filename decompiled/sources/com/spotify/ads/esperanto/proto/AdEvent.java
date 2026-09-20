package com.spotify.ads.esperanto.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.C1997j;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes4.dex */
public final class AdEvent extends AbstractC0269h implements sre0 {
    public static final int AD_FIELD_NUMBER = 3;
    private static final AdEvent DEFAULT_INSTANCE;
    public static final int EVENT_TYPE_FIELD_NUMBER = 1;
    public static final int IS_MANAGED_FIELD_NUMBER = 4;
    private static volatile r2n0 PARSER = null;
    public static final int SLOT_ID_FIELD_NUMBER = 2;
    private C0295Ad ad_;
    private int bitField0_;
    private boolean isManaged_;
    private String eventType_ = "";
    private String slotId_ = "";

    static {
        AdEvent adEvent = new AdEvent();
        DEFAULT_INSTANCE = adEvent;
        AbstractC0269h.registerDefaultInstance(AdEvent.class, adEvent);
    }

    private AdEvent() {
    }

    /* JADX INFO: renamed from: o */
    public static AdEvent m2574o() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003ဉ\u0000\u0004\u0007", new Object[]{"bitField0_", "eventType_", "slotId_", "ad_", "isManaged_"});
        }
        if (iOrdinal == 3) {
            return new AdEvent();
        }
        if (iOrdinal == 4) {
            return new C1997j(DEFAULT_INSTANCE, 27);
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
        synchronized (AdEvent.class) {
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
    public final C0295Ad m2575n() {
        C0295Ad c0295Ad = this.ad_;
        return c0295Ad == null ? C0295Ad.m2563r() : c0295Ad;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: p */
    public final String m2576p() {
        return this.eventType_;
    }

    /* JADX INFO: renamed from: q */
    public final boolean m2577q() {
        return this.isManaged_;
    }

    /* JADX INFO: renamed from: r */
    public final String m2578r() {
        return this.slotId_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
