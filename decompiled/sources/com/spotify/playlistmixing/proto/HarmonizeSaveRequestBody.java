package com.spotify.playlistmixing.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.cd20;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes9.dex */
public final class HarmonizeSaveRequestBody extends AbstractC0269h implements sre0 {
    public static final int CHAINS_FIELD_NUMBER = 5;
    private static final HarmonizeSaveRequestBody DEFAULT_INSTANCE;
    public static final int ETAG_FIELD_NUMBER = 2;
    public static final int EXCLUSIONS_FIELD_NUMBER = 3;
    public static final int MANUALOPS_FIELD_NUMBER = 4;
    private static volatile r2n0 PARSER = null;
    public static final int URI_FIELD_NUMBER = 1;
    private int bitField0_;
    private Chains chains_;
    private Exclusions exclusions_;
    private ManualOps manualOps_;
    private String uri_ = "";
    private String etag_ = "";

    static {
        HarmonizeSaveRequestBody harmonizeSaveRequestBody = new HarmonizeSaveRequestBody();
        DEFAULT_INSTANCE = harmonizeSaveRequestBody;
        AbstractC0269h.registerDefaultInstance(HarmonizeSaveRequestBody.class, harmonizeSaveRequestBody);
    }

    private HarmonizeSaveRequestBody() {
    }

    /* JADX INFO: renamed from: n */
    public static void m19400n(HarmonizeSaveRequestBody harmonizeSaveRequestBody, Chains chains) {
        harmonizeSaveRequestBody.getClass();
        harmonizeSaveRequestBody.chains_ = chains;
        harmonizeSaveRequestBody.bitField0_ |= 4;
    }

    /* JADX INFO: renamed from: o */
    public static void m19401o(HarmonizeSaveRequestBody harmonizeSaveRequestBody, String str) {
        harmonizeSaveRequestBody.getClass();
        str.getClass();
        harmonizeSaveRequestBody.etag_ = str;
    }

    /* JADX INFO: renamed from: p */
    public static void m19402p(HarmonizeSaveRequestBody harmonizeSaveRequestBody, Exclusions exclusions) {
        harmonizeSaveRequestBody.getClass();
        exclusions.getClass();
        harmonizeSaveRequestBody.exclusions_ = exclusions;
        harmonizeSaveRequestBody.bitField0_ |= 1;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static void m19403q(HarmonizeSaveRequestBody harmonizeSaveRequestBody, ManualOps manualOps) {
        harmonizeSaveRequestBody.getClass();
        harmonizeSaveRequestBody.manualOps_ = manualOps;
        harmonizeSaveRequestBody.bitField0_ |= 2;
    }

    /* JADX INFO: renamed from: r */
    public static void m19404r(HarmonizeSaveRequestBody harmonizeSaveRequestBody, String str) {
        harmonizeSaveRequestBody.getClass();
        str.getClass();
        harmonizeSaveRequestBody.uri_ = str;
    }

    /* JADX INFO: renamed from: s */
    public static cd20 m19405s() {
        return (cd20) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003ဉ\u0000\u0004ဉ\u0001\u0005ဉ\u0002", new Object[]{"bitField0_", "uri_", "etag_", "exclusions_", "manualOps_", "chains_"});
        }
        if (iOrdinal == 3) {
            return new HarmonizeSaveRequestBody();
        }
        if (iOrdinal == 4) {
            return new cd20(DEFAULT_INSTANCE);
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
        synchronized (HarmonizeSaveRequestBody.class) {
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
