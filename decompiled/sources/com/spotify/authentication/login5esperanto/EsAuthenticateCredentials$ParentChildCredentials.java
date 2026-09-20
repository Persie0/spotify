package com.spotify.authentication.login5esperanto;

import com.google.protobuf.AbstractC0269h;
import com.spotify.connectivity.auth.common.esperanto.proto.EsUnencryptedStoredCredentials$UnencryptedStoredCredentials;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;
import p204p.zhw;

/* JADX INFO: loaded from: classes.dex */
public final class EsAuthenticateCredentials$ParentChildCredentials extends AbstractC0269h implements sre0 {
    public static final int CHILDID_FIELD_NUMBER = 1;
    private static final EsAuthenticateCredentials$ParentChildCredentials DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER = null;
    public static final int UNENCRYPTEDPARENTCREDENTIALS_FIELD_NUMBER = 2;
    private int bitField0_;
    private String childId_ = "";
    private EsUnencryptedStoredCredentials$UnencryptedStoredCredentials unencryptedParentCredentials_;

    static {
        EsAuthenticateCredentials$ParentChildCredentials esAuthenticateCredentials$ParentChildCredentials = new EsAuthenticateCredentials$ParentChildCredentials();
        DEFAULT_INSTANCE = esAuthenticateCredentials$ParentChildCredentials;
        AbstractC0269h.registerDefaultInstance(EsAuthenticateCredentials$ParentChildCredentials.class, esAuthenticateCredentials$ParentChildCredentials);
    }

    private EsAuthenticateCredentials$ParentChildCredentials() {
    }

    /* JADX INFO: renamed from: n */
    public static void m3538n(EsAuthenticateCredentials$ParentChildCredentials esAuthenticateCredentials$ParentChildCredentials, String str) {
        esAuthenticateCredentials$ParentChildCredentials.getClass();
        str.getClass();
        esAuthenticateCredentials$ParentChildCredentials.childId_ = str;
    }

    /* JADX INFO: renamed from: o */
    public static void m3539o(EsAuthenticateCredentials$ParentChildCredentials esAuthenticateCredentials$ParentChildCredentials, EsUnencryptedStoredCredentials$UnencryptedStoredCredentials esUnencryptedStoredCredentials$UnencryptedStoredCredentials) {
        esAuthenticateCredentials$ParentChildCredentials.getClass();
        esUnencryptedStoredCredentials$UnencryptedStoredCredentials.getClass();
        esAuthenticateCredentials$ParentChildCredentials.unencryptedParentCredentials_ = esUnencryptedStoredCredentials$UnencryptedStoredCredentials;
        esAuthenticateCredentials$ParentChildCredentials.bitField0_ |= 1;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static zhw m3541q() {
        return (zhw) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002ဉ\u0000", new Object[]{"bitField0_", "childId_", "unencryptedParentCredentials_"});
        }
        if (iOrdinal == 3) {
            return new EsAuthenticateCredentials$ParentChildCredentials();
        }
        if (iOrdinal == 4) {
            return new zhw();
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
        synchronized (EsAuthenticateCredentials$ParentChildCredentials.class) {
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
