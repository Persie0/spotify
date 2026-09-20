package com.spotify.ads.esperanto.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.cr51;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes4.dex */
public final class SubEventRequest extends AbstractC0269h implements sre0 {
    private static final SubEventRequest DEFAULT_INSTANCE;
    public static final int EVENT_TYPE_FIELD_NUMBER = 1;
    public static final int FORMAT_FIELD_NUMBER = 2;
    private static volatile r2n0 PARSER = null;
    public static final int SLOT_ID_FIELD_NUMBER = 3;
    private int bitField0_;
    private int format_;
    private String eventType_ = "";
    private String slotId_ = "";

    static {
        SubEventRequest subEventRequest = new SubEventRequest();
        DEFAULT_INSTANCE = subEventRequest;
        AbstractC0269h.registerDefaultInstance(SubEventRequest.class, subEventRequest);
    }

    private SubEventRequest() {
    }

    /* JADX INFO: renamed from: n */
    public static void m2703n(SubEventRequest subEventRequest, String str) {
        subEventRequest.getClass();
        str.getClass();
        subEventRequest.eventType_ = str;
    }

    /* JADX INFO: renamed from: o */
    public static cr51 m2704o() {
        return (cr51) DEFAULT_INSTANCE.createBuilder();
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002ဌ\u0000\u0003ለ\u0001", new Object[]{"bitField0_", "eventType_", "format_", "slotId_"});
        }
        if (iOrdinal == 3) {
            return new SubEventRequest();
        }
        if (iOrdinal == 4) {
            return new cr51(DEFAULT_INSTANCE);
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
        synchronized (SubEventRequest.class) {
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
