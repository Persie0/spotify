package com.spotify.connect.esperanto.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.nuh;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes6.dex */
public final class ConnectMessages$GroupDeviceCapabilities extends AbstractC0269h implements sre0 {
    private static final ConnectMessages$GroupDeviceCapabilities DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER = null;
    public static final int REMOVABLE_FIELD_NUMBER = 1;
    public static final int REMOVAL_DISSOLVES_GROUP_FIELD_NUMBER = 2;
    private boolean removable_;
    private boolean removalDissolvesGroup_;

    static {
        ConnectMessages$GroupDeviceCapabilities connectMessages$GroupDeviceCapabilities = new ConnectMessages$GroupDeviceCapabilities();
        DEFAULT_INSTANCE = connectMessages$GroupDeviceCapabilities;
        AbstractC0269h.registerDefaultInstance(ConnectMessages$GroupDeviceCapabilities.class, connectMessages$GroupDeviceCapabilities);
    }

    private ConnectMessages$GroupDeviceCapabilities() {
    }

    /* JADX INFO: renamed from: n */
    public static ConnectMessages$GroupDeviceCapabilities m7325n() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0007\u0002\u0007", new Object[]{"removable_", "removalDissolvesGroup_"});
        }
        if (iOrdinal == 3) {
            return new ConnectMessages$GroupDeviceCapabilities();
        }
        if (iOrdinal == 4) {
            return new nuh(DEFAULT_INSTANCE, 16);
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
        synchronized (ConnectMessages$GroupDeviceCapabilities.class) {
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

    /* JADX INFO: renamed from: o */
    public final boolean m7326o() {
        return this.removable_;
    }

    /* JADX INFO: renamed from: p */
    public final boolean m7327p() {
        return this.removalDissolvesGroup_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
