package com.spotify.download.esperanto.proto;

import com.google.protobuf.AbstractC0269h;
import java.util.ArrayList;
import p204p.AbstractC1733c9;
import p204p.AbstractC2118m8;
import p204p.ae50;
import p204p.bkw;
import p204p.ckw;
import p204p.gkw;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes6.dex */
public final class EsDownload$GetFirstCachedSegmentIndexParams extends AbstractC0269h implements sre0 {
    public static final int CONTENT_FORM_FIELD_NUMBER = 3;
    public static final int CONTENT_TYPE_FIELD_NUMBER = 2;
    private static final EsDownload$GetFirstCachedSegmentIndexParams DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER = null;
    public static final int URL_PATHS_FIELD_NUMBER = 1;
    private int contentForm_;
    private int contentType_;
    private ae50 urlPaths_ = AbstractC0269h.emptyProtobufList();

    static {
        EsDownload$GetFirstCachedSegmentIndexParams esDownload$GetFirstCachedSegmentIndexParams = new EsDownload$GetFirstCachedSegmentIndexParams();
        DEFAULT_INSTANCE = esDownload$GetFirstCachedSegmentIndexParams;
        AbstractC0269h.registerDefaultInstance(EsDownload$GetFirstCachedSegmentIndexParams.class, esDownload$GetFirstCachedSegmentIndexParams);
    }

    private EsDownload$GetFirstCachedSegmentIndexParams() {
    }

    /* JADX INFO: renamed from: n */
    public static void m9504n(EsDownload$GetFirstCachedSegmentIndexParams esDownload$GetFirstCachedSegmentIndexParams, ArrayList arrayList) {
        ae50 ae50Var = esDownload$GetFirstCachedSegmentIndexParams.urlPaths_;
        if (!((AbstractC1733c9) ae50Var).f35342a) {
            esDownload$GetFirstCachedSegmentIndexParams.urlPaths_ = AbstractC0269h.mutableCopy(ae50Var);
        }
        AbstractC2118m8.addAll(arrayList, esDownload$GetFirstCachedSegmentIndexParams.urlPaths_);
    }

    /* JADX INFO: renamed from: o */
    public static void m9505o(EsDownload$GetFirstCachedSegmentIndexParams esDownload$GetFirstCachedSegmentIndexParams, bkw bkwVar) {
        esDownload$GetFirstCachedSegmentIndexParams.getClass();
        esDownload$GetFirstCachedSegmentIndexParams.contentForm_ = bkwVar.getNumber();
    }

    /* JADX INFO: renamed from: p */
    public static void m9506p(EsDownload$GetFirstCachedSegmentIndexParams esDownload$GetFirstCachedSegmentIndexParams, ckw ckwVar) {
        esDownload$GetFirstCachedSegmentIndexParams.getClass();
        esDownload$GetFirstCachedSegmentIndexParams.contentType_ = ckwVar.getNumber();
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static gkw m9507q() {
        return (gkw) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0001\u0000\u0001Ț\u0002\f\u0003\f", new Object[]{"urlPaths_", "contentType_", "contentForm_"});
        }
        if (iOrdinal == 3) {
            return new EsDownload$GetFirstCachedSegmentIndexParams();
        }
        if (iOrdinal == 4) {
            return new gkw(DEFAULT_INSTANCE);
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
        synchronized (EsDownload$GetFirstCachedSegmentIndexParams.class) {
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
