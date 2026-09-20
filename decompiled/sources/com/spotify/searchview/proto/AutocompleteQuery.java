package com.spotify.searchview.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.ore0;
import p204p.pre0;
import p204p.q67;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes10.dex */
public final class AutocompleteQuery extends AbstractC0269h implements sre0 {
    private static final AutocompleteQuery DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER = null;
    public static final int RECENTHIGHLIGHT_FIELD_NUMBER = 3;
    public static final int SNIPPET_FIELD_NUMBER = 2;
    public static final int URI_FIELD_NUMBER = 1;
    private int bitField0_;
    private boolean recentHighlight_;
    private Snippet snippet_;
    private String uri_ = "";

    static {
        AutocompleteQuery autocompleteQuery = new AutocompleteQuery();
        DEFAULT_INSTANCE = autocompleteQuery;
        AbstractC0269h.registerDefaultInstance(AutocompleteQuery.class, autocompleteQuery);
    }

    private AutocompleteQuery() {
    }

    /* JADX INFO: renamed from: n */
    public static AutocompleteQuery m20775n() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002ဉ\u0000\u0003\u0007", new Object[]{"bitField0_", "uri_", "snippet_", "recentHighlight_"});
        }
        if (iOrdinal == 3) {
            return new AutocompleteQuery();
        }
        if (iOrdinal == 4) {
            return new q67(DEFAULT_INSTANCE, 21);
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
        synchronized (AutocompleteQuery.class) {
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

    /* JADX INFO: renamed from: o */
    public final Snippet m20776o() {
        Snippet snippet = this.snippet_;
        return snippet == null ? Snippet.m20913n() : snippet;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
