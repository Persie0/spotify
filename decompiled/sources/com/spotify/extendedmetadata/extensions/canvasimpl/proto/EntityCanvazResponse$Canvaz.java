package com.spotify.extendedmetadata.extensions.canvasimpl.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.ae50;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.ym91;
import p204p.z110;
import p204p.z5u;

/* JADX INFO: loaded from: classes6.dex */
public final class EntityCanvazResponse$Canvaz extends AbstractC0269h implements sre0 {
    public static final int ARTIST_FIELD_NUMBER = 6;
    public static final int CANVASURI_FIELD_NUMBER = 11;
    private static final EntityCanvazResponse$Canvaz DEFAULT_INSTANCE;
    public static final int ENTITYURI_FIELD_NUMBER = 5;
    public static final int ETAG_FIELD_NUMBER = 9;
    public static final int EXPLICIT_FIELD_NUMBER = 7;
    public static final int FILEID_FIELD_NUMBER = 3;
    public static final int ID_FIELD_NUMBER = 1;
    private static volatile r2n0 PARSER = null;
    public static final int STORYLINESID_FIELD_NUMBER = 12;
    public static final int THUMBNAILS_FIELD_NUMBER = 13;
    public static final int TYPE_FIELD_NUMBER = 4;
    public static final int UPLOADEDBY_FIELD_NUMBER = 8;
    public static final int URL_FIELD_NUMBER = 2;
    private Artist artist_;
    private int bitField0_;
    private boolean explicit_;
    private int type_;
    private String id_ = "";
    private String url_ = "";
    private String fileId_ = "";
    private String entityUri_ = "";
    private String uploadedBy_ = "";
    private String etag_ = "";
    private String canvasUri_ = "";
    private String storylinesId_ = "";
    private ae50 thumbnails_ = AbstractC0269h.emptyProtobufList();

    static {
        EntityCanvazResponse$Canvaz entityCanvazResponse$Canvaz = new EntityCanvazResponse$Canvaz();
        DEFAULT_INSTANCE = entityCanvazResponse$Canvaz;
        AbstractC0269h.registerDefaultInstance(EntityCanvazResponse$Canvaz.class, entityCanvazResponse$Canvaz);
    }

    private EntityCanvazResponse$Canvaz() {
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: x */
    public static EntityCanvazResponse$Canvaz m9895x(byte[] bArr) {
        return (EntityCanvazResponse$Canvaz) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\f\u0000\u0001\u0001\r\f\u0000\u0001\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004\f\u0005Ȉ\u0006ဉ\u0000\u0007\u0007\bȈ\tȈ\u000bȈ\fȈ\r\u001b", new Object[]{"bitField0_", "id_", "url_", "fileId_", "type_", "entityUri_", "artist_", "explicit_", "uploadedBy_", "etag_", "canvasUri_", "storylinesId_", "thumbnails_", ImageAsset.class});
        }
        if (iOrdinal == 3) {
            return new EntityCanvazResponse$Canvaz();
        }
        if (iOrdinal == 4) {
            return new z5u(DEFAULT_INSTANCE, 20);
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
        synchronized (EntityCanvazResponse$Canvaz.class) {
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

    public final String getId() {
        return this.id_;
    }

    public final String getUrl() {
        return this.url_;
    }

    /* JADX INFO: renamed from: n */
    public final Artist m9896n() {
        Artist artist = this.artist_;
        return artist == null ? Artist.m9893n() : artist;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final String m9897o() {
        return this.canvasUri_;
    }

    /* JADX INFO: renamed from: p */
    public final String m9898p() {
        return this.entityUri_;
    }

    /* JADX INFO: renamed from: q */
    public final String m9899q() {
        return this.etag_;
    }

    /* JADX INFO: renamed from: r */
    public final boolean m9900r() {
        return this.explicit_;
    }

    /* JADX INFO: renamed from: s */
    public final String m9901s() {
        return this.fileId_;
    }

    /* JADX INFO: renamed from: t */
    public final String m9902t() {
        return this.storylinesId_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }

    /* JADX INFO: renamed from: u */
    public final ae50 m9903u() {
        return this.thumbnails_;
    }

    /* JADX INFO: renamed from: v */
    public final ym91 m9904v() {
        ym91 ym91Var;
        int i = this.type_;
        if (i == 0) {
            ym91Var = ym91.IMAGE;
        } else if (i == 1) {
            ym91Var = ym91.VIDEO;
        } else if (i != 2) {
            ym91Var = i != 3 ? null : ym91.VIDEO_LOOPING_RANDOM;
        } else {
            ym91Var = ym91.VIDEO_LOOPING;
        }
        return ym91Var == null ? ym91.UNRECOGNIZED : ym91Var;
    }

    /* JADX INFO: renamed from: w */
    public final String m9905w() {
        return this.uploadedBy_;
    }
}
