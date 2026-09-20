package com.spotify.contentagnostic.p051v2;

import com.google.protobuf.AbstractC0269h;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.ugv;
import p204p.wxv;
import p204p.z110;

/* JADX INFO: loaded from: classes6.dex */
public final class EntityTypeTrait extends AbstractC0269h implements sre0 {
    private static final EntityTypeTrait DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER = null;
    public static final int TYPE_FIELD_NUMBER = 1;
    private int type_;

    static {
        EntityTypeTrait entityTypeTrait = new EntityTypeTrait();
        DEFAULT_INSTANCE = entityTypeTrait;
        AbstractC0269h.registerDefaultInstance(EntityTypeTrait.class, entityTypeTrait);
    }

    private EntityTypeTrait() {
    }

    /* JADX INFO: renamed from: o */
    public static EntityTypeTrait m7852o(byte[] bArr) {
        return (EntityTypeTrait) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr);
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
            return new EntityTypeTrait();
        }
        if (iOrdinal == 4) {
            return new ugv(DEFAULT_INSTANCE, 8);
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
        synchronized (EntityTypeTrait.class) {
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
    public final wxv m7853n() {
        wxv wxvVar;
        switch (this.type_) {
            case 0:
                wxvVar = wxv.ENTITY_TYPE_UNSPECIFIED;
                break;
            case 1:
                wxvVar = wxv.ENTITY_TYPE_TRACK;
                break;
            case 2:
                wxvVar = wxv.ENTITY_TYPE_ALBUM;
                break;
            case 3:
                wxvVar = wxv.ENTITY_TYPE_PODCAST_EPISODE;
                break;
            case 4:
                wxvVar = wxv.ENTITY_TYPE_PODCAST_SHOW;
                break;
            case 5:
                wxvVar = wxv.ENTITY_TYPE_AUDIOBOOK_CHAPTER;
                break;
            case 6:
                wxvVar = wxv.ENTITY_TYPE_AUDIOBOOK;
                break;
            case 7:
                wxvVar = wxv.ENTITY_TYPE_LEARNING_COURSE;
                break;
            case 8:
                wxvVar = wxv.ENTITY_TYPE_LEARNING_LESSON;
                break;
            case 9:
                wxvVar = wxv.ENTITY_TYPE_USER_HIGHLIGHT;
                break;
            case 10:
                wxvVar = wxv.ENTITY_TYPE_AUTHOR;
                break;
            case 11:
                wxvVar = wxv.ENTITY_TYPE_ARTIST;
                break;
            case 12:
                wxvVar = wxv.ENTITY_TYPE_PLAYLIST;
                break;
            case 13:
                wxvVar = wxv.ENTITY_TYPE_USER;
                break;
            case 14:
                wxvVar = wxv.ENTITY_TYPE_PODCAST_CHAPTER;
                break;
            case 15:
            case 16:
            case 17:
            case 18:
            default:
                wxvVar = null;
                break;
            case 19:
                wxvVar = wxv.ENTITY_TYPE_EDITOR;
                break;
            case 20:
                wxvVar = wxv.ENTITY_TYPE_CLASSICAL_ARTIST;
                break;
            case 21:
                wxvVar = wxv.ENTITY_TYPE_AUDIOBOOK_SERIES;
                break;
            case 22:
                wxvVar = wxv.ENTITY_TYPE_CLASSICAL_WORK;
                break;
        }
        return wxvVar == null ? wxv.UNRECOGNIZED : wxvVar;
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
