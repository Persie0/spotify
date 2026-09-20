package com.spotify.cosmos.util.policy.proto;

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

/* JADX INFO: loaded from: classes6.dex */
public final class ArtistSyncDecorationPolicy extends AbstractC0269h implements ArtistSyncDecorationPolicyOrBuilder {
    private static final ArtistSyncDecorationPolicy DEFAULT_INSTANCE;
    public static final int INFERRED_OFFLINE_FIELD_NUMBER = 1;
    public static final int OFFLINE_STATE_FIELD_NUMBER = 2;
    private static volatile r2n0 PARSER = null;
    public static final int SYNC_PROGRESS_FIELD_NUMBER = 3;
    private boolean inferredOffline_;
    private boolean offlineState_;
    private boolean syncProgress_;

    /* JADX INFO: renamed from: com.spotify.cosmos.util.policy.proto.ArtistSyncDecorationPolicy$1 */
    public static /* synthetic */ class C06391 {

        /* JADX INFO: renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f3493xa1df5c61;

        static {
            int[] iArr = new int[z110.values().length];
            f3493xa1df5c61 = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f3493xa1df5c61[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f3493xa1df5c61[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f3493xa1df5c61[5] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f3493xa1df5c61[6] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f3493xa1df5c61[0] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f3493xa1df5c61[1] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class Builder extends AbstractC0268g implements ArtistSyncDecorationPolicyOrBuilder {
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

        public Builder clearInferredOffline() {
            copyOnWrite();
            ((ArtistSyncDecorationPolicy) this.instance).clearInferredOffline();
            return this;
        }

        public Builder clearOfflineState() {
            copyOnWrite();
            ((ArtistSyncDecorationPolicy) this.instance).clearOfflineState();
            return this;
        }

        public Builder clearSyncProgress() {
            copyOnWrite();
            ((ArtistSyncDecorationPolicy) this.instance).clearSyncProgress();
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

        @Override // com.spotify.cosmos.util.policy.proto.ArtistSyncDecorationPolicyOrBuilder
        public boolean getInferredOffline() {
            return ((ArtistSyncDecorationPolicy) this.instance).getInferredOffline();
        }

        @Override // com.spotify.cosmos.util.policy.proto.ArtistSyncDecorationPolicyOrBuilder
        public boolean getOfflineState() {
            return ((ArtistSyncDecorationPolicy) this.instance).getOfflineState();
        }

        @Override // com.spotify.cosmos.util.policy.proto.ArtistSyncDecorationPolicyOrBuilder
        public boolean getSyncProgress() {
            return ((ArtistSyncDecorationPolicy) this.instance).getSyncProgress();
        }

        @Override // com.google.protobuf.AbstractC0268g, p204p.AbstractC2081l8
        public /* bridge */ /* synthetic */ AbstractC2081l8 internalMergeFrom(AbstractC2118m8 abstractC2118m8) {
            return super.internalMergeFrom((AbstractC0269h) abstractC2118m8);
        }

        @Override // com.google.protobuf.AbstractC0268g, p204p.AbstractC2081l8, p204p.ore0
        public /* bridge */ /* synthetic */ AbstractC2081l8 mergeFrom(owe oweVar, aux auxVar) {
            return super.mergeFrom(oweVar, auxVar);
        }

        public Builder setInferredOffline(boolean z) {
            copyOnWrite();
            ((ArtistSyncDecorationPolicy) this.instance).setInferredOffline(z);
            return this;
        }

        public Builder setOfflineState(boolean z) {
            copyOnWrite();
            ((ArtistSyncDecorationPolicy) this.instance).setOfflineState(z);
            return this;
        }

        public Builder setSyncProgress(boolean z) {
            copyOnWrite();
            ((ArtistSyncDecorationPolicy) this.instance).setSyncProgress(z);
            return this;
        }

        private Builder() {
            super(ArtistSyncDecorationPolicy.DEFAULT_INSTANCE);
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
        ArtistSyncDecorationPolicy artistSyncDecorationPolicy = new ArtistSyncDecorationPolicy();
        DEFAULT_INSTANCE = artistSyncDecorationPolicy;
        AbstractC0269h.registerDefaultInstance(ArtistSyncDecorationPolicy.class, artistSyncDecorationPolicy);
    }

    private ArtistSyncDecorationPolicy() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearInferredOffline() {
        this.inferredOffline_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearOfflineState() {
        this.offlineState_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSyncProgress() {
        this.syncProgress_ = false;
    }

    public static ArtistSyncDecorationPolicy getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static ArtistSyncDecorationPolicy parseDelimitedFrom(InputStream inputStream) {
        return (ArtistSyncDecorationPolicy) AbstractC0269h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ArtistSyncDecorationPolicy parseFrom(ByteBuffer byteBuffer) {
        return (ArtistSyncDecorationPolicy) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setInferredOffline(boolean z) {
        this.inferredOffline_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOfflineState(boolean z) {
        this.offlineState_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSyncProgress(boolean z) {
        this.syncProgress_ = z;
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0007\u0002\u0007\u0003\u0007", new Object[]{"inferredOffline_", "offlineState_", "syncProgress_"});
        }
        if (iOrdinal == 3) {
            return new ArtistSyncDecorationPolicy();
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
        synchronized (ArtistSyncDecorationPolicy.class) {
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

    @Override // com.spotify.cosmos.util.policy.proto.ArtistSyncDecorationPolicyOrBuilder
    public boolean getInferredOffline() {
        return this.inferredOffline_;
    }

    @Override // com.spotify.cosmos.util.policy.proto.ArtistSyncDecorationPolicyOrBuilder
    public boolean getOfflineState() {
        return this.offlineState_;
    }

    @Override // com.spotify.cosmos.util.policy.proto.ArtistSyncDecorationPolicyOrBuilder
    public boolean getSyncProgress() {
        return this.syncProgress_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }

    public static Builder newBuilder(ArtistSyncDecorationPolicy artistSyncDecorationPolicy) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(artistSyncDecorationPolicy);
    }

    public static ArtistSyncDecorationPolicy parseDelimitedFrom(InputStream inputStream, aux auxVar) {
        return (ArtistSyncDecorationPolicy) AbstractC0269h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, auxVar);
    }

    public static ArtistSyncDecorationPolicy parseFrom(ByteBuffer byteBuffer, aux auxVar) {
        return (ArtistSyncDecorationPolicy) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, byteBuffer, auxVar);
    }

    public static ArtistSyncDecorationPolicy parseFrom(gva gvaVar) {
        return (ArtistSyncDecorationPolicy) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, gvaVar);
    }

    public static ArtistSyncDecorationPolicy parseFrom(gva gvaVar, aux auxVar) {
        return (ArtistSyncDecorationPolicy) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, gvaVar, auxVar);
    }

    public static ArtistSyncDecorationPolicy parseFrom(byte[] bArr) {
        return (ArtistSyncDecorationPolicy) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ArtistSyncDecorationPolicy parseFrom(byte[] bArr, aux auxVar) {
        return (ArtistSyncDecorationPolicy) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr, auxVar);
    }

    public static ArtistSyncDecorationPolicy parseFrom(InputStream inputStream) {
        return (ArtistSyncDecorationPolicy) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ArtistSyncDecorationPolicy parseFrom(InputStream inputStream, aux auxVar) {
        return (ArtistSyncDecorationPolicy) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, inputStream, auxVar);
    }

    public static ArtistSyncDecorationPolicy parseFrom(owe oweVar) {
        return (ArtistSyncDecorationPolicy) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, oweVar);
    }

    public static ArtistSyncDecorationPolicy parseFrom(owe oweVar, aux auxVar) {
        return (ArtistSyncDecorationPolicy) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, oweVar, auxVar);
    }
}
