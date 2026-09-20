package com.spotify.cosmos.util.proto;

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
public final class ArtistSyncState extends AbstractC0269h implements ArtistSyncStateOrBuilder {
    private static final ArtistSyncState DEFAULT_INSTANCE;
    public static final int INFERRED_OFFLINE_FIELD_NUMBER = 2;
    public static final int OFFLINE_FIELD_NUMBER = 1;
    private static volatile r2n0 PARSER = null;
    public static final int SYNC_PROGRESS_FIELD_NUMBER = 3;
    private int bitField0_;
    private int syncProgress_;
    private String offline_ = "";
    private String inferredOffline_ = "";

    /* JADX INFO: renamed from: com.spotify.cosmos.util.proto.ArtistSyncState$1 */
    public static /* synthetic */ class C06611 {

        /* JADX INFO: renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f3512xa1df5c61;

        static {
            int[] iArr = new int[z110.values().length];
            f3512xa1df5c61 = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f3512xa1df5c61[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f3512xa1df5c61[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f3512xa1df5c61[5] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f3512xa1df5c61[6] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f3512xa1df5c61[0] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f3512xa1df5c61[1] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class Builder extends AbstractC0268g implements ArtistSyncStateOrBuilder {
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
            ((ArtistSyncState) this.instance).clearInferredOffline();
            return this;
        }

        public Builder clearOffline() {
            copyOnWrite();
            ((ArtistSyncState) this.instance).clearOffline();
            return this;
        }

        public Builder clearSyncProgress() {
            copyOnWrite();
            ((ArtistSyncState) this.instance).clearSyncProgress();
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

        @Override // com.spotify.cosmos.util.proto.ArtistSyncStateOrBuilder
        public String getInferredOffline() {
            return ((ArtistSyncState) this.instance).getInferredOffline();
        }

        @Override // com.spotify.cosmos.util.proto.ArtistSyncStateOrBuilder
        public gva getInferredOfflineBytes() {
            return ((ArtistSyncState) this.instance).getInferredOfflineBytes();
        }

        @Override // com.spotify.cosmos.util.proto.ArtistSyncStateOrBuilder
        public String getOffline() {
            return ((ArtistSyncState) this.instance).getOffline();
        }

        @Override // com.spotify.cosmos.util.proto.ArtistSyncStateOrBuilder
        public gva getOfflineBytes() {
            return ((ArtistSyncState) this.instance).getOfflineBytes();
        }

        @Override // com.spotify.cosmos.util.proto.ArtistSyncStateOrBuilder
        public int getSyncProgress() {
            return ((ArtistSyncState) this.instance).getSyncProgress();
        }

        @Override // com.spotify.cosmos.util.proto.ArtistSyncStateOrBuilder
        public boolean hasInferredOffline() {
            return ((ArtistSyncState) this.instance).hasInferredOffline();
        }

        @Override // com.spotify.cosmos.util.proto.ArtistSyncStateOrBuilder
        public boolean hasOffline() {
            return ((ArtistSyncState) this.instance).hasOffline();
        }

        @Override // com.spotify.cosmos.util.proto.ArtistSyncStateOrBuilder
        public boolean hasSyncProgress() {
            return ((ArtistSyncState) this.instance).hasSyncProgress();
        }

        @Override // com.google.protobuf.AbstractC0268g, p204p.AbstractC2081l8
        public /* bridge */ /* synthetic */ AbstractC2081l8 internalMergeFrom(AbstractC2118m8 abstractC2118m8) {
            return super.internalMergeFrom((AbstractC0269h) abstractC2118m8);
        }

        @Override // com.google.protobuf.AbstractC0268g, p204p.AbstractC2081l8, p204p.ore0
        public /* bridge */ /* synthetic */ AbstractC2081l8 mergeFrom(owe oweVar, aux auxVar) {
            return super.mergeFrom(oweVar, auxVar);
        }

        public Builder setInferredOffline(String str) {
            copyOnWrite();
            ((ArtistSyncState) this.instance).setInferredOffline(str);
            return this;
        }

        public Builder setInferredOfflineBytes(gva gvaVar) {
            copyOnWrite();
            ((ArtistSyncState) this.instance).setInferredOfflineBytes(gvaVar);
            return this;
        }

        public Builder setOffline(String str) {
            copyOnWrite();
            ((ArtistSyncState) this.instance).setOffline(str);
            return this;
        }

        public Builder setOfflineBytes(gva gvaVar) {
            copyOnWrite();
            ((ArtistSyncState) this.instance).setOfflineBytes(gvaVar);
            return this;
        }

        public Builder setSyncProgress(int i) {
            copyOnWrite();
            ((ArtistSyncState) this.instance).setSyncProgress(i);
            return this;
        }

        private Builder() {
            super(ArtistSyncState.DEFAULT_INSTANCE);
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
        ArtistSyncState artistSyncState = new ArtistSyncState();
        DEFAULT_INSTANCE = artistSyncState;
        AbstractC0269h.registerDefaultInstance(ArtistSyncState.class, artistSyncState);
    }

    private ArtistSyncState() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearInferredOffline() {
        this.bitField0_ &= -3;
        this.inferredOffline_ = getDefaultInstance().getInferredOffline();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearOffline() {
        this.bitField0_ &= -2;
        this.offline_ = getDefaultInstance().getOffline();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSyncProgress() {
        this.bitField0_ &= -5;
        this.syncProgress_ = 0;
    }

    public static ArtistSyncState getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static ArtistSyncState parseDelimitedFrom(InputStream inputStream) {
        return (ArtistSyncState) AbstractC0269h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ArtistSyncState parseFrom(ByteBuffer byteBuffer) {
        return (ArtistSyncState) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setInferredOffline(String str) {
        str.getClass();
        this.bitField0_ |= 2;
        this.inferredOffline_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setInferredOfflineBytes(gva gvaVar) {
        this.inferredOffline_ = gvaVar.m45892u();
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOffline(String str) {
        str.getClass();
        this.bitField0_ |= 1;
        this.offline_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOfflineBytes(gva gvaVar) {
        this.offline_ = gvaVar.m45892u();
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSyncProgress(int i) {
        this.bitField0_ |= 4;
        this.syncProgress_ = i;
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဋ\u0002", new Object[]{"bitField0_", "offline_", "inferredOffline_", "syncProgress_"});
        }
        if (iOrdinal == 3) {
            return new ArtistSyncState();
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
        synchronized (ArtistSyncState.class) {
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

    @Override // com.spotify.cosmos.util.proto.ArtistSyncStateOrBuilder
    public String getInferredOffline() {
        return this.inferredOffline_;
    }

    @Override // com.spotify.cosmos.util.proto.ArtistSyncStateOrBuilder
    public gva getInferredOfflineBytes() {
        return gva.m45888f(this.inferredOffline_);
    }

    @Override // com.spotify.cosmos.util.proto.ArtistSyncStateOrBuilder
    public String getOffline() {
        return this.offline_;
    }

    @Override // com.spotify.cosmos.util.proto.ArtistSyncStateOrBuilder
    public gva getOfflineBytes() {
        return gva.m45888f(this.offline_);
    }

    @Override // com.spotify.cosmos.util.proto.ArtistSyncStateOrBuilder
    public int getSyncProgress() {
        return this.syncProgress_;
    }

    @Override // com.spotify.cosmos.util.proto.ArtistSyncStateOrBuilder
    public boolean hasInferredOffline() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override // com.spotify.cosmos.util.proto.ArtistSyncStateOrBuilder
    public boolean hasOffline() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // com.spotify.cosmos.util.proto.ArtistSyncStateOrBuilder
    public boolean hasSyncProgress() {
        return (this.bitField0_ & 4) != 0;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }

    public static Builder newBuilder(ArtistSyncState artistSyncState) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(artistSyncState);
    }

    public static ArtistSyncState parseDelimitedFrom(InputStream inputStream, aux auxVar) {
        return (ArtistSyncState) AbstractC0269h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, auxVar);
    }

    public static ArtistSyncState parseFrom(ByteBuffer byteBuffer, aux auxVar) {
        return (ArtistSyncState) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, byteBuffer, auxVar);
    }

    public static ArtistSyncState parseFrom(gva gvaVar) {
        return (ArtistSyncState) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, gvaVar);
    }

    public static ArtistSyncState parseFrom(gva gvaVar, aux auxVar) {
        return (ArtistSyncState) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, gvaVar, auxVar);
    }

    public static ArtistSyncState parseFrom(byte[] bArr) {
        return (ArtistSyncState) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ArtistSyncState parseFrom(byte[] bArr, aux auxVar) {
        return (ArtistSyncState) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr, auxVar);
    }

    public static ArtistSyncState parseFrom(InputStream inputStream) {
        return (ArtistSyncState) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ArtistSyncState parseFrom(InputStream inputStream, aux auxVar) {
        return (ArtistSyncState) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, inputStream, auxVar);
    }

    public static ArtistSyncState parseFrom(owe oweVar) {
        return (ArtistSyncState) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, oweVar);
    }

    public static ArtistSyncState parseFrom(owe oweVar, aux auxVar) {
        return (ArtistSyncState) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, oweVar, auxVar);
    }
}
