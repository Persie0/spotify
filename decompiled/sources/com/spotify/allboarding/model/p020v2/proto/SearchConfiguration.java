package com.spotify.allboarding.model.p020v2.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.six0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes3.dex */
public final class SearchConfiguration extends AbstractC0269h implements sre0 {
    private static final SearchConfiguration DEFAULT_INSTANCE;
    public static final int INITIAL_TEXT_FIELD_NUMBER = 3;
    private static volatile r2n0 PARSER = null;
    public static final int PLACEHOLDER_FIELD_NUMBER = 2;
    public static final int SEARCH_URL_FIELD_NUMBER = 1;
    private String searchUrl_ = "";
    private String placeholder_ = "";
    private String initialText_ = "";

    static {
        SearchConfiguration searchConfiguration = new SearchConfiguration();
        DEFAULT_INSTANCE = searchConfiguration;
        AbstractC0269h.registerDefaultInstance(SearchConfiguration.class, searchConfiguration);
    }

    private SearchConfiguration() {
    }

    /* JADX INFO: renamed from: n */
    public static SearchConfiguration m3209n() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ", new Object[]{"searchUrl_", "placeholder_", "initialText_"});
        }
        if (iOrdinal == 3) {
            return new SearchConfiguration();
        }
        if (iOrdinal == 4) {
            return new six0(DEFAULT_INSTANCE, 20);
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
        synchronized (SearchConfiguration.class) {
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

    /* JADX INFO: renamed from: o */
    public final String m3210o() {
        return this.initialText_;
    }

    /* JADX INFO: renamed from: p */
    public final String m3211p() {
        return this.placeholder_;
    }

    /* JADX INFO: renamed from: q */
    public final String m3212q() {
        return this.searchUrl_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
