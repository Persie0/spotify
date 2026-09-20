package com.spotify.graduation.p073v1;

import com.google.protobuf.AbstractC0268g;
import com.google.protobuf.AbstractC0269h;
import com.google.protobuf.Timestamp;
import java.io.InputStream;
import java.nio.ByteBuffer;
import p204p.AbstractC2081l8;
import p204p.AbstractC2118m8;
import p204p.aux;
import p204p.gva;
import p204p.lu71;
import p204p.ore0;
import p204p.owe;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.z110;

/* JADX INFO: loaded from: classes7.dex */
public final class Download extends AbstractC0269h implements DownloadOrBuilder {
    public static final int DATE_FIELD_NUMBER = 6;
    private static final Download DEFAULT_INSTANCE;
    public static final int DOWNLOAD_URL_FIELD_NUMBER = 2;
    public static final int LEVEL_FIELD_NUMBER = 5;
    private static volatile r2n0 PARSER = null;
    public static final int SECURITY_CODE_FIELD_NUMBER = 3;
    public static final int STATUS_FIELD_NUMBER = 1;
    public static final int TTL_FIELD_NUMBER = 4;
    private int bitField0_;
    private Timestamp date_;
    private int level_;
    private int status_;
    private int ttl_;
    private String downloadUrl_ = "";
    private String securityCode_ = "";

