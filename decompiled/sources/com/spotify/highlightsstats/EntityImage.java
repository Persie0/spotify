package com.spotify.highlightsstats;

import com.google.protobuf.AbstractC0269h;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.ugv;
import p204p.wgv;
import p204p.z110;

/* JADX INFO: loaded from: classes7.dex */
public final class EntityImage extends AbstractC0269h implements sre0 {
    private static final EntityImage DEFAULT_INSTANCE;
    public static final int ENTITY_TYPE_FIELD_NUMBER = 1;
    public static final int IMAGE_URL_FIELD_NUMBER = 2;
    private static volatile r2n0 PARSER;
    private int entityType_;
    private String imageUrl_ = "";

    static {
        EntityImage entityImage = new EntityImage();
        DEFAULT_INSTANCE = entityImage;
        AbstractC0269h.registerDefaultInstance(EntityImage.class, entityImage);
    }

    private EntityImage() {
    }

    /* JADX INFO: renamed from: n */
    public static EntityImage m11281n() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002Ȉ", new Object[]{"entityType_", "imageUrl_"});
        }
        if (iOrdinal == 3) {
            return new EntityImage();
        }
        if (iOrdinal == 4) {
            return new ugv(DEFAULT_INSTANCE, 0);
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
        synchronized (EntityImage.class) {
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

    public final String getImageUrl() {
        return this.imageUrl_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final wgv m11282o() {
        wgv wgvVar;
        switch (this.entityType_) {
            case 0:
                wgvVar = wgv.UNSPECIFIED;
                break;
            case 1:
                wgvVar = wgv.TRACK;
                break;
            case 2:
                wgvVar = wgv.ARTIST;
                break;
            case 3:
                wgvVar = wgv.ALBUM;
                break;
            case 4:
                wgvVar = wgv.SHOW;
                break;
            case 5:
                wgvVar = wgv.AUDIOBOOK;
                break;
            case 6:
                wgvVar = wgv.PLAYLIST;
                break;
            default:
                wgvVar = null;
                break;
        }
        return wgvVar == null ? wgv.UNRECOGNIZED : wgvVar;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
