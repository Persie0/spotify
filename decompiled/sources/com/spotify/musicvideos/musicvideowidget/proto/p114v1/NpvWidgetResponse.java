package com.spotify.musicvideos.musicvideowidget.proto.p114v1;

import com.google.protobuf.AbstractC0269h;
import java.util.ArrayList;
import p204p.AbstractC1733c9;
import p204p.AbstractC2118m8;
import p204p.ae50;
import p204p.ore0;
import p204p.phk0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes8.dex */
public final class NpvWidgetResponse extends AbstractC0269h implements sre0 {
    private static final NpvWidgetResponse DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER = null;
    public static final int SHOW_ALL_NAV_URI_FIELD_NUMBER = 3;
    public static final int TITLE_FIELD_NUMBER = 1;
    public static final int VIDEO_CARDS_FIELD_NUMBER = 4;
    public static final int WIDGET_TYPE_FIELD_NUMBER = 2;
    private int widgetType_;
    private String title_ = "";
    private String showAllNavUri_ = "";
    private ae50 videoCards_ = AbstractC0269h.emptyProtobufList();

    static {
        NpvWidgetResponse npvWidgetResponse = new NpvWidgetResponse();
        DEFAULT_INSTANCE = npvWidgetResponse;
        AbstractC0269h.registerDefaultInstance(NpvWidgetResponse.class, npvWidgetResponse);
    }

    private NpvWidgetResponse() {
    }

    /* JADX INFO: renamed from: n */
    public static void m15951n(NpvWidgetResponse npvWidgetResponse, ArrayList arrayList) {
        ae50 ae50Var = npvWidgetResponse.videoCards_;
        if (!((AbstractC1733c9) ae50Var).f35342a) {
            npvWidgetResponse.videoCards_ = AbstractC0269h.mutableCopy(ae50Var);
        }
        AbstractC2118m8.addAll(arrayList, npvWidgetResponse.videoCards_);
    }

    /* JADX INFO: renamed from: o */
    public static void m15952o(NpvWidgetResponse npvWidgetResponse, String str) {
        npvWidgetResponse.getClass();
        str.getClass();
        npvWidgetResponse.showAllNavUri_ = str;
    }

    /* JADX INFO: renamed from: p */
    public static void m15953p(NpvWidgetResponse npvWidgetResponse, String str) {
        npvWidgetResponse.getClass();
        str.getClass();
        npvWidgetResponse.title_ = str;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: s */
    public static phk0 m15954s() {
        return (phk0) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0001\u0000\u0001Ȉ\u0002\f\u0003Ȉ\u0004\u001b", new Object[]{"title_", "widgetType_", "showAllNavUri_", "videoCards_", VideoCard.class});
        }
        if (iOrdinal == 3) {
            return new NpvWidgetResponse();
        }
        if (iOrdinal == 4) {
            return new phk0(DEFAULT_INSTANCE);
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
        synchronized (NpvWidgetResponse.class) {
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

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: q */
    public final String m15955q() {
        return this.showAllNavUri_;
    }

    /* JADX INFO: renamed from: r */
    public final ae50 m15956r() {
        return this.videoCards_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
