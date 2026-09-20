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

/* JADX INFO: loaded from: classes.dex */
public final class GetSuggestedPromptsRequest extends AbstractC0269h implements GetSuggestedPromptsRequestOrBuilder {
    public static final int CURRENT_TRACK_URI_FIELD_NUMBER = 3;
    private static final GetSuggestedPromptsRequest DEFAULT_INSTANCE;
    public static final int LLM_MODEL_FIELD_NUMBER = 2;
    private static volatile r2n0 PARSER = null;
    public static final int UNUSED_FIELD_NUMBER = 1;
    private String currentTrackUri_ = "";
    private int llmModel_;
    private boolean unused_;

    /* JADX INFO: renamed from: com.spotify.dj.interactionmanager.v0.GetSuggestedPromptsRequest$1 */
    /* JADX INFO: loaded from: classes6.dex */
    public static /* synthetic */ class C06961 {

        /* JADX INFO: renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f3576xa1df5c61;

        static {
            int[] iArr = new int[z110.values().length];
            f3576xa1df5c61 = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f3576xa1df5c61[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f3576xa1df5c61[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f3576xa1df5c61[5] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f3576xa1df5c61[6] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f3576xa1df5c61[0] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f3576xa1df5c61[1] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* JADX INFO: loaded from: classes6.dex */
    public static final class Builder extends AbstractC0268g implements GetSuggestedPromptsRequestOrBuilder {
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

        public final Builder clearCurrentTrackUri() {
            copyOnWrite();
            ((GetSuggestedPromptsRequest) this.instance).clearCurrentTrackUri();
            return this;
        }

        public final Builder clearLlmModel() {
            copyOnWrite();
            GetSuggestedPromptsRequest.m9440o((GetSuggestedPromptsRequest) this.instance);
            return this;
        }

        public final Builder clearUnused() {
            copyOnWrite();
            GetSuggestedPromptsRequest.m9441p((GetSuggestedPromptsRequest) this.instance);
            return this;
        }

        @Override // com.google.protobuf.AbstractC0268g
        /* JADX INFO: renamed from: clone */
        public final /* bridge */ /* synthetic */ Object mo98328clone() {
            return super.mo98326clone();
        }

        @Override // com.spotify.p060dj.interactionmanager.p061v0.GetSuggestedPromptsRequestOrBuilder
        public final String getCurrentTrackUri() {
            return ((GetSuggestedPromptsRequest) this.instance).getCurrentTrackUri();
        }

        @Override // com.spotify.p060dj.interactionmanager.p061v0.GetSuggestedPromptsRequestOrBuilder
        public final gva getCurrentTrackUriBytes() {
            return ((GetSuggestedPromptsRequest) this.instance).getCurrentTrackUriBytes();
        }

        @Override // com.google.protobuf.AbstractC0268g, p204p.sre0
        public final /* bridge */ /* synthetic */ pre0 getDefaultInstanceForType() {
            return super.getDefaultInstanceForType();
        }

        @Override // com.spotify.p060dj.interactionmanager.p061v0.GetSuggestedPromptsRequestOrBuilder
        public final Model getLlmModel() {
            return ((GetSuggestedPromptsRequest) this.instance).getLlmModel();
        }

        @Override // com.spotify.p060dj.interactionmanager.p061v0.GetSuggestedPromptsRequestOrBuilder
        public final int getLlmModelValue() {
            return ((GetSuggestedPromptsRequest) this.instance).getLlmModelValue();
        }

        @Override // com.spotify.p060dj.interactionmanager.p061v0.GetSuggestedPromptsRequestOrBuilder
        public final boolean getUnused() {
            return ((GetSuggestedPromptsRequest) this.instance).getUnused();
        }

        @Override // com.google.protobuf.AbstractC0268g, p204p.AbstractC2081l8
        public final /* bridge */ /* synthetic */ AbstractC2081l8 internalMergeFrom(AbstractC2118m8 abstractC2118m8) {
            return super.internalMergeFrom((AbstractC0269h) abstractC2118m8);
        }

        @Override // com.google.protobuf.AbstractC0268g, p204p.AbstractC2081l8, p204p.ore0
        public final /* bridge */ /* synthetic */ AbstractC2081l8 mergeFrom(owe oweVar, aux auxVar) {
            return super.mergeFrom(oweVar, auxVar);
        }

        public final Builder setCurrentTrackUri(String str) {
            copyOnWrite();
            ((GetSuggestedPromptsRequest) this.instance).setCurrentTrackUri(str);
            return this;
        }

        public final Builder setCurrentTrackUriBytes(gva gvaVar) {
            copyOnWrite();
            ((GetSuggestedPromptsRequest) this.instance).setCurrentTrackUriBytes(gvaVar);
            return this;
        }

        public final Builder setLlmModel(Model model) {
            copyOnWrite();
            ((GetSuggestedPromptsRequest) this.instance).setLlmModel(model);
            return this;
        }

        public final Builder setLlmModelValue(int i) {
            copyOnWrite();
            GetSuggestedPromptsRequest.m9445t((GetSuggestedPromptsRequest) this.instance, i);
            return this;
        }

        public final Builder setUnused(boolean z) {
            copyOnWrite();
            GetSuggestedPromptsRequest.m9446u((GetSuggestedPromptsRequest) this.instance, z);
            return this;
        }

        private Builder() {
            super(GetSuggestedPromptsRequest.DEFAULT_INSTANCE);
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
        GetSuggestedPromptsRequest getSuggestedPromptsRequest = new GetSuggestedPromptsRequest();
        DEFAULT_INSTANCE = getSuggestedPromptsRequest;
        AbstractC0269h.registerDefaultInstance(GetSuggestedPromptsRequest.class, getSuggestedPromptsRequest);
    }

    private GetSuggestedPromptsRequest() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCurrentTrackUri() {
        this.currentTrackUri_ = DEFAULT_INSTANCE.currentTrackUri_;
    }

    private void clearLlmModel() {
        this.llmModel_ = 0;
    }

    private void clearUnused() {
        this.unused_ = false;
    }

    public static GetSuggestedPromptsRequest getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    /* JADX INFO: renamed from: o */
    public static void m9440o(GetSuggestedPromptsRequest getSuggestedPromptsRequest) {
        getSuggestedPromptsRequest.llmModel_ = 0;
    }

    /* JADX INFO: renamed from: p */
    public static void m9441p(GetSuggestedPromptsRequest getSuggestedPromptsRequest) {
        getSuggestedPromptsRequest.unused_ = false;
    }

    public static GetSuggestedPromptsRequest parseDelimitedFrom(InputStream inputStream) {
        return (GetSuggestedPromptsRequest) AbstractC0269h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static GetSuggestedPromptsRequest parseFrom(ByteBuffer byteBuffer) {
        return (GetSuggestedPromptsRequest) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCurrentTrackUri(String str) {
        str.getClass();
        this.currentTrackUri_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCurrentTrackUriBytes(gva gvaVar) {
        AbstractC2118m8.checkByteStringIsUtf8(gvaVar);
        this.currentTrackUri_ = gvaVar.m45892u();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLlmModel(Model model) {
        this.llmModel_ = model.getNumber();
    }

    private void setLlmModelValue(int i) {
        this.llmModel_ = i;
    }

    private void setUnused(boolean z) {
        this.unused_ = z;
    }

    /* JADX INFO: renamed from: t */
    public static void m9445t(GetSuggestedPromptsRequest getSuggestedPromptsRequest, int i) {
        getSuggestedPromptsRequest.llmModel_ = i;
    }

    /* JADX INFO: renamed from: u */
    public static void m9446u(GetSuggestedPromptsRequest getSuggestedPromptsRequest, boolean z) {
        getSuggestedPromptsRequest.unused_ = z;
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0007\u0002\f\u0003Ȉ", new Object[]{"unused_", "llmModel_", "currentTrackUri_"});
        }
        if (iOrdinal == 3) {
            return new GetSuggestedPromptsRequest();
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
        synchronized (GetSuggestedPromptsRequest.class) {
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

    @Override // com.spotify.p060dj.interactionmanager.p061v0.GetSuggestedPromptsRequestOrBuilder
    public final String getCurrentTrackUri() {
        return this.currentTrackUri_;
    }

    @Override // com.spotify.p060dj.interactionmanager.p061v0.GetSuggestedPromptsRequestOrBuilder
    public final gva getCurrentTrackUriBytes() {
        return gva.m45888f(this.currentTrackUri_);
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.sre0
    public final /* bridge */ /* synthetic */ pre0 getDefaultInstanceForType() {
        return getDefaultInstanceForType();
    }

    @Override // com.spotify.p060dj.interactionmanager.p061v0.GetSuggestedPromptsRequestOrBuilder
    public final Model getLlmModel() {
        Model modelForNumber = Model.forNumber(this.llmModel_);
        return modelForNumber == null ? Model.UNRECOGNIZED : modelForNumber;
    }

    @Override // com.spotify.p060dj.interactionmanager.p061v0.GetSuggestedPromptsRequestOrBuilder
    public final int getLlmModelValue() {
        return this.llmModel_;
    }

    @Override // com.spotify.p060dj.interactionmanager.p061v0.GetSuggestedPromptsRequestOrBuilder
    public final boolean getUnused() {
        return this.unused_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }

    public static Builder newBuilder(GetSuggestedPromptsRequest getSuggestedPromptsRequest) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(getSuggestedPromptsRequest);
    }

    public static GetSuggestedPromptsRequest parseDelimitedFrom(InputStream inputStream, aux auxVar) {
        return (GetSuggestedPromptsRequest) AbstractC0269h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, auxVar);
    }

    public static GetSuggestedPromptsRequest parseFrom(ByteBuffer byteBuffer, aux auxVar) {
        return (GetSuggestedPromptsRequest) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, byteBuffer, auxVar);
    }

    public static GetSuggestedPromptsRequest parseFrom(gva gvaVar) {
        return (GetSuggestedPromptsRequest) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, gvaVar);
    }

    public static GetSuggestedPromptsRequest parseFrom(gva gvaVar, aux auxVar) {
        return (GetSuggestedPromptsRequest) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, gvaVar, auxVar);
    }

    public static GetSuggestedPromptsRequest parseFrom(byte[] bArr) {
        return (GetSuggestedPromptsRequest) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static GetSuggestedPromptsRequest parseFrom(byte[] bArr, aux auxVar) {
        return (GetSuggestedPromptsRequest) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr, auxVar);
    }

    public static GetSuggestedPromptsRequest parseFrom(InputStream inputStream) {
        return (GetSuggestedPromptsRequest) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static GetSuggestedPromptsRequest parseFrom(InputStream inputStream, aux auxVar) {
        return (GetSuggestedPromptsRequest) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, inputStream, auxVar);
    }

    public static GetSuggestedPromptsRequest parseFrom(owe oweVar) {
        return (GetSuggestedPromptsRequest) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, oweVar);
    }

    public static GetSuggestedPromptsRequest parseFrom(owe oweVar, aux auxVar) {
        return (GetSuggestedPromptsRequest) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, oweVar, auxVar);
    }
}
