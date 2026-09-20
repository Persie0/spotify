package com.spotify.local_files_esperanto.proto;

import com.google.protobuf.AbstractC0269h;
import com.spotify.cosmos.util.proto.TrackMetadata;
import com.spotify.playlist.proto.TrackCollectionState;
import p204p.glw;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes8.dex */
public final class EsLocalFiles$Item extends AbstractC0269h implements sre0 {
    public static final int ADD_TIME_FIELD_NUMBER = 1;
    public static final int COLLECTION_STATE_FIELD_NUMBER = 3;
    public static final int CONTENT_URI_FIELD_NUMBER = 5;
    private static final EsLocalFiles$Item DEFAULT_INSTANCE;
    public static final int METADATA_FIELD_NUMBER = 2;
    private static volatile r2n0 PARSER = null;
    public static final int ROW_ID_FIELD_NUMBER = 4;
    private int addTime_;
    private int bitField0_;
    private TrackCollectionState collectionState_;
    private TrackMetadata metadata_;
    private String rowId_ = "";
    private String contentUri_ = "";

    static {
        EsLocalFiles$Item esLocalFiles$Item = new EsLocalFiles$Item();
        DEFAULT_INSTANCE = esLocalFiles$Item;
        AbstractC0269h.registerDefaultInstance(EsLocalFiles$Item.class, esLocalFiles$Item);
    }

    private EsLocalFiles$Item() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဋ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ለ\u0003\u0005ለ\u0004", new Object[]{"bitField0_", "addTime_", "metadata_", "collectionState_", "rowId_", "contentUri_"});
        }
        if (iOrdinal == 3) {
            return new EsLocalFiles$Item();
        }
        if (iOrdinal == 4) {
            return new glw(DEFAULT_INSTANCE);
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
        synchronized (EsLocalFiles$Item.class) {
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
    public final TrackMetadata m13157n() {
        TrackMetadata trackMetadata = this.metadata_;
        return trackMetadata == null ? TrackMetadata.getDefaultInstance() : trackMetadata;
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
