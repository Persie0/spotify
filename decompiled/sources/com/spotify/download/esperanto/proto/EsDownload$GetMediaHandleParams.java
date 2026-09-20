package com.spotify.download.esperanto.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.hkw;
import p204p.ikw;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes6.dex */
public final class EsDownload$GetMediaHandleParams extends AbstractC0269h implements sre0 {
    private static final EsDownload$GetMediaHandleParams DEFAULT_INSTANCE;
    public static final int ID_FIELD_NUMBER = 2;
    public static final int MEDIA_TYPE_FIELD_NUMBER = 1;
    private static volatile r2n0 PARSER;
    private String id_ = "";
    private int mediaType_;

    static {
        EsDownload$GetMediaHandleParams esDownload$GetMediaHandleParams = new EsDownload$GetMediaHandleParams();
        DEFAULT_INSTANCE = esDownload$GetMediaHandleParams;
        AbstractC0269h.registerDefaultInstance(EsDownload$GetMediaHandleParams.class, esDownload$GetMediaHandleParams);
    }

    private EsDownload$GetMediaHandleParams() {
    }

    /* JADX INFO: renamed from: n */
    public static void m9512n(EsDownload$GetMediaHandleParams esDownload$GetMediaHandleParams, String str) {
        esDownload$GetMediaHandleParams.getClass();
        str.getClass();
        esDownload$GetMediaHandleParams.id_ = str;
    }

    /* JADX INFO: renamed from: o */
    public static void m9513o(EsDownload$GetMediaHandleParams esDownload$GetMediaHandleParams, ikw ikwVar) {
        esDownload$GetMediaHandleParams.getClass();
        esDownload$GetMediaHandleParams.mediaType_ = ikwVar.getNumber();
    }

    /* JADX INFO: renamed from: p */
    public static hkw m9514p() {
        return (hkw) DEFAULT_INSTANCE.createBuilder();
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002Ȉ", new Object[]{"mediaType_", "id_"});
        }
        if (iOrdinal == 3) {
            return new EsDownload$GetMediaHandleParams();
        }
        if (iOrdinal == 4) {
            return new hkw(DEFAULT_INSTANCE);
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
        synchronized (EsDownload$GetMediaHandleParams.class) {
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
