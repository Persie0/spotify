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
public final class TrackCollectionState extends AbstractC0269h implements TrackCollectionStateOrBuilder {
    public static final int CAN_ADD_TO_COLLECTION_FIELD_NUMBER = 2;
    public static final int CAN_BAN_FIELD_NUMBER = 4;
    private static final TrackCollectionState DEFAULT_INSTANCE;
    public static final int IS_BANNED_FIELD_NUMBER = 3;
    public static final int IS_IN_COLLECTION_FIELD_NUMBER = 1;
    private static volatile r2n0 PARSER;
    private int bitField0_;
    private boolean canAddToCollection_;
    private boolean canBan_;
    private boolean isBanned_;
    private boolean isInCollection_;

    /* JADX INFO: renamed from: com.spotify.cosmos.util.proto.TrackCollectionState$1 */
    /* JADX INFO: loaded from: classes6.dex */
    public static /* synthetic */ class C06821 {

        /* JADX INFO: renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f3528xa1df5c61;

        static {
            int[] iArr = new int[z110.values().length];
            f3528xa1df5c61 = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f3528xa1df5c61[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f3528xa1df5c61[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f3528xa1df5c61[5] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f3528xa1df5c61[6] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f3528xa1df5c61[0] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f3528xa1df5c61[1] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* JADX INFO: loaded from: classes6.dex */
    public static final class Builder extends AbstractC0268g implements TrackCollectionStateOrBuilder {
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

        public Builder clearCanAddToCollection() {
            copyOnWrite();
            ((TrackCollectionState) this.instance).clearCanAddToCollection();
            return this;
        }

        public Builder clearCanBan() {
            copyOnWrite();
            ((TrackCollectionState) this.instance).clearCanBan();
            return this;
        }

        public Builder clearIsBanned() {
            copyOnWrite();
            ((TrackCollectionState) this.instance).clearIsBanned();
            return this;
        }

        public Builder clearIsInCollection() {
            copyOnWrite();
            ((TrackCollectionState) this.instance).clearIsInCollection();
            return this;
        }

        @Override // com.google.protobuf.AbstractC0268g
        /* JADX INFO: renamed from: clone */
        public /* bridge */ /* synthetic */ Object mo98328clone() {
            return super.mo98326clone();
        }

        @Override // com.spotify.cosmos.util.proto.TrackCollectionStateOrBuilder
        public boolean getCanAddToCollection() {
            return ((TrackCollectionState) this.instance).getCanAddToCollection();
        }

        @Override // com.spotify.cosmos.util.proto.TrackCollectionStateOrBuilder
        public boolean getCanBan() {
            return ((TrackCollectionState) this.instance).getCanBan();
        }

        @Override // com.google.protobuf.AbstractC0268g, p204p.sre0
        public /* bridge */ /* synthetic */ pre0 getDefaultInstanceForType() {
            return super.getDefaultInstanceForType();
        }

        @Override // com.spotify.cosmos.util.proto.TrackCollectionStateOrBuilder
        public boolean getIsBanned() {
            return ((TrackCollectionState) this.instance).getIsBanned();
        }

        @Override // com.spotify.cosmos.util.proto.TrackCollectionStateOrBuilder
        public boolean getIsInCollection() {
            return ((TrackCollectionState) this.instance).getIsInCollection();
        }

        @Override // com.spotify.cosmos.util.proto.TrackCollectionStateOrBuilder
        public boolean hasCanAddToCollection() {
            return ((TrackCollectionState) this.instance).hasCanAddToCollection();
        }

        @Override // com.spotify.cosmos.util.proto.TrackCollectionStateOrBuilder
        public boolean hasCanBan() {
            return ((TrackCollectionState) this.instance).hasCanBan();
        }

        @Override // com.spotify.cosmos.util.proto.TrackCollectionStateOrBuilder
        public boolean hasIsBanned() {
            return ((TrackCollectionState) this.instance).hasIsBanned();
        }

        @Override // com.spotify.cosmos.util.proto.TrackCollectionStateOrBuilder
        public boolean hasIsInCollection() {
            return ((TrackCollectionState) this.instance).hasIsInCollection();
        }

        @Override // com.google.protobuf.AbstractC0268g, p204p.AbstractC2081l8
        public /* bridge */ /* synthetic */ AbstractC2081l8 internalMergeFrom(AbstractC2118m8 abstractC2118m8) {
            return super.internalMergeFrom((AbstractC0269h) abstractC2118m8);
        }

        @Override // com.google.protobuf.AbstractC0268g, p204p.AbstractC2081l8, p204p.ore0
        public /* bridge */ /* synthetic */ AbstractC2081l8 mergeFrom(owe oweVar, aux auxVar) {
            return super.mergeFrom(oweVar, auxVar);
        }

        public Builder setCanAddToCollection(boolean z) {
            copyOnWrite();
            ((TrackCollectionState) this.instance).setCanAddToCollection(z);
            return this;
        }

        public Builder setCanBan(boolean z) {
            copyOnWrite();
            ((TrackCollectionState) this.instance).setCanBan(z);
            return this;
        }

        public Builder setIsBanned(boolean z) {
            copyOnWrite();
            ((TrackCollectionState) this.instance).setIsBanned(z);
            return this;
        }

        public Builder setIsInCollection(boolean z) {
            copyOnWrite();
            ((TrackCollectionState) this.instance).setIsInCollection(z);
            return this;
        }

        private Builder() {
            super(TrackCollectionState.DEFAULT_INSTANCE);
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
        TrackCollectionState trackCollectionState = new TrackCollectionState();
        DEFAULT_INSTANCE = trackCollectionState;
        AbstractC0269h.registerDefaultInstance(TrackCollectionState.class, trackCollectionState);
    }

    private TrackCollectionState() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCanAddToCollection() {
        this.bitField0_ &= -3;
        this.canAddToCollection_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCanBan() {
        this.bitField0_ &= -9;
        this.canBan_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIsBanned() {
        this.bitField0_ &= -5;
        this.isBanned_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIsInCollection() {
        this.bitField0_ &= -2;
        this.isInCollection_ = false;
    }

    public static TrackCollectionState getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static TrackCollectionState parseDelimitedFrom(InputStream inputStream) {
        return (TrackCollectionState) AbstractC0269h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static TrackCollectionState parseFrom(ByteBuffer byteBuffer) {
        return (TrackCollectionState) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCanAddToCollection(boolean z) {
        this.bitField0_ |= 2;
        this.canAddToCollection_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCanBan(boolean z) {
        this.bitField0_ |= 8;
        this.canBan_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIsBanned(boolean z) {
        this.bitField0_ |= 4;
        this.isBanned_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIsInCollection(boolean z) {
        this.bitField0_ |= 1;
        this.isInCollection_ = z;
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004ဇ\u0003", new Object[]{"bitField0_", "isInCollection_", "canAddToCollection_", "isBanned_", "canBan_"});
        }
        if (iOrdinal == 3) {
            return new TrackCollectionState();
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
        synchronized (TrackCollectionState.class) {
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

    @Override // com.spotify.cosmos.util.proto.TrackCollectionStateOrBuilder
    public boolean getCanAddToCollection() {
        return this.canAddToCollection_;
    }

    @Override // com.spotify.cosmos.util.proto.TrackCollectionStateOrBuilder
    public boolean getCanBan() {
        return this.canBan_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.sre0
    public /* bridge */ /* synthetic */ pre0 getDefaultInstanceForType() {
        return getDefaultInstanceForType();
    }

    @Override // com.spotify.cosmos.util.proto.TrackCollectionStateOrBuilder
    public boolean getIsBanned() {
        return this.isBanned_;
    }

    @Override // com.spotify.cosmos.util.proto.TrackCollectionStateOrBuilder
    public boolean getIsInCollection() {
        return this.isInCollection_;
    }

    @Override // com.spotify.cosmos.util.proto.TrackCollectionStateOrBuilder
    public boolean hasCanAddToCollection() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override // com.spotify.cosmos.util.proto.TrackCollectionStateOrBuilder
    public boolean hasCanBan() {
        return (this.bitField0_ & 8) != 0;
    }

    @Override // com.spotify.cosmos.util.proto.TrackCollectionStateOrBuilder
    public boolean hasIsBanned() {
        return (this.bitField0_ & 4) != 0;
    }

    @Override // com.spotify.cosmos.util.proto.TrackCollectionStateOrBuilder
    public boolean hasIsInCollection() {
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

    public static Builder newBuilder(TrackCollectionState trackCollectionState) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(trackCollectionState);
    }

    public static TrackCollectionState parseDelimitedFrom(InputStream inputStream, aux auxVar) {
        return (TrackCollectionState) AbstractC0269h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, auxVar);
    }

    public static TrackCollectionState parseFrom(ByteBuffer byteBuffer, aux auxVar) {
        return (TrackCollectionState) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, byteBuffer, auxVar);
    }

    public static TrackCollectionState parseFrom(gva gvaVar) {
        return (TrackCollectionState) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, gvaVar);
    }

    public static TrackCollectionState parseFrom(gva gvaVar, aux auxVar) {
        return (TrackCollectionState) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, gvaVar, auxVar);
    }

    public static TrackCollectionState parseFrom(byte[] bArr) {
        return (TrackCollectionState) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static TrackCollectionState parseFrom(byte[] bArr, aux auxVar) {
        return (TrackCollectionState) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr, auxVar);
    }

    public static TrackCollectionState parseFrom(InputStream inputStream) {
        return (TrackCollectionState) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static TrackCollectionState parseFrom(InputStream inputStream, aux auxVar) {
        return (TrackCollectionState) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, inputStream, auxVar);
    }

    public static TrackCollectionState parseFrom(owe oweVar) {
        return (TrackCollectionState) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, oweVar);
    }

    public static TrackCollectionState parseFrom(owe oweVar, aux auxVar) {
        return (TrackCollectionState) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, oweVar, auxVar);
    }
}
