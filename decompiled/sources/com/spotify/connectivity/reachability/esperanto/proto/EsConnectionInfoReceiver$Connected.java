package com.spotify.connectivity.reachability.esperanto.proto;

import com.google.protobuf.AbstractC0269h;
import java.util.ArrayList;
import java.util.Iterator;
import p204p.AbstractC1733c9;
import p204p.ajw;
import p204p.djw;
import p204p.n350;
import p204p.on3;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.ud50;
import p204p.vd50;
import p204p.z110;

/* JADX INFO: loaded from: classes6.dex */
public final class EsConnectionInfoReceiver$Connected extends AbstractC0269h implements sre0 {
    public static final int CAPABILITIES_FIELD_NUMBER = 1;
    public static final int CONNECTION_TYPE_FIELD_NUMBER = 2;
    private static final EsConnectionInfoReceiver$Connected DEFAULT_INSTANCE;
    public static final int OS_INTERNET_VALIDATION_FIELD_NUMBER = 3;
    private static volatile r2n0 PARSER;
    private static final vd50 capabilities_converter_ = new on3(11);
    private int bitField0_;
    private int capabilitiesMemoizedSerializedSize;
    private ud50 capabilities_ = AbstractC0269h.emptyIntList();
    private EsConnectionType$ConnectionType connectionType_;
    private int osInternetValidation_;

    static {
        EsConnectionInfoReceiver$Connected esConnectionInfoReceiver$Connected = new EsConnectionInfoReceiver$Connected();
        DEFAULT_INSTANCE = esConnectionInfoReceiver$Connected;
        AbstractC0269h.registerDefaultInstance(EsConnectionInfoReceiver$Connected.class, esConnectionInfoReceiver$Connected);
    }

    private EsConnectionInfoReceiver$Connected() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: n */
    public static void m7556n(EsConnectionInfoReceiver$Connected esConnectionInfoReceiver$Connected, ArrayList arrayList) {
        ud50 ud50Var = esConnectionInfoReceiver$Connected.capabilities_;
        if (!((AbstractC1733c9) ud50Var).f35342a) {
            esConnectionInfoReceiver$Connected.capabilities_ = AbstractC0269h.mutableCopy(ud50Var);
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((n350) esConnectionInfoReceiver$Connected.capabilities_).m63581b(((Integer) it.next()).intValue());
        }
    }

    /* JADX INFO: renamed from: o */
    public static void m7557o(EsConnectionInfoReceiver$Connected esConnectionInfoReceiver$Connected, EsConnectionType$ConnectionType esConnectionType$ConnectionType) {
        esConnectionInfoReceiver$Connected.getClass();
        esConnectionType$ConnectionType.getClass();
        esConnectionInfoReceiver$Connected.connectionType_ = esConnectionType$ConnectionType;
        esConnectionInfoReceiver$Connected.bitField0_ |= 1;
    }

    /* JADX INFO: renamed from: p */
    public static void m7558p(EsConnectionInfoReceiver$Connected esConnectionInfoReceiver$Connected, djw djwVar) {
        esConnectionInfoReceiver$Connected.getClass();
        esConnectionInfoReceiver$Connected.osInternetValidation_ = djwVar.getNumber();
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static ajw m7559q() {
        return (ajw) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001,\u0002ဉ\u0000\u0003\f", new Object[]{"bitField0_", "capabilities_", "connectionType_", "osInternetValidation_"});
        }
        if (iOrdinal == 3) {
            return new EsConnectionInfoReceiver$Connected();
        }
        if (iOrdinal == 4) {
            return new ajw(DEFAULT_INSTANCE);
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
        synchronized (EsConnectionInfoReceiver$Connected.class) {
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
