package com.spotify.connectivity.traffic.esperanto.proto;

import com.google.protobuf.AbstractC0269h;
import java.util.Collections;
import java.util.Map;
import p204p.ihc0;
import p204p.ore0;
import p204p.ppw;
import p204p.pre0;
import p204p.qpw;
import p204p.r110;
import p204p.r2n0;
import p204p.rpw;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes.dex */
public final class EsTrafficRequestInfo$RequestInfo extends AbstractC0269h implements sre0 {
    public static final int BYTES_SENT_FIELD_NUMBER = 4;
    private static final EsTrafficRequestInfo$RequestInfo DEFAULT_INSTANCE;
    public static final int HEADERS_FIELD_NUMBER = 3;
    public static final int METHOD_FIELD_NUMBER = 1;
    private static volatile r2n0 PARSER = null;
    public static final int SOURCE_IDENTIFIER_FIELD_NUMBER = 5;
    public static final int URL_FIELD_NUMBER = 2;
    private long bytesSent_;
    private int method_;
    private ihc0 headers_ = ihc0.f102235b;
    private String url_ = "";
    private String sourceIdentifier_ = "";

    static {
        EsTrafficRequestInfo$RequestInfo esTrafficRequestInfo$RequestInfo = new EsTrafficRequestInfo$RequestInfo();
        DEFAULT_INSTANCE = esTrafficRequestInfo$RequestInfo;
        AbstractC0269h.registerDefaultInstance(EsTrafficRequestInfo$RequestInfo.class, esTrafficRequestInfo$RequestInfo);
    }

    private EsTrafficRequestInfo$RequestInfo() {
    }

    /* JADX INFO: renamed from: n */
    public static ihc0 m7673n(EsTrafficRequestInfo$RequestInfo esTrafficRequestInfo$RequestInfo) {
        ihc0 ihc0Var = esTrafficRequestInfo$RequestInfo.headers_;
        if (!ihc0Var.f102236a) {
            esTrafficRequestInfo$RequestInfo.headers_ = ihc0Var.m50613h();
        }
        return esTrafficRequestInfo$RequestInfo.headers_;
    }

    /* JADX INFO: renamed from: o */
    public static void m7674o(EsTrafficRequestInfo$RequestInfo esTrafficRequestInfo$RequestInfo, long j) {
        esTrafficRequestInfo$RequestInfo.bytesSent_ = j;
    }

    /* JADX INFO: renamed from: p */
    public static void m7675p(EsTrafficRequestInfo$RequestInfo esTrafficRequestInfo$RequestInfo, ppw ppwVar) {
        esTrafficRequestInfo$RequestInfo.getClass();
        esTrafficRequestInfo$RequestInfo.method_ = ppwVar.getNumber();
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static void m7676q(EsTrafficRequestInfo$RequestInfo esTrafficRequestInfo$RequestInfo, String str) {
        esTrafficRequestInfo$RequestInfo.getClass();
        esTrafficRequestInfo$RequestInfo.sourceIdentifier_ = str;
    }

    /* JADX INFO: renamed from: r */
    public static void m7677r(EsTrafficRequestInfo$RequestInfo esTrafficRequestInfo$RequestInfo, String str) {
        esTrafficRequestInfo$RequestInfo.getClass();
        str.getClass();
        esTrafficRequestInfo$RequestInfo.url_ = str;
    }

    /* JADX INFO: renamed from: t */
    public static EsTrafficRequestInfo$RequestInfo m7678t() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: renamed from: x */
    public static qpw m7679x() {
        return (qpw) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0001\u0000\u0000\u0001\f\u0002Ȉ\u00032\u0004\u0002\u0005Ȉ", new Object[]{"method_", "url_", "headers_", rpw.f201653a, "bytesSent_", "sourceIdentifier_"});
        }
        if (iOrdinal == 3) {
            return new EsTrafficRequestInfo$RequestInfo();
        }
        if (iOrdinal == 4) {
            return new qpw(DEFAULT_INSTANCE);
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
        synchronized (EsTrafficRequestInfo$RequestInfo.class) {
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

    public final String getUrl() {
        return this.url_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: s */
    public final long m7680s() {
        return this.bytesSent_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }

    /* JADX INFO: renamed from: u */
    public final Map m7681u() {
        return Collections.unmodifiableMap(this.headers_);
    }

    /* JADX INFO: renamed from: v */
    public final ppw m7682v() {
        ppw ppwVar;
        switch (this.method_) {
            case 0:
                ppwVar = ppw.HTTP_METHOD_UNSPECIFIED;
                break;
            case 1:
                ppwVar = ppw.HTTP_METHOD_GET;
                break;
            case 2:
                ppwVar = ppw.HTTP_METHOD_POST;
                break;
            case 3:
                ppwVar = ppw.HTTP_METHOD_PUT;
                break;
            case 4:
                ppwVar = ppw.HTTP_METHOD_PATCH;
                break;
            case 5:
                ppwVar = ppw.HTTP_METHOD_DELETE;
                break;
            case 6:
                ppwVar = ppw.HTTP_METHOD_HEAD;
                break;
            case 7:
                ppwVar = ppw.HTTP_METHOD_CONNECT;
                break;
            case 8:
                ppwVar = ppw.HTTP_METHOD_OPTIONS;
                break;
            case 9:
                ppwVar = ppw.HTTP_METHOD_TRACE;
                break;
            default:
                ppwVar = null;
                break;
        }
        return ppwVar == null ? ppw.UNRECOGNIZED : ppwVar;
    }

    /* JADX INFO: renamed from: w */
    public final String m7683w() {
        return this.sourceIdentifier_;
    }
}
