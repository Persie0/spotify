package com.spotify.personalizedepisodes.contentservice.p124v1;

import com.google.protobuf.AbstractC0269h;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.vev0;
import p204p.z110;

/* JADX INFO: loaded from: classes9.dex */
public final class RecommendedTool extends AbstractC0269h implements sre0 {
    public static final int CONNECTED_FIELD_NUMBER = 2;
    private static final RecommendedTool DEFAULT_INSTANCE;
    public static final int ENABLED_FOR_FEATURE_FIELD_NUMBER = 3;
    public static final int FAVICON_URL_FIELD_NUMBER = 7;
    public static final int ICON_URL_FIELD_NUMBER = 6;
    public static final int ID_FIELD_NUMBER = 1;
    public static final int NAME_FIELD_NUMBER = 5;
    private static volatile r2n0 PARSER = null;
    public static final int WEB_VIEW_URL_FIELD_NUMBER = 4;
    private int bitField0_;
    private boolean connected_;
    private boolean enabledForFeature_;
    private String id_ = "";
    private String webViewUrl_ = "";
    private String name_ = "";
    private String iconUrl_ = "";
    private String faviconUrl_ = "";

    static {
        RecommendedTool recommendedTool = new RecommendedTool();
        DEFAULT_INSTANCE = recommendedTool;
        AbstractC0269h.registerDefaultInstance(RecommendedTool.class, recommendedTool);
    }

    private RecommendedTool() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001Ȉ\u0002\u0007\u0003\u0007\u0004Ȉ\u0005Ȉ\u0006Ȉ\u0007ለ\u0000", new Object[]{"bitField0_", "id_", "connected_", "enabledForFeature_", "webViewUrl_", "name_", "iconUrl_", "faviconUrl_"});
        }
        if (iOrdinal == 3) {
            return new RecommendedTool();
        }
        if (iOrdinal == 4) {
            return new vev0(DEFAULT_INSTANCE, 6);
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
        synchronized (RecommendedTool.class) {
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

    public final String getId() {
        return this.id_;
    }

    public final String getName() {
        return this.name_;
    }

    /* JADX INFO: renamed from: n */
    public final boolean m17479n() {
        return this.connected_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final boolean m17480o() {
        return this.enabledForFeature_;
    }

    /* JADX INFO: renamed from: p */
    public final String m17481p() {
        return this.iconUrl_;
    }

    /* JADX INFO: renamed from: q */
    public final String m17482q() {
        return this.webViewUrl_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
