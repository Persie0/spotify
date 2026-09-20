package com.spotify.profileprivacy.proto.p132v1;

import com.google.protobuf.AbstractC0268g;
import com.google.protobuf.AbstractC0269h;
import com.google.protobuf.FieldMask;
import java.io.InputStream;
import java.nio.ByteBuffer;
import p204p.AbstractC2081l8;
import p204p.AbstractC2118m8;
import p204p.aux;
import p204p.gva;
import p204p.juy;
import p204p.ore0;
import p204p.owe;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.z110;

/* JADX INFO: loaded from: classes10.dex */
public final class SetProfilePrivacyRequest extends AbstractC0269h implements SetProfilePrivacyRequestOrBuilder {
    public static final int ALLOW_FOLLOWS_FIELD_NUMBER = 4;
    private static final SetProfilePrivacyRequest DEFAULT_INSTANCE;
    public static final int MASK_FIELD_NUMBER = 3;
    private static volatile r2n0 PARSER = null;
    public static final int SHOW_FOLLOWS_FIELD_NUMBER = 5;
    public static final int SHOW_PUBLISHED_PLAYLISTS_FIELD_NUMBER = 6;
    public static final int USERNAME_FIELD_NUMBER = 1;
    public static final int USER_ID_FIELD_NUMBER = 2;
    private boolean allowFollows_;
    private int bitField0_;
    private FieldMask mask_;
    private boolean showFollows_;
    private boolean showPublishedPlaylists_;
    private int userCase_ = 0;
    private Object user_;

