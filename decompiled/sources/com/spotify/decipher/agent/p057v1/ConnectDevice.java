package com.spotify.decipher.agent.p057v1;

import com.google.protobuf.AbstractC0269h;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sqi;
import p204p.sre0;
import p204p.z110;
import p204p.zfr;

/* JADX INFO: loaded from: classes6.dex */
public final class ConnectDevice extends AbstractC0269h implements sre0 {
    private static final ConnectDevice DEFAULT_INSTANCE;
    public static final int ID_FIELD_NUMBER = 1;
    public static final int IS_ACTIVE_FIELD_NUMBER = 4;
    public static final int NAME_FIELD_NUMBER = 2;
    private static volatile r2n0 PARSER = null;
    public static final int TYPE_FIELD_NUMBER = 3;
    private boolean isActive_;
    private int type_;
    private String id_ = "";
    private String name_ = "";

    static {
        ConnectDevice connectDevice = new ConnectDevice();
        DEFAULT_INSTANCE = connectDevice;
        AbstractC0269h.registerDefaultInstance(ConnectDevice.class, connectDevice);
    }

    private ConnectDevice() {
    }

    /* JADX INFO: renamed from: n */
    public static void m9137n(ConnectDevice connectDevice, String str) {
        connectDevice.getClass();
        str.getClass();
        connectDevice.id_ = str;
    }

    /* JADX INFO: renamed from: o */
    public static void m9138o(ConnectDevice connectDevice, boolean z) {
        connectDevice.isActive_ = z;
    }

    /* JADX INFO: renamed from: p */
    public static void m9139p(ConnectDevice connectDevice, String str) {
        connectDevice.getClass();
        str.getClass();
        connectDevice.name_ = str;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static void m9140q(ConnectDevice connectDevice, zfr zfrVar) {
        connectDevice.getClass();
        connectDevice.type_ = zfrVar.getNumber();
    }

    /* JADX INFO: renamed from: r */
    public static sqi m9141r() {
        return (sqi) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003\f\u0004\u0007", new Object[]{"id_", "name_", "type_", "isActive_"});
        }
        if (iOrdinal == 3) {
            return new ConnectDevice();
        }
        if (iOrdinal == 4) {
            return new sqi(DEFAULT_INSTANCE);
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
        synchronized (ConnectDevice.class) {
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
