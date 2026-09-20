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
public final class SubmitFeedbackRequest extends AbstractC0269h implements SubmitFeedbackRequestOrBuilder {
    private static final SubmitFeedbackRequest DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER = null;
    public static final int PROBLEM_DETAIL_FIELD_NUMBER = 2;
    public static final int PROBLEM_FIELD_NUMBER = 1;
    private String problemDetail_ = "";
    private int problem_;

    /* JADX INFO: renamed from: com.spotify.dj.interactionmanager.v0.SubmitFeedbackRequest$1 */
    /* JADX INFO: loaded from: classes6.dex */
    public static /* synthetic */ class C07041 {

        /* JADX INFO: renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f3580xa1df5c61;

        static {
            int[] iArr = new int[z110.values().length];
            f3580xa1df5c61 = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f3580xa1df5c61[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f3580xa1df5c61[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f3580xa1df5c61[5] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f3580xa1df5c61[6] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f3580xa1df5c61[0] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f3580xa1df5c61[1] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* JADX INFO: loaded from: classes6.dex */
    public static final class Builder extends AbstractC0268g implements SubmitFeedbackRequestOrBuilder {
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

        public final Builder clearProblem() {
            copyOnWrite();
            SubmitFeedbackRequest.m9486n((SubmitFeedbackRequest) this.instance);
            return this;
        }

        public final Builder clearProblemDetail() {
            copyOnWrite();
            ((SubmitFeedbackRequest) this.instance).clearProblemDetail();
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

        @Override // com.spotify.p060dj.interactionmanager.p061v0.SubmitFeedbackRequestOrBuilder
        public final Problem getProblem() {
            return ((SubmitFeedbackRequest) this.instance).getProblem();
        }

        @Override // com.spotify.p060dj.interactionmanager.p061v0.SubmitFeedbackRequestOrBuilder
        public final String getProblemDetail() {
            return ((SubmitFeedbackRequest) this.instance).getProblemDetail();
        }

        @Override // com.spotify.p060dj.interactionmanager.p061v0.SubmitFeedbackRequestOrBuilder
        public final gva getProblemDetailBytes() {
            return ((SubmitFeedbackRequest) this.instance).getProblemDetailBytes();
        }

        @Override // com.spotify.p060dj.interactionmanager.p061v0.SubmitFeedbackRequestOrBuilder
        public final int getProblemValue() {
            return ((SubmitFeedbackRequest) this.instance).getProblemValue();
        }

        @Override // com.google.protobuf.AbstractC0268g, p204p.AbstractC2081l8
        public final /* bridge */ /* synthetic */ AbstractC2081l8 internalMergeFrom(AbstractC2118m8 abstractC2118m8) {
            return super.internalMergeFrom((AbstractC0269h) abstractC2118m8);
        }

        @Override // com.google.protobuf.AbstractC0268g, p204p.AbstractC2081l8, p204p.ore0
        public final /* bridge */ /* synthetic */ AbstractC2081l8 mergeFrom(owe oweVar, aux auxVar) {
            return super.mergeFrom(oweVar, auxVar);
        }

        public final Builder setProblem(Problem problem) {
            copyOnWrite();
            ((SubmitFeedbackRequest) this.instance).setProblem(problem);
            return this;
        }

        public final Builder setProblemDetail(String str) {
            copyOnWrite();
            ((SubmitFeedbackRequest) this.instance).setProblemDetail(str);
            return this;
        }

        public final Builder setProblemDetailBytes(gva gvaVar) {
            copyOnWrite();
            ((SubmitFeedbackRequest) this.instance).setProblemDetailBytes(gvaVar);
            return this;
        }

        public final Builder setProblemValue(int i) {
            copyOnWrite();
            SubmitFeedbackRequest.m9491s((SubmitFeedbackRequest) this.instance, i);
            return this;
        }

        private Builder() {
            super(SubmitFeedbackRequest.DEFAULT_INSTANCE);
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
        SubmitFeedbackRequest submitFeedbackRequest = new SubmitFeedbackRequest();
        DEFAULT_INSTANCE = submitFeedbackRequest;
        AbstractC0269h.registerDefaultInstance(SubmitFeedbackRequest.class, submitFeedbackRequest);
    }

    private SubmitFeedbackRequest() {
    }

    private void clearProblem() {
        this.problem_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearProblemDetail() {
        this.problemDetail_ = DEFAULT_INSTANCE.problemDetail_;
    }

    public static SubmitFeedbackRequest getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: renamed from: n */
    public static void m9486n(SubmitFeedbackRequest submitFeedbackRequest) {
        submitFeedbackRequest.problem_ = 0;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static SubmitFeedbackRequest parseDelimitedFrom(InputStream inputStream) {
        return (SubmitFeedbackRequest) AbstractC0269h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static SubmitFeedbackRequest parseFrom(ByteBuffer byteBuffer) {
        return (SubmitFeedbackRequest) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: s */
    public static void m9491s(SubmitFeedbackRequest submitFeedbackRequest, int i) {
        submitFeedbackRequest.problem_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setProblem(Problem problem) {
        this.problem_ = problem.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setProblemDetail(String str) {
        str.getClass();
        this.problemDetail_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setProblemDetailBytes(gva gvaVar) {
        AbstractC2118m8.checkByteStringIsUtf8(gvaVar);
        this.problemDetail_ = gvaVar.m45892u();
    }

    private void setProblemValue(int i) {
        this.problem_ = i;
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002Ȉ", new Object[]{"problem_", "problemDetail_"});
        }
        if (iOrdinal == 3) {
            return new SubmitFeedbackRequest();
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
        synchronized (SubmitFeedbackRequest.class) {
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

    @Override // com.spotify.p060dj.interactionmanager.p061v0.SubmitFeedbackRequestOrBuilder
    public final Problem getProblem() {
        Problem problemForNumber = Problem.forNumber(this.problem_);
        return problemForNumber == null ? Problem.UNRECOGNIZED : problemForNumber;
    }

    @Override // com.spotify.p060dj.interactionmanager.p061v0.SubmitFeedbackRequestOrBuilder
    public final String getProblemDetail() {
        return this.problemDetail_;
    }

    @Override // com.spotify.p060dj.interactionmanager.p061v0.SubmitFeedbackRequestOrBuilder
    public final gva getProblemDetailBytes() {
        return gva.m45888f(this.problemDetail_);
    }

    @Override // com.spotify.p060dj.interactionmanager.p061v0.SubmitFeedbackRequestOrBuilder
    public final int getProblemValue() {
        return this.problem_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }

    public static Builder newBuilder(SubmitFeedbackRequest submitFeedbackRequest) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(submitFeedbackRequest);
    }

    public static SubmitFeedbackRequest parseDelimitedFrom(InputStream inputStream, aux auxVar) {
        return (SubmitFeedbackRequest) AbstractC0269h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, auxVar);
    }

    public static SubmitFeedbackRequest parseFrom(ByteBuffer byteBuffer, aux auxVar) {
        return (SubmitFeedbackRequest) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, byteBuffer, auxVar);
    }

    public static SubmitFeedbackRequest parseFrom(gva gvaVar) {
        return (SubmitFeedbackRequest) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, gvaVar);
    }

    public static SubmitFeedbackRequest parseFrom(gva gvaVar, aux auxVar) {
        return (SubmitFeedbackRequest) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, gvaVar, auxVar);
    }

    public static SubmitFeedbackRequest parseFrom(byte[] bArr) {
        return (SubmitFeedbackRequest) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static SubmitFeedbackRequest parseFrom(byte[] bArr, aux auxVar) {
        return (SubmitFeedbackRequest) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr, auxVar);
    }

    public static SubmitFeedbackRequest parseFrom(InputStream inputStream) {
        return (SubmitFeedbackRequest) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static SubmitFeedbackRequest parseFrom(InputStream inputStream, aux auxVar) {
        return (SubmitFeedbackRequest) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, inputStream, auxVar);
    }

    public static SubmitFeedbackRequest parseFrom(owe oweVar) {
        return (SubmitFeedbackRequest) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, oweVar);
    }

    public static SubmitFeedbackRequest parseFrom(owe oweVar, aux auxVar) {
        return (SubmitFeedbackRequest) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, oweVar, auxVar);
    }
}
