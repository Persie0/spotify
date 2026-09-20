package com.spotify.offline_esperanto.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.AbstractC1733c9;
import p204p.AbstractC2118m8;
import p204p.ae50;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes2.dex */
public final class EsOffline$GetContextsRequest extends AbstractC0269h implements sre0 {
    private static final EsOffline$GetContextsRequest DEFAULT_INSTANCE;
    public static final int DEVICE_FIELD_NUMBER = 2;
    public static final int FILTERING_FIELD_NUMBER = 4;
    private static volatile r2n0 PARSER = null;
    public static final int POLICY_FIELD_NUMBER = 1;
    public static final int URIS_FIELD_NUMBER = 3;
    private int bitField0_;
    private EsOffline$DeviceKey device_;
    private Filtering filtering_;
    private EsOffline$ContextInfoPolicy policy_;
    private ae50 uris_ = AbstractC0269h.emptyProtobufList();

    public static final class Filtering extends AbstractC0269h implements sre0 {
        private static final Filtering DEFAULT_INSTANCE;
        public static final int ITEM_URIS_FIELD_NUMBER = 1;
        private static volatile r2n0 PARSER;
        private ae50 itemUris_ = AbstractC0269h.emptyProtobufList();

        static {
            Filtering filtering = new Filtering();
            DEFAULT_INSTANCE = filtering;
            AbstractC0269h.registerDefaultInstance(Filtering.class, filtering);
        }

        private Filtering() {
        }

        /* JADX INFO: renamed from: n */
        public static void m16138n(Filtering filtering, Iterable iterable) {
            ae50 ae50Var = filtering.itemUris_;
            if (!((AbstractC1733c9) ae50Var).f35342a) {
                filtering.itemUris_ = AbstractC0269h.mutableCopy(ae50Var);
            }
            AbstractC2118m8.addAll(iterable, filtering.itemUris_);
        }

        /* JADX INFO: renamed from: o */
        public static void m16139o(Filtering filtering, String str) {
            filtering.getClass();
            str.getClass();
            ae50 ae50Var = filtering.itemUris_;
            if (!((AbstractC1733c9) ae50Var).f35342a) {
                filtering.itemUris_ = AbstractC0269h.mutableCopy(ae50Var);
            }
            filtering.itemUris_.add(str);
        }

        public static r2n0 parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: renamed from: q */
        public static C1092d m16141q() {
            return (C1092d) DEFAULT_INSTANCE.createBuilder();
        }

        @Override // com.google.protobuf.AbstractC0269h
        public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
            r2n0 r110Var;
            int iOrdinal = z110Var.ordinal();
            if (iOrdinal == 0) {
                return (byte) 1;
            }
            if (iOrdinal == 2) {
                return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001Ț", new Object[]{"itemUris_"});
            }
            if (iOrdinal == 3) {
                return new Filtering();
            }
            if (iOrdinal == 4) {
                return new C1092d();
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
            synchronized (Filtering.class) {
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
        EsOffline$GetContextsRequest esOffline$GetContextsRequest = new EsOffline$GetContextsRequest();
        DEFAULT_INSTANCE = esOffline$GetContextsRequest;
        AbstractC0269h.registerDefaultInstance(EsOffline$GetContextsRequest.class, esOffline$GetContextsRequest);
    }

    private EsOffline$GetContextsRequest() {
    }

    /* JADX INFO: renamed from: n */
    public static void m16131n(EsOffline$GetContextsRequest esOffline$GetContextsRequest, Iterable iterable) {
        ae50 ae50Var = esOffline$GetContextsRequest.uris_;
        if (!((AbstractC1733c9) ae50Var).f35342a) {
            esOffline$GetContextsRequest.uris_ = AbstractC0269h.mutableCopy(ae50Var);
        }
        AbstractC2118m8.addAll(iterable, esOffline$GetContextsRequest.uris_);
    }

    /* JADX INFO: renamed from: o */
    public static void m16132o(EsOffline$GetContextsRequest esOffline$GetContextsRequest, String str) {
        esOffline$GetContextsRequest.getClass();
        ae50 ae50Var = esOffline$GetContextsRequest.uris_;
        if (!((AbstractC1733c9) ae50Var).f35342a) {
            esOffline$GetContextsRequest.uris_ = AbstractC0269h.mutableCopy(ae50Var);
        }
        esOffline$GetContextsRequest.uris_.add(str);
    }

    /* JADX INFO: renamed from: p */
    public static void m16133p(EsOffline$GetContextsRequest esOffline$GetContextsRequest, EsOffline$DeviceKey esOffline$DeviceKey) {
        esOffline$GetContextsRequest.getClass();
        esOffline$DeviceKey.getClass();
        esOffline$GetContextsRequest.device_ = esOffline$DeviceKey;
        esOffline$GetContextsRequest.bitField0_ |= 2;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static void m16134q(EsOffline$GetContextsRequest esOffline$GetContextsRequest, Filtering filtering) {
        esOffline$GetContextsRequest.getClass();
        filtering.getClass();
        esOffline$GetContextsRequest.filtering_ = filtering;
        esOffline$GetContextsRequest.bitField0_ |= 4;
    }

    /* JADX INFO: renamed from: r */
    public static void m16135r(EsOffline$GetContextsRequest esOffline$GetContextsRequest, EsOffline$ContextInfoPolicy esOffline$ContextInfoPolicy) {
        esOffline$GetContextsRequest.getClass();
        esOffline$ContextInfoPolicy.getClass();
        esOffline$GetContextsRequest.policy_ = esOffline$ContextInfoPolicy;
        esOffline$GetContextsRequest.bitField0_ |= 1;
    }

    /* JADX INFO: renamed from: s */
    public static EsOffline$GetContextsRequest m16136s() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: renamed from: t */
    public static C1091c m16137t() {
        return (C1091c) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003Ț\u0004ဉ\u0002", new Object[]{"bitField0_", "policy_", "device_", "uris_", "filtering_"});
        }
        if (iOrdinal == 3) {
            return new EsOffline$GetContextsRequest();
        }
        if (iOrdinal == 4) {
            return new C1091c(DEFAULT_INSTANCE);
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
        synchronized (EsOffline$GetContextsRequest.class) {
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
