package com.spotify.messages;

import com.google.protobuf.AbstractC0269h;
import p204p.e9a;
import p204p.f9a;
import p204p.ihc0;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes2.dex */
public final class BootstrapRequestNonAuth extends AbstractC0269h implements sre0 {
    private static final BootstrapRequestNonAuth DEFAULT_INSTANCE;
    public static final int ERROR_MESSAGE_FIELD_NUMBER = 5;
    public static final int ERROR_REASON_FIELD_NUMBER = 4;
    public static final int FETCHED_REASON_FIELD_NUMBER = 8;
    public static final int IDENTIFIERS_FIELD_NUMBER = 9;
    public static final int INSTALLATION_ID_FIELD_NUMBER = 6;
    public static final int LATENCY_FIELD_NUMBER = 1;
    private static volatile r2n0 PARSER = null;
    public static final int PAYLOAD_SIZE_FIELD_NUMBER = 2;
    public static final int RESPONSE_PAYLOAD_FIELD_NUMBER = 7;
    public static final int STATUS_CODE_FIELD_NUMBER = 3;
    private int bitField0_;
    private long latency_;
    private long payloadSize_;
    private int statusCode_;
    private ihc0 identifiers_ = ihc0.f102235b;
    private String errorReason_ = "";
    private String errorMessage_ = "";
    private String installationId_ = "";
    private String responsePayload_ = "";
    private String fetchedReason_ = "";

    static {
        BootstrapRequestNonAuth bootstrapRequestNonAuth = new BootstrapRequestNonAuth();
        DEFAULT_INSTANCE = bootstrapRequestNonAuth;
        AbstractC0269h.registerDefaultInstance(BootstrapRequestNonAuth.class, bootstrapRequestNonAuth);
    }

    private BootstrapRequestNonAuth() {
    }

    /* JADX INFO: renamed from: n */
    public static ihc0 m13713n(BootstrapRequestNonAuth bootstrapRequestNonAuth) {
        ihc0 ihc0Var = bootstrapRequestNonAuth.identifiers_;
        if (!ihc0Var.f102236a) {
            bootstrapRequestNonAuth.identifiers_ = ihc0Var.m50613h();
        }
        return bootstrapRequestNonAuth.identifiers_;
    }

    /* JADX INFO: renamed from: o */
    public static void m13714o(BootstrapRequestNonAuth bootstrapRequestNonAuth, String str) {
        bootstrapRequestNonAuth.getClass();
        str.getClass();
        bootstrapRequestNonAuth.bitField0_ |= 16;
        bootstrapRequestNonAuth.errorMessage_ = str;
    }

    /* JADX INFO: renamed from: p */
    public static void m13715p(BootstrapRequestNonAuth bootstrapRequestNonAuth, String str) {
        bootstrapRequestNonAuth.getClass();
        bootstrapRequestNonAuth.bitField0_ |= 8;
        bootstrapRequestNonAuth.errorReason_ = str;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static void m13716q(BootstrapRequestNonAuth bootstrapRequestNonAuth, String str) {
        bootstrapRequestNonAuth.getClass();
        bootstrapRequestNonAuth.bitField0_ |= 128;
        bootstrapRequestNonAuth.fetchedReason_ = str;
    }

    /* JADX INFO: renamed from: r */
    public static void m13717r(BootstrapRequestNonAuth bootstrapRequestNonAuth, long j) {
        bootstrapRequestNonAuth.bitField0_ |= 1;
        bootstrapRequestNonAuth.latency_ = j;
    }

    /* JADX INFO: renamed from: s */
    public static void m13718s(BootstrapRequestNonAuth bootstrapRequestNonAuth, long j) {
        bootstrapRequestNonAuth.bitField0_ |= 2;
        bootstrapRequestNonAuth.payloadSize_ = j;
    }

    /* JADX INFO: renamed from: t */
    public static void m13719t(BootstrapRequestNonAuth bootstrapRequestNonAuth, String str) {
        bootstrapRequestNonAuth.getClass();
        str.getClass();
        bootstrapRequestNonAuth.bitField0_ |= 64;
        bootstrapRequestNonAuth.responsePayload_ = str;
    }

    /* JADX INFO: renamed from: u */
    public static void m13720u(BootstrapRequestNonAuth bootstrapRequestNonAuth, int i) {
        bootstrapRequestNonAuth.bitField0_ |= 4;
        bootstrapRequestNonAuth.statusCode_ = i;
    }

    /* JADX INFO: renamed from: v */
    public static e9a m13721v() {
        return (e9a) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\t\u0000\u0001\u0001\t\t\u0001\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003င\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဈ\u0005\u0007ဈ\u0006\bဈ\u0007\t2", new Object[]{"bitField0_", "latency_", "payloadSize_", "statusCode_", "errorReason_", "errorMessage_", "installationId_", "responsePayload_", "fetchedReason_", "identifiers_", f9a.f67208a});
        }
        if (iOrdinal == 3) {
            return new BootstrapRequestNonAuth();
        }
        if (iOrdinal == 4) {
            return new e9a(DEFAULT_INSTANCE);
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
        synchronized (BootstrapRequestNonAuth.class) {
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
