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
public final class ChatMessagePreferences extends AbstractC0269h implements ChatMessagePreferencesOrBuilder {
    private static final ChatMessagePreferences DEFAULT_INSTANCE;
    public static final int EXCLUDED_URIS_FIELD_NUMBER = 1;
    public static final int INCLUDED_URIS_FIELD_NUMBER = 2;
    private static volatile r2n0 PARSER;
    private ae50 excludedUris_ = AbstractC0269h.emptyProtobufList();
    private ae50 includedUris_ = AbstractC0269h.emptyProtobufList();

    /* JADX INFO: renamed from: com.spotify.playlist.ai.creation.v2.ChatMessagePreferences$1 */
    public static /* synthetic */ class C11741 {

        /* JADX INFO: renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f6429xa1df5c61;

        static {
            int[] iArr = new int[z110.values().length];
            f6429xa1df5c61 = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f6429xa1df5c61[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f6429xa1df5c61[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f6429xa1df5c61[5] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f6429xa1df5c61[6] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f6429xa1df5c61[0] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f6429xa1df5c61[1] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class Builder extends AbstractC0268g implements ChatMessagePreferencesOrBuilder {
        public /* synthetic */ Builder(int i) {
            this();
        }

        public final Builder addAllExcludedUris(Iterable<String> iterable) {
            copyOnWrite();
            ((ChatMessagePreferences) this.instance).addAllExcludedUris(iterable);
            return this;
        }

        public final Builder addAllIncludedUris(Iterable<String> iterable) {
            copyOnWrite();
            ((ChatMessagePreferences) this.instance).addAllIncludedUris(iterable);
            return this;
        }

        public final Builder addExcludedUris(String str) {
            copyOnWrite();
            ((ChatMessagePreferences) this.instance).addExcludedUris(str);
            return this;
        }

        public final Builder addExcludedUrisBytes(gva gvaVar) {
            copyOnWrite();
            ((ChatMessagePreferences) this.instance).addExcludedUrisBytes(gvaVar);
            return this;
        }

        public final Builder addIncludedUris(String str) {
            copyOnWrite();
            ((ChatMessagePreferences) this.instance).addIncludedUris(str);
            return this;
        }

        public final Builder addIncludedUrisBytes(gva gvaVar) {
            copyOnWrite();
            ((ChatMessagePreferences) this.instance).addIncludedUrisBytes(gvaVar);
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

        public final Builder clearExcludedUris() {
            copyOnWrite();
            ((ChatMessagePreferences) this.instance).clearExcludedUris();
            return this;
        }

        public final Builder clearIncludedUris() {
            copyOnWrite();
            ((ChatMessagePreferences) this.instance).clearIncludedUris();
            return this;
        }

        @Override // com.google.protobuf.AbstractC0268g
        /* JADX INFO: renamed from: clone */
        public final /* bridge */ /* synthetic */ Object mo98327clone() {
            return super.mo98326clone();
        }

        @Override // com.google.protobuf.AbstractC0268g, p204p.sre0
        public final /* bridge */ /* synthetic */ pre0 getDefaultInstanceForType() {
            return super.getDefaultInstanceForType();
        }

        @Override // com.spotify.playlist.p126ai.creation.p127v2.ChatMessagePreferencesOrBuilder
        public final String getExcludedUris(int i) {
            return ((ChatMessagePreferences) this.instance).getExcludedUris(i);
        }

        @Override // com.spotify.playlist.p126ai.creation.p127v2.ChatMessagePreferencesOrBuilder
        public final gva getExcludedUrisBytes(int i) {
            return ((ChatMessagePreferences) this.instance).getExcludedUrisBytes(i);
        }

        @Override // com.spotify.playlist.p126ai.creation.p127v2.ChatMessagePreferencesOrBuilder
        public final int getExcludedUrisCount() {
            return ((ChatMessagePreferences) this.instance).getExcludedUrisCount();
        }

        @Override // com.spotify.playlist.p126ai.creation.p127v2.ChatMessagePreferencesOrBuilder
        public final List<String> getExcludedUrisList() {
            return Collections.unmodifiableList(((ChatMessagePreferences) this.instance).getExcludedUrisList());
        }

        @Override // com.spotify.playlist.p126ai.creation.p127v2.ChatMessagePreferencesOrBuilder
        public final String getIncludedUris(int i) {
            return ((ChatMessagePreferences) this.instance).getIncludedUris(i);
        }

        @Override // com.spotify.playlist.p126ai.creation.p127v2.ChatMessagePreferencesOrBuilder
        public final gva getIncludedUrisBytes(int i) {
            return ((ChatMessagePreferences) this.instance).getIncludedUrisBytes(i);
        }

        @Override // com.spotify.playlist.p126ai.creation.p127v2.ChatMessagePreferencesOrBuilder
        public final int getIncludedUrisCount() {
            return ((ChatMessagePreferences) this.instance).getIncludedUrisCount();
        }

        @Override // com.spotify.playlist.p126ai.creation.p127v2.ChatMessagePreferencesOrBuilder
        public final List<String> getIncludedUrisList() {
            return Collections.unmodifiableList(((ChatMessagePreferences) this.instance).getIncludedUrisList());
        }

        @Override // com.google.protobuf.AbstractC0268g, p204p.AbstractC2081l8
        public final /* bridge */ /* synthetic */ AbstractC2081l8 internalMergeFrom(AbstractC2118m8 abstractC2118m8) {
            return super.internalMergeFrom((AbstractC0269h) abstractC2118m8);
        }

        @Override // com.google.protobuf.AbstractC0268g, p204p.AbstractC2081l8, p204p.ore0
        public final /* bridge */ /* synthetic */ AbstractC2081l8 mergeFrom(owe oweVar, aux auxVar) {
            return super.mergeFrom(oweVar, auxVar);
        }

        public final Builder setExcludedUris(int i, String str) {
            copyOnWrite();
            ((ChatMessagePreferences) this.instance).setExcludedUris(i, str);
            return this;
        }

        public final Builder setIncludedUris(int i, String str) {
            copyOnWrite();
            ((ChatMessagePreferences) this.instance).setIncludedUris(i, str);
            return this;
        }

        private Builder() {
            super(ChatMessagePreferences.DEFAULT_INSTANCE);
        }

        @Override // com.google.protobuf.AbstractC0268g
        /* JADX INFO: renamed from: clone */
        public final /* bridge */ /* synthetic */ AbstractC2081l8 mo98328clone() {
            return super.mo98326clone();
        }

        @Override // com.google.protobuf.AbstractC0268g, p204p.AbstractC2081l8
        /* JADX INFO: renamed from: mergeFrom */
        public final /* bridge */ /* synthetic */ AbstractC2081l8 mo98329mergeFrom(byte[] bArr, int i, int i2) {
            return super.mo98329mergeFrom(bArr, i, i2);
        }

        @Override // com.google.protobuf.AbstractC0268g
        /* JADX INFO: renamed from: clone */
        public final /* bridge */ /* synthetic */ ore0 mo98328clone() {
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
        ChatMessagePreferences chatMessagePreferences = new ChatMessagePreferences();
        DEFAULT_INSTANCE = chatMessagePreferences;
        AbstractC0269h.registerDefaultInstance(ChatMessagePreferences.class, chatMessagePreferences);
    }

    private ChatMessagePreferences() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllExcludedUris(Iterable<String> iterable) {
        ensureExcludedUrisIsMutable();
        AbstractC2118m8.addAll(iterable, this.excludedUris_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllIncludedUris(Iterable<String> iterable) {
        ensureIncludedUrisIsMutable();
        AbstractC2118m8.addAll(iterable, this.includedUris_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addExcludedUris(String str) {
        str.getClass();
        ensureExcludedUrisIsMutable();
        this.excludedUris_.add(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addExcludedUrisBytes(gva gvaVar) {
        AbstractC2118m8.checkByteStringIsUtf8(gvaVar);
        ensureExcludedUrisIsMutable();
        this.excludedUris_.add(gvaVar.m45892u());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addIncludedUris(String str) {
        str.getClass();
        ensureIncludedUrisIsMutable();
        this.includedUris_.add(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addIncludedUrisBytes(gva gvaVar) {
        AbstractC2118m8.checkByteStringIsUtf8(gvaVar);
        ensureIncludedUrisIsMutable();
        this.includedUris_.add(gvaVar.m45892u());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearExcludedUris() {
        this.excludedUris_ = AbstractC0269h.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIncludedUris() {
        this.includedUris_ = AbstractC0269h.emptyProtobufList();
    }

    private void ensureExcludedUrisIsMutable() {
        ae50 ae50Var = this.excludedUris_;
        if (((AbstractC1733c9) ae50Var).f35342a) {
            return;
        }
        this.excludedUris_ = AbstractC0269h.mutableCopy(ae50Var);
    }

    private void ensureIncludedUrisIsMutable() {
        ae50 ae50Var = this.includedUris_;
        if (((AbstractC1733c9) ae50Var).f35342a) {
            return;
        }
        this.includedUris_ = AbstractC0269h.mutableCopy(ae50Var);
    }

    public static ChatMessagePreferences getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static ChatMessagePreferences parseDelimitedFrom(InputStream inputStream) {
        return (ChatMessagePreferences) AbstractC0269h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ChatMessagePreferences parseFrom(ByteBuffer byteBuffer) {
        return (ChatMessagePreferences) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setExcludedUris(int i, String str) {
        str.getClass();
        ensureExcludedUrisIsMutable();
        this.excludedUris_.set(i, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIncludedUris(int i, String str) {
        str.getClass();
        ensureIncludedUrisIsMutable();
        this.includedUris_.set(i, str);
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0002\u0000\u0001Ț\u0002Ț", new Object[]{"excludedUris_", "includedUris_"});
        }
        if (iOrdinal == 3) {
            return new ChatMessagePreferences();
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
        synchronized (ChatMessagePreferences.class) {
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

    @Override // com.spotify.playlist.p126ai.creation.p127v2.ChatMessagePreferencesOrBuilder
    public final String getExcludedUris(int i) {
        return (String) this.excludedUris_.get(i);
    }

    @Override // com.spotify.playlist.p126ai.creation.p127v2.ChatMessagePreferencesOrBuilder
    public final gva getExcludedUrisBytes(int i) {
        return gva.m45888f((String) this.excludedUris_.get(i));
    }

    @Override // com.spotify.playlist.p126ai.creation.p127v2.ChatMessagePreferencesOrBuilder
    public final int getExcludedUrisCount() {
        return this.excludedUris_.size();
    }

    @Override // com.spotify.playlist.p126ai.creation.p127v2.ChatMessagePreferencesOrBuilder
    public final List<String> getExcludedUrisList() {
        return this.excludedUris_;
    }

    @Override // com.spotify.playlist.p126ai.creation.p127v2.ChatMessagePreferencesOrBuilder
    public final String getIncludedUris(int i) {
        return (String) this.includedUris_.get(i);
    }

    @Override // com.spotify.playlist.p126ai.creation.p127v2.ChatMessagePreferencesOrBuilder
    public final gva getIncludedUrisBytes(int i) {
        return gva.m45888f((String) this.includedUris_.get(i));
    }

    @Override // com.spotify.playlist.p126ai.creation.p127v2.ChatMessagePreferencesOrBuilder
    public final int getIncludedUrisCount() {
        return this.includedUris_.size();
    }

    @Override // com.spotify.playlist.p126ai.creation.p127v2.ChatMessagePreferencesOrBuilder
    public final List<String> getIncludedUrisList() {
        return this.includedUris_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }

    public static Builder newBuilder(ChatMessagePreferences chatMessagePreferences) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(chatMessagePreferences);
    }

    public static ChatMessagePreferences parseDelimitedFrom(InputStream inputStream, aux auxVar) {
        return (ChatMessagePreferences) AbstractC0269h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, auxVar);
    }

    public static ChatMessagePreferences parseFrom(ByteBuffer byteBuffer, aux auxVar) {
        return (ChatMessagePreferences) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, byteBuffer, auxVar);
    }

    public static ChatMessagePreferences parseFrom(gva gvaVar) {
        return (ChatMessagePreferences) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, gvaVar);
    }

    public static ChatMessagePreferences parseFrom(gva gvaVar, aux auxVar) {
        return (ChatMessagePreferences) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, gvaVar, auxVar);
    }

    public static ChatMessagePreferences parseFrom(byte[] bArr) {
        return (ChatMessagePreferences) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ChatMessagePreferences parseFrom(byte[] bArr, aux auxVar) {
        return (ChatMessagePreferences) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr, auxVar);
    }

    public static ChatMessagePreferences parseFrom(InputStream inputStream) {
        return (ChatMessagePreferences) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ChatMessagePreferences parseFrom(InputStream inputStream, aux auxVar) {
        return (ChatMessagePreferences) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, inputStream, auxVar);
    }

    public static ChatMessagePreferences parseFrom(owe oweVar) {
        return (ChatMessagePreferences) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, oweVar);
    }

    public static ChatMessagePreferences parseFrom(owe oweVar, aux auxVar) {
        return (ChatMessagePreferences) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, oweVar, auxVar);
    }
}