    /* JADX INFO: renamed from: com.spotify.graduation.v1.Download$1 */
    public static /* synthetic */ class C07721 {

        /* JADX INFO: renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f4142xa1df5c61;

        static {
            int[] iArr = new int[z110.values().length];
            f4142xa1df5c61 = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f4142xa1df5c61[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f4142xa1df5c61[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f4142xa1df5c61[5] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f4142xa1df5c61[6] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f4142xa1df5c61[0] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f4142xa1df5c61[1] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class Builder extends AbstractC0268g implements DownloadOrBuilder {
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

        public final Builder clearDate() {
            copyOnWrite();
            ((Download) this.instance).clearDate();
            return this;
        }

        public final Builder clearDownloadUrl() {
            copyOnWrite();
            ((Download) this.instance).clearDownloadUrl();
            return this;
        }

        public final Builder clearLevel() {
            copyOnWrite();
            Download.m11234p((Download) this.instance);
            return this;
        }

        public final Builder clearSecurityCode() {
            copyOnWrite();
            ((Download) this.instance).clearSecurityCode();
            return this;
        }

        public final Builder clearStatus() {
            copyOnWrite();
            Download.m11236r((Download) this.instance);
            return this;
        }

        public final Builder clearTtl() {
            copyOnWrite();
            Download.m11237s((Download) this.instance);
            return this;
        }

        @Override // com.google.protobuf.AbstractC0268g
        /* JADX INFO: renamed from: clone */
        public final /* bridge */ /* synthetic */ Object mo98327clone() {
            return super.mo98326clone();
        }

        @Override // com.spotify.graduation.p073v1.DownloadOrBuilder
        public final Timestamp getDate() {
            return ((Download) this.instance).getDate();
        }

        @Override // com.google.protobuf.AbstractC0268g, p204p.sre0
        public final /* bridge */ /* synthetic */ pre0 getDefaultInstanceForType() {
            return super.getDefaultInstanceForType();
        }

        @Override // com.spotify.graduation.p073v1.DownloadOrBuilder
        public final String getDownloadUrl() {
            return ((Download) this.instance).getDownloadUrl();
        }

        @Override // com.spotify.graduation.p073v1.DownloadOrBuilder
        public final gva getDownloadUrlBytes() {
            return ((Download) this.instance).getDownloadUrlBytes();
        }

        @Override // com.spotify.graduation.p073v1.DownloadOrBuilder
        public final DownloadLevel getLevel() {
            return ((Download) this.instance).getLevel();
        }

        @Override // com.spotify.graduation.p073v1.DownloadOrBuilder
        public final int getLevelValue() {
            return ((Download) this.instance).getLevelValue();
        }

        @Override // com.spotify.graduation.p073v1.DownloadOrBuilder
        public final String getSecurityCode() {
            return ((Download) this.instance).getSecurityCode();
        }

        @Override // com.spotify.graduation.p073v1.DownloadOrBuilder
        public final gva getSecurityCodeBytes() {
            return ((Download) this.instance).getSecurityCodeBytes();
        }

        @Override // com.spotify.graduation.p073v1.DownloadOrBuilder
        public final DownloadStatus getStatus() {
            return ((Download) this.instance).getStatus();
        }

        @Override // com.spotify.graduation.p073v1.DownloadOrBuilder
        public final int getStatusValue() {
            return ((Download) this.instance).getStatusValue();
        }

        @Override // com.spotify.graduation.p073v1.DownloadOrBuilder
        public final int getTtl() {
            return ((Download) this.instance).getTtl();
        }

        @Override // com.spotify.graduation.p073v1.DownloadOrBuilder
        public final boolean hasDate() {
            return ((Download) this.instance).hasDate();
        }

        @Override // com.google.protobuf.AbstractC0268g, p204p.AbstractC2081l8
        public final /* bridge */ /* synthetic */ AbstractC2081l8 internalMergeFrom(AbstractC2118m8 abstractC2118m8) {
            return super.internalMergeFrom((AbstractC0269h) abstractC2118m8);
        }

        public final Builder mergeDate(Timestamp timestamp) {
            copyOnWrite();
            ((Download) this.instance).mergeDate(timestamp);
            return this;
        }

        @Override // com.google.protobuf.AbstractC0268g, p204p.AbstractC2081l8, p204p.ore0
        public final /* bridge */ /* synthetic */ AbstractC2081l8 mergeFrom(owe oweVar, aux auxVar) {
            return super.mergeFrom(oweVar, auxVar);
        }

        public final Builder setDate(Timestamp timestamp) {
            copyOnWrite();
            ((Download) this.instance).setDate(timestamp);
            return this;
        }

        public final Builder setDownloadUrl(String str) {
            copyOnWrite();
            ((Download) this.instance).setDownloadUrl(str);
            return this;
        }

        public final Builder setDownloadUrlBytes(gva gvaVar) {
            copyOnWrite();
            ((Download) this.instance).setDownloadUrlBytes(gvaVar);
            return this;
        }

        public final Builder setLevel(DownloadLevel downloadLevel) {
            copyOnWrite();
            ((Download) this.instance).setLevel(downloadLevel);
            return this;
        }

        public final Builder setLevelValue(int i) {
            copyOnWrite();
            Download.m11243y(i, (Download) this.instance);
            return this;
        }

        public final Builder setSecurityCode(String str) {
            copyOnWrite();
            ((Download) this.instance).setSecurityCode(str);
            return this;
        }

        public final Builder setSecurityCodeBytes(gva gvaVar) {
            copyOnWrite();
            ((Download) this.instance).setSecurityCodeBytes(gvaVar);
            return this;
        }

        public final Builder setStatus(DownloadStatus downloadStatus) {
            copyOnWrite();
            ((Download) this.instance).setStatus(downloadStatus);
            return this;
        }

        public final Builder setStatusValue(int i) {
            copyOnWrite();
            Download.m11229C(i, (Download) this.instance);
            return this;
        }

        public final Builder setTtl(int i) {
            copyOnWrite();
            Download.m11230D(i, (Download) this.instance);
            return this;
        }

        private Builder() {
            super(Download.DEFAULT_INSTANCE);
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

        public final Builder setDate(lu71 lu71Var) {
            copyOnWrite();
            ((Download) this.instance).setDate((Timestamp) lu71Var.build());
            return this;
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
        Download download = new Download();
        DEFAULT_INSTANCE = download;
        AbstractC0269h.registerDefaultInstance(Download.class, download);
    }

    private Download() {
    }

    /* JADX INFO: renamed from: C */
    public static void m11229C(int i, Download download) {
        download.status_ = i;
    }

    /* JADX INFO: renamed from: D */
    public static void m11230D(int i, Download download) {
        download.ttl_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDate() {
        this.date_ = null;
        this.bitField0_ &= -2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDownloadUrl() {
        this.downloadUrl_ = DEFAULT_INSTANCE.downloadUrl_;
    }

    private void clearLevel() {
        this.level_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSecurityCode() {
        this.securityCode_ = DEFAULT_INSTANCE.securityCode_;
    }

    private void clearStatus() {
        this.status_ = 0;
    }

    private void clearTtl() {
        this.ttl_ = 0;
    }

    public static Download getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeDate(Timestamp timestamp) {
        timestamp.getClass();
        Timestamp timestamp2 = this.date_;
        if (timestamp2 == null || timestamp2 == Timestamp.m1965q()) {
            this.date_ = timestamp;
        } else {
            this.date_ = (Timestamp) ((lu71) Timestamp.m1967u(this.date_).mergeFrom((AbstractC0269h) timestamp)).buildPartial();
        }
        this.bitField0_ |= 1;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    /* JADX INFO: renamed from: p */
    public static void m11234p(Download download) {
        download.level_ = 0;
    }

    public static Download parseDelimitedFrom(InputStream inputStream) {
        return (Download) AbstractC0269h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Download parseFrom(ByteBuffer byteBuffer) {
        return (Download) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: r */
    public static void m11236r(Download download) {
        download.status_ = 0;
    }

    /* JADX INFO: renamed from: s */
    public static void m11237s(Download download) {
        download.ttl_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDate(Timestamp timestamp) {
        timestamp.getClass();
        this.date_ = timestamp;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDownloadUrl(String str) {
        str.getClass();
        this.downloadUrl_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDownloadUrlBytes(gva gvaVar) {
        AbstractC2118m8.checkByteStringIsUtf8(gvaVar);
        this.downloadUrl_ = gvaVar.m45892u();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLevel(DownloadLevel downloadLevel) {
        this.level_ = downloadLevel.getNumber();
    }

    private void setLevelValue(int i) {
        this.level_ = i;
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

    /* JADX INFO: Access modifiers changed from: private */
    public void setStatus(DownloadStatus downloadStatus) {
        this.status_ = downloadStatus.getNumber();
    }

    private void setStatusValue(int i) {
        this.status_ = i;
    }

    private void setTtl(int i) {
        this.ttl_ = i;
    }

    /* JADX INFO: renamed from: y */
    public static void m11243y(int i, Download download) {
        download.level_ = i;
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001\f\u0002Ȉ\u0003Ȉ\u0004\u0004\u0005\f\u0006ဉ\u0000", new Object[]{"bitField0_", "status_", "downloadUrl_", "securityCode_", "ttl_", "level_", "date_"});
        }
        if (iOrdinal == 3) {
            return new Download();
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
        synchronized (Download.class) {
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

    @Override // com.spotify.graduation.p073v1.DownloadOrBuilder
    public final Timestamp getDate() {
        Timestamp timestamp = this.date_;
        return timestamp == null ? Timestamp.m1965q() : timestamp;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.sre0
    public final /* bridge */ /* synthetic */ pre0 getDefaultInstanceForType() {
        return getDefaultInstanceForType();
    }

    @Override // com.spotify.graduation.p073v1.DownloadOrBuilder
    public final String getDownloadUrl() {
        return this.downloadUrl_;
    }

    @Override // com.spotify.graduation.p073v1.DownloadOrBuilder
    public final gva getDownloadUrlBytes() {
        return gva.m45888f(this.downloadUrl_);
    }

    @Override // com.spotify.graduation.p073v1.DownloadOrBuilder
    public final DownloadLevel getLevel() {
        DownloadLevel downloadLevelForNumber = DownloadLevel.forNumber(this.level_);
        return downloadLevelForNumber == null ? DownloadLevel.UNRECOGNIZED : downloadLevelForNumber;
    }

    @Override // com.spotify.graduation.p073v1.DownloadOrBuilder
    public final int getLevelValue() {
        return this.level_;
    }

    @Override // com.spotify.graduation.p073v1.DownloadOrBuilder
    public final String getSecurityCode() {
        return this.securityCode_;
    }

    @Override // com.spotify.graduation.p073v1.DownloadOrBuilder
    public final gva getSecurityCodeBytes() {
        return gva.m45888f(this.securityCode_);
    }

    @Override // com.spotify.graduation.p073v1.DownloadOrBuilder
    public final DownloadStatus getStatus() {
        DownloadStatus downloadStatusForNumber = DownloadStatus.forNumber(this.status_);
        return downloadStatusForNumber == null ? DownloadStatus.UNRECOGNIZED : downloadStatusForNumber;
    }

    @Override // com.spotify.graduation.p073v1.DownloadOrBuilder
    public final int getStatusValue() {
        return this.status_;
    }

    @Override // com.spotify.graduation.p073v1.DownloadOrBuilder
    public final int getTtl() {
        return this.ttl_;
    }

    @Override // com.spotify.graduation.p073v1.DownloadOrBuilder
    public final boolean hasDate() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }

    public static Builder newBuilder(Download download) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(download);
    }

    public static Download parseDelimitedFrom(InputStream inputStream, aux auxVar) {
        return (Download) AbstractC0269h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, auxVar);
    }

    public static Download parseFrom(ByteBuffer byteBuffer, aux auxVar) {
        return (Download) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, byteBuffer, auxVar);
    }

    public static Download parseFrom(gva gvaVar) {
        return (Download) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, gvaVar);
    }

    public static Download parseFrom(gva gvaVar, aux auxVar) {
        return (Download) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, gvaVar, auxVar);
    }

    public static Download parseFrom(byte[] bArr) {
        return (Download) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Download parseFrom(byte[] bArr, aux auxVar) {
        return (Download) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr, auxVar);
    }

    public static Download parseFrom(InputStream inputStream) {
        return (Download) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Download parseFrom(InputStream inputStream, aux auxVar) {
        return (Download) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, inputStream, auxVar);
    }

    public static Download parseFrom(owe oweVar) {
        return (Download) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, oweVar);
    }

    public static Download parseFrom(owe oweVar, aux auxVar) {
        return (Download) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, oweVar, auxVar);
    }
}
