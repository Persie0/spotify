package com.spotify.campfire.datasource.impl.proto;

import com.google.protobuf.AbstractC0268g;
import com.google.protobuf.AbstractC0269h;
import com.google.protobuf.Timestamp;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;
import p204p.AbstractC1733c9;
import p204p.AbstractC2081l8;
import p204p.AbstractC2118m8;
import p204p.ae50;
import p204p.aux;
import p204p.gva;
import p204p.lu71;
import p204p.ore0;
import p204p.owe;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.z110;

/* JADX INFO: loaded from: classes5.dex */
public final class HierarchyMetadata extends AbstractC0269h implements HierarchyMetadataOrBuilder {
    public static final int AGENTS_FIELD_NUMBER = 8;
    public static final int CREATED_AT_FIELD_NUMBER = 6;
    public static final int CURRENT_USER_CHANNEL_MUTED_FIELD_NUMBER = 7;
    public static final int CURRENT_USER_PARTICIPATION_STATUS_FIELD_NUMBER = 3;
    private static final HierarchyMetadata DEFAULT_INSTANCE;
    public static final int HIERARCHY_STATUS_FIELD_NUMBER = 2;
    public static final int HIERARCHY_TYPE_FIELD_NUMBER = 5;
    public static final int INITIATOR_USERNAME_FIELD_NUMBER = 1;
    private static volatile r2n0 PARSER = null;
    public static final int SOURCE_FIELD_NUMBER = 4;
    private int bitField0_;
    private Timestamp createdAt_;
    private boolean currentUserChannelMuted_;
    private int currentUserParticipationStatus_;
    private int hierarchyStatus_;
    private int hierarchyType_;
    private int source_;
    private String initiatorUsername_ = "";
    private ae50 agents_ = AbstractC0269h.emptyProtobufList();

