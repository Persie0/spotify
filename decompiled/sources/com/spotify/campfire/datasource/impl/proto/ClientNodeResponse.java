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
public final class ClientNodeResponse extends AbstractC0269h implements ClientNodeResponseOrBuilder {
    public static final int CLIENT_NODE_FIELD_NUMBER = 2;
    private static final ClientNodeResponse DEFAULT_INSTANCE;
    public static final int HIERARCHY_FIELD_NUMBER = 1;
    private static volatile r2n0 PARSER;
    private int bitField0_;
    private ae50 clientNode_ = AbstractC0269h.emptyProtobufList();
    private Hierarchy hierarchy_;

    /* JADX INFO: renamed from: com.spotify.campfire.datasource.impl.proto.ClientNodeResponse$1 */
    public static /* synthetic */ class C03461 {

        /* JADX INFO: renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f3174xa1df5c61;

        static {
            int[] iArr = new int[z110.values().length];
            f3174xa1df5c61 = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f3174xa1df5c61[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f3174xa1df5c61[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f3174xa1df5c61[5] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f3174xa1df5c61[6] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f3174xa1df5c61[0] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f3174xa1df5c61[1] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class Builder extends AbstractC0268g implements ClientNodeResponseOrBuilder {
        public /* synthetic */ Builder(int i) {
            this();
        }

        public Builder addAllClientNode(Iterable<? extends ClientNode> iterable) {
            copyOnWrite();
            ((ClientNodeResponse) this.instance).addAllClientNode(iterable);
            return this;
        }

        public Builder addClientNode(ClientNode clientNode) {
            copyOnWrite();
            ((ClientNodeResponse) this.instance).addClientNode(clientNode);
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

        public Builder clearClientNode() {
            copyOnWrite();
            ((ClientNodeResponse) this.instance).clearClientNode();
            return this;
        }

        public Builder clearHierarchy() {
            copyOnWrite();
            ((ClientNodeResponse) this.instance).clearHierarchy();
            return this;
        }

        @Override // com.google.protobuf.AbstractC0268g
        /* JADX INFO: renamed from: clone */
        public /* bridge */ /* synthetic */ Object mo98328clone() {
            return super.mo98326clone();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.ClientNodeResponseOrBuilder
        public ClientNode getClientNode(int i) {
            return ((ClientNodeResponse) this.instance).getClientNode(i);
        }

        @Override // com.spotify.campfire.datasource.impl.proto.ClientNodeResponseOrBuilder
        public int getClientNodeCount() {
            return ((ClientNodeResponse) this.instance).getClientNodeCount();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.ClientNodeResponseOrBuilder
        public List<ClientNode> getClientNodeList() {
            return Collections.unmodifiableList(((ClientNodeResponse) this.instance).getClientNodeList());
        }

        @Override // com.google.protobuf.AbstractC0268g, p204p.sre0
        public /* bridge */ /* synthetic */ pre0 getDefaultInstanceForType() {
            return super.getDefaultInstanceForType();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.ClientNodeResponseOrBuilder
        public Hierarchy getHierarchy() {
            return ((ClientNodeResponse) this.instance).getHierarchy();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.ClientNodeResponseOrBuilder
        public boolean hasHierarchy() {
            return ((ClientNodeResponse) this.instance).hasHierarchy();
        }

        @Override // com.google.protobuf.AbstractC0268g, p204p.AbstractC2081l8
        public /* bridge */ /* synthetic */ AbstractC2081l8 internalMergeFrom(AbstractC2118m8 abstractC2118m8) {
            return super.internalMergeFrom((AbstractC0269h) abstractC2118m8);
        }

        @Override // com.google.protobuf.AbstractC0268g, p204p.AbstractC2081l8, p204p.ore0
        public /* bridge */ /* synthetic */ AbstractC2081l8 mergeFrom(owe oweVar, aux auxVar) {
            return super.mergeFrom(oweVar, auxVar);
        }

        public Builder mergeHierarchy(Hierarchy hierarchy) {
            copyOnWrite();
            ((ClientNodeResponse) this.instance).mergeHierarchy(hierarchy);
            return this;
        }

        public Builder removeClientNode(int i) {
            copyOnWrite();
            ((ClientNodeResponse) this.instance).removeClientNode(i);
            return this;
        }

        public Builder setClientNode(int i, ClientNode clientNode) {
            copyOnWrite();
            ((ClientNodeResponse) this.instance).setClientNode(i, clientNode);
            return this;
        }

        public Builder setHierarchy(Hierarchy hierarchy) {
            copyOnWrite();
            ((ClientNodeResponse) this.instance).setHierarchy(hierarchy);
            return this;
        }

        private Builder() {
            super(ClientNodeResponse.DEFAULT_INSTANCE);
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

        public Builder addClientNode(int i, ClientNode clientNode) {
            copyOnWrite();
            ((ClientNodeResponse) this.instance).addClientNode(i, clientNode);
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

        public Builder setClientNode(int i, ClientNode.Builder builder) {
            copyOnWrite();
            ((ClientNodeResponse) this.instance).setClientNode(i, (ClientNode) builder.build());
            return this;
        }

        public Builder setHierarchy(Hierarchy.Builder builder) {
            copyOnWrite();
            ((ClientNodeResponse) this.instance).setHierarchy((Hierarchy) builder.build());
            return this;
        }

        @Override // p204p.AbstractC2081l8
        /* JADX INFO: renamed from: mergeFrom */
        public /* bridge */ /* synthetic */ ore0 mo98371mergeFrom(InputStream inputStream) {
            return super.mo98371mergeFrom(inputStream);
        }

        public Builder addClientNode(ClientNode.Builder builder) {
            copyOnWrite();
            ((ClientNodeResponse) this.instance).addClientNode((ClientNode) builder.build());
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

        public Builder addClientNode(int i, ClientNode.Builder builder) {
            copyOnWrite();
            ((ClientNodeResponse) this.instance).addClientNode(i, (ClientNode) builder.build());
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
        ClientNodeResponse clientNodeResponse = new ClientNodeResponse();
        DEFAULT_INSTANCE = clientNodeResponse;
        AbstractC0269h.registerDefaultInstance(ClientNodeResponse.class, clientNodeResponse);
    }

    private ClientNodeResponse() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllClientNode(Iterable<? extends ClientNode> iterable) {
        ensureClientNodeIsMutable();
        AbstractC2118m8.addAll(iterable, this.clientNode_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addClientNode(ClientNode clientNode) {
        clientNode.getClass();
        ensureClientNodeIsMutable();
        this.clientNode_.add(clientNode);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearClientNode() {
        this.clientNode_ = AbstractC0269h.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearHierarchy() {
        this.hierarchy_ = null;
        this.bitField0_ &= -2;
    }

    private void ensureClientNodeIsMutable() {
        ae50 ae50Var = this.clientNode_;
        if (((AbstractC1733c9) ae50Var).f35342a) {
            return;
        }
        this.clientNode_ = AbstractC0269h.mutableCopy(ae50Var);
    }

    public static ClientNodeResponse getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeHierarchy(Hierarchy hierarchy) {
        hierarchy.getClass();
        Hierarchy hierarchy2 = this.hierarchy_;
        if (hierarchy2 == null || hierarchy2 == Hierarchy.getDefaultInstance()) {
            this.hierarchy_ = hierarchy;
        } else {
            this.hierarchy_ = (Hierarchy) ((Hierarchy.Builder) Hierarchy.newBuilder(this.hierarchy_).mergeFrom((AbstractC0269h) hierarchy)).buildPartial();
        }
        this.bitField0_ |= 1;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static ClientNodeResponse parseDelimitedFrom(InputStream inputStream) {
        return (ClientNodeResponse) AbstractC0269h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ClientNodeResponse parseFrom(ByteBuffer byteBuffer) {
        return (ClientNodeResponse) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeClientNode(int i) {
        ensureClientNodeIsMutable();
        this.clientNode_.remove(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setClientNode(int i, ClientNode clientNode) {
        clientNode.getClass();
        ensureClientNodeIsMutable();
        this.clientNode_.set(i, clientNode);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHierarchy(Hierarchy hierarchy) {
        hierarchy.getClass();
        this.hierarchy_ = hierarchy;
        this.bitField0_ |= 1;
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဉ\u0000\u0002\u001b", new Object[]{"bitField0_", "hierarchy_", "clientNode_", ClientNode.class});
        }
        if (iOrdinal == 3) {
            return new ClientNodeResponse();
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
        synchronized (ClientNodeResponse.class) {
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

    @Override // com.spotify.campfire.datasource.impl.proto.ClientNodeResponseOrBuilder
    public ClientNode getClientNode(int i) {
        return (ClientNode) this.clientNode_.get(i);
    }

    @Override // com.spotify.campfire.datasource.impl.proto.ClientNodeResponseOrBuilder
    public int getClientNodeCount() {
        return this.clientNode_.size();
    }

    @Override // com.spotify.campfire.datasource.impl.proto.ClientNodeResponseOrBuilder
    public List<ClientNode> getClientNodeList() {
        return this.clientNode_;
    }

    public ClientNodeOrBuilder getClientNodeOrBuilder(int i) {
        return (ClientNodeOrBuilder) this.clientNode_.get(i);
    }

    public List<? extends ClientNodeOrBuilder> getClientNodeOrBuilderList() {
        return this.clientNode_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.sre0
    public /* bridge */ /* synthetic */ pre0 getDefaultInstanceForType() {
        return getDefaultInstanceForType();
    }

    @Override // com.spotify.campfire.datasource.impl.proto.ClientNodeResponseOrBuilder
    public Hierarchy getHierarchy() {
        Hierarchy hierarchy = this.hierarchy_;
        return hierarchy == null ? Hierarchy.getDefaultInstance() : hierarchy;
    }

    @Override // com.spotify.campfire.datasource.impl.proto.ClientNodeResponseOrBuilder
    public boolean hasHierarchy() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }

    public static Builder newBuilder(ClientNodeResponse clientNodeResponse) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(clientNodeResponse);
    }

    public static ClientNodeResponse parseDelimitedFrom(InputStream inputStream, aux auxVar) {
        return (ClientNodeResponse) AbstractC0269h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, auxVar);
    }

    public static ClientNodeResponse parseFrom(ByteBuffer byteBuffer, aux auxVar) {
        return (ClientNodeResponse) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, byteBuffer, auxVar);
    }

    public static ClientNodeResponse parseFrom(gva gvaVar) {
        return (ClientNodeResponse) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, gvaVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addClientNode(int i, ClientNode clientNode) {
        clientNode.getClass();
        ensureClientNodeIsMutable();
        this.clientNode_.add(i, clientNode);
    }

    public static ClientNodeResponse parseFrom(gva gvaVar, aux auxVar) {
        return (ClientNodeResponse) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, gvaVar, auxVar);
    }

    public static ClientNodeResponse parseFrom(byte[] bArr) {
        return (ClientNodeResponse) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ClientNodeResponse parseFrom(byte[] bArr, aux auxVar) {
        return (ClientNodeResponse) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr, auxVar);
    }

    public static ClientNodeResponse parseFrom(InputStream inputStream) {
        return (ClientNodeResponse) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ClientNodeResponse parseFrom(InputStream inputStream, aux auxVar) {
        return (ClientNodeResponse) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, inputStream, auxVar);
    }

    public static ClientNodeResponse parseFrom(owe oweVar) {
        return (ClientNodeResponse) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, oweVar);
    }

    public static ClientNodeResponse parseFrom(owe oweVar, aux auxVar) {
        return (ClientNodeResponse) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, oweVar, auxVar);
    }
}
