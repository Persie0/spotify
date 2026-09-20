package com.spotify.watchfeed.component.layout.p186v1.proto;

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
public final class WatchFeedTwoColumnsLayout extends AbstractC0269h implements sre0 {
    public static final int ACTION_OVERLAYS_FIELD_NUMBER = 5;
    public static final int BOTTOM_CONTAINER_OVERLAYS_FIELD_NUMBER = 6;
    public static final int CONFIGURATION_FIELD_NUMBER = 750;
    public static final int CONTENT_FIELD_NUMBER = 2;
    private static final WatchFeedTwoColumnsLayout DEFAULT_INSTANCE;
    public static final int HEADER_OVERRIDES_FIELD_NUMBER = 10;
    public static final int HEADER_TITLE_OVERRIDE_FIELD_NUMBER = 9;
    public static final int HIDE_HEADER_FIELD_NUMBER = 7;
    public static final int ITEM_ID_FIELD_NUMBER = 1;
    public static final int MAIN_CONTENT_OVERLAYS_FIELD_NUMBER = 4;
    private static volatile r2n0 PARSER = null;
    public static final int SEPARATED_BOTTOM_CONTAINER_OVERLAYS_FIELD_NUMBER = 11;
    public static final int TOP_CONTAINER_OVERLAYS_FIELD_NUMBER = 3;
    public static final int URI_FIELD_NUMBER = 8;
    private int bitField0_;
    private Any configuration_;
    private Any content_;
    private HeaderOverrides headerOverrides_;
    private boolean hideHeader_;
    private String itemId_ = "";
    private ae50 topContainerOverlays_ = AbstractC0269h.emptyProtobufList();
    private ae50 mainContentOverlays_ = AbstractC0269h.emptyProtobufList();
    private ae50 actionOverlays_ = AbstractC0269h.emptyProtobufList();
    private ae50 bottomContainerOverlays_ = AbstractC0269h.emptyProtobufList();
    private String uri_ = "";
    private String headerTitleOverride_ = "";
    private ae50 separatedBottomContainerOverlays_ = AbstractC0269h.emptyProtobufList();

    static {
        WatchFeedTwoColumnsLayout watchFeedTwoColumnsLayout = new WatchFeedTwoColumnsLayout();
        DEFAULT_INSTANCE = watchFeedTwoColumnsLayout;
        AbstractC0269h.registerDefaultInstance(WatchFeedTwoColumnsLayout.class, watchFeedTwoColumnsLayout);
    }

    private WatchFeedTwoColumnsLayout() {
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: w */
    public static WatchFeedTwoColumnsLayout m22865w(gva gvaVar) {
        return (WatchFeedTwoColumnsLayout) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, gvaVar);
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\f\u0000\u0001\u0001ˮ\f\u0000\u0005\u0000\u0001Ȉ\u0002ဉ\u0000\u0003\u001b\u0004\u001b\u0005\u001b\u0006\u001b\u0007\u0007\bȈ\tȈ\nဉ\u0001\u000b\u001bˮဉ\u0002", new Object[]{"bitField0_", "itemId_", "content_", "topContainerOverlays_", Any.class, "mainContentOverlays_", Any.class, "actionOverlays_", Any.class, "bottomContainerOverlays_", Any.class, "hideHeader_", "uri_", "headerTitleOverride_", "headerOverrides_", "separatedBottomContainerOverlays_", Any.class, "configuration_"});
        }
        if (iOrdinal == 3) {
            return new WatchFeedTwoColumnsLayout();
        }
        if (iOrdinal == 4) {
            return new eyc1(DEFAULT_INSTANCE, 20);
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
        synchronized (WatchFeedTwoColumnsLayout.class) {
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
    public final ae50 m22866n() {
        return this.actionOverlays_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final ae50 m22867o() {
        return this.bottomContainerOverlays_;
    }

    /* JADX INFO: renamed from: p */
    public final Any m22868p() {
        Any any = this.content_;
        return any == null ? Any.m1909p() : any;
    }

    /* JADX INFO: renamed from: q */
    public final HeaderOverrides m22869q() {
        HeaderOverrides headerOverrides = this.headerOverrides_;
        return headerOverrides == null ? HeaderOverrides.m22893o() : headerOverrides;
    }

    /* JADX INFO: renamed from: r */
    public final String m22870r() {
        return this.itemId_;
    }

    /* JADX INFO: renamed from: s */
    public final ae50 m22871s() {
        return this.mainContentOverlays_;
    }

    /* JADX INFO: renamed from: t */
    public final ae50 m22872t() {
        return this.separatedBottomContainerOverlays_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }

    /* JADX INFO: renamed from: u */
    public final ae50 m22873u() {
        return this.topContainerOverlays_;
    }

    /* JADX INFO: renamed from: v */
    public final boolean m22874v() {
        return (this.bitField0_ & 2) != 0;
    }
}
