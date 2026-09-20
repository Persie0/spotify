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

/* JADX INFO: loaded from: classes5.dex */
public final class NodeIdentifier extends AbstractC0269h implements NodeIdentifierOrBuilder {
    private static final NodeIdentifier DEFAULT_INSTANCE;
    public static final int NODE_CLASS_FIELD_NUMBER = 2;
    public static final int NODE_PATH_ID_FIELD_NUMBER = 1;
    private static volatile r2n0 PARSER = null;
    public static final int URI_FIELD_NUMBER = 3;
    private int bitField0_;
    private NodeClass nodeClass_;
    private String nodePathId_ = "";
    private String uri_ = "";

    /* JADX INFO: renamed from: com.spotify.campfire.datasource.impl.proto.NodeIdentifier$1 */
    public static /* synthetic */ class C04161 {

        /* JADX INFO: renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f3232xa1df5c61;

        static {
            int[] iArr = new int[z110.values().length];
            f3232xa1df5c61 = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f3232xa1df5c61[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f3232xa1df5c61[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f3232xa1df5c61[5] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f3232xa1df5c61[6] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f3232xa1df5c61[0] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f3232xa1df5c61[1] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class Builder extends AbstractC0268g implements NodeIdentifierOrBuilder {
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

        public Builder clearNodeClass() {
            copyOnWrite();
            ((NodeIdentifier) this.instance).clearNodeClass();
            return this;
        }

        public Builder clearNodePathId() {
            copyOnWrite();
            ((NodeIdentifier) this.instance).clearNodePathId();
            return this;
        }

        public Builder clearUri() {
            copyOnWrite();
            ((NodeIdentifier) this.instance).clearUri();
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

        @Override // com.spotify.campfire.datasource.impl.proto.NodeIdentifierOrBuilder
        public NodeClass getNodeClass() {
            return ((NodeIdentifier) this.instance).getNodeClass();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.NodeIdentifierOrBuilder
        public String getNodePathId() {
            return ((NodeIdentifier) this.instance).getNodePathId();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.NodeIdentifierOrBuilder
        public gva getNodePathIdBytes() {
            return ((NodeIdentifier) this.instance).getNodePathIdBytes();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.NodeIdentifierOrBuilder
        public String getUri() {
            return ((NodeIdentifier) this.instance).getUri();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.NodeIdentifierOrBuilder
        public gva getUriBytes() {
            return ((NodeIdentifier) this.instance).getUriBytes();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.NodeIdentifierOrBuilder
        public boolean hasNodeClass() {
            return ((NodeIdentifier) this.instance).hasNodeClass();
        }

        @Override // com.google.protobuf.AbstractC0268g, p204p.AbstractC2081l8
        public /* bridge */ /* synthetic */ AbstractC2081l8 internalMergeFrom(AbstractC2118m8 abstractC2118m8) {
            return super.internalMergeFrom((AbstractC0269h) abstractC2118m8);
        }

        @Override // com.google.protobuf.AbstractC0268g, p204p.AbstractC2081l8, p204p.ore0
        public /* bridge */ /* synthetic */ AbstractC2081l8 mergeFrom(owe oweVar, aux auxVar) {
            return super.mergeFrom(oweVar, auxVar);
        }

        public Builder mergeNodeClass(NodeClass nodeClass) {
            copyOnWrite();
            ((NodeIdentifier) this.instance).mergeNodeClass(nodeClass);
            return this;
        }

        public Builder setNodeClass(NodeClass nodeClass) {
            copyOnWrite();
            ((NodeIdentifier) this.instance).setNodeClass(nodeClass);
            return this;
        }

        public Builder setNodePathId(String str) {
            copyOnWrite();
            ((NodeIdentifier) this.instance).setNodePathId(str);
            return this;
        }

        public Builder setNodePathIdBytes(gva gvaVar) {
            copyOnWrite();
            ((NodeIdentifier) this.instance).setNodePathIdBytes(gvaVar);
            return this;
        }

        public Builder setUri(String str) {
            copyOnWrite();
            ((NodeIdentifier) this.instance).setUri(str);
            return this;
        }

        public Builder setUriBytes(gva gvaVar) {
            copyOnWrite();
            ((NodeIdentifier) this.instance).setUriBytes(gvaVar);
            return this;
        }

        private Builder() {
            super(NodeIdentifier.DEFAULT_INSTANCE);
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

        public Builder setNodeClass(NodeClass.Builder builder) {
            copyOnWrite();
            ((NodeIdentifier) this.instance).setNodeClass((NodeClass) builder.build());
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
        NodeIdentifier nodeIdentifier = new NodeIdentifier();
        DEFAULT_INSTANCE = nodeIdentifier;
        AbstractC0269h.registerDefaultInstance(NodeIdentifier.class, nodeIdentifier);
    }

    private NodeIdentifier() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearNodeClass() {
        this.nodeClass_ = null;
        this.bitField0_ &= -2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearNodePathId() {
        this.nodePathId_ = getDefaultInstance().getNodePathId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUri() {
        this.uri_ = getDefaultInstance().getUri();
    }

    public static NodeIdentifier getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeNodeClass(NodeClass nodeClass) {
        nodeClass.getClass();
        NodeClass nodeClass2 = this.nodeClass_;
        if (nodeClass2 == null || nodeClass2 == NodeClass.getDefaultInstance()) {
            this.nodeClass_ = nodeClass;
        } else {
            this.nodeClass_ = (NodeClass) ((NodeClass.Builder) NodeClass.newBuilder(this.nodeClass_).mergeFrom((AbstractC0269h) nodeClass)).buildPartial();
        }
        this.bitField0_ |= 1;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static NodeIdentifier parseDelimitedFrom(InputStream inputStream) {
        return (NodeIdentifier) AbstractC0269h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static NodeIdentifier parseFrom(ByteBuffer byteBuffer) {
        return (NodeIdentifier) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNodeClass(NodeClass nodeClass) {
        nodeClass.getClass();
        this.nodeClass_ = nodeClass;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNodePathId(String str) {
        str.getClass();
        this.nodePathId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNodePathIdBytes(gva gvaVar) {
        AbstractC2118m8.checkByteStringIsUtf8(gvaVar);
        this.nodePathId_ = gvaVar.m45892u();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUri(String str) {
        str.getClass();
        this.uri_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUriBytes(gva gvaVar) {
        AbstractC2118m8.checkByteStringIsUtf8(gvaVar);
        this.uri_ = gvaVar.m45892u();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002ဉ\u0000\u0003Ȉ", new Object[]{"bitField0_", "nodePathId_", "nodeClass_", "uri_"});
        }
        if (iOrdinal == 3) {
            return new NodeIdentifier();
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
        synchronized (NodeIdentifier.class) {
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

    @Override // com.spotify.campfire.datasource.impl.proto.NodeIdentifierOrBuilder
    public NodeClass getNodeClass() {
        NodeClass nodeClass = this.nodeClass_;
        return nodeClass == null ? NodeClass.getDefaultInstance() : nodeClass;
    }

    @Override // com.spotify.campfire.datasource.impl.proto.NodeIdentifierOrBuilder
    public String getNodePathId() {
        return this.nodePathId_;
    }

    @Override // com.spotify.campfire.datasource.impl.proto.NodeIdentifierOrBuilder
    public gva getNodePathIdBytes() {
        return gva.m45888f(this.nodePathId_);
    }

    @Override // com.spotify.campfire.datasource.impl.proto.NodeIdentifierOrBuilder
    public String getUri() {
        return this.uri_;
    }

    @Override // com.spotify.campfire.datasource.impl.proto.NodeIdentifierOrBuilder
    public gva getUriBytes() {
        return gva.m45888f(this.uri_);
    }

    @Override // com.spotify.campfire.datasource.impl.proto.NodeIdentifierOrBuilder
    public boolean hasNodeClass() {
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

    public static Builder newBuilder(NodeIdentifier nodeIdentifier) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(nodeIdentifier);
    }

    public static NodeIdentifier parseDelimitedFrom(InputStream inputStream, aux auxVar) {
        return (NodeIdentifier) AbstractC0269h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, auxVar);
    }

    public static NodeIdentifier parseFrom(ByteBuffer byteBuffer, aux auxVar) {
        return (NodeIdentifier) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, byteBuffer, auxVar);
    }

    public static NodeIdentifier parseFrom(gva gvaVar) {
        return (NodeIdentifier) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, gvaVar);
    }

    public static NodeIdentifier parseFrom(gva gvaVar, aux auxVar) {
        return (NodeIdentifier) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, gvaVar, auxVar);
    }

    public static NodeIdentifier parseFrom(byte[] bArr) {
        return (NodeIdentifier) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static NodeIdentifier parseFrom(byte[] bArr, aux auxVar) {
        return (NodeIdentifier) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr, auxVar);
    }

    public static NodeIdentifier parseFrom(InputStream inputStream) {
        return (NodeIdentifier) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static NodeIdentifier parseFrom(InputStream inputStream, aux auxVar) {
        return (NodeIdentifier) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, inputStream, auxVar);
    }

    public static NodeIdentifier parseFrom(owe oweVar) {
        return (NodeIdentifier) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, oweVar);
    }

    public static NodeIdentifier parseFrom(owe oweVar, aux auxVar) {
        return (NodeIdentifier) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, oweVar, auxVar);
    }
}
