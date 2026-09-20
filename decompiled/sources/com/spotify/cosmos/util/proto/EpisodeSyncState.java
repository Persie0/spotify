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

/* JADX INFO: loaded from: classes.dex */
public final class EpisodeSyncState extends AbstractC0269h implements EpisodeSyncStateOrBuilder {
    private static final EpisodeSyncState DEFAULT_INSTANCE;
    public static final int OFFLINE_STATE_FIELD_NUMBER = 1;
    private static volatile r2n0 PARSER = null;
    public static final int SYNC_PROGRESS_FIELD_NUMBER = 2;
    private int bitField0_;
    private String offlineState_ = "";
    private int syncProgress_;

    /* JADX INFO: renamed from: com.spotify.cosmos.util.proto.EpisodeSyncState$1 */
    /* JADX INFO: loaded from: classes6.dex */
    public static /* synthetic */ class C06701 {

        /* JADX INFO: renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f3518xa1df5c61;

        static {
            int[] iArr = new int[z110.values().length];
            f3518xa1df5c61 = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f3518xa1df5c61[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f3518xa1df5c61[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f3518xa1df5c61[5] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f3518xa1df5c61[6] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f3518xa1df5c61[0] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f3518xa1df5c61[1] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* JADX INFO: loaded from: classes6.dex */
    public static final class Builder extends AbstractC0268g implements EpisodeSyncStateOrBuilder {
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

        public Builder clearOfflineState() {
            copyOnWrite();
            ((EpisodeSyncState) this.instance).clearOfflineState();
            return this;
        }

        public Builder clearSyncProgress() {
            copyOnWrite();
            ((EpisodeSyncState) this.instance).clearSyncProgress();
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

        @Override // com.spotify.cosmos.util.proto.EpisodeSyncStateOrBuilder
        public String getOfflineState() {
            return ((EpisodeSyncState) this.instance).getOfflineState();
        }

        @Override // com.spotify.cosmos.util.proto.EpisodeSyncStateOrBuilder
        public gva getOfflineStateBytes() {
            return ((EpisodeSyncState) this.instance).getOfflineStateBytes();
        }

        @Override // com.spotify.cosmos.util.proto.EpisodeSyncStateOrBuilder
        public int getSyncProgress() {
            return ((EpisodeSyncState) this.instance).getSyncProgress();
        }

        @Override // com.spotify.cosmos.util.proto.EpisodeSyncStateOrBuilder
        public boolean hasOfflineState() {
            return ((EpisodeSyncState) this.instance).hasOfflineState();
        }

        @Override // com.spotify.cosmos.util.proto.EpisodeSyncStateOrBuilder
        public boolean hasSyncProgress() {
            return ((EpisodeSyncState) this.instance).hasSyncProgress();
        }

        @Override // com.google.protobuf.AbstractC0268g, p204p.AbstractC2081l8
        public /* bridge */ /* synthetic */ AbstractC2081l8 internalMergeFrom(AbstractC2118m8 abstractC2118m8) {
            return super.internalMergeFrom((AbstractC0269h) abstractC2118m8);
        }

        @Override // com.google.protobuf.AbstractC0268g, p204p.AbstractC2081l8, p204p.ore0
        public /* bridge */ /* synthetic */ AbstractC2081l8 mergeFrom(owe oweVar, aux auxVar) {
            return super.mergeFrom(oweVar, auxVar);
        }

        public Builder setOfflineState(String str) {
            copyOnWrite();
            ((EpisodeSyncState) this.instance).setOfflineState(str);
            return this;
        }

        public Builder setOfflineStateBytes(gva gvaVar) {
            copyOnWrite();
            ((EpisodeSyncState) this.instance).setOfflineStateBytes(gvaVar);
            return this;
        }

        public Builder setSyncProgress(int i) {
            copyOnWrite();
            ((EpisodeSyncState) this.instance).setSyncProgress(i);
            return this;
        }

        private Builder() {
            super(EpisodeSyncState.DEFAULT_INSTANCE);
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
        EpisodeSyncState episodeSyncState = new EpisodeSyncState();
        DEFAULT_INSTANCE = episodeSyncState;
        AbstractC0269h.registerDefaultInstance(EpisodeSyncState.class, episodeSyncState);
    }

    private EpisodeSyncState() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearOfflineState() {
        this.bitField0_ &= -2;
        this.offlineState_ = getDefaultInstance().getOfflineState();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSyncProgress() {
        this.bitField0_ &= -3;
        this.syncProgress_ = 0;
    }

    public static EpisodeSyncState getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static EpisodeSyncState parseDelimitedFrom(InputStream inputStream) {
        return (EpisodeSyncState) AbstractC0269h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static EpisodeSyncState parseFrom(ByteBuffer byteBuffer) {
        return (EpisodeSyncState) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOfflineState(String str) {
        str.getClass();
        this.bitField0_ |= 1;
        this.offlineState_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOfflineStateBytes(gva gvaVar) {
        this.offlineState_ = gvaVar.m45892u();
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSyncProgress(int i) {
        this.bitField0_ |= 2;
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဋ\u0001", new Object[]{"bitField0_", "offlineState_", "syncProgress_"});
        }
        if (iOrdinal == 3) {
            return new EpisodeSyncState();
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
        synchronized (EpisodeSyncState.class) {
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

    @Override // com.spotify.cosmos.util.proto.EpisodeSyncStateOrBuilder
    public String getOfflineState() {
        return this.offlineState_;
    }

    @Override // com.spotify.cosmos.util.proto.EpisodeSyncStateOrBuilder
    public gva getOfflineStateBytes() {
        return gva.m45888f(this.offlineState_);
    }

    @Override // com.spotify.cosmos.util.proto.EpisodeSyncStateOrBuilder
    public int getSyncProgress() {
        return this.syncProgress_;
    }

    @Override // com.spotify.cosmos.util.proto.EpisodeSyncStateOrBuilder
    public boolean hasOfflineState() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // com.spotify.cosmos.util.proto.EpisodeSyncStateOrBuilder
    public boolean hasSyncProgress() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }

    public static Builder newBuilder(EpisodeSyncState episodeSyncState) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(episodeSyncState);
    }

    public static EpisodeSyncState parseDelimitedFrom(InputStream inputStream, aux auxVar) {
        return (EpisodeSyncState) AbstractC0269h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, auxVar);
    }

    public static EpisodeSyncState parseFrom(ByteBuffer byteBuffer, aux auxVar) {
        return (EpisodeSyncState) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, byteBuffer, auxVar);
    }

    public static EpisodeSyncState parseFrom(gva gvaVar) {
        return (EpisodeSyncState) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, gvaVar);
    }

    public static EpisodeSyncState parseFrom(gva gvaVar, aux auxVar) {
        return (EpisodeSyncState) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, gvaVar, auxVar);
    }

    public static EpisodeSyncState parseFrom(byte[] bArr) {
        return (EpisodeSyncState) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static EpisodeSyncState parseFrom(byte[] bArr, aux auxVar) {
        return (EpisodeSyncState) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr, auxVar);
    }

    public static EpisodeSyncState parseFrom(InputStream inputStream) {
        return (EpisodeSyncState) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static EpisodeSyncState parseFrom(InputStream inputStream, aux auxVar) {
        return (EpisodeSyncState) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, inputStream, auxVar);
    }

    public static EpisodeSyncState parseFrom(owe oweVar) {
        return (EpisodeSyncState) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, oweVar);
    }

    public static EpisodeSyncState parseFrom(owe oweVar, aux auxVar) {
        return (EpisodeSyncState) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, oweVar, auxVar);
    }
}
