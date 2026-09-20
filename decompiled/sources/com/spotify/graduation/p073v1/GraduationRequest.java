package com.spotify.graduation.p073v1;

import com.google.protobuf.AbstractC0268g;
import com.google.protobuf.AbstractC0269h;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import p204p.AbstractC1733c9;
import p204p.AbstractC2081l8;
import p204p.AbstractC2118m8;
import p204p.aux;
import p204p.gva;
import p204p.n350;
import p204p.ore0;
import p204p.owe;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.ud50;
import p204p.vd50;
import p204p.wd50;
import p204p.z110;

/* JADX INFO: loaded from: classes7.dex */
public final class GraduationRequest extends AbstractC0269h implements GraduationRequestOrBuilder {
    private static final GraduationRequest DEFAULT_INSTANCE;
    public static final int LEVELS_FIELD_NUMBER = 2;
    private static volatile r2n0 PARSER;
    private static final vd50 levels_converter_ = new C07791();
    private int levelsMemoizedSerializedSize;
    private ud50 levels_ = AbstractC0269h.emptyIntList();

    /* JADX INFO: renamed from: com.spotify.graduation.v1.GraduationRequest$1 */
    public class C07791 implements vd50 {
        @Override // p204p.vd50
        public final DownloadLevel convert(int i) {
            DownloadLevel downloadLevelForNumber = DownloadLevel.forNumber(i);
            return downloadLevelForNumber == null ? DownloadLevel.UNRECOGNIZED : downloadLevelForNumber;
        }
    }

