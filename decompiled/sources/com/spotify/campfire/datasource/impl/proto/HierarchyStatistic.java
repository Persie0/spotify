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
public final class HierarchyStatistic extends AbstractC0269h implements HierarchyStatisticOrBuilder {
    public static final int ALL_EVENTS_SEEN_FIELD_NUMBER = 2;
    private static final HierarchyStatistic DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER = null;
    public static final int REVISION_FIELD_NUMBER = 5;
    public static final int TOTAL_USER_UNSEEN_ACTIVITY_EVENTS_FIELD_NUMBER = 3;
    public static final int TOTAL_USER_UNSEEN_CONTRIBUTION_EVENTS_FIELD_NUMBER = 4;
    public static final int TOTAL_USER_UNSEEN_EVENTS_FIELD_NUMBER = 1;
    private boolean allEventsSeen_;
    private String revision_ = "";
    private int totalUserUnseenActivityEvents_;
    private int totalUserUnseenContributionEvents_;
    private int totalUserUnseenEvents_;

    /* JADX INFO: renamed from: com.spotify.campfire.datasource.impl.proto.HierarchyStatistic$1 */
    public static /* synthetic */ class C03901 {

        /* JADX INFO: renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f3211xa1df5c61;

        static {
            int[] iArr = new int[z110.values().length];
            f3211xa1df5c61 = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f3211xa1df5c61[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f3211xa1df5c61[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f3211xa1df5c61[5] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f3211xa1df5c61[6] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f3211xa1df5c61[0] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f3211xa1df5c61[1] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class Builder extends AbstractC0268g implements HierarchyStatisticOrBuilder {
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

        public Builder clearAllEventsSeen() {
            copyOnWrite();
            ((HierarchyStatistic) this.instance).clearAllEventsSeen();
            return this;
        }

        public Builder clearRevision() {
            copyOnWrite();
            ((HierarchyStatistic) this.instance).clearRevision();
            return this;
        }

        public Builder clearTotalUserUnseenActivityEvents() {
            copyOnWrite();
            ((HierarchyStatistic) this.instance).clearTotalUserUnseenActivityEvents();
            return this;
        }

        public Builder clearTotalUserUnseenContributionEvents() {
            copyOnWrite();
            ((HierarchyStatistic) this.instance).clearTotalUserUnseenContributionEvents();
            return this;
        }

        public Builder clearTotalUserUnseenEvents() {
            copyOnWrite();
            ((HierarchyStatistic) this.instance).clearTotalUserUnseenEvents();
            return this;
        }

        @Override // com.google.protobuf.AbstractC0268g
        /* JADX INFO: renamed from: clone */
        public /* bridge */ /* synthetic */ Object mo98328clone() {
            return super.mo98326clone();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.HierarchyStatisticOrBuilder
        public boolean getAllEventsSeen() {
            return ((HierarchyStatistic) this.instance).getAllEventsSeen();
        }

        @Override // com.google.protobuf.AbstractC0268g, p204p.sre0
        public /* bridge */ /* synthetic */ pre0 getDefaultInstanceForType() {
            return super.getDefaultInstanceForType();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.HierarchyStatisticOrBuilder
        public String getRevision() {
            return ((HierarchyStatistic) this.instance).getRevision();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.HierarchyStatisticOrBuilder
        public gva getRevisionBytes() {
            return ((HierarchyStatistic) this.instance).getRevisionBytes();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.HierarchyStatisticOrBuilder
        public int getTotalUserUnseenActivityEvents() {
            return ((HierarchyStatistic) this.instance).getTotalUserUnseenActivityEvents();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.HierarchyStatisticOrBuilder
        public int getTotalUserUnseenContributionEvents() {
            return ((HierarchyStatistic) this.instance).getTotalUserUnseenContributionEvents();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.HierarchyStatisticOrBuilder
        public int getTotalUserUnseenEvents() {
            return ((HierarchyStatistic) this.instance).getTotalUserUnseenEvents();
        }

        @Override // com.google.protobuf.AbstractC0268g, p204p.AbstractC2081l8
        public /* bridge */ /* synthetic */ AbstractC2081l8 internalMergeFrom(AbstractC2118m8 abstractC2118m8) {
            return super.internalMergeFrom((AbstractC0269h) abstractC2118m8);
        }

        @Override // com.google.protobuf.AbstractC0268g, p204p.AbstractC2081l8, p204p.ore0
        public /* bridge */ /* synthetic */ AbstractC2081l8 mergeFrom(owe oweVar, aux auxVar) {
            return super.mergeFrom(oweVar, auxVar);
        }

        public Builder setAllEventsSeen(boolean z) {
            copyOnWrite();
            ((HierarchyStatistic) this.instance).setAllEventsSeen(z);
            return this;
        }

        public Builder setRevision(String str) {
            copyOnWrite();
            ((HierarchyStatistic) this.instance).setRevision(str);
            return this;
        }

        public Builder setRevisionBytes(gva gvaVar) {
            copyOnWrite();
            ((HierarchyStatistic) this.instance).setRevisionBytes(gvaVar);
            return this;
        }

        public Builder setTotalUserUnseenActivityEvents(int i) {
            copyOnWrite();
            ((HierarchyStatistic) this.instance).setTotalUserUnseenActivityEvents(i);
            return this;
        }

        public Builder setTotalUserUnseenContributionEvents(int i) {
            copyOnWrite();
            ((HierarchyStatistic) this.instance).setTotalUserUnseenContributionEvents(i);
            return this;
        }

        public Builder setTotalUserUnseenEvents(int i) {
            copyOnWrite();
            ((HierarchyStatistic) this.instance).setTotalUserUnseenEvents(i);
            return this;
        }

        private Builder() {
            super(HierarchyStatistic.DEFAULT_INSTANCE);
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
        HierarchyStatistic hierarchyStatistic = new HierarchyStatistic();
        DEFAULT_INSTANCE = hierarchyStatistic;
        AbstractC0269h.registerDefaultInstance(HierarchyStatistic.class, hierarchyStatistic);
    }

    private HierarchyStatistic() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAllEventsSeen() {
        this.allEventsSeen_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRevision() {
        this.revision_ = getDefaultInstance().getRevision();
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
    public void clearTotalUserUnseenEvents() {
        this.totalUserUnseenEvents_ = 0;
    }

    public static HierarchyStatistic getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static HierarchyStatistic parseDelimitedFrom(InputStream inputStream) {
        return (HierarchyStatistic) AbstractC0269h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static HierarchyStatistic parseFrom(ByteBuffer byteBuffer) {
        return (HierarchyStatistic) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAllEventsSeen(boolean z) {
        this.allEventsSeen_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRevision(String str) {
        str.getClass();
        this.revision_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRevisionBytes(gva gvaVar) {
        AbstractC2118m8.checkByteStringIsUtf8(gvaVar);
        this.revision_ = gvaVar.m45892u();
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
    public void setTotalUserUnseenEvents(int i) {
        this.totalUserUnseenEvents_ = i;
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001\u0004\u0002\u0007\u0003\u0004\u0004\u0004\u0005Ȉ", new Object[]{"totalUserUnseenEvents_", "allEventsSeen_", "totalUserUnseenActivityEvents_", "totalUserUnseenContributionEvents_", "revision_"});
        }
        if (iOrdinal == 3) {
            return new HierarchyStatistic();
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
        synchronized (HierarchyStatistic.class) {
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

    @Override // com.spotify.campfire.datasource.impl.proto.HierarchyStatisticOrBuilder
    public boolean getAllEventsSeen() {
        return this.allEventsSeen_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.sre0
    public /* bridge */ /* synthetic */ pre0 getDefaultInstanceForType() {
        return getDefaultInstanceForType();
    }

    @Override // com.spotify.campfire.datasource.impl.proto.HierarchyStatisticOrBuilder
    public String getRevision() {
        return this.revision_;
    }

    @Override // com.spotify.campfire.datasource.impl.proto.HierarchyStatisticOrBuilder
    public gva getRevisionBytes() {
        return gva.m45888f(this.revision_);
    }

    @Override // com.spotify.campfire.datasource.impl.proto.HierarchyStatisticOrBuilder
    public int getTotalUserUnseenActivityEvents() {
        return this.totalUserUnseenActivityEvents_;
    }

    @Override // com.spotify.campfire.datasource.impl.proto.HierarchyStatisticOrBuilder
    public int getTotalUserUnseenContributionEvents() {
        return this.totalUserUnseenContributionEvents_;
    }

    @Override // com.spotify.campfire.datasource.impl.proto.HierarchyStatisticOrBuilder
    public int getTotalUserUnseenEvents() {
        return this.totalUserUnseenEvents_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }

    public static Builder newBuilder(HierarchyStatistic hierarchyStatistic) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(hierarchyStatistic);
    }

    public static HierarchyStatistic parseDelimitedFrom(InputStream inputStream, aux auxVar) {
        return (HierarchyStatistic) AbstractC0269h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, auxVar);
    }

    public static HierarchyStatistic parseFrom(ByteBuffer byteBuffer, aux auxVar) {
        return (HierarchyStatistic) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, byteBuffer, auxVar);
    }

    public static HierarchyStatistic parseFrom(gva gvaVar) {
        return (HierarchyStatistic) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, gvaVar);
    }

    public static HierarchyStatistic parseFrom(gva gvaVar, aux auxVar) {
        return (HierarchyStatistic) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, gvaVar, auxVar);
    }

    public static HierarchyStatistic parseFrom(byte[] bArr) {
        return (HierarchyStatistic) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static HierarchyStatistic parseFrom(byte[] bArr, aux auxVar) {
        return (HierarchyStatistic) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr, auxVar);
    }

    public static HierarchyStatistic parseFrom(InputStream inputStream) {
        return (HierarchyStatistic) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static HierarchyStatistic parseFrom(InputStream inputStream, aux auxVar) {
        return (HierarchyStatistic) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, inputStream, auxVar);
    }

    public static HierarchyStatistic parseFrom(owe oweVar) {
        return (HierarchyStatistic) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, oweVar);
    }

    public static HierarchyStatistic parseFrom(owe oweVar, aux auxVar) {
        return (HierarchyStatistic) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, oweVar, auxVar);
    }
}
