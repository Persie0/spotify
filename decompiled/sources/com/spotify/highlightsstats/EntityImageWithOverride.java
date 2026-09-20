package com.spotify.highlightsstats;

import com.google.protobuf.AbstractC0269h;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.ugv;
import p204p.z110;

/* JADX INFO: loaded from: classes7.dex */
public final class EntityImageWithOverride extends AbstractC0269h implements sre0 {
    public static final int DEFAULT_FIELD_NUMBER = 1;
    private static final EntityImageWithOverride DEFAULT_INSTANCE;
    public static final int FALLBACK_FIELD_NUMBER = 2;
    private static volatile r2n0 PARSER;
    private int bitField0_;
    private EntityImage default_;
    private EntityImage fallback_;

    static {
        EntityImageWithOverride entityImageWithOverride = new EntityImageWithOverride();
        DEFAULT_INSTANCE = entityImageWithOverride;
        AbstractC0269h.registerDefaultInstance(EntityImageWithOverride.class, entityImageWithOverride);
    }

    private EntityImageWithOverride() {
    }

    /* JADX INFO: renamed from: o */
    public static EntityImageWithOverride m11283o() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"bitField0_", "default_", "fallback_"});
        }
        if (iOrdinal == 3) {
            return new EntityImageWithOverride();
        }
        if (iOrdinal == 4) {
            return new ugv(DEFAULT_INSTANCE, 1);
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
        synchronized (EntityImageWithOverride.class) {
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
    public final EntityImage m11284n() {
        EntityImage entityImage = this.default_;
        return entityImage == null ? EntityImage.m11281n() : entityImage;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: p */
    public final EntityImage m11285p() {
        EntityImage entityImage = this.fallback_;
        return entityImage == null ? EntityImage.m11281n() : entityImage;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
