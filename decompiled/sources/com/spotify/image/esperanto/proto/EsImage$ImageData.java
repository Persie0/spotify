package com.spotify.image.esperanto.proto;

import com.google.protobuf.AbstractC0269h;
import com.spotify.concertcampaignview.p047v1.CtaType;
import p204p.gva;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.xkw;
import p204p.ykw;
import p204p.z110;

/* JADX INFO: loaded from: classes2.dex */
public final class EsImage$ImageData extends AbstractC0269h implements sre0 {
    public static final int DATA_FIELD_NUMBER = 3;
    private static final EsImage$ImageData DEFAULT_INSTANCE;
    public static final int ERROR_FIELD_NUMBER = 1;
    private static volatile r2n0 PARSER = null;
    public static final int SCALE_FACTOR_FIELD_NUMBER = 4;
    public static final int SOURCE_FIELD_NUMBER = 2;
    private int bitField0_;
    private gva data_ = gva.f84678b;
    private int error_;
    private float scaleFactor_;
    private int source_;

    static {
        EsImage$ImageData esImage$ImageData = new EsImage$ImageData();
        DEFAULT_INSTANCE = esImage$ImageData;
        AbstractC0269h.registerDefaultInstance(EsImage$ImageData.class, esImage$ImageData);
    }

    private EsImage$ImageData() {
    }

    /* JADX INFO: renamed from: n */
    public static void m12005n(EsImage$ImageData esImage$ImageData) {
        esImage$ImageData.error_ = CtaType.CTA_NOT_INTERESTED_FIELD_NUMBER;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: s */
    public static xkw m12007s() {
        return (xkw) DEFAULT_INSTANCE.createBuilder();
    }

    /* JADX INFO: renamed from: t */
    public static EsImage$ImageData m12008t(byte[] bArr) {
        return (EsImage$ImageData) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u0004\u0002\f\u0003\n\u0004ခ\u0000", new Object[]{"bitField0_", "error_", "source_", "data_", "scaleFactor_"});
        }
        if (iOrdinal == 3) {
            return new EsImage$ImageData();
        }
        if (iOrdinal == 4) {
            return new xkw();
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
        synchronized (EsImage$ImageData.class) {
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

    public final gva getData() {
        return this.data_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.sre0
    public final /* bridge */ /* synthetic */ pre0 getDefaultInstanceForType() {
        return getDefaultInstanceForType();
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: p */
    public final int m12009p() {
        return this.error_;
    }

    /* JADX INFO: renamed from: q */
    public final float m12010q() {
        return this.scaleFactor_;
    }

    /* JADX INFO: renamed from: r */
    public final ykw m12011r() {
        ykw ykwVar;
        int i = this.source_;
        if (i == 0) {
            ykwVar = ykw.UNKNOWN;
        } else if (i == 1) {
            ykwVar = ykw.LOCAL_FILE;
        } else if (i != 2) {
            ykwVar = i != 3 ? null : ykw.NETWORK;
        } else {
            ykwVar = ykw.CACHE;
        }
        return ykwVar == null ? ykw.UNRECOGNIZED : ykwVar;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
