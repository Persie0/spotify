package com.spotify.speechlessupload.proto.p157v1;

import com.google.protobuf.AbstractC0269h;
import p204p.ioc;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.shd;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes10.dex */
public final class ChatMediaUploadFileStatus extends AbstractC0269h implements sre0 {
    private static final ChatMediaUploadFileStatus DEFAULT_INSTANCE;
    public static final int FILE_URL_FIELD_NUMBER = 1;
    private static volatile r2n0 PARSER = null;
    public static final int STATUS_FIELD_NUMBER = 2;
    private String fileUrl_ = "";
    private int status_;

    static {
        ChatMediaUploadFileStatus chatMediaUploadFileStatus = new ChatMediaUploadFileStatus();
        DEFAULT_INSTANCE = chatMediaUploadFileStatus;
        AbstractC0269h.registerDefaultInstance(ChatMediaUploadFileStatus.class, chatMediaUploadFileStatus);
    }

    private ChatMediaUploadFileStatus() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002\f", new Object[]{"fileUrl_", "status_"});
        }
        if (iOrdinal == 3) {
            return new ChatMediaUploadFileStatus();
        }
        if (iOrdinal == 4) {
            return new ioc(DEFAULT_INSTANCE, 10);
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
        synchronized (ChatMediaUploadFileStatus.class) {
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

    /* JADX INFO: renamed from: n */
    public final shd m21493n() {
        shd shdVar;
        int i = this.status_;
        if (i == 0) {
            shdVar = shd.CHAT_MEDIA_UPLOAD_STATE_UNSPECIFIED;
        } else if (i == 1) {
            shdVar = shd.CHAT_MEDIA_UPLOAD_STATE_PROCESSING;
        } else if (i != 2) {
            shdVar = i != 3 ? null : shd.CHAT_MEDIA_UPLOAD_STATE_FAILED;
        } else {
            shdVar = shd.CHAT_MEDIA_UPLOAD_STATE_COMPLETED;
        }
        return shdVar == null ? shd.UNRECOGNIZED : shdVar;
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
