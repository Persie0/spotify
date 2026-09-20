package com.spotify.extendedmetadata.proto;

import com.google.protobuf.AbstractC0269h;
import com.google.protobuf.Any;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;
import p204p.z5u;

/* JADX INFO: loaded from: classes6.dex */
public final class EntityExtensionData extends AbstractC0269h implements sre0 {
    private static final EntityExtensionData DEFAULT_INSTANCE;
    public static final int ENTITY_URI_FIELD_NUMBER = 2;
    public static final int EXTENSION_DATA_FIELD_NUMBER = 3;
    public static final int HEADER_FIELD_NUMBER = 1;
    private static volatile r2n0 PARSER;
    private int bitField0_;
    private String entityUri_ = "";
    private Any extensionData_;
    private EntityExtensionDataHeader header_;

    static {
        EntityExtensionData entityExtensionData = new EntityExtensionData();
        DEFAULT_INSTANCE = entityExtensionData;
        AbstractC0269h.registerDefaultInstance(EntityExtensionData.class, entityExtensionData);
    }

    private EntityExtensionData() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002Ȉ\u0003ဉ\u0001", new Object[]{"bitField0_", "header_", "entityUri_", "extensionData_"});
        }
        if (iOrdinal == 3) {
            return new EntityExtensionData();
        }
        if (iOrdinal == 4) {
            return new z5u(DEFAULT_INSTANCE, 25);
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
        synchronized (EntityExtensionData.class) {
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
    public final String m10538n() {
        return this.entityUri_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final Any m10539o() {
        Any any = this.extensionData_;
        return any == null ? Any.m1909p() : any;
    }

    /* JADX INFO: renamed from: p */
    public final EntityExtensionDataHeader m10540p() {
        EntityExtensionDataHeader entityExtensionDataHeader = this.header_;
        return entityExtensionDataHeader == null ? EntityExtensionDataHeader.m10544n() : entityExtensionDataHeader;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
