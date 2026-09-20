package com.spotify.kidsaccount.api.p083v2.proto;

import com.google.protobuf.AbstractC0269h;
import com.google.protobuf.Int32Value;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.v9k;
import p204p.z110;

/* JADX INFO: loaded from: classes7.dex */
public final class CreateChildLoginTokenResponse extends AbstractC0269h implements sre0 {
    public static final int CHILD_COLOR_FIELD_NUMBER = 4;
    public static final int CHILD_NAME_FIELD_NUMBER = 3;
    public static final int CHILD_USERNAME_FIELD_NUMBER = 2;
    private static final CreateChildLoginTokenResponse DEFAULT_INSTANCE;
    public static final int IS_FREE_FIELD_NUMBER = 5;
    private static volatile r2n0 PARSER = null;
    public static final int TOKEN_FIELD_NUMBER = 1;
    private int bitField0_;
    private Int32Value childColor_;
    private boolean isFree_;
    private String token_ = "";
    private String childUsername_ = "";
    private String childName_ = "";

    static {
        CreateChildLoginTokenResponse createChildLoginTokenResponse = new CreateChildLoginTokenResponse();
        DEFAULT_INSTANCE = createChildLoginTokenResponse;
        AbstractC0269h.registerDefaultInstance(CreateChildLoginTokenResponse.class, createChildLoginTokenResponse);
    }

    private CreateChildLoginTokenResponse() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004ဉ\u0000\u0005\u0007", new Object[]{"bitField0_", "token_", "childUsername_", "childName_", "childColor_", "isFree_"});
        }
        if (iOrdinal == 3) {
            return new CreateChildLoginTokenResponse();
        }
        if (iOrdinal == 4) {
            return new v9k(DEFAULT_INSTANCE, 21);
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
        synchronized (CreateChildLoginTokenResponse.class) {
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

    public final boolean getIsFree() {
        return this.isFree_;
    }

    /* JADX INFO: renamed from: n */
    public final Int32Value m12076n() {
        Int32Value int32Value = this.childColor_;
        return int32Value == null ? Int32Value.m1943p() : int32Value;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final String m12077o() {
        return this.childName_;
    }

    /* JADX INFO: renamed from: p */
    public final String m12078p() {
        return this.childUsername_;
    }

    /* JADX INFO: renamed from: q */
    public final String m12079q() {
        return this.token_;
    }

    /* JADX INFO: renamed from: r */
    public final boolean m12080r() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
