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
public final class GenAlphaManagedSettings extends AbstractC0269h implements GenAlphaManagedSettingsOrBuilder {
    public static final int ALLOW_CONNECT_FIELD_NUMBER = 5;
    public static final int ALLOW_EXPLICIT_CONTENT_FIELD_NUMBER = 3;
    public static final int ALLOW_VIDEO_CONTENT_FIELD_NUMBER = 4;
    public static final int DATE_OF_BIRTH_FIELD_NUMBER = 2;
    private static final GenAlphaManagedSettings DEFAULT_INSTANCE;
    public static final int DISPLAY_NAME_FIELD_NUMBER = 1;
    private static volatile r2n0 PARSER;
    private boolean allowConnect_;
    private boolean allowExplicitContent_;
    private boolean allowVideoContent_;
    private int bitField0_;
    private String displayName_ = "";
    private String dateOfBirth_ = "";

    /* JADX INFO: renamed from: com.spotify.kidsview.v1.proto.GenAlphaManagedSettings$1 */
    public static /* synthetic */ class C08121 {

        /* JADX INFO: renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f4987xa1df5c61;

        static {
            int[] iArr = new int[z110.values().length];
            f4987xa1df5c61 = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f4987xa1df5c61[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f4987xa1df5c61[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f4987xa1df5c61[5] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f4987xa1df5c61[6] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f4987xa1df5c61[0] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f4987xa1df5c61[1] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class Builder extends AbstractC0268g implements GenAlphaManagedSettingsOrBuilder {
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

        public Builder clearAllowConnect() {
            copyOnWrite();
            ((GenAlphaManagedSettings) this.instance).clearAllowConnect();
            return this;
        }

        public Builder clearAllowExplicitContent() {
            copyOnWrite();
            ((GenAlphaManagedSettings) this.instance).clearAllowExplicitContent();
            return this;
        }

        public Builder clearAllowVideoContent() {
            copyOnWrite();
            ((GenAlphaManagedSettings) this.instance).clearAllowVideoContent();
            return this;
        }

        public Builder clearDateOfBirth() {
            copyOnWrite();
            ((GenAlphaManagedSettings) this.instance).clearDateOfBirth();
            return this;
        }

        public Builder clearDisplayName() {
            copyOnWrite();
            ((GenAlphaManagedSettings) this.instance).clearDisplayName();
            return this;
        }

        @Override // com.google.protobuf.AbstractC0268g
        /* JADX INFO: renamed from: clone */
        public /* bridge */ /* synthetic */ Object mo98327clone() {
            return super.mo98326clone();
        }

        @Override // com.spotify.kidsview.p091v1.proto.GenAlphaManagedSettingsOrBuilder
        public boolean getAllowConnect() {
            return ((GenAlphaManagedSettings) this.instance).getAllowConnect();
        }

        @Override // com.spotify.kidsview.p091v1.proto.GenAlphaManagedSettingsOrBuilder
        public boolean getAllowExplicitContent() {
            return ((GenAlphaManagedSettings) this.instance).getAllowExplicitContent();
        }

        @Override // com.spotify.kidsview.p091v1.proto.GenAlphaManagedSettingsOrBuilder
        public boolean getAllowVideoContent() {
            return ((GenAlphaManagedSettings) this.instance).getAllowVideoContent();
        }

        @Override // com.spotify.kidsview.p091v1.proto.GenAlphaManagedSettingsOrBuilder
        public String getDateOfBirth() {
            return ((GenAlphaManagedSettings) this.instance).getDateOfBirth();
        }

        @Override // com.spotify.kidsview.p091v1.proto.GenAlphaManagedSettingsOrBuilder
        public gva getDateOfBirthBytes() {
            return ((GenAlphaManagedSettings) this.instance).getDateOfBirthBytes();
        }

        @Override // com.google.protobuf.AbstractC0268g, p204p.sre0
        public /* bridge */ /* synthetic */ pre0 getDefaultInstanceForType() {
            return super.getDefaultInstanceForType();
        }

        @Override // com.spotify.kidsview.p091v1.proto.GenAlphaManagedSettingsOrBuilder
        public String getDisplayName() {
            return ((GenAlphaManagedSettings) this.instance).getDisplayName();
        }

        @Override // com.spotify.kidsview.p091v1.proto.GenAlphaManagedSettingsOrBuilder
        public gva getDisplayNameBytes() {
            return ((GenAlphaManagedSettings) this.instance).getDisplayNameBytes();
        }

        @Override // com.spotify.kidsview.p091v1.proto.GenAlphaManagedSettingsOrBuilder
        public boolean hasAllowConnect() {
            return ((GenAlphaManagedSettings) this.instance).hasAllowConnect();
        }

        @Override // com.spotify.kidsview.p091v1.proto.GenAlphaManagedSettingsOrBuilder
        public boolean hasAllowExplicitContent() {
            return ((GenAlphaManagedSettings) this.instance).hasAllowExplicitContent();
        }

        @Override // com.spotify.kidsview.p091v1.proto.GenAlphaManagedSettingsOrBuilder
        public boolean hasAllowVideoContent() {
            return ((GenAlphaManagedSettings) this.instance).hasAllowVideoContent();
        }

        @Override // com.spotify.kidsview.p091v1.proto.GenAlphaManagedSettingsOrBuilder
        public boolean hasDateOfBirth() {
            return ((GenAlphaManagedSettings) this.instance).hasDateOfBirth();
        }

        @Override // com.spotify.kidsview.p091v1.proto.GenAlphaManagedSettingsOrBuilder
        public boolean hasDisplayName() {
            return ((GenAlphaManagedSettings) this.instance).hasDisplayName();
        }

        @Override // com.google.protobuf.AbstractC0268g, p204p.AbstractC2081l8
        public /* bridge */ /* synthetic */ AbstractC2081l8 internalMergeFrom(AbstractC2118m8 abstractC2118m8) {
            return super.internalMergeFrom((AbstractC0269h) abstractC2118m8);
        }

        @Override // com.google.protobuf.AbstractC0268g, p204p.AbstractC2081l8, p204p.ore0
        public /* bridge */ /* synthetic */ AbstractC2081l8 mergeFrom(owe oweVar, aux auxVar) {
            return super.mergeFrom(oweVar, auxVar);
        }

        public Builder setAllowConnect(boolean z) {
            copyOnWrite();
            ((GenAlphaManagedSettings) this.instance).setAllowConnect(z);
            return this;
        }

        public Builder setAllowExplicitContent(boolean z) {
            copyOnWrite();
            ((GenAlphaManagedSettings) this.instance).setAllowExplicitContent(z);
            return this;
        }

        public Builder setAllowVideoContent(boolean z) {
            copyOnWrite();
            ((GenAlphaManagedSettings) this.instance).setAllowVideoContent(z);
            return this;
        }

        public Builder setDateOfBirth(String str) {
            copyOnWrite();
            ((GenAlphaManagedSettings) this.instance).setDateOfBirth(str);
            return this;
        }

        public Builder setDateOfBirthBytes(gva gvaVar) {
            copyOnWrite();
            ((GenAlphaManagedSettings) this.instance).setDateOfBirthBytes(gvaVar);
            return this;
        }

        public Builder setDisplayName(String str) {
            copyOnWrite();
            ((GenAlphaManagedSettings) this.instance).setDisplayName(str);
            return this;
        }

        public Builder setDisplayNameBytes(gva gvaVar) {
            copyOnWrite();
            ((GenAlphaManagedSettings) this.instance).setDisplayNameBytes(gvaVar);
            return this;
        }

        private Builder() {
            super(GenAlphaManagedSettings.DEFAULT_INSTANCE);
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
        GenAlphaManagedSettings genAlphaManagedSettings = new GenAlphaManagedSettings();
        DEFAULT_INSTANCE = genAlphaManagedSettings;
        AbstractC0269h.registerDefaultInstance(GenAlphaManagedSettings.class, genAlphaManagedSettings);
    }

    private GenAlphaManagedSettings() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAllowConnect() {
        this.bitField0_ &= -17;
        this.allowConnect_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAllowExplicitContent() {
        this.bitField0_ &= -5;
        this.allowExplicitContent_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAllowVideoContent() {
        this.bitField0_ &= -9;
        this.allowVideoContent_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDateOfBirth() {
        this.bitField0_ &= -3;
        this.dateOfBirth_ = getDefaultInstance().getDateOfBirth();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDisplayName() {
        this.bitField0_ &= -2;
        this.displayName_ = getDefaultInstance().getDisplayName();
    }

    public static GenAlphaManagedSettings getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static GenAlphaManagedSettings parseDelimitedFrom(InputStream inputStream) {
        return (GenAlphaManagedSettings) AbstractC0269h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static GenAlphaManagedSettings parseFrom(ByteBuffer byteBuffer) {
        return (GenAlphaManagedSettings) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAllowConnect(boolean z) {
        this.bitField0_ |= 16;
        this.allowConnect_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAllowExplicitContent(boolean z) {
        this.bitField0_ |= 4;
        this.allowExplicitContent_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAllowVideoContent(boolean z) {
        this.bitField0_ |= 8;
        this.allowVideoContent_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDateOfBirth(String str) {
        str.getClass();
        this.bitField0_ |= 2;
        this.dateOfBirth_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDateOfBirthBytes(gva gvaVar) {
        AbstractC2118m8.checkByteStringIsUtf8(gvaVar);
        this.dateOfBirth_ = gvaVar.m45892u();
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDisplayName(String str) {
        str.getClass();
        this.bitField0_ |= 1;
        this.displayName_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDisplayNameBytes(gva gvaVar) {
        AbstractC2118m8.checkByteStringIsUtf8(gvaVar);
        this.displayName_ = gvaVar.m45892u();
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ለ\u0000\u0002ለ\u0001\u0003ဇ\u0002\u0004ဇ\u0003\u0005ဇ\u0004", new Object[]{"bitField0_", "displayName_", "dateOfBirth_", "allowExplicitContent_", "allowVideoContent_", "allowConnect_"});
        }
        if (iOrdinal == 3) {
            return new GenAlphaManagedSettings();
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
        synchronized (GenAlphaManagedSettings.class) {
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

    @Override // com.spotify.kidsview.p091v1.proto.GenAlphaManagedSettingsOrBuilder
    public boolean getAllowConnect() {
        return this.allowConnect_;
    }

    @Override // com.spotify.kidsview.p091v1.proto.GenAlphaManagedSettingsOrBuilder
    public boolean getAllowExplicitContent() {
        return this.allowExplicitContent_;
    }

    @Override // com.spotify.kidsview.p091v1.proto.GenAlphaManagedSettingsOrBuilder
    public boolean getAllowVideoContent() {
        return this.allowVideoContent_;
    }

    @Override // com.spotify.kidsview.p091v1.proto.GenAlphaManagedSettingsOrBuilder
    public String getDateOfBirth() {
        return this.dateOfBirth_;
    }

    @Override // com.spotify.kidsview.p091v1.proto.GenAlphaManagedSettingsOrBuilder
    public gva getDateOfBirthBytes() {
        return gva.m45888f(this.dateOfBirth_);
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.sre0
    public /* bridge */ /* synthetic */ pre0 getDefaultInstanceForType() {
        return getDefaultInstanceForType();
    }

    @Override // com.spotify.kidsview.p091v1.proto.GenAlphaManagedSettingsOrBuilder
    public String getDisplayName() {
        return this.displayName_;
    }

    @Override // com.spotify.kidsview.p091v1.proto.GenAlphaManagedSettingsOrBuilder
    public gva getDisplayNameBytes() {
        return gva.m45888f(this.displayName_);
    }

    @Override // com.spotify.kidsview.p091v1.proto.GenAlphaManagedSettingsOrBuilder
    public boolean hasAllowConnect() {
        return (this.bitField0_ & 16) != 0;
    }

    @Override // com.spotify.kidsview.p091v1.proto.GenAlphaManagedSettingsOrBuilder
    public boolean hasAllowExplicitContent() {
        return (this.bitField0_ & 4) != 0;
    }

    @Override // com.spotify.kidsview.p091v1.proto.GenAlphaManagedSettingsOrBuilder
    public boolean hasAllowVideoContent() {
        return (this.bitField0_ & 8) != 0;
    }

    @Override // com.spotify.kidsview.p091v1.proto.GenAlphaManagedSettingsOrBuilder
    public boolean hasDateOfBirth() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override // com.spotify.kidsview.p091v1.proto.GenAlphaManagedSettingsOrBuilder
    public boolean hasDisplayName() {
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

    public static Builder newBuilder(GenAlphaManagedSettings genAlphaManagedSettings) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(genAlphaManagedSettings);
    }

    public static GenAlphaManagedSettings parseDelimitedFrom(InputStream inputStream, aux auxVar) {
        return (GenAlphaManagedSettings) AbstractC0269h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, auxVar);
    }

    public static GenAlphaManagedSettings parseFrom(ByteBuffer byteBuffer, aux auxVar) {
        return (GenAlphaManagedSettings) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, byteBuffer, auxVar);
    }

    public static GenAlphaManagedSettings parseFrom(gva gvaVar) {
        return (GenAlphaManagedSettings) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, gvaVar);
    }

    public static GenAlphaManagedSettings parseFrom(gva gvaVar, aux auxVar) {
        return (GenAlphaManagedSettings) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, gvaVar, auxVar);
    }

    public static GenAlphaManagedSettings parseFrom(byte[] bArr) {
        return (GenAlphaManagedSettings) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static GenAlphaManagedSettings parseFrom(byte[] bArr, aux auxVar) {
        return (GenAlphaManagedSettings) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr, auxVar);
    }

    public static GenAlphaManagedSettings parseFrom(InputStream inputStream) {
        return (GenAlphaManagedSettings) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static GenAlphaManagedSettings parseFrom(InputStream inputStream, aux auxVar) {
        return (GenAlphaManagedSettings) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, inputStream, auxVar);
    }

    public static GenAlphaManagedSettings parseFrom(owe oweVar) {
        return (GenAlphaManagedSettings) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, oweVar);
    }

    public static GenAlphaManagedSettings parseFrom(owe oweVar, aux auxVar) {
        return (GenAlphaManagedSettings) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, oweVar, auxVar);
    }
}
