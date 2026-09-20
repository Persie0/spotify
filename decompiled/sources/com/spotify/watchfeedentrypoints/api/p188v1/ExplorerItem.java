package com.spotify.watchfeedentrypoints.api.p188v1;

import com.google.protobuf.AbstractC0269h;
import p204p.mlx;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes11.dex */
public final class ExplorerItem extends AbstractC0269h implements sre0 {
    public static final int DECISION_ID_FIELD_NUMBER = 3;
    private static final ExplorerItem DEFAULT_INSTANCE;
    public static final int FIRST_ITEM_URI_FIELD_NUMBER = 2;
    public static final int NAVIGATION_URI_FIELD_NUMBER = 4;
    private static volatile r2n0 PARSER = null;
    public static final int URI_FIELD_NUMBER = 1;
    private String uri_ = "";
    private String firstItemUri_ = "";
    private String decisionId_ = "";
    private String navigationUri_ = "";

    static {
        ExplorerItem explorerItem = new ExplorerItem();
        DEFAULT_INSTANCE = explorerItem;
        AbstractC0269h.registerDefaultInstance(ExplorerItem.class, explorerItem);
    }

    private ExplorerItem() {
    }

    /* JADX INFO: renamed from: o */
    public static ExplorerItem m22941o() {
        return DEFAULT_INSTANCE;
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004Ȉ", new Object[]{"uri_", "firstItemUri_", "decisionId_", "navigationUri_"});
        }
        if (iOrdinal == 3) {
            return new ExplorerItem();
        }
        if (iOrdinal == 4) {
            return new mlx(DEFAULT_INSTANCE, 4);
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
        synchronized (ExplorerItem.class) {
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
    public final String m22942n() {
        return this.decisionId_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: p */
    public final String m22943p() {
        return this.firstItemUri_;
    }

    /* JADX INFO: renamed from: q */
    public final String m22944q() {
        return this.navigationUri_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
