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
public final class ModerationStatus extends AbstractC0269h implements ModerationStatusOrBuilder {
    private static final ModerationStatus DEFAULT_INSTANCE;
    public static final int DELETED_FOR_ALL_FIELD_NUMBER = 5;
    public static final int DELETED_FOR_USER_FIELD_NUMBER = 4;
    public static final int HIDDEN_FIELD_NUMBER = 3;
    private static volatile r2n0 PARSER = null;
    public static final int REMOVED_FIELD_NUMBER = 2;
    public static final int REPORTED_FIELD_NUMBER = 1;
    private int statusCase_ = 0;
    private Object status_;

    /* JADX INFO: renamed from: com.spotify.campfire.datasource.impl.proto.ModerationStatus$1 */
    public static /* synthetic */ class C04101 {

        /* JADX INFO: renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f3226xa1df5c61;

        static {
            int[] iArr = new int[z110.values().length];
            f3226xa1df5c61 = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f3226xa1df5c61[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f3226xa1df5c61[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f3226xa1df5c61[5] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f3226xa1df5c61[6] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f3226xa1df5c61[0] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f3226xa1df5c61[1] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class Builder extends AbstractC0268g implements ModerationStatusOrBuilder {
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

        public Builder clearDeletedForAll() {
            copyOnWrite();
            ((ModerationStatus) this.instance).clearDeletedForAll();
            return this;
        }

        public Builder clearDeletedForUser() {
            copyOnWrite();
            ((ModerationStatus) this.instance).clearDeletedForUser();
            return this;
        }

        public Builder clearHidden() {
            copyOnWrite();
            ((ModerationStatus) this.instance).clearHidden();
            return this;
        }

        public Builder clearRemoved() {
            copyOnWrite();
            ((ModerationStatus) this.instance).clearRemoved();
            return this;
        }

        public Builder clearReported() {
            copyOnWrite();
            ((ModerationStatus) this.instance).clearReported();
            return this;
        }

        public Builder clearStatus() {
            copyOnWrite();
            ((ModerationStatus) this.instance).clearStatus();
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

        @Override // com.spotify.campfire.datasource.impl.proto.ModerationStatusOrBuilder
        public DeletedForAll getDeletedForAll() {
            return ((ModerationStatus) this.instance).getDeletedForAll();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.ModerationStatusOrBuilder
        public DeletedForUser getDeletedForUser() {
            return ((ModerationStatus) this.instance).getDeletedForUser();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.ModerationStatusOrBuilder
        public Hidden getHidden() {
            return ((ModerationStatus) this.instance).getHidden();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.ModerationStatusOrBuilder
        public Removed getRemoved() {
            return ((ModerationStatus) this.instance).getRemoved();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.ModerationStatusOrBuilder
        public Reported getReported() {
            return ((ModerationStatus) this.instance).getReported();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.ModerationStatusOrBuilder
        public StatusCase getStatusCase() {
            return ((ModerationStatus) this.instance).getStatusCase();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.ModerationStatusOrBuilder
        public boolean hasDeletedForAll() {
            return ((ModerationStatus) this.instance).hasDeletedForAll();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.ModerationStatusOrBuilder
        public boolean hasDeletedForUser() {
            return ((ModerationStatus) this.instance).hasDeletedForUser();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.ModerationStatusOrBuilder
        public boolean hasHidden() {
            return ((ModerationStatus) this.instance).hasHidden();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.ModerationStatusOrBuilder
        public boolean hasRemoved() {
            return ((ModerationStatus) this.instance).hasRemoved();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.ModerationStatusOrBuilder
        public boolean hasReported() {
            return ((ModerationStatus) this.instance).hasReported();
        }

        @Override // com.google.protobuf.AbstractC0268g, p204p.AbstractC2081l8
        public /* bridge */ /* synthetic */ AbstractC2081l8 internalMergeFrom(AbstractC2118m8 abstractC2118m8) {
            return super.internalMergeFrom((AbstractC0269h) abstractC2118m8);
        }

        public Builder mergeDeletedForAll(DeletedForAll deletedForAll) {
            copyOnWrite();
            ((ModerationStatus) this.instance).mergeDeletedForAll(deletedForAll);
            return this;
        }

        public Builder mergeDeletedForUser(DeletedForUser deletedForUser) {
            copyOnWrite();
            ((ModerationStatus) this.instance).mergeDeletedForUser(deletedForUser);
            return this;
        }

        @Override // com.google.protobuf.AbstractC0268g, p204p.AbstractC2081l8, p204p.ore0
        public /* bridge */ /* synthetic */ AbstractC2081l8 mergeFrom(owe oweVar, aux auxVar) {
            return super.mergeFrom(oweVar, auxVar);
        }

        public Builder mergeHidden(Hidden hidden) {
            copyOnWrite();
            ((ModerationStatus) this.instance).mergeHidden(hidden);
            return this;
        }

        public Builder mergeRemoved(Removed removed) {
            copyOnWrite();
            ((ModerationStatus) this.instance).mergeRemoved(removed);
            return this;
        }

        public Builder mergeReported(Reported reported) {
            copyOnWrite();
            ((ModerationStatus) this.instance).mergeReported(reported);
            return this;
        }

        public Builder setDeletedForAll(DeletedForAll deletedForAll) {
            copyOnWrite();
            ((ModerationStatus) this.instance).setDeletedForAll(deletedForAll);
            return this;
        }

        public Builder setDeletedForUser(DeletedForUser deletedForUser) {
            copyOnWrite();
            ((ModerationStatus) this.instance).setDeletedForUser(deletedForUser);
            return this;
        }

        public Builder setHidden(Hidden hidden) {
            copyOnWrite();
            ((ModerationStatus) this.instance).setHidden(hidden);
            return this;
        }

        public Builder setRemoved(Removed removed) {
            copyOnWrite();
            ((ModerationStatus) this.instance).setRemoved(removed);
            return this;
        }

        public Builder setReported(Reported reported) {
            copyOnWrite();
            ((ModerationStatus) this.instance).setReported(reported);
            return this;
        }

        private Builder() {
            super(ModerationStatus.DEFAULT_INSTANCE);
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

        public Builder setDeletedForAll(DeletedForAll.Builder builder) {
            copyOnWrite();
            ((ModerationStatus) this.instance).setDeletedForAll((DeletedForAll) builder.build());
            return this;
        }

        public Builder setDeletedForUser(DeletedForUser.Builder builder) {
            copyOnWrite();
            ((ModerationStatus) this.instance).setDeletedForUser((DeletedForUser) builder.build());
            return this;
        }

        public Builder setHidden(Hidden.Builder builder) {
            copyOnWrite();
            ((ModerationStatus) this.instance).setHidden((Hidden) builder.build());
            return this;
        }

        public Builder setRemoved(Removed.Builder builder) {
            copyOnWrite();
            ((ModerationStatus) this.instance).setRemoved((Removed) builder.build());
            return this;
        }

        public Builder setReported(Reported.Builder builder) {
            copyOnWrite();
            ((ModerationStatus) this.instance).setReported((Reported) builder.build());
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

    public enum StatusCase {
        REPORTED(1),
        REMOVED(2),
        HIDDEN(3),
        DELETED_FOR_USER(4),
        DELETED_FOR_ALL(5),
        STATUS_NOT_SET(0);

        private final int value;

        StatusCase(int i) {
            this.value = i;
        }

        public static StatusCase forNumber(int i) {
            if (i == 0) {
                return STATUS_NOT_SET;
            }
            if (i == 1) {
                return REPORTED;
            }
            if (i == 2) {
                return REMOVED;
            }
            if (i == 3) {
                return HIDDEN;
            }
            if (i == 4) {
                return DELETED_FOR_USER;
            }
            if (i != 5) {
                return null;
            }
            return DELETED_FOR_ALL;
        }

        public int getNumber() {
            return this.value;
        }

        @Deprecated
        public static StatusCase valueOf(int i) {
            return forNumber(i);
        }
    }

    static {
        ModerationStatus moderationStatus = new ModerationStatus();
        DEFAULT_INSTANCE = moderationStatus;
        AbstractC0269h.registerDefaultInstance(ModerationStatus.class, moderationStatus);
    }

    private ModerationStatus() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDeletedForAll() {
        if (this.statusCase_ == 5) {
            this.statusCase_ = 0;
            this.status_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDeletedForUser() {
        if (this.statusCase_ == 4) {
            this.statusCase_ = 0;
            this.status_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearHidden() {
        if (this.statusCase_ == 3) {
            this.statusCase_ = 0;
            this.status_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRemoved() {
        if (this.statusCase_ == 2) {
            this.statusCase_ = 0;
            this.status_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearReported() {
        if (this.statusCase_ == 1) {
            this.statusCase_ = 0;
            this.status_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStatus() {
        this.statusCase_ = 0;
        this.status_ = null;
    }

    public static ModerationStatus getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeDeletedForAll(DeletedForAll deletedForAll) {
        deletedForAll.getClass();
        if (this.statusCase_ != 5 || this.status_ == DeletedForAll.getDefaultInstance()) {
            this.status_ = deletedForAll;
        } else {
            this.status_ = ((DeletedForAll.Builder) DeletedForAll.newBuilder((DeletedForAll) this.status_).mergeFrom((AbstractC0269h) deletedForAll)).buildPartial();
        }
        this.statusCase_ = 5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeDeletedForUser(DeletedForUser deletedForUser) {
        deletedForUser.getClass();
        if (this.statusCase_ != 4 || this.status_ == DeletedForUser.getDefaultInstance()) {
            this.status_ = deletedForUser;
        } else {
            this.status_ = ((DeletedForUser.Builder) DeletedForUser.newBuilder((DeletedForUser) this.status_).mergeFrom((AbstractC0269h) deletedForUser)).buildPartial();
        }
        this.statusCase_ = 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeHidden(Hidden hidden) {
        hidden.getClass();
        if (this.statusCase_ != 3 || this.status_ == Hidden.getDefaultInstance()) {
            this.status_ = hidden;
        } else {
            this.status_ = ((Hidden.Builder) Hidden.newBuilder((Hidden) this.status_).mergeFrom((AbstractC0269h) hidden)).buildPartial();
        }
        this.statusCase_ = 3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeRemoved(Removed removed) {
        removed.getClass();
        if (this.statusCase_ != 2 || this.status_ == Removed.getDefaultInstance()) {
            this.status_ = removed;
        } else {
            this.status_ = ((Removed.Builder) Removed.newBuilder((Removed) this.status_).mergeFrom((AbstractC0269h) removed)).buildPartial();
        }
        this.statusCase_ = 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeReported(Reported reported) {
        reported.getClass();
        if (this.statusCase_ != 1 || this.status_ == Reported.getDefaultInstance()) {
            this.status_ = reported;
        } else {
            this.status_ = ((Reported.Builder) Reported.newBuilder((Reported) this.status_).mergeFrom((AbstractC0269h) reported)).buildPartial();
        }
        this.statusCase_ = 1;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static ModerationStatus parseDelimitedFrom(InputStream inputStream) {
        return (ModerationStatus) AbstractC0269h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ModerationStatus parseFrom(ByteBuffer byteBuffer) {
        return (ModerationStatus) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDeletedForAll(DeletedForAll deletedForAll) {
        deletedForAll.getClass();
        this.status_ = deletedForAll;
        this.statusCase_ = 5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDeletedForUser(DeletedForUser deletedForUser) {
        deletedForUser.getClass();
        this.status_ = deletedForUser;
        this.statusCase_ = 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHidden(Hidden hidden) {
        hidden.getClass();
        this.status_ = hidden;
        this.statusCase_ = 3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRemoved(Removed removed) {
        removed.getClass();
        this.status_ = removed;
        this.statusCase_ = 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setReported(Reported reported) {
        reported.getClass();
        this.status_ = reported;
        this.statusCase_ = 1;
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0001\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000", new Object[]{"status_", "statusCase_", Reported.class, Removed.class, Hidden.class, DeletedForUser.class, DeletedForAll.class});
        }
        if (iOrdinal == 3) {
            return new ModerationStatus();
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
        synchronized (ModerationStatus.class) {
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

    @Override // com.spotify.campfire.datasource.impl.proto.ModerationStatusOrBuilder
    public DeletedForAll getDeletedForAll() {
        return this.statusCase_ == 5 ? (DeletedForAll) this.status_ : DeletedForAll.getDefaultInstance();
    }

    @Override // com.spotify.campfire.datasource.impl.proto.ModerationStatusOrBuilder
    public DeletedForUser getDeletedForUser() {
        return this.statusCase_ == 4 ? (DeletedForUser) this.status_ : DeletedForUser.getDefaultInstance();
    }

    @Override // com.spotify.campfire.datasource.impl.proto.ModerationStatusOrBuilder
    public Hidden getHidden() {
        return this.statusCase_ == 3 ? (Hidden) this.status_ : Hidden.getDefaultInstance();
    }

    @Override // com.spotify.campfire.datasource.impl.proto.ModerationStatusOrBuilder
    public Removed getRemoved() {
        return this.statusCase_ == 2 ? (Removed) this.status_ : Removed.getDefaultInstance();
    }

    @Override // com.spotify.campfire.datasource.impl.proto.ModerationStatusOrBuilder
    public Reported getReported() {
        return this.statusCase_ == 1 ? (Reported) this.status_ : Reported.getDefaultInstance();
    }

    @Override // com.spotify.campfire.datasource.impl.proto.ModerationStatusOrBuilder
    public StatusCase getStatusCase() {
        return StatusCase.forNumber(this.statusCase_);
    }

    @Override // com.spotify.campfire.datasource.impl.proto.ModerationStatusOrBuilder
    public boolean hasDeletedForAll() {
        return this.statusCase_ == 5;
    }

    @Override // com.spotify.campfire.datasource.impl.proto.ModerationStatusOrBuilder
    public boolean hasDeletedForUser() {
        return this.statusCase_ == 4;
    }

    @Override // com.spotify.campfire.datasource.impl.proto.ModerationStatusOrBuilder
    public boolean hasHidden() {
        return this.statusCase_ == 3;
    }

    @Override // com.spotify.campfire.datasource.impl.proto.ModerationStatusOrBuilder
    public boolean hasRemoved() {
        return this.statusCase_ == 2;
    }

    @Override // com.spotify.campfire.datasource.impl.proto.ModerationStatusOrBuilder
    public boolean hasReported() {
        return this.statusCase_ == 1;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }

    public static Builder newBuilder(ModerationStatus moderationStatus) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(moderationStatus);
    }

    public static ModerationStatus parseDelimitedFrom(InputStream inputStream, aux auxVar) {
        return (ModerationStatus) AbstractC0269h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, auxVar);
    }

    public static ModerationStatus parseFrom(ByteBuffer byteBuffer, aux auxVar) {
        return (ModerationStatus) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, byteBuffer, auxVar);
    }

    public static ModerationStatus parseFrom(gva gvaVar) {
        return (ModerationStatus) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, gvaVar);
    }

    public static ModerationStatus parseFrom(gva gvaVar, aux auxVar) {
        return (ModerationStatus) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, gvaVar, auxVar);
    }

    public static ModerationStatus parseFrom(byte[] bArr) {
        return (ModerationStatus) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ModerationStatus parseFrom(byte[] bArr, aux auxVar) {
        return (ModerationStatus) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr, auxVar);
    }

    public static ModerationStatus parseFrom(InputStream inputStream) {
        return (ModerationStatus) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ModerationStatus parseFrom(InputStream inputStream, aux auxVar) {
        return (ModerationStatus) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, inputStream, auxVar);
    }

    public static ModerationStatus parseFrom(owe oweVar) {
        return (ModerationStatus) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, oweVar);
    }

    public static ModerationStatus parseFrom(owe oweVar, aux auxVar) {
        return (ModerationStatus) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, oweVar, auxVar);
    }
}
