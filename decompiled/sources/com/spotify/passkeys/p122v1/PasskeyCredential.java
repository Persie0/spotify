package com.spotify.passkeys.p122v1;

import com.google.protobuf.AbstractC0269h;
import com.google.protobuf.Timestamp;
import p204p.c0n0;
import p204p.gva;
import p204p.j7n0;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.ud50;
import p204p.vd50;
import p204p.z110;

/* JADX INFO: loaded from: classes9.dex */
public final class PasskeyCredential extends AbstractC0269h implements sre0 {
    public static final int BACKUP_ELIGIBLE_FIELD_NUMBER = 7;
    public static final int BACKUP_STATE_FIELD_NUMBER = 8;
    public static final int CREATED_AT_FIELD_NUMBER = 3;
    public static final int CREDENTIAL_ID_FIELD_NUMBER = 1;
    private static final PasskeyCredential DEFAULT_INSTANCE;
    public static final int DISPLAY_NAME_FIELD_NUMBER = 2;
    public static final int LAST_USED_AT_FIELD_NUMBER = 4;
    private static volatile r2n0 PARSER = null;
    public static final int SIGN_COUNT_FIELD_NUMBER = 5;
    public static final int TRANSPORTS_FIELD_NUMBER = 6;
    private static final vd50 transports_converter_ = new j7n0();
    private boolean backupEligible_;
    private boolean backupState_;
    private int bitField0_;
    private Timestamp createdAt_;
    private Timestamp lastUsedAt_;
    private int signCount_;
    private int transportsMemoizedSerializedSize;
    private gva credentialId_ = gva.f84678b;
    private String displayName_ = "";
    private ud50 transports_ = AbstractC0269h.emptyIntList();

    static {
        PasskeyCredential passkeyCredential = new PasskeyCredential();
        DEFAULT_INSTANCE = passkeyCredential;
        AbstractC0269h.registerDefaultInstance(PasskeyCredential.class, passkeyCredential);
    }

    private PasskeyCredential() {
    }

    /* JADX INFO: renamed from: n */
    public static PasskeyCredential m16665n() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\b\u0000\u0001\u0001\b\b\u0000\u0001\u0000\u0001\n\u0002ለ\u0000\u0003ဉ\u0001\u0004ဉ\u0002\u0005\u000b\u0006,\u0007\u0007\b\u0007", new Object[]{"bitField0_", "credentialId_", "displayName_", "createdAt_", "lastUsedAt_", "signCount_", "transports_", "backupEligible_", "backupState_"});
        }
        if (iOrdinal == 3) {
            return new PasskeyCredential();
        }
        if (iOrdinal == 4) {
            return new c0n0(DEFAULT_INSTANCE, 4);
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
        synchronized (PasskeyCredential.class) {
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
