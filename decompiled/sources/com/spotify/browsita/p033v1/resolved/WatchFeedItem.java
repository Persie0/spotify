package com.spotify.browsita.p033v1.resolved;

import com.google.protobuf.AbstractC0269h;
import com.spotify.browsita.p033v1.resolved.watchfeed.DecoratedEntrypointMetadata;
import p204p.eyc1;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes5.dex */
public final class WatchFeedItem extends AbstractC0269h implements sre0 {
    private static final WatchFeedItem DEFAULT_INSTANCE;
    public static final int ENTRYPOINT_FIELD_NUMBER = 2;
    public static final int ITEM_FIELD_NUMBER = 1;
    private static volatile r2n0 PARSER = null;
    public static final int WATCH_FEED_ITEM_METADATA_FIELD_NUMBER = 3;
    private int bitField0_;
    private DecoratedEntrypointMetadata entrypoint_;
    private Item item_;
    private WatchFeedItemMetadata watchFeedItemMetadata_;

    static {
        WatchFeedItem watchFeedItem = new WatchFeedItem();
        DEFAULT_INSTANCE = watchFeedItem;
        AbstractC0269h.registerDefaultInstance(WatchFeedItem.class, watchFeedItem);
    }

    private WatchFeedItem() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002", new Object[]{"bitField0_", "item_", "entrypoint_", "watchFeedItemMetadata_"});
        }
        if (iOrdinal == 3) {
            return new WatchFeedItem();
        }
        if (iOrdinal == 4) {
            return new eyc1(DEFAULT_INSTANCE, 15);
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
        synchronized (WatchFeedItem.class) {
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
    public final DecoratedEntrypointMetadata m4149n() {
        DecoratedEntrypointMetadata decoratedEntrypointMetadata = this.entrypoint_;
        return decoratedEntrypointMetadata == null ? DecoratedEntrypointMetadata.m4157r() : decoratedEntrypointMetadata;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final Item m4150o() {
        Item item = this.item_;
        return item == null ? Item.m4084n() : item;
    }

    /* JADX INFO: renamed from: p */
    public final WatchFeedItemMetadata m4151p() {
        WatchFeedItemMetadata watchFeedItemMetadata = this.watchFeedItemMetadata_;
        return watchFeedItemMetadata == null ? WatchFeedItemMetadata.m4153o() : watchFeedItemMetadata;
    }

    /* JADX INFO: renamed from: q */
    public final boolean m4152q() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
