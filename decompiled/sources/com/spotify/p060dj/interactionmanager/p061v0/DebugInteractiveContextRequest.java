package com.spotify.p060dj.interactionmanager.p061v0;

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

/* JADX INFO: loaded from: classes6.dex */
public final class DebugInteractiveContextRequest extends AbstractC0269h implements DebugInteractiveContextRequestOrBuilder {
    public static final int ACK_SYSTEM_PROMPT_OVERRIDE_FIELD_NUMBER = 10;
    public static final int ASSISTANT_NAME_FIELD_NUMBER = 2;
    public static final int ASSISTANT_TAGS_FIELD_NUMBER = 5;
    public static final int ASSISTANT_VERSION_FIELD_NUMBER = 3;
    private static final DebugInteractiveContextRequest DEFAULT_INSTANCE;
    public static final int IGNORE_PROMPT_SAFETY_VIOLATION_FIELD_NUMBER = 4;
    public static final int INTRO_SYSTEM_PROMPT_OVERRIDE_FIELD_NUMBER = 11;
    private static volatile r2n0 PARSER = null;
    public static final int PROMPT_FIELD_NUMBER = 1;
    private int bitField0_;
    private boolean ignorePromptSafetyViolation_;
    private String prompt_ = "";
    private String assistantName_ = "";
    private String assistantVersion_ = "";
    private ae50 assistantTags_ = AbstractC0269h.emptyProtobufList();
    private String ackSystemPromptOverride_ = "";
    private String introSystemPromptOverride_ = "";

