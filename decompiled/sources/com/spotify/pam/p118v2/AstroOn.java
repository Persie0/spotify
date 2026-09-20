package com.spotify.pam.p118v2;

import com.google.protobuf.AbstractC0269h;
import p204p.ae50;
import p204p.ore0;
import p204p.pre0;
import p204p.qw5;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes9.dex */
public final class AstroOn extends AbstractC0269h implements sre0 {
    public static final int ACTION_MAP_FIELD_NUMBER = 9;
    private static final AstroOn DEFAULT_INSTANCE;
    public static final int DESCRIPTION_FIELD_NUMBER = 7;
    public static final int FULL_TITLE_FIELD_NUMBER = 12;
    public static final int GROUPING_FIELD_NUMBER = 10;
    public static final int ICON_FIELD_NUMBER = 6;
    public static final int IS_ACTIVE_FIELD_NUMBER = 8;
    private static volatile r2n0 PARSER = null;
    public static final int PRICE_FIELD_NUMBER = 5;
    public static final int SCHEDULE_FIELD_NUMBER = 11;
    public static final int SUBTITLE_FIELD_NUMBER = 2;
    public static final int TITLE_FIELD_NUMBER = 1;
    public static final int TITLE_TEXT_COLOR_FIELD_NUMBER = 3;
    public static final int URI_FIELD_NUMBER = 4;
    private boolean isActive_;
    private int schedule_;
    private String title_ = "";
    private String subtitle_ = "";
    private String titleTextColor_ = "";
    private String uri_ = "";
    private String price_ = "";
    private String icon_ = "";
    private String description_ = "";
    private ae50 actionMap_ = AbstractC0269h.emptyProtobufList();
    private String grouping_ = "";
    private String fullTitle_ = "";

    static {
        AstroOn astroOn = new AstroOn();
        DEFAULT_INSTANCE = astroOn;
        AbstractC0269h.registerDefaultInstance(AstroOn.class, astroOn);
    }

    private AstroOn() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\f\u0000\u0000\u0001\f\f\u0000\u0001\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004Ȉ\u0005Ȉ\u0006Ȉ\u0007Ȉ\b\u0007\t\u001b\nȈ\u000b\f\fȈ", new Object[]{"title_", "subtitle_", "titleTextColor_", "uri_", "price_", "icon_", "description_", "isActive_", "actionMap_", ActionTypeMap.class, "grouping_", "schedule_", "fullTitle_"});
        }
        if (iOrdinal == 3) {
            return new AstroOn();
        }
        if (iOrdinal == 4) {
            return new qw5(DEFAULT_INSTANCE, 23);
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
        synchronized (AstroOn.class) {
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

    public final String getDescription() {
        return this.description_;
    }

    public final String getSubtitle() {
        return this.subtitle_;
    }

    public final String getTitle() {
        return this.title_;
    }

    /* JADX INFO: renamed from: n */
    public final ae50 m16406n() {
        return this.actionMap_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final String m16407o() {
        return this.fullTitle_;
    }

    /* JADX INFO: renamed from: p */
    public final String m16408p() {
        return this.icon_;
    }

    /* JADX INFO: renamed from: q */
    public final boolean m16409q() {
        return this.isActive_;
    }

    /* JADX INFO: renamed from: r */
    public final String m16410r() {
        return this.price_;
    }

    /* JADX INFO: renamed from: s */
    public final String m16411s() {
        return this.titleTextColor_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
