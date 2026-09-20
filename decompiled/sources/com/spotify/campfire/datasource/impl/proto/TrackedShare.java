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
public final class TrackedShare extends AbstractC0269h implements TrackedShareOrBuilder {
    public static final int CONTEXT_FIELD_NUMBER = 3;
    private static final TrackedShare DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER = null;
    public static final int PREVIEW_ID_FIELD_NUMBER = 2;
    public static final int SHARE_CARD_CONFIG_ID_FIELD_NUMBER = 4;
    public static final int URI_FIELD_NUMBER = 1;
    private int bitField0_;
    private TrackedShareContext context_;
    private String uri_ = "";
    private String previewId_ = "";
    private String shareCardConfigId_ = "";

    /* JADX INFO: renamed from: com.spotify.campfire.datasource.impl.proto.TrackedShare$1 */
    public static /* synthetic */ class C04591 {

        /* JADX INFO: renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f3268xa1df5c61;

        static {
            int[] iArr = new int[z110.values().length];
            f3268xa1df5c61 = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f3268xa1df5c61[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f3268xa1df5c61[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f3268xa1df5c61[5] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f3268xa1df5c61[6] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f3268xa1df5c61[0] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f3268xa1df5c61[1] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class Builder extends AbstractC0268g implements TrackedShareOrBuilder {
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

        public Builder clearContext() {
            copyOnWrite();
            ((TrackedShare) this.instance).clearContext();
            return this;
        }

        public Builder clearPreviewId() {
            copyOnWrite();
            ((TrackedShare) this.instance).clearPreviewId();
            return this;
        }

        public Builder clearShareCardConfigId() {
            copyOnWrite();
            ((TrackedShare) this.instance).clearShareCardConfigId();
            return this;
        }

        public Builder clearUri() {
            copyOnWrite();
            ((TrackedShare) this.instance).clearUri();
            return this;
        }

        @Override // com.google.protobuf.AbstractC0268g
        /* JADX INFO: renamed from: clone */
        public /* bridge */ /* synthetic */ Object mo98328clone() {
            return super.mo98326clone();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.TrackedShareOrBuilder
        public TrackedShareContext getContext() {
            return ((TrackedShare) this.instance).getContext();
        }

        @Override // com.google.protobuf.AbstractC0268g, p204p.sre0
        public /* bridge */ /* synthetic */ pre0 getDefaultInstanceForType() {
            return super.getDefaultInstanceForType();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.TrackedShareOrBuilder
        public String getPreviewId() {
            return ((TrackedShare) this.instance).getPreviewId();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.TrackedShareOrBuilder
        public gva getPreviewIdBytes() {
            return ((TrackedShare) this.instance).getPreviewIdBytes();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.TrackedShareOrBuilder
        public String getShareCardConfigId() {
            return ((TrackedShare) this.instance).getShareCardConfigId();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.TrackedShareOrBuilder
        public gva getShareCardConfigIdBytes() {
            return ((TrackedShare) this.instance).getShareCardConfigIdBytes();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.TrackedShareOrBuilder
        public String getUri() {
            return ((TrackedShare) this.instance).getUri();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.TrackedShareOrBuilder
        public gva getUriBytes() {
            return ((TrackedShare) this.instance).getUriBytes();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.TrackedShareOrBuilder
        public boolean hasContext() {
            return ((TrackedShare) this.instance).hasContext();
        }

        @Override // com.google.protobuf.AbstractC0268g, p204p.AbstractC2081l8
        public /* bridge */ /* synthetic */ AbstractC2081l8 internalMergeFrom(AbstractC2118m8 abstractC2118m8) {
            return super.internalMergeFrom((AbstractC0269h) abstractC2118m8);
        }

        public Builder mergeContext(TrackedShareContext trackedShareContext) {
            copyOnWrite();
            ((TrackedShare) this.instance).mergeContext(trackedShareContext);
            return this;
        }

        @Override // com.google.protobuf.AbstractC0268g, p204p.AbstractC2081l8, p204p.ore0
        public /* bridge */ /* synthetic */ AbstractC2081l8 mergeFrom(owe oweVar, aux auxVar) {
            return super.mergeFrom(oweVar, auxVar);
        }

        public Builder setContext(TrackedShareContext trackedShareContext) {
            copyOnWrite();
            ((TrackedShare) this.instance).setContext(trackedShareContext);
            return this;
        }

        public Builder setPreviewId(String str) {
            copyOnWrite();
            ((TrackedShare) this.instance).setPreviewId(str);
            return this;
        }

        public Builder setPreviewIdBytes(gva gvaVar) {
            copyOnWrite();
            ((TrackedShare) this.instance).setPreviewIdBytes(gvaVar);
            return this;
        }

        public Builder setShareCardConfigId(String str) {
            copyOnWrite();
            ((TrackedShare) this.instance).setShareCardConfigId(str);
            return this;
        }

        public Builder setShareCardConfigIdBytes(gva gvaVar) {
            copyOnWrite();
            ((TrackedShare) this.instance).setShareCardConfigIdBytes(gvaVar);
            return this;
        }

        public Builder setUri(String str) {
            copyOnWrite();
            ((TrackedShare) this.instance).setUri(str);
            return this;
        }

        public Builder setUriBytes(gva gvaVar) {
            copyOnWrite();
            ((TrackedShare) this.instance).setUriBytes(gvaVar);
            return this;
        }

        private Builder() {
            super(TrackedShare.DEFAULT_INSTANCE);
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

        public Builder setContext(TrackedShareContext.Builder builder) {
            copyOnWrite();
            ((TrackedShare) this.instance).setContext((TrackedShareContext) builder.build());
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
        TrackedShare trackedShare = new TrackedShare();
        DEFAULT_INSTANCE = trackedShare;
        AbstractC0269h.registerDefaultInstance(TrackedShare.class, trackedShare);
    }

    private TrackedShare() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearContext() {
        this.context_ = null;
        this.bitField0_ &= -2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPreviewId() {
        this.previewId_ = getDefaultInstance().getPreviewId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearShareCardConfigId() {
        this.shareCardConfigId_ = getDefaultInstance().getShareCardConfigId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUri() {
        this.uri_ = getDefaultInstance().getUri();
    }

    public static TrackedShare getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeContext(TrackedShareContext trackedShareContext) {
        trackedShareContext.getClass();
        TrackedShareContext trackedShareContext2 = this.context_;
        if (trackedShareContext2 == null || trackedShareContext2 == TrackedShareContext.getDefaultInstance()) {
            this.context_ = trackedShareContext;
        } else {
            this.context_ = (TrackedShareContext) ((TrackedShareContext.Builder) TrackedShareContext.newBuilder(this.context_).mergeFrom((AbstractC0269h) trackedShareContext)).buildPartial();
        }
        this.bitField0_ |= 1;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static TrackedShare parseDelimitedFrom(InputStream inputStream) {
        return (TrackedShare) AbstractC0269h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static TrackedShare parseFrom(ByteBuffer byteBuffer) {
        return (TrackedShare) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setContext(TrackedShareContext trackedShareContext) {
        trackedShareContext.getClass();
        this.context_ = trackedShareContext;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPreviewId(String str) {
        str.getClass();
        this.previewId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPreviewIdBytes(gva gvaVar) {
        AbstractC2118m8.checkByteStringIsUtf8(gvaVar);
        this.previewId_ = gvaVar.m45892u();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setShareCardConfigId(String str) {
        str.getClass();
        this.shareCardConfigId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setShareCardConfigIdBytes(gva gvaVar) {
        AbstractC2118m8.checkByteStringIsUtf8(gvaVar);
        this.shareCardConfigId_ = gvaVar.m45892u();
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003ဉ\u0000\u0004Ȉ", new Object[]{"bitField0_", "uri_", "previewId_", "context_", "shareCardConfigId_"});
        }
        if (iOrdinal == 3) {
            return new TrackedShare();
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
        synchronized (TrackedShare.class) {
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

    @Override // com.spotify.campfire.datasource.impl.proto.TrackedShareOrBuilder
    public TrackedShareContext getContext() {
        TrackedShareContext trackedShareContext = this.context_;
        return trackedShareContext == null ? TrackedShareContext.getDefaultInstance() : trackedShareContext;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.sre0
    public /* bridge */ /* synthetic */ pre0 getDefaultInstanceForType() {
        return getDefaultInstanceForType();
    }

    @Override // com.spotify.campfire.datasource.impl.proto.TrackedShareOrBuilder
    public String getPreviewId() {
        return this.previewId_;
    }

    @Override // com.spotify.campfire.datasource.impl.proto.TrackedShareOrBuilder
    public gva getPreviewIdBytes() {
        return gva.m45888f(this.previewId_);
    }

    @Override // com.spotify.campfire.datasource.impl.proto.TrackedShareOrBuilder
    public String getShareCardConfigId() {
        return this.shareCardConfigId_;
    }

    @Override // com.spotify.campfire.datasource.impl.proto.TrackedShareOrBuilder
    public gva getShareCardConfigIdBytes() {
        return gva.m45888f(this.shareCardConfigId_);
    }

    @Override // com.spotify.campfire.datasource.impl.proto.TrackedShareOrBuilder
    public String getUri() {
        return this.uri_;
    }

    @Override // com.spotify.campfire.datasource.impl.proto.TrackedShareOrBuilder
    public gva getUriBytes() {
        return gva.m45888f(this.uri_);
    }

    @Override // com.spotify.campfire.datasource.impl.proto.TrackedShareOrBuilder
    public boolean hasContext() {
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

    public static Builder newBuilder(TrackedShare trackedShare) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(trackedShare);
    }

    public static TrackedShare parseDelimitedFrom(InputStream inputStream, aux auxVar) {
        return (TrackedShare) AbstractC0269h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, auxVar);
    }

    public static TrackedShare parseFrom(ByteBuffer byteBuffer, aux auxVar) {
        return (TrackedShare) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, byteBuffer, auxVar);
    }

    public static TrackedShare parseFrom(gva gvaVar) {
        return (TrackedShare) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, gvaVar);
    }

    public static TrackedShare parseFrom(gva gvaVar, aux auxVar) {
        return (TrackedShare) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, gvaVar, auxVar);
    }

    public static TrackedShare parseFrom(byte[] bArr) {
        return (TrackedShare) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static TrackedShare parseFrom(byte[] bArr, aux auxVar) {
        return (TrackedShare) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr, auxVar);
    }

    public static TrackedShare parseFrom(InputStream inputStream) {
        return (TrackedShare) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static TrackedShare parseFrom(InputStream inputStream, aux auxVar) {
        return (TrackedShare) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, inputStream, auxVar);
    }

    public static TrackedShare parseFrom(owe oweVar) {
        return (TrackedShare) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, oweVar);
    }

    public static TrackedShare parseFrom(owe oweVar, aux auxVar) {
        return (TrackedShare) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, oweVar, auxVar);
    }
}
