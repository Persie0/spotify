package com.spotify.watchfeedentrypoints.component.item.p190v1;

import com.google.protobuf.AbstractC0269h;
import com.google.protobuf.Any;
import java.util.List;
import p204p.ae50;
import p204p.eyc1;
import p204p.gva;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes11.dex */
public final class WatchFeedVideoCarouselComponent extends AbstractC0269h implements sre0 {
    private static final WatchFeedVideoCarouselComponent DEFAULT_INSTANCE;
    public static final int ITEMS_FIELD_NUMBER = 2;
    private static volatile r2n0 PARSER = null;
    public static final int TITLE_FIELD_NUMBER = 1;
    private String title_ = "";
    private ae50 items_ = AbstractC0269h.emptyProtobufList();

    static {
        WatchFeedVideoCarouselComponent watchFeedVideoCarouselComponent = new WatchFeedVideoCarouselComponent();
        DEFAULT_INSTANCE = watchFeedVideoCarouselComponent;
        AbstractC0269h.registerDefaultInstance(WatchFeedVideoCarouselComponent.class, watchFeedVideoCarouselComponent);
    }

    private WatchFeedVideoCarouselComponent() {
    }

    /* JADX INFO: renamed from: n */
    public static WatchFeedVideoCarouselComponent m22988n(gva gvaVar) {
        return (WatchFeedVideoCarouselComponent) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, gvaVar);
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001Ȉ\u0002\u001b", new Object[]{"title_", "items_", Any.class});
        }
        if (iOrdinal == 3) {
            return new WatchFeedVideoCarouselComponent();
        }
        if (iOrdinal == 4) {
            return new eyc1(DEFAULT_INSTANCE, 22);
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
        synchronized (WatchFeedVideoCarouselComponent.class) {
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

    public final List getItemsList() {
        return this.items_;
    }

    public final String getTitle() {
        return this.title_;
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
