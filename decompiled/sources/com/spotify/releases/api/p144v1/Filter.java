package com.spotify.releases.api.p144v1;

import com.google.protobuf.AbstractC0269h;
import java.util.List;
import p204p.ae50;
import p204p.mlx;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes10.dex */
public final class Filter extends AbstractC0269h implements sre0 {
    public static final int ACCESSIBILITY_FIELD_NUMBER = 3;
    private static final Filter DEFAULT_INSTANCE;
    public static final int FILTER_GROUP_FIELD_NUMBER = 1;
    private static volatile r2n0 PARSER = null;
    public static final int SUB_FILTERS_FIELD_NUMBER = 4;
    public static final int TEXT_FIELD_NUMBER = 2;
    private String filterGroup_ = "";
    private String text_ = "";
    private String accessibility_ = "";
    private ae50 subFilters_ = AbstractC0269h.emptyProtobufList();

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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0001\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004\u001b", new Object[]{"filterGroup_", "text_", "accessibility_", "subFilters_", Filter.class});
        }
        if (iOrdinal == 3) {
            return new Filter();
        }
        if (iOrdinal == 4) {
            return new mlx(DEFAULT_INSTANCE, 28);
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

    /* JADX INFO: renamed from: n */
    public final String m20383n() {
        return this.accessibility_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final String m20384o() {
        return this.filterGroup_;
    }

    /* JADX INFO: renamed from: p */
    public final List m20385p() {
        return this.subFilters_;
    }

    /* JADX INFO: renamed from: q */
    public final String m20386q() {
        return this.text_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
