package com.spotify.ucs.proto.p168v0;

import com.google.protobuf.AbstractC0269h;
import com.spotify.rcs.resolver.grpc.p141v0.ResolveRequest;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes2.dex */
public final class UcsRequest extends AbstractC0269h implements sre0 {
    public static final int ACCOUNT_ATTRIBUTES_REQUEST_FIELD_NUMBER = 3;
    public static final int CALLER_INFO_FIELD_NUMBER = 1;
    private static final UcsRequest DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER = null;
    public static final int RESOLVE_REQUEST_FIELD_NUMBER = 2;
    private AccountAttributesRequest accountAttributesRequest_;
    private int bitField0_;
    private CallerInfo callerInfo_;
    private ResolveRequest resolveRequest_;

    public static final class AccountAttributesRequest extends AbstractC0269h implements sre0 {
        private static final AccountAttributesRequest DEFAULT_INSTANCE;
        private static volatile r2n0 PARSER;

        static {
            AccountAttributesRequest accountAttributesRequest = new AccountAttributesRequest();
            DEFAULT_INSTANCE = accountAttributesRequest;
            AbstractC0269h.registerDefaultInstance(AccountAttributesRequest.class, accountAttributesRequest);
        }

        private AccountAttributesRequest() {
        }

        /* JADX INFO: renamed from: n */
        public static C1305a m21865n() {
            return (C1305a) DEFAULT_INSTANCE.createBuilder();
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
                return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0000", null);
            }
            if (iOrdinal == 3) {
                return new AccountAttributesRequest();
            }
            if (iOrdinal == 4) {
                return new C1305a(DEFAULT_INSTANCE);
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
            synchronized (AccountAttributesRequest.class) {
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

    public static final class CallerInfo extends AbstractC0269h implements sre0 {
        private static final CallerInfo DEFAULT_INSTANCE;
        private static volatile r2n0 PARSER = null;
        public static final int REASON_FIELD_NUMBER = 3;
        public static final int REQUEST_ORGIN_VERSION_FIELD_NUMBER = 2;
        public static final int REQUEST_ORIGIN_ID_FIELD_NUMBER = 1;
        private String requestOriginId_ = "";
        private String requestOrginVersion_ = "";
        private String reason_ = "";

        static {
            CallerInfo callerInfo = new CallerInfo();
            DEFAULT_INSTANCE = callerInfo;
            AbstractC0269h.registerDefaultInstance(CallerInfo.class, callerInfo);
        }

        private CallerInfo() {
        }

        /* JADX INFO: renamed from: n */
        public static void m21866n(CallerInfo callerInfo, String str) {
            callerInfo.getClass();
            str.getClass();
            callerInfo.reason_ = str;
        }

        /* JADX INFO: renamed from: o */
        public static void m21867o(CallerInfo callerInfo) {
            callerInfo.getClass();
            callerInfo.requestOrginVersion_ = "9.1.84.2205";
        }

        /* JADX INFO: renamed from: p */
        public static void m21868p(CallerInfo callerInfo) {
            callerInfo.getClass();
            callerInfo.requestOriginId_ = "com.spotify.music";
        }

        public static r2n0 parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: renamed from: q */
        public static C1307c m21869q() {
            return (C1307c) DEFAULT_INSTANCE.createBuilder();
        }

        @Override // com.google.protobuf.AbstractC0269h
        public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
            r2n0 r110Var;
            int iOrdinal = z110Var.ordinal();
            if (iOrdinal == 0) {
                return (byte) 1;
            }
            if (iOrdinal == 2) {
                return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ", new Object[]{"requestOriginId_", "requestOrginVersion_", "reason_"});
            }
            if (iOrdinal == 3) {
                return new CallerInfo();
            }
            if (iOrdinal == 4) {
                return new C1307c(DEFAULT_INSTANCE);
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
            synchronized (CallerInfo.class) {
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

    static {
        UcsRequest ucsRequest = new UcsRequest();
        DEFAULT_INSTANCE = ucsRequest;
        AbstractC0269h.registerDefaultInstance(UcsRequest.class, ucsRequest);
    }

    private UcsRequest() {
    }

    /* JADX INFO: renamed from: n */
    public static void m21861n(UcsRequest ucsRequest, AccountAttributesRequest accountAttributesRequest) {
        ucsRequest.getClass();
        accountAttributesRequest.getClass();
        ucsRequest.accountAttributesRequest_ = accountAttributesRequest;
        ucsRequest.bitField0_ |= 4;
    }

    /* JADX INFO: renamed from: o */
    public static void m21862o(UcsRequest ucsRequest, CallerInfo callerInfo) {
        ucsRequest.getClass();
        callerInfo.getClass();
        ucsRequest.callerInfo_ = callerInfo;
        ucsRequest.bitField0_ |= 1;
    }

    /* JADX INFO: renamed from: p */
    public static void m21863p(UcsRequest ucsRequest, ResolveRequest resolveRequest) {
        ucsRequest.getClass();
        ucsRequest.resolveRequest_ = resolveRequest;
        ucsRequest.bitField0_ |= 2;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static C1306b m21864q() {
        return (C1306b) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002", new Object[]{"bitField0_", "callerInfo_", "resolveRequest_", "accountAttributesRequest_"});
        }
        if (iOrdinal == 3) {
            return new UcsRequest();
        }
        if (iOrdinal == 4) {
            return new C1306b(DEFAULT_INSTANCE);
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
        synchronized (UcsRequest.class) {
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
