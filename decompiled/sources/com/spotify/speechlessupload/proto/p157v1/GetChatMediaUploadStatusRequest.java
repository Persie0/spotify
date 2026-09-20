package com.spotify.speechlessupload.proto.p157v1;

import com.google.protobuf.AbstractC0269h;
import java.util.ArrayList;
import p204p.AbstractC1733c9;
import p204p.AbstractC2118m8;
import p204p.ae50;
import p204p.c710;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes10.dex */
public final class GetChatMediaUploadStatusRequest extends AbstractC0269h implements sre0 {
    private static final GetChatMediaUploadStatusRequest DEFAULT_INSTANCE;
    public static final int ENTITY_URI_FIELD_NUMBER = 1;
    public static final int FILE_URLS_FIELD_NUMBER = 2;
    private static volatile r2n0 PARSER;
    private String entityUri_ = "";
    private ae50 fileUrls_ = AbstractC0269h.emptyProtobufList();

    static {
        GetChatMediaUploadStatusRequest getChatMediaUploadStatusRequest = new GetChatMediaUploadStatusRequest();
        DEFAULT_INSTANCE = getChatMediaUploadStatusRequest;
        AbstractC0269h.registerDefaultInstance(GetChatMediaUploadStatusRequest.class, getChatMediaUploadStatusRequest);
    }

    private GetChatMediaUploadStatusRequest() {
    }

    /* JADX INFO: renamed from: n */
    public static void m21499n(GetChatMediaUploadStatusRequest getChatMediaUploadStatusRequest, ArrayList arrayList) {
        ae50 ae50Var = getChatMediaUploadStatusRequest.fileUrls_;
        if (!((AbstractC1733c9) ae50Var).f35342a) {
            getChatMediaUploadStatusRequest.fileUrls_ = AbstractC0269h.mutableCopy(ae50Var);
        }
        AbstractC2118m8.addAll(arrayList, getChatMediaUploadStatusRequest.fileUrls_);
    }

    /* JADX INFO: renamed from: o */
    public static void m21500o(GetChatMediaUploadStatusRequest getChatMediaUploadStatusRequest, String str) {
        getChatMediaUploadStatusRequest.getClass();
        getChatMediaUploadStatusRequest.entityUri_ = str;
    }

    /* JADX INFO: renamed from: p */
    public static c710 m21501p() {
        return (c710) DEFAULT_INSTANCE.createBuilder();
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001Ȉ\u0002Ț", new Object[]{"entityUri_", "fileUrls_"});
        }
        if (iOrdinal == 3) {
            return new GetChatMediaUploadStatusRequest();
        }
        if (iOrdinal == 4) {
            return new c710(DEFAULT_INSTANCE);
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
        synchronized (GetChatMediaUploadStatusRequest.class) {
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
