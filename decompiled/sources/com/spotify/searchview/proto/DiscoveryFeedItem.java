package com.spotify.searchview.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.omr;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes10.dex */
public final class DiscoveryFeedItem extends AbstractC0269h implements sre0 {
    private static final DiscoveryFeedItem DEFAULT_INSTANCE;
    public static final int FIRST_ITEM_URI_FIELD_NUMBER = 6;
    public static final int NAVIGATION_URI_FIELD_NUMBER = 5;
    private static volatile r2n0 PARSER = null;
    public static final int THUMBNAILURI_FIELD_NUMBER = 3;
    public static final int TITLE_FIELD_NUMBER = 2;
    public static final int URI_FIELD_NUMBER = 1;
    public static final int VIDEOURI_FIELD_NUMBER = 4;
    private String uri_ = "";
    private String title_ = "";
    private String thumbnailUri_ = "";
    private String videoUri_ = "";
    private String navigationUri_ = "";
    private String firstItemUri_ = "";

    static {
        DiscoveryFeedItem discoveryFeedItem = new DiscoveryFeedItem();
        DEFAULT_INSTANCE = discoveryFeedItem;
        AbstractC0269h.registerDefaultInstance(DiscoveryFeedItem.class, discoveryFeedItem);
    }

    private DiscoveryFeedItem() {
    }

    /* JADX INFO: renamed from: n */
    public static DiscoveryFeedItem m20805n() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0000\u0001\u0006\u0006\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004Ȉ\u0005Ȉ\u0006Ȉ", new Object[]{"uri_", "title_", "thumbnailUri_", "videoUri_", "navigationUri_", "firstItemUri_"});
        }
        if (iOrdinal == 3) {
            return new DiscoveryFeedItem();
        }
        if (iOrdinal == 4) {
            return new omr(DEFAULT_INSTANCE, 1);
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
        synchronized (DiscoveryFeedItem.class) {
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

    public final String getTitle() {
        return this.title_;
    }

    public final String getUri() {
        return this.uri_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final String m20806o() {
        return this.firstItemUri_;
    }

    /* JADX INFO: renamed from: p */
    public final String m20807p() {
        return this.navigationUri_;
    }

    /* JADX INFO: renamed from: q */
    public final String m20808q() {
        return this.thumbnailUri_;
    }

    /* JADX INFO: renamed from: r */
    public final String m20809r() {
        return this.videoUri_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
