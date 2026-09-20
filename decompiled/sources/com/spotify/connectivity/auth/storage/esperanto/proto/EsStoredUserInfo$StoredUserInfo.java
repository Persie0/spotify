package com.spotify.connectivity.auth.storage.esperanto.proto;

import com.google.protobuf.AbstractC0269h;
import com.spotify.connectivity.auth.common.esperanto.proto.EsAuthBlob$AuthBlob;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;
import p204p.zow;

/* JADX INFO: loaded from: classes.dex */
public final class EsStoredUserInfo$StoredUserInfo extends AbstractC0269h implements sre0 {
    public static final int AUTH_BLOB_FIELD_NUMBER = 2;
    private static final EsStoredUserInfo$StoredUserInfo DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER = null;
    public static final int USERNAME_FIELD_NUMBER = 1;
    private EsAuthBlob$AuthBlob authBlob_;
    private int bitField0_;
    private String username_ = "";

    static {
        EsStoredUserInfo$StoredUserInfo esStoredUserInfo$StoredUserInfo = new EsStoredUserInfo$StoredUserInfo();
        DEFAULT_INSTANCE = esStoredUserInfo$StoredUserInfo;
        AbstractC0269h.registerDefaultInstance(EsStoredUserInfo$StoredUserInfo.class, esStoredUserInfo$StoredUserInfo);
    }

    private EsStoredUserInfo$StoredUserInfo() {
    }

    /* JADX INFO: renamed from: n */
    public static void m7502n(EsStoredUserInfo$StoredUserInfo esStoredUserInfo$StoredUserInfo, EsAuthBlob$AuthBlob esAuthBlob$AuthBlob) {
        esStoredUserInfo$StoredUserInfo.getClass();
        esStoredUserInfo$StoredUserInfo.authBlob_ = esAuthBlob$AuthBlob;
        esStoredUserInfo$StoredUserInfo.bitField0_ |= 1;
    }

    /* JADX INFO: renamed from: o */
    public static void m7503o(EsStoredUserInfo$StoredUserInfo esStoredUserInfo$StoredUserInfo, String str) {
        esStoredUserInfo$StoredUserInfo.getClass();
        str.getClass();
        esStoredUserInfo$StoredUserInfo.username_ = str;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static EsStoredUserInfo$StoredUserInfo m7504q() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: renamed from: r */
    public static zow m7505r() {
        return (zow) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002ဉ\u0000", new Object[]{"bitField0_", "username_", "authBlob_"});
        }
        if (iOrdinal == 3) {
            return new EsStoredUserInfo$StoredUserInfo();
        }
        if (iOrdinal == 4) {
            return new zow(DEFAULT_INSTANCE);
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
        synchronized (EsStoredUserInfo$StoredUserInfo.class) {
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

    /* JADX INFO: renamed from: p */
    public final EsAuthBlob$AuthBlob m7506p() {
        EsAuthBlob$AuthBlob esAuthBlob$AuthBlob = this.authBlob_;
        return esAuthBlob$AuthBlob == null ? EsAuthBlob$AuthBlob.m7479o() : esAuthBlob$AuthBlob;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
