package com.spotify.player.esperanto.proto;

import com.google.protobuf.AbstractC0269h;
import java.util.ArrayList;
import p204p.AbstractC1733c9;
import p204p.AbstractC2118m8;
import p204p.ae50;
import p204p.ihc0;
import p204p.jjw;
import p204p.kjw;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes9.dex */
public final class EsContextPage$ContextPage extends AbstractC0269h implements sre0 {
    private static final EsContextPage$ContextPage DEFAULT_INSTANCE;
    public static final int IS_LOADING_FIELD_NUMBER = 5;
    public static final int METADATA_FIELD_NUMBER = 2;
    public static final int NEXT_PAGE_URL_FIELD_NUMBER = 4;
    public static final int PAGE_URL_FIELD_NUMBER = 3;
    private static volatile r2n0 PARSER = null;
    public static final int TRACKS_FIELD_NUMBER = 1;
    private boolean isLoading_;
    private ihc0 metadata_ = ihc0.f102235b;
    private ae50 tracks_ = AbstractC0269h.emptyProtobufList();
    private String pageUrl_ = "";
    private String nextPageUrl_ = "";

    static {
        EsContextPage$ContextPage esContextPage$ContextPage = new EsContextPage$ContextPage();
        DEFAULT_INSTANCE = esContextPage$ContextPage;
        AbstractC0269h.registerDefaultInstance(EsContextPage$ContextPage.class, esContextPage$ContextPage);
    }

    private EsContextPage$ContextPage() {
    }

    /* JADX INFO: renamed from: n */
    public static void m17676n(EsContextPage$ContextPage esContextPage$ContextPage, ArrayList arrayList) {
        ae50 ae50Var = esContextPage$ContextPage.tracks_;
        if (!((AbstractC1733c9) ae50Var).f35342a) {
            esContextPage$ContextPage.tracks_ = AbstractC0269h.mutableCopy(ae50Var);
        }
        AbstractC2118m8.addAll(arrayList, esContextPage$ContextPage.tracks_);
    }

    /* JADX INFO: renamed from: o */
    public static ihc0 m17677o(EsContextPage$ContextPage esContextPage$ContextPage) {
        ihc0 ihc0Var = esContextPage$ContextPage.metadata_;
        if (!ihc0Var.f102236a) {
            esContextPage$ContextPage.metadata_ = ihc0Var.m50613h();
        }
        return esContextPage$ContextPage.metadata_;
    }

    /* JADX INFO: renamed from: p */
    public static void m17678p(EsContextPage$ContextPage esContextPage$ContextPage, boolean z) {
        esContextPage$ContextPage.isLoading_ = z;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static void m17679q(EsContextPage$ContextPage esContextPage$ContextPage, String str) {
        esContextPage$ContextPage.getClass();
        str.getClass();
        esContextPage$ContextPage.nextPageUrl_ = str;
    }

    /* JADX INFO: renamed from: r */
    public static void m17680r(EsContextPage$ContextPage esContextPage$ContextPage, String str) {
        esContextPage$ContextPage.getClass();
        str.getClass();
        esContextPage$ContextPage.pageUrl_ = str;
    }

    /* JADX INFO: renamed from: s */
    public static jjw m17681s() {
        return (jjw) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0001\u0001\u0000\u0001\u001b\u00022\u0003Ȉ\u0004Ȉ\u0005\u0007", new Object[]{"tracks_", EsContextTrack$ContextTrack.class, "metadata_", kjw.f123432a, "pageUrl_", "nextPageUrl_", "isLoading_"});
        }
        if (iOrdinal == 3) {
            return new EsContextPage$ContextPage();
        }
        if (iOrdinal == 4) {
            return new jjw(DEFAULT_INSTANCE);
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
        synchronized (EsContextPage$ContextPage.class) {
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
