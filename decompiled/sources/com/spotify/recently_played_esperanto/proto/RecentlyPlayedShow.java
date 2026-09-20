package com.spotify.recently_played_esperanto.proto;

import com.google.protobuf.AbstractC0269h;
import com.spotify.cosmos.util.proto.ShowCollectionState;
import com.spotify.cosmos.util.proto.ShowMetadata;
import com.spotify.cosmos.util.proto.ShowPlayState;
import p204p.l3v0;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes10.dex */
public final class RecentlyPlayedShow extends AbstractC0269h implements sre0 {
    public static final int ADD_TIME_FIELD_NUMBER = 5;
    private static final RecentlyPlayedShow DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER = null;
    public static final int SHOW_COLLECTION_STATE_FIELD_NUMBER = 2;
    public static final int SHOW_METADATA_FIELD_NUMBER = 1;
    public static final int SHOW_PLAY_STATE_FIELD_NUMBER = 3;
    public static final int TYPE_FIELD_NUMBER = 4;
    public static final int TYPE_STR_FIELD_NUMBER = 6;
    private int addTime_;
    private int bitField0_;
    private ShowCollectionState showCollectionState_;
    private ShowMetadata showMetadata_;
    private ShowPlayState showPlayState_;
    private String typeStr_ = "";
    private int type_;

    static {
        RecentlyPlayedShow recentlyPlayedShow = new RecentlyPlayedShow();
        DEFAULT_INSTANCE = recentlyPlayedShow;
        AbstractC0269h.registerDefaultInstance(RecentlyPlayedShow.class, recentlyPlayedShow);
    }

    private RecentlyPlayedShow() {
    }

    /* JADX INFO: renamed from: n */
    public static RecentlyPlayedShow m20297n() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004\u000b\u0005\u000b\u0006Ȉ", new Object[]{"bitField0_", "showMetadata_", "showCollectionState_", "showPlayState_", "type_", "addTime_", "typeStr_"});
        }
        if (iOrdinal == 3) {
            return new RecentlyPlayedShow();
        }
        if (iOrdinal == 4) {
            return new l3v0(DEFAULT_INSTANCE);
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
        synchronized (RecentlyPlayedShow.class) {
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
    public final ShowMetadata m20298o() {
        ShowMetadata showMetadata = this.showMetadata_;
        return showMetadata == null ? ShowMetadata.getDefaultInstance() : showMetadata;
    }

    /* JADX INFO: renamed from: p */
    public final String m20299p() {
        return this.typeStr_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
