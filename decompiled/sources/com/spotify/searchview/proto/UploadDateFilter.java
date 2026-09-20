package com.spotify.searchview.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.kea1;
import p204p.ofa1;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes10.dex */
public final class UploadDateFilter extends AbstractC0269h implements sre0 {
    private static final UploadDateFilter DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER = null;
    public static final int TYPE_FIELD_NUMBER = 1;
    private int type_;

    static {
        UploadDateFilter uploadDateFilter = new UploadDateFilter();
        DEFAULT_INSTANCE = uploadDateFilter;
        AbstractC0269h.registerDefaultInstance(UploadDateFilter.class, uploadDateFilter);
    }

    private UploadDateFilter() {
    }

    /* JADX INFO: renamed from: n */
    public static UploadDateFilter m20933n() {
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
            return new UploadDateFilter();
        }
        if (iOrdinal == 4) {
            return new kea1(DEFAULT_INSTANCE, 1);
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
        synchronized (UploadDateFilter.class) {
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
    public final ofa1 m20934o() {
        ofa1 ofa1Var;
        int i = this.type_;
        if (i != 0) {
            ofa1Var = i != 3 ? null : ofa1.UPLOAD_DATE_FILTER_TYPE_MOST_RECENT;
        } else {
            ofa1Var = ofa1.UPLOAD_DATE_FILTER_TYPE_UNKNOWN;
        }
        return ofa1Var == null ? ofa1.UNRECOGNIZED : ofa1Var;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
