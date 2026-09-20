package com.spotify.kidsview.p091v1.proto;

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

/* JADX INFO: loaded from: classes7.dex */
public final class TransitionToManagedAccountResponse extends AbstractC0269h implements TransitionToManagedAccountResponseOrBuilder {
    private static final TransitionToManagedAccountResponse DEFAULT_INSTANCE;
    public static final int MIGRATION_ID_FIELD_NUMBER = 2;
    private static volatile r2n0 PARSER = null;
    public static final int TIMEOUT_FIELD_NUMBER = 1;
    private int bitField0_;
    private String migrationId_ = "";
    private Duration timeout_;

    /* JADX INFO: renamed from: com.spotify.kidsview.v1.proto.TransitionToManagedAccountResponse$1 */
    public static /* synthetic */ class C08271 {

        /* JADX INFO: renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f5001xa1df5c61;

        static {
            int[] iArr = new int[z110.values().length];
            f5001xa1df5c61 = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f5001xa1df5c61[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f5001xa1df5c61[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f5001xa1df5c61[5] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f5001xa1df5c61[6] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f5001xa1df5c61[0] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f5001xa1df5c61[1] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class Builder extends AbstractC0268g implements TransitionToManagedAccountResponseOrBuilder {
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

        public Builder clearMigrationId() {
            copyOnWrite();
            ((TransitionToManagedAccountResponse) this.instance).clearMigrationId();
            return this;
        }

        public Builder clearTimeout() {
            copyOnWrite();
            ((TransitionToManagedAccountResponse) this.instance).clearTimeout();
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

        @Override // com.spotify.kidsview.p091v1.proto.TransitionToManagedAccountResponseOrBuilder
        public String getMigrationId() {
            return ((TransitionToManagedAccountResponse) this.instance).getMigrationId();
        }

        @Override // com.spotify.kidsview.p091v1.proto.TransitionToManagedAccountResponseOrBuilder
        public gva getMigrationIdBytes() {
            return ((TransitionToManagedAccountResponse) this.instance).getMigrationIdBytes();
        }

        @Override // com.spotify.kidsview.p091v1.proto.TransitionToManagedAccountResponseOrBuilder
        public Duration getTimeout() {
            return ((TransitionToManagedAccountResponse) this.instance).getTimeout();
        }

        @Override // com.spotify.kidsview.p091v1.proto.TransitionToManagedAccountResponseOrBuilder
        public boolean hasTimeout() {
            return ((TransitionToManagedAccountResponse) this.instance).hasTimeout();
        }

        @Override // com.google.protobuf.AbstractC0268g, p204p.AbstractC2081l8
        public /* bridge */ /* synthetic */ AbstractC2081l8 internalMergeFrom(AbstractC2118m8 abstractC2118m8) {
            return super.internalMergeFrom((AbstractC0269h) abstractC2118m8);
        }

        @Override // com.google.protobuf.AbstractC0268g, p204p.AbstractC2081l8, p204p.ore0
        public /* bridge */ /* synthetic */ AbstractC2081l8 mergeFrom(owe oweVar, aux auxVar) {
            return super.mergeFrom(oweVar, auxVar);
        }

        public Builder mergeTimeout(Duration duration) {
            copyOnWrite();
            ((TransitionToManagedAccountResponse) this.instance).mergeTimeout(duration);
            return this;
        }

        public Builder setMigrationId(String str) {
            copyOnWrite();
            ((TransitionToManagedAccountResponse) this.instance).setMigrationId(str);
            return this;
        }

        public Builder setMigrationIdBytes(gva gvaVar) {
            copyOnWrite();
            ((TransitionToManagedAccountResponse) this.instance).setMigrationIdBytes(gvaVar);
            return this;
        }

        public Builder setTimeout(Duration duration) {
            copyOnWrite();
            ((TransitionToManagedAccountResponse) this.instance).setTimeout(duration);
            return this;
        }

        private Builder() {
            super(TransitionToManagedAccountResponse.DEFAULT_INSTANCE);
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

        public Builder setTimeout(bks bksVar) {
            copyOnWrite();
            ((TransitionToManagedAccountResponse) this.instance).setTimeout((Duration) bksVar.build());
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
        TransitionToManagedAccountResponse transitionToManagedAccountResponse = new TransitionToManagedAccountResponse();
        DEFAULT_INSTANCE = transitionToManagedAccountResponse;
        AbstractC0269h.registerDefaultInstance(TransitionToManagedAccountResponse.class, transitionToManagedAccountResponse);
    }

    private TransitionToManagedAccountResponse() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMigrationId() {
        this.migrationId_ = getDefaultInstance().getMigrationId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTimeout() {
        this.timeout_ = null;
        this.bitField0_ &= -2;
    }

    public static TransitionToManagedAccountResponse getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeTimeout(Duration duration) {
        duration.getClass();
        Duration duration2 = this.timeout_;
        if (duration2 == null || duration2 == Duration.m1928p()) {
            this.timeout_ = duration;
        } else {
            this.timeout_ = (Duration) ((bks) Duration.m1930t(this.timeout_).mergeFrom((AbstractC0269h) duration)).buildPartial();
        }
        this.bitField0_ |= 1;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static TransitionToManagedAccountResponse parseDelimitedFrom(InputStream inputStream) {
        return (TransitionToManagedAccountResponse) AbstractC0269h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static TransitionToManagedAccountResponse parseFrom(ByteBuffer byteBuffer) {
        return (TransitionToManagedAccountResponse) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMigrationId(String str) {
        str.getClass();
        this.migrationId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMigrationIdBytes(gva gvaVar) {
        AbstractC2118m8.checkByteStringIsUtf8(gvaVar);
        this.migrationId_ = gvaVar.m45892u();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTimeout(Duration duration) {
        duration.getClass();
        this.timeout_ = duration;
        this.bitField0_ |= 1;
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002Ȉ", new Object[]{"bitField0_", "timeout_", "migrationId_"});
        }
        if (iOrdinal == 3) {
            return new TransitionToManagedAccountResponse();
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
        synchronized (TransitionToManagedAccountResponse.class) {
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

    @Override // com.spotify.kidsview.p091v1.proto.TransitionToManagedAccountResponseOrBuilder
    public String getMigrationId() {
        return this.migrationId_;
    }

    @Override // com.spotify.kidsview.p091v1.proto.TransitionToManagedAccountResponseOrBuilder
    public gva getMigrationIdBytes() {
        return gva.m45888f(this.migrationId_);
    }

    @Override // com.spotify.kidsview.p091v1.proto.TransitionToManagedAccountResponseOrBuilder
    public Duration getTimeout() {
        Duration duration = this.timeout_;
        return duration == null ? Duration.m1928p() : duration;
    }

    @Override // com.spotify.kidsview.p091v1.proto.TransitionToManagedAccountResponseOrBuilder
    public boolean hasTimeout() {
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

    public static Builder newBuilder(TransitionToManagedAccountResponse transitionToManagedAccountResponse) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(transitionToManagedAccountResponse);
    }

    public static TransitionToManagedAccountResponse parseDelimitedFrom(InputStream inputStream, aux auxVar) {
        return (TransitionToManagedAccountResponse) AbstractC0269h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, auxVar);
    }

    public static TransitionToManagedAccountResponse parseFrom(ByteBuffer byteBuffer, aux auxVar) {
        return (TransitionToManagedAccountResponse) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, byteBuffer, auxVar);
    }

    public static TransitionToManagedAccountResponse parseFrom(gva gvaVar) {
        return (TransitionToManagedAccountResponse) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, gvaVar);
    }

    public static TransitionToManagedAccountResponse parseFrom(gva gvaVar, aux auxVar) {
        return (TransitionToManagedAccountResponse) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, gvaVar, auxVar);
    }

    public static TransitionToManagedAccountResponse parseFrom(byte[] bArr) {
        return (TransitionToManagedAccountResponse) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static TransitionToManagedAccountResponse parseFrom(byte[] bArr, aux auxVar) {
        return (TransitionToManagedAccountResponse) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr, auxVar);
    }

    public static TransitionToManagedAccountResponse parseFrom(InputStream inputStream) {
        return (TransitionToManagedAccountResponse) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static TransitionToManagedAccountResponse parseFrom(InputStream inputStream, aux auxVar) {
        return (TransitionToManagedAccountResponse) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, inputStream, auxVar);
    }

    public static TransitionToManagedAccountResponse parseFrom(owe oweVar) {
        return (TransitionToManagedAccountResponse) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, oweVar);
    }

    public static TransitionToManagedAccountResponse parseFrom(owe oweVar, aux auxVar) {
        return (TransitionToManagedAccountResponse) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, oweVar, auxVar);
    }
}
