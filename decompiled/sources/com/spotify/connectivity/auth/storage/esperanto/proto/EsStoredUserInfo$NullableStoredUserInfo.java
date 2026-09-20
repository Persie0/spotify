package com.spotify.connectivity.auth.storage.esperanto.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.vnw;
import p204p.z110;

/* JADX INFO: loaded from: classes.dex */
public final class EsStoredUserInfo$NullableStoredUserInfo extends AbstractC0269h implements sre0 {
    private static final EsStoredUserInfo$NullableStoredUserInfo DEFAULT_INSTANCE;
    public static final int NULL_FIELD_NUMBER = 2;
    private static volatile r2n0 PARSER = null;
    public static final int STORED_USER_INFO_FIELD_NUMBER = 1;
    private int userInfoCase_ = 0;
    private Object userInfo_;

    static {
        EsStoredUserInfo$NullableStoredUserInfo esStoredUserInfo$NullableStoredUserInfo = new EsStoredUserInfo$NullableStoredUserInfo();
        DEFAULT_INSTANCE = esStoredUserInfo$NullableStoredUserInfo;
        AbstractC0269h.registerDefaultInstance(EsStoredUserInfo$NullableStoredUserInfo.class, esStoredUserInfo$NullableStoredUserInfo);
    }

    private EsStoredUserInfo$NullableStoredUserInfo() {
    }

    /* JADX INFO: renamed from: p */
    public static EsStoredUserInfo$NullableStoredUserInfo m7499p(byte[] bArr) {
        return (EsStoredUserInfo$NullableStoredUserInfo) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr);
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001<\u0000\u0002?\u0000", new Object[]{"userInfo_", "userInfoCase_", EsStoredUserInfo$StoredUserInfo.class});
        }
        if (iOrdinal == 3) {
            return new EsStoredUserInfo$NullableStoredUserInfo();
        }
        if (iOrdinal == 4) {
            return new vnw(DEFAULT_INSTANCE, 14);
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
        synchronized (EsStoredUserInfo$NullableStoredUserInfo.class) {
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
    public final EsStoredUserInfo$StoredUserInfo m7500n() {
        return this.userInfoCase_ == 1 ? (EsStoredUserInfo$StoredUserInfo) this.userInfo_ : EsStoredUserInfo$StoredUserInfo.m7504q();
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final boolean m7501o() {
        return this.userInfoCase_ == 1;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
