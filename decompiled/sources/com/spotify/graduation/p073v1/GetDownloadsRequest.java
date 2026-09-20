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
public final class GetDownloadsRequest extends AbstractC0269h implements GetDownloadsRequestOrBuilder {
    private static final GetDownloadsRequest DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER = null;
    public static final int UNUSED_FIELD_NUMBER = 1;
    private String unused_ = "";

    /* JADX INFO: renamed from: com.spotify.graduation.v1.GetDownloadsRequest$1 */
    public static /* synthetic */ class C07771 {

        /* JADX INFO: renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f4145xa1df5c61;

        static {
            int[] iArr = new int[z110.values().length];
            f4145xa1df5c61 = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f4145xa1df5c61[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f4145xa1df5c61[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f4145xa1df5c61[5] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f4145xa1df5c61[6] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f4145xa1df5c61[0] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f4145xa1df5c61[1] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class Builder extends AbstractC0268g implements GetDownloadsRequestOrBuilder {
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

        public final Builder clearUnused() {
            copyOnWrite();
            ((GetDownloadsRequest) this.instance).clearUnused();
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

        @Override // com.spotify.graduation.p073v1.GetDownloadsRequestOrBuilder
        public final String getUnused() {
            return ((GetDownloadsRequest) this.instance).getUnused();
        }

        @Override // com.spotify.graduation.p073v1.GetDownloadsRequestOrBuilder
        public final gva getUnusedBytes() {
            return ((GetDownloadsRequest) this.instance).getUnusedBytes();
        }

        @Override // com.google.protobuf.AbstractC0268g, p204p.AbstractC2081l8
        public final /* bridge */ /* synthetic */ AbstractC2081l8 internalMergeFrom(AbstractC2118m8 abstractC2118m8) {
            return super.internalMergeFrom((AbstractC0269h) abstractC2118m8);
        }

        @Override // com.google.protobuf.AbstractC0268g, p204p.AbstractC2081l8, p204p.ore0
        public final /* bridge */ /* synthetic */ AbstractC2081l8 mergeFrom(owe oweVar, aux auxVar) {
            return super.mergeFrom(oweVar, auxVar);
        }

        public final Builder setUnused(String str) {
            copyOnWrite();
            ((GetDownloadsRequest) this.instance).setUnused(str);
            return this;
        }

        public final Builder setUnusedBytes(gva gvaVar) {
            copyOnWrite();
            ((GetDownloadsRequest) this.instance).setUnusedBytes(gvaVar);
            return this;
        }

        private Builder() {
            super(GetDownloadsRequest.DEFAULT_INSTANCE);
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
        GetDownloadsRequest getDownloadsRequest = new GetDownloadsRequest();
        DEFAULT_INSTANCE = getDownloadsRequest;
        AbstractC0269h.registerDefaultInstance(GetDownloadsRequest.class, getDownloadsRequest);
    }

    private GetDownloadsRequest() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUnused() {
        this.unused_ = DEFAULT_INSTANCE.unused_;
    }

    public static GetDownloadsRequest getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static GetDownloadsRequest parseDelimitedFrom(InputStream inputStream) {
        return (GetDownloadsRequest) AbstractC0269h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static GetDownloadsRequest parseFrom(ByteBuffer byteBuffer) {
        return (GetDownloadsRequest) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUnused(String str) {
        str.getClass();
        this.unused_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUnusedBytes(gva gvaVar) {
        AbstractC2118m8.checkByteStringIsUtf8(gvaVar);
        this.unused_ = gvaVar.m45892u();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"unused_"});
        }
        if (iOrdinal == 3) {
            return new GetDownloadsRequest();
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
        synchronized (GetDownloadsRequest.class) {
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

    @Override // com.spotify.graduation.p073v1.GetDownloadsRequestOrBuilder
    public final String getUnused() {
        return this.unused_;
    }

    @Override // com.spotify.graduation.p073v1.GetDownloadsRequestOrBuilder
    public final gva getUnusedBytes() {
        return gva.m45888f(this.unused_);
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }

    public static Builder newBuilder(GetDownloadsRequest getDownloadsRequest) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(getDownloadsRequest);
    }

    public static GetDownloadsRequest parseDelimitedFrom(InputStream inputStream, aux auxVar) {
        return (GetDownloadsRequest) AbstractC0269h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, auxVar);
    }

    public static GetDownloadsRequest parseFrom(ByteBuffer byteBuffer, aux auxVar) {
        return (GetDownloadsRequest) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, byteBuffer, auxVar);
    }

    public static GetDownloadsRequest parseFrom(gva gvaVar) {
        return (GetDownloadsRequest) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, gvaVar);
    }

    public static GetDownloadsRequest parseFrom(gva gvaVar, aux auxVar) {
        return (GetDownloadsRequest) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, gvaVar, auxVar);
    }

    public static GetDownloadsRequest parseFrom(byte[] bArr) {
        return (GetDownloadsRequest) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static GetDownloadsRequest parseFrom(byte[] bArr, aux auxVar) {
        return (GetDownloadsRequest) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr, auxVar);
    }

    public static GetDownloadsRequest parseFrom(InputStream inputStream) {
        return (GetDownloadsRequest) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static GetDownloadsRequest parseFrom(InputStream inputStream, aux auxVar) {
        return (GetDownloadsRequest) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, inputStream, auxVar);
    }

    public static GetDownloadsRequest parseFrom(owe oweVar) {
        return (GetDownloadsRequest) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, oweVar);
    }

    public static GetDownloadsRequest parseFrom(owe oweVar, aux auxVar) {
        return (GetDownloadsRequest) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, oweVar, auxVar);
    }
}
