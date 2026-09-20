package com.spotify.extendedmetadata.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.ae50;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;
import p204p.z5u;

/* JADX INFO: loaded from: classes2.dex */
public final class EntityExtensionDataArray extends AbstractC0269h implements sre0 {
    private static final EntityExtensionDataArray DEFAULT_INSTANCE;
    public static final int EXTENSION_DATA_FIELD_NUMBER = 3;
    public static final int EXTENSION_KIND_FIELD_NUMBER = 2;
    public static final int HEADER_FIELD_NUMBER = 1;
    private static volatile r2n0 PARSER;
    private int bitField0_;
    private ae50 extensionData_ = AbstractC0269h.emptyProtobufList();
    private int extensionKind_;
    private EntityExtensionDataArrayHeader header_;

    static {
        EntityExtensionDataArray entityExtensionDataArray = new EntityExtensionDataArray();
        DEFAULT_INSTANCE = entityExtensionDataArray;
        AbstractC0269h.registerDefaultInstance(EntityExtensionDataArray.class, entityExtensionDataArray);
    }

    private EntityExtensionDataArray() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဉ\u0000\u0002\f\u0003\u001b", new Object[]{"bitField0_", "header_", "extensionKind_", "extensionData_", EntityExtensionData.class});
        }
        if (iOrdinal == 3) {
            return new EntityExtensionDataArray();
        }
        if (iOrdinal == 4) {
            return new z5u(26);
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
        synchronized (EntityExtensionDataArray.class) {
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
    public final ae50 m10542o() {
        return this.extensionData_;
    }

    /* JADX INFO: renamed from: p */
    public final int m10543p() {
        return this.extensionKind_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
