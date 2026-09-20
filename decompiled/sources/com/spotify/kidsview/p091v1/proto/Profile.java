package com.spotify.kidsview.p091v1.proto;

import com.google.protobuf.AbstractC0268g;
import com.google.protobuf.AbstractC0269h;
import com.google.protobuf.Int32Value;
import java.io.InputStream;
import java.nio.ByteBuffer;
import p204p.AbstractC2081l8;
import p204p.AbstractC2118m8;
import p204p.aux;
import p204p.gva;
import p204p.k350;
import p204p.ore0;
import p204p.owe;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.z110;

/* JADX INFO: loaded from: classes7.dex */
public final class Profile extends AbstractC0269h implements ProfileOrBuilder {
    public static final int ALLOWED_IN_MUSIC_APP_FIELD_NUMBER = 3;
    public static final int AVATAR_FIELD_NUMBER = 4;
    public static final int COLOR_FIELD_NUMBER = 6;
    public static final int DATE_OF_BIRTH_FIELD_NUMBER = 2;
    private static final Profile DEFAULT_INSTANCE;
    public static final int NAME_FIELD_NUMBER = 1;
    private static volatile r2n0 PARSER = null;
    public static final int V2_AVATAR_FIELD_NUMBER = 5;
    private boolean allowedInMusicApp_;
    private int bitField0_;
    private Int32Value color_;
    private int v2Avatar_;
    private String name_ = "";
    private String dateOfBirth_ = "";
    private String avatar_ = "";

