package com.spotify.familygatedcontent.p063v1;

import com.google.protobuf.AbstractC0269h;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.t810;
import p204p.z110;

/* JADX INFO: loaded from: classes6.dex */
public final class GetFeatureRequestDialogRequest extends AbstractC0269h implements sre0 {
    public static final int CONTEXT_FIELD_NUMBER = 2;
    private static final GetFeatureRequestDialogRequest DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER = null;
    public static final int REQUESTTYPE_FIELD_NUMBER = 1;
    private int bitField0_;
    private String requestType_ = "";
    private String context_ = "";

    static {
        GetFeatureRequestDialogRequest getFeatureRequestDialogRequest = new GetFeatureRequestDialogRequest();
        DEFAULT_INSTANCE = getFeatureRequestDialogRequest;
        AbstractC0269h.registerDefaultInstance(GetFeatureRequestDialogRequest.class, getFeatureRequestDialogRequest);
    }

    private GetFeatureRequestDialogRequest() {
    }

    /* JADX INFO: renamed from: n */
    public static void m10589n(GetFeatureRequestDialogRequest getFeatureRequestDialogRequest, String str) {
        getFeatureRequestDialogRequest.getClass();
        str.getClass();
        getFeatureRequestDialogRequest.bitField0_ |= 1;
        getFeatureRequestDialogRequest.context_ = str;
    }

    /* JADX INFO: renamed from: o */
    public static void m10590o(GetFeatureRequestDialogRequest getFeatureRequestDialogRequest, String str) {
        getFeatureRequestDialogRequest.getClass();
        str.getClass();
        getFeatureRequestDialogRequest.requestType_ = str;
    }

    /* JADX INFO: renamed from: p */
    public static t810 m10591p() {
        return (t810) DEFAULT_INSTANCE.createBuilder();
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002ለ\u0000", new Object[]{"bitField0_", "requestType_", "context_"});
        }
        if (iOrdinal == 3) {
            return new GetFeatureRequestDialogRequest();
        }
        if (iOrdinal == 4) {
            return new t810(DEFAULT_INSTANCE);
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
        synchronized (GetFeatureRequestDialogRequest.class) {
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
