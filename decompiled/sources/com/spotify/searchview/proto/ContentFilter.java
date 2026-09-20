package com.spotify.searchview.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.saj;
import p204p.sre0;
import p204p.uhj;
import p204p.z110;

/* JADX INFO: loaded from: classes10.dex */
public final class ContentFilter extends AbstractC0269h implements sre0 {
    private static final ContentFilter DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER = null;
    public static final int TYPE_FIELD_NUMBER = 1;
    private int type_;

    static {
        ContentFilter contentFilter = new ContentFilter();
        DEFAULT_INSTANCE = contentFilter;
        AbstractC0269h.registerDefaultInstance(ContentFilter.class, contentFilter);
    }

    private ContentFilter() {
    }

    /* JADX INFO: renamed from: n */
    public static ContentFilter m20798n() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\f", new Object[]{"type_"});
        }
        if (iOrdinal == 3) {
            return new ContentFilter();
        }
        if (iOrdinal == 4) {
            return new saj(DEFAULT_INSTANCE, 13);
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
        synchronized (ContentFilter.class) {
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
    public final uhj m20799o() {
        uhj uhjVar;
        int i = this.type_;
        if (i == 0) {
            uhjVar = uhj.CONTENT_FILTER_TYPE_UNKNOWN;
        } else if (i != 1) {
            uhjVar = i != 2 ? null : uhj.CONTENT_FILTER_TYPE_PODCAST;
        } else {
            uhjVar = uhj.CONTENT_FILTER_TYPE_VIDEOS;
        }
        return uhjVar == null ? uhj.UNRECOGNIZED : uhjVar;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
