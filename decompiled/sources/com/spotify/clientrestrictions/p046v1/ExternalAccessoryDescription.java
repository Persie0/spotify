package com.spotify.clientrestrictions.p046v1;

import com.google.protobuf.AbstractC0269h;
import p204p.mlx;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes5.dex */
public final class ExternalAccessoryDescription extends AbstractC0269h implements sre0 {
    public static final int CATEGORY_FIELD_NUMBER = 5;
    public static final int CLIENT_ID_FIELD_NUMBER = 2;
    public static final int COMPANY_FIELD_NUMBER = 6;
    private static final ExternalAccessoryDescription DEFAULT_INSTANCE;
    public static final int INTEGRATION_FIELD_NUMBER = 1;
    public static final int MODEL_FIELD_NUMBER = 7;
    public static final int NAME_FIELD_NUMBER = 3;
    private static volatile r2n0 PARSER = null;
    public static final int PROTOCOL_FIELD_NUMBER = 9;
    public static final int SENDER_ID_FIELD_NUMBER = 10;
    public static final int TRANSPORT_TYPE_FIELD_NUMBER = 4;
    public static final int VERSION_FIELD_NUMBER = 8;
    private int bitField0_;
    private String integration_ = "";
    private String clientId_ = "";
    private String name_ = "";
    private String transportType_ = "";
    private String category_ = "";
    private String company_ = "";
    private String model_ = "";
    private String version_ = "";
    private String protocol_ = "";
    private String senderId_ = "";

    static {
        ExternalAccessoryDescription externalAccessoryDescription = new ExternalAccessoryDescription();
        DEFAULT_INSTANCE = externalAccessoryDescription;
        AbstractC0269h.registerDefaultInstance(ExternalAccessoryDescription.class, externalAccessoryDescription);
    }

    private ExternalAccessoryDescription() {
    }

    /* JADX INFO: renamed from: p */
    public static ExternalAccessoryDescription m6776p() {
        return DEFAULT_INSTANCE;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: A */
    public final boolean m6777A() {
        return (this.bitField0_ & 512) != 0;
    }

    /* JADX INFO: renamed from: B */
    public final boolean m6778B() {
        return (this.bitField0_ & 8) != 0;
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\n\u0000\u0001\u0001\n\n\u0000\u0000\u0000\u0001ለ\u0000\u0002ለ\u0001\u0003ለ\u0002\u0004ለ\u0003\u0005ለ\u0004\u0006ለ\u0005\u0007ለ\u0006\bለ\u0007\tለ\b\nለ\t", new Object[]{"bitField0_", "integration_", "clientId_", "name_", "transportType_", "category_", "company_", "model_", "version_", "protocol_", "senderId_"});
        }
        if (iOrdinal == 3) {
            return new ExternalAccessoryDescription();
        }
        if (iOrdinal == 4) {
            return new mlx(DEFAULT_INSTANCE, 8);
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
        synchronized (ExternalAccessoryDescription.class) {
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

    public final String getClientId() {
        return this.clientId_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.sre0
    public final /* bridge */ /* synthetic */ pre0 getDefaultInstanceForType() {
        return getDefaultInstanceForType();
    }

    public final String getName() {
        return this.name_;
    }

    public final String getVersion() {
        return this.version_;
    }

    public final boolean hasClientId() {
        return (this.bitField0_ & 2) != 0;
    }

    public final boolean hasName() {
        return (this.bitField0_ & 4) != 0;
    }

    public final boolean hasVersion() {
        return (this.bitField0_ & 128) != 0;
    }

    /* JADX INFO: renamed from: n */
    public final String m6779n() {
        return this.category_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final String m6780o() {
        return this.company_;
    }

    /* JADX INFO: renamed from: q */
    public final String m6781q() {
        return this.integration_;
    }

    /* JADX INFO: renamed from: r */
    public final String m6782r() {
        return this.model_;
    }

    /* JADX INFO: renamed from: s */
    public final String m6783s() {
        return this.protocol_;
    }

    /* JADX INFO: renamed from: t */
    public final String m6784t() {
        return this.senderId_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }

    /* JADX INFO: renamed from: u */
    public final String m6785u() {
        return this.transportType_;
    }

    /* JADX INFO: renamed from: v */
    public final boolean m6786v() {
        return (this.bitField0_ & 16) != 0;
    }

    /* JADX INFO: renamed from: w */
    public final boolean m6787w() {
        return (this.bitField0_ & 32) != 0;
    }

    /* JADX INFO: renamed from: x */
    public final boolean m6788x() {
        return (this.bitField0_ & 1) != 0;
    }

    /* JADX INFO: renamed from: y */
    public final boolean m6789y() {
        return (this.bitField0_ & 64) != 0;
    }

    /* JADX INFO: renamed from: z */
    public final boolean m6790z() {
        return (this.bitField0_ & 256) != 0;
    }
}