    /* JADX INFO: renamed from: com.spotify.graduation.v1.GraduationRequest$2 */
    public static /* synthetic */ class C07802 {

        /* JADX INFO: renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f4147xa1df5c61;

        static {
            int[] iArr = new int[z110.values().length];
            f4147xa1df5c61 = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f4147xa1df5c61[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f4147xa1df5c61[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f4147xa1df5c61[5] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f4147xa1df5c61[6] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f4147xa1df5c61[0] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f4147xa1df5c61[1] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class Builder extends AbstractC0268g implements GraduationRequestOrBuilder {
        public /* synthetic */ Builder(int i) {
            this();
        }

        public final Builder addAllLevels(Iterable<? extends DownloadLevel> iterable) {
            copyOnWrite();
            ((GraduationRequest) this.instance).addAllLevels(iterable);
            return this;
        }

        public final Builder addAllLevelsValue(Iterable<Integer> iterable) {
            copyOnWrite();
            ((GraduationRequest) this.instance).addAllLevelsValue(iterable);
            return this;
        }

        public final Builder addLevels(DownloadLevel downloadLevel) {
            copyOnWrite();
            ((GraduationRequest) this.instance).addLevels(downloadLevel);
            return this;
        }

        public final Builder addLevelsValue(int i) {
            copyOnWrite();
            ((GraduationRequest) this.instance).addLevelsValue(i);
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

        public final Builder clearLevels() {
            copyOnWrite();
            ((GraduationRequest) this.instance).clearLevels();
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

        @Override // com.spotify.graduation.p073v1.GraduationRequestOrBuilder
        public final DownloadLevel getLevels(int i) {
            return ((GraduationRequest) this.instance).getLevels(i);
        }

        @Override // com.spotify.graduation.p073v1.GraduationRequestOrBuilder
        public final int getLevelsCount() {
            return ((GraduationRequest) this.instance).getLevelsCount();
        }

        @Override // com.spotify.graduation.p073v1.GraduationRequestOrBuilder
        public final List<DownloadLevel> getLevelsList() {
            return ((GraduationRequest) this.instance).getLevelsList();
        }

        @Override // com.spotify.graduation.p073v1.GraduationRequestOrBuilder
        public final int getLevelsValue(int i) {
            return ((GraduationRequest) this.instance).getLevelsValue(i);
        }

        @Override // com.spotify.graduation.p073v1.GraduationRequestOrBuilder
        public final List<Integer> getLevelsValueList() {
            return Collections.unmodifiableList(((GraduationRequest) this.instance).getLevelsValueList());
        }

        @Override // com.google.protobuf.AbstractC0268g, p204p.AbstractC2081l8
        public final /* bridge */ /* synthetic */ AbstractC2081l8 internalMergeFrom(AbstractC2118m8 abstractC2118m8) {
            return super.internalMergeFrom((AbstractC0269h) abstractC2118m8);
        }

        @Override // com.google.protobuf.AbstractC0268g, p204p.AbstractC2081l8, p204p.ore0
        public final /* bridge */ /* synthetic */ AbstractC2081l8 mergeFrom(owe oweVar, aux auxVar) {
            return super.mergeFrom(oweVar, auxVar);
        }

        public final Builder setLevels(int i, DownloadLevel downloadLevel) {
            copyOnWrite();
            ((GraduationRequest) this.instance).setLevels(i, downloadLevel);
            return this;
        }

        public final Builder setLevelsValue(int i, int i2) {
            copyOnWrite();
            ((GraduationRequest) this.instance).setLevelsValue(i, i2);
            return this;
        }

        private Builder() {
            super(GraduationRequest.DEFAULT_INSTANCE);
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
        GraduationRequest graduationRequest = new GraduationRequest();
        DEFAULT_INSTANCE = graduationRequest;
        AbstractC0269h.registerDefaultInstance(GraduationRequest.class, graduationRequest);
    }

    private GraduationRequest() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllLevels(Iterable<? extends DownloadLevel> iterable) {
        ensureLevelsIsMutable();
        for (DownloadLevel downloadLevel : iterable) {
            ((n350) this.levels_).m63581b(downloadLevel.getNumber());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllLevelsValue(Iterable<Integer> iterable) {
        ensureLevelsIsMutable();
        Iterator<Integer> it = iterable.iterator();
        while (it.hasNext()) {
            ((n350) this.levels_).m63581b(it.next().intValue());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addLevels(DownloadLevel downloadLevel) {
        downloadLevel.getClass();
        ensureLevelsIsMutable();
        ((n350) this.levels_).m63581b(downloadLevel.getNumber());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addLevelsValue(int i) {
        ensureLevelsIsMutable();
        ((n350) this.levels_).m63581b(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLevels() {
        this.levels_ = AbstractC0269h.emptyIntList();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void ensureLevelsIsMutable() {
        ud50 ud50Var = this.levels_;
        if (((AbstractC1733c9) ud50Var).f35342a) {
            return;
        }
        this.levels_ = AbstractC0269h.mutableCopy(ud50Var);
    }

    public static GraduationRequest getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static GraduationRequest parseDelimitedFrom(InputStream inputStream) {
        return (GraduationRequest) AbstractC0269h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static GraduationRequest parseFrom(ByteBuffer byteBuffer) {
        return (GraduationRequest) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLevels(int i, DownloadLevel downloadLevel) {
        downloadLevel.getClass();
        ensureLevelsIsMutable();
        ((n350) this.levels_).m63585i(i, downloadLevel.getNumber());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLevelsValue(int i, int i2) {
        ensureLevelsIsMutable();
        ((n350) this.levels_).m63585i(i, i2);
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0001\u0000\u0002,", new Object[]{"levels_"});
        }
        if (iOrdinal == 3) {
            return new GraduationRequest();
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
        synchronized (GraduationRequest.class) {
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

    @Override // com.spotify.graduation.p073v1.GraduationRequestOrBuilder
    public final DownloadLevel getLevels(int i) {
        DownloadLevel downloadLevelForNumber = DownloadLevel.forNumber(((n350) this.levels_).m63583e(i));
        return downloadLevelForNumber == null ? DownloadLevel.UNRECOGNIZED : downloadLevelForNumber;
    }

    @Override // com.spotify.graduation.p073v1.GraduationRequestOrBuilder
    public final int getLevelsCount() {
        return ((n350) this.levels_).size();
    }

    @Override // com.spotify.graduation.p073v1.GraduationRequestOrBuilder
    public final List<DownloadLevel> getLevelsList() {
        return new wd50(this.levels_, levels_converter_);
    }

    @Override // com.spotify.graduation.p073v1.GraduationRequestOrBuilder
    public final int getLevelsValue(int i) {
        return ((n350) this.levels_).m63583e(i);
    }

    @Override // com.spotify.graduation.p073v1.GraduationRequestOrBuilder
    public final List<Integer> getLevelsValueList() {
        return this.levels_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }

    public static Builder newBuilder(GraduationRequest graduationRequest) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(graduationRequest);
    }

    public static GraduationRequest parseDelimitedFrom(InputStream inputStream, aux auxVar) {
        return (GraduationRequest) AbstractC0269h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, auxVar);
    }

    public static GraduationRequest parseFrom(ByteBuffer byteBuffer, aux auxVar) {
        return (GraduationRequest) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, byteBuffer, auxVar);
    }

    public static GraduationRequest parseFrom(gva gvaVar) {
        return (GraduationRequest) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, gvaVar);
    }

    public static GraduationRequest parseFrom(gva gvaVar, aux auxVar) {
        return (GraduationRequest) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, gvaVar, auxVar);
    }

    public static GraduationRequest parseFrom(byte[] bArr) {
        return (GraduationRequest) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static GraduationRequest parseFrom(byte[] bArr, aux auxVar) {
        return (GraduationRequest) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr, auxVar);
    }

    public static GraduationRequest parseFrom(InputStream inputStream) {
        return (GraduationRequest) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static GraduationRequest parseFrom(InputStream inputStream, aux auxVar) {
        return (GraduationRequest) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, inputStream, auxVar);
    }

    public static GraduationRequest parseFrom(owe oweVar) {
        return (GraduationRequest) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, oweVar);
    }

    public static GraduationRequest parseFrom(owe oweVar, aux auxVar) {
        return (GraduationRequest) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, oweVar, auxVar);
    }
}
