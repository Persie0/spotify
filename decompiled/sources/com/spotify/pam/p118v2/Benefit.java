package com.spotify.pam.p118v2;

import com.google.protobuf.AbstractC0269h;
import p204p.az8;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes9.dex */
public final class Benefit extends AbstractC0269h implements sre0 {
    private static final Benefit DEFAULT_INSTANCE;
    public static final int ICON_COLOR_FIELD_NUMBER = 4;
    public static final int ICON_FIELD_NUMBER = 1;
    public static final int IS_HIGHLIGHTED_FIELD_NUMBER = 5;
    private static volatile r2n0 PARSER = null;
    public static final int SUBTITLE_FIELD_NUMBER = 3;
    public static final int TITLE_FIELD_NUMBER = 2;
    public static final int URI_FIELD_NUMBER = 6;
    private boolean isHighlighted_;
    private String icon_ = "";
    private String title_ = "";
    private String subtitle_ = "";
    private String iconColor_ = "";
    private String uri_ = "";

    static {
        Benefit benefit = new Benefit();
        DEFAULT_INSTANCE = benefit;
        AbstractC0269h.registerDefaultInstance(Benefit.class, benefit);
    }

    private Benefit() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0000\u0001\u0006\u0006\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004Ȉ\u0005\u0007\u0006Ȉ", new Object[]{"icon_", "title_", "subtitle_", "iconColor_", "isHighlighted_", "uri_"});
        }
        if (iOrdinal == 3) {
            return new Benefit();
        }
        if (iOrdinal == 4) {
            return new az8(DEFAULT_INSTANCE, 24);
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
        synchronized (Benefit.class) {
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

    public final String getSubtitle() {
        return this.subtitle_;
    }

    public final String getTitle() {
        return this.title_;
    }

    public final String getUri() {
        return this.uri_;
    }

    /* JADX INFO: renamed from: n */
    public final String m16412n() {
        return this.icon_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final String m16413o() {
        return this.iconColor_;
    }

    /* JADX INFO: renamed from: p */
    public final boolean m16414p() {
        return this.isHighlighted_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
