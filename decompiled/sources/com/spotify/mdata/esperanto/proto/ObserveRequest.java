package com.spotify.mdata.esperanto.proto;

import com.google.protobuf.AbstractC0269h;
import java.util.ArrayList;
import p204p.AbstractC1733c9;
import p204p.AbstractC2118m8;
import p204p.ae50;
import p204p.ntx;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes2.dex */
public final class ObserveRequest extends AbstractC0269h implements sre0 {
    private static final ObserveRequest DEFAULT_INSTANCE;
    public static final int EXTENSION_QUERY_FIELD_NUMBER = 1;
    public static final int FEATURE_ID_FIELD_NUMBER = 2;
    public static final int NOTIFY_ON_CHANGES_FIELD_NUMBER = 3;
    private static volatile r2n0 PARSER;
    private ae50 extensionQuery_ = AbstractC0269h.emptyProtobufList();
    private String featureId_ = "";
    private boolean notifyOnChanges_;

    public static final class ExtensionQuery extends AbstractC0269h implements sre0 {
        private static final ExtensionQuery DEFAULT_INSTANCE;
        public static final int ENTITY_URI_FIELD_NUMBER = 1;
        public static final int EXTENSION_KIND_FIELD_NUMBER = 2;
        public static final int NOTIFY_ON_LOCAL_CACHE_CHANGES_FIELD_NUMBER = 3;
        private static volatile r2n0 PARSER;
        private String entityUri_ = "";
        private int extensionKind_;
        private boolean notifyOnLocalCacheChanges_;

        static {
            ExtensionQuery extensionQuery = new ExtensionQuery();
            DEFAULT_INSTANCE = extensionQuery;
            AbstractC0269h.registerDefaultInstance(ExtensionQuery.class, extensionQuery);
        }

        private ExtensionQuery() {
        }

        /* JADX INFO: renamed from: n */
        public static void m13435n(ExtensionQuery extensionQuery, String str) {
            extensionQuery.getClass();
            str.getClass();
            extensionQuery.entityUri_ = str;
        }

        /* JADX INFO: renamed from: o */
        public static void m13436o(ExtensionQuery extensionQuery, ntx ntxVar) {
            extensionQuery.getClass();
            extensionQuery.extensionKind_ = ntxVar.getNumber();
        }

        /* JADX INFO: renamed from: p */
        public static void m13437p(ExtensionQuery extensionQuery, boolean z) {
            extensionQuery.notifyOnLocalCacheChanges_ = z;
        }

        public static r2n0 parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: renamed from: q */
        public static C0878b m13438q() {
            return (C0878b) DEFAULT_INSTANCE.createBuilder();
        }

        @Override // com.google.protobuf.AbstractC0269h
        public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
            r2n0 r110Var;
            int iOrdinal = z110Var.ordinal();
            if (iOrdinal == 0) {
                return (byte) 1;
            }
            if (iOrdinal == 2) {
                return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\f\u0003\u0007", new Object[]{"entityUri_", "extensionKind_", "notifyOnLocalCacheChanges_"});
            }
            if (iOrdinal == 3) {
                return new ExtensionQuery();
            }
            if (iOrdinal == 4) {
                return new C0878b(DEFAULT_INSTANCE);
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
            synchronized (ExtensionQuery.class) {
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
        ObserveRequest observeRequest = new ObserveRequest();
        DEFAULT_INSTANCE = observeRequest;
        AbstractC0269h.registerDefaultInstance(ObserveRequest.class, observeRequest);
    }

    private ObserveRequest() {
    }

    /* JADX INFO: renamed from: n */
    public static void m13431n(ObserveRequest observeRequest, ArrayList arrayList) {
        ae50 ae50Var = observeRequest.extensionQuery_;
        if (!((AbstractC1733c9) ae50Var).f35342a) {
            observeRequest.extensionQuery_ = AbstractC0269h.mutableCopy(ae50Var);
        }
        AbstractC2118m8.addAll(arrayList, observeRequest.extensionQuery_);
    }

    /* JADX INFO: renamed from: o */
    public static void m13432o(ObserveRequest observeRequest, String str) {
        observeRequest.getClass();
        str.getClass();
        observeRequest.featureId_ = str;
    }

    /* JADX INFO: renamed from: p */
    public static void m13433p(ObserveRequest observeRequest, boolean z) {
        observeRequest.notifyOnChanges_ = z;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static C0877a m13434q() {
        return (C0877a) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u001b\u0002Ȉ\u0003\u0007", new Object[]{"extensionQuery_", ExtensionQuery.class, "featureId_", "notifyOnChanges_"});
        }
        if (iOrdinal == 3) {
            return new ObserveRequest();
        }
        if (iOrdinal == 4) {
            return new C0877a(DEFAULT_INSTANCE);
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
        synchronized (ObserveRequest.class) {
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
