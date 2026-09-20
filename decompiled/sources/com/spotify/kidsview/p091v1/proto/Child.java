package com.spotify.kidsview.p091v1.proto;

import com.google.protobuf.AbstractC0268g;
import com.google.protobuf.AbstractC0269h;
import com.google.protobuf.StringValue;
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
import p204p.tl51;
import p204p.z110;

/* JADX INFO: loaded from: classes7.dex */
public final class Child extends AbstractC0269h implements ChildOrBuilder {
    public static final int CHILD_ID_FIELD_NUMBER = 1;
    private static final Child DEFAULT_INSTANCE;
    public static final int IMAGE_URI_FIELD_NUMBER = 3;
    public static final int IS_FREE_FIELD_NUMBER = 4;
    private static volatile r2n0 PARSER = null;
    public static final int PROFILE_FIELD_NUMBER = 2;
    private int bitField0_;
    private String childId_ = "";
    private StringValue imageUri_;
    private boolean isFree_;
    private Profile profile_;

    /* JADX INFO: renamed from: com.spotify.kidsview.v1.proto.Child$1 */
    public static /* synthetic */ class C08051 {

        /* JADX INFO: renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f4978xa1df5c61;

        static {
            int[] iArr = new int[z110.values().length];
            f4978xa1df5c61 = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f4978xa1df5c61[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f4978xa1df5c61[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f4978xa1df5c61[5] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f4978xa1df5c61[6] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f4978xa1df5c61[0] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f4978xa1df5c61[1] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class Builder extends AbstractC0268g implements ChildOrBuilder {
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

        public Builder clearChildId() {
            copyOnWrite();
            ((Child) this.instance).clearChildId();
            return this;
        }

        public Builder clearImageUri() {
            copyOnWrite();
            ((Child) this.instance).clearImageUri();
            return this;
        }

        public Builder clearIsFree() {
            copyOnWrite();
            ((Child) this.instance).clearIsFree();
            return this;
        }

        public Builder clearProfile() {
            copyOnWrite();
            ((Child) this.instance).clearProfile();
            return this;
        }

        @Override // com.google.protobuf.AbstractC0268g
        /* JADX INFO: renamed from: clone */
        public /* bridge */ /* synthetic */ Object mo98327clone() {
            return super.mo98326clone();
        }

        @Override // com.spotify.kidsview.p091v1.proto.ChildOrBuilder
        public String getChildId() {
            return ((Child) this.instance).getChildId();
        }

        @Override // com.spotify.kidsview.p091v1.proto.ChildOrBuilder
        public gva getChildIdBytes() {
            return ((Child) this.instance).getChildIdBytes();
        }

        @Override // com.google.protobuf.AbstractC0268g, p204p.sre0
        public /* bridge */ /* synthetic */ pre0 getDefaultInstanceForType() {
            return super.getDefaultInstanceForType();
        }

        @Override // com.spotify.kidsview.p091v1.proto.ChildOrBuilder
        public StringValue getImageUri() {
            return ((Child) this.instance).getImageUri();
        }

        @Override // com.spotify.kidsview.p091v1.proto.ChildOrBuilder
        public boolean getIsFree() {
            return ((Child) this.instance).getIsFree();
        }

        @Override // com.spotify.kidsview.p091v1.proto.ChildOrBuilder
        public Profile getProfile() {
            return ((Child) this.instance).getProfile();
        }

        @Override // com.spotify.kidsview.p091v1.proto.ChildOrBuilder
        public boolean hasImageUri() {
            return ((Child) this.instance).hasImageUri();
        }

        @Override // com.spotify.kidsview.p091v1.proto.ChildOrBuilder
        public boolean hasProfile() {
            return ((Child) this.instance).hasProfile();
        }

        @Override // com.google.protobuf.AbstractC0268g, p204p.AbstractC2081l8
        public /* bridge */ /* synthetic */ AbstractC2081l8 internalMergeFrom(AbstractC2118m8 abstractC2118m8) {
            return super.internalMergeFrom((AbstractC0269h) abstractC2118m8);
        }

        @Override // com.google.protobuf.AbstractC0268g, p204p.AbstractC2081l8, p204p.ore0
        public /* bridge */ /* synthetic */ AbstractC2081l8 mergeFrom(owe oweVar, aux auxVar) {
            return super.mergeFrom(oweVar, auxVar);
        }

        public Builder mergeImageUri(StringValue stringValue) {
            copyOnWrite();
            ((Child) this.instance).mergeImageUri(stringValue);
            return this;
        }

        public Builder mergeProfile(Profile profile) {
            copyOnWrite();
            ((Child) this.instance).mergeProfile(profile);
            return this;
        }

        public Builder setChildId(String str) {
            copyOnWrite();
            ((Child) this.instance).setChildId(str);
            return this;
        }

        public Builder setChildIdBytes(gva gvaVar) {
            copyOnWrite();
            ((Child) this.instance).setChildIdBytes(gvaVar);
            return this;
        }

        public Builder setImageUri(StringValue stringValue) {
            copyOnWrite();
            ((Child) this.instance).setImageUri(stringValue);
            return this;
        }

        public Builder setIsFree(boolean z) {
            copyOnWrite();
            ((Child) this.instance).setIsFree(z);
            return this;
        }

        public Builder setProfile(Profile profile) {
            copyOnWrite();
            ((Child) this.instance).setProfile(profile);
            return this;
        }

        private Builder() {
            super(Child.DEFAULT_INSTANCE);
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

        public Builder setImageUri(tl51 tl51Var) {
            copyOnWrite();
            ((Child) this.instance).setImageUri((StringValue) tl51Var.build());
            return this;
        }

        public Builder setProfile(Profile.Builder builder) {
            copyOnWrite();
            ((Child) this.instance).setProfile((Profile) builder.build());
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
        Child child = new Child();
        DEFAULT_INSTANCE = child;
        AbstractC0269h.registerDefaultInstance(Child.class, child);
    }

    private Child() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearChildId() {
        this.childId_ = getDefaultInstance().getChildId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearImageUri() {
        this.imageUri_ = null;
        this.bitField0_ &= -3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIsFree() {
        this.isFree_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearProfile() {
        this.profile_ = null;
        this.bitField0_ &= -2;
    }

    public static Child getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeImageUri(StringValue stringValue) {
        stringValue.getClass();
        StringValue stringValue2 = this.imageUri_;
        if (stringValue2 == null || stringValue2 == StringValue.m1959p()) {
            this.imageUri_ = stringValue;
        } else {
            this.imageUri_ = (StringValue) ((tl51) StringValue.m1961r(this.imageUri_).mergeFrom((AbstractC0269h) stringValue)).buildPartial();
        }
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeProfile(Profile profile) {
        profile.getClass();
        Profile profile2 = this.profile_;
        if (profile2 == null || profile2 == Profile.getDefaultInstance()) {
            this.profile_ = profile;
        } else {
            this.profile_ = (Profile) ((Profile.Builder) Profile.newBuilder(this.profile_).mergeFrom((AbstractC0269h) profile)).buildPartial();
        }
        this.bitField0_ |= 1;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static Child parseDelimitedFrom(InputStream inputStream) {
        return (Child) AbstractC0269h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Child parseFrom(ByteBuffer byteBuffer) {
        return (Child) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setChildId(String str) {
        str.getClass();
        this.childId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setChildIdBytes(gva gvaVar) {
        AbstractC2118m8.checkByteStringIsUtf8(gvaVar);
        this.childId_ = gvaVar.m45892u();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setImageUri(StringValue stringValue) {
        stringValue.getClass();
        this.imageUri_ = stringValue;
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIsFree(boolean z) {
        this.isFree_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setProfile(Profile profile) {
        profile.getClass();
        this.profile_ = profile;
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002ဉ\u0000\u0003ဉ\u0001\u0004\u0007", new Object[]{"bitField0_", "childId_", "profile_", "imageUri_", "isFree_"});
        }
        if (iOrdinal == 3) {
            return new Child();
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
        synchronized (Child.class) {
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

    @Override // com.spotify.kidsview.p091v1.proto.ChildOrBuilder
    public String getChildId() {
        return this.childId_;
    }

    @Override // com.spotify.kidsview.p091v1.proto.ChildOrBuilder
    public gva getChildIdBytes() {
        return gva.m45888f(this.childId_);
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.sre0
    public /* bridge */ /* synthetic */ pre0 getDefaultInstanceForType() {
        return getDefaultInstanceForType();
    }

    @Override // com.spotify.kidsview.p091v1.proto.ChildOrBuilder
    public StringValue getImageUri() {
        StringValue stringValue = this.imageUri_;
        return stringValue == null ? StringValue.m1959p() : stringValue;
    }

    @Override // com.spotify.kidsview.p091v1.proto.ChildOrBuilder
    public boolean getIsFree() {
        return this.isFree_;
    }

    @Override // com.spotify.kidsview.p091v1.proto.ChildOrBuilder
    public Profile getProfile() {
        Profile profile = this.profile_;
        return profile == null ? Profile.getDefaultInstance() : profile;
    }

    @Override // com.spotify.kidsview.p091v1.proto.ChildOrBuilder
    public boolean hasImageUri() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override // com.spotify.kidsview.p091v1.proto.ChildOrBuilder
    public boolean hasProfile() {
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

    public static Builder newBuilder(Child child) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(child);
    }

    public static Child parseDelimitedFrom(InputStream inputStream, aux auxVar) {
        return (Child) AbstractC0269h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, auxVar);
    }

    public static Child parseFrom(ByteBuffer byteBuffer, aux auxVar) {
        return (Child) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, byteBuffer, auxVar);
    }

    public static Child parseFrom(gva gvaVar) {
        return (Child) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, gvaVar);
    }

    public static Child parseFrom(gva gvaVar, aux auxVar) {
        return (Child) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, gvaVar, auxVar);
    }

    public static Child parseFrom(byte[] bArr) {
        return (Child) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Child parseFrom(byte[] bArr, aux auxVar) {
        return (Child) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr, auxVar);
    }

    public static Child parseFrom(InputStream inputStream) {
        return (Child) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Child parseFrom(InputStream inputStream, aux auxVar) {
        return (Child) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, inputStream, auxVar);
    }

    public static Child parseFrom(owe oweVar) {
        return (Child) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, oweVar);
    }

    public static Child parseFrom(owe oweVar, aux auxVar) {
        return (Child) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, oweVar, auxVar);
    }
}
