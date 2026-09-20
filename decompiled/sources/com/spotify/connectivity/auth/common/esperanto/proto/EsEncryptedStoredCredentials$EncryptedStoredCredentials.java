package com.spotify.connectivity.auth.common.esperanto.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.gva;
import p204p.ore0;
import p204p.pre0;
import p204p.qjw;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes.dex */
public final class EsEncryptedStoredCredentials$EncryptedStoredCredentials extends AbstractC0269h implements sre0 {
    public static final int AUTH_BLOB_FIELD_NUMBER = 2;
    private static final EsEncryptedStoredCredentials$EncryptedStoredCredentials DEFAULT_INSTANCE;
    public static final int DEVICE_ID_FIELD_NUMBER = 3;
    private static volatile r2n0 PARSER = null;
    public static final int USERNAME_FIELD_NUMBER = 1;
    private String username_ = "";
    private gva authBlob_ = gva.f84678b;
    private String deviceId_ = "";

    static {
        EsEncryptedStoredCredentials$EncryptedStoredCredentials esEncryptedStoredCredentials$EncryptedStoredCredentials = new EsEncryptedStoredCredentials$EncryptedStoredCredentials();
        DEFAULT_INSTANCE = esEncryptedStoredCredentials$EncryptedStoredCredentials;
        AbstractC0269h.registerDefaultInstance(EsEncryptedStoredCredentials$EncryptedStoredCredentials.class, esEncryptedStoredCredentials$EncryptedStoredCredentials);
    }

    private EsEncryptedStoredCredentials$EncryptedStoredCredentials() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\n\u0003Ȉ", new Object[]{"username_", "authBlob_", "deviceId_"});
        }
        if (iOrdinal == 3) {
            return new EsEncryptedStoredCredentials$EncryptedStoredCredentials();
        }
        if (iOrdinal == 4) {
            return new qjw(9);
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
        synchronized (EsEncryptedStoredCredentials$EncryptedStoredCredentials.class) {
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
