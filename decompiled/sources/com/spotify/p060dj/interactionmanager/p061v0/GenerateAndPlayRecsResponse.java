package com.spotify.p060dj.interactionmanager.p061v0;

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

/* JADX INFO: loaded from: classes6.dex */
public final class GenerateAndPlayRecsResponse extends AbstractC0269h implements GenerateAndPlayRecsResponseOrBuilder {
    private static final GenerateAndPlayRecsResponse DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER = null;
    public static final int STATUS_CODE_FIELD_NUMBER = 1;
    public static final int STATUS_MESSAGE_FIELD_NUMBER = 2;
    private int statusCode_;
    private String statusMessage_ = "";

    /* JADX INFO: renamed from: com.spotify.dj.interactionmanager.v0.GenerateAndPlayRecsResponse$1 */
    public static /* synthetic */ class C06931 {

        /* JADX INFO: renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f3573xa1df5c61;

        static {
            int[] iArr = new int[z110.values().length];
            f3573xa1df5c61 = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f3573xa1df5c61[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f3573xa1df5c61[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f3573xa1df5c61[5] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f3573xa1df5c61[6] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f3573xa1df5c61[0] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f3573xa1df5c61[1] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class Builder extends AbstractC0268g implements GenerateAndPlayRecsResponseOrBuilder {
        public /* synthetic */ Builder(int i) {
            this();
        }

        @Override // com.google.protobuf.AbstractC0268g, p204p.ore0
        public final /* bridge */ /* synthetic */ pre0 build() {
            return build();
        }

        @Override // com.google.protobuf.AbstractC0268g, p204p.ore0
        public final /* bridge */ /* synthetic */ pre0 buildPartial() {
            return super.buildPartial();
        }

        @Override // com.google.protobuf.AbstractC0268g
        /* JADX INFO: renamed from: clear */
        public final /* bridge */ /* synthetic */ ore0 mo98325clear() {
            return mo98325clear();
        }

        public final Builder clearStatusCode() {
            copyOnWrite();
            GenerateAndPlayRecsResponse.m9404n((GenerateAndPlayRecsResponse) this.instance);
            return this;
        }

        public final Builder clearStatusMessage() {
            copyOnWrite();
            ((GenerateAndPlayRecsResponse) this.instance).clearStatusMessage();
            return this;
        }

        @Override // com.google.protobuf.AbstractC0268g
        /* JADX INFO: renamed from: clone */
        public final /* bridge */ /* synthetic */ Object mo98328clone() {
            return super.mo98326clone();
        }

        @Override // com.google.protobuf.AbstractC0268g, p204p.sre0
        public final /* bridge */ /* synthetic */ pre0 getDefaultInstanceForType() {
            return super.getDefaultInstanceForType();
        }

        @Override // com.spotify.p060dj.interactionmanager.p061v0.GenerateAndPlayRecsResponseOrBuilder
        public final int getStatusCode() {
            return ((GenerateAndPlayRecsResponse) this.instance).getStatusCode();
        }

        @Override // com.spotify.p060dj.interactionmanager.p061v0.GenerateAndPlayRecsResponseOrBuilder
        public final String getStatusMessage() {
            return ((GenerateAndPlayRecsResponse) this.instance).getStatusMessage();
        }

        @Override // com.spotify.p060dj.interactionmanager.p061v0.GenerateAndPlayRecsResponseOrBuilder
        public final gva getStatusMessageBytes() {
            return ((GenerateAndPlayRecsResponse) this.instance).getStatusMessageBytes();
        }

        @Override // com.google.protobuf.AbstractC0268g, p204p.AbstractC2081l8
        public final /* bridge */ /* synthetic */ AbstractC2081l8 internalMergeFrom(AbstractC2118m8 abstractC2118m8) {
            return super.internalMergeFrom((AbstractC0269h) abstractC2118m8);
        }

        @Override // com.google.protobuf.AbstractC0268g, p204p.AbstractC2081l8, p204p.ore0
        public final /* bridge */ /* synthetic */ AbstractC2081l8 mergeFrom(owe oweVar, aux auxVar) {
            return super.mergeFrom(oweVar, auxVar);
        }

        public final Builder setStatusCode(int i) {
            copyOnWrite();
            GenerateAndPlayRecsResponse.m9406p((GenerateAndPlayRecsResponse) this.instance, i);
            return this;
        }

        public final Builder setStatusMessage(String str) {
            copyOnWrite();
            ((GenerateAndPlayRecsResponse) this.instance).setStatusMessage(str);
            return this;
        }

        public final Builder setStatusMessageBytes(gva gvaVar) {
            copyOnWrite();
            ((GenerateAndPlayRecsResponse) this.instance).setStatusMessageBytes(gvaVar);
            return this;
        }

        private Builder() {
            super(GenerateAndPlayRecsResponse.DEFAULT_INSTANCE);
        }

        @Override // com.google.protobuf.AbstractC0268g
        /* JADX INFO: renamed from: clone */
        public final /* bridge */ /* synthetic */ AbstractC2081l8 mo98327clone() {
            return super.mo98326clone();
        }

        @Override // com.google.protobuf.AbstractC0268g, p204p.AbstractC2081l8
        /* JADX INFO: renamed from: mergeFrom */
        public final /* bridge */ /* synthetic */ AbstractC2081l8 mo98329mergeFrom(byte[] bArr, int i, int i2) {
            return super.mo98329mergeFrom(bArr, i, i2);
        }

        @Override // com.google.protobuf.AbstractC0268g
        /* JADX INFO: renamed from: clone */
        public final /* bridge */ /* synthetic */ ore0 mo98327clone() {
            return super.mo98326clone();
        }

        @Override // com.google.protobuf.AbstractC0268g, p204p.AbstractC2081l8
        /* JADX INFO: renamed from: mergeFrom */
        public final /* bridge */ /* synthetic */ AbstractC2081l8 mo98330mergeFrom(byte[] bArr, int i, int i2, aux auxVar) {
            return super.mo98330mergeFrom(bArr, i, i2, auxVar);
        }

        @Override // p204p.AbstractC2081l8
        /* JADX INFO: renamed from: mergeFrom */
        public final /* bridge */ /* synthetic */ ore0 mo98371mergeFrom(InputStream inputStream) {
            return super.mo98371mergeFrom(inputStream);
        }

        @Override // p204p.AbstractC2081l8
        /* JADX INFO: renamed from: mergeFrom */
        public final /* bridge */ /* synthetic */ ore0 mo98372mergeFrom(InputStream inputStream, aux auxVar) {
            return super.mo98372mergeFrom(inputStream, auxVar);
        }

        @Override // p204p.AbstractC2081l8
        /* JADX INFO: renamed from: mergeFrom */
        public final /* bridge */ /* synthetic */ ore0 mo98373mergeFrom(gva gvaVar) {
            return super.mo98373mergeFrom(gvaVar);
        }

        @Override // p204p.AbstractC2081l8
        /* JADX INFO: renamed from: mergeFrom */
        public final /* bridge */ /* synthetic */ ore0 mo98374mergeFrom(gva gvaVar, aux auxVar) {
            return super.mo98374mergeFrom(gvaVar, auxVar);
        }

        @Override // p204p.AbstractC2081l8
        /* JADX INFO: renamed from: mergeFrom */
        public final /* bridge */ /* synthetic */ ore0 mo98375mergeFrom(owe oweVar) {
            return super.mo98375mergeFrom(oweVar);
        }

        @Override // com.google.protobuf.AbstractC0268g, p204p.ore0
        public final /* bridge */ /* synthetic */ ore0 mergeFrom(owe oweVar, aux auxVar) {
            return super.mergeFrom(oweVar, auxVar);
        }

        @Override // p204p.AbstractC2081l8, p204p.ore0
        public final /* bridge */ /* synthetic */ ore0 mergeFrom(pre0 pre0Var) {
            return super.mergeFrom(pre0Var);
        }

        @Override // p204p.AbstractC2081l8
        /* JADX INFO: renamed from: mergeFrom */
        public final /* bridge */ /* synthetic */ ore0 mo98376mergeFrom(byte[] bArr) {
            return super.mo98376mergeFrom(bArr);
        }

        @Override // com.google.protobuf.AbstractC0268g
        /* JADX INFO: renamed from: mergeFrom */
        public final /* bridge */ /* synthetic */ ore0 mo98329mergeFrom(byte[] bArr, int i, int i2) {
            return super.mo98329mergeFrom(bArr, i, i2);
        }

        @Override // com.google.protobuf.AbstractC0268g
        /* JADX INFO: renamed from: mergeFrom */
        public final /* bridge */ /* synthetic */ ore0 mo98330mergeFrom(byte[] bArr, int i, int i2, aux auxVar) {
            return super.mo98330mergeFrom(bArr, i, i2, auxVar);
        }

        @Override // p204p.AbstractC2081l8
        /* JADX INFO: renamed from: mergeFrom */
        public final /* bridge */ /* synthetic */ ore0 mo98377mergeFrom(byte[] bArr, aux auxVar) {
            return super.mo98377mergeFrom(bArr, auxVar);
        }
    }

