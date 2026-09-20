package com.spotify.share.linkgeneration.api.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.AbstractC1733c9;
import p204p.ae50;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z010;
import p204p.z110;

/* JADX INFO: loaded from: classes2.dex */
public final class GenerateUrlRequest extends AbstractC0269h implements sre0 {
    public static final int CUSTOM_DATA_FIELD_NUMBER = 3;
    private static final GenerateUrlRequest DEFAULT_INSTANCE;
    public static final int LINK_PREVIEW_FIELD_NUMBER = 4;
    private static volatile r2n0 PARSER = null;
    public static final int SPOTIFY_URI_FIELD_NUMBER = 1;
    public static final int UTM_PARAMETERS_FIELD_NUMBER = 2;
    private int bitField0_;
    private LinkPreview linkPreview_;
    private UtmParameters utmParameters_;
    private String spotifyUri_ = "";
    private ae50 customData_ = AbstractC0269h.emptyProtobufList();

    static {
        GenerateUrlRequest generateUrlRequest = new GenerateUrlRequest();
        DEFAULT_INSTANCE = generateUrlRequest;
        AbstractC0269h.registerDefaultInstance(GenerateUrlRequest.class, generateUrlRequest);
    }

    private GenerateUrlRequest() {
    }

    /* JADX INFO: renamed from: n */
    public static void m21013n(GenerateUrlRequest generateUrlRequest, CustomData customData) {
        generateUrlRequest.getClass();
        customData.getClass();
        ae50 ae50Var = generateUrlRequest.customData_;
        if (!((AbstractC1733c9) ae50Var).f35342a) {
            generateUrlRequest.customData_ = AbstractC0269h.mutableCopy(ae50Var);
        }
        generateUrlRequest.customData_.add(customData);
    }

    /* JADX INFO: renamed from: o */
    public static void m21014o(GenerateUrlRequest generateUrlRequest, LinkPreview linkPreview) {
        generateUrlRequest.getClass();
        linkPreview.getClass();
        generateUrlRequest.linkPreview_ = linkPreview;
        generateUrlRequest.bitField0_ |= 2;
    }

    /* JADX INFO: renamed from: p */
    public static void m21015p(GenerateUrlRequest generateUrlRequest, String str) {
        generateUrlRequest.getClass();
        str.getClass();
        generateUrlRequest.spotifyUri_ = str;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static void m21016q(GenerateUrlRequest generateUrlRequest, UtmParameters utmParameters) {
        generateUrlRequest.getClass();
        utmParameters.getClass();
        generateUrlRequest.utmParameters_ = utmParameters;
        generateUrlRequest.bitField0_ |= 1;
    }

    /* JADX INFO: renamed from: s */
    public static z010 m21018s() {
        return (z010) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001Ȉ\u0002ဉ\u0000\u0003\u001b\u0004ဉ\u0001", new Object[]{"bitField0_", "spotifyUri_", "utmParameters_", "customData_", CustomData.class, "linkPreview_"});
        }
        if (iOrdinal == 3) {
            return new GenerateUrlRequest();
        }
        if (iOrdinal == 4) {
            return new z010();
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
        synchronized (GenerateUrlRequest.class) {
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
