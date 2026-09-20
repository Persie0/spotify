package com.spotify.metadata.cosmos.proto;

import com.google.protobuf.AbstractC0269h;
import com.spotify.metadata.proto.Metadata$Album;
import com.spotify.metadata.proto.Metadata$Artist;
import com.spotify.metadata.proto.Metadata$Episode;
import com.spotify.metadata.proto.Metadata$Show;
import com.spotify.metadata.proto.Metadata$Track;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.x5f0;
import p204p.z110;

/* JADX INFO: loaded from: classes8.dex */
public final class MetadataCosmos$MetadataItem extends AbstractC0269h implements sre0 {
    public static final int ALBUM_FIELD_NUMBER = 3;
    public static final int ARTIST_FIELD_NUMBER = 2;
    private static final MetadataCosmos$MetadataItem DEFAULT_INSTANCE;
    public static final int EPISODE_FIELD_NUMBER = 6;
    public static final int ERROR_FIELD_NUMBER = 1;
    private static volatile r2n0 PARSER = null;
    public static final int SHOW_FIELD_NUMBER = 5;
    public static final int TRACK_FIELD_NUMBER = 4;
    private int itemCase_ = 0;
    private Object item_;

    static {
        MetadataCosmos$MetadataItem metadataCosmos$MetadataItem = new MetadataCosmos$MetadataItem();
        DEFAULT_INSTANCE = metadataCosmos$MetadataItem;
        AbstractC0269h.registerDefaultInstance(MetadataCosmos$MetadataItem.class, metadataCosmos$MetadataItem);
    }

    private MetadataCosmos$MetadataItem() {
    }

    /* JADX INFO: renamed from: p */
    public static MetadataCosmos$MetadataItem m15409p() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0006\u0001\u0000\u0001\u0006\u0006\u0000\u0000\u0000\u0001B\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000\u0006<\u0000", new Object[]{"item_", "itemCase_", Metadata$Artist.class, Metadata$Album.class, Metadata$Track.class, Metadata$Show.class, Metadata$Episode.class});
        }
        if (iOrdinal == 3) {
            return new MetadataCosmos$MetadataItem();
        }
        if (iOrdinal == 4) {
            return new x5f0(DEFAULT_INSTANCE, 16);
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
        synchronized (MetadataCosmos$MetadataItem.class) {
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
    public final Metadata$Album m15410n() {
        return this.itemCase_ == 3 ? (Metadata$Album) this.item_ : Metadata$Album.m15423p();
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final Metadata$Artist m15411o() {
        return this.itemCase_ == 2 ? (Metadata$Artist) this.item_ : Metadata$Artist.m15428q();
    }

    /* JADX INFO: renamed from: q */
    public final Metadata$Episode m15412q() {
        return this.itemCase_ == 6 ? (Metadata$Episode) this.item_ : Metadata$Episode.m15439n();
    }

    /* JADX INFO: renamed from: r */
    public final int m15413r() {
        switch (this.itemCase_) {
            case 0:
                return 7;
            case 1:
                return 1;
            case 2:
                return 2;
            case 3:
                return 3;
            case 4:
                return 4;
            case 5:
                return 5;
            case 6:
                return 6;
            default:
                return 0;
        }
    }

    /* JADX INFO: renamed from: s */
    public final Metadata$Show m15414s() {
        return this.itemCase_ == 5 ? (Metadata$Show) this.item_ : Metadata$Show.m15444n();
    }

    /* JADX INFO: renamed from: t */
    public final Metadata$Track m15415t() {
        return this.itemCase_ == 4 ? (Metadata$Track) this.item_ : Metadata$Track.m15447p();
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
