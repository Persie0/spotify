package com.spotify.profileprivacy.proto.p132v1;

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

/* JADX INFO: loaded from: classes10.dex */
public final class GetProfilePrivacyResponse extends AbstractC0269h implements GetProfilePrivacyResponseOrBuilder {
    public static final int ALLOW_FOLLOWS_FIELD_NUMBER = 3;
    private static final GetProfilePrivacyResponse DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER = null;
    public static final int SHOW_FOLLOWS_FIELD_NUMBER = 4;
    public static final int SHOW_PUBLISHED_PLAYLISTS_FIELD_NUMBER = 5;
    private boolean allowFollows_;
    private boolean showFollows_;
    private boolean showPublishedPlaylists_;

    /* JADX INFO: renamed from: com.spotify.profileprivacy.proto.v1.GetProfilePrivacyResponse$1 */
    public static /* synthetic */ class C12471 {

        /* JADX INFO: renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f6569xa1df5c61;

        static {
            int[] iArr = new int[z110.values().length];
            f6569xa1df5c61 = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f6569xa1df5c61[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f6569xa1df5c61[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f6569xa1df5c61[5] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f6569xa1df5c61[6] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f6569xa1df5c61[0] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f6569xa1df5c61[1] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class Builder extends AbstractC0268g implements GetProfilePrivacyResponseOrBuilder {
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
            ((GetProfilePrivacyResponse) this.instance).clearAllowFollows();
            return this;
        }

        public Builder clearShowFollows() {
            copyOnWrite();
            ((GetProfilePrivacyResponse) this.instance).clearShowFollows();
            return this;
        }

        public Builder clearShowPublishedPlaylists() {
            copyOnWrite();
            ((GetProfilePrivacyResponse) this.instance).clearShowPublishedPlaylists();
            return this;
        }

        @Override // com.google.protobuf.AbstractC0268g
        /* JADX INFO: renamed from: clone */
        public /* bridge */ /* synthetic */ Object mo98328clone() {
            return super.mo98326clone();
        }

        @Override // com.spotify.profileprivacy.proto.p132v1.GetProfilePrivacyResponseOrBuilder
        public boolean getAllowFollows() {
            return ((GetProfilePrivacyResponse) this.instance).getAllowFollows();
        }

        @Override // com.google.protobuf.AbstractC0268g, p204p.sre0
        public /* bridge */ /* synthetic */ pre0 getDefaultInstanceForType() {
            return super.getDefaultInstanceForType();
        }

        @Override // com.spotify.profileprivacy.proto.p132v1.GetProfilePrivacyResponseOrBuilder
        public boolean getShowFollows() {
            return ((GetProfilePrivacyResponse) this.instance).getShowFollows();
        }

        @Override // com.spotify.profileprivacy.proto.p132v1.GetProfilePrivacyResponseOrBuilder
        public boolean getShowPublishedPlaylists() {
            return ((GetProfilePrivacyResponse) this.instance).getShowPublishedPlaylists();
        }

        @Override // com.google.protobuf.AbstractC0268g, p204p.AbstractC2081l8
        public /* bridge */ /* synthetic */ AbstractC2081l8 internalMergeFrom(AbstractC2118m8 abstractC2118m8) {
            return super.internalMergeFrom((AbstractC0269h) abstractC2118m8);
        }

        @Override // com.google.protobuf.AbstractC0268g, p204p.AbstractC2081l8, p204p.ore0
        public /* bridge */ /* synthetic */ AbstractC2081l8 mergeFrom(owe oweVar, aux auxVar) {
            return super.mergeFrom(oweVar, auxVar);
        }

        public Builder setAllowFollows(boolean z) {
            copyOnWrite();
            ((GetProfilePrivacyResponse) this.instance).setAllowFollows(z);
            return this;
        }

        public Builder setShowFollows(boolean z) {
            copyOnWrite();
            ((GetProfilePrivacyResponse) this.instance).setShowFollows(z);
            return this;
        }

        public Builder setShowPublishedPlaylists(boolean z) {
            copyOnWrite();
            ((GetProfilePrivacyResponse) this.instance).setShowPublishedPlaylists(z);
            return this;
        }

        private Builder() {
            super(GetProfilePrivacyResponse.DEFAULT_INSTANCE);
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
        GetProfilePrivacyResponse getProfilePrivacyResponse = new GetProfilePrivacyResponse();
        DEFAULT_INSTANCE = getProfilePrivacyResponse;
        AbstractC0269h.registerDefaultInstance(GetProfilePrivacyResponse.class, getProfilePrivacyResponse);
    }

    private GetProfilePrivacyResponse() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAllowFollows() {
        this.allowFollows_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearShowFollows() {
        this.showFollows_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearShowPublishedPlaylists() {
        this.showPublishedPlaylists_ = false;
    }

    public static GetProfilePrivacyResponse getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static GetProfilePrivacyResponse parseDelimitedFrom(InputStream inputStream) {
        return (GetProfilePrivacyResponse) AbstractC0269h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static GetProfilePrivacyResponse parseFrom(ByteBuffer byteBuffer) {
        return (GetProfilePrivacyResponse) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAllowFollows(boolean z) {
        this.allowFollows_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setShowFollows(boolean z) {
        this.showFollows_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setShowPublishedPlaylists(boolean z) {
        this.showPublishedPlaylists_ = z;
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0003\u0005\u0003\u0000\u0000\u0000\u0003\u0007\u0004\u0007\u0005\u0007", new Object[]{"allowFollows_", "showFollows_", "showPublishedPlaylists_"});
        }
        if (iOrdinal == 3) {
            return new GetProfilePrivacyResponse();
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
        synchronized (GetProfilePrivacyResponse.class) {
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

    @Override // com.spotify.profileprivacy.proto.p132v1.GetProfilePrivacyResponseOrBuilder
    public boolean getAllowFollows() {
        return this.allowFollows_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.sre0
    public /* bridge */ /* synthetic */ pre0 getDefaultInstanceForType() {
        return getDefaultInstanceForType();
    }

    @Override // com.spotify.profileprivacy.proto.p132v1.GetProfilePrivacyResponseOrBuilder
    public boolean getShowFollows() {
        return this.showFollows_;
    }

    @Override // com.spotify.profileprivacy.proto.p132v1.GetProfilePrivacyResponseOrBuilder
    public boolean getShowPublishedPlaylists() {
        return this.showPublishedPlaylists_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }

    public static Builder newBuilder(GetProfilePrivacyResponse getProfilePrivacyResponse) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(getProfilePrivacyResponse);
    }

    public static GetProfilePrivacyResponse parseDelimitedFrom(InputStream inputStream, aux auxVar) {
        return (GetProfilePrivacyResponse) AbstractC0269h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, auxVar);
    }

    public static GetProfilePrivacyResponse parseFrom(ByteBuffer byteBuffer, aux auxVar) {
        return (GetProfilePrivacyResponse) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, byteBuffer, auxVar);
    }

    public static GetProfilePrivacyResponse parseFrom(gva gvaVar) {
        return (GetProfilePrivacyResponse) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, gvaVar);
    }

    public static GetProfilePrivacyResponse parseFrom(gva gvaVar, aux auxVar) {
        return (GetProfilePrivacyResponse) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, gvaVar, auxVar);
    }

    public static GetProfilePrivacyResponse parseFrom(byte[] bArr) {
        return (GetProfilePrivacyResponse) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static GetProfilePrivacyResponse parseFrom(byte[] bArr, aux auxVar) {
        return (GetProfilePrivacyResponse) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr, auxVar);
    }

    public static GetProfilePrivacyResponse parseFrom(InputStream inputStream) {
        return (GetProfilePrivacyResponse) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static GetProfilePrivacyResponse parseFrom(InputStream inputStream, aux auxVar) {
        return (GetProfilePrivacyResponse) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, inputStream, auxVar);
    }

    public static GetProfilePrivacyResponse parseFrom(owe oweVar) {
        return (GetProfilePrivacyResponse) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, oweVar);
    }

    public static GetProfilePrivacyResponse parseFrom(owe oweVar, aux auxVar) {
        return (GetProfilePrivacyResponse) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, oweVar, auxVar);
    }
}
