package com.spotify.campfire.datasource.impl.proto;

import com.google.protobuf.AbstractC0268g;
import com.google.protobuf.AbstractC0269h;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;
import p204p.AbstractC1733c9;
import p204p.AbstractC2081l8;
import p204p.AbstractC2118m8;
import p204p.ae50;
import p204p.aux;
import p204p.gva;
import p204p.ore0;
import p204p.owe;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.z110;

/* JADX INFO: loaded from: classes5.dex */
public final class ClientNode extends AbstractC0269h implements ClientNodeOrBuilder {
    public static final int CHILD_NODE_FIELD_NUMBER = 3;
    private static final ClientNode DEFAULT_INSTANCE;
    public static final int EVENT_CAPTURE_FIELD_NUMBER = 6;
    public static final int HIERARCHY_IDENTIFIER_FIELD_NUMBER = 2;
    public static final int MESSAGE_PAYLOAD_FIELD_NUMBER = 8;
    public static final int MODERATION_STATUS_FIELD_NUMBER = 5;
    public static final int NODE_IDENTIFIER_FIELD_NUMBER = 1;
    public static final int NODE_STATISTIC_FIELD_NUMBER = 4;
    private static volatile r2n0 PARSER;
    private int bitField0_;
    private ae50 childNode_ = AbstractC0269h.emptyProtobufList();
    private ClientEventCapture eventCapture_;
    private HierarchyIdentifier hierarchyIdentifier_;
    private MessagePayload messagePayload_;
    private ModerationStatus moderationStatus_;
    private NodeIdentifier nodeIdentifier_;
    private NodeStatistic nodeStatistic_;

