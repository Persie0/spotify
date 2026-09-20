package com.spotify.offline_esperanto.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.bmw;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.vlw;
import p204p.z110;

/* JADX INFO: loaded from: classes9.dex */
public final class EsOffline$Error extends AbstractC0269h implements sre0 {
    public static final int CODE_FIELD_NUMBER = 1;
    private static final EsOffline$Error DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER;
    private int code_;

    static {
        EsOffline$Error esOffline$Error = new EsOffline$Error();
        DEFAULT_INSTANCE = esOffline$Error;
        AbstractC0269h.registerDefaultInstance(EsOffline$Error.class, esOffline$Error);
    }

    private EsOffline$Error() {
    }

    /* JADX INFO: renamed from: o */
    public static EsOffline$Error m16127o(byte[] bArr) {
        return (EsOffline$Error) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr);
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\f", new Object[]{"code_"});
        }
        if (iOrdinal == 3) {
            return new EsOffline$Error();
        }
        if (iOrdinal == 4) {
            return new vlw(DEFAULT_INSTANCE, 7);
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
        synchronized (EsOffline$Error.class) {
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
    public final bmw m16128n() {
        bmw bmwVar;
        int i = this.code_;
        if (i == 0) {
            bmwVar = bmw.SUCCESS;
        } else if (i == 1) {
            bmwVar = bmw.GENERIC;
        } else if (i == 8) {
            bmwVar = bmw.DISK_FULL;
        } else if (i == 14) {
            bmwVar = bmw.EXPIRED;
        } else if (i == 19) {
            bmwVar = bmw.TOO_MANY_TRACKS;
        } else if (i == 23) {
            bmwVar = bmw.NOT_ALLOWED;
        } else if (i != 36) {
            bmwVar = i != 7028 ? null : bmw.DEVICE_LIMIT_REACHED;
        } else {
            bmwVar = bmw.CONNECTION_DISABLED;
        }
        return bmwVar == null ? bmw.UNRECOGNIZED : bmwVar;
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
