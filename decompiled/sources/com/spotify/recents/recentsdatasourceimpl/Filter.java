package com.spotify.recents.recentsdatasourceimpl;

import com.google.protobuf.AbstractC0269h;
import java.util.List;
import p204p.d67;
import p204p.gyj;
import p204p.mlx;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.ud50;
import p204p.vd50;
import p204p.wd50;
import p204p.z110;

/* JADX INFO: loaded from: classes2.dex */
public final class Filter extends AbstractC0269h implements sre0 {
    public static final int CONTENT_TYPE_FIELD_NUMBER = 1;
    private static final Filter DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER = null;
    public static final int SUB_FILTERS_FIELD_NUMBER = 2;
    private static final vd50 subFilters_converter_ = new d67(11);
    private int contentType_;
    private int subFiltersMemoizedSerializedSize;
    private ud50 subFilters_ = AbstractC0269h.emptyIntList();

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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\f\u0002,", new Object[]{"contentType_", "subFilters_"});
        }
        if (iOrdinal == 3) {
            return new Filter();
        }
        if (iOrdinal == 4) {
            return new mlx(27);
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

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final gyj m20328o() {
        gyj gyjVar;
        int i = this.contentType_;
        if (i == 0) {
            gyjVar = gyj.CONTENT_TYPE_UNSPECIFIED;
        } else if (i == 1) {
            gyjVar = gyj.CONTENT_TYPE_MUSIC;
        } else if (i != 2) {
            gyjVar = i != 3 ? null : gyj.CONTENT_TYPE_AUDIOBOOKS;
        } else {
            gyjVar = gyj.CONTENT_TYPE_PODCASTS;
        }
        return gyjVar == null ? gyj.UNRECOGNIZED : gyjVar;
    }

    /* JADX INFO: renamed from: p */
    public final List m20329p() {
        return new wd50(this.subFilters_, subFilters_converter_);
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
