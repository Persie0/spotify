package com.spotify.campfire.datasource.impl.proto;

import com.google.protobuf.AbstractC0268g;
import com.google.protobuf.AbstractC0269h;
import com.google.protobuf.Timestamp;
import java.io.InputStream;
import java.nio.ByteBuffer;
import p204p.AbstractC2081l8;
import p204p.AbstractC2118m8;
import p204p.aux;
import p204p.gva;
import p204p.lu71;
import p204p.ore0;
import p204p.owe;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.z110;

/* JADX INFO: loaded from: classes5.dex */
public final class NodeRequest extends AbstractC0269h implements NodeRequestOrBuilder {
    public static final int BULK_MESSAGE_REQUEST_FIELD_NUMBER = 3;
    private static final NodeRequest DEFAULT_INSTANCE;
    public static final int DIGEST_FIELD_NUMBER = 6;
    public static final int HIERARCHY_REQUEST_FIELD_NUMBER = 1;
    public static final int MESSAGE_REQUEST_FIELD_NUMBER = 2;
    public static final int OCCURRED_AT_FIELD_NUMBER = 4;
    private static volatile r2n0 PARSER = null;
    public static final int REPLAY_FIELD_NUMBER = 5;
    private int bitField0_;
    private Object cnr_;
    private Timestamp occurredAt_;
    private boolean replay_;
    private int cnrCase_ = 0;
    private String digest_ = "";

