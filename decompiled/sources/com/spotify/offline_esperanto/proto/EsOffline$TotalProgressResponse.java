package com.spotify.offline_esperanto.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.vlw;
import p204p.z110;

/* JADX INFO: loaded from: classes2.dex */
public final class EsOffline$TotalProgressResponse extends AbstractC0269h implements sre0 {
    private static final EsOffline$TotalProgressResponse DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER = null;
    public static final int PROGRESS_FIELD_NUMBER = 1;
    private int bitField0_;
    private EsOffline$Progress progress_;

    static {
        EsOffline$TotalProgressResponse esOffline$TotalProgressResponse = new EsOffline$TotalProgressResponse();
        DEFAULT_INSTANCE = esOffline$TotalProgressResponse;
        AbstractC0269h.registerDefaultInstance(EsOffline$TotalProgressResponse.class, esOffline$TotalProgressResponse);
    }

    private EsOffline$TotalProgressResponse() {
    }

    /* JADX INFO: renamed from: p */
    public static EsOffline$TotalProgressResponse m16211p(byte[] bArr) {
        return (EsOffline$TotalProgressResponse) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr);
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"bitField0_", "progress_"});
        }
        if (iOrdinal == 3) {
            return new EsOffline$TotalProgressResponse();
        }
        if (iOrdinal == 4) {
            return new vlw(18);
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
        synchronized (EsOffline$TotalProgressResponse.class) {
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
    public final EsOffline$Progress m16212o() {
        EsOffline$Progress esOffline$Progress = this.progress_;
        return esOffline$Progress == null ? EsOffline$Progress.m16195y() : esOffline$Progress;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
