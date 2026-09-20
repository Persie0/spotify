package com.spotify.kidsview.p092v2.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.n501;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes7.dex */
public final class SetManagedAccountSettingsRequest extends AbstractC0269h implements sre0 {
    public static final int ACCOUNT_CONTROLS_FIELD_NUMBER = 2;
    public static final int ACCOUNT_FIELD_NUMBER = 1;
    private static final SetManagedAccountSettingsRequest DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER;
    private AccountControls accountControls_;
    private ManagedAccountIdentifier account_;
    private int bitField0_;

    static {
        SetManagedAccountSettingsRequest setManagedAccountSettingsRequest = new SetManagedAccountSettingsRequest();
        DEFAULT_INSTANCE = setManagedAccountSettingsRequest;
        AbstractC0269h.registerDefaultInstance(SetManagedAccountSettingsRequest.class, setManagedAccountSettingsRequest);
    }

    private SetManagedAccountSettingsRequest() {
    }

    /* JADX INFO: renamed from: n */
    public static void m12512n(SetManagedAccountSettingsRequest setManagedAccountSettingsRequest, ManagedAccountIdentifier managedAccountIdentifier) {
        setManagedAccountSettingsRequest.getClass();
        managedAccountIdentifier.getClass();
        setManagedAccountSettingsRequest.account_ = managedAccountIdentifier;
        setManagedAccountSettingsRequest.bitField0_ |= 1;
    }

    /* JADX INFO: renamed from: o */
    public static void m12513o(SetManagedAccountSettingsRequest setManagedAccountSettingsRequest, AccountControls accountControls) {
        setManagedAccountSettingsRequest.getClass();
        setManagedAccountSettingsRequest.accountControls_ = accountControls;
        setManagedAccountSettingsRequest.bitField0_ |= 2;
    }

    /* JADX INFO: renamed from: p */
    public static n501 m12514p() {
        return (n501) DEFAULT_INSTANCE.createBuilder();
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"bitField0_", "account_", "accountControls_"});
        }
        if (iOrdinal == 3) {
            return new SetManagedAccountSettingsRequest();
        }
        if (iOrdinal == 4) {
            return new n501(DEFAULT_INSTANCE);
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
        synchronized (SetManagedAccountSettingsRequest.class) {
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
