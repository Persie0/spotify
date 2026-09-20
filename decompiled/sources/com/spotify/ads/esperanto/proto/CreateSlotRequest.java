package com.spotify.ads.esperanto.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.ucl;
import p204p.z110;

/* JADX INFO: loaded from: classes.dex */
public final class CreateSlotRequest extends AbstractC0269h implements sre0 {
    private static final CreateSlotRequest DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER = null;
    public static final int SLOT_ID_FIELD_NUMBER = 1;
    private String slotId_ = "";

    static {
        CreateSlotRequest createSlotRequest = new CreateSlotRequest();
        DEFAULT_INSTANCE = createSlotRequest;
        AbstractC0269h.registerDefaultInstance(CreateSlotRequest.class, createSlotRequest);
    }

    private CreateSlotRequest() {
    }

    /* JADX INFO: renamed from: n */
    public static void m2635n(CreateSlotRequest createSlotRequest, String str) {
        createSlotRequest.getClass();
        str.getClass();
        createSlotRequest.slotId_ = str;
    }

    /* JADX INFO: renamed from: o */
    public static ucl m2636o() {
        return (ucl) DEFAULT_INSTANCE.createBuilder();
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"slotId_"});
        }
        if (iOrdinal == 3) {
            return new CreateSlotRequest();
        }
        if (iOrdinal == 4) {
            return new ucl(DEFAULT_INSTANCE);
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
        synchronized (CreateSlotRequest.class) {
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
