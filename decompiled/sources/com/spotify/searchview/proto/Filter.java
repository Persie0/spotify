package com.spotify.searchview.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.mlx;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes10.dex */
public final class Filter extends AbstractC0269h implements sre0 {
    public static final int CONTENT_FILTER_FIELD_NUMBER = 2;
    private static final Filter DEFAULT_INSTANCE;
    public static final int ENTITY_FILTER_FIELD_NUMBER = 4;
    public static final int ID_FIELD_NUMBER = 1;
    private static volatile r2n0 PARSER = null;
    public static final int UPLOAD_DATE_FILTER_FIELD_NUMBER = 3;
    private Object filter_;
    private int filterCase_ = 0;
    private String id_ = "";

    static {
        Filter filter = new Filter();
        DEFAULT_INSTANCE = filter;
        AbstractC0269h.registerDefaultInstance(Filter.class, filter);
    }

    private Filter() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0001\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002<\u0000\u0003<\u0000\u0004<\u0000", new Object[]{"filter_", "filterCase_", "id_", ContentFilter.class, UploadDateFilter.class, EntityFilter.class});
        }
        if (iOrdinal == 3) {
            return new Filter();
        }
        if (iOrdinal == 4) {
            return new mlx(DEFAULT_INSTANCE, 29);
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
        synchronized (Filter.class) {
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

    /* JADX INFO: renamed from: n */
    public final ContentFilter m20834n() {
        return this.filterCase_ == 2 ? (ContentFilter) this.filter_ : ContentFilter.m20798n();
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final EntityFilter m20835o() {
        return this.filterCase_ == 4 ? (EntityFilter) this.filter_ : EntityFilter.m20832n();
    }

    /* JADX INFO: renamed from: p */
    public final int m20836p() {
        int i = this.filterCase_;
        if (i == 0) {
            return 4;
        }
        if (i == 2) {
            return 1;
        }
        if (i != 3) {
            return i != 4 ? 0 : 3;
        }
        return 2;
    }

    /* JADX INFO: renamed from: q */
    public final UploadDateFilter m20837q() {
        return this.filterCase_ == 3 ? (UploadDateFilter) this.filter_ : UploadDateFilter.m20933n();
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
