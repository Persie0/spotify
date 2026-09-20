package com.spotify.kidsview.p091v1.proto;

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

/* JADX INFO: loaded from: classes7.dex */
public final class ManagedAccountProfile extends AbstractC0269h implements ManagedAccountProfileOrBuilder {
    public static final int COLOR_FIELD_NUMBER = 3;
    private static final ManagedAccountProfile DEFAULT_INSTANCE;
    public static final int DISPLAY_NAME_FIELD_NUMBER = 1;
    public static final int IMAGE_URL_FIELD_NUMBER = 2;
    private static volatile r2n0 PARSER;
    private int bitField0_;
    private int color_;
    private String displayName_ = "";
    private String imageUrl_ = "";

    /* JADX INFO: renamed from: com.spotify.kidsview.v1.proto.ManagedAccountProfile$1 */
    public static /* synthetic */ class C08201 {

        /* JADX INFO: renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f4995xa1df5c61;

        static {
            int[] iArr = new int[z110.values().length];
            f4995xa1df5c61 = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f4995xa1df5c61[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f4995xa1df5c61[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f4995xa1df5c61[5] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f4995xa1df5c61[6] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f4995xa1df5c61[0] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f4995xa1df5c61[1] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class Builder extends AbstractC0268g implements ManagedAccountProfileOrBuilder {
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

        public Builder clearColor() {
            copyOnWrite();
            ((ManagedAccountProfile) this.instance).clearColor();
            return this;
        }

        public Builder clearDisplayName() {
            copyOnWrite();
            ((ManagedAccountProfile) this.instance).clearDisplayName();
            return this;
        }

        public Builder clearImageUrl() {
            copyOnWrite();
            ((ManagedAccountProfile) this.instance).clearImageUrl();
            return this;
        }

        @Override // com.google.protobuf.AbstractC0268g
        /* JADX INFO: renamed from: clone */
        public /* bridge */ /* synthetic */ Object mo98328clone() {
            return super.mo98326clone();
        }

        @Override // com.spotify.kidsview.p091v1.proto.ManagedAccountProfileOrBuilder
        public int getColor() {
            return ((ManagedAccountProfile) this.instance).getColor();
        }

        @Override // com.google.protobuf.AbstractC0268g, p204p.sre0
        public /* bridge */ /* synthetic */ pre0 getDefaultInstanceForType() {
            return super.getDefaultInstanceForType();
        }

        @Override // com.spotify.kidsview.p091v1.proto.ManagedAccountProfileOrBuilder
        public String getDisplayName() {
            return ((ManagedAccountProfile) this.instance).getDisplayName();
        }

        @Override // com.spotify.kidsview.p091v1.proto.ManagedAccountProfileOrBuilder
        public gva getDisplayNameBytes() {
            return ((ManagedAccountProfile) this.instance).getDisplayNameBytes();
        }

        @Override // com.spotify.kidsview.p091v1.proto.ManagedAccountProfileOrBuilder
        public String getImageUrl() {
            return ((ManagedAccountProfile) this.instance).getImageUrl();
        }

        @Override // com.spotify.kidsview.p091v1.proto.ManagedAccountProfileOrBuilder
        public gva getImageUrlBytes() {
            return ((ManagedAccountProfile) this.instance).getImageUrlBytes();
        }

        @Override // com.spotify.kidsview.p091v1.proto.ManagedAccountProfileOrBuilder
        public boolean hasColor() {
            return ((ManagedAccountProfile) this.instance).hasColor();
        }

        @Override // com.spotify.kidsview.p091v1.proto.ManagedAccountProfileOrBuilder
        public boolean hasImageUrl() {
            return ((ManagedAccountProfile) this.instance).hasImageUrl();
        }

        @Override // com.google.protobuf.AbstractC0268g, p204p.AbstractC2081l8
        public /* bridge */ /* synthetic */ AbstractC2081l8 internalMergeFrom(AbstractC2118m8 abstractC2118m8) {
            return super.internalMergeFrom((AbstractC0269h) abstractC2118m8);
        }

        @Override // com.google.protobuf.AbstractC0268g, p204p.AbstractC2081l8, p204p.ore0
        public /* bridge */ /* synthetic */ AbstractC2081l8 mergeFrom(owe oweVar, aux auxVar) {
            return super.mergeFrom(oweVar, auxVar);
        }

        public Builder setColor(int i) {
            copyOnWrite();
            ((ManagedAccountProfile) this.instance).setColor(i);
            return this;
        }

        public Builder setDisplayName(String str) {
            copyOnWrite();
            ((ManagedAccountProfile) this.instance).setDisplayName(str);
            return this;
        }

        public Builder setDisplayNameBytes(gva gvaVar) {
            copyOnWrite();
            ((ManagedAccountProfile) this.instance).setDisplayNameBytes(gvaVar);
            return this;
        }

        public Builder setImageUrl(String str) {
            copyOnWrite();
            ((ManagedAccountProfile) this.instance).setImageUrl(str);
            return this;
        }

        public Builder setImageUrlBytes(gva gvaVar) {
            copyOnWrite();
            ((ManagedAccountProfile) this.instance).setImageUrlBytes(gvaVar);
            return this;
        }

        private Builder() {
            super(ManagedAccountProfile.DEFAULT_INSTANCE);
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
        ManagedAccountProfile managedAccountProfile = new ManagedAccountProfile();
        DEFAULT_INSTANCE = managedAccountProfile;
        AbstractC0269h.registerDefaultInstance(ManagedAccountProfile.class, managedAccountProfile);
    }

    private ManagedAccountProfile() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearColor() {
        this.bitField0_ &= -3;
        this.color_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDisplayName() {
        this.displayName_ = getDefaultInstance().getDisplayName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearImageUrl() {
        this.bitField0_ &= -2;
        this.imageUrl_ = getDefaultInstance().getImageUrl();
    }

    public static ManagedAccountProfile getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static ManagedAccountProfile parseDelimitedFrom(InputStream inputStream) {
        return (ManagedAccountProfile) AbstractC0269h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ManagedAccountProfile parseFrom(ByteBuffer byteBuffer) {
        return (ManagedAccountProfile) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setColor(int i) {
        this.bitField0_ |= 2;
        this.color_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDisplayName(String str) {
        str.getClass();
        this.displayName_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDisplayNameBytes(gva gvaVar) {
        AbstractC2118m8.checkByteStringIsUtf8(gvaVar);
        this.displayName_ = gvaVar.m45892u();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setImageUrl(String str) {
        str.getClass();
        this.bitField0_ |= 1;
        this.imageUrl_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setImageUrlBytes(gva gvaVar) {
        AbstractC2118m8.checkByteStringIsUtf8(gvaVar);
        this.imageUrl_ = gvaVar.m45892u();
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002ለ\u0000\u0003င\u0001", new Object[]{"bitField0_", "displayName_", "imageUrl_", "color_"});
        }
        if (iOrdinal == 3) {
            return new ManagedAccountProfile();
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
        synchronized (ManagedAccountProfile.class) {
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

    @Override // com.spotify.kidsview.p091v1.proto.ManagedAccountProfileOrBuilder
    public int getColor() {
        return this.color_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.sre0
    public /* bridge */ /* synthetic */ pre0 getDefaultInstanceForType() {
        return getDefaultInstanceForType();
    }

    @Override // com.spotify.kidsview.p091v1.proto.ManagedAccountProfileOrBuilder
    public String getDisplayName() {
        return this.displayName_;
    }

    @Override // com.spotify.kidsview.p091v1.proto.ManagedAccountProfileOrBuilder
    public gva getDisplayNameBytes() {
        return gva.m45888f(this.displayName_);
    }

    @Override // com.spotify.kidsview.p091v1.proto.ManagedAccountProfileOrBuilder
    public String getImageUrl() {
        return this.imageUrl_;
    }

    @Override // com.spotify.kidsview.p091v1.proto.ManagedAccountProfileOrBuilder
    public gva getImageUrlBytes() {
        return gva.m45888f(this.imageUrl_);
    }

    @Override // com.spotify.kidsview.p091v1.proto.ManagedAccountProfileOrBuilder
    public boolean hasColor() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override // com.spotify.kidsview.p091v1.proto.ManagedAccountProfileOrBuilder
    public boolean hasImageUrl() {
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

    public static Builder newBuilder(ManagedAccountProfile managedAccountProfile) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(managedAccountProfile);
    }

    public static ManagedAccountProfile parseDelimitedFrom(InputStream inputStream, aux auxVar) {
        return (ManagedAccountProfile) AbstractC0269h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, auxVar);
    }

    public static ManagedAccountProfile parseFrom(ByteBuffer byteBuffer, aux auxVar) {
        return (ManagedAccountProfile) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, byteBuffer, auxVar);
    }

    public static ManagedAccountProfile parseFrom(gva gvaVar) {
        return (ManagedAccountProfile) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, gvaVar);
    }

    public static ManagedAccountProfile parseFrom(gva gvaVar, aux auxVar) {
        return (ManagedAccountProfile) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, gvaVar, auxVar);
    }

    public static ManagedAccountProfile parseFrom(byte[] bArr) {
        return (ManagedAccountProfile) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ManagedAccountProfile parseFrom(byte[] bArr, aux auxVar) {
        return (ManagedAccountProfile) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr, auxVar);
    }

    public static ManagedAccountProfile parseFrom(InputStream inputStream) {
        return (ManagedAccountProfile) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ManagedAccountProfile parseFrom(InputStream inputStream, aux auxVar) {
        return (ManagedAccountProfile) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, inputStream, auxVar);
    }

    public static ManagedAccountProfile parseFrom(owe oweVar) {
        return (ManagedAccountProfile) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, oweVar);
    }

    public static ManagedAccountProfile parseFrom(owe oweVar, aux auxVar) {
        return (ManagedAccountProfile) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, oweVar, auxVar);
    }
}
