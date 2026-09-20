package com.spotify.offline_esperanto.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.imw;
import p204p.kmw;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes9.dex */
public final class EsOffline$PrepareResourceRequest extends AbstractC0269h implements sre0 {
    private static final EsOffline$PrepareResourceRequest DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER = null;
    public static final int RESOURCE_ID_FIELD_NUMBER = 1;
    public static final int TYPE_FIELD_NUMBER = 2;
    private String resourceId_ = "";
    private int type_;

    static {
        EsOffline$PrepareResourceRequest esOffline$PrepareResourceRequest = new EsOffline$PrepareResourceRequest();
        DEFAULT_INSTANCE = esOffline$PrepareResourceRequest;
        AbstractC0269h.registerDefaultInstance(EsOffline$PrepareResourceRequest.class, esOffline$PrepareResourceRequest);
    }

    private EsOffline$PrepareResourceRequest() {
    }

    /* JADX INFO: renamed from: n */
    public static void m16177n(EsOffline$PrepareResourceRequest esOffline$PrepareResourceRequest, String str) {
        esOffline$PrepareResourceRequest.getClass();
        str.getClass();
        esOffline$PrepareResourceRequest.resourceId_ = str;
    }

    /* JADX INFO: renamed from: o */
    public static void m16178o(EsOffline$PrepareResourceRequest esOffline$PrepareResourceRequest, kmw kmwVar) {
        esOffline$PrepareResourceRequest.getClass();
        esOffline$PrepareResourceRequest.type_ = kmwVar.getNumber();
    }

    /* JADX INFO: renamed from: p */
    public static imw m16179p() {
        return (imw) DEFAULT_INSTANCE.createBuilder();
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
            return new EsOffline$PrepareResourceRequest();
        }
        if (iOrdinal == 4) {
            return new imw(DEFAULT_INSTANCE);
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
        synchronized (EsOffline$PrepareResourceRequest.class) {
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
