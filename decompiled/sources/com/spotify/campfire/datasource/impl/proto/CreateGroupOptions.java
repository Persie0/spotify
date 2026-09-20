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
public final class CreateGroupOptions extends AbstractC0269h implements CreateGroupOptionsOrBuilder {
    private static final CreateGroupOptions DEFAULT_INSTANCE;
    public static final int HIERARCHY_ID_FIELD_NUMBER = 1;
    private static volatile r2n0 PARSER = null;
    public static final int REQUEST_TOKEN_FIELD_NUMBER = 2;
    private String hierarchyId_ = "";
    private String requestToken_ = "";

    /* JADX INFO: renamed from: com.spotify.campfire.datasource.impl.proto.CreateGroupOptions$1 */
    public static /* synthetic */ class C03511 {

        /* JADX INFO: renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f3178xa1df5c61;

        static {
            int[] iArr = new int[z110.values().length];
            f3178xa1df5c61 = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f3178xa1df5c61[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f3178xa1df5c61[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f3178xa1df5c61[5] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f3178xa1df5c61[6] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f3178xa1df5c61[0] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f3178xa1df5c61[1] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class Builder extends AbstractC0268g implements CreateGroupOptionsOrBuilder {
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

        public Builder clearHierarchyId() {
            copyOnWrite();
            ((CreateGroupOptions) this.instance).clearHierarchyId();
            return this;
        }

        public Builder clearRequestToken() {
            copyOnWrite();
            ((CreateGroupOptions) this.instance).clearRequestToken();
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

        @Override // com.spotify.campfire.datasource.impl.proto.CreateGroupOptionsOrBuilder
        public String getHierarchyId() {
            return ((CreateGroupOptions) this.instance).getHierarchyId();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.CreateGroupOptionsOrBuilder
        public gva getHierarchyIdBytes() {
            return ((CreateGroupOptions) this.instance).getHierarchyIdBytes();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.CreateGroupOptionsOrBuilder
        public String getRequestToken() {
            return ((CreateGroupOptions) this.instance).getRequestToken();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.CreateGroupOptionsOrBuilder
        public gva getRequestTokenBytes() {
            return ((CreateGroupOptions) this.instance).getRequestTokenBytes();
        }

        @Override // com.google.protobuf.AbstractC0268g, p204p.AbstractC2081l8
        public /* bridge */ /* synthetic */ AbstractC2081l8 internalMergeFrom(AbstractC2118m8 abstractC2118m8) {
            return super.internalMergeFrom((AbstractC0269h) abstractC2118m8);
        }

        @Override // com.google.protobuf.AbstractC0268g, p204p.AbstractC2081l8, p204p.ore0
        public /* bridge */ /* synthetic */ AbstractC2081l8 mergeFrom(owe oweVar, aux auxVar) {
            return super.mergeFrom(oweVar, auxVar);
        }

        public Builder setHierarchyId(String str) {
            copyOnWrite();
            ((CreateGroupOptions) this.instance).setHierarchyId(str);
            return this;
        }

        public Builder setHierarchyIdBytes(gva gvaVar) {
            copyOnWrite();
            ((CreateGroupOptions) this.instance).setHierarchyIdBytes(gvaVar);
            return this;
        }

        public Builder setRequestToken(String str) {
            copyOnWrite();
            ((CreateGroupOptions) this.instance).setRequestToken(str);
            return this;
        }

        public Builder setRequestTokenBytes(gva gvaVar) {
            copyOnWrite();
            ((CreateGroupOptions) this.instance).setRequestTokenBytes(gvaVar);
            return this;
        }

        private Builder() {
            super(CreateGroupOptions.DEFAULT_INSTANCE);
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
        CreateGroupOptions createGroupOptions = new CreateGroupOptions();
        DEFAULT_INSTANCE = createGroupOptions;
        AbstractC0269h.registerDefaultInstance(CreateGroupOptions.class, createGroupOptions);
    }

    private CreateGroupOptions() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearHierarchyId() {
        this.hierarchyId_ = getDefaultInstance().getHierarchyId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRequestToken() {
        this.requestToken_ = getDefaultInstance().getRequestToken();
    }

    public static CreateGroupOptions getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static CreateGroupOptions parseDelimitedFrom(InputStream inputStream) {
        return (CreateGroupOptions) AbstractC0269h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static CreateGroupOptions parseFrom(ByteBuffer byteBuffer) {
        return (CreateGroupOptions) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHierarchyId(String str) {
        str.getClass();
        this.hierarchyId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHierarchyIdBytes(gva gvaVar) {
        AbstractC2118m8.checkByteStringIsUtf8(gvaVar);
        this.hierarchyId_ = gvaVar.m45892u();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRequestToken(String str) {
        str.getClass();
        this.requestToken_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRequestTokenBytes(gva gvaVar) {
        AbstractC2118m8.checkByteStringIsUtf8(gvaVar);
        this.requestToken_ = gvaVar.m45892u();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ", new Object[]{"hierarchyId_", "requestToken_"});
        }
        if (iOrdinal == 3) {
            return new CreateGroupOptions();
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
        synchronized (CreateGroupOptions.class) {
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

    @Override // com.spotify.campfire.datasource.impl.proto.CreateGroupOptionsOrBuilder
    public String getHierarchyId() {
        return this.hierarchyId_;
    }

    @Override // com.spotify.campfire.datasource.impl.proto.CreateGroupOptionsOrBuilder
    public gva getHierarchyIdBytes() {
        return gva.m45888f(this.hierarchyId_);
    }

    @Override // com.spotify.campfire.datasource.impl.proto.CreateGroupOptionsOrBuilder
    public String getRequestToken() {
        return this.requestToken_;
    }

    @Override // com.spotify.campfire.datasource.impl.proto.CreateGroupOptionsOrBuilder
    public gva getRequestTokenBytes() {
        return gva.m45888f(this.requestToken_);
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }

    public static Builder newBuilder(CreateGroupOptions createGroupOptions) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(createGroupOptions);
    }

    public static CreateGroupOptions parseDelimitedFrom(InputStream inputStream, aux auxVar) {
        return (CreateGroupOptions) AbstractC0269h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, auxVar);
    }

    public static CreateGroupOptions parseFrom(ByteBuffer byteBuffer, aux auxVar) {
        return (CreateGroupOptions) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, byteBuffer, auxVar);
    }

    public static CreateGroupOptions parseFrom(gva gvaVar) {
        return (CreateGroupOptions) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, gvaVar);
    }

    public static CreateGroupOptions parseFrom(gva gvaVar, aux auxVar) {
        return (CreateGroupOptions) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, gvaVar, auxVar);
    }

    public static CreateGroupOptions parseFrom(byte[] bArr) {
        return (CreateGroupOptions) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static CreateGroupOptions parseFrom(byte[] bArr, aux auxVar) {
        return (CreateGroupOptions) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr, auxVar);
    }

    public static CreateGroupOptions parseFrom(InputStream inputStream) {
        return (CreateGroupOptions) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static CreateGroupOptions parseFrom(InputStream inputStream, aux auxVar) {
        return (CreateGroupOptions) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, inputStream, auxVar);
    }

    public static CreateGroupOptions parseFrom(owe oweVar) {
        return (CreateGroupOptions) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, oweVar);
    }

    public static CreateGroupOptions parseFrom(owe oweVar, aux auxVar) {
        return (CreateGroupOptions) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, oweVar, auxVar);
    }
}
