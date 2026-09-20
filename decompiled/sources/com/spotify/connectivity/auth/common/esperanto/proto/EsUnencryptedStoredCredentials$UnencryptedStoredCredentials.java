package com.spotify.connectivity.auth.common.esperanto.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.cva;
import p204p.gva;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.upw;
import p204p.z110;

/* JADX INFO: loaded from: classes.dex */
public final class EsUnencryptedStoredCredentials$UnencryptedStoredCredentials extends AbstractC0269h implements sre0 {
    private static final EsUnencryptedStoredCredentials$UnencryptedStoredCredentials DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER = null;
    public static final int STOREDCREDENTIALS_FIELD_NUMBER = 2;
    public static final int USERNAME_FIELD_NUMBER = 1;
    private String username_ = "";
    private gva storedCredentials_ = gva.f84678b;

    static {
        EsUnencryptedStoredCredentials$UnencryptedStoredCredentials esUnencryptedStoredCredentials$UnencryptedStoredCredentials = new EsUnencryptedStoredCredentials$UnencryptedStoredCredentials();
        DEFAULT_INSTANCE = esUnencryptedStoredCredentials$UnencryptedStoredCredentials;
        AbstractC0269h.registerDefaultInstance(EsUnencryptedStoredCredentials$UnencryptedStoredCredentials.class, esUnencryptedStoredCredentials$UnencryptedStoredCredentials);
    }

    private EsUnencryptedStoredCredentials$UnencryptedStoredCredentials() {
    }

    /* JADX INFO: renamed from: n */
    public static void m7483n(EsUnencryptedStoredCredentials$UnencryptedStoredCredentials esUnencryptedStoredCredentials$UnencryptedStoredCredentials, cva cvaVar) {
        esUnencryptedStoredCredentials$UnencryptedStoredCredentials.getClass();
        esUnencryptedStoredCredentials$UnencryptedStoredCredentials.storedCredentials_ = cvaVar;
    }

    /* JADX INFO: renamed from: o */
    public static void m7484o(EsUnencryptedStoredCredentials$UnencryptedStoredCredentials esUnencryptedStoredCredentials$UnencryptedStoredCredentials, String str) {
        esUnencryptedStoredCredentials$UnencryptedStoredCredentials.getClass();
        str.getClass();
        esUnencryptedStoredCredentials$UnencryptedStoredCredentials.username_ = str;
    }

    /* JADX INFO: renamed from: p */
    public static EsUnencryptedStoredCredentials$UnencryptedStoredCredentials m7485p() {
        return DEFAULT_INSTANCE;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: r */
    public static upw m7486r() {
        return (upw) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002\n", new Object[]{"username_", "storedCredentials_"});
        }
        if (iOrdinal == 3) {
            return new EsUnencryptedStoredCredentials$UnencryptedStoredCredentials();
        }
        if (iOrdinal == 4) {
            return new upw(DEFAULT_INSTANCE);
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
        synchronized (EsUnencryptedStoredCredentials$UnencryptedStoredCredentials.class) {
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

    public final String getUsername() {
        return this.username_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: q */
    public final gva m7487q() {
        return this.storedCredentials_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
