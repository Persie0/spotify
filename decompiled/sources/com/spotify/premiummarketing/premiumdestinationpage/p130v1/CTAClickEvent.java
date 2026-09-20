package com.spotify.premiummarketing.premiumdestinationpage.p130v1;

import com.google.protobuf.AbstractC0269h;
import p204p.l1b;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes9.dex */
public final class CTAClickEvent extends AbstractC0269h implements sre0 {
    public static final int ACTION_TYPE_FIELD_NUMBER = 4;
    public static final int CHECKOUT_SOURCE_FIELD_NUMBER = 3;
    private static final CTAClickEvent DEFAULT_INSTANCE;
    public static final int NAME_FIELD_NUMBER = 1;
    private static volatile r2n0 PARSER = null;
    public static final int URI_FIELD_NUMBER = 2;
    private int bitField0_;
    private String name_ = "";
    private String uri_ = "";
    private String checkoutSource_ = "";
    private String actionType_ = "";

    static {
        CTAClickEvent cTAClickEvent = new CTAClickEvent();
        DEFAULT_INSTANCE = cTAClickEvent;
        AbstractC0269h.registerDefaultInstance(CTAClickEvent.class, cTAClickEvent);
    }

    private CTAClickEvent() {
    }

    /* JADX INFO: renamed from: n */
    public static void m19538n(CTAClickEvent cTAClickEvent) {
        cTAClickEvent.getClass();
        cTAClickEvent.bitField0_ |= 4;
        cTAClickEvent.checkoutSource_ = "pdp";
    }

    /* JADX INFO: renamed from: o */
    public static void m19539o(CTAClickEvent cTAClickEvent, String str) {
        cTAClickEvent.getClass();
        cTAClickEvent.bitField0_ |= 1;
        cTAClickEvent.name_ = str;
    }

    /* JADX INFO: renamed from: p */
    public static void m19540p(CTAClickEvent cTAClickEvent, String str) {
        cTAClickEvent.getClass();
        str.getClass();
        cTAClickEvent.bitField0_ |= 2;
        cTAClickEvent.uri_ = str;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: r */
    public static CTAClickEvent m19541r() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: renamed from: s */
    public static l1b m19542s() {
        return (l1b) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ለ\u0000\u0002ለ\u0001\u0003ለ\u0002\u0004ለ\u0003", new Object[]{"bitField0_", "name_", "uri_", "checkoutSource_", "actionType_"});
        }
        if (iOrdinal == 3) {
            return new CTAClickEvent();
        }
        if (iOrdinal == 4) {
            return new l1b(DEFAULT_INSTANCE);
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
        synchronized (CTAClickEvent.class) {
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

    public final String getName() {
        return this.name_;
    }

    public final String getUri() {
        return this.uri_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: q */
    public final String m19543q() {
        return this.checkoutSource_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
