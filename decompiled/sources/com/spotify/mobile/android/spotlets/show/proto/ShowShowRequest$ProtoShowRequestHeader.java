package com.spotify.mobile.android.spotlets.show.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.fi11;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes8.dex */
public final class ShowShowRequest$ProtoShowRequestHeader extends AbstractC0269h implements sre0 {
    private static final ShowShowRequest$ProtoShowRequestHeader DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER = null;
    public static final int SHOW_COLLECTION_STATE_FIELD_NUMBER = 2;
    public static final int SHOW_METADATA_FIELD_NUMBER = 1;
    public static final int SHOW_OFFLINE_STATE_FIELD_NUMBER = 4;
    public static final int SHOW_PLAY_STATE_FIELD_NUMBER = 3;
    private int bitField0_;
    private ShowState$ProtoShowCollectionState showCollectionState_;
    private ShowMetadata$ProtoShowMetadata showMetadata_;
    private ShowState$ProtoShowOfflineState showOfflineState_;
    private ShowState$ProtoShowPlayState showPlayState_;

    static {
        ShowShowRequest$ProtoShowRequestHeader showShowRequest$ProtoShowRequestHeader = new ShowShowRequest$ProtoShowRequestHeader();
        DEFAULT_INSTANCE = showShowRequest$ProtoShowRequestHeader;
        AbstractC0269h.registerDefaultInstance(ShowShowRequest$ProtoShowRequestHeader.class, showShowRequest$ProtoShowRequestHeader);
    }

    private ShowShowRequest$ProtoShowRequestHeader() {
    }

    /* JADX INFO: renamed from: n */
    public static ShowShowRequest$ProtoShowRequestHeader m15510n() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003", new Object[]{"bitField0_", "showMetadata_", "showCollectionState_", "showPlayState_", "showOfflineState_"});
        }
        if (iOrdinal == 3) {
            return new ShowShowRequest$ProtoShowRequestHeader();
        }
        if (iOrdinal == 4) {
            return new fi11(DEFAULT_INSTANCE, 29);
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
        synchronized (ShowShowRequest$ProtoShowRequestHeader.class) {
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
    public final ShowState$ProtoShowCollectionState m15511o() {
        ShowState$ProtoShowCollectionState showState$ProtoShowCollectionState = this.showCollectionState_;
        return showState$ProtoShowCollectionState == null ? ShowState$ProtoShowCollectionState.m15543n() : showState$ProtoShowCollectionState;
    }

    /* JADX INFO: renamed from: p */
    public final ShowMetadata$ProtoShowMetadata m15512p() {
        ShowMetadata$ProtoShowMetadata showMetadata$ProtoShowMetadata = this.showMetadata_;
        return showMetadata$ProtoShowMetadata == null ? ShowMetadata$ProtoShowMetadata.m15493p() : showMetadata$ProtoShowMetadata;
    }

    /* JADX INFO: renamed from: q */
    public final ShowState$ProtoShowOfflineState m15513q() {
        ShowState$ProtoShowOfflineState showState$ProtoShowOfflineState = this.showOfflineState_;
        return showState$ProtoShowOfflineState == null ? ShowState$ProtoShowOfflineState.m15544n() : showState$ProtoShowOfflineState;
    }

    /* JADX INFO: renamed from: r */
    public final ShowState$ProtoShowPlayState m15514r() {
        ShowState$ProtoShowPlayState showState$ProtoShowPlayState = this.showPlayState_;
        return showState$ProtoShowPlayState == null ? ShowState$ProtoShowPlayState.m15545n() : showState$ProtoShowPlayState;
    }

    /* JADX INFO: renamed from: s */
    public final boolean m15515s() {
        return (this.bitField0_ & 2) != 0;
    }

    /* JADX INFO: renamed from: t */
    public final boolean m15516t() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }

    /* JADX INFO: renamed from: u */
    public final boolean m15517u() {
        return (this.bitField0_ & 8) != 0;
    }

    /* JADX INFO: renamed from: v */
    public final boolean m15518v() {
        return (this.bitField0_ & 4) != 0;
    }
}