    /* JADX INFO: renamed from: com.spotify.profileprivacy.proto.v1.SetProfilePrivacyRequest$1 */
    public static /* synthetic */ class C12521 {

        /* JADX INFO: renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f6574xa1df5c61;

        static {
            int[] iArr = new int[z110.values().length];
            f6574xa1df5c61 = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f6574xa1df5c61[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f6574xa1df5c61[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f6574xa1df5c61[5] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f6574xa1df5c61[6] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f6574xa1df5c61[0] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f6574xa1df5c61[1] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class Builder extends AbstractC0268g implements SetProfilePrivacyRequestOrBuilder {
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

        public Builder clearAllowFollows() {
            copyOnWrite();
            ((SetProfilePrivacyRequest) this.instance).clearAllowFollows();
            return this;
        }

        public Builder clearMask() {
            copyOnWrite();
            ((SetProfilePrivacyRequest) this.instance).clearMask();
            return this;
        }

        public Builder clearShowFollows() {
            copyOnWrite();
            ((SetProfilePrivacyRequest) this.instance).clearShowFollows();
            return this;
        }

        public Builder clearShowPublishedPlaylists() {
            copyOnWrite();
            ((SetProfilePrivacyRequest) this.instance).clearShowPublishedPlaylists();
            return this;
        }

        public Builder clearUser() {
            copyOnWrite();
            ((SetProfilePrivacyRequest) this.instance).clearUser();
            return this;
        }

        public Builder clearUserId() {
            copyOnWrite();
            ((SetProfilePrivacyRequest) this.instance).clearUserId();
            return this;
        }

        public Builder clearUsername() {
            copyOnWrite();
            ((SetProfilePrivacyRequest) this.instance).clearUsername();
            return this;
        }

        @Override // com.google.protobuf.AbstractC0268g
        /* JADX INFO: renamed from: clone */
        public /* bridge */ /* synthetic */ Object mo98327clone() {
            return super.mo98326clone();
        }

        @Override // com.spotify.profileprivacy.proto.p132v1.SetProfilePrivacyRequestOrBuilder
        public boolean getAllowFollows() {
            return ((SetProfilePrivacyRequest) this.instance).getAllowFollows();
        }

        @Override // com.google.protobuf.AbstractC0268g, p204p.sre0
        public /* bridge */ /* synthetic */ pre0 getDefaultInstanceForType() {
            return super.getDefaultInstanceForType();
        }

        @Override // com.spotify.profileprivacy.proto.p132v1.SetProfilePrivacyRequestOrBuilder
        public FieldMask getMask() {
            return ((SetProfilePrivacyRequest) this.instance).getMask();
        }

        @Override // com.spotify.profileprivacy.proto.p132v1.SetProfilePrivacyRequestOrBuilder
        public boolean getShowFollows() {
            return ((SetProfilePrivacyRequest) this.instance).getShowFollows();
        }

        @Override // com.spotify.profileprivacy.proto.p132v1.SetProfilePrivacyRequestOrBuilder
        public boolean getShowPublishedPlaylists() {
            return ((SetProfilePrivacyRequest) this.instance).getShowPublishedPlaylists();
        }

        @Override // com.spotify.profileprivacy.proto.p132v1.SetProfilePrivacyRequestOrBuilder
        public UserCase getUserCase() {
            return ((SetProfilePrivacyRequest) this.instance).getUserCase();
        }

        @Override // com.spotify.profileprivacy.proto.p132v1.SetProfilePrivacyRequestOrBuilder
        public String getUserId() {
            return ((SetProfilePrivacyRequest) this.instance).getUserId();
        }

        @Override // com.spotify.profileprivacy.proto.p132v1.SetProfilePrivacyRequestOrBuilder
        public gva getUserIdBytes() {
            return ((SetProfilePrivacyRequest) this.instance).getUserIdBytes();
        }

        @Override // com.spotify.profileprivacy.proto.p132v1.SetProfilePrivacyRequestOrBuilder
        public String getUsername() {
            return ((SetProfilePrivacyRequest) this.instance).getUsername();
        }

        @Override // com.spotify.profileprivacy.proto.p132v1.SetProfilePrivacyRequestOrBuilder
        public gva getUsernameBytes() {
            return ((SetProfilePrivacyRequest) this.instance).getUsernameBytes();
        }

        @Override // com.spotify.profileprivacy.proto.p132v1.SetProfilePrivacyRequestOrBuilder
        public boolean hasAllowFollows() {
            return ((SetProfilePrivacyRequest) this.instance).hasAllowFollows();
        }

        @Override // com.spotify.profileprivacy.proto.p132v1.SetProfilePrivacyRequestOrBuilder
        public boolean hasMask() {
            return ((SetProfilePrivacyRequest) this.instance).hasMask();
        }

        @Override // com.spotify.profileprivacy.proto.p132v1.SetProfilePrivacyRequestOrBuilder
        public boolean hasShowFollows() {
            return ((SetProfilePrivacyRequest) this.instance).hasShowFollows();
        }

        @Override // com.spotify.profileprivacy.proto.p132v1.SetProfilePrivacyRequestOrBuilder
        public boolean hasShowPublishedPlaylists() {
            return ((SetProfilePrivacyRequest) this.instance).hasShowPublishedPlaylists();
        }

        @Override // com.spotify.profileprivacy.proto.p132v1.SetProfilePrivacyRequestOrBuilder
        public boolean hasUserId() {
            return ((SetProfilePrivacyRequest) this.instance).hasUserId();
        }

        @Override // com.spotify.profileprivacy.proto.p132v1.SetProfilePrivacyRequestOrBuilder
        public boolean hasUsername() {
            return ((SetProfilePrivacyRequest) this.instance).hasUsername();
        }

        @Override // com.google.protobuf.AbstractC0268g, p204p.AbstractC2081l8
        public /* bridge */ /* synthetic */ AbstractC2081l8 internalMergeFrom(AbstractC2118m8 abstractC2118m8) {
            return super.internalMergeFrom((AbstractC0269h) abstractC2118m8);
        }

        @Override // com.google.protobuf.AbstractC0268g, p204p.AbstractC2081l8, p204p.ore0
        public /* bridge */ /* synthetic */ AbstractC2081l8 mergeFrom(owe oweVar, aux auxVar) {
            return super.mergeFrom(oweVar, auxVar);
        }

        public Builder mergeMask(FieldMask fieldMask) {
            copyOnWrite();
            ((SetProfilePrivacyRequest) this.instance).mergeMask(fieldMask);
            return this;
        }

        public Builder setAllowFollows(boolean z) {
            copyOnWrite();
            ((SetProfilePrivacyRequest) this.instance).setAllowFollows(z);
            return this;
        }

        public Builder setMask(FieldMask fieldMask) {
            copyOnWrite();
            ((SetProfilePrivacyRequest) this.instance).setMask(fieldMask);
            return this;
        }

        public Builder setShowFollows(boolean z) {
            copyOnWrite();
            ((SetProfilePrivacyRequest) this.instance).setShowFollows(z);
            return this;
        }

        public Builder setShowPublishedPlaylists(boolean z) {
            copyOnWrite();
            ((SetProfilePrivacyRequest) this.instance).setShowPublishedPlaylists(z);
            return this;
        }

        public Builder setUserId(String str) {
            copyOnWrite();
            ((SetProfilePrivacyRequest) this.instance).setUserId(str);
            return this;
        }

        public Builder setUserIdBytes(gva gvaVar) {
            copyOnWrite();
            ((SetProfilePrivacyRequest) this.instance).setUserIdBytes(gvaVar);
            return this;
        }

        public Builder setUsername(String str) {
            copyOnWrite();
            ((SetProfilePrivacyRequest) this.instance).setUsername(str);
            return this;
        }

        public Builder setUsernameBytes(gva gvaVar) {
            copyOnWrite();
            ((SetProfilePrivacyRequest) this.instance).setUsernameBytes(gvaVar);
            return this;
        }

        private Builder() {
            super(SetProfilePrivacyRequest.DEFAULT_INSTANCE);
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

        public Builder setMask(juy juyVar) {
            copyOnWrite();
            ((SetProfilePrivacyRequest) this.instance).setMask((FieldMask) juyVar.build());
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

    public enum UserCase {
        USERNAME(1),
        USER_ID(2),
        USER_NOT_SET(0);

        private final int value;

        UserCase(int i) {
            this.value = i;
        }

        public static UserCase forNumber(int i) {
            if (i == 0) {
                return USER_NOT_SET;
            }
            if (i == 1) {
                return USERNAME;
            }
            if (i != 2) {
                return null;
            }
            return USER_ID;
        }

        public int getNumber() {
            return this.value;
        }

        @Deprecated
        public static UserCase valueOf(int i) {
            return forNumber(i);
        }
    }

    static {
        SetProfilePrivacyRequest setProfilePrivacyRequest = new SetProfilePrivacyRequest();
        DEFAULT_INSTANCE = setProfilePrivacyRequest;
        AbstractC0269h.registerDefaultInstance(SetProfilePrivacyRequest.class, setProfilePrivacyRequest);
    }

    private SetProfilePrivacyRequest() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAllowFollows() {
        this.bitField0_ &= -3;
        this.allowFollows_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMask() {
        this.mask_ = null;
        this.bitField0_ &= -2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearShowFollows() {
        this.bitField0_ &= -5;
        this.showFollows_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearShowPublishedPlaylists() {
        this.bitField0_ &= -9;
        this.showPublishedPlaylists_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUser() {
        this.userCase_ = 0;
        this.user_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUserId() {
        if (this.userCase_ == 2) {
            this.userCase_ = 0;
            this.user_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUsername() {
        if (this.userCase_ == 1) {
            this.userCase_ = 0;
            this.user_ = null;
        }
    }

    public static SetProfilePrivacyRequest getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeMask(FieldMask fieldMask) {
        fieldMask.getClass();
        FieldMask fieldMask2 = this.mask_;
        if (fieldMask2 == null || fieldMask2 == FieldMask.m1938o()) {
            this.mask_ = fieldMask;
        } else {
            this.mask_ = (FieldMask) ((juy) FieldMask.m1940q(this.mask_).mergeFrom((AbstractC0269h) fieldMask)).buildPartial();
        }
        this.bitField0_ |= 1;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static SetProfilePrivacyRequest parseDelimitedFrom(InputStream inputStream) {
        return (SetProfilePrivacyRequest) AbstractC0269h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static SetProfilePrivacyRequest parseFrom(ByteBuffer byteBuffer) {
        return (SetProfilePrivacyRequest) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAllowFollows(boolean z) {
        this.bitField0_ |= 2;
        this.allowFollows_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMask(FieldMask fieldMask) {
        fieldMask.getClass();
        this.mask_ = fieldMask;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setShowFollows(boolean z) {
        this.bitField0_ |= 4;
        this.showFollows_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setShowPublishedPlaylists(boolean z) {
        this.bitField0_ |= 8;
        this.showPublishedPlaylists_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUserId(String str) {
        str.getClass();
        this.userCase_ = 2;
        this.user_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUserIdBytes(gva gvaVar) {
        AbstractC2118m8.checkByteStringIsUtf8(gvaVar);
        this.user_ = gvaVar.m45892u();
        this.userCase_ = 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUsername(String str) {
        str.getClass();
        this.userCase_ = 1;
        this.user_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUsernameBytes(gva gvaVar) {
        AbstractC2118m8.checkByteStringIsUtf8(gvaVar);
        this.user_ = gvaVar.m45892u();
        this.userCase_ = 1;
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0001\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001Ȼ\u0000\u0002Ȼ\u0000\u0003ဉ\u0000\u0004ဇ\u0001\u0005ဇ\u0002\u0006ဇ\u0003", new Object[]{"user_", "userCase_", "bitField0_", "mask_", "allowFollows_", "showFollows_", "showPublishedPlaylists_"});
        }
        if (iOrdinal == 3) {
            return new SetProfilePrivacyRequest();
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
        synchronized (SetProfilePrivacyRequest.class) {
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

    @Override // com.spotify.profileprivacy.proto.p132v1.SetProfilePrivacyRequestOrBuilder
    public boolean getAllowFollows() {
        return this.allowFollows_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.sre0
    public /* bridge */ /* synthetic */ pre0 getDefaultInstanceForType() {
        return getDefaultInstanceForType();
    }

    @Override // com.spotify.profileprivacy.proto.p132v1.SetProfilePrivacyRequestOrBuilder
    public FieldMask getMask() {
        FieldMask fieldMask = this.mask_;
        return fieldMask == null ? FieldMask.m1938o() : fieldMask;
    }

    @Override // com.spotify.profileprivacy.proto.p132v1.SetProfilePrivacyRequestOrBuilder
    public boolean getShowFollows() {
        return this.showFollows_;
    }

    @Override // com.spotify.profileprivacy.proto.p132v1.SetProfilePrivacyRequestOrBuilder
    public boolean getShowPublishedPlaylists() {
        return this.showPublishedPlaylists_;
    }

    @Override // com.spotify.profileprivacy.proto.p132v1.SetProfilePrivacyRequestOrBuilder
    public UserCase getUserCase() {
        return UserCase.forNumber(this.userCase_);
    }

    @Override // com.spotify.profileprivacy.proto.p132v1.SetProfilePrivacyRequestOrBuilder
    public String getUserId() {
        return this.userCase_ == 2 ? (String) this.user_ : "";
    }

    @Override // com.spotify.profileprivacy.proto.p132v1.SetProfilePrivacyRequestOrBuilder
    public gva getUserIdBytes() {
        return gva.m45888f(this.userCase_ == 2 ? (String) this.user_ : "");
    }

    @Override // com.spotify.profileprivacy.proto.p132v1.SetProfilePrivacyRequestOrBuilder
    public String getUsername() {
        return this.userCase_ == 1 ? (String) this.user_ : "";
    }

    @Override // com.spotify.profileprivacy.proto.p132v1.SetProfilePrivacyRequestOrBuilder
    public gva getUsernameBytes() {
        return gva.m45888f(this.userCase_ == 1 ? (String) this.user_ : "");
    }

    @Override // com.spotify.profileprivacy.proto.p132v1.SetProfilePrivacyRequestOrBuilder
    public boolean hasAllowFollows() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override // com.spotify.profileprivacy.proto.p132v1.SetProfilePrivacyRequestOrBuilder
    public boolean hasMask() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // com.spotify.profileprivacy.proto.p132v1.SetProfilePrivacyRequestOrBuilder
    public boolean hasShowFollows() {
        return (this.bitField0_ & 4) != 0;
    }

    @Override // com.spotify.profileprivacy.proto.p132v1.SetProfilePrivacyRequestOrBuilder
    public boolean hasShowPublishedPlaylists() {
        return (this.bitField0_ & 8) != 0;
    }

    @Override // com.spotify.profileprivacy.proto.p132v1.SetProfilePrivacyRequestOrBuilder
    public boolean hasUserId() {
        return this.userCase_ == 2;
    }

    @Override // com.spotify.profileprivacy.proto.p132v1.SetProfilePrivacyRequestOrBuilder
    public boolean hasUsername() {
        return this.userCase_ == 1;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }

    public static Builder newBuilder(SetProfilePrivacyRequest setProfilePrivacyRequest) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(setProfilePrivacyRequest);
    }

    public static SetProfilePrivacyRequest parseDelimitedFrom(InputStream inputStream, aux auxVar) {
        return (SetProfilePrivacyRequest) AbstractC0269h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, auxVar);
    }

    public static SetProfilePrivacyRequest parseFrom(ByteBuffer byteBuffer, aux auxVar) {
        return (SetProfilePrivacyRequest) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, byteBuffer, auxVar);
    }

    public static SetProfilePrivacyRequest parseFrom(gva gvaVar) {
        return (SetProfilePrivacyRequest) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, gvaVar);
    }

    public static SetProfilePrivacyRequest parseFrom(gva gvaVar, aux auxVar) {
        return (SetProfilePrivacyRequest) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, gvaVar, auxVar);
    }

    public static SetProfilePrivacyRequest parseFrom(byte[] bArr) {
        return (SetProfilePrivacyRequest) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static SetProfilePrivacyRequest parseFrom(byte[] bArr, aux auxVar) {
        return (SetProfilePrivacyRequest) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr, auxVar);
    }

    public static SetProfilePrivacyRequest parseFrom(InputStream inputStream) {
        return (SetProfilePrivacyRequest) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static SetProfilePrivacyRequest parseFrom(InputStream inputStream, aux auxVar) {
        return (SetProfilePrivacyRequest) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, inputStream, auxVar);
    }

    public static SetProfilePrivacyRequest parseFrom(owe oweVar) {
        return (SetProfilePrivacyRequest) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, oweVar);
    }

    public static SetProfilePrivacyRequest parseFrom(owe oweVar, aux auxVar) {
        return (SetProfilePrivacyRequest) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, oweVar, auxVar);
    }
}
