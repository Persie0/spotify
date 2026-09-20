package com.spotify.ads.esperanto.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.six0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes4.dex */
public final class SKAdNetworkData extends AbstractC0269h implements sre0 {
    public static final int ADVERTISED_APP_IDENTIFIER_FIELD_NUMBER = 9;
    private static final SKAdNetworkData DEFAULT_INSTANCE;
    public static final int NETWORK_IDENTIFIER_FIELD_NUMBER = 4;
    public static final int NONCE_FIELD_NUMBER = 7;
    private static volatile r2n0 PARSER = null;
    public static final int SIGNATURE_STORE_KIT_FIELD_NUMBER = 1;
    public static final int SIGNATURE_VIEW_THROUGH_FIELD_NUMBER = 2;
    public static final int SOURCE_APP_IDENTIFIER_FIELD_NUMBER = 8;
    public static final int SOURCE_IDENTIFIER_FIELD_NUMBER = 5;
    public static final int TIMESTAMP_FIELD_NUMBER = 6;
    public static final int VERSION_FIELD_NUMBER = 3;
    private long timestamp_;
    private String signatureStoreKit_ = "";
    private String signatureViewThrough_ = "";
    private String version_ = "";
    private String networkIdentifier_ = "";
    private String sourceIdentifier_ = "";
    private String nonce_ = "";
    private String sourceAppIdentifier_ = "";
    private String advertisedAppIdentifier_ = "";

    static {
        SKAdNetworkData sKAdNetworkData = new SKAdNetworkData();
        DEFAULT_INSTANCE = sKAdNetworkData;
        AbstractC0269h.registerDefaultInstance(SKAdNetworkData.class, sKAdNetworkData);
    }

    private SKAdNetworkData() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\t\u0000\u0000\u0001\t\t\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004Ȉ\u0005Ȉ\u0006\u0002\u0007Ȉ\bȈ\tȈ", new Object[]{"signatureStoreKit_", "signatureViewThrough_", "version_", "networkIdentifier_", "sourceIdentifier_", "timestamp_", "nonce_", "sourceAppIdentifier_", "advertisedAppIdentifier_"});
        }
        if (iOrdinal == 3) {
            return new SKAdNetworkData();
        }
        if (iOrdinal == 4) {
            return new six0(DEFAULT_INSTANCE, 10);
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
        synchronized (SKAdNetworkData.class) {
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
