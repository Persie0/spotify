package com.spotify.watchfeed.component.layout.p186v1;

import com.google.protobuf.AbstractC0269h;
import com.google.protobuf.Any;
import com.spotify.watchfeed.component.model.p187v1.proto.HeaderOverrides;
import com.spotify.watchfeed.component.model.p187v1.proto.SharedAudio;
import com.spotify.watchfeed.component.model.p187v1.proto.StylingOverrides;
import p204p.ae50;
import p204p.gva;
import p204p.nr41;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes11.dex */
public final class StorytellingDefaultLayout extends AbstractC0269h implements sre0 {
    public static final int BOTTOM_COMPONENTS_FIELD_NUMBER = 4;
    public static final int CENTER_COMPONENTS_FIELD_NUMBER = 3;
    public static final int CONTENT_FIELD_NUMBER = 1;
    private static final StorytellingDefaultLayout DEFAULT_INSTANCE;
    public static final int HEADER_COLOR_OVERRIDE_FIELD_NUMBER = 7;
    public static final int HEADER_OVERRIDES_FIELD_NUMBER = 10;
    public static final int HEADER_TITLE_OVERRIDE_FIELD_NUMBER = 9;
    public static final int HIDE_HEADER_FIELD_NUMBER = 6;
    public static final int ITEM_ID_FIELD_NUMBER = 5;
    private static volatile r2n0 PARSER = null;
    public static final int SHARED_AUDIO_FIELD_NUMBER = 12;
    public static final int STYLING_OVERRIDES_FIELD_NUMBER = 11;
    public static final int TOP_COMPONENTS_FIELD_NUMBER = 2;
    public static final int URI_FIELD_NUMBER = 8;
    private int bitField0_;
    private Any content_;
    private HeaderOverrides headerOverrides_;
    private boolean hideHeader_;
    private SharedAudio sharedAudio_;
    private StylingOverrides stylingOverrides_;
    private ae50 topComponents_ = AbstractC0269h.emptyProtobufList();
    private ae50 centerComponents_ = AbstractC0269h.emptyProtobufList();
    private ae50 bottomComponents_ = AbstractC0269h.emptyProtobufList();
    private String itemId_ = "";
    private String headerColorOverride_ = "";
    private String uri_ = "";
    private String headerTitleOverride_ = "";

    static {
        StorytellingDefaultLayout storytellingDefaultLayout = new StorytellingDefaultLayout();
        DEFAULT_INSTANCE = storytellingDefaultLayout;
        AbstractC0269h.registerDefaultInstance(StorytellingDefaultLayout.class, storytellingDefaultLayout);
    }

    private StorytellingDefaultLayout() {
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: y */
    public static StorytellingDefaultLayout m22804y(gva gvaVar) {
        return (StorytellingDefaultLayout) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, gvaVar);
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\f\u0000\u0001\u0001\f\f\u0000\u0003\u0000\u0001ဉ\u0000\u0002\u001b\u0003\u001b\u0004\u001b\u0005Ȉ\u0006\u0007\u0007Ȉ\bȈ\tȈ\nဉ\u0001\u000bဉ\u0002\fဉ\u0003", new Object[]{"bitField0_", "content_", "topComponents_", Any.class, "centerComponents_", Any.class, "bottomComponents_", Any.class, "itemId_", "hideHeader_", "headerColorOverride_", "uri_", "headerTitleOverride_", "headerOverrides_", "stylingOverrides_", "sharedAudio_"});
        }
        if (iOrdinal == 3) {
            return new StorytellingDefaultLayout();
        }
        if (iOrdinal == 4) {
            return new nr41(DEFAULT_INSTANCE, 27);
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
        synchronized (StorytellingDefaultLayout.class) {
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
    public final ae50 m22805n() {
        return this.bottomComponents_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final ae50 m22806o() {
        return this.centerComponents_;
    }

    /* JADX INFO: renamed from: p */
    public final Any m22807p() {
        Any any = this.content_;
        return any == null ? Any.m1909p() : any;
    }

    /* JADX INFO: renamed from: q */
    public final HeaderOverrides m22808q() {
        HeaderOverrides headerOverrides = this.headerOverrides_;
        return headerOverrides == null ? HeaderOverrides.m22893o() : headerOverrides;
    }

    /* JADX INFO: renamed from: r */
    public final String m22809r() {
        return this.itemId_;
    }

    /* JADX INFO: renamed from: s */
    public final SharedAudio m22810s() {
        SharedAudio sharedAudio = this.sharedAudio_;
        return sharedAudio == null ? SharedAudio.m22911o() : sharedAudio;
    }

    /* JADX INFO: renamed from: t */
    public final StylingOverrides m22811t() {
        StylingOverrides stylingOverrides = this.stylingOverrides_;
        return stylingOverrides == null ? StylingOverrides.m22917n() : stylingOverrides;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }

    /* JADX INFO: renamed from: u */
    public final ae50 m22812u() {
        return this.topComponents_;
    }

    /* JADX INFO: renamed from: v */
    public final boolean m22813v() {
        return (this.bitField0_ & 2) != 0;
    }

    /* JADX INFO: renamed from: w */
    public final boolean m22814w() {
        return (this.bitField0_ & 8) != 0;
    }

    /* JADX INFO: renamed from: x */
    public final boolean m22815x() {
        return (this.bitField0_ & 4) != 0;
    }
}
