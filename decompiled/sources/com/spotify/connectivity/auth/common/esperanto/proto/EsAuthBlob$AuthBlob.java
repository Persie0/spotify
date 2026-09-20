package com.spotify.connectivity.auth.common.esperanto.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.ore0;
import p204p.phw;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes.dex */
public final class EsAuthBlob$AuthBlob extends AbstractC0269h implements sre0 {
    private static final EsAuthBlob$AuthBlob DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER = null;
    public static final int STOREDCREDENTIALS_FIELD_NUMBER = 1;
    public static final int UNENCRYPTEDSTOREDCREDENTIALS_FIELD_NUMBER = 2;
    private int bitField0_;
    private int blobCase_ = 0;
    private Object blob_;
    private EsUnencryptedStoredCredentials$UnencryptedStoredCredentials unencryptedStoredCredentials_;

    static {
        EsAuthBlob$AuthBlob esAuthBlob$AuthBlob = new EsAuthBlob$AuthBlob();
        DEFAULT_INSTANCE = esAuthBlob$AuthBlob;
        AbstractC0269h.registerDefaultInstance(EsAuthBlob$AuthBlob.class, esAuthBlob$AuthBlob);
    }

    private EsAuthBlob$AuthBlob() {
    }

    /* JADX INFO: renamed from: n */
    public static void m7478n(EsAuthBlob$AuthBlob esAuthBlob$AuthBlob, EsUnencryptedStoredCredentials$UnencryptedStoredCredentials esUnencryptedStoredCredentials$UnencryptedStoredCredentials) {
        esAuthBlob$AuthBlob.getClass();
        esUnencryptedStoredCredentials$UnencryptedStoredCredentials.getClass();
        esAuthBlob$AuthBlob.unencryptedStoredCredentials_ = esUnencryptedStoredCredentials$UnencryptedStoredCredentials;
        esAuthBlob$AuthBlob.bitField0_ |= 1;
    }

    /* JADX INFO: renamed from: o */
    public static EsAuthBlob$AuthBlob m7479o() {
        return DEFAULT_INSTANCE;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static phw m7480q() {
        return (phw) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0001\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001<\u0000\u0002ဉ\u0000", new Object[]{"blob_", "blobCase_", "bitField0_", EsEncryptedStoredCredentials$EncryptedStoredCredentials.class, "unencryptedStoredCredentials_"});
        }
        if (iOrdinal == 3) {
            return new EsAuthBlob$AuthBlob();
        }
        if (iOrdinal == 4) {
            return new phw(DEFAULT_INSTANCE);
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
        synchronized (EsAuthBlob$AuthBlob.class) {
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

    /* JADX INFO: renamed from: p */
    public final EsUnencryptedStoredCredentials$UnencryptedStoredCredentials m7481p() {
        EsUnencryptedStoredCredentials$UnencryptedStoredCredentials esUnencryptedStoredCredentials$UnencryptedStoredCredentials = this.unencryptedStoredCredentials_;
        return esUnencryptedStoredCredentials$UnencryptedStoredCredentials == null ? EsUnencryptedStoredCredentials$UnencryptedStoredCredentials.m7485p() : esUnencryptedStoredCredentials$UnencryptedStoredCredentials;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
