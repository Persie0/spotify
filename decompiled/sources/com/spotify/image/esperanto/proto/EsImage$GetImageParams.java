package com.spotify.image.esperanto.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes2.dex */
public final class EsImage$GetImageParams extends AbstractC0269h implements sre0 {
    private static final EsImage$GetImageParams DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER = null;
    public static final int RESOLVE_FIELD_NUMBER = 2;
    public static final int URI_FIELD_NUMBER = 1;
    private int bitField0_;
    private Resolve resolve_;
    private String uri_ = "";

    public static final class Resolve extends AbstractC0269h implements sre0 {
        private static final Resolve DEFAULT_INSTANCE;
        private static volatile r2n0 PARSER = null;
        public static final int SIZE_FIELD_NUMBER = 1;
        private int bitField0_;
        private EsImage$Size size_;

        static {
            Resolve resolve = new Resolve();
            DEFAULT_INSTANCE = resolve;
            AbstractC0269h.registerDefaultInstance(Resolve.class, resolve);
        }

        private Resolve() {
        }

        /* JADX INFO: renamed from: n */
        public static void m12003n(Resolve resolve, EsImage$Size esImage$Size) {
            resolve.getClass();
            esImage$Size.getClass();
            resolve.size_ = esImage$Size;
            resolve.bitField0_ |= 1;
        }

        /* JADX INFO: renamed from: o */
        public static C0799b m12004o() {
            return (C0799b) DEFAULT_INSTANCE.createBuilder();
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
                return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"bitField0_", "size_"});
            }
            if (iOrdinal == 3) {
                return new Resolve();
            }
            if (iOrdinal == 4) {
                return new C0799b(DEFAULT_INSTANCE);
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
            synchronized (Resolve.class) {
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
        EsImage$GetImageParams esImage$GetImageParams = new EsImage$GetImageParams();
        DEFAULT_INSTANCE = esImage$GetImageParams;
        AbstractC0269h.registerDefaultInstance(EsImage$GetImageParams.class, esImage$GetImageParams);
    }

    private EsImage$GetImageParams() {
    }

    /* JADX INFO: renamed from: n */
    public static void m12000n(EsImage$GetImageParams esImage$GetImageParams, Resolve resolve) {
        esImage$GetImageParams.getClass();
        resolve.getClass();
        esImage$GetImageParams.resolve_ = resolve;
        esImage$GetImageParams.bitField0_ |= 1;
    }

    /* JADX INFO: renamed from: o */
    public static void m12001o(EsImage$GetImageParams esImage$GetImageParams, String str) {
        esImage$GetImageParams.getClass();
        str.getClass();
        esImage$GetImageParams.uri_ = str;
    }

    /* JADX INFO: renamed from: p */
    public static C0798a m12002p() {
        return (C0798a) DEFAULT_INSTANCE.createBuilder();
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002ဉ\u0000", new Object[]{"bitField0_", "uri_", "resolve_"});
        }
        if (iOrdinal == 3) {
            return new EsImage$GetImageParams();
        }
        if (iOrdinal == 4) {
            return new C0798a(DEFAULT_INSTANCE);
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
        synchronized (EsImage$GetImageParams.class) {
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
