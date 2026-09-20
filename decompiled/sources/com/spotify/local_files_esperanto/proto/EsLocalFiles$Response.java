package com.spotify.local_files_esperanto.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.ae50;
import p204p.ore0;
import p204p.pre0;
import p204p.qjw;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes8.dex */
public final class EsLocalFiles$Response extends AbstractC0269h implements sre0 {
    private static final EsLocalFiles$Response DEFAULT_INSTANCE;
    public static final int ITEM_FIELD_NUMBER = 1;
    private static volatile r2n0 PARSER = null;
    public static final int UNFILTERED_LENGTH_FIELD_NUMBER = 2;
    private int bitField0_;
    private ae50 item_ = AbstractC0269h.emptyProtobufList();
    private int unfilteredLength_;

    static {
        EsLocalFiles$Response esLocalFiles$Response = new EsLocalFiles$Response();
        DEFAULT_INSTANCE = esLocalFiles$Response;
        AbstractC0269h.registerDefaultInstance(EsLocalFiles$Response.class, esLocalFiles$Response);
    }

    private EsLocalFiles$Response() {
    }

    /* JADX INFO: renamed from: n */
    public static EsLocalFiles$Response m13161n() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002ဋ\u0000", new Object[]{"bitField0_", "item_", EsLocalFiles$Item.class, "unfilteredLength_"});
        }
        if (iOrdinal == 3) {
            return new EsLocalFiles$Response();
        }
        if (iOrdinal == 4) {
            return new qjw(DEFAULT_INSTANCE, 24);
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
        synchronized (EsLocalFiles$Response.class) {
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
    public final ae50 m13162o() {
        return this.item_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
