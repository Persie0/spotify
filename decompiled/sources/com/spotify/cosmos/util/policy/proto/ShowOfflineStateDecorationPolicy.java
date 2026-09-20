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
public final class ShowOfflineStateDecorationPolicy extends AbstractC0269h implements ShowOfflineStateDecorationPolicyOrBuilder {
    private static final ShowOfflineStateDecorationPolicy DEFAULT_INSTANCE;
    public static final int OFFLINE_FIELD_NUMBER = 1;
    private static volatile r2n0 PARSER = null;
    public static final int SYNC_PROGRESS_FIELD_NUMBER = 2;
    private boolean offline_;
    private boolean syncProgress_;

    /* JADX INFO: renamed from: com.spotify.cosmos.util.policy.proto.ShowOfflineStateDecorationPolicy$1 */
    public static /* synthetic */ class C06481 {

        /* JADX INFO: renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f3500xa1df5c61;

        static {
            int[] iArr = new int[z110.values().length];
            f3500xa1df5c61 = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f3500xa1df5c61[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f3500xa1df5c61[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f3500xa1df5c61[5] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f3500xa1df5c61[6] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f3500xa1df5c61[0] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f3500xa1df5c61[1] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class Builder extends AbstractC0268g implements ShowOfflineStateDecorationPolicyOrBuilder {
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

        public Builder clearOffline() {
            copyOnWrite();
            ((ShowOfflineStateDecorationPolicy) this.instance).clearOffline();
            return this;
        }

        public Builder clearSyncProgress() {
            copyOnWrite();
            ((ShowOfflineStateDecorationPolicy) this.instance).clearSyncProgress();
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

        @Override // com.spotify.cosmos.util.policy.proto.ShowOfflineStateDecorationPolicyOrBuilder
        public boolean getOffline() {
            return ((ShowOfflineStateDecorationPolicy) this.instance).getOffline();
        }

        @Override // com.spotify.cosmos.util.policy.proto.ShowOfflineStateDecorationPolicyOrBuilder
        public boolean getSyncProgress() {
            return ((ShowOfflineStateDecorationPolicy) this.instance).getSyncProgress();
        }

        @Override // com.google.protobuf.AbstractC0268g, p204p.AbstractC2081l8
        public /* bridge */ /* synthetic */ AbstractC2081l8 internalMergeFrom(AbstractC2118m8 abstractC2118m8) {
            return super.internalMergeFrom((AbstractC0269h) abstractC2118m8);
        }

        @Override // com.google.protobuf.AbstractC0268g, p204p.AbstractC2081l8, p204p.ore0
        public /* bridge */ /* synthetic */ AbstractC2081l8 mergeFrom(owe oweVar, aux auxVar) {
            return super.mergeFrom(oweVar, auxVar);
        }

        public Builder setOffline(boolean z) {
            copyOnWrite();
            ((ShowOfflineStateDecorationPolicy) this.instance).setOffline(z);
            return this;
        }

        public Builder setSyncProgress(boolean z) {
            copyOnWrite();
            ((ShowOfflineStateDecorationPolicy) this.instance).setSyncProgress(z);
            return this;
        }

        private Builder() {
            super(ShowOfflineStateDecorationPolicy.DEFAULT_INSTANCE);
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
        ShowOfflineStateDecorationPolicy showOfflineStateDecorationPolicy = new ShowOfflineStateDecorationPolicy();
        DEFAULT_INSTANCE = showOfflineStateDecorationPolicy;
        AbstractC0269h.registerDefaultInstance(ShowOfflineStateDecorationPolicy.class, showOfflineStateDecorationPolicy);
    }

    private ShowOfflineStateDecorationPolicy() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearOffline() {
        this.offline_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSyncProgress() {
        this.syncProgress_ = false;
    }

    public static ShowOfflineStateDecorationPolicy getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static ShowOfflineStateDecorationPolicy parseDelimitedFrom(InputStream inputStream) {
        return (ShowOfflineStateDecorationPolicy) AbstractC0269h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ShowOfflineStateDecorationPolicy parseFrom(ByteBuffer byteBuffer) {
        return (ShowOfflineStateDecorationPolicy) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOffline(boolean z) {
        this.offline_ = z;
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0007\u0002\u0007", new Object[]{"offline_", "syncProgress_"});
        }
        if (iOrdinal == 3) {
            return new ShowOfflineStateDecorationPolicy();
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
        synchronized (ShowOfflineStateDecorationPolicy.class) {
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

    @Override // com.spotify.cosmos.util.policy.proto.ShowOfflineStateDecorationPolicyOrBuilder
    public boolean getOffline() {
        return this.offline_;
    }

    @Override // com.spotify.cosmos.util.policy.proto.ShowOfflineStateDecorationPolicyOrBuilder
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

    public static Builder newBuilder(ShowOfflineStateDecorationPolicy showOfflineStateDecorationPolicy) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(showOfflineStateDecorationPolicy);
    }

    public static ShowOfflineStateDecorationPolicy parseDelimitedFrom(InputStream inputStream, aux auxVar) {
        return (ShowOfflineStateDecorationPolicy) AbstractC0269h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, auxVar);
    }

    public static ShowOfflineStateDecorationPolicy parseFrom(ByteBuffer byteBuffer, aux auxVar) {
        return (ShowOfflineStateDecorationPolicy) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, byteBuffer, auxVar);
    }

    public static ShowOfflineStateDecorationPolicy parseFrom(gva gvaVar) {
        return (ShowOfflineStateDecorationPolicy) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, gvaVar);
    }

    public static ShowOfflineStateDecorationPolicy parseFrom(gva gvaVar, aux auxVar) {
        return (ShowOfflineStateDecorationPolicy) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, gvaVar, auxVar);
    }

    public static ShowOfflineStateDecorationPolicy parseFrom(byte[] bArr) {
        return (ShowOfflineStateDecorationPolicy) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ShowOfflineStateDecorationPolicy parseFrom(byte[] bArr, aux auxVar) {
        return (ShowOfflineStateDecorationPolicy) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr, auxVar);
    }

    public static ShowOfflineStateDecorationPolicy parseFrom(InputStream inputStream) {
        return (ShowOfflineStateDecorationPolicy) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ShowOfflineStateDecorationPolicy parseFrom(InputStream inputStream, aux auxVar) {
        return (ShowOfflineStateDecorationPolicy) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, inputStream, auxVar);
    }

    public static ShowOfflineStateDecorationPolicy parseFrom(owe oweVar) {
        return (ShowOfflineStateDecorationPolicy) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, oweVar);
    }

    public static ShowOfflineStateDecorationPolicy parseFrom(owe oweVar, aux auxVar) {
        return (ShowOfflineStateDecorationPolicy) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, oweVar, auxVar);
    }
}