    /* JADX INFO: renamed from: com.spotify.dj.interactionmanager.v0.DebugInteractiveContextRequest$1 */
    public static /* synthetic */ class C06901 {

        /* JADX INFO: renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f3570xa1df5c61;

        static {
            int[] iArr = new int[z110.values().length];
            f3570xa1df5c61 = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f3570xa1df5c61[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f3570xa1df5c61[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f3570xa1df5c61[5] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f3570xa1df5c61[6] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f3570xa1df5c61[0] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f3570xa1df5c61[1] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class Builder extends AbstractC0268g implements DebugInteractiveContextRequestOrBuilder {
        public /* synthetic */ Builder(int i) {
            this();
        }

        public final Builder addAllAssistantTags(Iterable<String> iterable) {
            copyOnWrite();
            ((DebugInteractiveContextRequest) this.instance).addAllAssistantTags(iterable);
            return this;
        }

        public final Builder addAssistantTags(String str) {
            copyOnWrite();
            ((DebugInteractiveContextRequest) this.instance).addAssistantTags(str);
            return this;
        }

        public final Builder addAssistantTagsBytes(gva gvaVar) {
            copyOnWrite();
            ((DebugInteractiveContextRequest) this.instance).addAssistantTagsBytes(gvaVar);
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

        public final Builder clearAckSystemPromptOverride() {
            copyOnWrite();
            ((DebugInteractiveContextRequest) this.instance).clearAckSystemPromptOverride();
            return this;
        }

        public final Builder clearAssistantName() {
            copyOnWrite();
            ((DebugInteractiveContextRequest) this.instance).clearAssistantName();
            return this;
        }

        public final Builder clearAssistantTags() {
            copyOnWrite();
            ((DebugInteractiveContextRequest) this.instance).clearAssistantTags();
            return this;
        }

        public final Builder clearAssistantVersion() {
            copyOnWrite();
            ((DebugInteractiveContextRequest) this.instance).clearAssistantVersion();
            return this;
        }

        public final Builder clearIgnorePromptSafetyViolation() {
            copyOnWrite();
            DebugInteractiveContextRequest.m9353u((DebugInteractiveContextRequest) this.instance);
            return this;
        }

        public final Builder clearIntroSystemPromptOverride() {
            copyOnWrite();
            ((DebugInteractiveContextRequest) this.instance).clearIntroSystemPromptOverride();
            return this;
        }

        public final Builder clearPrompt() {
            copyOnWrite();
            ((DebugInteractiveContextRequest) this.instance).clearPrompt();
            return this;
        }

        @Override // com.google.protobuf.AbstractC0268g
        /* JADX INFO: renamed from: clone */
        public final /* bridge */ /* synthetic */ Object mo98328clone() {
            return super.mo98326clone();
        }

        @Override // com.spotify.p060dj.interactionmanager.p061v0.DebugInteractiveContextRequestOrBuilder
        public final String getAckSystemPromptOverride() {
            return ((DebugInteractiveContextRequest) this.instance).getAckSystemPromptOverride();
        }

        @Override // com.spotify.p060dj.interactionmanager.p061v0.DebugInteractiveContextRequestOrBuilder
        public final gva getAckSystemPromptOverrideBytes() {
            return ((DebugInteractiveContextRequest) this.instance).getAckSystemPromptOverrideBytes();
        }

        @Override // com.spotify.p060dj.interactionmanager.p061v0.DebugInteractiveContextRequestOrBuilder
        public final String getAssistantName() {
            return ((DebugInteractiveContextRequest) this.instance).getAssistantName();
        }

        @Override // com.spotify.p060dj.interactionmanager.p061v0.DebugInteractiveContextRequestOrBuilder
        public final gva getAssistantNameBytes() {
            return ((DebugInteractiveContextRequest) this.instance).getAssistantNameBytes();
        }

        @Override // com.spotify.p060dj.interactionmanager.p061v0.DebugInteractiveContextRequestOrBuilder
        public final String getAssistantTags(int i) {
            return ((DebugInteractiveContextRequest) this.instance).getAssistantTags(i);
        }

        @Override // com.spotify.p060dj.interactionmanager.p061v0.DebugInteractiveContextRequestOrBuilder
        public final gva getAssistantTagsBytes(int i) {
            return ((DebugInteractiveContextRequest) this.instance).getAssistantTagsBytes(i);
        }

        @Override // com.spotify.p060dj.interactionmanager.p061v0.DebugInteractiveContextRequestOrBuilder
        public final int getAssistantTagsCount() {
            return ((DebugInteractiveContextRequest) this.instance).getAssistantTagsCount();
        }

        @Override // com.spotify.p060dj.interactionmanager.p061v0.DebugInteractiveContextRequestOrBuilder
        public final List<String> getAssistantTagsList() {
            return Collections.unmodifiableList(((DebugInteractiveContextRequest) this.instance).getAssistantTagsList());
        }

        @Override // com.spotify.p060dj.interactionmanager.p061v0.DebugInteractiveContextRequestOrBuilder
        public final String getAssistantVersion() {
            return ((DebugInteractiveContextRequest) this.instance).getAssistantVersion();
        }

        @Override // com.spotify.p060dj.interactionmanager.p061v0.DebugInteractiveContextRequestOrBuilder
        public final gva getAssistantVersionBytes() {
            return ((DebugInteractiveContextRequest) this.instance).getAssistantVersionBytes();
        }

        @Override // com.google.protobuf.AbstractC0268g, p204p.sre0
        public final /* bridge */ /* synthetic */ pre0 getDefaultInstanceForType() {
            return super.getDefaultInstanceForType();
        }

        @Override // com.spotify.p060dj.interactionmanager.p061v0.DebugInteractiveContextRequestOrBuilder
        public final boolean getIgnorePromptSafetyViolation() {
            return ((DebugInteractiveContextRequest) this.instance).getIgnorePromptSafetyViolation();
        }

        @Override // com.spotify.p060dj.interactionmanager.p061v0.DebugInteractiveContextRequestOrBuilder
        public final String getIntroSystemPromptOverride() {
            return ((DebugInteractiveContextRequest) this.instance).getIntroSystemPromptOverride();
        }

        @Override // com.spotify.p060dj.interactionmanager.p061v0.DebugInteractiveContextRequestOrBuilder
        public final gva getIntroSystemPromptOverrideBytes() {
            return ((DebugInteractiveContextRequest) this.instance).getIntroSystemPromptOverrideBytes();
        }

        @Override // com.spotify.p060dj.interactionmanager.p061v0.DebugInteractiveContextRequestOrBuilder
        public final String getPrompt() {
            return ((DebugInteractiveContextRequest) this.instance).getPrompt();
        }

        @Override // com.spotify.p060dj.interactionmanager.p061v0.DebugInteractiveContextRequestOrBuilder
        public final gva getPromptBytes() {
            return ((DebugInteractiveContextRequest) this.instance).getPromptBytes();
        }

        @Override // com.spotify.p060dj.interactionmanager.p061v0.DebugInteractiveContextRequestOrBuilder
        public final boolean hasAckSystemPromptOverride() {
            return ((DebugInteractiveContextRequest) this.instance).hasAckSystemPromptOverride();
        }

        @Override // com.spotify.p060dj.interactionmanager.p061v0.DebugInteractiveContextRequestOrBuilder
        public final boolean hasIntroSystemPromptOverride() {
            return ((DebugInteractiveContextRequest) this.instance).hasIntroSystemPromptOverride();
        }

        @Override // com.google.protobuf.AbstractC0268g, p204p.AbstractC2081l8
        public final /* bridge */ /* synthetic */ AbstractC2081l8 internalMergeFrom(AbstractC2118m8 abstractC2118m8) {
            return super.internalMergeFrom((AbstractC0269h) abstractC2118m8);
        }

        @Override // com.google.protobuf.AbstractC0268g, p204p.AbstractC2081l8, p204p.ore0
        public final /* bridge */ /* synthetic */ AbstractC2081l8 mergeFrom(owe oweVar, aux auxVar) {
            return super.mergeFrom(oweVar, auxVar);
        }

        public final Builder setAckSystemPromptOverride(String str) {
            copyOnWrite();
            ((DebugInteractiveContextRequest) this.instance).setAckSystemPromptOverride(str);
            return this;
        }

        public final Builder setAckSystemPromptOverrideBytes(gva gvaVar) {
            copyOnWrite();
            ((DebugInteractiveContextRequest) this.instance).setAckSystemPromptOverrideBytes(gvaVar);
            return this;
        }

        public final Builder setAssistantName(String str) {
            copyOnWrite();
            ((DebugInteractiveContextRequest) this.instance).setAssistantName(str);
            return this;
        }

        public final Builder setAssistantNameBytes(gva gvaVar) {
            copyOnWrite();
            ((DebugInteractiveContextRequest) this.instance).setAssistantNameBytes(gvaVar);
            return this;
        }

        public final Builder setAssistantTags(int i, String str) {
            copyOnWrite();
            ((DebugInteractiveContextRequest) this.instance).setAssistantTags(i, str);
            return this;
        }

        public final Builder setAssistantVersion(String str) {
            copyOnWrite();
            ((DebugInteractiveContextRequest) this.instance).setAssistantVersion(str);
            return this;
        }

        public final Builder setAssistantVersionBytes(gva gvaVar) {
            copyOnWrite();
            ((DebugInteractiveContextRequest) this.instance).setAssistantVersionBytes(gvaVar);
            return this;
        }

        public final Builder setIgnorePromptSafetyViolation(boolean z) {
            copyOnWrite();
            DebugInteractiveContextRequest.m9340E((DebugInteractiveContextRequest) this.instance, z);
            return this;
        }

        public final Builder setIntroSystemPromptOverride(String str) {
            copyOnWrite();
            ((DebugInteractiveContextRequest) this.instance).setIntroSystemPromptOverride(str);
            return this;
        }

        public final Builder setIntroSystemPromptOverrideBytes(gva gvaVar) {
            copyOnWrite();
            ((DebugInteractiveContextRequest) this.instance).setIntroSystemPromptOverrideBytes(gvaVar);
            return this;
        }

        public final Builder setPrompt(String str) {
            copyOnWrite();
            ((DebugInteractiveContextRequest) this.instance).setPrompt(str);
            return this;
        }

        public final Builder setPromptBytes(gva gvaVar) {
            copyOnWrite();
            ((DebugInteractiveContextRequest) this.instance).setPromptBytes(gvaVar);
            return this;
        }

        private Builder() {
            super(DebugInteractiveContextRequest.DEFAULT_INSTANCE);
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
        DebugInteractiveContextRequest debugInteractiveContextRequest = new DebugInteractiveContextRequest();
        DEFAULT_INSTANCE = debugInteractiveContextRequest;
        AbstractC0269h.registerDefaultInstance(DebugInteractiveContextRequest.class, debugInteractiveContextRequest);
    }

    private DebugInteractiveContextRequest() {
    }

    /* JADX INFO: renamed from: E */
    public static void m9340E(DebugInteractiveContextRequest debugInteractiveContextRequest, boolean z) {
        debugInteractiveContextRequest.ignorePromptSafetyViolation_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllAssistantTags(Iterable<String> iterable) {
        ensureAssistantTagsIsMutable();
        AbstractC2118m8.addAll(iterable, this.assistantTags_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAssistantTags(String str) {
        str.getClass();
        ensureAssistantTagsIsMutable();
        this.assistantTags_.add(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAssistantTagsBytes(gva gvaVar) {
        AbstractC2118m8.checkByteStringIsUtf8(gvaVar);
        ensureAssistantTagsIsMutable();
        this.assistantTags_.add(gvaVar.m45892u());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAckSystemPromptOverride() {
        this.bitField0_ &= -2;
        this.ackSystemPromptOverride_ = DEFAULT_INSTANCE.ackSystemPromptOverride_;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAssistantName() {
        this.assistantName_ = DEFAULT_INSTANCE.assistantName_;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAssistantTags() {
        this.assistantTags_ = AbstractC0269h.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAssistantVersion() {
        this.assistantVersion_ = DEFAULT_INSTANCE.assistantVersion_;
    }

    private void clearIgnorePromptSafetyViolation() {
        this.ignorePromptSafetyViolation_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIntroSystemPromptOverride() {
        this.bitField0_ &= -3;
        this.introSystemPromptOverride_ = DEFAULT_INSTANCE.introSystemPromptOverride_;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPrompt() {
        this.prompt_ = DEFAULT_INSTANCE.prompt_;
    }

    private void ensureAssistantTagsIsMutable() {
        ae50 ae50Var = this.assistantTags_;
        if (((AbstractC1733c9) ae50Var).f35342a) {
            return;
        }
        this.assistantTags_ = AbstractC0269h.mutableCopy(ae50Var);
    }

    public static DebugInteractiveContextRequest getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static DebugInteractiveContextRequest parseDelimitedFrom(InputStream inputStream) {
        return (DebugInteractiveContextRequest) AbstractC0269h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static DebugInteractiveContextRequest parseFrom(ByteBuffer byteBuffer) {
        return (DebugInteractiveContextRequest) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAckSystemPromptOverride(String str) {
        str.getClass();
        this.bitField0_ |= 1;
        this.ackSystemPromptOverride_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAckSystemPromptOverrideBytes(gva gvaVar) {
        AbstractC2118m8.checkByteStringIsUtf8(gvaVar);
        this.ackSystemPromptOverride_ = gvaVar.m45892u();
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAssistantName(String str) {
        str.getClass();
        this.assistantName_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAssistantNameBytes(gva gvaVar) {
        AbstractC2118m8.checkByteStringIsUtf8(gvaVar);
        this.assistantName_ = gvaVar.m45892u();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAssistantTags(int i, String str) {
        str.getClass();
        ensureAssistantTagsIsMutable();
        this.assistantTags_.set(i, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAssistantVersion(String str) {
        str.getClass();
        this.assistantVersion_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAssistantVersionBytes(gva gvaVar) {
        AbstractC2118m8.checkByteStringIsUtf8(gvaVar);
        this.assistantVersion_ = gvaVar.m45892u();
    }

    private void setIgnorePromptSafetyViolation(boolean z) {
        this.ignorePromptSafetyViolation_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIntroSystemPromptOverride(String str) {
        str.getClass();
        this.bitField0_ |= 2;
        this.introSystemPromptOverride_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIntroSystemPromptOverrideBytes(gva gvaVar) {
        AbstractC2118m8.checkByteStringIsUtf8(gvaVar);
        this.introSystemPromptOverride_ = gvaVar.m45892u();
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPrompt(String str) {
        str.getClass();
        this.prompt_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPromptBytes(gva gvaVar) {
        AbstractC2118m8.checkByteStringIsUtf8(gvaVar);
        this.prompt_ = gvaVar.m45892u();
    }

    /* JADX INFO: renamed from: u */
    public static void m9353u(DebugInteractiveContextRequest debugInteractiveContextRequest) {
        debugInteractiveContextRequest.ignorePromptSafetyViolation_ = false;
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0007\u0000\u0001\u0001\u000b\u0007\u0000\u0001\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004\u0007\u0005Ț\nለ\u0000\u000bለ\u0001", new Object[]{"bitField0_", "prompt_", "assistantName_", "assistantVersion_", "ignorePromptSafetyViolation_", "assistantTags_", "ackSystemPromptOverride_", "introSystemPromptOverride_"});
        }
        if (iOrdinal == 3) {
            return new DebugInteractiveContextRequest();
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
        synchronized (DebugInteractiveContextRequest.class) {
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

    @Override // com.spotify.p060dj.interactionmanager.p061v0.DebugInteractiveContextRequestOrBuilder
    public final String getAckSystemPromptOverride() {
        return this.ackSystemPromptOverride_;
    }

    @Override // com.spotify.p060dj.interactionmanager.p061v0.DebugInteractiveContextRequestOrBuilder
    public final gva getAckSystemPromptOverrideBytes() {
        return gva.m45888f(this.ackSystemPromptOverride_);
    }

    @Override // com.spotify.p060dj.interactionmanager.p061v0.DebugInteractiveContextRequestOrBuilder
    public final String getAssistantName() {
        return this.assistantName_;
    }

    @Override // com.spotify.p060dj.interactionmanager.p061v0.DebugInteractiveContextRequestOrBuilder
    public final gva getAssistantNameBytes() {
        return gva.m45888f(this.assistantName_);
    }

    @Override // com.spotify.p060dj.interactionmanager.p061v0.DebugInteractiveContextRequestOrBuilder
    public final String getAssistantTags(int i) {
        return (String) this.assistantTags_.get(i);
    }

    @Override // com.spotify.p060dj.interactionmanager.p061v0.DebugInteractiveContextRequestOrBuilder
    public final gva getAssistantTagsBytes(int i) {
        return gva.m45888f((String) this.assistantTags_.get(i));
    }

    @Override // com.spotify.p060dj.interactionmanager.p061v0.DebugInteractiveContextRequestOrBuilder
    public final int getAssistantTagsCount() {
        return this.assistantTags_.size();
    }

    @Override // com.spotify.p060dj.interactionmanager.p061v0.DebugInteractiveContextRequestOrBuilder
    public final List<String> getAssistantTagsList() {
        return this.assistantTags_;
    }

    @Override // com.spotify.p060dj.interactionmanager.p061v0.DebugInteractiveContextRequestOrBuilder
    public final String getAssistantVersion() {
        return this.assistantVersion_;
    }

    @Override // com.spotify.p060dj.interactionmanager.p061v0.DebugInteractiveContextRequestOrBuilder
    public final gva getAssistantVersionBytes() {
        return gva.m45888f(this.assistantVersion_);
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.sre0
    public final /* bridge */ /* synthetic */ pre0 getDefaultInstanceForType() {
        return getDefaultInstanceForType();
    }

    @Override // com.spotify.p060dj.interactionmanager.p061v0.DebugInteractiveContextRequestOrBuilder
    public final boolean getIgnorePromptSafetyViolation() {
        return this.ignorePromptSafetyViolation_;
    }

    @Override // com.spotify.p060dj.interactionmanager.p061v0.DebugInteractiveContextRequestOrBuilder
    public final String getIntroSystemPromptOverride() {
        return this.introSystemPromptOverride_;
    }

    @Override // com.spotify.p060dj.interactionmanager.p061v0.DebugInteractiveContextRequestOrBuilder
    public final gva getIntroSystemPromptOverrideBytes() {
        return gva.m45888f(this.introSystemPromptOverride_);
    }

    @Override // com.spotify.p060dj.interactionmanager.p061v0.DebugInteractiveContextRequestOrBuilder
    public final String getPrompt() {
        return this.prompt_;
    }

    @Override // com.spotify.p060dj.interactionmanager.p061v0.DebugInteractiveContextRequestOrBuilder
    public final gva getPromptBytes() {
        return gva.m45888f(this.prompt_);
    }

    @Override // com.spotify.p060dj.interactionmanager.p061v0.DebugInteractiveContextRequestOrBuilder
    public final boolean hasAckSystemPromptOverride() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // com.spotify.p060dj.interactionmanager.p061v0.DebugInteractiveContextRequestOrBuilder
    public final boolean hasIntroSystemPromptOverride() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }

    public static Builder newBuilder(DebugInteractiveContextRequest debugInteractiveContextRequest) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(debugInteractiveContextRequest);
    }

    public static DebugInteractiveContextRequest parseDelimitedFrom(InputStream inputStream, aux auxVar) {
        return (DebugInteractiveContextRequest) AbstractC0269h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, auxVar);
    }

    public static DebugInteractiveContextRequest parseFrom(ByteBuffer byteBuffer, aux auxVar) {
        return (DebugInteractiveContextRequest) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, byteBuffer, auxVar);
    }

    public static DebugInteractiveContextRequest parseFrom(gva gvaVar) {
        return (DebugInteractiveContextRequest) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, gvaVar);
    }

    public static DebugInteractiveContextRequest parseFrom(gva gvaVar, aux auxVar) {
        return (DebugInteractiveContextRequest) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, gvaVar, auxVar);
    }

    public static DebugInteractiveContextRequest parseFrom(byte[] bArr) {
        return (DebugInteractiveContextRequest) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static DebugInteractiveContextRequest parseFrom(byte[] bArr, aux auxVar) {
        return (DebugInteractiveContextRequest) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr, auxVar);
    }

    public static DebugInteractiveContextRequest parseFrom(InputStream inputStream) {
        return (DebugInteractiveContextRequest) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static DebugInteractiveContextRequest parseFrom(InputStream inputStream, aux auxVar) {
        return (DebugInteractiveContextRequest) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, inputStream, auxVar);
    }

    public static DebugInteractiveContextRequest parseFrom(owe oweVar) {
        return (DebugInteractiveContextRequest) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, oweVar);
    }

    public static DebugInteractiveContextRequest parseFrom(owe oweVar, aux auxVar) {
        return (DebugInteractiveContextRequest) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, oweVar, auxVar);
    }
}
