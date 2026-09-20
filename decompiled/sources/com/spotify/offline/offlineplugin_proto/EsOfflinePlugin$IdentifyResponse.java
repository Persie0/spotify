package com.spotify.offline.offlineplugin_proto;

import com.google.protobuf.AbstractC0269h;
import p204p.ihc0;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes9.dex */
public final class EsOfflinePlugin$IdentifyResponse extends AbstractC0269h implements sre0 {
    private static final EsOfflinePlugin$IdentifyResponse DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER = null;
    public static final int RESULTS_FIELD_NUMBER = 1;
    private ihc0 results_ = ihc0.f102235b;

    public static final class Result extends AbstractC0269h implements sre0 {
        private static final Result DEFAULT_INSTANCE;
        public static final int ESTIMATED_FILE_SIZE_FIELD_NUMBER = 2;
        private static volatile r2n0 PARSER = null;
        public static final int STATUS_FIELD_NUMBER = 1;
        private long estimatedFileSize_;
        private int status_;

        static {
            Result result = new Result();
            DEFAULT_INSTANCE = result;
            AbstractC0269h.registerDefaultInstance(Result.class, result);
        }

        private Result() {
        }

        /* JADX INFO: renamed from: n */
        public static void m16053n(Result result) {
            result.estimatedFileSize_ = 10L;
        }

        /* JADX INFO: renamed from: o */
        public static void m16054o(Result result, EnumC1081g enumC1081g) {
            result.getClass();
            result.status_ = enumC1081g.getNumber();
        }

        /* JADX INFO: renamed from: p */
        public static Result m16055p() {
            return DEFAULT_INSTANCE;
        }

        public static r2n0 parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: renamed from: q */
        public static C1080f m16056q() {
            return (C1080f) DEFAULT_INSTANCE.createBuilder();
        }

        @Override // com.google.protobuf.AbstractC0269h
        public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
            r2n0 r110Var;
            int iOrdinal = z110Var.ordinal();
            if (iOrdinal == 0) {
                return (byte) 1;
            }
            if (iOrdinal == 2) {
                return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002\u0002", new Object[]{"status_", "estimatedFileSize_"});
            }
            if (iOrdinal == 3) {
                return new Result();
            }
            if (iOrdinal == 4) {
                return new C1080f(DEFAULT_INSTANCE);
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
            synchronized (Result.class) {
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
        EsOfflinePlugin$IdentifyResponse esOfflinePlugin$IdentifyResponse = new EsOfflinePlugin$IdentifyResponse();
        DEFAULT_INSTANCE = esOfflinePlugin$IdentifyResponse;
        AbstractC0269h.registerDefaultInstance(EsOfflinePlugin$IdentifyResponse.class, esOfflinePlugin$IdentifyResponse);
    }

    private EsOfflinePlugin$IdentifyResponse() {
    }

    /* JADX INFO: renamed from: n */
    public static ihc0 m16051n(EsOfflinePlugin$IdentifyResponse esOfflinePlugin$IdentifyResponse) {
        ihc0 ihc0Var = esOfflinePlugin$IdentifyResponse.results_;
        if (!ihc0Var.f102236a) {
            esOfflinePlugin$IdentifyResponse.results_ = ihc0Var.m50613h();
        }
        return esOfflinePlugin$IdentifyResponse.results_;
    }

    /* JADX INFO: renamed from: o */
    public static C1079e m16052o() {
        return (C1079e) DEFAULT_INSTANCE.createBuilder();
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"results_", AbstractC1082h.f6396a});
        }
        if (iOrdinal == 3) {
            return new EsOfflinePlugin$IdentifyResponse();
        }
        if (iOrdinal == 4) {
            return new C1079e(DEFAULT_INSTANCE);
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
        synchronized (EsOfflinePlugin$IdentifyResponse.class) {
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
