package com.spotify.local_files_esperanto.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.hlw;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes8.dex */
public final class EsLocalFiles$Query extends AbstractC0269h implements sre0 {
    private static final EsLocalFiles$Query DEFAULT_INSTANCE;
    public static final int MIN_LENGTH_FIELD_NUMBER = 4;
    private static volatile r2n0 PARSER = null;
    public static final int RANGE_FIELD_NUMBER = 3;
    public static final int REMOVE_DUPLICATE_LINKS_FIELD_NUMBER = 5;
    public static final int SORT_BY_FIELD_NUMBER = 2;
    public static final int TEXT_FILTER_FIELD_NUMBER = 1;
    private int bitField0_;
    private int minLength_;
    private EsLocalFiles$Range range_;
    private boolean removeDuplicateLinks_;
    private int sortBy_;
    private String textFilter_ = "";

    static {
        EsLocalFiles$Query esLocalFiles$Query = new EsLocalFiles$Query();
        DEFAULT_INSTANCE = esLocalFiles$Query;
        AbstractC0269h.registerDefaultInstance(EsLocalFiles$Query.class, esLocalFiles$Query);
    }

    private EsLocalFiles$Query() {
    }

    /* JADX INFO: renamed from: n */
    public static void m13159n(EsLocalFiles$Query esLocalFiles$Query, String str) {
        esLocalFiles$Query.getClass();
        str.getClass();
        esLocalFiles$Query.textFilter_ = str;
    }

    /* JADX INFO: renamed from: o */
    public static hlw m13160o() {
        return (hlw) DEFAULT_INSTANCE.createBuilder();
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001Ȉ\u0002\f\u0003ဉ\u0000\u0004\u000b\u0005\u0007", new Object[]{"bitField0_", "textFilter_", "sortBy_", "range_", "minLength_", "removeDuplicateLinks_"});
        }
        if (iOrdinal == 3) {
            return new EsLocalFiles$Query();
        }
        if (iOrdinal == 4) {
            return new hlw(DEFAULT_INSTANCE);
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
        synchronized (EsLocalFiles$Query.class) {
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
