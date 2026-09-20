package com.spotify.connect.smartcontrol.events.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.uvi;
import p204p.z110;

/* JADX INFO: loaded from: classes6.dex */
public final class ConnectSmartControlLifecycleEvent extends AbstractC0269h implements sre0 {
    private static final ConnectSmartControlLifecycleEvent DEFAULT_INSTANCE;
    public static final int INSTRUMENTATION_ID_FIELD_NUMBER = 5;
    public static final int INSTRUMENTATION_REASON_FIELD_NUMBER = 6;
    private static volatile r2n0 PARSER = null;
    public static final int SMART_CONTROL_ID_FIELD_NUMBER = 1;
    public static final int SOURCE_TYPE_FIELD_NUMBER = 4;
    public static final int STATUS_FIELD_NUMBER = 2;
    public static final int VARIANT_TYPE_FIELD_NUMBER = 3;
    private int bitField0_;
    private String smartControlId_ = "";
    private String status_ = "";
    private String variantType_ = "";
    private String sourceType_ = "";
    private String instrumentationId_ = "";
    private String instrumentationReason_ = "";

    static {
        ConnectSmartControlLifecycleEvent connectSmartControlLifecycleEvent = new ConnectSmartControlLifecycleEvent();
        DEFAULT_INSTANCE = connectSmartControlLifecycleEvent;
        AbstractC0269h.registerDefaultInstance(ConnectSmartControlLifecycleEvent.class, connectSmartControlLifecycleEvent);
    }

    private ConnectSmartControlLifecycleEvent() {
    }

    /* JADX INFO: renamed from: n */
    public static void m7455n(ConnectSmartControlLifecycleEvent connectSmartControlLifecycleEvent, String str) {
        connectSmartControlLifecycleEvent.getClass();
        connectSmartControlLifecycleEvent.bitField0_ |= 16;
        connectSmartControlLifecycleEvent.instrumentationId_ = str;
    }

    /* JADX INFO: renamed from: o */
    public static void m7456o(ConnectSmartControlLifecycleEvent connectSmartControlLifecycleEvent, String str) {
        connectSmartControlLifecycleEvent.getClass();
        connectSmartControlLifecycleEvent.bitField0_ |= 32;
        connectSmartControlLifecycleEvent.instrumentationReason_ = str;
    }

    /* JADX INFO: renamed from: p */
    public static void m7457p(ConnectSmartControlLifecycleEvent connectSmartControlLifecycleEvent, String str) {
        connectSmartControlLifecycleEvent.getClass();
        str.getClass();
        connectSmartControlLifecycleEvent.bitField0_ |= 1;
        connectSmartControlLifecycleEvent.smartControlId_ = str;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static void m7458q(ConnectSmartControlLifecycleEvent connectSmartControlLifecycleEvent, String str) {
        connectSmartControlLifecycleEvent.getClass();
        connectSmartControlLifecycleEvent.bitField0_ |= 8;
        connectSmartControlLifecycleEvent.sourceType_ = str;
    }

    /* JADX INFO: renamed from: r */
    public static void m7459r(ConnectSmartControlLifecycleEvent connectSmartControlLifecycleEvent, String str) {
        connectSmartControlLifecycleEvent.getClass();
        connectSmartControlLifecycleEvent.bitField0_ |= 2;
        connectSmartControlLifecycleEvent.status_ = str;
    }

    /* JADX INFO: renamed from: s */
    public static void m7460s(ConnectSmartControlLifecycleEvent connectSmartControlLifecycleEvent, String str) {
        connectSmartControlLifecycleEvent.getClass();
        connectSmartControlLifecycleEvent.bitField0_ |= 4;
        connectSmartControlLifecycleEvent.variantType_ = str;
    }

    /* JADX INFO: renamed from: t */
    public static uvi m7461t() {
        return (uvi) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဈ\u0005", new Object[]{"bitField0_", "smartControlId_", "status_", "variantType_", "sourceType_", "instrumentationId_", "instrumentationReason_"});
        }
        if (iOrdinal == 3) {
            return new ConnectSmartControlLifecycleEvent();
        }
        if (iOrdinal == 4) {
            return new uvi(DEFAULT_INSTANCE);
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
        synchronized (ConnectSmartControlLifecycleEvent.class) {
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
