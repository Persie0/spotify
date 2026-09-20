package com.spotify.kidsview.p092v2.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.h8z0;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes7.dex */
public final class SetManagedAccountSettingsResponse extends AbstractC0269h implements sre0 {
    public static final int ACCOUNT_CONTROLS_FIELD_NUMBER = 1;
    private static final SetManagedAccountSettingsResponse DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER;
    private AccountControls accountControls_;
    private int bitField0_;

    static {
        SetManagedAccountSettingsResponse setManagedAccountSettingsResponse = new SetManagedAccountSettingsResponse();
        DEFAULT_INSTANCE = setManagedAccountSettingsResponse;
        AbstractC0269h.registerDefaultInstance(SetManagedAccountSettingsResponse.class, setManagedAccountSettingsResponse);
    }

    private SetManagedAccountSettingsResponse() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"bitField0_", "accountControls_"});
        }
        if (iOrdinal == 3) {
            return new SetManagedAccountSettingsResponse();
        }
        if (iOrdinal == 4) {
            return new h8z0(DEFAULT_INSTANCE, 25);
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
        synchronized (SetManagedAccountSettingsResponse.class) {
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
    public final AccountControls m12515n() {
        AccountControls accountControls = this.accountControls_;
        return accountControls == null ? AccountControls.m12474z() : accountControls;
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
