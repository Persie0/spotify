package com.spotify.speechlessupload.proto.p157v1;

import com.google.protobuf.AbstractC0269h;
import com.spotify.campfire.datasource.impl.proto.HierarchyIdentifier;
import com.spotify.campfire.datasource.impl.proto.NodeIdentifier;
import p204p.ae50;
import p204p.fs51;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes10.dex */
public final class SubmitChatMediaUploadResponse extends AbstractC0269h implements sre0 {
    private static final SubmitChatMediaUploadResponse DEFAULT_INSTANCE;
    public static final int HIERARCHY_IDENTIFIER_FIELD_NUMBER = 3;
    public static final int NODE_IDENTIFIER_FIELD_NUMBER = 4;
    private static volatile r2n0 PARSER = null;
    public static final int UPLOAD_IDS_FIELD_NUMBER = 2;
    private int bitField0_;
    private HierarchyIdentifier hierarchyIdentifier_;
    private NodeIdentifier nodeIdentifier_;
    private ae50 uploadIds_ = AbstractC0269h.emptyProtobufList();

    static {
        SubmitChatMediaUploadResponse submitChatMediaUploadResponse = new SubmitChatMediaUploadResponse();
        DEFAULT_INSTANCE = submitChatMediaUploadResponse;
        AbstractC0269h.registerDefaultInstance(SubmitChatMediaUploadResponse.class, submitChatMediaUploadResponse);
    }

    private SubmitChatMediaUploadResponse() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0002\u0004\u0003\u0000\u0001\u0000\u0002Ț\u0003ဉ\u0000\u0004ဉ\u0001", new Object[]{"bitField0_", "uploadIds_", "hierarchyIdentifier_", "nodeIdentifier_"});
        }
        if (iOrdinal == 3) {
            return new SubmitChatMediaUploadResponse();
        }
        if (iOrdinal == 4) {
            return new fs51(DEFAULT_INSTANCE);
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
        synchronized (SubmitChatMediaUploadResponse.class) {
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

    public final NodeIdentifier getNodeIdentifier() {
        NodeIdentifier nodeIdentifier = this.nodeIdentifier_;
        return nodeIdentifier == null ? NodeIdentifier.getDefaultInstance() : nodeIdentifier;
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
