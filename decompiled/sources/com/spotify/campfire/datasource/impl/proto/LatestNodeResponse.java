package com.spotify.campfire.datasource.impl.proto;

import com.google.protobuf.AbstractC0268g;
import com.google.protobuf.AbstractC0269h;
import java.io.InputStream;
import java.nio.ByteBuffer;
import p204p.AbstractC2081l8;
import p204p.AbstractC2118m8;
import p204p.aux;
import p204p.gva;
import p204p.ore0;
import p204p.owe;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.z110;

/* JADX INFO: loaded from: classes.dex */
public final class LatestNodeResponse extends AbstractC0269h implements LatestNodeResponseOrBuilder {
    public static final int CLIENT_NODE_FIELD_NUMBER = 2;
    private static final LatestNodeResponse DEFAULT_INSTANCE;
    public static final int HIERARCHY_FIELD_NUMBER = 1;
    private static volatile r2n0 PARSER;
    private int bitField0_;
    private ClientNode clientNode_;
    private Hierarchy hierarchy_;

    /* JADX INFO: renamed from: com.spotify.campfire.datasource.impl.proto.LatestNodeResponse$1 */
    /* JADX INFO: loaded from: classes5.dex */
    public static /* synthetic */ class C04021 {

        /* JADX INFO: renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f3219xa1df5c61;

        static {
            int[] iArr = new int[z110.values().length];
            f3219xa1df5c61 = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f3219xa1df5c61[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f3219xa1df5c61[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f3219xa1df5c61[5] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f3219xa1df5c61[6] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f3219xa1df5c61[0] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f3219xa1df5c61[1] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* JADX INFO: loaded from: classes5.dex */
    public static final class Builder extends AbstractC0268g implements LatestNodeResponseOrBuilder {
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

        public Builder clearClientNode() {
            copyOnWrite();
            ((LatestNodeResponse) this.instance).clearClientNode();
            return this;
        }

        public Builder clearHierarchy() {
            copyOnWrite();
            ((LatestNodeResponse) this.instance).clearHierarchy();
            return this;
        }

        @Override // com.google.protobuf.AbstractC0268g
        /* JADX INFO: renamed from: clone */
        public /* bridge */ /* synthetic */ Object mo98327clone() {
            return super.mo98326clone();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.LatestNodeResponseOrBuilder
        public ClientNode getClientNode() {
            return ((LatestNodeResponse) this.instance).getClientNode();
        }

        @Override // com.google.protobuf.AbstractC0268g, p204p.sre0
        public /* bridge */ /* synthetic */ pre0 getDefaultInstanceForType() {
            return super.getDefaultInstanceForType();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.LatestNodeResponseOrBuilder
        public Hierarchy getHierarchy() {
            return ((LatestNodeResponse) this.instance).getHierarchy();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.LatestNodeResponseOrBuilder
        public boolean hasClientNode() {
            return ((LatestNodeResponse) this.instance).hasClientNode();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.LatestNodeResponseOrBuilder
        public boolean hasHierarchy() {
            return ((LatestNodeResponse) this.instance).hasHierarchy();
        }

        @Override // com.google.protobuf.AbstractC0268g, p204p.AbstractC2081l8
        public /* bridge */ /* synthetic */ AbstractC2081l8 internalMergeFrom(AbstractC2118m8 abstractC2118m8) {
            return super.internalMergeFrom((AbstractC0269h) abstractC2118m8);
        }

        public Builder mergeClientNode(ClientNode clientNode) {
            copyOnWrite();
            ((LatestNodeResponse) this.instance).mergeClientNode(clientNode);
            return this;
        }

        @Override // com.google.protobuf.AbstractC0268g, p204p.AbstractC2081l8, p204p.ore0
        public /* bridge */ /* synthetic */ AbstractC2081l8 mergeFrom(owe oweVar, aux auxVar) {
            return super.mergeFrom(oweVar, auxVar);
        }

        public Builder mergeHierarchy(Hierarchy hierarchy) {
            copyOnWrite();
            ((LatestNodeResponse) this.instance).mergeHierarchy(hierarchy);
            return this;
        }

        public Builder setClientNode(ClientNode clientNode) {
            copyOnWrite();
            ((LatestNodeResponse) this.instance).setClientNode(clientNode);
            return this;
        }

        public Builder setHierarchy(Hierarchy hierarchy) {
            copyOnWrite();
            ((LatestNodeResponse) this.instance).setHierarchy(hierarchy);
            return this;
        }

        private Builder() {
            super(LatestNodeResponse.DEFAULT_INSTANCE);
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

        public Builder setClientNode(ClientNode.Builder builder) {
            copyOnWrite();
            ((LatestNodeResponse) this.instance).setClientNode((ClientNode) builder.build());
            return this;
        }

        public Builder setHierarchy(Hierarchy.Builder builder) {
            copyOnWrite();
            ((LatestNodeResponse) this.instance).setHierarchy((Hierarchy) builder.build());
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

    static {
        LatestNodeResponse latestNodeResponse = new LatestNodeResponse();
        DEFAULT_INSTANCE = latestNodeResponse;
        AbstractC0269h.registerDefaultInstance(LatestNodeResponse.class, latestNodeResponse);
    }

    private LatestNodeResponse() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearClientNode() {
        this.clientNode_ = null;
        this.bitField0_ &= -3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearHierarchy() {
        this.hierarchy_ = null;
        this.bitField0_ &= -2;
    }

    public static LatestNodeResponse getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeClientNode(ClientNode clientNode) {
        clientNode.getClass();
        ClientNode clientNode2 = this.clientNode_;
        if (clientNode2 == null || clientNode2 == ClientNode.getDefaultInstance()) {
            this.clientNode_ = clientNode;
        } else {
            this.clientNode_ = (ClientNode) ((ClientNode.Builder) ClientNode.newBuilder(this.clientNode_).mergeFrom((AbstractC0269h) clientNode)).buildPartial();
        }
        this.bitField0_ |= 2;
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

    public static LatestNodeResponse parseDelimitedFrom(InputStream inputStream) {
        return (LatestNodeResponse) AbstractC0269h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LatestNodeResponse parseFrom(ByteBuffer byteBuffer) {
        return (LatestNodeResponse) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setClientNode(ClientNode clientNode) {
        clientNode.getClass();
        this.clientNode_ = clientNode;
        this.bitField0_ |= 2;
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"bitField0_", "hierarchy_", "clientNode_"});
        }
        if (iOrdinal == 3) {
            return new LatestNodeResponse();
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
        synchronized (LatestNodeResponse.class) {
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

    @Override // com.spotify.campfire.datasource.impl.proto.LatestNodeResponseOrBuilder
    public ClientNode getClientNode() {
        ClientNode clientNode = this.clientNode_;
        return clientNode == null ? ClientNode.getDefaultInstance() : clientNode;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.sre0
    public /* bridge */ /* synthetic */ pre0 getDefaultInstanceForType() {
        return getDefaultInstanceForType();
    }

    @Override // com.spotify.campfire.datasource.impl.proto.LatestNodeResponseOrBuilder
    public Hierarchy getHierarchy() {
        Hierarchy hierarchy = this.hierarchy_;
        return hierarchy == null ? Hierarchy.getDefaultInstance() : hierarchy;
    }

    @Override // com.spotify.campfire.datasource.impl.proto.LatestNodeResponseOrBuilder
    public boolean hasClientNode() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override // com.spotify.campfire.datasource.impl.proto.LatestNodeResponseOrBuilder
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

    public static Builder newBuilder(LatestNodeResponse latestNodeResponse) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(latestNodeResponse);
    }

    public static LatestNodeResponse parseDelimitedFrom(InputStream inputStream, aux auxVar) {
        return (LatestNodeResponse) AbstractC0269h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, auxVar);
    }

    public static LatestNodeResponse parseFrom(ByteBuffer byteBuffer, aux auxVar) {
        return (LatestNodeResponse) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, byteBuffer, auxVar);
    }

    public static LatestNodeResponse parseFrom(gva gvaVar) {
        return (LatestNodeResponse) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, gvaVar);
    }

    public static LatestNodeResponse parseFrom(gva gvaVar, aux auxVar) {
        return (LatestNodeResponse) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, gvaVar, auxVar);
    }

    public static LatestNodeResponse parseFrom(byte[] bArr) {
        return (LatestNodeResponse) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static LatestNodeResponse parseFrom(byte[] bArr, aux auxVar) {
        return (LatestNodeResponse) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr, auxVar);
    }

    public static LatestNodeResponse parseFrom(InputStream inputStream) {
        return (LatestNodeResponse) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LatestNodeResponse parseFrom(InputStream inputStream, aux auxVar) {
        return (LatestNodeResponse) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, inputStream, auxVar);
    }

    public static LatestNodeResponse parseFrom(owe oweVar) {
        return (LatestNodeResponse) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, oweVar);
    }

    public static LatestNodeResponse parseFrom(owe oweVar, aux auxVar) {
        return (LatestNodeResponse) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, oweVar, auxVar);
    }
}
