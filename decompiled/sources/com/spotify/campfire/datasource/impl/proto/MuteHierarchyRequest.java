package com.spotify.campfire.datasource.impl.proto;

import com.google.protobuf.AbstractC0268g;
import com.google.protobuf.AbstractC0269h;
import com.google.protobuf.Duration;
import java.io.InputStream;
import java.nio.ByteBuffer;
import p204p.AbstractC2081l8;
import p204p.AbstractC2118m8;
import p204p.aux;
import p204p.bks;
import p204p.gva;
import p204p.ore0;
import p204p.owe;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.z110;

/* JADX INFO: loaded from: classes.dex */
public final class MuteHierarchyRequest extends AbstractC0269h implements MuteHierarchyRequestOrBuilder {
    private static final MuteHierarchyRequest DEFAULT_INSTANCE;
    public static final int DURATION_FIELD_NUMBER = 2;
    public static final int HIERARCHY_ID_FIELD_NUMBER = 1;
    private static volatile r2n0 PARSER;
    private int bitField0_;
    private Duration duration_;
    private String hierarchyId_ = "";

    /* JADX INFO: renamed from: com.spotify.campfire.datasource.impl.proto.MuteHierarchyRequest$1 */
    /* JADX INFO: loaded from: classes5.dex */
    public static /* synthetic */ class C04121 {

        /* JADX INFO: renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f3228xa1df5c61;

        static {
            int[] iArr = new int[z110.values().length];
            f3228xa1df5c61 = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f3228xa1df5c61[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f3228xa1df5c61[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f3228xa1df5c61[5] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f3228xa1df5c61[6] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f3228xa1df5c61[0] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f3228xa1df5c61[1] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* JADX INFO: loaded from: classes5.dex */
    public static final class Builder extends AbstractC0268g implements MuteHierarchyRequestOrBuilder {
        public /* synthetic */ Builder(int i) {
            this();
        }

        @Override // com.google.protobuf.AbstractC0268g, p204p.ore0
        public /* bridge */ /* synthetic */ pre0 build() {
            return build();
        }

        @Override // com.google.protobuf.AbstractC0268g, p204p.ore0
        public /* bridge */ /* synthetic */ pre0 buildPartial() {
            return super.buildPartial();
        }

        @Override // com.google.protobuf.AbstractC0268g
        /* JADX INFO: renamed from: clear */
        public /* bridge */ /* synthetic */ ore0 mo98325clear() {
            return mo98325clear();
        }

        public Builder clearDuration() {
            copyOnWrite();
            ((MuteHierarchyRequest) this.instance).clearDuration();
            return this;
        }

        public Builder clearHierarchyId() {
            copyOnWrite();
            ((MuteHierarchyRequest) this.instance).clearHierarchyId();
            return this;
        }

        @Override // com.google.protobuf.AbstractC0268g
        /* JADX INFO: renamed from: clone */
        public /* bridge */ /* synthetic */ Object mo98328clone() {
            return super.mo98326clone();
        }

        @Override // com.google.protobuf.AbstractC0268g, p204p.sre0
        public /* bridge */ /* synthetic */ pre0 getDefaultInstanceForType() {
            return super.getDefaultInstanceForType();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.MuteHierarchyRequestOrBuilder
        public Duration getDuration() {
            return ((MuteHierarchyRequest) this.instance).getDuration();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.MuteHierarchyRequestOrBuilder
        public String getHierarchyId() {
            return ((MuteHierarchyRequest) this.instance).getHierarchyId();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.MuteHierarchyRequestOrBuilder
        public gva getHierarchyIdBytes() {
            return ((MuteHierarchyRequest) this.instance).getHierarchyIdBytes();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.MuteHierarchyRequestOrBuilder
        public boolean hasDuration() {
            return ((MuteHierarchyRequest) this.instance).hasDuration();
        }

        @Override // com.google.protobuf.AbstractC0268g, p204p.AbstractC2081l8
        public /* bridge */ /* synthetic */ AbstractC2081l8 internalMergeFrom(AbstractC2118m8 abstractC2118m8) {
            return super.internalMergeFrom((AbstractC0269h) abstractC2118m8);
        }

        public Builder mergeDuration(Duration duration) {
            copyOnWrite();
            ((MuteHierarchyRequest) this.instance).mergeDuration(duration);
            return this;
        }

        @Override // com.google.protobuf.AbstractC0268g, p204p.AbstractC2081l8, p204p.ore0
        public /* bridge */ /* synthetic */ AbstractC2081l8 mergeFrom(owe oweVar, aux auxVar) {
            return super.mergeFrom(oweVar, auxVar);
        }

        public Builder setDuration(Duration duration) {
            copyOnWrite();
            ((MuteHierarchyRequest) this.instance).setDuration(duration);
            return this;
        }

        public Builder setHierarchyId(String str) {
            copyOnWrite();
            ((MuteHierarchyRequest) this.instance).setHierarchyId(str);
            return this;
        }

        public Builder setHierarchyIdBytes(gva gvaVar) {
            copyOnWrite();
            ((MuteHierarchyRequest) this.instance).setHierarchyIdBytes(gvaVar);
            return this;
        }

        private Builder() {
            super(MuteHierarchyRequest.DEFAULT_INSTANCE);
        }

        @Override // com.google.protobuf.AbstractC0268g
        /* JADX INFO: renamed from: clone */
        public /* bridge */ /* synthetic */ AbstractC2081l8 mo98327clone() {
            return super.mo98326clone();
        }

        @Override // com.google.protobuf.AbstractC0268g, p204p.AbstractC2081l8
        /* JADX INFO: renamed from: mergeFrom */
        public /* bridge */ /* synthetic */ AbstractC2081l8 mo98329mergeFrom(byte[] bArr, int i, int i2) {
            return super.mo98329mergeFrom(bArr, i, i2);
        }

        @Override // com.google.protobuf.AbstractC0268g
        /* JADX INFO: renamed from: clone */
        public /* bridge */ /* synthetic */ ore0 mo98327clone() {
            return super.mo98326clone();
        }

        @Override // com.google.protobuf.AbstractC0268g, p204p.AbstractC2081l8
        /* JADX INFO: renamed from: mergeFrom */
        public /* bridge */ /* synthetic */ AbstractC2081l8 mo98330mergeFrom(byte[] bArr, int i, int i2, aux auxVar) {
            return super.mo98330mergeFrom(bArr, i, i2, auxVar);
        }

        public Builder setDuration(bks bksVar) {
            copyOnWrite();
            ((MuteHierarchyRequest) this.instance).setDuration((Duration) bksVar.build());
            return this;
        }

        @Override // p204p.AbstractC2081l8
        /* JADX INFO: renamed from: mergeFrom */
        public /* bridge */ /* synthetic */ ore0 mo98371mergeFrom(InputStream inputStream) {
            return super.mo98371mergeFrom(inputStream);
        }

        @Override // p204p.AbstractC2081l8
        /* JADX INFO: renamed from: mergeFrom */
        public /* bridge */ /* synthetic */ ore0 mo98372mergeFrom(InputStream inputStream, aux auxVar) {
            return super.mo98372mergeFrom(inputStream, auxVar);
        }

        @Override // p204p.AbstractC2081l8
        /* JADX INFO: renamed from: mergeFrom */
        public /* bridge */ /* synthetic */ ore0 mo98373mergeFrom(gva gvaVar) {
            return super.mo98373mergeFrom(gvaVar);
        }

        @Override // p204p.AbstractC2081l8
        /* JADX INFO: renamed from: mergeFrom */
        public /* bridge */ /* synthetic */ ore0 mo98374mergeFrom(gva gvaVar, aux auxVar) {
            return super.mo98374mergeFrom(gvaVar, auxVar);
        }

        @Override // p204p.AbstractC2081l8
        /* JADX INFO: renamed from: mergeFrom */
        public /* bridge */ /* synthetic */ ore0 mo98375mergeFrom(owe oweVar) {
            return super.mo98375mergeFrom(oweVar);
        }

        @Override // com.google.protobuf.AbstractC0268g, p204p.ore0
        public /* bridge */ /* synthetic */ ore0 mergeFrom(owe oweVar, aux auxVar) {
            return super.mergeFrom(oweVar, auxVar);
        }

        @Override // p204p.AbstractC2081l8, p204p.ore0
        public /* bridge */ /* synthetic */ ore0 mergeFrom(pre0 pre0Var) {
            return super.mergeFrom(pre0Var);
        }

        @Override // p204p.AbstractC2081l8
        /* JADX INFO: renamed from: mergeFrom */
        public /* bridge */ /* synthetic */ ore0 mo98376mergeFrom(byte[] bArr) {
            return super.mo98376mergeFrom(bArr);
        }

        @Override // com.google.protobuf.AbstractC0268g
        /* JADX INFO: renamed from: mergeFrom */
        public /* bridge */ /* synthetic */ ore0 mo98329mergeFrom(byte[] bArr, int i, int i2) {
            return super.mo98329mergeFrom(bArr, i, i2);
        }

        @Override // com.google.protobuf.AbstractC0268g
        /* JADX INFO: renamed from: mergeFrom */
        public /* bridge */ /* synthetic */ ore0 mo98330mergeFrom(byte[] bArr, int i, int i2, aux auxVar) {
            return super.mo98330mergeFrom(bArr, i, i2, auxVar);
        }

        @Override // p204p.AbstractC2081l8
        /* JADX INFO: renamed from: mergeFrom */
        public /* bridge */ /* synthetic */ ore0 mo98377mergeFrom(byte[] bArr, aux auxVar) {
            return super.mo98377mergeFrom(bArr, auxVar);
        }
    }

    static {
        MuteHierarchyRequest muteHierarchyRequest = new MuteHierarchyRequest();
        DEFAULT_INSTANCE = muteHierarchyRequest;
        AbstractC0269h.registerDefaultInstance(MuteHierarchyRequest.class, muteHierarchyRequest);
    }

    private MuteHierarchyRequest() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDuration() {
        this.duration_ = null;
        this.bitField0_ &= -2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearHierarchyId() {
        this.hierarchyId_ = getDefaultInstance().getHierarchyId();
    }

    public static MuteHierarchyRequest getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeDuration(Duration duration) {
        duration.getClass();
        Duration duration2 = this.duration_;
        if (duration2 == null || duration2 == Duration.m1928p()) {
            this.duration_ = duration;
        } else {
            this.duration_ = (Duration) ((bks) Duration.m1930t(this.duration_).mergeFrom((AbstractC0269h) duration)).buildPartial();
        }
        this.bitField0_ |= 1;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static MuteHierarchyRequest parseDelimitedFrom(InputStream inputStream) {
        return (MuteHierarchyRequest) AbstractC0269h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static MuteHierarchyRequest parseFrom(ByteBuffer byteBuffer) {
        return (MuteHierarchyRequest) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDuration(Duration duration) {
        duration.getClass();
        this.duration_ = duration;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHierarchyId(String str) {
        str.getClass();
        this.hierarchyId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHierarchyIdBytes(gva gvaVar) {
        AbstractC2118m8.checkByteStringIsUtf8(gvaVar);
        this.hierarchyId_ = gvaVar.m45892u();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002ဉ\u0000", new Object[]{"bitField0_", "hierarchyId_", "duration_"});
        }
        if (iOrdinal == 3) {
            return new MuteHierarchyRequest();
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
        synchronized (MuteHierarchyRequest.class) {
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
    public /* bridge */ /* synthetic */ pre0 getDefaultInstanceForType() {
        return getDefaultInstanceForType();
    }

    @Override // com.spotify.campfire.datasource.impl.proto.MuteHierarchyRequestOrBuilder
    public Duration getDuration() {
        Duration duration = this.duration_;
        return duration == null ? Duration.m1928p() : duration;
    }

    @Override // com.spotify.campfire.datasource.impl.proto.MuteHierarchyRequestOrBuilder
    public String getHierarchyId() {
        return this.hierarchyId_;
    }

    @Override // com.spotify.campfire.datasource.impl.proto.MuteHierarchyRequestOrBuilder
    public gva getHierarchyIdBytes() {
        return gva.m45888f(this.hierarchyId_);
    }

    @Override // com.spotify.campfire.datasource.impl.proto.MuteHierarchyRequestOrBuilder
    public boolean hasDuration() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }

    public static Builder newBuilder(MuteHierarchyRequest muteHierarchyRequest) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(muteHierarchyRequest);
    }

    public static MuteHierarchyRequest parseDelimitedFrom(InputStream inputStream, aux auxVar) {
        return (MuteHierarchyRequest) AbstractC0269h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, auxVar);
    }

    public static MuteHierarchyRequest parseFrom(ByteBuffer byteBuffer, aux auxVar) {
        return (MuteHierarchyRequest) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, byteBuffer, auxVar);
    }

    public static MuteHierarchyRequest parseFrom(gva gvaVar) {
        return (MuteHierarchyRequest) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, gvaVar);
    }

    public static MuteHierarchyRequest parseFrom(gva gvaVar, aux auxVar) {
        return (MuteHierarchyRequest) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, gvaVar, auxVar);
    }

    public static MuteHierarchyRequest parseFrom(byte[] bArr) {
        return (MuteHierarchyRequest) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static MuteHierarchyRequest parseFrom(byte[] bArr, aux auxVar) {
        return (MuteHierarchyRequest) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr, auxVar);
    }

    public static MuteHierarchyRequest parseFrom(InputStream inputStream) {
        return (MuteHierarchyRequest) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static MuteHierarchyRequest parseFrom(InputStream inputStream, aux auxVar) {
        return (MuteHierarchyRequest) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, inputStream, auxVar);
    }

    public static MuteHierarchyRequest parseFrom(owe oweVar) {
        return (MuteHierarchyRequest) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, oweVar);
    }

    public static MuteHierarchyRequest parseFrom(owe oweVar, aux auxVar) {
        return (MuteHierarchyRequest) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, oweVar, auxVar);
    }
}
