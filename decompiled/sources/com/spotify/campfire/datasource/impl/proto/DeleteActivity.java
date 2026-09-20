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
public final class DeleteActivity extends AbstractC0269h implements DeleteActivityOrBuilder {
    private static final DeleteActivity DEFAULT_INSTANCE;
    public static final int NODE_PATH_ID_FIELD_NUMBER = 1;
    private static volatile r2n0 PARSER = null;
    public static final int REQUEST_FIELD_NUMBER = 2;
    private int bitField0_;
    private String nodePathId_ = "";
    private ActivityRequest request_;

    /* JADX INFO: renamed from: com.spotify.campfire.datasource.impl.proto.DeleteActivity$1 */
    public static /* synthetic */ class C03571 {

        /* JADX INFO: renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f3184xa1df5c61;

        static {
            int[] iArr = new int[z110.values().length];
            f3184xa1df5c61 = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f3184xa1df5c61[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f3184xa1df5c61[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f3184xa1df5c61[5] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f3184xa1df5c61[6] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f3184xa1df5c61[0] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f3184xa1df5c61[1] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class Builder extends AbstractC0268g implements DeleteActivityOrBuilder {
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

        public Builder clearNodePathId() {
            copyOnWrite();
            ((DeleteActivity) this.instance).clearNodePathId();
            return this;
        }

        public Builder clearRequest() {
            copyOnWrite();
            ((DeleteActivity) this.instance).clearRequest();
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

        @Override // com.spotify.campfire.datasource.impl.proto.DeleteActivityOrBuilder
        public String getNodePathId() {
            return ((DeleteActivity) this.instance).getNodePathId();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.DeleteActivityOrBuilder
        public gva getNodePathIdBytes() {
            return ((DeleteActivity) this.instance).getNodePathIdBytes();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.DeleteActivityOrBuilder
        public ActivityRequest getRequest() {
            return ((DeleteActivity) this.instance).getRequest();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.DeleteActivityOrBuilder
        public boolean hasRequest() {
            return ((DeleteActivity) this.instance).hasRequest();
        }

        @Override // com.google.protobuf.AbstractC0268g, p204p.AbstractC2081l8
        public /* bridge */ /* synthetic */ AbstractC2081l8 internalMergeFrom(AbstractC2118m8 abstractC2118m8) {
            return super.internalMergeFrom((AbstractC0269h) abstractC2118m8);
        }

        @Override // com.google.protobuf.AbstractC0268g, p204p.AbstractC2081l8, p204p.ore0
        public /* bridge */ /* synthetic */ AbstractC2081l8 mergeFrom(owe oweVar, aux auxVar) {
            return super.mergeFrom(oweVar, auxVar);
        }

        public Builder mergeRequest(ActivityRequest activityRequest) {
            copyOnWrite();
            ((DeleteActivity) this.instance).mergeRequest(activityRequest);
            return this;
        }

        public Builder setNodePathId(String str) {
            copyOnWrite();
            ((DeleteActivity) this.instance).setNodePathId(str);
            return this;
        }

        public Builder setNodePathIdBytes(gva gvaVar) {
            copyOnWrite();
            ((DeleteActivity) this.instance).setNodePathIdBytes(gvaVar);
            return this;
        }

        public Builder setRequest(ActivityRequest activityRequest) {
            copyOnWrite();
            ((DeleteActivity) this.instance).setRequest(activityRequest);
            return this;
        }

        private Builder() {
            super(DeleteActivity.DEFAULT_INSTANCE);
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

        public Builder setRequest(ActivityRequest.Builder builder) {
            copyOnWrite();
            ((DeleteActivity) this.instance).setRequest((ActivityRequest) builder.build());
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
        DeleteActivity deleteActivity = new DeleteActivity();
        DEFAULT_INSTANCE = deleteActivity;
        AbstractC0269h.registerDefaultInstance(DeleteActivity.class, deleteActivity);
    }

    private DeleteActivity() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearNodePathId() {
        this.nodePathId_ = getDefaultInstance().getNodePathId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRequest() {
        this.request_ = null;
        this.bitField0_ &= -2;
    }

    public static DeleteActivity getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeRequest(ActivityRequest activityRequest) {
        activityRequest.getClass();
        ActivityRequest activityRequest2 = this.request_;
        if (activityRequest2 == null || activityRequest2 == ActivityRequest.getDefaultInstance()) {
            this.request_ = activityRequest;
        } else {
            this.request_ = (ActivityRequest) ((ActivityRequest.Builder) ActivityRequest.newBuilder(this.request_).mergeFrom((AbstractC0269h) activityRequest)).buildPartial();
        }
        this.bitField0_ |= 1;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static DeleteActivity parseDelimitedFrom(InputStream inputStream) {
        return (DeleteActivity) AbstractC0269h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static DeleteActivity parseFrom(ByteBuffer byteBuffer) {
        return (DeleteActivity) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
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
    public void setRequest(ActivityRequest activityRequest) {
        activityRequest.getClass();
        this.request_ = activityRequest;
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002ဉ\u0000", new Object[]{"bitField0_", "nodePathId_", "request_"});
        }
        if (iOrdinal == 3) {
            return new DeleteActivity();
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
        synchronized (DeleteActivity.class) {
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

    @Override // com.spotify.campfire.datasource.impl.proto.DeleteActivityOrBuilder
    public String getNodePathId() {
        return this.nodePathId_;
    }

    @Override // com.spotify.campfire.datasource.impl.proto.DeleteActivityOrBuilder
    public gva getNodePathIdBytes() {
        return gva.m45888f(this.nodePathId_);
    }

    @Override // com.spotify.campfire.datasource.impl.proto.DeleteActivityOrBuilder
    public ActivityRequest getRequest() {
        ActivityRequest activityRequest = this.request_;
        return activityRequest == null ? ActivityRequest.getDefaultInstance() : activityRequest;
    }

    @Override // com.spotify.campfire.datasource.impl.proto.DeleteActivityOrBuilder
    public boolean hasRequest() {
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

    public static Builder newBuilder(DeleteActivity deleteActivity) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(deleteActivity);
    }

    public static DeleteActivity parseDelimitedFrom(InputStream inputStream, aux auxVar) {
        return (DeleteActivity) AbstractC0269h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, auxVar);
    }

    public static DeleteActivity parseFrom(ByteBuffer byteBuffer, aux auxVar) {
        return (DeleteActivity) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, byteBuffer, auxVar);
    }

    public static DeleteActivity parseFrom(gva gvaVar) {
        return (DeleteActivity) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, gvaVar);
    }

    public static DeleteActivity parseFrom(gva gvaVar, aux auxVar) {
        return (DeleteActivity) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, gvaVar, auxVar);
    }

    public static DeleteActivity parseFrom(byte[] bArr) {
        return (DeleteActivity) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static DeleteActivity parseFrom(byte[] bArr, aux auxVar) {
        return (DeleteActivity) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr, auxVar);
    }

    public static DeleteActivity parseFrom(InputStream inputStream) {
        return (DeleteActivity) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static DeleteActivity parseFrom(InputStream inputStream, aux auxVar) {
        return (DeleteActivity) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, inputStream, auxVar);
    }

    public static DeleteActivity parseFrom(owe oweVar) {
        return (DeleteActivity) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, oweVar);
    }

    public static DeleteActivity parseFrom(owe oweVar, aux auxVar) {
        return (DeleteActivity) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, oweVar, auxVar);
    }
}
