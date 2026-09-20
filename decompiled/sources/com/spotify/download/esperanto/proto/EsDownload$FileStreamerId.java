package com.spotify.download.esperanto.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.ekw;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes6.dex */
public final class EsDownload$FileStreamerId extends AbstractC0269h implements sre0 {
    private static final EsDownload$FileStreamerId DEFAULT_INSTANCE;
    public static final int ID_FIELD_NUMBER = 1;
    private static volatile r2n0 PARSER;
    private int id_;

    static {
        EsDownload$FileStreamerId esDownload$FileStreamerId = new EsDownload$FileStreamerId();
        DEFAULT_INSTANCE = esDownload$FileStreamerId;
        AbstractC0269h.registerDefaultInstance(EsDownload$FileStreamerId.class, esDownload$FileStreamerId);
    }

    private EsDownload$FileStreamerId() {
    }

    /* JADX INFO: renamed from: n */
    public static void m9497n(EsDownload$FileStreamerId esDownload$FileStreamerId, int i) {
        esDownload$FileStreamerId.id_ = i;
    }

    /* JADX INFO: renamed from: p */
    public static ekw m9498p() {
        return (ekw) DEFAULT_INSTANCE.createBuilder();
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static EsDownload$FileStreamerId m9499q(byte[] bArr) {
        return (EsDownload$FileStreamerId) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"id_"});
        }
        if (iOrdinal == 3) {
            return new EsDownload$FileStreamerId();
        }
        if (iOrdinal == 4) {
            return new ekw(DEFAULT_INSTANCE);
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
        synchronized (EsDownload$FileStreamerId.class) {
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
    public final int m9500o() {
        return this.id_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
