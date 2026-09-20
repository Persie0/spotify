package com.spotify.ads.esperanto.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.yda1;
import p204p.z110;

/* JADX INFO: loaded from: classes.dex */
public final class UpdateSlotEnabledRequest extends AbstractC0269h implements sre0 {
    private static final UpdateSlotEnabledRequest DEFAULT_INSTANCE;
    public static final int ENABLED_FIELD_NUMBER = 2;
    private static volatile r2n0 PARSER = null;
    public static final int SLOT_ID_FIELD_NUMBER = 1;
    private boolean enabled_;
    private String slotId_ = "";

    static {
        UpdateSlotEnabledRequest updateSlotEnabledRequest = new UpdateSlotEnabledRequest();
        DEFAULT_INSTANCE = updateSlotEnabledRequest;
        AbstractC0269h.registerDefaultInstance(UpdateSlotEnabledRequest.class, updateSlotEnabledRequest);
    }

    private UpdateSlotEnabledRequest() {
    }

    /* JADX INFO: renamed from: n */
    public static void m2750n(UpdateSlotEnabledRequest updateSlotEnabledRequest) {
        updateSlotEnabledRequest.enabled_ = true;
    }

    /* JADX INFO: renamed from: o */
    public static void m2751o(UpdateSlotEnabledRequest updateSlotEnabledRequest, String str) {
        updateSlotEnabledRequest.getClass();
        str.getClass();
        updateSlotEnabledRequest.slotId_ = str;
    }

    /* JADX INFO: renamed from: p */
    public static yda1 m2752p() {
        return (yda1) DEFAULT_INSTANCE.createBuilder();
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002\u0007", new Object[]{"slotId_", "enabled_"});
        }
        if (iOrdinal == 3) {
            return new UpdateSlotEnabledRequest();
        }
        if (iOrdinal == 4) {
            return new yda1(DEFAULT_INSTANCE);
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
        synchronized (UpdateSlotEnabledRequest.class) {
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

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
