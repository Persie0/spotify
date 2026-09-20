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
public final class ParentalControls extends AbstractC0269h implements ParentalControlsOrBuilder {
    public static final int ALLOW_EXPLICIT_CONTENT_FIELD_NUMBER = 1;
    public static final int ALLOW_VIDEO_FIELD_NUMBER = 2;
    public static final int DATE_OF_BIRTH_FIELD_NUMBER = 4;
    public static final int DATE_OF_BIRTH_MAX_DATE_FIELD_NUMBER = 6;
    public static final int DATE_OF_BIRTH_MIN_DATE_FIELD_NUMBER = 5;
    private static final ParentalControls DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER;
    private boolean allowExplicitContent_;
    private boolean allowVideo_;
    private String dateOfBirth_ = "";
    private String dateOfBirthMinDate_ = "";
    private String dateOfBirthMaxDate_ = "";

    /* JADX INFO: renamed from: com.spotify.kidsview.v1.proto.ParentalControls$1 */
    public static /* synthetic */ class C08211 {

        /* JADX INFO: renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f4996xa1df5c61;

        static {
            int[] iArr = new int[z110.values().length];
            f4996xa1df5c61 = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f4996xa1df5c61[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f4996xa1df5c61[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f4996xa1df5c61[5] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f4996xa1df5c61[6] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f4996xa1df5c61[0] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f4996xa1df5c61[1] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class Builder extends AbstractC0268g implements ParentalControlsOrBuilder {
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

        public Builder clearAllowExplicitContent() {
            copyOnWrite();
            ((ParentalControls) this.instance).clearAllowExplicitContent();
            return this;
        }

        public Builder clearAllowVideo() {
            copyOnWrite();
            ((ParentalControls) this.instance).clearAllowVideo();
            return this;
        }

        public Builder clearDateOfBirth() {
            copyOnWrite();
            ((ParentalControls) this.instance).clearDateOfBirth();
            return this;
        }

        public Builder clearDateOfBirthMaxDate() {
            copyOnWrite();
            ((ParentalControls) this.instance).clearDateOfBirthMaxDate();
            return this;
        }

        public Builder clearDateOfBirthMinDate() {
            copyOnWrite();
            ((ParentalControls) this.instance).clearDateOfBirthMinDate();
            return this;
        }

        @Override // com.google.protobuf.AbstractC0268g
        /* JADX INFO: renamed from: clone */
        public /* bridge */ /* synthetic */ Object mo98328clone() {
            return super.mo98326clone();
        }

        @Override // com.spotify.kidsview.p091v1.proto.ParentalControlsOrBuilder
        public boolean getAllowExplicitContent() {
            return ((ParentalControls) this.instance).getAllowExplicitContent();
        }

        @Override // com.spotify.kidsview.p091v1.proto.ParentalControlsOrBuilder
        public boolean getAllowVideo() {
            return ((ParentalControls) this.instance).getAllowVideo();
        }

        @Override // com.spotify.kidsview.p091v1.proto.ParentalControlsOrBuilder
        public String getDateOfBirth() {
            return ((ParentalControls) this.instance).getDateOfBirth();
        }

        @Override // com.spotify.kidsview.p091v1.proto.ParentalControlsOrBuilder
        public gva getDateOfBirthBytes() {
            return ((ParentalControls) this.instance).getDateOfBirthBytes();
        }

        @Override // com.spotify.kidsview.p091v1.proto.ParentalControlsOrBuilder
        public String getDateOfBirthMaxDate() {
            return ((ParentalControls) this.instance).getDateOfBirthMaxDate();
        }

        @Override // com.spotify.kidsview.p091v1.proto.ParentalControlsOrBuilder
        public gva getDateOfBirthMaxDateBytes() {
            return ((ParentalControls) this.instance).getDateOfBirthMaxDateBytes();
        }

        @Override // com.spotify.kidsview.p091v1.proto.ParentalControlsOrBuilder
        public String getDateOfBirthMinDate() {
            return ((ParentalControls) this.instance).getDateOfBirthMinDate();
        }

        @Override // com.spotify.kidsview.p091v1.proto.ParentalControlsOrBuilder
        public gva getDateOfBirthMinDateBytes() {
            return ((ParentalControls) this.instance).getDateOfBirthMinDateBytes();
        }

        @Override // com.google.protobuf.AbstractC0268g, p204p.sre0
        public /* bridge */ /* synthetic */ pre0 getDefaultInstanceForType() {
            return super.getDefaultInstanceForType();
        }

        @Override // com.google.protobuf.AbstractC0268g, p204p.AbstractC2081l8
        public /* bridge */ /* synthetic */ AbstractC2081l8 internalMergeFrom(AbstractC2118m8 abstractC2118m8) {
            return super.internalMergeFrom((AbstractC0269h) abstractC2118m8);
        }

        @Override // com.google.protobuf.AbstractC0268g, p204p.AbstractC2081l8, p204p.ore0
        public /* bridge */ /* synthetic */ AbstractC2081l8 mergeFrom(owe oweVar, aux auxVar) {
            return super.mergeFrom(oweVar, auxVar);
        }

        public Builder setAllowExplicitContent(boolean z) {
            copyOnWrite();
            ((ParentalControls) this.instance).setAllowExplicitContent(z);
            return this;
        }

        public Builder setAllowVideo(boolean z) {
            copyOnWrite();
            ((ParentalControls) this.instance).setAllowVideo(z);
            return this;
        }

        public Builder setDateOfBirth(String str) {
            copyOnWrite();
            ((ParentalControls) this.instance).setDateOfBirth(str);
            return this;
        }

        public Builder setDateOfBirthBytes(gva gvaVar) {
            copyOnWrite();
            ((ParentalControls) this.instance).setDateOfBirthBytes(gvaVar);
            return this;
        }

        public Builder setDateOfBirthMaxDate(String str) {
            copyOnWrite();
            ((ParentalControls) this.instance).setDateOfBirthMaxDate(str);
            return this;
        }

        public Builder setDateOfBirthMaxDateBytes(gva gvaVar) {
            copyOnWrite();
            ((ParentalControls) this.instance).setDateOfBirthMaxDateBytes(gvaVar);
            return this;
        }

        public Builder setDateOfBirthMinDate(String str) {
            copyOnWrite();
            ((ParentalControls) this.instance).setDateOfBirthMinDate(str);
            return this;
        }

        public Builder setDateOfBirthMinDateBytes(gva gvaVar) {
            copyOnWrite();
            ((ParentalControls) this.instance).setDateOfBirthMinDateBytes(gvaVar);
            return this;
        }

        private Builder() {
            super(ParentalControls.DEFAULT_INSTANCE);
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
        ParentalControls parentalControls = new ParentalControls();
        DEFAULT_INSTANCE = parentalControls;
        AbstractC0269h.registerDefaultInstance(ParentalControls.class, parentalControls);
    }

    private ParentalControls() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAllowExplicitContent() {
        this.allowExplicitContent_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAllowVideo() {
        this.allowVideo_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDateOfBirth() {
        this.dateOfBirth_ = getDefaultInstance().getDateOfBirth();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDateOfBirthMaxDate() {
        this.dateOfBirthMaxDate_ = getDefaultInstance().getDateOfBirthMaxDate();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDateOfBirthMinDate() {
        this.dateOfBirthMinDate_ = getDefaultInstance().getDateOfBirthMinDate();
    }

    public static ParentalControls getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static ParentalControls parseDelimitedFrom(InputStream inputStream) {
        return (ParentalControls) AbstractC0269h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ParentalControls parseFrom(ByteBuffer byteBuffer) {
        return (ParentalControls) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAllowExplicitContent(boolean z) {
        this.allowExplicitContent_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAllowVideo(boolean z) {
        this.allowVideo_ = z;
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
    public void setDateOfBirthMaxDate(String str) {
        str.getClass();
        this.dateOfBirthMaxDate_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDateOfBirthMaxDateBytes(gva gvaVar) {
        AbstractC2118m8.checkByteStringIsUtf8(gvaVar);
        this.dateOfBirthMaxDate_ = gvaVar.m45892u();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDateOfBirthMinDate(String str) {
        str.getClass();
        this.dateOfBirthMinDate_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDateOfBirthMinDateBytes(gva gvaVar) {
        AbstractC2118m8.checkByteStringIsUtf8(gvaVar);
        this.dateOfBirthMinDate_ = gvaVar.m45892u();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0000\u0001\u0006\u0005\u0000\u0000\u0000\u0001\u0007\u0002\u0007\u0004Ȉ\u0005Ȉ\u0006Ȉ", new Object[]{"allowExplicitContent_", "allowVideo_", "dateOfBirth_", "dateOfBirthMinDate_", "dateOfBirthMaxDate_"});
        }
        if (iOrdinal == 3) {
            return new ParentalControls();
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
        synchronized (ParentalControls.class) {
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

    @Override // com.spotify.kidsview.p091v1.proto.ParentalControlsOrBuilder
    public boolean getAllowExplicitContent() {
        return this.allowExplicitContent_;
    }

    @Override // com.spotify.kidsview.p091v1.proto.ParentalControlsOrBuilder
    public boolean getAllowVideo() {
        return this.allowVideo_;
    }

    @Override // com.spotify.kidsview.p091v1.proto.ParentalControlsOrBuilder
    public String getDateOfBirth() {
        return this.dateOfBirth_;
    }

    @Override // com.spotify.kidsview.p091v1.proto.ParentalControlsOrBuilder
    public gva getDateOfBirthBytes() {
        return gva.m45888f(this.dateOfBirth_);
    }

    @Override // com.spotify.kidsview.p091v1.proto.ParentalControlsOrBuilder
    public String getDateOfBirthMaxDate() {
        return this.dateOfBirthMaxDate_;
    }

    @Override // com.spotify.kidsview.p091v1.proto.ParentalControlsOrBuilder
    public gva getDateOfBirthMaxDateBytes() {
        return gva.m45888f(this.dateOfBirthMaxDate_);
    }

    @Override // com.spotify.kidsview.p091v1.proto.ParentalControlsOrBuilder
    public String getDateOfBirthMinDate() {
        return this.dateOfBirthMinDate_;
    }

    @Override // com.spotify.kidsview.p091v1.proto.ParentalControlsOrBuilder
    public gva getDateOfBirthMinDateBytes() {
        return gva.m45888f(this.dateOfBirthMinDate_);
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.sre0
    public /* bridge */ /* synthetic */ pre0 getDefaultInstanceForType() {
        return getDefaultInstanceForType();
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }

    public static Builder newBuilder(ParentalControls parentalControls) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(parentalControls);
    }

    public static ParentalControls parseDelimitedFrom(InputStream inputStream, aux auxVar) {
        return (ParentalControls) AbstractC0269h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, auxVar);
    }

    public static ParentalControls parseFrom(ByteBuffer byteBuffer, aux auxVar) {
        return (ParentalControls) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, byteBuffer, auxVar);
    }

    public static ParentalControls parseFrom(gva gvaVar) {
        return (ParentalControls) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, gvaVar);
    }

    public static ParentalControls parseFrom(gva gvaVar, aux auxVar) {
        return (ParentalControls) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, gvaVar, auxVar);
    }

    public static ParentalControls parseFrom(byte[] bArr) {
        return (ParentalControls) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ParentalControls parseFrom(byte[] bArr, aux auxVar) {
        return (ParentalControls) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr, auxVar);
    }

    public static ParentalControls parseFrom(InputStream inputStream) {
        return (ParentalControls) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ParentalControls parseFrom(InputStream inputStream, aux auxVar) {
        return (ParentalControls) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, inputStream, auxVar);
    }

    public static ParentalControls parseFrom(owe oweVar) {
        return (ParentalControls) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, oweVar);
    }

    public static ParentalControls parseFrom(owe oweVar, aux auxVar) {
        return (ParentalControls) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, oweVar, auxVar);
    }
}