    /* JADX INFO: renamed from: com.spotify.campfire.datasource.impl.proto.ClientNode$1 */
    public static /* synthetic */ class C03441 {

        /* JADX INFO: renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f3172xa1df5c61;

        static {
            int[] iArr = new int[z110.values().length];
            f3172xa1df5c61 = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f3172xa1df5c61[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f3172xa1df5c61[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f3172xa1df5c61[5] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f3172xa1df5c61[6] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f3172xa1df5c61[0] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f3172xa1df5c61[1] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class Builder extends AbstractC0268g implements ClientNodeOrBuilder {
        public /* synthetic */ Builder(int i) {
            this();
        }

        public Builder addAllChildNode(Iterable<? extends ClientNode> iterable) {
            copyOnWrite();
            ((ClientNode) this.instance).addAllChildNode(iterable);
            return this;
        }

        public Builder addChildNode(ClientNode clientNode) {
            copyOnWrite();
            ((ClientNode) this.instance).addChildNode(clientNode);
            return this;
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

        public Builder clearChildNode() {
            copyOnWrite();
            ((ClientNode) this.instance).clearChildNode();
            return this;
        }

        public Builder clearEventCapture() {
            copyOnWrite();
            ((ClientNode) this.instance).clearEventCapture();
            return this;
        }

        public Builder clearHierarchyIdentifier() {
            copyOnWrite();
            ((ClientNode) this.instance).clearHierarchyIdentifier();
            return this;
        }

        public Builder clearMessagePayload() {
            copyOnWrite();
            ((ClientNode) this.instance).clearMessagePayload();
            return this;
        }

        public Builder clearModerationStatus() {
            copyOnWrite();
            ((ClientNode) this.instance).clearModerationStatus();
            return this;
        }

        public Builder clearNodeIdentifier() {
            copyOnWrite();
            ((ClientNode) this.instance).clearNodeIdentifier();
            return this;
        }

        public Builder clearNodeStatistic() {
            copyOnWrite();
            ((ClientNode) this.instance).clearNodeStatistic();
            return this;
        }

        @Override // com.google.protobuf.AbstractC0268g
        /* JADX INFO: renamed from: clone */
        public /* bridge */ /* synthetic */ Object mo98327clone() {
            return super.mo98326clone();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.ClientNodeOrBuilder
        public ClientNode getChildNode(int i) {
            return ((ClientNode) this.instance).getChildNode(i);
        }

        @Override // com.spotify.campfire.datasource.impl.proto.ClientNodeOrBuilder
        public int getChildNodeCount() {
            return ((ClientNode) this.instance).getChildNodeCount();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.ClientNodeOrBuilder
        public List<ClientNode> getChildNodeList() {
            return Collections.unmodifiableList(((ClientNode) this.instance).getChildNodeList());
        }

        @Override // com.google.protobuf.AbstractC0268g, p204p.sre0
        public /* bridge */ /* synthetic */ pre0 getDefaultInstanceForType() {
            return super.getDefaultInstanceForType();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.ClientNodeOrBuilder
        public ClientEventCapture getEventCapture() {
            return ((ClientNode) this.instance).getEventCapture();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.ClientNodeOrBuilder
        public HierarchyIdentifier getHierarchyIdentifier() {
            return ((ClientNode) this.instance).getHierarchyIdentifier();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.ClientNodeOrBuilder
        public MessagePayload getMessagePayload() {
            return ((ClientNode) this.instance).getMessagePayload();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.ClientNodeOrBuilder
        public ModerationStatus getModerationStatus() {
            return ((ClientNode) this.instance).getModerationStatus();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.ClientNodeOrBuilder
        public NodeIdentifier getNodeIdentifier() {
            return ((ClientNode) this.instance).getNodeIdentifier();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.ClientNodeOrBuilder
        public NodeStatistic getNodeStatistic() {
            return ((ClientNode) this.instance).getNodeStatistic();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.ClientNodeOrBuilder
        public boolean hasEventCapture() {
            return ((ClientNode) this.instance).hasEventCapture();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.ClientNodeOrBuilder
        public boolean hasHierarchyIdentifier() {
            return ((ClientNode) this.instance).hasHierarchyIdentifier();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.ClientNodeOrBuilder
        public boolean hasMessagePayload() {
            return ((ClientNode) this.instance).hasMessagePayload();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.ClientNodeOrBuilder
        public boolean hasModerationStatus() {
            return ((ClientNode) this.instance).hasModerationStatus();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.ClientNodeOrBuilder
        public boolean hasNodeIdentifier() {
            return ((ClientNode) this.instance).hasNodeIdentifier();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.ClientNodeOrBuilder
        public boolean hasNodeStatistic() {
            return ((ClientNode) this.instance).hasNodeStatistic();
        }

        @Override // com.google.protobuf.AbstractC0268g, p204p.AbstractC2081l8
        public /* bridge */ /* synthetic */ AbstractC2081l8 internalMergeFrom(AbstractC2118m8 abstractC2118m8) {
            return super.internalMergeFrom((AbstractC0269h) abstractC2118m8);
        }

        public Builder mergeEventCapture(ClientEventCapture clientEventCapture) {
            copyOnWrite();
            ((ClientNode) this.instance).mergeEventCapture(clientEventCapture);
            return this;
        }

        @Override // com.google.protobuf.AbstractC0268g, p204p.AbstractC2081l8, p204p.ore0
        public /* bridge */ /* synthetic */ AbstractC2081l8 mergeFrom(owe oweVar, aux auxVar) {
            return super.mergeFrom(oweVar, auxVar);
        }

        public Builder mergeHierarchyIdentifier(HierarchyIdentifier hierarchyIdentifier) {
            copyOnWrite();
            ((ClientNode) this.instance).mergeHierarchyIdentifier(hierarchyIdentifier);
            return this;
        }

        public Builder mergeMessagePayload(MessagePayload messagePayload) {
            copyOnWrite();
            ((ClientNode) this.instance).mergeMessagePayload(messagePayload);
            return this;
        }

        public Builder mergeModerationStatus(ModerationStatus moderationStatus) {
            copyOnWrite();
            ((ClientNode) this.instance).mergeModerationStatus(moderationStatus);
            return this;
        }

        public Builder mergeNodeIdentifier(NodeIdentifier nodeIdentifier) {
            copyOnWrite();
            ((ClientNode) this.instance).mergeNodeIdentifier(nodeIdentifier);
            return this;
        }

        public Builder mergeNodeStatistic(NodeStatistic nodeStatistic) {
            copyOnWrite();
            ((ClientNode) this.instance).mergeNodeStatistic(nodeStatistic);
            return this;
        }

        public Builder removeChildNode(int i) {
            copyOnWrite();
            ((ClientNode) this.instance).removeChildNode(i);
            return this;
        }

        public Builder setChildNode(int i, ClientNode clientNode) {
            copyOnWrite();
            ((ClientNode) this.instance).setChildNode(i, clientNode);
            return this;
        }

        public Builder setEventCapture(ClientEventCapture clientEventCapture) {
            copyOnWrite();
            ((ClientNode) this.instance).setEventCapture(clientEventCapture);
            return this;
        }

        public Builder setHierarchyIdentifier(HierarchyIdentifier hierarchyIdentifier) {
            copyOnWrite();
            ((ClientNode) this.instance).setHierarchyIdentifier(hierarchyIdentifier);
            return this;
        }

        public Builder setMessagePayload(MessagePayload messagePayload) {
            copyOnWrite();
            ((ClientNode) this.instance).setMessagePayload(messagePayload);
            return this;
        }

        public Builder setModerationStatus(ModerationStatus moderationStatus) {
            copyOnWrite();
            ((ClientNode) this.instance).setModerationStatus(moderationStatus);
            return this;
        }

        public Builder setNodeIdentifier(NodeIdentifier nodeIdentifier) {
            copyOnWrite();
            ((ClientNode) this.instance).setNodeIdentifier(nodeIdentifier);
            return this;
        }

        public Builder setNodeStatistic(NodeStatistic nodeStatistic) {
            copyOnWrite();
            ((ClientNode) this.instance).setNodeStatistic(nodeStatistic);
            return this;
        }

        private Builder() {
            super(ClientNode.DEFAULT_INSTANCE);
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

        public Builder addChildNode(int i, ClientNode clientNode) {
            copyOnWrite();
            ((ClientNode) this.instance).addChildNode(i, clientNode);
            return this;
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

        public Builder setChildNode(int i, Builder builder) {
            copyOnWrite();
            ((ClientNode) this.instance).setChildNode(i, (ClientNode) builder.build());
            return this;
        }

        public Builder setEventCapture(ClientEventCapture.Builder builder) {
            copyOnWrite();
            ((ClientNode) this.instance).setEventCapture((ClientEventCapture) builder.build());
            return this;
        }

        public Builder setHierarchyIdentifier(HierarchyIdentifier.Builder builder) {
            copyOnWrite();
            ((ClientNode) this.instance).setHierarchyIdentifier((HierarchyIdentifier) builder.build());
            return this;
        }

        public Builder setMessagePayload(MessagePayload.Builder builder) {
            copyOnWrite();
            ((ClientNode) this.instance).setMessagePayload((MessagePayload) builder.build());
            return this;
        }

        public Builder setModerationStatus(ModerationStatus.Builder builder) {
            copyOnWrite();
            ((ClientNode) this.instance).setModerationStatus((ModerationStatus) builder.build());
            return this;
        }

        public Builder setNodeIdentifier(NodeIdentifier.Builder builder) {
            copyOnWrite();
            ((ClientNode) this.instance).setNodeIdentifier((NodeIdentifier) builder.build());
            return this;
        }

        public Builder setNodeStatistic(NodeStatistic.Builder builder) {
            copyOnWrite();
            ((ClientNode) this.instance).setNodeStatistic((NodeStatistic) builder.build());
            return this;
        }

        @Override // p204p.AbstractC2081l8
        /* JADX INFO: renamed from: mergeFrom */
        public /* bridge */ /* synthetic */ ore0 mo98371mergeFrom(InputStream inputStream) {
            return super.mo98371mergeFrom(inputStream);
        }

        public Builder addChildNode(Builder builder) {
            copyOnWrite();
            ((ClientNode) this.instance).addChildNode((ClientNode) builder.build());
            return this;
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

        public Builder addChildNode(int i, Builder builder) {
            copyOnWrite();
            ((ClientNode) this.instance).addChildNode(i, (ClientNode) builder.build());
            return this;
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

    static {
        ClientNode clientNode = new ClientNode();
        DEFAULT_INSTANCE = clientNode;
        AbstractC0269h.registerDefaultInstance(ClientNode.class, clientNode);
    }

    private ClientNode() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllChildNode(Iterable<? extends ClientNode> iterable) {
        ensureChildNodeIsMutable();
        AbstractC2118m8.addAll(iterable, this.childNode_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addChildNode(ClientNode clientNode) {
        clientNode.getClass();
        ensureChildNodeIsMutable();
        this.childNode_.add(clientNode);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearChildNode() {
        this.childNode_ = AbstractC0269h.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEventCapture() {
        this.eventCapture_ = null;
        this.bitField0_ &= -17;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearHierarchyIdentifier() {
        this.hierarchyIdentifier_ = null;
        this.bitField0_ &= -3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMessagePayload() {
        this.messagePayload_ = null;
        this.bitField0_ &= -33;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearModerationStatus() {
        this.moderationStatus_ = null;
        this.bitField0_ &= -9;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearNodeIdentifier() {
        this.nodeIdentifier_ = null;
        this.bitField0_ &= -2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearNodeStatistic() {
        this.nodeStatistic_ = null;
        this.bitField0_ &= -5;
    }

    private void ensureChildNodeIsMutable() {
        ae50 ae50Var = this.childNode_;
        if (((AbstractC1733c9) ae50Var).f35342a) {
            return;
        }
        this.childNode_ = AbstractC0269h.mutableCopy(ae50Var);
    }

    public static ClientNode getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeEventCapture(ClientEventCapture clientEventCapture) {
        clientEventCapture.getClass();
        ClientEventCapture clientEventCapture2 = this.eventCapture_;
        if (clientEventCapture2 == null || clientEventCapture2 == ClientEventCapture.getDefaultInstance()) {
            this.eventCapture_ = clientEventCapture;
        } else {
            this.eventCapture_ = (ClientEventCapture) ((ClientEventCapture.Builder) ClientEventCapture.newBuilder(this.eventCapture_).mergeFrom((AbstractC0269h) clientEventCapture)).buildPartial();
        }
        this.bitField0_ |= 16;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeHierarchyIdentifier(HierarchyIdentifier hierarchyIdentifier) {
        hierarchyIdentifier.getClass();
        HierarchyIdentifier hierarchyIdentifier2 = this.hierarchyIdentifier_;
        if (hierarchyIdentifier2 == null || hierarchyIdentifier2 == HierarchyIdentifier.getDefaultInstance()) {
            this.hierarchyIdentifier_ = hierarchyIdentifier;
        } else {
            this.hierarchyIdentifier_ = (HierarchyIdentifier) ((HierarchyIdentifier.Builder) HierarchyIdentifier.newBuilder(this.hierarchyIdentifier_).mergeFrom((AbstractC0269h) hierarchyIdentifier)).buildPartial();
        }
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeMessagePayload(MessagePayload messagePayload) {
        messagePayload.getClass();
        MessagePayload messagePayload2 = this.messagePayload_;
        if (messagePayload2 == null || messagePayload2 == MessagePayload.getDefaultInstance()) {
            this.messagePayload_ = messagePayload;
        } else {
            this.messagePayload_ = (MessagePayload) ((MessagePayload.Builder) MessagePayload.newBuilder(this.messagePayload_).mergeFrom((AbstractC0269h) messagePayload)).buildPartial();
        }
        this.bitField0_ |= 32;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeModerationStatus(ModerationStatus moderationStatus) {
        moderationStatus.getClass();
        ModerationStatus moderationStatus2 = this.moderationStatus_;
        if (moderationStatus2 == null || moderationStatus2 == ModerationStatus.getDefaultInstance()) {
            this.moderationStatus_ = moderationStatus;
        } else {
            this.moderationStatus_ = (ModerationStatus) ((ModerationStatus.Builder) ModerationStatus.newBuilder(this.moderationStatus_).mergeFrom((AbstractC0269h) moderationStatus)).buildPartial();
        }
        this.bitField0_ |= 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeNodeIdentifier(NodeIdentifier nodeIdentifier) {
        nodeIdentifier.getClass();
        NodeIdentifier nodeIdentifier2 = this.nodeIdentifier_;
        if (nodeIdentifier2 == null || nodeIdentifier2 == NodeIdentifier.getDefaultInstance()) {
            this.nodeIdentifier_ = nodeIdentifier;
        } else {
            this.nodeIdentifier_ = (NodeIdentifier) ((NodeIdentifier.Builder) NodeIdentifier.newBuilder(this.nodeIdentifier_).mergeFrom((AbstractC0269h) nodeIdentifier)).buildPartial();
        }
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeNodeStatistic(NodeStatistic nodeStatistic) {
        nodeStatistic.getClass();
        NodeStatistic nodeStatistic2 = this.nodeStatistic_;
        if (nodeStatistic2 == null || nodeStatistic2 == NodeStatistic.getDefaultInstance()) {
            this.nodeStatistic_ = nodeStatistic;
        } else {
            this.nodeStatistic_ = (NodeStatistic) ((NodeStatistic.Builder) NodeStatistic.newBuilder(this.nodeStatistic_).mergeFrom((AbstractC0269h) nodeStatistic)).buildPartial();
        }
        this.bitField0_ |= 4;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static ClientNode parseDelimitedFrom(InputStream inputStream) {
        return (ClientNode) AbstractC0269h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ClientNode parseFrom(ByteBuffer byteBuffer) {
        return (ClientNode) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeChildNode(int i) {
        ensureChildNodeIsMutable();
        this.childNode_.remove(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setChildNode(int i, ClientNode clientNode) {
        clientNode.getClass();
        ensureChildNodeIsMutable();
        this.childNode_.set(i, clientNode);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEventCapture(ClientEventCapture clientEventCapture) {
        clientEventCapture.getClass();
        this.eventCapture_ = clientEventCapture;
        this.bitField0_ |= 16;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHierarchyIdentifier(HierarchyIdentifier hierarchyIdentifier) {
        hierarchyIdentifier.getClass();
        this.hierarchyIdentifier_ = hierarchyIdentifier;
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMessagePayload(MessagePayload messagePayload) {
        messagePayload.getClass();
        this.messagePayload_ = messagePayload;
        this.bitField0_ |= 32;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setModerationStatus(ModerationStatus moderationStatus) {
        moderationStatus.getClass();
        this.moderationStatus_ = moderationStatus;
        this.bitField0_ |= 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNodeIdentifier(NodeIdentifier nodeIdentifier) {
        nodeIdentifier.getClass();
        this.nodeIdentifier_ = nodeIdentifier;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNodeStatistic(NodeStatistic nodeStatistic) {
        nodeStatistic.getClass();
        this.nodeStatistic_ = nodeStatistic;
        this.bitField0_ |= 4;
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0007\u0000\u0001\u0001\b\u0007\u0000\u0001\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003\u001b\u0004ဉ\u0002\u0005ဉ\u0003\u0006ဉ\u0004\bဉ\u0005", new Object[]{"bitField0_", "nodeIdentifier_", "hierarchyIdentifier_", "childNode_", ClientNode.class, "nodeStatistic_", "moderationStatus_", "eventCapture_", "messagePayload_"});
        }
        if (iOrdinal == 3) {
            return new ClientNode();
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
        synchronized (ClientNode.class) {
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

    @Override // com.spotify.campfire.datasource.impl.proto.ClientNodeOrBuilder
    public ClientNode getChildNode(int i) {
        return (ClientNode) this.childNode_.get(i);
    }

    @Override // com.spotify.campfire.datasource.impl.proto.ClientNodeOrBuilder
    public int getChildNodeCount() {
        return this.childNode_.size();
    }

    @Override // com.spotify.campfire.datasource.impl.proto.ClientNodeOrBuilder
    public List<ClientNode> getChildNodeList() {
        return this.childNode_;
    }

    public ClientNodeOrBuilder getChildNodeOrBuilder(int i) {
        return (ClientNodeOrBuilder) this.childNode_.get(i);
    }

    public List<? extends ClientNodeOrBuilder> getChildNodeOrBuilderList() {
        return this.childNode_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.sre0
    public /* bridge */ /* synthetic */ pre0 getDefaultInstanceForType() {
        return getDefaultInstanceForType();
    }

    @Override // com.spotify.campfire.datasource.impl.proto.ClientNodeOrBuilder
    public ClientEventCapture getEventCapture() {
        ClientEventCapture clientEventCapture = this.eventCapture_;
        return clientEventCapture == null ? ClientEventCapture.getDefaultInstance() : clientEventCapture;
    }

    @Override // com.spotify.campfire.datasource.impl.proto.ClientNodeOrBuilder
    public HierarchyIdentifier getHierarchyIdentifier() {
        HierarchyIdentifier hierarchyIdentifier = this.hierarchyIdentifier_;
        return hierarchyIdentifier == null ? HierarchyIdentifier.getDefaultInstance() : hierarchyIdentifier;
    }

    @Override // com.spotify.campfire.datasource.impl.proto.ClientNodeOrBuilder
    public MessagePayload getMessagePayload() {
        MessagePayload messagePayload = this.messagePayload_;
        return messagePayload == null ? MessagePayload.getDefaultInstance() : messagePayload;
    }

    @Override // com.spotify.campfire.datasource.impl.proto.ClientNodeOrBuilder
    public ModerationStatus getModerationStatus() {
        ModerationStatus moderationStatus = this.moderationStatus_;
        return moderationStatus == null ? ModerationStatus.getDefaultInstance() : moderationStatus;
    }

    @Override // com.spotify.campfire.datasource.impl.proto.ClientNodeOrBuilder
    public NodeIdentifier getNodeIdentifier() {
        NodeIdentifier nodeIdentifier = this.nodeIdentifier_;
        return nodeIdentifier == null ? NodeIdentifier.getDefaultInstance() : nodeIdentifier;
    }

    @Override // com.spotify.campfire.datasource.impl.proto.ClientNodeOrBuilder
    public NodeStatistic getNodeStatistic() {
        NodeStatistic nodeStatistic = this.nodeStatistic_;
        return nodeStatistic == null ? NodeStatistic.getDefaultInstance() : nodeStatistic;
    }

    @Override // com.spotify.campfire.datasource.impl.proto.ClientNodeOrBuilder
    public boolean hasEventCapture() {
        return (this.bitField0_ & 16) != 0;
    }

    @Override // com.spotify.campfire.datasource.impl.proto.ClientNodeOrBuilder
    public boolean hasHierarchyIdentifier() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override // com.spotify.campfire.datasource.impl.proto.ClientNodeOrBuilder
    public boolean hasMessagePayload() {
        return (this.bitField0_ & 32) != 0;
    }

    @Override // com.spotify.campfire.datasource.impl.proto.ClientNodeOrBuilder
    public boolean hasModerationStatus() {
        return (this.bitField0_ & 8) != 0;
    }

    @Override // com.spotify.campfire.datasource.impl.proto.ClientNodeOrBuilder
    public boolean hasNodeIdentifier() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // com.spotify.campfire.datasource.impl.proto.ClientNodeOrBuilder
    public boolean hasNodeStatistic() {
        return (this.bitField0_ & 4) != 0;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }

    public static Builder newBuilder(ClientNode clientNode) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(clientNode);
    }

    public static ClientNode parseDelimitedFrom(InputStream inputStream, aux auxVar) {
        return (ClientNode) AbstractC0269h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, auxVar);
    }

    public static ClientNode parseFrom(ByteBuffer byteBuffer, aux auxVar) {
        return (ClientNode) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, byteBuffer, auxVar);
    }

    public static ClientNode parseFrom(gva gvaVar) {
        return (ClientNode) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, gvaVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addChildNode(int i, ClientNode clientNode) {
        clientNode.getClass();
        ensureChildNodeIsMutable();
        this.childNode_.add(i, clientNode);
    }

    public static ClientNode parseFrom(gva gvaVar, aux auxVar) {
        return (ClientNode) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, gvaVar, auxVar);
    }

    public static ClientNode parseFrom(byte[] bArr) {
        return (ClientNode) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ClientNode parseFrom(byte[] bArr, aux auxVar) {
        return (ClientNode) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr, auxVar);
    }

    public static ClientNode parseFrom(InputStream inputStream) {
        return (ClientNode) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ClientNode parseFrom(InputStream inputStream, aux auxVar) {
        return (ClientNode) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, inputStream, auxVar);
    }

    public static ClientNode parseFrom(owe oweVar) {
        return (ClientNode) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, oweVar);
    }

    public static ClientNode parseFrom(owe oweVar, aux auxVar) {
        return (ClientNode) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, oweVar, auxVar);
    }
}
