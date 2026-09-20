package com.spotify.connectivity.auth.storage.esperanto.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.dbw;
import p204p.ore0;
import p204p.pre0;
import p204p.qhw;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes.dex */
public final class EsAuthStorageResult$AuthStorageResult extends AbstractC0269h implements sre0 {
    private static final EsAuthStorageResult$AuthStorageResult DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER = null;
    public static final int RESULT_FIELD_NUMBER = 1;
    private int result_;

    static {
        EsAuthStorageResult$AuthStorageResult esAuthStorageResult$AuthStorageResult = new EsAuthStorageResult$AuthStorageResult();
        DEFAULT_INSTANCE = esAuthStorageResult$AuthStorageResult;
        AbstractC0269h.registerDefaultInstance(EsAuthStorageResult$AuthStorageResult.class, esAuthStorageResult$AuthStorageResult);
    }

    private EsAuthStorageResult$AuthStorageResult() {
    }

    /* JADX INFO: renamed from: p */
    public static EsAuthStorageResult$AuthStorageResult m7497p(byte[] bArr) {
        return (EsAuthStorageResult$AuthStorageResult) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr);
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\f", new Object[]{"result_"});
        }
        if (iOrdinal == 3) {
            return new EsAuthStorageResult$AuthStorageResult();
        }
        if (iOrdinal == 4) {
            return new dbw(19);
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
        synchronized (EsAuthStorageResult$AuthStorageResult.class) {
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
    public final qhw m7498o() {
        qhw qhwVar;
        int i = this.result_;
        if (i == 0) {
            qhwVar = qhw.success;
        } else if (i != 1) {
            qhwVar = i != 2 ? null : qhw.userAlreadyExists;
        } else {
            qhwVar = qhw.userNotFound;
        }
        return qhwVar == null ? qhw.UNRECOGNIZED : qhwVar;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
