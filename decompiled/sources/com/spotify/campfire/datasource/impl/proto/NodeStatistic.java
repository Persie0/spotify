package com.spotify.campfire.datasource.impl.proto;

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

/* JADX INFO: loaded from: classes5.dex */
public final class NodeStatistic extends AbstractC0269h implements NodeStatisticOrBuilder {
    private static final NodeStatistic DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER = null;
    public static final int TOTAL_UNSEEN_EVENT_COUNT_FIELD_NUMBER = 2;
    public static final int TOTAL_USER_UNSEEN_ACTIVITY_EVENTS_FIELD_NUMBER = 3;
    public static final int TOTAL_USER_UNSEEN_CONTRIBUTION_EVENTS_FIELD_NUMBER = 4;
    public static final int USER_SEEN_FIELD_NUMBER = 1;
    private int totalUnseenEventCount_;
    private int totalUserUnseenActivityEvents_;
    private int totalUserUnseenContributionEvents_;
    private boolean userSeen_;

    /* JADX INFO: renamed from: com.spotify.campfire.datasource.impl.proto.NodeStatistic$1 */
    public static /* synthetic */ class C04181 {

        /* JADX INFO: renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f3234xa1df5c61;

        static {
            int[] iArr = new int[z110.values().length];
            f3234xa1df5c61 = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f3234xa1df5c61[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f3234xa1df5c61[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f3234xa1df5c61[5] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f3234xa1df5c61[6] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f3234xa1df5c61[0] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f3234xa1df5c61[1] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class Builder extends AbstractC0268g implements NodeStatisticOrBuilder {
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

        public Builder clearTotalUnseenEventCount() {
            copyOnWrite();
            ((NodeStatistic) this.instance).clearTotalUnseenEventCount();
            return this;
        }

        public Builder clearTotalUserUnseenActivityEvents() {
            copyOnWrite();
            ((NodeStatistic) this.instance).clearTotalUserUnseenActivityEvents();
            return this;
        }

        public Builder clearTotalUserUnseenContributionEvents() {
            copyOnWrite();
            ((NodeStatistic) this.instance).clearTotalUserUnseenContributionEvents();
            return this;
        }

        public Builder clearUserSeen() {
            copyOnWrite();
            ((NodeStatistic) this.instance).clearUserSeen();
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

        @Override // com.spotify.campfire.datasource.impl.proto.NodeStatisticOrBuilder
        public int getTotalUnseenEventCount() {
            return ((NodeStatistic) this.instance).getTotalUnseenEventCount();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.NodeStatisticOrBuilder
        public int getTotalUserUnseenActivityEvents() {
            return ((NodeStatistic) this.instance).getTotalUserUnseenActivityEvents();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.NodeStatisticOrBuilder
        public int getTotalUserUnseenContributionEvents() {
            return ((NodeStatistic) this.instance).getTotalUserUnseenContributionEvents();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.NodeStatisticOrBuilder
        public boolean getUserSeen() {
            return ((NodeStatistic) this.instance).getUserSeen();
        }

        @Override // com.google.protobuf.AbstractC0268g, p204p.AbstractC2081l8
        public /* bridge */ /* synthetic */ AbstractC2081l8 internalMergeFrom(AbstractC2118m8 abstractC2118m8) {
            return super.internalMergeFrom((AbstractC0269h) abstractC2118m8);
        }

        @Override // com.google.protobuf.AbstractC0268g, p204p.AbstractC2081l8, p204p.ore0
        public /* bridge */ /* synthetic */ AbstractC2081l8 mergeFrom(owe oweVar, aux auxVar) {
            return super.mergeFrom(oweVar, auxVar);
        }

        public Builder setTotalUnseenEventCount(int i) {
            copyOnWrite();
            ((NodeStatistic) this.instance).setTotalUnseenEventCount(i);
            return this;
        }

        public Builder setTotalUserUnseenActivityEvents(int i) {
            copyOnWrite();
            ((NodeStatistic) this.instance).setTotalUserUnseenActivityEvents(i);
            return this;
        }

        public Builder setTotalUserUnseenContributionEvents(int i) {
            copyOnWrite();
            ((NodeStatistic) this.instance).setTotalUserUnseenContributionEvents(i);
            return this;
        }

        public Builder setUserSeen(boolean z) {
            copyOnWrite();
            ((NodeStatistic) this.instance).setUserSeen(z);
            return this;
        }

        private Builder() {
            super(NodeStatistic.DEFAULT_INSTANCE);
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
        NodeStatistic nodeStatistic = new NodeStatistic();
        DEFAULT_INSTANCE = nodeStatistic;
        AbstractC0269h.registerDefaultInstance(NodeStatistic.class, nodeStatistic);
    }

    private NodeStatistic() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTotalUnseenEventCount() {
        this.totalUnseenEventCount_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTotalUserUnseenActivityEvents() {
        this.totalUserUnseenActivityEvents_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTotalUserUnseenContributionEvents() {
        this.totalUserUnseenContributionEvents_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUserSeen() {
        this.userSeen_ = false;
    }

    public static NodeStatistic getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static NodeStatistic parseDelimitedFrom(InputStream inputStream) {
        return (NodeStatistic) AbstractC0269h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static NodeStatistic parseFrom(ByteBuffer byteBuffer) {
        return (NodeStatistic) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTotalUnseenEventCount(int i) {
        this.totalUnseenEventCount_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTotalUserUnseenActivityEvents(int i) {
        this.totalUserUnseenActivityEvents_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTotalUserUnseenContributionEvents(int i) {
        this.totalUserUnseenContributionEvents_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUserSeen(boolean z) {
        this.userSeen_ = z;
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u0007\u0002\u0004\u0003\u0004\u0004\u0004", new Object[]{"userSeen_", "totalUnseenEventCount_", "totalUserUnseenActivityEvents_", "totalUserUnseenContributionEvents_"});
        }
        if (iOrdinal == 3) {
            return new NodeStatistic();
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
        synchronized (NodeStatistic.class) {
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

    @Override // com.spotify.campfire.datasource.impl.proto.NodeStatisticOrBuilder
    public int getTotalUnseenEventCount() {
        return this.totalUnseenEventCount_;
    }

    @Override // com.spotify.campfire.datasource.impl.proto.NodeStatisticOrBuilder
    public int getTotalUserUnseenActivityEvents() {
        return this.totalUserUnseenActivityEvents_;
    }

    @Override // com.spotify.campfire.datasource.impl.proto.NodeStatisticOrBuilder
    public int getTotalUserUnseenContributionEvents() {
        return this.totalUserUnseenContributionEvents_;
    }

    @Override // com.spotify.campfire.datasource.impl.proto.NodeStatisticOrBuilder
    public boolean getUserSeen() {
        return this.userSeen_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }

    public static Builder newBuilder(NodeStatistic nodeStatistic) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(nodeStatistic);
    }

    public static NodeStatistic parseDelimitedFrom(InputStream inputStream, aux auxVar) {
        return (NodeStatistic) AbstractC0269h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, auxVar);
    }

    public static NodeStatistic parseFrom(ByteBuffer byteBuffer, aux auxVar) {
        return (NodeStatistic) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, byteBuffer, auxVar);
    }

    public static NodeStatistic parseFrom(gva gvaVar) {
        return (NodeStatistic) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, gvaVar);
    }

    public static NodeStatistic parseFrom(gva gvaVar, aux auxVar) {
        return (NodeStatistic) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, gvaVar, auxVar);
    }

    public static NodeStatistic parseFrom(byte[] bArr) {
        return (NodeStatistic) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static NodeStatistic parseFrom(byte[] bArr, aux auxVar) {
        return (NodeStatistic) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr, auxVar);
    }

    public static NodeStatistic parseFrom(InputStream inputStream) {
        return (NodeStatistic) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static NodeStatistic parseFrom(InputStream inputStream, aux auxVar) {
        return (NodeStatistic) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, inputStream, auxVar);
    }

    public static NodeStatistic parseFrom(owe oweVar) {
        return (NodeStatistic) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, oweVar);
    }

    public static NodeStatistic parseFrom(owe oweVar, aux auxVar) {
        return (NodeStatistic) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, oweVar, auxVar);
    }
}
