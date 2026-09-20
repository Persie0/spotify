package com.spotify.playlist.p126ai.creation.p127v2;

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

/* JADX INFO: loaded from: classes9.dex */
public final class ReportProblemRequest extends AbstractC0269h implements ReportProblemRequestOrBuilder {
    private static final ReportProblemRequest DEFAULT_INSTANCE;
    public static final int MESSAGE_ID_FIELD_NUMBER = 2;
    private static volatile r2n0 PARSER = null;
    public static final int PROBLEM_DETAIL_FIELD_NUMBER = 4;
    public static final int PROBLEM_FIELD_NUMBER = 3;
    public static final int SESSION_ID_FIELD_NUMBER = 1;
    private int problem_;
    private String sessionId_ = "";
    private String messageId_ = "";
    private String problemDetail_ = "";

    /* JADX INFO: renamed from: com.spotify.playlist.ai.creation.v2.ReportProblemRequest$1 */
    public static /* synthetic */ class C11951 {

        /* JADX INFO: renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f6449xa1df5c61;

        static {
            int[] iArr = new int[z110.values().length];
            f6449xa1df5c61 = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f6449xa1df5c61[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f6449xa1df5c61[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f6449xa1df5c61[5] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f6449xa1df5c61[6] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f6449xa1df5c61[0] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f6449xa1df5c61[1] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class Builder extends AbstractC0268g implements ReportProblemRequestOrBuilder {
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

        public final Builder clearMessageId() {
            copyOnWrite();
            ((ReportProblemRequest) this.instance).clearMessageId();
            return this;
        }

        public final Builder clearProblem() {
            copyOnWrite();
            ReportProblemRequest.m18228o((ReportProblemRequest) this.instance);
            return this;
        }

        public final Builder clearProblemDetail() {
            copyOnWrite();
            ((ReportProblemRequest) this.instance).clearProblemDetail();
            return this;
        }

        public final Builder clearSessionId() {
            copyOnWrite();
            ((ReportProblemRequest) this.instance).clearSessionId();
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

        @Override // com.spotify.playlist.p126ai.creation.p127v2.ReportProblemRequestOrBuilder
        public final String getMessageId() {
            return ((ReportProblemRequest) this.instance).getMessageId();
        }

        @Override // com.spotify.playlist.p126ai.creation.p127v2.ReportProblemRequestOrBuilder
        public final gva getMessageIdBytes() {
            return ((ReportProblemRequest) this.instance).getMessageIdBytes();
        }

        @Override // com.spotify.playlist.p126ai.creation.p127v2.ReportProblemRequestOrBuilder
        public final Problem getProblem() {
            return ((ReportProblemRequest) this.instance).getProblem();
        }

        @Override // com.spotify.playlist.p126ai.creation.p127v2.ReportProblemRequestOrBuilder
        public final String getProblemDetail() {
            return ((ReportProblemRequest) this.instance).getProblemDetail();
        }

        @Override // com.spotify.playlist.p126ai.creation.p127v2.ReportProblemRequestOrBuilder
        public final gva getProblemDetailBytes() {
            return ((ReportProblemRequest) this.instance).getProblemDetailBytes();
        }

        @Override // com.spotify.playlist.p126ai.creation.p127v2.ReportProblemRequestOrBuilder
        public final int getProblemValue() {
            return ((ReportProblemRequest) this.instance).getProblemValue();
        }

        @Override // com.spotify.playlist.p126ai.creation.p127v2.ReportProblemRequestOrBuilder
        public final String getSessionId() {
            return ((ReportProblemRequest) this.instance).getSessionId();
        }

        @Override // com.spotify.playlist.p126ai.creation.p127v2.ReportProblemRequestOrBuilder
        public final gva getSessionIdBytes() {
            return ((ReportProblemRequest) this.instance).getSessionIdBytes();
        }

        @Override // com.google.protobuf.AbstractC0268g, p204p.AbstractC2081l8
        public final /* bridge */ /* synthetic */ AbstractC2081l8 internalMergeFrom(AbstractC2118m8 abstractC2118m8) {
            return super.internalMergeFrom((AbstractC0269h) abstractC2118m8);
        }

        @Override // com.google.protobuf.AbstractC0268g, p204p.AbstractC2081l8, p204p.ore0
        public final /* bridge */ /* synthetic */ AbstractC2081l8 mergeFrom(owe oweVar, aux auxVar) {
            return super.mergeFrom(oweVar, auxVar);
        }

        public final Builder setMessageId(String str) {
            copyOnWrite();
            ((ReportProblemRequest) this.instance).setMessageId(str);
            return this;
        }

        public final Builder setMessageIdBytes(gva gvaVar) {
            copyOnWrite();
            ((ReportProblemRequest) this.instance).setMessageIdBytes(gvaVar);
            return this;
        }

        public final Builder setProblem(Problem problem) {
            copyOnWrite();
            ((ReportProblemRequest) this.instance).setProblem(problem);
            return this;
        }

        public final Builder setProblemDetail(String str) {
            copyOnWrite();
            ((ReportProblemRequest) this.instance).setProblemDetail(str);
            return this;
        }

        public final Builder setProblemDetailBytes(gva gvaVar) {
            copyOnWrite();
            ((ReportProblemRequest) this.instance).setProblemDetailBytes(gvaVar);
            return this;
        }

        public final Builder setProblemValue(int i) {
            copyOnWrite();
            ReportProblemRequest.m18236w((ReportProblemRequest) this.instance, i);
            return this;
        }

        public final Builder setSessionId(String str) {
            copyOnWrite();
            ((ReportProblemRequest) this.instance).setSessionId(str);
            return this;
        }

        public final Builder setSessionIdBytes(gva gvaVar) {
            copyOnWrite();
            ((ReportProblemRequest) this.instance).setSessionIdBytes(gvaVar);
            return this;
        }

        private Builder() {
            super(ReportProblemRequest.DEFAULT_INSTANCE);
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
        ReportProblemRequest reportProblemRequest = new ReportProblemRequest();
        DEFAULT_INSTANCE = reportProblemRequest;
        AbstractC0269h.registerDefaultInstance(ReportProblemRequest.class, reportProblemRequest);
    }

    private ReportProblemRequest() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMessageId() {
        this.messageId_ = DEFAULT_INSTANCE.messageId_;
    }

    private void clearProblem() {
        this.problem_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearProblemDetail() {
        this.problemDetail_ = DEFAULT_INSTANCE.problemDetail_;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSessionId() {
        this.sessionId_ = DEFAULT_INSTANCE.sessionId_;
    }

    public static ReportProblemRequest getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    /* JADX INFO: renamed from: o */
    public static void m18228o(ReportProblemRequest reportProblemRequest) {
        reportProblemRequest.problem_ = 0;
    }

    public static ReportProblemRequest parseDelimitedFrom(InputStream inputStream) {
        return (ReportProblemRequest) AbstractC0269h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ReportProblemRequest parseFrom(ByteBuffer byteBuffer) {
        return (ReportProblemRequest) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMessageId(String str) {
        str.getClass();
        this.messageId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMessageIdBytes(gva gvaVar) {
        AbstractC2118m8.checkByteStringIsUtf8(gvaVar);
        this.messageId_ = gvaVar.m45892u();
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

    /* JADX INFO: renamed from: w */
    public static void m18236w(ReportProblemRequest reportProblemRequest, int i) {
        reportProblemRequest.problem_ = i;
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003\f\u0004Ȉ", new Object[]{"sessionId_", "messageId_", "problem_", "problemDetail_"});
        }
        if (iOrdinal == 3) {
            return new ReportProblemRequest();
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
        synchronized (ReportProblemRequest.class) {
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

    @Override // com.spotify.playlist.p126ai.creation.p127v2.ReportProblemRequestOrBuilder
    public final String getMessageId() {
        return this.messageId_;
    }

    @Override // com.spotify.playlist.p126ai.creation.p127v2.ReportProblemRequestOrBuilder
    public final gva getMessageIdBytes() {
        return gva.m45888f(this.messageId_);
    }

    @Override // com.spotify.playlist.p126ai.creation.p127v2.ReportProblemRequestOrBuilder
    public final Problem getProblem() {
        Problem problemForNumber = Problem.forNumber(this.problem_);
        return problemForNumber == null ? Problem.UNRECOGNIZED : problemForNumber;
    }

    @Override // com.spotify.playlist.p126ai.creation.p127v2.ReportProblemRequestOrBuilder
    public final String getProblemDetail() {
        return this.problemDetail_;
    }

    @Override // com.spotify.playlist.p126ai.creation.p127v2.ReportProblemRequestOrBuilder
    public final gva getProblemDetailBytes() {
        return gva.m45888f(this.problemDetail_);
    }

    @Override // com.spotify.playlist.p126ai.creation.p127v2.ReportProblemRequestOrBuilder
    public final int getProblemValue() {
        return this.problem_;
    }

    @Override // com.spotify.playlist.p126ai.creation.p127v2.ReportProblemRequestOrBuilder
    public final String getSessionId() {
        return this.sessionId_;
    }

    @Override // com.spotify.playlist.p126ai.creation.p127v2.ReportProblemRequestOrBuilder
    public final gva getSessionIdBytes() {
        return gva.m45888f(this.sessionId_);
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }

    public static Builder newBuilder(ReportProblemRequest reportProblemRequest) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(reportProblemRequest);
    }

    public static ReportProblemRequest parseDelimitedFrom(InputStream inputStream, aux auxVar) {
        return (ReportProblemRequest) AbstractC0269h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, auxVar);
    }

    public static ReportProblemRequest parseFrom(ByteBuffer byteBuffer, aux auxVar) {
        return (ReportProblemRequest) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, byteBuffer, auxVar);
    }

    public static ReportProblemRequest parseFrom(gva gvaVar) {
        return (ReportProblemRequest) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, gvaVar);
    }

    public static ReportProblemRequest parseFrom(gva gvaVar, aux auxVar) {
        return (ReportProblemRequest) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, gvaVar, auxVar);
    }

    public static ReportProblemRequest parseFrom(byte[] bArr) {
        return (ReportProblemRequest) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ReportProblemRequest parseFrom(byte[] bArr, aux auxVar) {
        return (ReportProblemRequest) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr, auxVar);
    }

    public static ReportProblemRequest parseFrom(InputStream inputStream) {
        return (ReportProblemRequest) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ReportProblemRequest parseFrom(InputStream inputStream, aux auxVar) {
        return (ReportProblemRequest) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, inputStream, auxVar);
    }

    public static ReportProblemRequest parseFrom(owe oweVar) {
        return (ReportProblemRequest) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, oweVar);
    }

    public static ReportProblemRequest parseFrom(owe oweVar, aux auxVar) {
        return (ReportProblemRequest) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, oweVar, auxVar);
    }
}
