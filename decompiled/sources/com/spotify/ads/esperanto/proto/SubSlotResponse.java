package com.spotify.ads.esperanto.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.cm51;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes4.dex */
public final class SubSlotResponse extends AbstractC0269h implements sre0 {
    public static final int AD_SLOT_EVENT_FIELD_NUMBER = 1;
    private static final SubSlotResponse DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER;
    private AdSlotEvent adSlotEvent_;
    private int bitField0_;

    static {
        SubSlotResponse subSlotResponse = new SubSlotResponse();
        DEFAULT_INSTANCE = subSlotResponse;
        AbstractC0269h.registerDefaultInstance(SubSlotResponse.class, subSlotResponse);
    }

    private SubSlotResponse() {
    }

    /* JADX INFO: renamed from: o */
    public static SubSlotResponse m2714o(byte[] bArr) {
        return (SubSlotResponse) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr);
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"bitField0_", "adSlotEvent_"});
        }
        if (iOrdinal == 3) {
            return new SubSlotResponse();
        }
        if (iOrdinal == 4) {
            return new cm51(DEFAULT_INSTANCE, 7);
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
        synchronized (SubSlotResponse.class) {
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
    public final AdSlotEvent m2715n() {
        AdSlotEvent adSlotEvent = this.adSlotEvent_;
        return adSlotEvent == null ? AdSlotEvent.m2592o() : adSlotEvent;
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