    static {
        GenerateAndPlayRecsResponse generateAndPlayRecsResponse = new GenerateAndPlayRecsResponse();
        DEFAULT_INSTANCE = generateAndPlayRecsResponse;
        AbstractC0269h.registerDefaultInstance(GenerateAndPlayRecsResponse.class, generateAndPlayRecsResponse);
    }

    private GenerateAndPlayRecsResponse() {
    }

    private void clearStatusCode() {
        this.statusCode_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStatusMessage() {
        this.statusMessage_ = DEFAULT_INSTANCE.statusMessage_;
    }

    public static GenerateAndPlayRecsResponse getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: renamed from: n */
    public static void m9404n(GenerateAndPlayRecsResponse generateAndPlayRecsResponse) {
        generateAndPlayRecsResponse.statusCode_ = 0;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    /* JADX INFO: renamed from: p */
    public static void m9406p(GenerateAndPlayRecsResponse generateAndPlayRecsResponse, int i) {
        generateAndPlayRecsResponse.statusCode_ = i;
    }

    public static GenerateAndPlayRecsResponse parseDelimitedFrom(InputStream inputStream) {
        return (GenerateAndPlayRecsResponse) AbstractC0269h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static GenerateAndPlayRecsResponse parseFrom(ByteBuffer byteBuffer) {
        return (GenerateAndPlayRecsResponse) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void setStatusCode(int i) {
        this.statusCode_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStatusMessage(String str) {
        str.getClass();
        this.statusMessage_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStatusMessageBytes(gva gvaVar) {
        AbstractC2118m8.checkByteStringIsUtf8(gvaVar);
        this.statusMessage_ = gvaVar.m45892u();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0004\u0002Ȉ", new Object[]{"statusCode_", "statusMessage_"});
        }
        if (iOrdinal == 3) {
            return new GenerateAndPlayRecsResponse();
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
        synchronized (GenerateAndPlayRecsResponse.class) {
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
    public final /* bridge */ /* synthetic */ pre0 getDefaultInstanceForType() {
        return getDefaultInstanceForType();
    }

    @Override // com.spotify.p060dj.interactionmanager.p061v0.GenerateAndPlayRecsResponseOrBuilder
    public final int getStatusCode() {
        return this.statusCode_;
    }

    @Override // com.spotify.p060dj.interactionmanager.p061v0.GenerateAndPlayRecsResponseOrBuilder
    public final String getStatusMessage() {
        return this.statusMessage_;
    }

    @Override // com.spotify.p060dj.interactionmanager.p061v0.GenerateAndPlayRecsResponseOrBuilder
    public final gva getStatusMessageBytes() {
        return gva.m45888f(this.statusMessage_);
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }

    public static Builder newBuilder(GenerateAndPlayRecsResponse generateAndPlayRecsResponse) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(generateAndPlayRecsResponse);
    }

    public static GenerateAndPlayRecsResponse parseDelimitedFrom(InputStream inputStream, aux auxVar) {
        return (GenerateAndPlayRecsResponse) AbstractC0269h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, auxVar);
    }

    public static GenerateAndPlayRecsResponse parseFrom(ByteBuffer byteBuffer, aux auxVar) {
        return (GenerateAndPlayRecsResponse) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, byteBuffer, auxVar);
    }

    public static GenerateAndPlayRecsResponse parseFrom(gva gvaVar) {
        return (GenerateAndPlayRecsResponse) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, gvaVar);
    }

    public static GenerateAndPlayRecsResponse parseFrom(gva gvaVar, aux auxVar) {
        return (GenerateAndPlayRecsResponse) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, gvaVar, auxVar);
    }

    public static GenerateAndPlayRecsResponse parseFrom(byte[] bArr) {
        return (GenerateAndPlayRecsResponse) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static GenerateAndPlayRecsResponse parseFrom(byte[] bArr, aux auxVar) {
        return (GenerateAndPlayRecsResponse) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr, auxVar);
    }

    public static GenerateAndPlayRecsResponse parseFrom(InputStream inputStream) {
        return (GenerateAndPlayRecsResponse) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static GenerateAndPlayRecsResponse parseFrom(InputStream inputStream, aux auxVar) {
        return (GenerateAndPlayRecsResponse) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, inputStream, auxVar);
    }

    public static GenerateAndPlayRecsResponse parseFrom(owe oweVar) {
        return (GenerateAndPlayRecsResponse) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, oweVar);
    }

    public static GenerateAndPlayRecsResponse parseFrom(owe oweVar, aux auxVar) {
        return (GenerateAndPlayRecsResponse) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, oweVar, auxVar);
    }
}
