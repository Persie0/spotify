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
public final class ShowDecorateRequest$ProtoDecorateShowItem extends AbstractC0269h implements sre0 {
    private static final ShowDecorateRequest$ProtoDecorateShowItem DEFAULT_INSTANCE;
    public static final int LINK_FIELD_NUMBER = 4;
    private static volatile r2n0 PARSER = null;
    public static final int SHOW_COLLECTION_STATE_FIELD_NUMBER = 2;
    public static final int SHOW_METADATA_FIELD_NUMBER = 1;
    public static final int SHOW_OFFLINE_STATE_FIELD_NUMBER = 7;
    public static final int SHOW_PLAY_STATE_FIELD_NUMBER = 3;
    private int bitField0_;
    private String link_ = "";
    private ShowState$ProtoShowCollectionState showCollectionState_;
    private ShowMetadata$ProtoShowMetadata showMetadata_;
    private ShowState$ProtoShowOfflineState showOfflineState_;
    private ShowState$ProtoShowPlayState showPlayState_;

    static {
        ShowDecorateRequest$ProtoDecorateShowItem showDecorateRequest$ProtoDecorateShowItem = new ShowDecorateRequest$ProtoDecorateShowItem();
        DEFAULT_INSTANCE = showDecorateRequest$ProtoDecorateShowItem;
        AbstractC0269h.registerDefaultInstance(ShowDecorateRequest$ProtoDecorateShowItem.class, showDecorateRequest$ProtoDecorateShowItem);
    }

    private ShowDecorateRequest$ProtoDecorateShowItem() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0005\u0000\u0001\u0001\u0007\u0005\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဈ\u0003\u0007ဉ\u0004", new Object[]{"bitField0_", "showMetadata_", "showCollectionState_", "showPlayState_", "link_", "showOfflineState_"});
        }
        if (iOrdinal == 3) {
            return new ShowDecorateRequest$ProtoDecorateShowItem();
        }
        if (iOrdinal == 4) {
            return new fi11(DEFAULT_INSTANCE, 9);
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
        synchronized (ShowDecorateRequest$ProtoDecorateShowItem.class) {
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

    public final String getLink() {
        return this.link_;
    }

    /* JADX INFO: renamed from: n */
    public final ShowState$ProtoShowCollectionState m15485n() {
        ShowState$ProtoShowCollectionState showState$ProtoShowCollectionState = this.showCollectionState_;
        return showState$ProtoShowCollectionState == null ? ShowState$ProtoShowCollectionState.m15543n() : showState$ProtoShowCollectionState;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final ShowMetadata$ProtoShowMetadata m15486o() {
        ShowMetadata$ProtoShowMetadata showMetadata$ProtoShowMetadata = this.showMetadata_;
        return showMetadata$ProtoShowMetadata == null ? ShowMetadata$ProtoShowMetadata.m15493p() : showMetadata$ProtoShowMetadata;
    }

    /* JADX INFO: renamed from: p */
    public final ShowState$ProtoShowOfflineState m15487p() {
        ShowState$ProtoShowOfflineState showState$ProtoShowOfflineState = this.showOfflineState_;
        return showState$ProtoShowOfflineState == null ? ShowState$ProtoShowOfflineState.m15544n() : showState$ProtoShowOfflineState;
    }

    /* JADX INFO: renamed from: q */
    public final ShowState$ProtoShowPlayState m15488q() {
        ShowState$ProtoShowPlayState showState$ProtoShowPlayState = this.showPlayState_;
        return showState$ProtoShowPlayState == null ? ShowState$ProtoShowPlayState.m15545n() : showState$ProtoShowPlayState;
    }

    /* JADX INFO: renamed from: r */
    public final boolean m15489r() {
        return (this.bitField0_ & 2) != 0;
    }

    /* JADX INFO: renamed from: s */
    public final boolean m15490s() {
        return (this.bitField0_ & 1) != 0;
    }

    /* JADX INFO: renamed from: t */
    public final boolean m15491t() {
        return (this.bitField0_ & 16) != 0;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }

    /* JADX INFO: renamed from: u */
    public final boolean m15492u() {
        return (this.bitField0_ & 4) != 0;
    }
}
