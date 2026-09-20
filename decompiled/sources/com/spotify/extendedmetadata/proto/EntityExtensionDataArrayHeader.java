package com.spotify.extendedmetadata.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;
import p204p.z5u;

/* JADX INFO: loaded from: classes6.dex */
public final class EntityExtensionDataArrayHeader extends AbstractC0269h implements sre0 {
    public static final int CACHE_TTL_IN_SECONDS_FIELD_NUMBER = 2;
    private static final EntityExtensionDataArrayHeader DEFAULT_INSTANCE;
    public static final int OFFLINE_TTL_IN_SECONDS_FIELD_NUMBER = 3;
    private static volatile r2n0 PARSER = null;
    public static final int PROVIDER_ERROR_STATUS_FIELD_NUMBER = 1;
    private long cacheTtlInSeconds_;
    private long offlineTtlInSeconds_;
    private int providerErrorStatus_;

    static {
        EntityExtensionDataArrayHeader entityExtensionDataArrayHeader = new EntityExtensionDataArrayHeader();
        DEFAULT_INSTANCE = entityExtensionDataArrayHeader;
        AbstractC0269h.registerDefaultInstance(EntityExtensionDataArrayHeader.class, entityExtensionDataArrayHeader);
    }

    private EntityExtensionDataArrayHeader() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0004\u0002\u0002\u0003\u0002", new Object[]{"providerErrorStatus_", "cacheTtlInSeconds_", "offlineTtlInSeconds_"});
        }
        if (iOrdinal == 3) {
            return new EntityExtensionDataArrayHeader();
        }
        if (iOrdinal == 4) {
            return new z5u(DEFAULT_INSTANCE, 27);
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
        synchronized (EntityExtensionDataArrayHeader.class) {
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