    /* JADX INFO: renamed from: com.spotify.campfire.datasource.impl.proto.NodeRequest$1 */
    public static /* synthetic */ class C04171 {

        /* JADX INFO: renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f3233xa1df5c61;

        static {
            int[] iArr = new int[z110.values().length];
            f3233xa1df5c61 = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f3233xa1df5c61[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f3233xa1df5c61[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f3233xa1df5c61[5] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f3233xa1df5c61[6] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f3233xa1df5c61[0] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f3233xa1df5c61[1] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class Builder extends AbstractC0268g implements NodeRequestOrBuilder {
        public /* synthetic */ Builder(int i) {
            this();
        }

        @Override // com.google.protobuf.AbstractC0268g, p204p.ore0
        public /* bridge */ /* synthetic */ pre0 build() {
            return build();
        }

        @Override // com.google.protobuf.AbstractC0268g, p204p.ore0
        public /* bridge */ /* synthetic */ pre0 buildPartial() {
            return super.buildPartial();
        }

        @Override // com.google.protobuf.AbstractC0268g
        /* JADX INFO: renamed from: clear */
        public /* bridge */ /* synthetic */ ore0 mo98325clear() {
            return mo98325clear();
        }

        public Builder clearBulkMessageRequest() {
            copyOnWrite();
            ((NodeRequest) this.instance).clearBulkMessageRequest();
            return this;
        }

        public Builder clearCnr() {
            copyOnWrite();
            ((NodeRequest) this.instance).clearCnr();
            return this;
        }

        public Builder clearDigest() {
            copyOnWrite();
            ((NodeRequest) this.instance).clearDigest();
            return this;
        }

        public Builder clearHierarchyRequest() {
            copyOnWrite();
            ((NodeRequest) this.instance).clearHierarchyRequest();
            return this;
        }

        public Builder clearMessageRequest() {
            copyOnWrite();
            ((NodeRequest) this.instance).clearMessageRequest();
            return this;
        }

        public Builder clearOccurredAt() {
            copyOnWrite();
            ((NodeRequest) this.instance).clearOccurredAt();
            return this;
        }

        public Builder clearReplay() {
            copyOnWrite();
            ((NodeRequest) this.instance).clearReplay();
            return this;
        }

        @Override // com.google.protobuf.AbstractC0268g
        /* JADX INFO: renamed from: clone */
        public /* bridge */ /* synthetic */ Object mo98327clone() {
            return super.mo98326clone();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.NodeRequestOrBuilder
        public BulkMessageRequest getBulkMessageRequest() {
            return ((NodeRequest) this.instance).getBulkMessageRequest();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.NodeRequestOrBuilder
        public CnrCase getCnrCase() {
            return ((NodeRequest) this.instance).getCnrCase();
        }

        @Override // com.google.protobuf.AbstractC0268g, p204p.sre0
        public /* bridge */ /* synthetic */ pre0 getDefaultInstanceForType() {
            return super.getDefaultInstanceForType();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.NodeRequestOrBuilder
        public String getDigest() {
            return ((NodeRequest) this.instance).getDigest();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.NodeRequestOrBuilder
        public gva getDigestBytes() {
            return ((NodeRequest) this.instance).getDigestBytes();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.NodeRequestOrBuilder
        public HierarchyRequest getHierarchyRequest() {
            return ((NodeRequest) this.instance).getHierarchyRequest();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.NodeRequestOrBuilder
        public MessageRequest getMessageRequest() {
            return ((NodeRequest) this.instance).getMessageRequest();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.NodeRequestOrBuilder
        public Timestamp getOccurredAt() {
            return ((NodeRequest) this.instance).getOccurredAt();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.NodeRequestOrBuilder
        public boolean getReplay() {
            return ((NodeRequest) this.instance).getReplay();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.NodeRequestOrBuilder
        public boolean hasBulkMessageRequest() {
            return ((NodeRequest) this.instance).hasBulkMessageRequest();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.NodeRequestOrBuilder
        public boolean hasDigest() {
            return ((NodeRequest) this.instance).hasDigest();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.NodeRequestOrBuilder
        public boolean hasHierarchyRequest() {
            return ((NodeRequest) this.instance).hasHierarchyRequest();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.NodeRequestOrBuilder
        public boolean hasMessageRequest() {
            return ((NodeRequest) this.instance).hasMessageRequest();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.NodeRequestOrBuilder
        public boolean hasOccurredAt() {
            return ((NodeRequest) this.instance).hasOccurredAt();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.NodeRequestOrBuilder
        public boolean hasReplay() {
            return ((NodeRequest) this.instance).hasReplay();
        }

        @Override // com.google.protobuf.AbstractC0268g, p204p.AbstractC2081l8
        public /* bridge */ /* synthetic */ AbstractC2081l8 internalMergeFrom(AbstractC2118m8 abstractC2118m8) {
            return super.internalMergeFrom((AbstractC0269h) abstractC2118m8);
        }

        public Builder mergeBulkMessageRequest(BulkMessageRequest bulkMessageRequest) {
            copyOnWrite();
            ((NodeRequest) this.instance).mergeBulkMessageRequest(bulkMessageRequest);
            return this;
        }

        @Override // com.google.protobuf.AbstractC0268g, p204p.AbstractC2081l8, p204p.ore0
        public /* bridge */ /* synthetic */ AbstractC2081l8 mergeFrom(owe oweVar, aux auxVar) {
            return super.mergeFrom(oweVar, auxVar);
        }

        public Builder mergeHierarchyRequest(HierarchyRequest hierarchyRequest) {
            copyOnWrite();
            ((NodeRequest) this.instance).mergeHierarchyRequest(hierarchyRequest);
            return this;
        }

        public Builder mergeMessageRequest(MessageRequest messageRequest) {
            copyOnWrite();
            ((NodeRequest) this.instance).mergeMessageRequest(messageRequest);
            return this;
        }

        public Builder mergeOccurredAt(Timestamp timestamp) {
            copyOnWrite();
            ((NodeRequest) this.instance).mergeOccurredAt(timestamp);
            return this;
        }

        public Builder setBulkMessageRequest(BulkMessageRequest bulkMessageRequest) {
            copyOnWrite();
            ((NodeRequest) this.instance).setBulkMessageRequest(bulkMessageRequest);
            return this;
        }

        public Builder setDigest(String str) {
            copyOnWrite();
            ((NodeRequest) this.instance).setDigest(str);
            return this;
        }

        public Builder setDigestBytes(gva gvaVar) {
            copyOnWrite();
            ((NodeRequest) this.instance).setDigestBytes(gvaVar);
            return this;
        }

        public Builder setHierarchyRequest(HierarchyRequest hierarchyRequest) {
            copyOnWrite();
            ((NodeRequest) this.instance).setHierarchyRequest(hierarchyRequest);
            return this;
        }

        public Builder setMessageRequest(MessageRequest messageRequest) {
            copyOnWrite();
            ((NodeRequest) this.instance).setMessageRequest(messageRequest);
            return this;
        }

        public Builder setOccurredAt(Timestamp timestamp) {
            copyOnWrite();
            ((NodeRequest) this.instance).setOccurredAt(timestamp);
            return this;
        }

        public Builder setReplay(boolean z) {
            copyOnWrite();
            ((NodeRequest) this.instance).setReplay(z);
            return this;
        }

        private Builder() {
            super(NodeRequest.DEFAULT_INSTANCE);
        }

        @Override // com.google.protobuf.AbstractC0268g
        /* JADX INFO: renamed from: clone */
        public /* bridge */ /* synthetic */ AbstractC2081l8 mo98328clone() {
            return super.mo98326clone();
        }

        @Override // com.google.protobuf.AbstractC0268g, p204p.AbstractC2081l8
        /* JADX INFO: renamed from: mergeFrom */
        public /* bridge */ /* synthetic */ AbstractC2081l8 mo98329mergeFrom(byte[] bArr, int i, int i2) {
            return super.mo98329mergeFrom(bArr, i, i2);
        }

        @Override // com.google.protobuf.AbstractC0268g
        /* JADX INFO: renamed from: clone */
        public /* bridge */ /* synthetic */ ore0 mo98328clone() {
            return super.mo98326clone();
        }

        @Override // com.google.protobuf.AbstractC0268g, p204p.AbstractC2081l8
        /* JADX INFO: renamed from: mergeFrom */
        public /* bridge */ /* synthetic */ AbstractC2081l8 mo98330mergeFrom(byte[] bArr, int i, int i2, aux auxVar) {
            return super.mo98330mergeFrom(bArr, i, i2, auxVar);
        }

        public Builder setBulkMessageRequest(BulkMessageRequest.Builder builder) {
            copyOnWrite();
            ((NodeRequest) this.instance).setBulkMessageRequest((BulkMessageRequest) builder.build());
            return this;
        }

        public Builder setHierarchyRequest(HierarchyRequest.Builder builder) {
            copyOnWrite();
            ((NodeRequest) this.instance).setHierarchyRequest((HierarchyRequest) builder.build());
            return this;
        }

        public Builder setMessageRequest(MessageRequest.Builder builder) {
            copyOnWrite();
            ((NodeRequest) this.instance).setMessageRequest((MessageRequest) builder.build());
            return this;
        }

        public Builder setOccurredAt(lu71 lu71Var) {
            copyOnWrite();
            ((NodeRequest) this.instance).setOccurredAt((Timestamp) lu71Var.build());
            return this;
        }

        @Override // p204p.AbstractC2081l8
        /* JADX INFO: renamed from: mergeFrom */
        public /* bridge */ /* synthetic */ ore0 mo98371mergeFrom(InputStream inputStream) {
            return super.mo98371mergeFrom(inputStream);
        }

        @Override // p204p.AbstractC2081l8
        /* JADX INFO: renamed from: mergeFrom */
        public /* bridge */ /* synthetic */ ore0 mo98372mergeFrom(InputStream inputStream, aux auxVar) {
            return super.mo98372mergeFrom(inputStream, auxVar);
        }

        @Override // p204p.AbstractC2081l8
        /* JADX INFO: renamed from: mergeFrom */
        public /* bridge */ /* synthetic */ ore0 mo98373mergeFrom(gva gvaVar) {
            return super.mo98373mergeFrom(gvaVar);
        }

        @Override // p204p.AbstractC2081l8
        /* JADX INFO: renamed from: mergeFrom */
        public /* bridge */ /* synthetic */ ore0 mo98374mergeFrom(gva gvaVar, aux auxVar) {
            return super.mo98374mergeFrom(gvaVar, auxVar);
        }

        @Override // p204p.AbstractC2081l8
        /* JADX INFO: renamed from: mergeFrom */
        public /* bridge */ /* synthetic */ ore0 mo98375mergeFrom(owe oweVar) {
            return super.mo98375mergeFrom(oweVar);
        }

        @Override // com.google.protobuf.AbstractC0268g, p204p.ore0
        public /* bridge */ /* synthetic */ ore0 mergeFrom(owe oweVar, aux auxVar) {
            return super.mergeFrom(oweVar, auxVar);
        }

        @Override // p204p.AbstractC2081l8, p204p.ore0
        public /* bridge */ /* synthetic */ ore0 mergeFrom(pre0 pre0Var) {
            return super.mergeFrom(pre0Var);
        }

        @Override // p204p.AbstractC2081l8
        /* JADX INFO: renamed from: mergeFrom */
        public /* bridge */ /* synthetic */ ore0 mo98376mergeFrom(byte[] bArr) {
            return super.mo98376mergeFrom(bArr);
        }

        @Override // com.google.protobuf.AbstractC0268g
        /* JADX INFO: renamed from: mergeFrom */
        public /* bridge */ /* synthetic */ ore0 mo98329mergeFrom(byte[] bArr, int i, int i2) {
            return super.mo98329mergeFrom(bArr, i, i2);
        }

        @Override // com.google.protobuf.AbstractC0268g
        /* JADX INFO: renamed from: mergeFrom */
        public /* bridge */ /* synthetic */ ore0 mo98330mergeFrom(byte[] bArr, int i, int i2, aux auxVar) {
            return super.mo98330mergeFrom(bArr, i, i2, auxVar);
        }

        @Override // p204p.AbstractC2081l8
        /* JADX INFO: renamed from: mergeFrom */
        public /* bridge */ /* synthetic */ ore0 mo98377mergeFrom(byte[] bArr, aux auxVar) {
            return super.mo98377mergeFrom(bArr, auxVar);
        }
    }

    public enum CnrCase {
        HIERARCHY_REQUEST(1),
        MESSAGE_REQUEST(2),
        BULK_MESSAGE_REQUEST(3),
        CNR_NOT_SET(0);

        private final int value;

        CnrCase(int i) {
            this.value = i;
        }

        public static CnrCase forNumber(int i) {
            if (i == 0) {
                return CNR_NOT_SET;
            }
            if (i == 1) {
                return HIERARCHY_REQUEST;
            }
            if (i == 2) {
                return MESSAGE_REQUEST;
            }
            if (i != 3) {
                return null;
            }
            return BULK_MESSAGE_REQUEST;
        }

        public int getNumber() {
            return this.value;
        }

        @Deprecated
        public static CnrCase valueOf(int i) {
            return forNumber(i);
        }
    }

    static {
        NodeRequest nodeRequest = new NodeRequest();
        DEFAULT_INSTANCE = nodeRequest;
        AbstractC0269h.registerDefaultInstance(NodeRequest.class, nodeRequest);
    }

    private NodeRequest() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBulkMessageRequest() {
        if (this.cnrCase_ == 3) {
            this.cnrCase_ = 0;
            this.cnr_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCnr() {
        this.cnrCase_ = 0;
        this.cnr_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDigest() {
        this.bitField0_ &= -5;
        this.digest_ = getDefaultInstance().getDigest();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearHierarchyRequest() {
        if (this.cnrCase_ == 1) {
            this.cnrCase_ = 0;
            this.cnr_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMessageRequest() {
        if (this.cnrCase_ == 2) {
            this.cnrCase_ = 0;
            this.cnr_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearOccurredAt() {
        this.occurredAt_ = null;
        this.bitField0_ &= -2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearReplay() {
        this.bitField0_ &= -3;
        this.replay_ = false;
    }

    public static NodeRequest getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeBulkMessageRequest(BulkMessageRequest bulkMessageRequest) {
        bulkMessageRequest.getClass();
        if (this.cnrCase_ != 3 || this.cnr_ == BulkMessageRequest.getDefaultInstance()) {
            this.cnr_ = bulkMessageRequest;
        } else {
            this.cnr_ = ((BulkMessageRequest.Builder) BulkMessageRequest.newBuilder((BulkMessageRequest) this.cnr_).mergeFrom((AbstractC0269h) bulkMessageRequest)).buildPartial();
        }
        this.cnrCase_ = 3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeHierarchyRequest(HierarchyRequest hierarchyRequest) {
        hierarchyRequest.getClass();
        if (this.cnrCase_ != 1 || this.cnr_ == HierarchyRequest.getDefaultInstance()) {
            this.cnr_ = hierarchyRequest;
        } else {
            this.cnr_ = ((HierarchyRequest.Builder) HierarchyRequest.newBuilder((HierarchyRequest) this.cnr_).mergeFrom((AbstractC0269h) hierarchyRequest)).buildPartial();
        }
        this.cnrCase_ = 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeMessageRequest(MessageRequest messageRequest) {
        messageRequest.getClass();
        if (this.cnrCase_ != 2 || this.cnr_ == MessageRequest.getDefaultInstance()) {
            this.cnr_ = messageRequest;
        } else {
            this.cnr_ = ((MessageRequest.Builder) MessageRequest.newBuilder((MessageRequest) this.cnr_).mergeFrom((AbstractC0269h) messageRequest)).buildPartial();
        }
        this.cnrCase_ = 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeOccurredAt(Timestamp timestamp) {
        timestamp.getClass();
        Timestamp timestamp2 = this.occurredAt_;
        if (timestamp2 == null || timestamp2 == Timestamp.m1965q()) {
            this.occurredAt_ = timestamp;
        } else {
            this.occurredAt_ = (Timestamp) ((lu71) Timestamp.m1967u(this.occurredAt_).mergeFrom((AbstractC0269h) timestamp)).buildPartial();
        }
        this.bitField0_ |= 1;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static NodeRequest parseDelimitedFrom(InputStream inputStream) {
        return (NodeRequest) AbstractC0269h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static NodeRequest parseFrom(ByteBuffer byteBuffer) {
        return (NodeRequest) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBulkMessageRequest(BulkMessageRequest bulkMessageRequest) {
        bulkMessageRequest.getClass();
        this.cnr_ = bulkMessageRequest;
        this.cnrCase_ = 3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDigest(String str) {
        str.getClass();
        this.bitField0_ |= 4;
        this.digest_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDigestBytes(gva gvaVar) {
        AbstractC2118m8.checkByteStringIsUtf8(gvaVar);
        this.digest_ = gvaVar.m45892u();
        this.bitField0_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHierarchyRequest(HierarchyRequest hierarchyRequest) {
        hierarchyRequest.getClass();
        this.cnr_ = hierarchyRequest;
        this.cnrCase_ = 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMessageRequest(MessageRequest messageRequest) {
        messageRequest.getClass();
        this.cnr_ = messageRequest;
        this.cnrCase_ = 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOccurredAt(Timestamp timestamp) {
        timestamp.getClass();
        this.occurredAt_ = timestamp;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setReplay(boolean z) {
        this.bitField0_ |= 2;
        this.replay_ = z;
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0001\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000\u0004ဉ\u0000\u0005ဇ\u0001\u0006ለ\u0002", new Object[]{"cnr_", "cnrCase_", "bitField0_", HierarchyRequest.class, MessageRequest.class, BulkMessageRequest.class, "occurredAt_", "replay_", "digest_"});
        }
        if (iOrdinal == 3) {
            return new NodeRequest();
        }
        if (iOrdinal == 4) {
            return new Builder(0);
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
        synchronized (NodeRequest.class) {
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

    @Override // com.spotify.campfire.datasource.impl.proto.NodeRequestOrBuilder
    public BulkMessageRequest getBulkMessageRequest() {
        return this.cnrCase_ == 3 ? (BulkMessageRequest) this.cnr_ : BulkMessageRequest.getDefaultInstance();
    }

    @Override // com.spotify.campfire.datasource.impl.proto.NodeRequestOrBuilder
    public CnrCase getCnrCase() {
        return CnrCase.forNumber(this.cnrCase_);
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.sre0
    public /* bridge */ /* synthetic */ pre0 getDefaultInstanceForType() {
        return getDefaultInstanceForType();
    }

    @Override // com.spotify.campfire.datasource.impl.proto.NodeRequestOrBuilder
    public String getDigest() {
        return this.digest_;
    }

    @Override // com.spotify.campfire.datasource.impl.proto.NodeRequestOrBuilder
    public gva getDigestBytes() {
        return gva.m45888f(this.digest_);
    }

    @Override // com.spotify.campfire.datasource.impl.proto.NodeRequestOrBuilder
    public HierarchyRequest getHierarchyRequest() {
        return this.cnrCase_ == 1 ? (HierarchyRequest) this.cnr_ : HierarchyRequest.getDefaultInstance();
    }

    @Override // com.spotify.campfire.datasource.impl.proto.NodeRequestOrBuilder
    public MessageRequest getMessageRequest() {
        return this.cnrCase_ == 2 ? (MessageRequest) this.cnr_ : MessageRequest.getDefaultInstance();
    }

    @Override // com.spotify.campfire.datasource.impl.proto.NodeRequestOrBuilder
    public Timestamp getOccurredAt() {
        Timestamp timestamp = this.occurredAt_;
        return timestamp == null ? Timestamp.m1965q() : timestamp;
    }

    @Override // com.spotify.campfire.datasource.impl.proto.NodeRequestOrBuilder
    public boolean getReplay() {
        return this.replay_;
    }

    @Override // com.spotify.campfire.datasource.impl.proto.NodeRequestOrBuilder
    public boolean hasBulkMessageRequest() {
        return this.cnrCase_ == 3;
    }

    @Override // com.spotify.campfire.datasource.impl.proto.NodeRequestOrBuilder
    public boolean hasDigest() {
        return (this.bitField0_ & 4) != 0;
    }

    @Override // com.spotify.campfire.datasource.impl.proto.NodeRequestOrBuilder
    public boolean hasHierarchyRequest() {
        return this.cnrCase_ == 1;
    }

    @Override // com.spotify.campfire.datasource.impl.proto.NodeRequestOrBuilder
    public boolean hasMessageRequest() {
        return this.cnrCase_ == 2;
    }

    @Override // com.spotify.campfire.datasource.impl.proto.NodeRequestOrBuilder
    public boolean hasOccurredAt() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // com.spotify.campfire.datasource.impl.proto.NodeRequestOrBuilder
    public boolean hasReplay() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }

    public static Builder newBuilder(NodeRequest nodeRequest) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(nodeRequest);
    }

    public static NodeRequest parseDelimitedFrom(InputStream inputStream, aux auxVar) {
        return (NodeRequest) AbstractC0269h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, auxVar);
    }

    public static NodeRequest parseFrom(ByteBuffer byteBuffer, aux auxVar) {
        return (NodeRequest) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, byteBuffer, auxVar);
    }

    public static NodeRequest parseFrom(gva gvaVar) {
        return (NodeRequest) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, gvaVar);
    }

    public static NodeRequest parseFrom(gva gvaVar, aux auxVar) {
        return (NodeRequest) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, gvaVar, auxVar);
    }

    public static NodeRequest parseFrom(byte[] bArr) {
        return (NodeRequest) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static NodeRequest parseFrom(byte[] bArr, aux auxVar) {
        return (NodeRequest) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr, auxVar);
    }

    public static NodeRequest parseFrom(InputStream inputStream) {
        return (NodeRequest) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static NodeRequest parseFrom(InputStream inputStream, aux auxVar) {
        return (NodeRequest) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, inputStream, auxVar);
    }

    public static NodeRequest parseFrom(owe oweVar) {
        return (NodeRequest) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, oweVar);
    }

    public static NodeRequest parseFrom(owe oweVar, aux auxVar) {
        return (NodeRequest) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, oweVar, auxVar);
    }
}
