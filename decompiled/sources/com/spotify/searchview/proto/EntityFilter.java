package com.spotify.searchview.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.rgv;
import p204p.sre0;
import p204p.z110;
import p204p.z5u;

/* JADX INFO: loaded from: classes10.dex */
public final class EntityFilter extends AbstractC0269h implements sre0 {
    private static final EntityFilter DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER = null;
    public static final int TYPE_FIELD_NUMBER = 1;
    private int type_;

    static {
        EntityFilter entityFilter = new EntityFilter();
        DEFAULT_INSTANCE = entityFilter;
        AbstractC0269h.registerDefaultInstance(EntityFilter.class, entityFilter);
    }

    private EntityFilter() {
    }

    /* JADX INFO: renamed from: n */
    public static EntityFilter m20832n() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\f", new Object[]{"type_"});
        }
        if (iOrdinal == 3) {
            return new EntityFilter();
        }
        if (iOrdinal == 4) {
            return new z5u(DEFAULT_INSTANCE, 29);
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
        synchronized (EntityFilter.class) {
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
    public final rgv m20833o() {
        rgv rgvVar;
        switch (this.type_) {
            case 0:
                rgvVar = rgv.ENTITY_FILTER_TYPE_UNKNOWN;
                break;
            case 1:
                rgvVar = rgv.ENTITY_FILTER_TYPE_ARTIST;
                break;
            case 2:
                rgvVar = rgv.ENTITY_FILTER_TYPE_TRACK;
                break;
            case 3:
                rgvVar = rgv.ENTITY_FILTER_TYPE_ALBUM;
                break;
            case 4:
                rgvVar = rgv.ENTITY_FILTER_TYPE_PLAYLIST;
                break;
            case 5:
                rgvVar = rgv.ENTITY_FILTER_TYPE_GENRE;
                break;
            case 6:
                rgvVar = rgv.ENTITY_FILTER_TYPE_PROFILE;
                break;
            case 7:
                rgvVar = rgv.ENTITY_FILTER_TYPE_AUDIOBOOK;
                break;
            default:
                rgvVar = null;
                break;
        }
        return rgvVar == null ? rgv.UNRECOGNIZED : rgvVar;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
