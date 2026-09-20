package com.spotify.decipher.agent.p057v1;

import com.google.protobuf.AbstractC0269h;
import java.util.ArrayList;
import p204p.AbstractC1733c9;
import p204p.AbstractC2118m8;
import p204p.ae50;
import p204p.bx41;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes6.dex */
public final class StateRequest extends AbstractC0269h implements sre0 {
    public static final int BLE_DEVICES_FIELD_NUMBER = 2;
    public static final int CONNECT_DEVICES_FIELD_NUMBER = 1;
    private static final StateRequest DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER = null;
    public static final int UI_STATE_FIELD_NUMBER = 3;
    private int bitField0_;
    private UiState uiState_;
    private ae50 connectDevices_ = AbstractC0269h.emptyProtobufList();
    private ae50 bleDevices_ = AbstractC0269h.emptyProtobufList();

    static {
        StateRequest stateRequest = new StateRequest();
        DEFAULT_INSTANCE = stateRequest;
        AbstractC0269h.registerDefaultInstance(StateRequest.class, stateRequest);
    }

    private StateRequest() {
    }

    /* JADX INFO: renamed from: n */
    public static void m9152n(StateRequest stateRequest, ArrayList arrayList) {
        ae50 ae50Var = stateRequest.bleDevices_;
        if (!((AbstractC1733c9) ae50Var).f35342a) {
            stateRequest.bleDevices_ = AbstractC0269h.mutableCopy(ae50Var);
        }
        AbstractC2118m8.addAll(arrayList, stateRequest.bleDevices_);
    }

    /* JADX INFO: renamed from: o */
    public static void m9153o(StateRequest stateRequest, ArrayList arrayList) {
        ae50 ae50Var = stateRequest.connectDevices_;
        if (!((AbstractC1733c9) ae50Var).f35342a) {
            stateRequest.connectDevices_ = AbstractC0269h.mutableCopy(ae50Var);
        }
        AbstractC2118m8.addAll(arrayList, stateRequest.connectDevices_);
    }

    /* JADX INFO: renamed from: p */
    public static void m9154p(StateRequest stateRequest, UiState uiState) {
        stateRequest.getClass();
        uiState.getClass();
        stateRequest.uiState_ = uiState;
        stateRequest.bitField0_ |= 1;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: s */
    public static bx41 m9155s() {
        return (bx41) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0002\u0000\u0001\u001b\u0002\u001b\u0003ဉ\u0000", new Object[]{"bitField0_", "connectDevices_", ConnectDevice.class, "bleDevices_", BleDevice.class, "uiState_"});
        }
        if (iOrdinal == 3) {
            return new StateRequest();
        }
        if (iOrdinal == 4) {
            return new bx41(DEFAULT_INSTANCE);
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
        synchronized (StateRequest.class) {
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
    public final void m9156q() {
        this.bleDevices_.size();
    }

    /* JADX INFO: renamed from: r */
    public final void m9157r() {
        this.connectDevices_.size();
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
