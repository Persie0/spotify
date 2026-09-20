package com.spotify.playlist.p126ai.creation.p127v2;

import com.google.protobuf.AbstractC0268g;
import com.google.protobuf.AbstractC0269h;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;
import p204p.AbstractC1733c9;
import p204p.AbstractC2081l8;
import p204p.AbstractC2118m8;
import p204p.ae50;
import p204p.aux;
import p204p.gva;
import p204p.ore0;
import p204p.owe;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.z110;

/* JADX INFO: loaded from: classes9.dex */
public final class CreateSessionResponse extends AbstractC0269h implements CreateSessionResponseOrBuilder {
    private static final CreateSessionResponse DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER = null;
    public static final int POPULAR_PROMPTS_FIELD_NUMBER = 3;
    public static final int SESSION_ID_FIELD_NUMBER = 1;
    public static final int SUGGESTED_PROMPTS_FIELD_NUMBER = 2;
    private String sessionId_ = "";
    private ae50 suggestedPrompts_ = AbstractC0269h.emptyProtobufList();
    private ae50 popularPrompts_ = AbstractC0269h.emptyProtobufList();

    /* JADX INFO: renamed from: com.spotify.playlist.ai.creation.v2.CreateSessionResponse$1 */
    public static /* synthetic */ class C11771 {

        /* JADX INFO: renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f6432xa1df5c61;

        static {
            int[] iArr = new int[z110.values().length];
            f6432xa1df5c61 = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f6432xa1df5c61[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f6432xa1df5c61[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f6432xa1df5c61[5] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f6432xa1df5c61[6] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f6432xa1df5c61[0] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f6432xa1df5c61[1] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class Builder extends AbstractC0268g implements CreateSessionResponseOrBuilder {
        public /* synthetic */ Builder(int i) {
            this();
        }

        public final Builder addAllPopularPrompts(Iterable<String> iterable) {
            copyOnWrite();
            ((CreateSessionResponse) this.instance).addAllPopularPrompts(iterable);
            return this;
        }

        public final Builder addAllSuggestedPrompts(Iterable<String> iterable) {
            copyOnWrite();
            ((CreateSessionResponse) this.instance).addAllSuggestedPrompts(iterable);
            return this;
        }

        public final Builder addPopularPrompts(String str) {
            copyOnWrite();
            ((CreateSessionResponse) this.instance).addPopularPrompts(str);
            return this;
        }

        public final Builder addPopularPromptsBytes(gva gvaVar) {
            copyOnWrite();
            ((CreateSessionResponse) this.instance).addPopularPromptsBytes(gvaVar);
            return this;
        }

        public final Builder addSuggestedPrompts(String str) {
            copyOnWrite();
            ((CreateSessionResponse) this.instance).addSuggestedPrompts(str);
            return this;
        }

        public final Builder addSuggestedPromptsBytes(gva gvaVar) {
            copyOnWrite();
            ((CreateSessionResponse) this.instance).addSuggestedPromptsBytes(gvaVar);
            return this;
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

        public final Builder clearPopularPrompts() {
            copyOnWrite();
            ((CreateSessionResponse) this.instance).clearPopularPrompts();
            return this;
        }

        public final Builder clearSessionId() {
            copyOnWrite();
            ((CreateSessionResponse) this.instance).clearSessionId();
            return this;
        }

        public final Builder clearSuggestedPrompts() {
            copyOnWrite();
            ((CreateSessionResponse) this.instance).clearSuggestedPrompts();
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

        @Override // com.spotify.playlist.p126ai.creation.p127v2.CreateSessionResponseOrBuilder
        public final String getPopularPrompts(int i) {
            return ((CreateSessionResponse) this.instance).getPopularPrompts(i);
        }

        @Override // com.spotify.playlist.p126ai.creation.p127v2.CreateSessionResponseOrBuilder
        public final gva getPopularPromptsBytes(int i) {
            return ((CreateSessionResponse) this.instance).getPopularPromptsBytes(i);
        }

        @Override // com.spotify.playlist.p126ai.creation.p127v2.CreateSessionResponseOrBuilder
        public final int getPopularPromptsCount() {
            return ((CreateSessionResponse) this.instance).getPopularPromptsCount();
        }

        @Override // com.spotify.playlist.p126ai.creation.p127v2.CreateSessionResponseOrBuilder
        public final List<String> getPopularPromptsList() {
            return Collections.unmodifiableList(((CreateSessionResponse) this.instance).getPopularPromptsList());
        }

        @Override // com.spotify.playlist.p126ai.creation.p127v2.CreateSessionResponseOrBuilder
        public final String getSessionId() {
            return ((CreateSessionResponse) this.instance).getSessionId();
        }

        @Override // com.spotify.playlist.p126ai.creation.p127v2.CreateSessionResponseOrBuilder
        public final gva getSessionIdBytes() {
            return ((CreateSessionResponse) this.instance).getSessionIdBytes();
        }

        @Override // com.spotify.playlist.p126ai.creation.p127v2.CreateSessionResponseOrBuilder
        public final String getSuggestedPrompts(int i) {
            return ((CreateSessionResponse) this.instance).getSuggestedPrompts(i);
        }

        @Override // com.spotify.playlist.p126ai.creation.p127v2.CreateSessionResponseOrBuilder
        public final gva getSuggestedPromptsBytes(int i) {
            return ((CreateSessionResponse) this.instance).getSuggestedPromptsBytes(i);
        }

        @Override // com.spotify.playlist.p126ai.creation.p127v2.CreateSessionResponseOrBuilder
        public final int getSuggestedPromptsCount() {
            return ((CreateSessionResponse) this.instance).getSuggestedPromptsCount();
        }

        @Override // com.spotify.playlist.p126ai.creation.p127v2.CreateSessionResponseOrBuilder
        public final List<String> getSuggestedPromptsList() {
            return Collections.unmodifiableList(((CreateSessionResponse) this.instance).getSuggestedPromptsList());
        }

        @Override // com.google.protobuf.AbstractC0268g, p204p.AbstractC2081l8
        public final /* bridge */ /* synthetic */ AbstractC2081l8 internalMergeFrom(AbstractC2118m8 abstractC2118m8) {
            return super.internalMergeFrom((AbstractC0269h) abstractC2118m8);
        }

        @Override // com.google.protobuf.AbstractC0268g, p204p.AbstractC2081l8, p204p.ore0
        public final /* bridge */ /* synthetic */ AbstractC2081l8 mergeFrom(owe oweVar, aux auxVar) {
            return super.mergeFrom(oweVar, auxVar);
        }

        public final Builder setPopularPrompts(int i, String str) {
            copyOnWrite();
            ((CreateSessionResponse) this.instance).setPopularPrompts(i, str);
            return this;
        }

        public final Builder setSessionId(String str) {
            copyOnWrite();
            ((CreateSessionResponse) this.instance).setSessionId(str);
            return this;
        }

        public final Builder setSessionIdBytes(gva gvaVar) {
            copyOnWrite();
            ((CreateSessionResponse) this.instance).setSessionIdBytes(gvaVar);
            return this;
        }

        public final Builder setSuggestedPrompts(int i, String str) {
            copyOnWrite();
            ((CreateSessionResponse) this.instance).setSuggestedPrompts(i, str);
            return this;
        }

        private Builder() {
            super(CreateSessionResponse.DEFAULT_INSTANCE);
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
        CreateSessionResponse createSessionResponse = new CreateSessionResponse();
        DEFAULT_INSTANCE = createSessionResponse;
        AbstractC0269h.registerDefaultInstance(CreateSessionResponse.class, createSessionResponse);
    }

    private CreateSessionResponse() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllPopularPrompts(Iterable<String> iterable) {
        ensurePopularPromptsIsMutable();
        AbstractC2118m8.addAll(iterable, this.popularPrompts_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllSuggestedPrompts(Iterable<String> iterable) {
        ensureSuggestedPromptsIsMutable();
        AbstractC2118m8.addAll(iterable, this.suggestedPrompts_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addPopularPrompts(String str) {
        str.getClass();
        ensurePopularPromptsIsMutable();
        this.popularPrompts_.add(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addPopularPromptsBytes(gva gvaVar) {
        AbstractC2118m8.checkByteStringIsUtf8(gvaVar);
        ensurePopularPromptsIsMutable();
        this.popularPrompts_.add(gvaVar.m45892u());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addSuggestedPrompts(String str) {
        str.getClass();
        ensureSuggestedPromptsIsMutable();
        this.suggestedPrompts_.add(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addSuggestedPromptsBytes(gva gvaVar) {
        AbstractC2118m8.checkByteStringIsUtf8(gvaVar);
        ensureSuggestedPromptsIsMutable();
        this.suggestedPrompts_.add(gvaVar.m45892u());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPopularPrompts() {
        this.popularPrompts_ = AbstractC0269h.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSessionId() {
        this.sessionId_ = DEFAULT_INSTANCE.sessionId_;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSuggestedPrompts() {
        this.suggestedPrompts_ = AbstractC0269h.emptyProtobufList();
    }

    private void ensurePopularPromptsIsMutable() {
        ae50 ae50Var = this.popularPrompts_;
        if (((AbstractC1733c9) ae50Var).f35342a) {
            return;
        }
        this.popularPrompts_ = AbstractC0269h.mutableCopy(ae50Var);
    }

    private void ensureSuggestedPromptsIsMutable() {
        ae50 ae50Var = this.suggestedPrompts_;
        if (((AbstractC1733c9) ae50Var).f35342a) {
            return;
        }
        this.suggestedPrompts_ = AbstractC0269h.mutableCopy(ae50Var);
    }

    public static CreateSessionResponse getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static CreateSessionResponse parseDelimitedFrom(InputStream inputStream) {
        return (CreateSessionResponse) AbstractC0269h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static CreateSessionResponse parseFrom(ByteBuffer byteBuffer) {
        return (CreateSessionResponse) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPopularPrompts(int i, String str) {
        str.getClass();
        ensurePopularPromptsIsMutable();
        this.popularPrompts_.set(i, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSessionId(String str) {
        str.getClass();
        this.sessionId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSessionIdBytes(gva gvaVar) {
        AbstractC2118m8.checkByteStringIsUtf8(gvaVar);
        this.sessionId_ = gvaVar.m45892u();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSuggestedPrompts(int i, String str) {
        str.getClass();
        ensureSuggestedPromptsIsMutable();
        this.suggestedPrompts_.set(i, str);
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0002\u0000\u0001Ȉ\u0002Ț\u0003Ț", new Object[]{"sessionId_", "suggestedPrompts_", "popularPrompts_"});
        }
        if (iOrdinal == 3) {
            return new CreateSessionResponse();
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
        synchronized (CreateSessionResponse.class) {
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

    @Override // com.spotify.playlist.p126ai.creation.p127v2.CreateSessionResponseOrBuilder
    public final String getPopularPrompts(int i) {
        return (String) this.popularPrompts_.get(i);
    }

    @Override // com.spotify.playlist.p126ai.creation.p127v2.CreateSessionResponseOrBuilder
    public final gva getPopularPromptsBytes(int i) {
        return gva.m45888f((String) this.popularPrompts_.get(i));
    }

    @Override // com.spotify.playlist.p126ai.creation.p127v2.CreateSessionResponseOrBuilder
    public final int getPopularPromptsCount() {
        return this.popularPrompts_.size();
    }

    @Override // com.spotify.playlist.p126ai.creation.p127v2.CreateSessionResponseOrBuilder
    public final List<String> getPopularPromptsList() {
        return this.popularPrompts_;
    }

    @Override // com.spotify.playlist.p126ai.creation.p127v2.CreateSessionResponseOrBuilder
    public final String getSessionId() {
        return this.sessionId_;
    }

    @Override // com.spotify.playlist.p126ai.creation.p127v2.CreateSessionResponseOrBuilder
    public final gva getSessionIdBytes() {
        return gva.m45888f(this.sessionId_);
    }

    @Override // com.spotify.playlist.p126ai.creation.p127v2.CreateSessionResponseOrBuilder
    public final String getSuggestedPrompts(int i) {
        return (String) this.suggestedPrompts_.get(i);
    }

    @Override // com.spotify.playlist.p126ai.creation.p127v2.CreateSessionResponseOrBuilder
    public final gva getSuggestedPromptsBytes(int i) {
        return gva.m45888f((String) this.suggestedPrompts_.get(i));
    }

    @Override // com.spotify.playlist.p126ai.creation.p127v2.CreateSessionResponseOrBuilder
    public final int getSuggestedPromptsCount() {
        return this.suggestedPrompts_.size();
    }

    @Override // com.spotify.playlist.p126ai.creation.p127v2.CreateSessionResponseOrBuilder
    public final List<String> getSuggestedPromptsList() {
        return this.suggestedPrompts_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }

    public static Builder newBuilder(CreateSessionResponse createSessionResponse) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(createSessionResponse);
    }

    public static CreateSessionResponse parseDelimitedFrom(InputStream inputStream, aux auxVar) {
        return (CreateSessionResponse) AbstractC0269h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, auxVar);
    }

    public static CreateSessionResponse parseFrom(ByteBuffer byteBuffer, aux auxVar) {
        return (CreateSessionResponse) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, byteBuffer, auxVar);
    }

    public static CreateSessionResponse parseFrom(gva gvaVar) {
        return (CreateSessionResponse) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, gvaVar);
    }

    public static CreateSessionResponse parseFrom(gva gvaVar, aux auxVar) {
        return (CreateSessionResponse) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, gvaVar, auxVar);
    }

    public static CreateSessionResponse parseFrom(byte[] bArr) {
        return (CreateSessionResponse) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static CreateSessionResponse parseFrom(byte[] bArr, aux auxVar) {
        return (CreateSessionResponse) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr, auxVar);
    }

    public static CreateSessionResponse parseFrom(InputStream inputStream) {
        return (CreateSessionResponse) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static CreateSessionResponse parseFrom(InputStream inputStream, aux auxVar) {
        return (CreateSessionResponse) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, inputStream, auxVar);
    }

    public static CreateSessionResponse parseFrom(owe oweVar) {
        return (CreateSessionResponse) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, oweVar);
    }

    public static CreateSessionResponse parseFrom(owe oweVar, aux auxVar) {
        return (CreateSessionResponse) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, oweVar, auxVar);
    }
}
