package com.spotify.watchfeed.component.layout.p186v1;

import com.google.protobuf.AbstractC0269h;
import com.google.protobuf.Any;
import com.spotify.watchfeed.component.model.p187v1.proto.HeaderOverrides;
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
public final class WatchFeedHashtagEndOfFeedLayout extends AbstractC0269h implements sre0 {
    public static final int CONTENT_FIELD_NUMBER = 3;
    private static final WatchFeedHashtagEndOfFeedLayout DEFAULT_INSTANCE;
    public static final int HEADER_OVERRIDES_FIELD_NUMBER = 8;
    public static final int HEADER_TITLE_OVERRIDE_FIELD_NUMBER = 7;
    public static final int HIDE_HEADER_FIELD_NUMBER = 4;
    public static final int ITEM_ID_FIELD_NUMBER = 1;
    public static final int OVERLAYS_FIELD_NUMBER = 2;
    private static volatile r2n0 PARSER = null;
    public static final int TOP_OVERLAYS_FIELD_NUMBER = 6;
    public static final int URI_FIELD_NUMBER = 5;
    private int bitField0_;
    private Any content_;
    private HeaderOverrides headerOverrides_;
    private boolean hideHeader_;
    private String itemId_ = "";
    private ae50 overlays_ = AbstractC0269h.emptyProtobufList();
    private String uri_ = "";
    private ae50 topOverlays_ = AbstractC0269h.emptyProtobufList();
    private String headerTitleOverride_ = "";

    static {
        WatchFeedHashtagEndOfFeedLayout watchFeedHashtagEndOfFeedLayout = new WatchFeedHashtagEndOfFeedLayout();
        DEFAULT_INSTANCE = watchFeedHashtagEndOfFeedLayout;
        AbstractC0269h.registerDefaultInstance(WatchFeedHashtagEndOfFeedLayout.class, watchFeedHashtagEndOfFeedLayout);
    }

    private WatchFeedHashtagEndOfFeedLayout() {
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: s */
    public static WatchFeedHashtagEndOfFeedLayout m22816s(gva gvaVar) {
        return (WatchFeedHashtagEndOfFeedLayout) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, gvaVar);
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\b\u0000\u0001\u0001\b\b\u0000\u0002\u0000\u0001Ȉ\u0002\u001b\u0003ဉ\u0000\u0004\u0007\u0005Ȉ\u0006\u001b\u0007Ȉ\bဉ\u0001", new Object[]{"bitField0_", "itemId_", "overlays_", Any.class, "content_", "hideHeader_", "uri_", "topOverlays_", Any.class, "headerTitleOverride_", "headerOverrides_"});
        }
        if (iOrdinal == 3) {
            return new WatchFeedHashtagEndOfFeedLayout();
        }
        if (iOrdinal == 4) {
            return new eyc1(DEFAULT_INSTANCE, 13);
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
        synchronized (WatchFeedHashtagEndOfFeedLayout.class) {
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

    public final String getUri() {
        return this.uri_;
    }

    /* JADX INFO: renamed from: n */
    public final Any m22817n() {
        Any any = this.content_;
        return any == null ? Any.m1909p() : any;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final HeaderOverrides m22818o() {
        HeaderOverrides headerOverrides = this.headerOverrides_;
        return headerOverrides == null ? HeaderOverrides.m22893o() : headerOverrides;
    }

    /* JADX INFO: renamed from: p */
    public final ae50 m22819p() {
        return this.overlays_;
    }

    /* JADX INFO: renamed from: q */
    public final ae50 m22820q() {
        return this.topOverlays_;
    }

    /* JADX INFO: renamed from: r */
    public final boolean m22821r() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
