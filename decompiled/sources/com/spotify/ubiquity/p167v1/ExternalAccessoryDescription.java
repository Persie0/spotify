package com.spotify.ubiquity.p167v1;

import com.google.protobuf.AbstractC0269h;
import p204p.bwx;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes2.dex */
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

    /* JADX INFO: renamed from: n */
    public static void m21858n(ExternalAccessoryDescription externalAccessoryDescription, String str) {
        externalAccessoryDescription.getClass();
        externalAccessoryDescription.bitField0_ |= 16;
        externalAccessoryDescription.category_ = str;
    }

    /* JADX INFO: renamed from: o */
    public static void m21859o(ExternalAccessoryDescription externalAccessoryDescription, String str) {
        externalAccessoryDescription.getClass();
        externalAccessoryDescription.bitField0_ |= 8;
        externalAccessoryDescription.transportType_ = str;
    }

    /* JADX INFO: renamed from: p */
    public static bwx m21860p() {
        return (bwx) DEFAULT_INSTANCE.createBuilder();
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\n\u0000\u0001\u0001\n\n\u0000\u0000\u0000\u0001ለ\u0000\u0002ለ\u0001\u0003ለ\u0002\u0004ለ\u0003\u0005ለ\u0004\u0006ለ\u0005\u0007ለ\u0006\bለ\u0007\tለ\b\nለ\t", new Object[]{"bitField0_", "integration_", "clientId_", "name_", "transportType_", "category_", "company_", "model_", "version_", "protocol_", "senderId_"});
        }
        if (iOrdinal == 3) {
            return new ExternalAccessoryDescription();
        }
        if (iOrdinal == 4) {
            return new bwx(DEFAULT_INSTANCE);
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