    /* JADX INFO: renamed from: com.spotify.campfire.datasource.impl.proto.HierarchyMetadata$1 */
    public static /* synthetic */ class C03871 {

        /* JADX INFO: renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f3209xa1df5c61;

        static {
            int[] iArr = new int[z110.values().length];
            f3209xa1df5c61 = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f3209xa1df5c61[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f3209xa1df5c61[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f3209xa1df5c61[5] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f3209xa1df5c61[6] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f3209xa1df5c61[0] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f3209xa1df5c61[1] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class Builder extends AbstractC0268g implements HierarchyMetadataOrBuilder {
        public /* synthetic */ Builder(int i) {
            this();
        }

        public Builder addAgents(HierarchyAgent hierarchyAgent) {
            copyOnWrite();
            ((HierarchyMetadata) this.instance).addAgents(hierarchyAgent);
            return this;
        }

        public Builder addAllAgents(Iterable<? extends HierarchyAgent> iterable) {
            copyOnWrite();
            ((HierarchyMetadata) this.instance).addAllAgents(iterable);
            return this;
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

        public Builder clearAgents() {
            copyOnWrite();
            ((HierarchyMetadata) this.instance).clearAgents();
            return this;
        }

        public Builder clearCreatedAt() {
            copyOnWrite();
            ((HierarchyMetadata) this.instance).clearCreatedAt();
            return this;
        }

        public Builder clearCurrentUserChannelMuted() {
            copyOnWrite();
            ((HierarchyMetadata) this.instance).clearCurrentUserChannelMuted();
            return this;
        }

        public Builder clearCurrentUserParticipationStatus() {
            copyOnWrite();
            ((HierarchyMetadata) this.instance).clearCurrentUserParticipationStatus();
            return this;
        }

        public Builder clearHierarchyStatus() {
            copyOnWrite();
            ((HierarchyMetadata) this.instance).clearHierarchyStatus();
            return this;
        }

        public Builder clearHierarchyType() {
            copyOnWrite();
            ((HierarchyMetadata) this.instance).clearHierarchyType();
            return this;
        }

        public Builder clearInitiatorUsername() {
            copyOnWrite();
            ((HierarchyMetadata) this.instance).clearInitiatorUsername();
            return this;
        }

        public Builder clearSource() {
            copyOnWrite();
            ((HierarchyMetadata) this.instance).clearSource();
            return this;
        }

        @Override // com.google.protobuf.AbstractC0268g
        /* JADX INFO: renamed from: clone */
        public /* bridge */ /* synthetic */ Object mo98328clone() {
            return super.mo98326clone();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.HierarchyMetadataOrBuilder
        public HierarchyAgent getAgents(int i) {
            return ((HierarchyMetadata) this.instance).getAgents(i);
        }

        @Override // com.spotify.campfire.datasource.impl.proto.HierarchyMetadataOrBuilder
        public int getAgentsCount() {
            return ((HierarchyMetadata) this.instance).getAgentsCount();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.HierarchyMetadataOrBuilder
        public List<HierarchyAgent> getAgentsList() {
            return Collections.unmodifiableList(((HierarchyMetadata) this.instance).getAgentsList());
        }

        @Override // com.spotify.campfire.datasource.impl.proto.HierarchyMetadataOrBuilder
        public Timestamp getCreatedAt() {
            return ((HierarchyMetadata) this.instance).getCreatedAt();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.HierarchyMetadataOrBuilder
        public boolean getCurrentUserChannelMuted() {
            return ((HierarchyMetadata) this.instance).getCurrentUserChannelMuted();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.HierarchyMetadataOrBuilder
        public HierarchyUserParticipationStatus getCurrentUserParticipationStatus() {
            return ((HierarchyMetadata) this.instance).getCurrentUserParticipationStatus();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.HierarchyMetadataOrBuilder
        public int getCurrentUserParticipationStatusValue() {
            return ((HierarchyMetadata) this.instance).getCurrentUserParticipationStatusValue();
        }

        @Override // com.google.protobuf.AbstractC0268g, p204p.sre0
        public /* bridge */ /* synthetic */ pre0 getDefaultInstanceForType() {
            return super.getDefaultInstanceForType();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.HierarchyMetadataOrBuilder
        public HierarchyStatus getHierarchyStatus() {
            return ((HierarchyMetadata) this.instance).getHierarchyStatus();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.HierarchyMetadataOrBuilder
        public int getHierarchyStatusValue() {
            return ((HierarchyMetadata) this.instance).getHierarchyStatusValue();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.HierarchyMetadataOrBuilder
        public HierarchyType getHierarchyType() {
            return ((HierarchyMetadata) this.instance).getHierarchyType();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.HierarchyMetadataOrBuilder
        public int getHierarchyTypeValue() {
            return ((HierarchyMetadata) this.instance).getHierarchyTypeValue();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.HierarchyMetadataOrBuilder
        public String getInitiatorUsername() {
            return ((HierarchyMetadata) this.instance).getInitiatorUsername();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.HierarchyMetadataOrBuilder
        public gva getInitiatorUsernameBytes() {
            return ((HierarchyMetadata) this.instance).getInitiatorUsernameBytes();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.HierarchyMetadataOrBuilder
        public HierarchySource getSource() {
            return ((HierarchyMetadata) this.instance).getSource();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.HierarchyMetadataOrBuilder
        public int getSourceValue() {
            return ((HierarchyMetadata) this.instance).getSourceValue();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.HierarchyMetadataOrBuilder
        public boolean hasCreatedAt() {
            return ((HierarchyMetadata) this.instance).hasCreatedAt();
        }

        @Override // com.google.protobuf.AbstractC0268g, p204p.AbstractC2081l8
        public /* bridge */ /* synthetic */ AbstractC2081l8 internalMergeFrom(AbstractC2118m8 abstractC2118m8) {
            return super.internalMergeFrom((AbstractC0269h) abstractC2118m8);
        }

        public Builder mergeCreatedAt(Timestamp timestamp) {
            copyOnWrite();
            ((HierarchyMetadata) this.instance).mergeCreatedAt(timestamp);
            return this;
        }

        @Override // com.google.protobuf.AbstractC0268g, p204p.AbstractC2081l8, p204p.ore0
        public /* bridge */ /* synthetic */ AbstractC2081l8 mergeFrom(owe oweVar, aux auxVar) {
            return super.mergeFrom(oweVar, auxVar);
        }

        public Builder removeAgents(int i) {
            copyOnWrite();
            ((HierarchyMetadata) this.instance).removeAgents(i);
            return this;
        }

        public Builder setAgents(int i, HierarchyAgent hierarchyAgent) {
            copyOnWrite();
            ((HierarchyMetadata) this.instance).setAgents(i, hierarchyAgent);
            return this;
        }

        public Builder setCreatedAt(Timestamp timestamp) {
            copyOnWrite();
            ((HierarchyMetadata) this.instance).setCreatedAt(timestamp);
            return this;
        }

        public Builder setCurrentUserChannelMuted(boolean z) {
            copyOnWrite();
            ((HierarchyMetadata) this.instance).setCurrentUserChannelMuted(z);
            return this;
        }

        public Builder setCurrentUserParticipationStatus(HierarchyUserParticipationStatus hierarchyUserParticipationStatus) {
            copyOnWrite();
            ((HierarchyMetadata) this.instance).setCurrentUserParticipationStatus(hierarchyUserParticipationStatus);
            return this;
        }

        public Builder setCurrentUserParticipationStatusValue(int i) {
            copyOnWrite();
            ((HierarchyMetadata) this.instance).setCurrentUserParticipationStatusValue(i);
            return this;
        }

        public Builder setHierarchyStatus(HierarchyStatus hierarchyStatus) {
            copyOnWrite();
            ((HierarchyMetadata) this.instance).setHierarchyStatus(hierarchyStatus);
            return this;
        }

        public Builder setHierarchyStatusValue(int i) {
            copyOnWrite();
            ((HierarchyMetadata) this.instance).setHierarchyStatusValue(i);
            return this;
        }

        public Builder setHierarchyType(HierarchyType hierarchyType) {
            copyOnWrite();
            ((HierarchyMetadata) this.instance).setHierarchyType(hierarchyType);
            return this;
        }

        public Builder setHierarchyTypeValue(int i) {
            copyOnWrite();
            ((HierarchyMetadata) this.instance).setHierarchyTypeValue(i);
            return this;
        }

        public Builder setInitiatorUsername(String str) {
            copyOnWrite();
            ((HierarchyMetadata) this.instance).setInitiatorUsername(str);
            return this;
        }

        public Builder setInitiatorUsernameBytes(gva gvaVar) {
            copyOnWrite();
            ((HierarchyMetadata) this.instance).setInitiatorUsernameBytes(gvaVar);
            return this;
        }

        public Builder setSource(HierarchySource hierarchySource) {
            copyOnWrite();
            ((HierarchyMetadata) this.instance).setSource(hierarchySource);
            return this;
        }

        public Builder setSourceValue(int i) {
            copyOnWrite();
            ((HierarchyMetadata) this.instance).setSourceValue(i);
            return this;
        }

        private Builder() {
            super(HierarchyMetadata.DEFAULT_INSTANCE);
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

        public Builder addAgents(int i, HierarchyAgent hierarchyAgent) {
            copyOnWrite();
            ((HierarchyMetadata) this.instance).addAgents(i, hierarchyAgent);
            return this;
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

        public Builder setAgents(int i, HierarchyAgent.Builder builder) {
            copyOnWrite();
            ((HierarchyMetadata) this.instance).setAgents(i, (HierarchyAgent) builder.build());
            return this;
        }

        public Builder setCreatedAt(lu71 lu71Var) {
            copyOnWrite();
            ((HierarchyMetadata) this.instance).setCreatedAt((Timestamp) lu71Var.build());
            return this;
        }

        @Override // p204p.AbstractC2081l8
        /* JADX INFO: renamed from: mergeFrom */
        public /* bridge */ /* synthetic */ ore0 mo98371mergeFrom(InputStream inputStream) {
            return super.mo98371mergeFrom(inputStream);
        }

        public Builder addAgents(HierarchyAgent.Builder builder) {
            copyOnWrite();
            ((HierarchyMetadata) this.instance).addAgents((HierarchyAgent) builder.build());
            return this;
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

        public Builder addAgents(int i, HierarchyAgent.Builder builder) {
            copyOnWrite();
            ((HierarchyMetadata) this.instance).addAgents(i, (HierarchyAgent) builder.build());
            return this;
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
        HierarchyMetadata hierarchyMetadata = new HierarchyMetadata();
        DEFAULT_INSTANCE = hierarchyMetadata;
        AbstractC0269h.registerDefaultInstance(HierarchyMetadata.class, hierarchyMetadata);
    }

    private HierarchyMetadata() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAgents(HierarchyAgent hierarchyAgent) {
        hierarchyAgent.getClass();
        ensureAgentsIsMutable();
        this.agents_.add(hierarchyAgent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllAgents(Iterable<? extends HierarchyAgent> iterable) {
        ensureAgentsIsMutable();
        AbstractC2118m8.addAll(iterable, this.agents_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAgents() {
        this.agents_ = AbstractC0269h.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCreatedAt() {
        this.createdAt_ = null;
        this.bitField0_ &= -2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCurrentUserChannelMuted() {
        this.currentUserChannelMuted_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCurrentUserParticipationStatus() {
        this.currentUserParticipationStatus_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearHierarchyStatus() {
        this.hierarchyStatus_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearHierarchyType() {
        this.hierarchyType_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearInitiatorUsername() {
        this.initiatorUsername_ = getDefaultInstance().getInitiatorUsername();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSource() {
        this.source_ = 0;
    }

    private void ensureAgentsIsMutable() {
        ae50 ae50Var = this.agents_;
        if (((AbstractC1733c9) ae50Var).f35342a) {
            return;
        }
        this.agents_ = AbstractC0269h.mutableCopy(ae50Var);
    }

    public static HierarchyMetadata getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeCreatedAt(Timestamp timestamp) {
        timestamp.getClass();
        Timestamp timestamp2 = this.createdAt_;
        if (timestamp2 == null || timestamp2 == Timestamp.m1965q()) {
            this.createdAt_ = timestamp;
        } else {
            this.createdAt_ = (Timestamp) ((lu71) Timestamp.m1967u(this.createdAt_).mergeFrom((AbstractC0269h) timestamp)).buildPartial();
        }
        this.bitField0_ |= 1;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static HierarchyMetadata parseDelimitedFrom(InputStream inputStream) {
        return (HierarchyMetadata) AbstractC0269h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static HierarchyMetadata parseFrom(ByteBuffer byteBuffer) {
        return (HierarchyMetadata) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeAgents(int i) {
        ensureAgentsIsMutable();
        this.agents_.remove(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAgents(int i, HierarchyAgent hierarchyAgent) {
        hierarchyAgent.getClass();
        ensureAgentsIsMutable();
        this.agents_.set(i, hierarchyAgent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCreatedAt(Timestamp timestamp) {
        timestamp.getClass();
        this.createdAt_ = timestamp;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCurrentUserChannelMuted(boolean z) {
        this.currentUserChannelMuted_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCurrentUserParticipationStatus(HierarchyUserParticipationStatus hierarchyUserParticipationStatus) {
        this.currentUserParticipationStatus_ = hierarchyUserParticipationStatus.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCurrentUserParticipationStatusValue(int i) {
        this.currentUserParticipationStatus_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHierarchyStatus(HierarchyStatus hierarchyStatus) {
        this.hierarchyStatus_ = hierarchyStatus.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHierarchyStatusValue(int i) {
        this.hierarchyStatus_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHierarchyType(HierarchyType hierarchyType) {
        this.hierarchyType_ = hierarchyType.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHierarchyTypeValue(int i) {
        this.hierarchyType_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setInitiatorUsername(String str) {
        str.getClass();
        this.initiatorUsername_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setInitiatorUsernameBytes(gva gvaVar) {
        AbstractC2118m8.checkByteStringIsUtf8(gvaVar);
        this.initiatorUsername_ = gvaVar.m45892u();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSource(HierarchySource hierarchySource) {
        this.source_ = hierarchySource.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSourceValue(int i) {
        this.source_ = i;
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\b\u0000\u0001\u0001\b\b\u0000\u0001\u0000\u0001Ȉ\u0002\f\u0003\f\u0004\f\u0005\f\u0006ဉ\u0000\u0007\u0007\b\u001b", new Object[]{"bitField0_", "initiatorUsername_", "hierarchyStatus_", "currentUserParticipationStatus_", "source_", "hierarchyType_", "createdAt_", "currentUserChannelMuted_", "agents_", HierarchyAgent.class});
        }
        if (iOrdinal == 3) {
            return new HierarchyMetadata();
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
        synchronized (HierarchyMetadata.class) {
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

    @Override // com.spotify.campfire.datasource.impl.proto.HierarchyMetadataOrBuilder
    public HierarchyAgent getAgents(int i) {
        return (HierarchyAgent) this.agents_.get(i);
    }

    @Override // com.spotify.campfire.datasource.impl.proto.HierarchyMetadataOrBuilder
    public int getAgentsCount() {
        return this.agents_.size();
    }

    @Override // com.spotify.campfire.datasource.impl.proto.HierarchyMetadataOrBuilder
    public List<HierarchyAgent> getAgentsList() {
        return this.agents_;
    }

    public HierarchyAgentOrBuilder getAgentsOrBuilder(int i) {
        return (HierarchyAgentOrBuilder) this.agents_.get(i);
    }

    public List<? extends HierarchyAgentOrBuilder> getAgentsOrBuilderList() {
        return this.agents_;
    }

    @Override // com.spotify.campfire.datasource.impl.proto.HierarchyMetadataOrBuilder
    public Timestamp getCreatedAt() {
        Timestamp timestamp = this.createdAt_;
        return timestamp == null ? Timestamp.m1965q() : timestamp;
    }

    @Override // com.spotify.campfire.datasource.impl.proto.HierarchyMetadataOrBuilder
    public boolean getCurrentUserChannelMuted() {
        return this.currentUserChannelMuted_;
    }

    @Override // com.spotify.campfire.datasource.impl.proto.HierarchyMetadataOrBuilder
    public HierarchyUserParticipationStatus getCurrentUserParticipationStatus() {
        HierarchyUserParticipationStatus hierarchyUserParticipationStatusForNumber = HierarchyUserParticipationStatus.forNumber(this.currentUserParticipationStatus_);
        return hierarchyUserParticipationStatusForNumber == null ? HierarchyUserParticipationStatus.UNRECOGNIZED : hierarchyUserParticipationStatusForNumber;
    }

    @Override // com.spotify.campfire.datasource.impl.proto.HierarchyMetadataOrBuilder
    public int getCurrentUserParticipationStatusValue() {
        return this.currentUserParticipationStatus_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.sre0
    public /* bridge */ /* synthetic */ pre0 getDefaultInstanceForType() {
        return getDefaultInstanceForType();
    }

    @Override // com.spotify.campfire.datasource.impl.proto.HierarchyMetadataOrBuilder
    public HierarchyStatus getHierarchyStatus() {
        HierarchyStatus hierarchyStatusForNumber = HierarchyStatus.forNumber(this.hierarchyStatus_);
        return hierarchyStatusForNumber == null ? HierarchyStatus.UNRECOGNIZED : hierarchyStatusForNumber;
    }

    @Override // com.spotify.campfire.datasource.impl.proto.HierarchyMetadataOrBuilder
    public int getHierarchyStatusValue() {
        return this.hierarchyStatus_;
    }

    @Override // com.spotify.campfire.datasource.impl.proto.HierarchyMetadataOrBuilder
    public HierarchyType getHierarchyType() {
        HierarchyType hierarchyTypeForNumber = HierarchyType.forNumber(this.hierarchyType_);
        return hierarchyTypeForNumber == null ? HierarchyType.UNRECOGNIZED : hierarchyTypeForNumber;
    }

    @Override // com.spotify.campfire.datasource.impl.proto.HierarchyMetadataOrBuilder
    public int getHierarchyTypeValue() {
        return this.hierarchyType_;
    }

    @Override // com.spotify.campfire.datasource.impl.proto.HierarchyMetadataOrBuilder
    public String getInitiatorUsername() {
        return this.initiatorUsername_;
    }

    @Override // com.spotify.campfire.datasource.impl.proto.HierarchyMetadataOrBuilder
    public gva getInitiatorUsernameBytes() {
        return gva.m45888f(this.initiatorUsername_);
    }

    @Override // com.spotify.campfire.datasource.impl.proto.HierarchyMetadataOrBuilder
    public HierarchySource getSource() {
        HierarchySource hierarchySourceForNumber = HierarchySource.forNumber(this.source_);
        return hierarchySourceForNumber == null ? HierarchySource.UNRECOGNIZED : hierarchySourceForNumber;
    }

    @Override // com.spotify.campfire.datasource.impl.proto.HierarchyMetadataOrBuilder
    public int getSourceValue() {
        return this.source_;
    }

    @Override // com.spotify.campfire.datasource.impl.proto.HierarchyMetadataOrBuilder
    public boolean hasCreatedAt() {
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

    public static Builder newBuilder(HierarchyMetadata hierarchyMetadata) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(hierarchyMetadata);
    }

    public static HierarchyMetadata parseDelimitedFrom(InputStream inputStream, aux auxVar) {
        return (HierarchyMetadata) AbstractC0269h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, auxVar);
    }

    public static HierarchyMetadata parseFrom(ByteBuffer byteBuffer, aux auxVar) {
        return (HierarchyMetadata) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, byteBuffer, auxVar);
    }

    public static HierarchyMetadata parseFrom(gva gvaVar) {
        return (HierarchyMetadata) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, gvaVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAgents(int i, HierarchyAgent hierarchyAgent) {
        hierarchyAgent.getClass();
        ensureAgentsIsMutable();
        this.agents_.add(i, hierarchyAgent);
    }

    public static HierarchyMetadata parseFrom(gva gvaVar, aux auxVar) {
        return (HierarchyMetadata) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, gvaVar, auxVar);
    }

    public static HierarchyMetadata parseFrom(byte[] bArr) {
        return (HierarchyMetadata) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static HierarchyMetadata parseFrom(byte[] bArr, aux auxVar) {
        return (HierarchyMetadata) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr, auxVar);
    }

    public static HierarchyMetadata parseFrom(InputStream inputStream) {
        return (HierarchyMetadata) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static HierarchyMetadata parseFrom(InputStream inputStream, aux auxVar) {
        return (HierarchyMetadata) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, inputStream, auxVar);
    }

    public static HierarchyMetadata parseFrom(owe oweVar) {
        return (HierarchyMetadata) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, oweVar);
    }

    public static HierarchyMetadata parseFrom(owe oweVar, aux auxVar) {
        return (HierarchyMetadata) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, oweVar, auxVar);
    }
}
