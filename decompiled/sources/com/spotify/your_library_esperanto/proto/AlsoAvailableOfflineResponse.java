package com.spotify.your_library_esperanto.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes11.dex */
public final class AlsoAvailableOfflineResponse extends AbstractC0269h implements sre0 {
    public static final int DATA_FIELD_NUMBER = 2;
    private static final AlsoAvailableOfflineResponse DEFAULT_INSTANCE;
    public static final int ERROR_RESULT_FIELD_NUMBER = 3;
    public static final int LOADING_FIELD_NUMBER = 1;
    private static volatile r2n0 PARSER;
    private int resultCase_ = 0;
    private Object result_;

    public static final class Loading extends AbstractC0269h implements sre0 {
        private static final Loading DEFAULT_INSTANCE;
        private static volatile r2n0 PARSER;

        static {
            Loading loading = new Loading();
            DEFAULT_INSTANCE = loading;
            AbstractC0269h.registerDefaultInstance(Loading.class, loading);
        }

        private Loading() {
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
                return new Loading();
            }
            if (iOrdinal == 4) {
                return new C1396b(DEFAULT_INSTANCE);
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
            synchronized (Loading.class) {
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
        AlsoAvailableOfflineResponse alsoAvailableOfflineResponse = new AlsoAvailableOfflineResponse();
        DEFAULT_INSTANCE = alsoAvailableOfflineResponse;
        AbstractC0269h.registerDefaultInstance(AlsoAvailableOfflineResponse.class, alsoAvailableOfflineResponse);
    }

    private AlsoAvailableOfflineResponse() {
    }

    /* JADX INFO: renamed from: o */
    public static AlsoAvailableOfflineResponse m23244o(byte[] bArr) {
        return (AlsoAvailableOfflineResponse) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr);
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0001\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000", new Object[]{"result_", "resultCase_", Loading.class, AlsoAvailableOfflineData.class, AlsoAvailableOfflineError.class});
        }
        if (iOrdinal == 3) {
            return new AlsoAvailableOfflineResponse();
        }
        if (iOrdinal == 4) {
            return new C1395a(DEFAULT_INSTANCE);
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
        synchronized (AlsoAvailableOfflineResponse.class) {
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

    public final boolean hasData() {
        return this.resultCase_ == 2;
    }

    /* JADX INFO: renamed from: n */
    public final AlsoAvailableOfflineData m23245n() {
        return this.resultCase_ == 2 ? (AlsoAvailableOfflineData) this.result_ : AlsoAvailableOfflineData.m23241n();
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
