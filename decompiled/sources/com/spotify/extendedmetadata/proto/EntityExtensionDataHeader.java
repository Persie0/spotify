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
public final class EntityExtensionDataHeader extends AbstractC0269h implements sre0 {
    public static final int CACHE_TTL_IN_SECONDS_FIELD_NUMBER = 4;
    private static final EntityExtensionDataHeader DEFAULT_INSTANCE;
    public static final int ETAG_FIELD_NUMBER = 2;
    public static final int LOCALE_FIELD_NUMBER = 3;
    public static final int OFFLINE_TTL_IN_SECONDS_FIELD_NUMBER = 5;
    private static volatile r2n0 PARSER = null;
    public static final int STATUS_CODE_FIELD_NUMBER = 1;
    private long cacheTtlInSeconds_;
    private String etag_ = "";
    private String locale_ = "";
    private long offlineTtlInSeconds_;
    private int statusCode_;

    static {
        EntityExtensionDataHeader entityExtensionDataHeader = new EntityExtensionDataHeader();
        DEFAULT_INSTANCE = entityExtensionDataHeader;
        AbstractC0269h.registerDefaultInstance(EntityExtensionDataHeader.class, entityExtensionDataHeader);
    }

    private EntityExtensionDataHeader() {
    }

    /* JADX INFO: renamed from: n */
    public static EntityExtensionDataHeader m10544n() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001\u0004\u0002Ȉ\u0003Ȉ\u0004\u0002\u0005\u0002", new Object[]{"statusCode_", "etag_", "locale_", "cacheTtlInSeconds_", "offlineTtlInSeconds_"});
        }
        if (iOrdinal == 3) {
            return new EntityExtensionDataHeader();
        }
        if (iOrdinal == 4) {
            return new z5u(DEFAULT_INSTANCE, 28);
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
        synchronized (EntityExtensionDataHeader.class) {
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

    public final int getStatusCode() {
        return this.statusCode_;
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
