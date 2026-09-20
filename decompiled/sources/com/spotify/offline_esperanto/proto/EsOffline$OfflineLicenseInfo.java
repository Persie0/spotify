package com.spotify.offline_esperanto.proto;

import com.google.protobuf.AbstractC0269h;
import com.google.protobuf.Timestamp;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes9.dex */
public final class EsOffline$OfflineLicenseInfo extends AbstractC0269h implements sre0 {
    private static final EsOffline$OfflineLicenseInfo DEFAULT_INSTANCE;
    public static final int EXPIRY_FIELD_NUMBER = 1;
    private static volatile r2n0 PARSER;
    private int bitField0_;
    private Expiry expiry_;

    public static final class Expiry extends AbstractC0269h implements sre0 {
        private static final Expiry DEFAULT_INSTANCE;
        public static final int EPISODE_FIELD_NUMBER = 2;
        private static volatile r2n0 PARSER = null;
        public static final int TRACK_FIELD_NUMBER = 1;
        private int bitField0_;
        private Timestamp episode_;
        private Timestamp track_;

        static {
            Expiry expiry = new Expiry();
            DEFAULT_INSTANCE = expiry;
            AbstractC0269h.registerDefaultInstance(Expiry.class, expiry);
        }

        private Expiry() {
        }

        /* JADX INFO: renamed from: n */
        public static Expiry m16174n() {
            return DEFAULT_INSTANCE;
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
                return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"bitField0_", "track_", "episode_"});
            }
            if (iOrdinal == 3) {
                return new Expiry();
            }
            if (iOrdinal == 4) {
                return new C1094f(DEFAULT_INSTANCE);
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
            synchronized (Expiry.class) {
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

        /* JADX INFO: renamed from: o */
        public final Timestamp m16175o() {
            Timestamp timestamp = this.episode_;
            return timestamp == null ? Timestamp.m1965q() : timestamp;
        }

        /* JADX INFO: renamed from: p */
        public final Timestamp m16176p() {
            Timestamp timestamp = this.track_;
            return timestamp == null ? Timestamp.m1965q() : timestamp;
        }

        @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
        public final /* bridge */ /* synthetic */ ore0 toBuilder() {
            return toBuilder();
        }
    }

    static {
        EsOffline$OfflineLicenseInfo esOffline$OfflineLicenseInfo = new EsOffline$OfflineLicenseInfo();
        DEFAULT_INSTANCE = esOffline$OfflineLicenseInfo;
        AbstractC0269h.registerDefaultInstance(EsOffline$OfflineLicenseInfo.class, esOffline$OfflineLicenseInfo);
    }

    private EsOffline$OfflineLicenseInfo() {
    }

    /* JADX INFO: renamed from: o */
    public static EsOffline$OfflineLicenseInfo m16172o(byte[] bArr) {
        return (EsOffline$OfflineLicenseInfo) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr);
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"bitField0_", "expiry_"});
        }
        if (iOrdinal == 3) {
            return new EsOffline$OfflineLicenseInfo();
        }
        if (iOrdinal == 4) {
            return new C1093e(DEFAULT_INSTANCE);
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
        synchronized (EsOffline$OfflineLicenseInfo.class) {
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
    public final Expiry m16173n() {
        Expiry expiry = this.expiry_;
        return expiry == null ? Expiry.m16174n() : expiry;
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
