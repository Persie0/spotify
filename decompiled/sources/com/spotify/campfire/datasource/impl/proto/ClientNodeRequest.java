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

/* JADX INFO: loaded from: classes.dex */
public final class ClientNodeRequest extends AbstractC0269h implements ClientNodeRequestOrBuilder {
    private static final ClientNodeRequest DEFAULT_INSTANCE;
    public static final int NODE_REQUEST_FIELD_NUMBER = 1;
    public static final int OMIT_LATEST_NODE_UPDATES_FIELD_NUMBER = 4;
    public static final int OMIT_PUBSUB_EVENTS_FIELD_NUMBER = 3;
    public static final int OMIT_PUSHER_EVENTS_FIELD_NUMBER = 2;
    private static volatile r2n0 PARSER;
    private ae50 nodeRequest_ = AbstractC0269h.emptyProtobufList();
    private boolean omitLatestNodeUpdates_;
    private boolean omitPubsubEvents_;
    private boolean omitPusherEvents_;

    /* JADX INFO: renamed from: com.spotify.campfire.datasource.impl.proto.ClientNodeRequest$1 */
    /* JADX INFO: loaded from: classes5.dex */
    public static /* synthetic */ class C03451 {

        /* JADX INFO: renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f3173xa1df5c61;

        static {
            int[] iArr = new int[z110.values().length];
            f3173xa1df5c61 = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f3173xa1df5c61[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f3173xa1df5c61[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f3173xa1df5c61[5] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f3173xa1df5c61[6] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f3173xa1df5c61[0] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f3173xa1df5c61[1] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* JADX INFO: loaded from: classes5.dex */
    public static final class Builder extends AbstractC0268g implements ClientNodeRequestOrBuilder {
        public /* synthetic */ Builder(int i) {
            this();
        }

        public Builder addAllNodeRequest(Iterable<? extends NodeRequest> iterable) {
            copyOnWrite();
            ((ClientNodeRequest) this.instance).addAllNodeRequest(iterable);
            return this;
        }

        public Builder addNodeRequest(NodeRequest nodeRequest) {
            copyOnWrite();
            ((ClientNodeRequest) this.instance).addNodeRequest(nodeRequest);
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

        public Builder clearNodeRequest() {
            copyOnWrite();
            ((ClientNodeRequest) this.instance).clearNodeRequest();
            return this;
        }

        public Builder clearOmitLatestNodeUpdates() {
            copyOnWrite();
            ((ClientNodeRequest) this.instance).clearOmitLatestNodeUpdates();
            return this;
        }

        public Builder clearOmitPubsubEvents() {
            copyOnWrite();
            ((ClientNodeRequest) this.instance).clearOmitPubsubEvents();
            return this;
        }

        public Builder clearOmitPusherEvents() {
            copyOnWrite();
            ((ClientNodeRequest) this.instance).clearOmitPusherEvents();
            return this;
        }

        @Override // com.google.protobuf.AbstractC0268g
        /* JADX INFO: renamed from: clone */
        public /* bridge */ /* synthetic */ Object mo98328clone() {
            return super.mo98326clone();
        }

        @Override // com.google.protobuf.AbstractC0268g, p204p.sre0
        public /* bridge */ /* synthetic */ pre0 getDefaultInstanceForType() {
            return super.getDefaultInstanceForType();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.ClientNodeRequestOrBuilder
        public NodeRequest getNodeRequest(int i) {
            return ((ClientNodeRequest) this.instance).getNodeRequest(i);
        }

        @Override // com.spotify.campfire.datasource.impl.proto.ClientNodeRequestOrBuilder
        public int getNodeRequestCount() {
            return ((ClientNodeRequest) this.instance).getNodeRequestCount();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.ClientNodeRequestOrBuilder
        public List<NodeRequest> getNodeRequestList() {
            return Collections.unmodifiableList(((ClientNodeRequest) this.instance).getNodeRequestList());
        }

        @Override // com.spotify.campfire.datasource.impl.proto.ClientNodeRequestOrBuilder
        public boolean getOmitLatestNodeUpdates() {
            return ((ClientNodeRequest) this.instance).getOmitLatestNodeUpdates();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.ClientNodeRequestOrBuilder
        public boolean getOmitPubsubEvents() {
            return ((ClientNodeRequest) this.instance).getOmitPubsubEvents();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.ClientNodeRequestOrBuilder
        public boolean getOmitPusherEvents() {
            return ((ClientNodeRequest) this.instance).getOmitPusherEvents();
        }

        @Override // com.google.protobuf.AbstractC0268g, p204p.AbstractC2081l8
        public /* bridge */ /* synthetic */ AbstractC2081l8 internalMergeFrom(AbstractC2118m8 abstractC2118m8) {
            return super.internalMergeFrom((AbstractC0269h) abstractC2118m8);
        }

        @Override // com.google.protobuf.AbstractC0268g, p204p.AbstractC2081l8, p204p.ore0
        public /* bridge */ /* synthetic */ AbstractC2081l8 mergeFrom(owe oweVar, aux auxVar) {
            return super.mergeFrom(oweVar, auxVar);
        }

        public Builder removeNodeRequest(int i) {
            copyOnWrite();
            ((ClientNodeRequest) this.instance).removeNodeRequest(i);
            return this;
        }

        public Builder setNodeRequest(int i, NodeRequest nodeRequest) {
            copyOnWrite();
            ((ClientNodeRequest) this.instance).setNodeRequest(i, nodeRequest);
            return this;
        }

        public Builder setOmitLatestNodeUpdates(boolean z) {
            copyOnWrite();
            ((ClientNodeRequest) this.instance).setOmitLatestNodeUpdates(z);
            return this;
        }

        public Builder setOmitPubsubEvents(boolean z) {
            copyOnWrite();
            ((ClientNodeRequest) this.instance).setOmitPubsubEvents(z);
            return this;
        }

        public Builder setOmitPusherEvents(boolean z) {
            copyOnWrite();
            ((ClientNodeRequest) this.instance).setOmitPusherEvents(z);
            return this;
        }

        private Builder() {
            super(ClientNodeRequest.DEFAULT_INSTANCE);
        }

        @Override // com.google.protobuf.AbstractC0268g
        /* JADX INFO: renamed from: clone */
        public /* bridge */ /* synthetic */ AbstractC2081l8 mo98327clone() {
            return super.mo98326clone();
        }

        @Override // com.google.protobuf.AbstractC0268g, p204p.AbstractC2081l8
        /* JADX INFO: renamed from: mergeFrom */
        public /* bridge */ /* synthetic */ AbstractC2081l8 mo98329mergeFrom(byte[] bArr, int i, int i2) {
            return super.mo98329mergeFrom(bArr, i, i2);
        }

        public Builder addNodeRequest(int i, NodeRequest nodeRequest) {
            copyOnWrite();
            ((ClientNodeRequest) this.instance).addNodeRequest(i, nodeRequest);
            return this;
        }

        @Override // com.google.protobuf.AbstractC0268g
        /* JADX INFO: renamed from: clone */
        public /* bridge */ /* synthetic */ ore0 mo98327clone() {
            return super.mo98326clone();
        }

        @Override // com.google.protobuf.AbstractC0268g, p204p.AbstractC2081l8
        /* JADX INFO: renamed from: mergeFrom */
        public /* bridge */ /* synthetic */ AbstractC2081l8 mo98330mergeFrom(byte[] bArr, int i, int i2, aux auxVar) {
            return super.mo98330mergeFrom(bArr, i, i2, auxVar);
        }

        public Builder setNodeRequest(int i, NodeRequest.Builder builder) {
            copyOnWrite();
            ((ClientNodeRequest) this.instance).setNodeRequest(i, (NodeRequest) builder.build());
            return this;
        }

        @Override // p204p.AbstractC2081l8
        /* JADX INFO: renamed from: mergeFrom */
        public /* bridge */ /* synthetic */ ore0 mo98371mergeFrom(InputStream inputStream) {
            return super.mo98371mergeFrom(inputStream);
        }

        public Builder addNodeRequest(NodeRequest.Builder builder) {
            copyOnWrite();
            ((ClientNodeRequest) this.instance).addNodeRequest((NodeRequest) builder.build());
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

        public Builder addNodeRequest(int i, NodeRequest.Builder builder) {
            copyOnWrite();
            ((ClientNodeRequest) this.instance).addNodeRequest(i, (NodeRequest) builder.build());
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
        ClientNodeRequest clientNodeRequest = new ClientNodeRequest();
        DEFAULT_INSTANCE = clientNodeRequest;
        AbstractC0269h.registerDefaultInstance(ClientNodeRequest.class, clientNodeRequest);
    }

    private ClientNodeRequest() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllNodeRequest(Iterable<? extends NodeRequest> iterable) {
        ensureNodeRequestIsMutable();
        AbstractC2118m8.addAll(iterable, this.nodeRequest_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addNodeRequest(NodeRequest nodeRequest) {
        nodeRequest.getClass();
        ensureNodeRequestIsMutable();
        this.nodeRequest_.add(nodeRequest);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearNodeRequest() {
        this.nodeRequest_ = AbstractC0269h.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearOmitLatestNodeUpdates() {
        this.omitLatestNodeUpdates_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearOmitPubsubEvents() {
        this.omitPubsubEvents_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearOmitPusherEvents() {
        this.omitPusherEvents_ = false;
    }

    private void ensureNodeRequestIsMutable() {
        ae50 ae50Var = this.nodeRequest_;
        if (((AbstractC1733c9) ae50Var).f35342a) {
            return;
        }
        this.nodeRequest_ = AbstractC0269h.mutableCopy(ae50Var);
    }

    public static ClientNodeRequest getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static ClientNodeRequest parseDelimitedFrom(InputStream inputStream) {
        return (ClientNodeRequest) AbstractC0269h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ClientNodeRequest parseFrom(ByteBuffer byteBuffer) {
        return (ClientNodeRequest) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeNodeRequest(int i) {
        ensureNodeRequestIsMutable();
        this.nodeRequest_.remove(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNodeRequest(int i, NodeRequest nodeRequest) {
        nodeRequest.getClass();
        ensureNodeRequestIsMutable();
        this.nodeRequest_.set(i, nodeRequest);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOmitLatestNodeUpdates(boolean z) {
        this.omitLatestNodeUpdates_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOmitPubsubEvents(boolean z) {
        this.omitPubsubEvents_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOmitPusherEvents(boolean z) {
        this.omitPusherEvents_ = z;
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0001\u0000\u0001\u001b\u0002\u0007\u0003\u0007\u0004\u0007", new Object[]{"nodeRequest_", NodeRequest.class, "omitPusherEvents_", "omitPubsubEvents_", "omitLatestNodeUpdates_"});
        }
        if (iOrdinal == 3) {
            return new ClientNodeRequest();
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
        synchronized (ClientNodeRequest.class) {
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
    public /* bridge */ /* synthetic */ pre0 getDefaultInstanceForType() {
        return getDefaultInstanceForType();
    }

    @Override // com.spotify.campfire.datasource.impl.proto.ClientNodeRequestOrBuilder
    public NodeRequest getNodeRequest(int i) {
        return (NodeRequest) this.nodeRequest_.get(i);
    }

    @Override // com.spotify.campfire.datasource.impl.proto.ClientNodeRequestOrBuilder
    public int getNodeRequestCount() {
        return this.nodeRequest_.size();
    }

    @Override // com.spotify.campfire.datasource.impl.proto.ClientNodeRequestOrBuilder
    public List<NodeRequest> getNodeRequestList() {
        return this.nodeRequest_;
    }

    public NodeRequestOrBuilder getNodeRequestOrBuilder(int i) {
        return (NodeRequestOrBuilder) this.nodeRequest_.get(i);
    }

    public List<? extends NodeRequestOrBuilder> getNodeRequestOrBuilderList() {
        return this.nodeRequest_;
    }

    @Override // com.spotify.campfire.datasource.impl.proto.ClientNodeRequestOrBuilder
    public boolean getOmitLatestNodeUpdates() {
        return this.omitLatestNodeUpdates_;
    }

    @Override // com.spotify.campfire.datasource.impl.proto.ClientNodeRequestOrBuilder
    public boolean getOmitPubsubEvents() {
        return this.omitPubsubEvents_;
    }

    @Override // com.spotify.campfire.datasource.impl.proto.ClientNodeRequestOrBuilder
    public boolean getOmitPusherEvents() {
        return this.omitPusherEvents_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }

    public static Builder newBuilder(ClientNodeRequest clientNodeRequest) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(clientNodeRequest);
    }

    public static ClientNodeRequest parseDelimitedFrom(InputStream inputStream, aux auxVar) {
        return (ClientNodeRequest) AbstractC0269h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, auxVar);
    }

    public static ClientNodeRequest parseFrom(ByteBuffer byteBuffer, aux auxVar) {
        return (ClientNodeRequest) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, byteBuffer, auxVar);
    }

    public static ClientNodeRequest parseFrom(gva gvaVar) {
        return (ClientNodeRequest) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, gvaVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addNodeRequest(int i, NodeRequest nodeRequest) {
        nodeRequest.getClass();
        ensureNodeRequestIsMutable();
        this.nodeRequest_.add(i, nodeRequest);
    }

    public static ClientNodeRequest parseFrom(gva gvaVar, aux auxVar) {
        return (ClientNodeRequest) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, gvaVar, auxVar);
    }

    public static ClientNodeRequest parseFrom(byte[] bArr) {
        return (ClientNodeRequest) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ClientNodeRequest parseFrom(byte[] bArr, aux auxVar) {
        return (ClientNodeRequest) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr, auxVar);
    }

    public static ClientNodeRequest parseFrom(InputStream inputStream) {
        return (ClientNodeRequest) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ClientNodeRequest parseFrom(InputStream inputStream, aux auxVar) {
        return (ClientNodeRequest) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, inputStream, auxVar);
    }

    public static ClientNodeRequest parseFrom(owe oweVar) {
        return (ClientNodeRequest) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, oweVar);
    }

    public static ClientNodeRequest parseFrom(owe oweVar, aux auxVar) {
        return (ClientNodeRequest) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, oweVar, auxVar);
    }
}
