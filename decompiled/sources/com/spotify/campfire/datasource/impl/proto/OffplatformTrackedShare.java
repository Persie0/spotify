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
public final class OffplatformTrackedShare extends AbstractC0269h implements OffplatformTrackedShareOrBuilder {
    private static final OffplatformTrackedShare DEFAULT_INSTANCE;
    public static final int DESTINATION_FIELD_NUMBER = 3;
    public static final int OFFPLATFORM_SHARE_SOURCE_FIELD_NUMBER = 6;
    public static final int OPENING_USER_ID_FIELD_NUMBER = 5;
    public static final int OP_SHARE_ID_FIELD_NUMBER = 2;
    private static volatile r2n0 PARSER = null;
    public static final int SHARING_USER_ID_FIELD_NUMBER = 4;
    public static final int URI_FIELD_NUMBER = 1;
    private int bitField0_;
    private int offplatformShareSource_;
    private String opShareId_ = "";
    private String uri_ = "";
    private String destination_ = "";
    private String sharingUserId_ = "";
    private String openingUserId_ = "";

    /* JADX INFO: renamed from: com.spotify.campfire.datasource.impl.proto.OffplatformTrackedShare$1 */
    public static /* synthetic */ class C04221 {

        /* JADX INFO: renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f3237xa1df5c61;

        static {
            int[] iArr = new int[z110.values().length];
            f3237xa1df5c61 = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f3237xa1df5c61[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f3237xa1df5c61[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f3237xa1df5c61[5] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f3237xa1df5c61[6] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f3237xa1df5c61[0] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f3237xa1df5c61[1] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class Builder extends AbstractC0268g implements OffplatformTrackedShareOrBuilder {
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

        public Builder clearDestination() {
            copyOnWrite();
            ((OffplatformTrackedShare) this.instance).clearDestination();
            return this;
        }

        public Builder clearOffplatformShareSource() {
            copyOnWrite();
            ((OffplatformTrackedShare) this.instance).clearOffplatformShareSource();
            return this;
        }

        public Builder clearOpShareId() {
            copyOnWrite();
            ((OffplatformTrackedShare) this.instance).clearOpShareId();
            return this;
        }

        public Builder clearOpeningUserId() {
            copyOnWrite();
            ((OffplatformTrackedShare) this.instance).clearOpeningUserId();
            return this;
        }

        public Builder clearSharingUserId() {
            copyOnWrite();
            ((OffplatformTrackedShare) this.instance).clearSharingUserId();
            return this;
        }

        public Builder clearUri() {
            copyOnWrite();
            ((OffplatformTrackedShare) this.instance).clearUri();
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

        @Override // com.spotify.campfire.datasource.impl.proto.OffplatformTrackedShareOrBuilder
        public String getDestination() {
            return ((OffplatformTrackedShare) this.instance).getDestination();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.OffplatformTrackedShareOrBuilder
        public gva getDestinationBytes() {
            return ((OffplatformTrackedShare) this.instance).getDestinationBytes();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.OffplatformTrackedShareOrBuilder
        public OffplatformShareSource getOffplatformShareSource() {
            return ((OffplatformTrackedShare) this.instance).getOffplatformShareSource();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.OffplatformTrackedShareOrBuilder
        public int getOffplatformShareSourceValue() {
            return ((OffplatformTrackedShare) this.instance).getOffplatformShareSourceValue();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.OffplatformTrackedShareOrBuilder
        public String getOpShareId() {
            return ((OffplatformTrackedShare) this.instance).getOpShareId();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.OffplatformTrackedShareOrBuilder
        public gva getOpShareIdBytes() {
            return ((OffplatformTrackedShare) this.instance).getOpShareIdBytes();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.OffplatformTrackedShareOrBuilder
        public String getOpeningUserId() {
            return ((OffplatformTrackedShare) this.instance).getOpeningUserId();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.OffplatformTrackedShareOrBuilder
        public gva getOpeningUserIdBytes() {
            return ((OffplatformTrackedShare) this.instance).getOpeningUserIdBytes();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.OffplatformTrackedShareOrBuilder
        public String getSharingUserId() {
            return ((OffplatformTrackedShare) this.instance).getSharingUserId();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.OffplatformTrackedShareOrBuilder
        public gva getSharingUserIdBytes() {
            return ((OffplatformTrackedShare) this.instance).getSharingUserIdBytes();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.OffplatformTrackedShareOrBuilder
        public String getUri() {
            return ((OffplatformTrackedShare) this.instance).getUri();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.OffplatformTrackedShareOrBuilder
        public gva getUriBytes() {
            return ((OffplatformTrackedShare) this.instance).getUriBytes();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.OffplatformTrackedShareOrBuilder
        public boolean hasOffplatformShareSource() {
            return ((OffplatformTrackedShare) this.instance).hasOffplatformShareSource();
        }

        @Override // com.google.protobuf.AbstractC0268g, p204p.AbstractC2081l8
        public /* bridge */ /* synthetic */ AbstractC2081l8 internalMergeFrom(AbstractC2118m8 abstractC2118m8) {
            return super.internalMergeFrom((AbstractC0269h) abstractC2118m8);
        }

        @Override // com.google.protobuf.AbstractC0268g, p204p.AbstractC2081l8, p204p.ore0
        public /* bridge */ /* synthetic */ AbstractC2081l8 mergeFrom(owe oweVar, aux auxVar) {
            return super.mergeFrom(oweVar, auxVar);
        }

        public Builder setDestination(String str) {
            copyOnWrite();
            ((OffplatformTrackedShare) this.instance).setDestination(str);
            return this;
        }

        public Builder setDestinationBytes(gva gvaVar) {
            copyOnWrite();
            ((OffplatformTrackedShare) this.instance).setDestinationBytes(gvaVar);
            return this;
        }

        public Builder setOffplatformShareSource(OffplatformShareSource offplatformShareSource) {
            copyOnWrite();
            ((OffplatformTrackedShare) this.instance).setOffplatformShareSource(offplatformShareSource);
            return this;
        }

        public Builder setOffplatformShareSourceValue(int i) {
            copyOnWrite();
            ((OffplatformTrackedShare) this.instance).setOffplatformShareSourceValue(i);
            return this;
        }

        public Builder setOpShareId(String str) {
            copyOnWrite();
            ((OffplatformTrackedShare) this.instance).setOpShareId(str);
            return this;
        }

        public Builder setOpShareIdBytes(gva gvaVar) {
            copyOnWrite();
            ((OffplatformTrackedShare) this.instance).setOpShareIdBytes(gvaVar);
            return this;
        }

        public Builder setOpeningUserId(String str) {
            copyOnWrite();
            ((OffplatformTrackedShare) this.instance).setOpeningUserId(str);
            return this;
        }

        public Builder setOpeningUserIdBytes(gva gvaVar) {
            copyOnWrite();
            ((OffplatformTrackedShare) this.instance).setOpeningUserIdBytes(gvaVar);
            return this;
        }

        public Builder setSharingUserId(String str) {
            copyOnWrite();
            ((OffplatformTrackedShare) this.instance).setSharingUserId(str);
            return this;
        }

        public Builder setSharingUserIdBytes(gva gvaVar) {
            copyOnWrite();
            ((OffplatformTrackedShare) this.instance).setSharingUserIdBytes(gvaVar);
            return this;
        }

        public Builder setUri(String str) {
            copyOnWrite();
            ((OffplatformTrackedShare) this.instance).setUri(str);
            return this;
        }

        public Builder setUriBytes(gva gvaVar) {
            copyOnWrite();
            ((OffplatformTrackedShare) this.instance).setUriBytes(gvaVar);
            return this;
        }

        private Builder() {
            super(OffplatformTrackedShare.DEFAULT_INSTANCE);
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
        OffplatformTrackedShare offplatformTrackedShare = new OffplatformTrackedShare();
        DEFAULT_INSTANCE = offplatformTrackedShare;
        AbstractC0269h.registerDefaultInstance(OffplatformTrackedShare.class, offplatformTrackedShare);
    }

    private OffplatformTrackedShare() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDestination() {
        this.destination_ = getDefaultInstance().getDestination();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearOffplatformShareSource() {
        this.bitField0_ &= -2;
        this.offplatformShareSource_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearOpShareId() {
        this.opShareId_ = getDefaultInstance().getOpShareId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearOpeningUserId() {
        this.openingUserId_ = getDefaultInstance().getOpeningUserId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSharingUserId() {
        this.sharingUserId_ = getDefaultInstance().getSharingUserId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUri() {
        this.uri_ = getDefaultInstance().getUri();
    }

    public static OffplatformTrackedShare getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static OffplatformTrackedShare parseDelimitedFrom(InputStream inputStream) {
        return (OffplatformTrackedShare) AbstractC0269h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static OffplatformTrackedShare parseFrom(ByteBuffer byteBuffer) {
        return (OffplatformTrackedShare) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDestination(String str) {
        str.getClass();
        this.destination_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDestinationBytes(gva gvaVar) {
        AbstractC2118m8.checkByteStringIsUtf8(gvaVar);
        this.destination_ = gvaVar.m45892u();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOffplatformShareSource(OffplatformShareSource offplatformShareSource) {
        this.offplatformShareSource_ = offplatformShareSource.getNumber();
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOffplatformShareSourceValue(int i) {
        this.bitField0_ |= 1;
        this.offplatformShareSource_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOpShareId(String str) {
        str.getClass();
        this.opShareId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOpShareIdBytes(gva gvaVar) {
        AbstractC2118m8.checkByteStringIsUtf8(gvaVar);
        this.opShareId_ = gvaVar.m45892u();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOpeningUserId(String str) {
        str.getClass();
        this.openingUserId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOpeningUserIdBytes(gva gvaVar) {
        AbstractC2118m8.checkByteStringIsUtf8(gvaVar);
        this.openingUserId_ = gvaVar.m45892u();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSharingUserId(String str) {
        str.getClass();
        this.sharingUserId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSharingUserIdBytes(gva gvaVar) {
        AbstractC2118m8.checkByteStringIsUtf8(gvaVar);
        this.sharingUserId_ = gvaVar.m45892u();
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004Ȉ\u0005Ȉ\u0006ဌ\u0000", new Object[]{"bitField0_", "uri_", "opShareId_", "destination_", "sharingUserId_", "openingUserId_", "offplatformShareSource_"});
        }
        if (iOrdinal == 3) {
            return new OffplatformTrackedShare();
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
        synchronized (OffplatformTrackedShare.class) {
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

    @Override // com.spotify.campfire.datasource.impl.proto.OffplatformTrackedShareOrBuilder
    public String getDestination() {
        return this.destination_;
    }

    @Override // com.spotify.campfire.datasource.impl.proto.OffplatformTrackedShareOrBuilder
    public gva getDestinationBytes() {
        return gva.m45888f(this.destination_);
    }

    @Override // com.spotify.campfire.datasource.impl.proto.OffplatformTrackedShareOrBuilder
    public OffplatformShareSource getOffplatformShareSource() {
        OffplatformShareSource offplatformShareSourceForNumber = OffplatformShareSource.forNumber(this.offplatformShareSource_);
        return offplatformShareSourceForNumber == null ? OffplatformShareSource.UNRECOGNIZED : offplatformShareSourceForNumber;
    }

    @Override // com.spotify.campfire.datasource.impl.proto.OffplatformTrackedShareOrBuilder
    public int getOffplatformShareSourceValue() {
        return this.offplatformShareSource_;
    }

    @Override // com.spotify.campfire.datasource.impl.proto.OffplatformTrackedShareOrBuilder
    public String getOpShareId() {
        return this.opShareId_;
    }

    @Override // com.spotify.campfire.datasource.impl.proto.OffplatformTrackedShareOrBuilder
    public gva getOpShareIdBytes() {
        return gva.m45888f(this.opShareId_);
    }

    @Override // com.spotify.campfire.datasource.impl.proto.OffplatformTrackedShareOrBuilder
    public String getOpeningUserId() {
        return this.openingUserId_;
    }

    @Override // com.spotify.campfire.datasource.impl.proto.OffplatformTrackedShareOrBuilder
    public gva getOpeningUserIdBytes() {
        return gva.m45888f(this.openingUserId_);
    }

    @Override // com.spotify.campfire.datasource.impl.proto.OffplatformTrackedShareOrBuilder
    public String getSharingUserId() {
        return this.sharingUserId_;
    }

    @Override // com.spotify.campfire.datasource.impl.proto.OffplatformTrackedShareOrBuilder
    public gva getSharingUserIdBytes() {
        return gva.m45888f(this.sharingUserId_);
    }

    @Override // com.spotify.campfire.datasource.impl.proto.OffplatformTrackedShareOrBuilder
    public String getUri() {
        return this.uri_;
    }

    @Override // com.spotify.campfire.datasource.impl.proto.OffplatformTrackedShareOrBuilder
    public gva getUriBytes() {
        return gva.m45888f(this.uri_);
    }

    @Override // com.spotify.campfire.datasource.impl.proto.OffplatformTrackedShareOrBuilder
    public boolean hasOffplatformShareSource() {
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

    public static Builder newBuilder(OffplatformTrackedShare offplatformTrackedShare) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(offplatformTrackedShare);
    }

    public static OffplatformTrackedShare parseDelimitedFrom(InputStream inputStream, aux auxVar) {
        return (OffplatformTrackedShare) AbstractC0269h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, auxVar);
    }

    public static OffplatformTrackedShare parseFrom(ByteBuffer byteBuffer, aux auxVar) {
        return (OffplatformTrackedShare) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, byteBuffer, auxVar);
    }

    public static OffplatformTrackedShare parseFrom(gva gvaVar) {
        return (OffplatformTrackedShare) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, gvaVar);
    }

    public static OffplatformTrackedShare parseFrom(gva gvaVar, aux auxVar) {
        return (OffplatformTrackedShare) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, gvaVar, auxVar);
    }

    public static OffplatformTrackedShare parseFrom(byte[] bArr) {
        return (OffplatformTrackedShare) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static OffplatformTrackedShare parseFrom(byte[] bArr, aux auxVar) {
        return (OffplatformTrackedShare) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr, auxVar);
    }

    public static OffplatformTrackedShare parseFrom(InputStream inputStream) {
        return (OffplatformTrackedShare) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static OffplatformTrackedShare parseFrom(InputStream inputStream, aux auxVar) {
        return (OffplatformTrackedShare) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, inputStream, auxVar);
    }

    public static OffplatformTrackedShare parseFrom(owe oweVar) {
        return (OffplatformTrackedShare) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, oweVar);
    }

    public static OffplatformTrackedShare parseFrom(owe oweVar, aux auxVar) {
        return (OffplatformTrackedShare) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, oweVar, auxVar);
    }
}
