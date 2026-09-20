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
public final class AddNodeActivity extends AbstractC0269h implements AddNodeActivityOrBuilder {
    private static final AddNodeActivity DEFAULT_INSTANCE;
    public static final int NODE_PATH_ID_FIELD_NUMBER = 1;
    private static volatile r2n0 PARSER = null;
    public static final int REQUEST_FIELD_NUMBER = 2;
    private int bitField0_;
    private ae50 nodePathId_ = AbstractC0269h.emptyProtobufList();
    private ActivityRequest request_;

    /* JADX INFO: renamed from: com.spotify.campfire.datasource.impl.proto.AddNodeActivity$1 */
    public static /* synthetic */ class C03321 {

        /* JADX INFO: renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f3160xa1df5c61;

        static {
            int[] iArr = new int[z110.values().length];
            f3160xa1df5c61 = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f3160xa1df5c61[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f3160xa1df5c61[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f3160xa1df5c61[5] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f3160xa1df5c61[6] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f3160xa1df5c61[0] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f3160xa1df5c61[1] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class Builder extends AbstractC0268g implements AddNodeActivityOrBuilder {
        public /* synthetic */ Builder(int i) {
            this();
        }

        public Builder addAllNodePathId(Iterable<String> iterable) {
            copyOnWrite();
            ((AddNodeActivity) this.instance).addAllNodePathId(iterable);
            return this;
        }

        public Builder addNodePathId(String str) {
            copyOnWrite();
            ((AddNodeActivity) this.instance).addNodePathId(str);
            return this;
        }

        public Builder addNodePathIdBytes(gva gvaVar) {
            copyOnWrite();
            ((AddNodeActivity) this.instance).addNodePathIdBytes(gvaVar);
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

        public Builder clearNodePathId() {
            copyOnWrite();
            ((AddNodeActivity) this.instance).clearNodePathId();
            return this;
        }

        public Builder clearRequest() {
            copyOnWrite();
            ((AddNodeActivity) this.instance).clearRequest();
            return this;
        }

        @Override // com.google.protobuf.AbstractC0268g
        /* JADX INFO: renamed from: clone */
        public /* bridge */ /* synthetic */ Object mo98327clone() {
            return super.mo98326clone();
        }

        @Override // com.google.protobuf.AbstractC0268g, p204p.sre0
        public /* bridge */ /* synthetic */ pre0 getDefaultInstanceForType() {
            return super.getDefaultInstanceForType();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.AddNodeActivityOrBuilder
        public String getNodePathId(int i) {
            return ((AddNodeActivity) this.instance).getNodePathId(i);
        }

        @Override // com.spotify.campfire.datasource.impl.proto.AddNodeActivityOrBuilder
        public gva getNodePathIdBytes(int i) {
            return ((AddNodeActivity) this.instance).getNodePathIdBytes(i);
        }

        @Override // com.spotify.campfire.datasource.impl.proto.AddNodeActivityOrBuilder
        public int getNodePathIdCount() {
            return ((AddNodeActivity) this.instance).getNodePathIdCount();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.AddNodeActivityOrBuilder
        public List<String> getNodePathIdList() {
            return Collections.unmodifiableList(((AddNodeActivity) this.instance).getNodePathIdList());
        }

        @Override // com.spotify.campfire.datasource.impl.proto.AddNodeActivityOrBuilder
        public ActivityRequest getRequest() {
            return ((AddNodeActivity) this.instance).getRequest();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.AddNodeActivityOrBuilder
        public boolean hasRequest() {
            return ((AddNodeActivity) this.instance).hasRequest();
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
            ((AddNodeActivity) this.instance).mergeRequest(activityRequest);
            return this;
        }

        public Builder setNodePathId(int i, String str) {
            copyOnWrite();
            ((AddNodeActivity) this.instance).setNodePathId(i, str);
            return this;
        }

        public Builder setRequest(ActivityRequest activityRequest) {
            copyOnWrite();
            ((AddNodeActivity) this.instance).setRequest(activityRequest);
            return this;
        }

        private Builder() {
            super(AddNodeActivity.DEFAULT_INSTANCE);
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

        public Builder setRequest(ActivityRequest.Builder builder) {
            copyOnWrite();
            ((AddNodeActivity) this.instance).setRequest((ActivityRequest) builder.build());
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
        AddNodeActivity addNodeActivity = new AddNodeActivity();
        DEFAULT_INSTANCE = addNodeActivity;
        AbstractC0269h.registerDefaultInstance(AddNodeActivity.class, addNodeActivity);
    }

    private AddNodeActivity() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllNodePathId(Iterable<String> iterable) {
        ensureNodePathIdIsMutable();
        AbstractC2118m8.addAll(iterable, this.nodePathId_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addNodePathId(String str) {
        str.getClass();
        ensureNodePathIdIsMutable();
        this.nodePathId_.add(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addNodePathIdBytes(gva gvaVar) {
        AbstractC2118m8.checkByteStringIsUtf8(gvaVar);
        ensureNodePathIdIsMutable();
        this.nodePathId_.add(gvaVar.m45892u());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearNodePathId() {
        this.nodePathId_ = AbstractC0269h.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRequest() {
        this.request_ = null;
        this.bitField0_ &= -2;
    }

    private void ensureNodePathIdIsMutable() {
        ae50 ae50Var = this.nodePathId_;
        if (((AbstractC1733c9) ae50Var).f35342a) {
            return;
        }
        this.nodePathId_ = AbstractC0269h.mutableCopy(ae50Var);
    }

    public static AddNodeActivity getDefaultInstance() {
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

    public static AddNodeActivity parseDelimitedFrom(InputStream inputStream) {
        return (AddNodeActivity) AbstractC0269h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static AddNodeActivity parseFrom(ByteBuffer byteBuffer) {
        return (AddNodeActivity) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNodePathId(int i, String str) {
        str.getClass();
        ensureNodePathIdIsMutable();
        this.nodePathId_.set(i, str);
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001Ț\u0002ဉ\u0000", new Object[]{"bitField0_", "nodePathId_", "request_"});
        }
        if (iOrdinal == 3) {
            return new AddNodeActivity();
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
        synchronized (AddNodeActivity.class) {
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

    @Override // com.spotify.campfire.datasource.impl.proto.AddNodeActivityOrBuilder
    public String getNodePathId(int i) {
        return (String) this.nodePathId_.get(i);
    }

    @Override // com.spotify.campfire.datasource.impl.proto.AddNodeActivityOrBuilder
    public gva getNodePathIdBytes(int i) {
        return gva.m45888f((String) this.nodePathId_.get(i));
    }

    @Override // com.spotify.campfire.datasource.impl.proto.AddNodeActivityOrBuilder
    public int getNodePathIdCount() {
        return this.nodePathId_.size();
    }

    @Override // com.spotify.campfire.datasource.impl.proto.AddNodeActivityOrBuilder
    public List<String> getNodePathIdList() {
        return this.nodePathId_;
    }

    @Override // com.spotify.campfire.datasource.impl.proto.AddNodeActivityOrBuilder
    public ActivityRequest getRequest() {
        ActivityRequest activityRequest = this.request_;
        return activityRequest == null ? ActivityRequest.getDefaultInstance() : activityRequest;
    }

    @Override // com.spotify.campfire.datasource.impl.proto.AddNodeActivityOrBuilder
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

    public static Builder newBuilder(AddNodeActivity addNodeActivity) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(addNodeActivity);
    }

    public static AddNodeActivity parseDelimitedFrom(InputStream inputStream, aux auxVar) {
        return (AddNodeActivity) AbstractC0269h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, auxVar);
    }

    public static AddNodeActivity parseFrom(ByteBuffer byteBuffer, aux auxVar) {
        return (AddNodeActivity) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, byteBuffer, auxVar);
    }

    public static AddNodeActivity parseFrom(gva gvaVar) {
        return (AddNodeActivity) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, gvaVar);
    }

    public static AddNodeActivity parseFrom(gva gvaVar, aux auxVar) {
        return (AddNodeActivity) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, gvaVar, auxVar);
    }

    public static AddNodeActivity parseFrom(byte[] bArr) {
        return (AddNodeActivity) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static AddNodeActivity parseFrom(byte[] bArr, aux auxVar) {
        return (AddNodeActivity) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr, auxVar);
    }

    public static AddNodeActivity parseFrom(InputStream inputStream) {
        return (AddNodeActivity) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static AddNodeActivity parseFrom(InputStream inputStream, aux auxVar) {
        return (AddNodeActivity) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, inputStream, auxVar);
    }

    public static AddNodeActivity parseFrom(owe oweVar) {
        return (AddNodeActivity) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, oweVar);
    }

    public static AddNodeActivity parseFrom(owe oweVar, aux auxVar) {
        return (AddNodeActivity) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, oweVar, auxVar);
    }
}
