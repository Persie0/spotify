package com.spotify.graduation.p073v1;

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
public final class DownloadFileRequest extends AbstractC0269h implements DownloadFileRequestOrBuilder {
    private static final DownloadFileRequest DEFAULT_INSTANCE;
    public static final int DOWNLOAD_ID_FIELD_NUMBER = 1;
    private static volatile r2n0 PARSER = null;
    public static final int SECURITY_CODE_FIELD_NUMBER = 2;
    private String downloadId_ = "";
    private String securityCode_ = "";

    /* JADX INFO: renamed from: com.spotify.graduation.v1.DownloadFileRequest$1 */
    public static /* synthetic */ class C07731 {

        /* JADX INFO: renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f4143xa1df5c61;

        static {
            int[] iArr = new int[z110.values().length];
            f4143xa1df5c61 = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f4143xa1df5c61[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f4143xa1df5c61[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f4143xa1df5c61[5] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f4143xa1df5c61[6] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f4143xa1df5c61[0] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f4143xa1df5c61[1] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class Builder extends AbstractC0268g implements DownloadFileRequestOrBuilder {
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

        public final Builder clearDownloadId() {
            copyOnWrite();
            ((DownloadFileRequest) this.instance).clearDownloadId();
            return this;
        }

        public final Builder clearSecurityCode() {
            copyOnWrite();
            ((DownloadFileRequest) this.instance).clearSecurityCode();
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

        @Override // com.spotify.graduation.p073v1.DownloadFileRequestOrBuilder
        public final String getDownloadId() {
            return ((DownloadFileRequest) this.instance).getDownloadId();
        }

        @Override // com.spotify.graduation.p073v1.DownloadFileRequestOrBuilder
        public final gva getDownloadIdBytes() {
            return ((DownloadFileRequest) this.instance).getDownloadIdBytes();
        }

        @Override // com.spotify.graduation.p073v1.DownloadFileRequestOrBuilder
        public final String getSecurityCode() {
            return ((DownloadFileRequest) this.instance).getSecurityCode();
        }

        @Override // com.spotify.graduation.p073v1.DownloadFileRequestOrBuilder
        public final gva getSecurityCodeBytes() {
            return ((DownloadFileRequest) this.instance).getSecurityCodeBytes();
        }

        @Override // com.google.protobuf.AbstractC0268g, p204p.AbstractC2081l8
        public final /* bridge */ /* synthetic */ AbstractC2081l8 internalMergeFrom(AbstractC2118m8 abstractC2118m8) {
            return super.internalMergeFrom((AbstractC0269h) abstractC2118m8);
        }

        @Override // com.google.protobuf.AbstractC0268g, p204p.AbstractC2081l8, p204p.ore0
        public final /* bridge */ /* synthetic */ AbstractC2081l8 mergeFrom(owe oweVar, aux auxVar) {
            return super.mergeFrom(oweVar, auxVar);
        }

        public final Builder setDownloadId(String str) {
            copyOnWrite();
            ((DownloadFileRequest) this.instance).setDownloadId(str);
            return this;
        }

        public final Builder setDownloadIdBytes(gva gvaVar) {
            copyOnWrite();
            ((DownloadFileRequest) this.instance).setDownloadIdBytes(gvaVar);
            return this;
        }

        public final Builder setSecurityCode(String str) {
            copyOnWrite();
            ((DownloadFileRequest) this.instance).setSecurityCode(str);
            return this;
        }

        public final Builder setSecurityCodeBytes(gva gvaVar) {
            copyOnWrite();
            ((DownloadFileRequest) this.instance).setSecurityCodeBytes(gvaVar);
            return this;
        }

        private Builder() {
            super(DownloadFileRequest.DEFAULT_INSTANCE);
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
        DownloadFileRequest downloadFileRequest = new DownloadFileRequest();
        DEFAULT_INSTANCE = downloadFileRequest;
        AbstractC0269h.registerDefaultInstance(DownloadFileRequest.class, downloadFileRequest);
    }

    private DownloadFileRequest() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDownloadId() {
        this.downloadId_ = DEFAULT_INSTANCE.downloadId_;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSecurityCode() {
        this.securityCode_ = DEFAULT_INSTANCE.securityCode_;
    }

    public static DownloadFileRequest getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static DownloadFileRequest parseDelimitedFrom(InputStream inputStream) {
        return (DownloadFileRequest) AbstractC0269h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static DownloadFileRequest parseFrom(ByteBuffer byteBuffer) {
        return (DownloadFileRequest) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDownloadId(String str) {
        str.getClass();
        this.downloadId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDownloadIdBytes(gva gvaVar) {
        AbstractC2118m8.checkByteStringIsUtf8(gvaVar);
        this.downloadId_ = gvaVar.m45892u();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSecurityCode(String str) {
        str.getClass();
        this.securityCode_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSecurityCodeBytes(gva gvaVar) {
        AbstractC2118m8.checkByteStringIsUtf8(gvaVar);
        this.securityCode_ = gvaVar.m45892u();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ", new Object[]{"downloadId_", "securityCode_"});
        }
        if (iOrdinal == 3) {
            return new DownloadFileRequest();
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
        synchronized (DownloadFileRequest.class) {
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

    @Override // com.spotify.graduation.p073v1.DownloadFileRequestOrBuilder
    public final String getDownloadId() {
        return this.downloadId_;
    }

    @Override // com.spotify.graduation.p073v1.DownloadFileRequestOrBuilder
    public final gva getDownloadIdBytes() {
        return gva.m45888f(this.downloadId_);
    }

    @Override // com.spotify.graduation.p073v1.DownloadFileRequestOrBuilder
    public final String getSecurityCode() {
        return this.securityCode_;
    }

    @Override // com.spotify.graduation.p073v1.DownloadFileRequestOrBuilder
    public final gva getSecurityCodeBytes() {
        return gva.m45888f(this.securityCode_);
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }

    public static Builder newBuilder(DownloadFileRequest downloadFileRequest) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(downloadFileRequest);
    }

    public static DownloadFileRequest parseDelimitedFrom(InputStream inputStream, aux auxVar) {
        return (DownloadFileRequest) AbstractC0269h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, auxVar);
    }

    public static DownloadFileRequest parseFrom(ByteBuffer byteBuffer, aux auxVar) {
        return (DownloadFileRequest) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, byteBuffer, auxVar);
    }

    public static DownloadFileRequest parseFrom(gva gvaVar) {
        return (DownloadFileRequest) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, gvaVar);
    }

    public static DownloadFileRequest parseFrom(gva gvaVar, aux auxVar) {
        return (DownloadFileRequest) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, gvaVar, auxVar);
    }

    public static DownloadFileRequest parseFrom(byte[] bArr) {
        return (DownloadFileRequest) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static DownloadFileRequest parseFrom(byte[] bArr, aux auxVar) {
        return (DownloadFileRequest) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr, auxVar);
    }

    public static DownloadFileRequest parseFrom(InputStream inputStream) {
        return (DownloadFileRequest) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static DownloadFileRequest parseFrom(InputStream inputStream, aux auxVar) {
        return (DownloadFileRequest) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, inputStream, auxVar);
    }

    public static DownloadFileRequest parseFrom(owe oweVar) {
        return (DownloadFileRequest) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, oweVar);
    }

    public static DownloadFileRequest parseFrom(owe oweVar, aux auxVar) {
        return (DownloadFileRequest) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, oweVar, auxVar);
    }
}
