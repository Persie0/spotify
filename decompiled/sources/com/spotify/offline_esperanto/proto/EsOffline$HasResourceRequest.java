package com.spotify.offline_esperanto.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.fmw;
import p204p.kmw;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes9.dex */
public final class EsOffline$HasResourceRequest extends AbstractC0269h implements sre0 {
    private static final EsOffline$HasResourceRequest DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER = null;
    public static final int RESOURCE_ID_FIELD_NUMBER = 1;
    public static final int TYPE_FIELD_NUMBER = 2;
    private String resourceId_ = "";
    private int type_;

    static {
        EsOffline$HasResourceRequest esOffline$HasResourceRequest = new EsOffline$HasResourceRequest();
        DEFAULT_INSTANCE = esOffline$HasResourceRequest;
        AbstractC0269h.registerDefaultInstance(EsOffline$HasResourceRequest.class, esOffline$HasResourceRequest);
    }

    private EsOffline$HasResourceRequest() {
    }

    /* JADX INFO: renamed from: n */
    public static void m16160n(EsOffline$HasResourceRequest esOffline$HasResourceRequest, String str) {
        esOffline$HasResourceRequest.getClass();
        str.getClass();
        esOffline$HasResourceRequest.resourceId_ = str;
    }

    /* JADX INFO: renamed from: o */
    public static void m16161o(EsOffline$HasResourceRequest esOffline$HasResourceRequest, kmw kmwVar) {
        esOffline$HasResourceRequest.getClass();
        esOffline$HasResourceRequest.type_ = kmwVar.getNumber();
    }

    /* JADX INFO: renamed from: p */
    public static fmw m16162p() {
        return (fmw) DEFAULT_INSTANCE.createBuilder();
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002\f", new Object[]{"resourceId_", "type_"});
        }
        if (iOrdinal == 3) {
            return new EsOffline$HasResourceRequest();
        }
        if (iOrdinal == 4) {
            return new fmw(DEFAULT_INSTANCE);
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
        synchronized (EsOffline$HasResourceRequest.class) {
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
