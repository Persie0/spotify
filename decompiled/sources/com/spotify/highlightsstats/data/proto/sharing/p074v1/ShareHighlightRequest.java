package com.spotify.highlightsstats.data.proto.sharing.p074v1;

import com.google.protobuf.AbstractC0269h;
import p204p.js01;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.ti5;
import p204p.ud50;
import p204p.vd50;
import p204p.z110;
import p204p.zy61;

/* JADX INFO: loaded from: classes7.dex */
public final class ShareHighlightRequest extends AbstractC0269h implements sre0 {
    private static final ShareHighlightRequest DEFAULT_INSTANCE;
    public static final int HIGHLIGHTS_TYPE_FIELD_NUMBER = 3;
    public static final int HIGHLIGHT_ID_FIELD_NUMBER = 1;
    private static volatile r2n0 PARSER = null;
    public static final int TEMPLATE_VERSION_FIELD_NUMBER = 4;
    public static final int TIME_ZONE_FIELD_NUMBER = 2;
    private static final vd50 highlightsType_converter_ = new ti5(25);
    private int highlightsTypeMemoizedSerializedSize;
    private int templateVersion_;
    private String highlightId_ = "";
    private String timeZone_ = "";
    private ud50 highlightsType_ = AbstractC0269h.emptyIntList();

    static {
        ShareHighlightRequest shareHighlightRequest = new ShareHighlightRequest();
        DEFAULT_INSTANCE = shareHighlightRequest;
        AbstractC0269h.registerDefaultInstance(ShareHighlightRequest.class, shareHighlightRequest);
    }

    private ShareHighlightRequest() {
    }

    /* JADX INFO: renamed from: n */
    public static void m11304n(ShareHighlightRequest shareHighlightRequest, String str) {
        shareHighlightRequest.getClass();
        str.getClass();
        shareHighlightRequest.highlightId_ = str;
    }

    /* JADX INFO: renamed from: o */
    public static void m11305o(ShareHighlightRequest shareHighlightRequest, zy61 zy61Var) {
        shareHighlightRequest.getClass();
        shareHighlightRequest.templateVersion_ = zy61Var.getNumber();
    }

    /* JADX INFO: renamed from: p */
    public static void m11306p(ShareHighlightRequest shareHighlightRequest, String str) {
        shareHighlightRequest.getClass();
        shareHighlightRequest.timeZone_ = str;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static js01 m11307q() {
        return (js01) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0001\u0000\u0001Ȉ\u0002Ȉ\u0003,\u0004\f", new Object[]{"highlightId_", "timeZone_", "highlightsType_", "templateVersion_"});
        }
        if (iOrdinal == 3) {
            return new ShareHighlightRequest();
        }
        if (iOrdinal == 4) {
            return new js01(DEFAULT_INSTANCE);
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
        synchronized (ShareHighlightRequest.class) {
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

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
