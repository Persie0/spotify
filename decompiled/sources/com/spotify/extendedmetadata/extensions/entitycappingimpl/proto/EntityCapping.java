package com.spotify.extendedmetadata.extensions.entitycappingimpl.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.wdv;
import p204p.z110;
import p204p.z5u;

/* JADX INFO: loaded from: classes6.dex */
public final class EntityCapping extends AbstractC0269h implements sre0 {
    public static final int CAPPING_GROUP_FIELD_NUMBER = 1;
    private static final EntityCapping DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER;
    private int cappingGroup_;

    static {
        EntityCapping entityCapping = new EntityCapping();
        DEFAULT_INSTANCE = entityCapping;
        AbstractC0269h.registerDefaultInstance(EntityCapping.class, entityCapping);
    }

    private EntityCapping() {
    }

    /* JADX INFO: renamed from: o */
    public static EntityCapping m10110o(byte[] bArr) {
        return (EntityCapping) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr);
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\f", new Object[]{"cappingGroup_"});
        }
        if (iOrdinal == 3) {
            return new EntityCapping();
        }
        if (iOrdinal == 4) {
            return new z5u(DEFAULT_INSTANCE, 21);
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
        synchronized (EntityCapping.class) {
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
    public final wdv m10111n() {
        wdv wdvVar;
        int i = this.cappingGroup_;
        if (i != 0) {
            wdvVar = i != 1 ? null : wdv.ABP;
        } else {
            wdvVar = wdv.NO_CAPPING;
        }
        return wdvVar == null ? wdv.UNRECOGNIZED : wdvVar;
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
