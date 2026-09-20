package com.spotify.campfire.insights.proto.p038v1;

import com.google.protobuf.AbstractC0269h;
import p204p.ae50;
import p204p.mlv;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.ugv;
import p204p.z110;

/* JADX INFO: loaded from: classes5.dex */
public final class EntityMatchContent extends AbstractC0269h implements sre0 {
    private static final EntityMatchContent DEFAULT_INSTANCE;
    public static final int ENTITY_URI_FIELD_NUMBER = 2;
    private static volatile r2n0 PARSER = null;
    public static final int TYPE_FIELD_NUMBER = 3;
    public static final int USERNAMES_FIELD_NUMBER = 1;
    private int type_;
    private ae50 usernames_ = AbstractC0269h.emptyProtobufList();
    private String entityUri_ = "";

    static {
        EntityMatchContent entityMatchContent = new EntityMatchContent();
        DEFAULT_INSTANCE = entityMatchContent;
        AbstractC0269h.registerDefaultInstance(EntityMatchContent.class, entityMatchContent);
    }

    private EntityMatchContent() {
    }

    /* JADX INFO: renamed from: n */
    public static EntityMatchContent m5462n() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0001\u0000\u0001Ț\u0002Ȉ\u0003\f", new Object[]{"usernames_", "entityUri_", "type_"});
        }
        if (iOrdinal == 3) {
            return new EntityMatchContent();
        }
        if (iOrdinal == 4) {
            return new ugv(DEFAULT_INSTANCE, 4);
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
        synchronized (EntityMatchContent.class) {
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
    public final String m5463o() {
        return this.entityUri_;
    }

    /* JADX INFO: renamed from: p */
    public final mlv m5464p() {
        mlv mlvVar;
        int i = this.type_;
        if (i == 0) {
            mlvVar = mlv.ENTITY_MATCH_TYPE_UNSPECIFIED;
        } else if (i != 1) {
            mlvVar = i != 2 ? null : mlv.ENTITY_MATCH_TYPE_SONG;
        } else {
            mlvVar = mlv.ENTITY_MATCH_TYPE_ARTIST;
        }
        return mlvVar == null ? mlv.UNRECOGNIZED : mlvVar;
    }

    /* JADX INFO: renamed from: q */
    public final ae50 m5465q() {
        return this.usernames_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
