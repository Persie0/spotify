package com.spotify.player.esperanto.proto;

import com.google.protobuf.AbstractC0269h;
import java.util.ArrayList;
import p204p.AbstractC1733c9;
import p204p.AbstractC2118m8;
import p204p.ae50;
import p204p.hjw;
import p204p.ihc0;
import p204p.ijw;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes9.dex */
public final class EsContext$Context extends AbstractC0269h implements sre0 {
    private static final EsContext$Context DEFAULT_INSTANCE;
    public static final int IS_LOADING_FIELD_NUMBER = 5;
    public static final int METADATA_FIELD_NUMBER = 2;
    public static final int PAGES_FIELD_NUMBER = 1;
    private static volatile r2n0 PARSER = null;
    public static final int RESTRICTIONS_FIELD_NUMBER = 6;
    public static final int URI_FIELD_NUMBER = 3;
    public static final int URL_FIELD_NUMBER = 4;
    private int bitField0_;
    private boolean isLoading_;
    private EsRestrictions$Restrictions restrictions_;
    private ihc0 metadata_ = ihc0.f102235b;
    private ae50 pages_ = AbstractC0269h.emptyProtobufList();
    private String uri_ = "";
    private String url_ = "";

    static {
        EsContext$Context esContext$Context = new EsContext$Context();
        DEFAULT_INSTANCE = esContext$Context;
        AbstractC0269h.registerDefaultInstance(EsContext$Context.class, esContext$Context);
    }

    private EsContext$Context() {
    }

    /* JADX INFO: renamed from: n */
    public static void m17669n(EsContext$Context esContext$Context, ArrayList arrayList) {
        ae50 ae50Var = esContext$Context.pages_;
        if (!((AbstractC1733c9) ae50Var).f35342a) {
            esContext$Context.pages_ = AbstractC0269h.mutableCopy(ae50Var);
        }
        AbstractC2118m8.addAll(arrayList, esContext$Context.pages_);
    }

    /* JADX INFO: renamed from: o */
    public static ihc0 m17670o(EsContext$Context esContext$Context) {
        ihc0 ihc0Var = esContext$Context.metadata_;
        if (!ihc0Var.f102236a) {
            esContext$Context.metadata_ = ihc0Var.m50613h();
        }
        return esContext$Context.metadata_;
    }

    /* JADX INFO: renamed from: p */
    public static void m17671p(EsContext$Context esContext$Context, boolean z) {
        esContext$Context.isLoading_ = z;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static void m17672q(EsContext$Context esContext$Context, EsRestrictions$Restrictions esRestrictions$Restrictions) {
        esContext$Context.getClass();
        esContext$Context.restrictions_ = esRestrictions$Restrictions;
        esContext$Context.bitField0_ |= 1;
    }

    /* JADX INFO: renamed from: r */
    public static void m17673r(EsContext$Context esContext$Context, String str) {
        esContext$Context.getClass();
        str.getClass();
        esContext$Context.uri_ = str;
    }

    /* JADX INFO: renamed from: s */
    public static void m17674s(EsContext$Context esContext$Context, String str) {
        esContext$Context.getClass();
        str.getClass();
        esContext$Context.url_ = str;
    }

    /* JADX INFO: renamed from: t */
    public static hjw m17675t() {
        return (hjw) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0001\u0001\u0006\u0006\u0001\u0001\u0000\u0001\u001b\u00022\u0003Ȉ\u0004Ȉ\u0005\u0007\u0006ဉ\u0000", new Object[]{"bitField0_", "pages_", EsContextPage$ContextPage.class, "metadata_", ijw.f102898a, "uri_", "url_", "isLoading_", "restrictions_"});
        }
        if (iOrdinal == 3) {
            return new EsContext$Context();
        }
        if (iOrdinal == 4) {
            return new hjw(DEFAULT_INSTANCE);
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
        synchronized (EsContext$Context.class) {
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

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
