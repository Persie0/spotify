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

/* JADX INFO: loaded from: classes2.dex */
public final class TransitionToManagedAccountRequest extends AbstractC0269h implements TransitionToManagedAccountRequestOrBuilder {
    private static final TransitionToManagedAccountRequest DEFAULT_INSTANCE;
    public static final int MEMBER_ID_FIELD_NUMBER = 2;
    public static final int PARENTAL_CONSENT_SESSION_ID_FIELD_NUMBER = 1;
    public static final int PARENT_PIN_HASH_FIELD_NUMBER = 4;
    private static volatile r2n0 PARSER = null;
    public static final int SETTINGS_FIELD_NUMBER = 3;
    private int bitField0_;
    private GenAlphaManagedSettings settings_;
    private Object transitioningUserIdentifier_;
    private int transitioningUserIdentifierCase_ = 0;
    private String parentPinHash_ = "";

    /* JADX INFO: renamed from: com.spotify.kidsview.v1.proto.TransitionToManagedAccountRequest$1 */
    /* JADX INFO: loaded from: classes7.dex */
    public static /* synthetic */ class C08261 {

        /* JADX INFO: renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f5000xa1df5c61;

        static {
            int[] iArr = new int[z110.values().length];
            f5000xa1df5c61 = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f5000xa1df5c61[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f5000xa1df5c61[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f5000xa1df5c61[5] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f5000xa1df5c61[6] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f5000xa1df5c61[0] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f5000xa1df5c61[1] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    public static final class Builder extends AbstractC0268g implements TransitionToManagedAccountRequestOrBuilder {
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

        public Builder clearMemberId() {
            copyOnWrite();
            ((TransitionToManagedAccountRequest) this.instance).clearMemberId();
            return this;
        }

        public Builder clearParentPinHash() {
            copyOnWrite();
            ((TransitionToManagedAccountRequest) this.instance).clearParentPinHash();
            return this;
        }

        public Builder clearParentalConsentSessionId() {
            copyOnWrite();
            ((TransitionToManagedAccountRequest) this.instance).clearParentalConsentSessionId();
            return this;
        }

        public Builder clearSettings() {
            copyOnWrite();
            ((TransitionToManagedAccountRequest) this.instance).clearSettings();
            return this;
        }

        public Builder clearTransitioningUserIdentifier() {
            copyOnWrite();
            ((TransitionToManagedAccountRequest) this.instance).clearTransitioningUserIdentifier();
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

        @Override // com.spotify.kidsview.p091v1.proto.TransitionToManagedAccountRequestOrBuilder
        public String getMemberId() {
            return ((TransitionToManagedAccountRequest) this.instance).getMemberId();
        }

        @Override // com.spotify.kidsview.p091v1.proto.TransitionToManagedAccountRequestOrBuilder
        public gva getMemberIdBytes() {
            return ((TransitionToManagedAccountRequest) this.instance).getMemberIdBytes();
        }

        @Override // com.spotify.kidsview.p091v1.proto.TransitionToManagedAccountRequestOrBuilder
        public String getParentPinHash() {
            return ((TransitionToManagedAccountRequest) this.instance).getParentPinHash();
        }

        @Override // com.spotify.kidsview.p091v1.proto.TransitionToManagedAccountRequestOrBuilder
        public gva getParentPinHashBytes() {
            return ((TransitionToManagedAccountRequest) this.instance).getParentPinHashBytes();
        }

        @Override // com.spotify.kidsview.p091v1.proto.TransitionToManagedAccountRequestOrBuilder
        public String getParentalConsentSessionId() {
            return ((TransitionToManagedAccountRequest) this.instance).getParentalConsentSessionId();
        }

        @Override // com.spotify.kidsview.p091v1.proto.TransitionToManagedAccountRequestOrBuilder
        public gva getParentalConsentSessionIdBytes() {
            return ((TransitionToManagedAccountRequest) this.instance).getParentalConsentSessionIdBytes();
        }

        @Override // com.spotify.kidsview.p091v1.proto.TransitionToManagedAccountRequestOrBuilder
        public GenAlphaManagedSettings getSettings() {
            return ((TransitionToManagedAccountRequest) this.instance).getSettings();
        }

        @Override // com.spotify.kidsview.p091v1.proto.TransitionToManagedAccountRequestOrBuilder
        public TransitioningUserIdentifierCase getTransitioningUserIdentifierCase() {
            return ((TransitionToManagedAccountRequest) this.instance).getTransitioningUserIdentifierCase();
        }

        @Override // com.spotify.kidsview.p091v1.proto.TransitionToManagedAccountRequestOrBuilder
        public boolean hasMemberId() {
            return ((TransitionToManagedAccountRequest) this.instance).hasMemberId();
        }

        @Override // com.spotify.kidsview.p091v1.proto.TransitionToManagedAccountRequestOrBuilder
        public boolean hasParentPinHash() {
            return ((TransitionToManagedAccountRequest) this.instance).hasParentPinHash();
        }

        @Override // com.spotify.kidsview.p091v1.proto.TransitionToManagedAccountRequestOrBuilder
        public boolean hasParentalConsentSessionId() {
            return ((TransitionToManagedAccountRequest) this.instance).hasParentalConsentSessionId();
        }

        @Override // com.spotify.kidsview.p091v1.proto.TransitionToManagedAccountRequestOrBuilder
        public boolean hasSettings() {
            return ((TransitionToManagedAccountRequest) this.instance).hasSettings();
        }

        @Override // com.google.protobuf.AbstractC0268g, p204p.AbstractC2081l8
        public /* bridge */ /* synthetic */ AbstractC2081l8 internalMergeFrom(AbstractC2118m8 abstractC2118m8) {
            return super.internalMergeFrom((AbstractC0269h) abstractC2118m8);
        }

        @Override // com.google.protobuf.AbstractC0268g, p204p.AbstractC2081l8, p204p.ore0
        public /* bridge */ /* synthetic */ AbstractC2081l8 mergeFrom(owe oweVar, aux auxVar) {
            return super.mergeFrom(oweVar, auxVar);
        }

        public Builder mergeSettings(GenAlphaManagedSettings genAlphaManagedSettings) {
            copyOnWrite();
            ((TransitionToManagedAccountRequest) this.instance).mergeSettings(genAlphaManagedSettings);
            return this;
        }

        public Builder setMemberId(String str) {
            copyOnWrite();
            ((TransitionToManagedAccountRequest) this.instance).setMemberId(str);
            return this;
        }

        public Builder setMemberIdBytes(gva gvaVar) {
            copyOnWrite();
            ((TransitionToManagedAccountRequest) this.instance).setMemberIdBytes(gvaVar);
            return this;
        }

        public Builder setParentPinHash(String str) {
            copyOnWrite();
            ((TransitionToManagedAccountRequest) this.instance).setParentPinHash(str);
            return this;
        }

        public Builder setParentPinHashBytes(gva gvaVar) {
            copyOnWrite();
            ((TransitionToManagedAccountRequest) this.instance).setParentPinHashBytes(gvaVar);
            return this;
        }

        public Builder setParentalConsentSessionId(String str) {
            copyOnWrite();
            ((TransitionToManagedAccountRequest) this.instance).setParentalConsentSessionId(str);
            return this;
        }

        public Builder setParentalConsentSessionIdBytes(gva gvaVar) {
            copyOnWrite();
            ((TransitionToManagedAccountRequest) this.instance).setParentalConsentSessionIdBytes(gvaVar);
            return this;
        }

        public Builder setSettings(GenAlphaManagedSettings genAlphaManagedSettings) {
            copyOnWrite();
            ((TransitionToManagedAccountRequest) this.instance).setSettings(genAlphaManagedSettings);
            return this;
        }

        private Builder() {
            super(TransitionToManagedAccountRequest.DEFAULT_INSTANCE);
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

        public Builder setSettings(GenAlphaManagedSettings.Builder builder) {
            copyOnWrite();
            ((TransitionToManagedAccountRequest) this.instance).setSettings((GenAlphaManagedSettings) builder.build());
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

    /* JADX INFO: loaded from: classes7.dex */
    public enum TransitioningUserIdentifierCase {
        PARENTAL_CONSENT_SESSION_ID(1),
        MEMBER_ID(2),
        TRANSITIONINGUSERIDENTIFIER_NOT_SET(0);

        private final int value;

        TransitioningUserIdentifierCase(int i) {
            this.value = i;
        }

        public static TransitioningUserIdentifierCase forNumber(int i) {
            if (i == 0) {
                return TRANSITIONINGUSERIDENTIFIER_NOT_SET;
            }
            if (i == 1) {
                return PARENTAL_CONSENT_SESSION_ID;
            }
            if (i != 2) {
                return null;
            }
            return MEMBER_ID;
        }

        public int getNumber() {
            return this.value;
        }

        @Deprecated
        public static TransitioningUserIdentifierCase valueOf(int i) {
            return forNumber(i);
        }
    }

    static {
        TransitionToManagedAccountRequest transitionToManagedAccountRequest = new TransitionToManagedAccountRequest();
        DEFAULT_INSTANCE = transitionToManagedAccountRequest;
        AbstractC0269h.registerDefaultInstance(TransitionToManagedAccountRequest.class, transitionToManagedAccountRequest);
    }

    private TransitionToManagedAccountRequest() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMemberId() {
        if (this.transitioningUserIdentifierCase_ == 2) {
            this.transitioningUserIdentifierCase_ = 0;
            this.transitioningUserIdentifier_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearParentPinHash() {
        this.bitField0_ &= -3;
        this.parentPinHash_ = getDefaultInstance().getParentPinHash();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearParentalConsentSessionId() {
        if (this.transitioningUserIdentifierCase_ == 1) {
            this.transitioningUserIdentifierCase_ = 0;
            this.transitioningUserIdentifier_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSettings() {
        this.settings_ = null;
        this.bitField0_ &= -2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTransitioningUserIdentifier() {
        this.transitioningUserIdentifierCase_ = 0;
        this.transitioningUserIdentifier_ = null;
    }

    public static TransitionToManagedAccountRequest getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeSettings(GenAlphaManagedSettings genAlphaManagedSettings) {
        genAlphaManagedSettings.getClass();
        GenAlphaManagedSettings genAlphaManagedSettings2 = this.settings_;
        if (genAlphaManagedSettings2 == null || genAlphaManagedSettings2 == GenAlphaManagedSettings.getDefaultInstance()) {
            this.settings_ = genAlphaManagedSettings;
        } else {
            this.settings_ = (GenAlphaManagedSettings) ((GenAlphaManagedSettings.Builder) GenAlphaManagedSettings.newBuilder(this.settings_).mergeFrom((AbstractC0269h) genAlphaManagedSettings)).buildPartial();
        }
        this.bitField0_ |= 1;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static TransitionToManagedAccountRequest parseDelimitedFrom(InputStream inputStream) {
        return (TransitionToManagedAccountRequest) AbstractC0269h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static TransitionToManagedAccountRequest parseFrom(ByteBuffer byteBuffer) {
        return (TransitionToManagedAccountRequest) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMemberId(String str) {
        str.getClass();
        this.transitioningUserIdentifierCase_ = 2;
        this.transitioningUserIdentifier_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMemberIdBytes(gva gvaVar) {
        AbstractC2118m8.checkByteStringIsUtf8(gvaVar);
        this.transitioningUserIdentifier_ = gvaVar.m45892u();
        this.transitioningUserIdentifierCase_ = 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setParentPinHash(String str) {
        str.getClass();
        this.bitField0_ |= 2;
        this.parentPinHash_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setParentPinHashBytes(gva gvaVar) {
        AbstractC2118m8.checkByteStringIsUtf8(gvaVar);
        this.parentPinHash_ = gvaVar.m45892u();
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setParentalConsentSessionId(String str) {
        str.getClass();
        this.transitioningUserIdentifierCase_ = 1;
        this.transitioningUserIdentifier_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setParentalConsentSessionIdBytes(gva gvaVar) {
        AbstractC2118m8.checkByteStringIsUtf8(gvaVar);
        this.transitioningUserIdentifier_ = gvaVar.m45892u();
        this.transitioningUserIdentifierCase_ = 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSettings(GenAlphaManagedSettings genAlphaManagedSettings) {
        genAlphaManagedSettings.getClass();
        this.settings_ = genAlphaManagedSettings;
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0001\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȼ\u0000\u0002Ȼ\u0000\u0003ဉ\u0000\u0004ለ\u0001", new Object[]{"transitioningUserIdentifier_", "transitioningUserIdentifierCase_", "bitField0_", "settings_", "parentPinHash_"});
        }
        if (iOrdinal == 3) {
            return new TransitionToManagedAccountRequest();
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
        synchronized (TransitionToManagedAccountRequest.class) {
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

    @Override // com.spotify.kidsview.p091v1.proto.TransitionToManagedAccountRequestOrBuilder
    public String getMemberId() {
        return this.transitioningUserIdentifierCase_ == 2 ? (String) this.transitioningUserIdentifier_ : "";
    }

    @Override // com.spotify.kidsview.p091v1.proto.TransitionToManagedAccountRequestOrBuilder
    public gva getMemberIdBytes() {
        return gva.m45888f(this.transitioningUserIdentifierCase_ == 2 ? (String) this.transitioningUserIdentifier_ : "");
    }

    @Override // com.spotify.kidsview.p091v1.proto.TransitionToManagedAccountRequestOrBuilder
    public String getParentPinHash() {
        return this.parentPinHash_;
    }

    @Override // com.spotify.kidsview.p091v1.proto.TransitionToManagedAccountRequestOrBuilder
    public gva getParentPinHashBytes() {
        return gva.m45888f(this.parentPinHash_);
    }

    @Override // com.spotify.kidsview.p091v1.proto.TransitionToManagedAccountRequestOrBuilder
    public String getParentalConsentSessionId() {
        return this.transitioningUserIdentifierCase_ == 1 ? (String) this.transitioningUserIdentifier_ : "";
    }

    @Override // com.spotify.kidsview.p091v1.proto.TransitionToManagedAccountRequestOrBuilder
    public gva getParentalConsentSessionIdBytes() {
        return gva.m45888f(this.transitioningUserIdentifierCase_ == 1 ? (String) this.transitioningUserIdentifier_ : "");
    }

    @Override // com.spotify.kidsview.p091v1.proto.TransitionToManagedAccountRequestOrBuilder
    public GenAlphaManagedSettings getSettings() {
        GenAlphaManagedSettings genAlphaManagedSettings = this.settings_;
        return genAlphaManagedSettings == null ? GenAlphaManagedSettings.getDefaultInstance() : genAlphaManagedSettings;
    }

    @Override // com.spotify.kidsview.p091v1.proto.TransitionToManagedAccountRequestOrBuilder
    public TransitioningUserIdentifierCase getTransitioningUserIdentifierCase() {
        return TransitioningUserIdentifierCase.forNumber(this.transitioningUserIdentifierCase_);
    }

    @Override // com.spotify.kidsview.p091v1.proto.TransitionToManagedAccountRequestOrBuilder
    public boolean hasMemberId() {
        return this.transitioningUserIdentifierCase_ == 2;
    }

    @Override // com.spotify.kidsview.p091v1.proto.TransitionToManagedAccountRequestOrBuilder
    public boolean hasParentPinHash() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override // com.spotify.kidsview.p091v1.proto.TransitionToManagedAccountRequestOrBuilder
    public boolean hasParentalConsentSessionId() {
        return this.transitioningUserIdentifierCase_ == 1;
    }

    @Override // com.spotify.kidsview.p091v1.proto.TransitionToManagedAccountRequestOrBuilder
    public boolean hasSettings() {
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

    public static Builder newBuilder(TransitionToManagedAccountRequest transitionToManagedAccountRequest) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(transitionToManagedAccountRequest);
    }

    public static TransitionToManagedAccountRequest parseDelimitedFrom(InputStream inputStream, aux auxVar) {
        return (TransitionToManagedAccountRequest) AbstractC0269h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, auxVar);
    }

    public static TransitionToManagedAccountRequest parseFrom(ByteBuffer byteBuffer, aux auxVar) {
        return (TransitionToManagedAccountRequest) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, byteBuffer, auxVar);
    }

    public static TransitionToManagedAccountRequest parseFrom(gva gvaVar) {
        return (TransitionToManagedAccountRequest) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, gvaVar);
    }

    public static TransitionToManagedAccountRequest parseFrom(gva gvaVar, aux auxVar) {
        return (TransitionToManagedAccountRequest) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, gvaVar, auxVar);
    }

    public static TransitionToManagedAccountRequest parseFrom(byte[] bArr) {
        return (TransitionToManagedAccountRequest) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static TransitionToManagedAccountRequest parseFrom(byte[] bArr, aux auxVar) {
        return (TransitionToManagedAccountRequest) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr, auxVar);
    }

    public static TransitionToManagedAccountRequest parseFrom(InputStream inputStream) {
        return (TransitionToManagedAccountRequest) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static TransitionToManagedAccountRequest parseFrom(InputStream inputStream, aux auxVar) {
        return (TransitionToManagedAccountRequest) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, inputStream, auxVar);
    }

    public static TransitionToManagedAccountRequest parseFrom(owe oweVar) {
        return (TransitionToManagedAccountRequest) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, oweVar);
    }

    public static TransitionToManagedAccountRequest parseFrom(owe oweVar, aux auxVar) {
        return (TransitionToManagedAccountRequest) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, oweVar, auxVar);
    }
}
