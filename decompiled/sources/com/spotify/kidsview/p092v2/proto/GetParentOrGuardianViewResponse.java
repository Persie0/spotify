package com.spotify.kidsview.p092v2.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.b9c0;
import p204p.k810;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes7.dex */
public final class GetParentOrGuardianViewResponse extends AbstractC0269h implements sre0 {
    public static final int ACCOUNT_TYPE_FIELD_NUMBER = 1;
    private static final GetParentOrGuardianViewResponse DEFAULT_INSTANCE;
    public static final int PARENT_OR_GUARDIAN_FIELD_NUMBER = 2;
    private static volatile r2n0 PARSER = null;
    public static final int UNLINK_ACTION_FIELD_NUMBER = 3;
    private int accountType_;
    private int bitField0_;
    private ParentOrGuardian parentOrGuardian_;
    private UnlinkAction unlinkAction_;

    static {
        GetParentOrGuardianViewResponse getParentOrGuardianViewResponse = new GetParentOrGuardianViewResponse();
        DEFAULT_INSTANCE = getParentOrGuardianViewResponse;
        AbstractC0269h.registerDefaultInstance(GetParentOrGuardianViewResponse.class, getParentOrGuardianViewResponse);
    }

    private GetParentOrGuardianViewResponse() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\f\u0002ဉ\u0000\u0003ဉ\u0001", new Object[]{"bitField0_", "accountType_", "parentOrGuardian_", "unlinkAction_"});
        }
        if (iOrdinal == 3) {
            return new GetParentOrGuardianViewResponse();
        }
        if (iOrdinal == 4) {
            return new k810(DEFAULT_INSTANCE, 28);
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
        synchronized (GetParentOrGuardianViewResponse.class) {
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
    public final b9c0 m12501n() {
        b9c0 b9c0Var;
        int i = this.accountType_;
        if (i == 0) {
            b9c0Var = b9c0.MANAGED_ACCOUNT_TYPE_UNSPECIFIED;
        } else if (i != 1) {
            b9c0Var = i != 2 ? null : b9c0.MANAGED_ACCOUNT_TYPE_TEEN;
        } else {
            b9c0Var = b9c0.MANAGED_ACCOUNT_TYPE_CHILD;
        }
        return b9c0Var == null ? b9c0.UNRECOGNIZED : b9c0Var;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final ParentOrGuardian m12502o() {
        ParentOrGuardian parentOrGuardian = this.parentOrGuardian_;
        return parentOrGuardian == null ? ParentOrGuardian.m12511n() : parentOrGuardian;
    }

    /* JADX INFO: renamed from: p */
    public final UnlinkAction m12503p() {
        UnlinkAction unlinkAction = this.unlinkAction_;
        return unlinkAction == null ? UnlinkAction.m12516n() : unlinkAction;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