    /* JADX INFO: renamed from: com.spotify.kidsview.v1.proto.Profile$1 */
    public static /* synthetic */ class C08231 {

        /* JADX INFO: renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f4998xa1df5c61;

        static {
            int[] iArr = new int[z110.values().length];
            f4998xa1df5c61 = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f4998xa1df5c61[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f4998xa1df5c61[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f4998xa1df5c61[5] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f4998xa1df5c61[6] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f4998xa1df5c61[0] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f4998xa1df5c61[1] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class Builder extends AbstractC0268g implements ProfileOrBuilder {
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

        public Builder clearAllowedInMusicApp() {
            copyOnWrite();
            ((Profile) this.instance).clearAllowedInMusicApp();
            return this;
        }

        public Builder clearAvatar() {
            copyOnWrite();
            ((Profile) this.instance).clearAvatar();
            return this;
        }

        public Builder clearColor() {
            copyOnWrite();
            ((Profile) this.instance).clearColor();
            return this;
        }

        public Builder clearDateOfBirth() {
            copyOnWrite();
            ((Profile) this.instance).clearDateOfBirth();
            return this;
        }

        public Builder clearName() {
            copyOnWrite();
            ((Profile) this.instance).clearName();
            return this;
        }

        public Builder clearV2Avatar() {
            copyOnWrite();
            ((Profile) this.instance).clearV2Avatar();
            return this;
        }

        @Override // com.google.protobuf.AbstractC0268g
        /* JADX INFO: renamed from: clone */
        public /* bridge */ /* synthetic */ Object mo98327clone() {
            return super.mo98326clone();
        }

        @Override // com.spotify.kidsview.p091v1.proto.ProfileOrBuilder
        public boolean getAllowedInMusicApp() {
            return ((Profile) this.instance).getAllowedInMusicApp();
        }

        @Override // com.spotify.kidsview.p091v1.proto.ProfileOrBuilder
        public String getAvatar() {
            return ((Profile) this.instance).getAvatar();
        }

        @Override // com.spotify.kidsview.p091v1.proto.ProfileOrBuilder
        public gva getAvatarBytes() {
            return ((Profile) this.instance).getAvatarBytes();
        }

        @Override // com.spotify.kidsview.p091v1.proto.ProfileOrBuilder
        public Int32Value getColor() {
            return ((Profile) this.instance).getColor();
        }

        @Override // com.spotify.kidsview.p091v1.proto.ProfileOrBuilder
        public String getDateOfBirth() {
            return ((Profile) this.instance).getDateOfBirth();
        }

        @Override // com.spotify.kidsview.p091v1.proto.ProfileOrBuilder
        public gva getDateOfBirthBytes() {
            return ((Profile) this.instance).getDateOfBirthBytes();
        }

        @Override // com.google.protobuf.AbstractC0268g, p204p.sre0
        public /* bridge */ /* synthetic */ pre0 getDefaultInstanceForType() {
            return super.getDefaultInstanceForType();
        }

        @Override // com.spotify.kidsview.p091v1.proto.ProfileOrBuilder
        public String getName() {
            return ((Profile) this.instance).getName();
        }

        @Override // com.spotify.kidsview.p091v1.proto.ProfileOrBuilder
        public gva getNameBytes() {
            return ((Profile) this.instance).getNameBytes();
        }

        @Override // com.spotify.kidsview.p091v1.proto.ProfileOrBuilder
        public Avatar getV2Avatar() {
            return ((Profile) this.instance).getV2Avatar();
        }

        @Override // com.spotify.kidsview.p091v1.proto.ProfileOrBuilder
        public int getV2AvatarValue() {
            return ((Profile) this.instance).getV2AvatarValue();
        }

        @Override // com.spotify.kidsview.p091v1.proto.ProfileOrBuilder
        public boolean hasColor() {
            return ((Profile) this.instance).hasColor();
        }

        @Override // com.spotify.kidsview.p091v1.proto.ProfileOrBuilder
        public boolean hasV2Avatar() {
            return ((Profile) this.instance).hasV2Avatar();
        }

        @Override // com.google.protobuf.AbstractC0268g, p204p.AbstractC2081l8
        public /* bridge */ /* synthetic */ AbstractC2081l8 internalMergeFrom(AbstractC2118m8 abstractC2118m8) {
            return super.internalMergeFrom((AbstractC0269h) abstractC2118m8);
        }

        public Builder mergeColor(Int32Value int32Value) {
            copyOnWrite();
            ((Profile) this.instance).mergeColor(int32Value);
            return this;
        }

        @Override // com.google.protobuf.AbstractC0268g, p204p.AbstractC2081l8, p204p.ore0
        public /* bridge */ /* synthetic */ AbstractC2081l8 mergeFrom(owe oweVar, aux auxVar) {
            return super.mergeFrom(oweVar, auxVar);
        }

        public Builder setAllowedInMusicApp(boolean z) {
            copyOnWrite();
            ((Profile) this.instance).setAllowedInMusicApp(z);
            return this;
        }

        public Builder setAvatar(String str) {
            copyOnWrite();
            ((Profile) this.instance).setAvatar(str);
            return this;
        }

        public Builder setAvatarBytes(gva gvaVar) {
            copyOnWrite();
            ((Profile) this.instance).setAvatarBytes(gvaVar);
            return this;
        }

        public Builder setColor(Int32Value int32Value) {
            copyOnWrite();
            ((Profile) this.instance).setColor(int32Value);
            return this;
        }

        public Builder setDateOfBirth(String str) {
            copyOnWrite();
            ((Profile) this.instance).setDateOfBirth(str);
            return this;
        }

        public Builder setDateOfBirthBytes(gva gvaVar) {
            copyOnWrite();
            ((Profile) this.instance).setDateOfBirthBytes(gvaVar);
            return this;
        }

        public Builder setName(String str) {
            copyOnWrite();
            ((Profile) this.instance).setName(str);
            return this;
        }

        public Builder setNameBytes(gva gvaVar) {
            copyOnWrite();
            ((Profile) this.instance).setNameBytes(gvaVar);
            return this;
        }

        public Builder setV2Avatar(Avatar avatar) {
            copyOnWrite();
            ((Profile) this.instance).setV2Avatar(avatar);
            return this;
        }

        public Builder setV2AvatarValue(int i) {
            copyOnWrite();
            ((Profile) this.instance).setV2AvatarValue(i);
            return this;
        }

        private Builder() {
            super(Profile.DEFAULT_INSTANCE);
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

        public Builder setColor(k350 k350Var) {
            copyOnWrite();
            ((Profile) this.instance).setColor((Int32Value) k350Var.build());
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
        Profile profile = new Profile();
        DEFAULT_INSTANCE = profile;
        AbstractC0269h.registerDefaultInstance(Profile.class, profile);
    }

    private Profile() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAllowedInMusicApp() {
        this.allowedInMusicApp_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAvatar() {
        this.avatar_ = getDefaultInstance().getAvatar();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearColor() {
        this.color_ = null;
        this.bitField0_ &= -3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDateOfBirth() {
        this.dateOfBirth_ = getDefaultInstance().getDateOfBirth();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearName() {
        this.name_ = getDefaultInstance().getName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearV2Avatar() {
        this.bitField0_ &= -2;
        this.v2Avatar_ = 0;
    }

    public static Profile getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeColor(Int32Value int32Value) {
        int32Value.getClass();
        Int32Value int32Value2 = this.color_;
        if (int32Value2 == null || int32Value2 == Int32Value.m1943p()) {
            this.color_ = int32Value;
        } else {
            this.color_ = (Int32Value) ((k350) Int32Value.m1945r(this.color_).mergeFrom((AbstractC0269h) int32Value)).buildPartial();
        }
        this.bitField0_ |= 2;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static Profile parseDelimitedFrom(InputStream inputStream) {
        return (Profile) AbstractC0269h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Profile parseFrom(ByteBuffer byteBuffer) {
        return (Profile) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAllowedInMusicApp(boolean z) {
        this.allowedInMusicApp_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAvatar(String str) {
        str.getClass();
        this.avatar_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAvatarBytes(gva gvaVar) {
        AbstractC2118m8.checkByteStringIsUtf8(gvaVar);
        this.avatar_ = gvaVar.m45892u();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setColor(Int32Value int32Value) {
        int32Value.getClass();
        this.color_ = int32Value;
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDateOfBirth(String str) {
        str.getClass();
        this.dateOfBirth_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDateOfBirthBytes(gva gvaVar) {
        AbstractC2118m8.checkByteStringIsUtf8(gvaVar);
        this.dateOfBirth_ = gvaVar.m45892u();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setName(String str) {
        str.getClass();
        this.name_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNameBytes(gva gvaVar) {
        AbstractC2118m8.checkByteStringIsUtf8(gvaVar);
        this.name_ = gvaVar.m45892u();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setV2Avatar(Avatar avatar) {
        this.v2Avatar_ = avatar.getNumber();
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setV2AvatarValue(int i) {
        this.bitField0_ |= 1;
        this.v2Avatar_ = i;
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003\u0007\u0004Ȉ\u0005ဌ\u0000\u0006ဉ\u0001", new Object[]{"bitField0_", "name_", "dateOfBirth_", "allowedInMusicApp_", "avatar_", "v2Avatar_", "color_"});
        }
        if (iOrdinal == 3) {
            return new Profile();
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
        synchronized (Profile.class) {
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

    @Override // com.spotify.kidsview.p091v1.proto.ProfileOrBuilder
    public boolean getAllowedInMusicApp() {
        return this.allowedInMusicApp_;
    }

    @Override // com.spotify.kidsview.p091v1.proto.ProfileOrBuilder
    public String getAvatar() {
        return this.avatar_;
    }

    @Override // com.spotify.kidsview.p091v1.proto.ProfileOrBuilder
    public gva getAvatarBytes() {
        return gva.m45888f(this.avatar_);
    }

    @Override // com.spotify.kidsview.p091v1.proto.ProfileOrBuilder
    public Int32Value getColor() {
        Int32Value int32Value = this.color_;
        return int32Value == null ? Int32Value.m1943p() : int32Value;
    }

    @Override // com.spotify.kidsview.p091v1.proto.ProfileOrBuilder
    public String getDateOfBirth() {
        return this.dateOfBirth_;
    }

    @Override // com.spotify.kidsview.p091v1.proto.ProfileOrBuilder
    public gva getDateOfBirthBytes() {
        return gva.m45888f(this.dateOfBirth_);
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.sre0
    public /* bridge */ /* synthetic */ pre0 getDefaultInstanceForType() {
        return getDefaultInstanceForType();
    }

    @Override // com.spotify.kidsview.p091v1.proto.ProfileOrBuilder
    public String getName() {
        return this.name_;
    }

    @Override // com.spotify.kidsview.p091v1.proto.ProfileOrBuilder
    public gva getNameBytes() {
        return gva.m45888f(this.name_);
    }

    @Override // com.spotify.kidsview.p091v1.proto.ProfileOrBuilder
    public Avatar getV2Avatar() {
        Avatar avatarForNumber = Avatar.forNumber(this.v2Avatar_);
        return avatarForNumber == null ? Avatar.UNRECOGNIZED : avatarForNumber;
    }

    @Override // com.spotify.kidsview.p091v1.proto.ProfileOrBuilder
    public int getV2AvatarValue() {
        return this.v2Avatar_;
    }

    @Override // com.spotify.kidsview.p091v1.proto.ProfileOrBuilder
    public boolean hasColor() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override // com.spotify.kidsview.p091v1.proto.ProfileOrBuilder
    public boolean hasV2Avatar() {
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

    public static Builder newBuilder(Profile profile) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(profile);
    }

    public static Profile parseDelimitedFrom(InputStream inputStream, aux auxVar) {
        return (Profile) AbstractC0269h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, auxVar);
    }

    public static Profile parseFrom(ByteBuffer byteBuffer, aux auxVar) {
        return (Profile) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, byteBuffer, auxVar);
    }

    public static Profile parseFrom(gva gvaVar) {
        return (Profile) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, gvaVar);
    }

    public static Profile parseFrom(gva gvaVar, aux auxVar) {
        return (Profile) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, gvaVar, auxVar);
    }

    public static Profile parseFrom(byte[] bArr) {
        return (Profile) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Profile parseFrom(byte[] bArr, aux auxVar) {
        return (Profile) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr, auxVar);
    }

    public static Profile parseFrom(InputStream inputStream) {
        return (Profile) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Profile parseFrom(InputStream inputStream, aux auxVar) {
        return (Profile) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, inputStream, auxVar);
    }

    public static Profile parseFrom(owe oweVar) {
        return (Profile) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, oweVar);
    }

    public static Profile parseFrom(owe oweVar, aux auxVar) {
        return (Profile) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, oweVar, auxVar);
    }
}
