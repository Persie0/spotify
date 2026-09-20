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
public final class Revision extends AbstractC0269h implements RevisionOrBuilder {
    private static final Revision DEFAULT_INSTANCE;
    public static final int HIERARCHY_ID_FIELD_NUMBER = 1;
    private static volatile r2n0 PARSER = null;
    public static final int REVISION_FIELD_NUMBER = 2;
    public static final int REVISION_VERSION_FIELD_NUMBER = 3;
    private String hierarchyId_ = "";
    private String revision_ = "";
    private String revisionVersion_ = "";

    /* JADX INFO: renamed from: com.spotify.campfire.datasource.impl.proto.Revision$1 */
    public static /* synthetic */ class C04491 {

        /* JADX INFO: renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f3260xa1df5c61;

        static {
            int[] iArr = new int[z110.values().length];
            f3260xa1df5c61 = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f3260xa1df5c61[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f3260xa1df5c61[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f3260xa1df5c61[5] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f3260xa1df5c61[6] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f3260xa1df5c61[0] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f3260xa1df5c61[1] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class Builder extends AbstractC0268g implements RevisionOrBuilder {
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

        public Builder clearHierarchyId() {
            copyOnWrite();
            ((Revision) this.instance).clearHierarchyId();
            return this;
        }

        public Builder clearRevision() {
            copyOnWrite();
            ((Revision) this.instance).clearRevision();
            return this;
        }

        public Builder clearRevisionVersion() {
            copyOnWrite();
            ((Revision) this.instance).clearRevisionVersion();
            return this;
        }

        @Override // com.google.protobuf.AbstractC0268g
        /* JADX INFO: renamed from: clone */
        public /* bridge */ /* synthetic */ Object mo98327clone() {
            return super.mo98326clone();
        }

        @Override // com.google.protobuf.AbstractC0268g, p204p.sre0
        public /* bridge */ /* synthetic */ pre0 getDefaultInstanceForType() {
            return super.getDefaultInstanceForType();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.RevisionOrBuilder
        public String getHierarchyId() {
            return ((Revision) this.instance).getHierarchyId();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.RevisionOrBuilder
        public gva getHierarchyIdBytes() {
            return ((Revision) this.instance).getHierarchyIdBytes();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.RevisionOrBuilder
        public String getRevision() {
            return ((Revision) this.instance).getRevision();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.RevisionOrBuilder
        public gva getRevisionBytes() {
            return ((Revision) this.instance).getRevisionBytes();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.RevisionOrBuilder
        public String getRevisionVersion() {
            return ((Revision) this.instance).getRevisionVersion();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.RevisionOrBuilder
        public gva getRevisionVersionBytes() {
            return ((Revision) this.instance).getRevisionVersionBytes();
        }

        @Override // com.google.protobuf.AbstractC0268g, p204p.AbstractC2081l8
        public /* bridge */ /* synthetic */ AbstractC2081l8 internalMergeFrom(AbstractC2118m8 abstractC2118m8) {
            return super.internalMergeFrom((AbstractC0269h) abstractC2118m8);
        }

        @Override // com.google.protobuf.AbstractC0268g, p204p.AbstractC2081l8, p204p.ore0
        public /* bridge */ /* synthetic */ AbstractC2081l8 mergeFrom(owe oweVar, aux auxVar) {
            return super.mergeFrom(oweVar, auxVar);
        }

        public Builder setHierarchyId(String str) {
            copyOnWrite();
            ((Revision) this.instance).setHierarchyId(str);
            return this;
        }

        public Builder setHierarchyIdBytes(gva gvaVar) {
            copyOnWrite();
            ((Revision) this.instance).setHierarchyIdBytes(gvaVar);
            return this;
        }

        public Builder setRevision(String str) {
            copyOnWrite();
            ((Revision) this.instance).setRevision(str);
            return this;
        }

        public Builder setRevisionBytes(gva gvaVar) {
            copyOnWrite();
            ((Revision) this.instance).setRevisionBytes(gvaVar);
            return this;
        }

        public Builder setRevisionVersion(String str) {
            copyOnWrite();
            ((Revision) this.instance).setRevisionVersion(str);
            return this;
        }

        public Builder setRevisionVersionBytes(gva gvaVar) {
            copyOnWrite();
            ((Revision) this.instance).setRevisionVersionBytes(gvaVar);
            return this;
        }

        private Builder() {
            super(Revision.DEFAULT_INSTANCE);
        }

        @Override // com.google.protobuf.AbstractC0268g
        /* JADX INFO: renamed from: clone */
        public /* bridge */ /* synthetic */ AbstractC2081l8 mo98328clone() {
            return super.mo98326clone();
        }

        @Override // com.google.protobuf.AbstractC0268g, p204p.AbstractC2081l8
        /* JADX INFO: renamed from: mergeFrom */
        public /* bridge */ /* synthetic */ AbstractC2081l8 mo98329mergeFrom(byte[] bArr, int i, int i2) {
            return super.mo98329mergeFrom(bArr, i, i2);
        }

        @Override // com.google.protobuf.AbstractC0268g
        /* JADX INFO: renamed from: clone */
        public /* bridge */ /* synthetic */ ore0 mo98328clone() {
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
        Revision revision = new Revision();
        DEFAULT_INSTANCE = revision;
        AbstractC0269h.registerDefaultInstance(Revision.class, revision);
    }

    private Revision() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearHierarchyId() {
        this.hierarchyId_ = getDefaultInstance().getHierarchyId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRevision() {
        this.revision_ = getDefaultInstance().getRevision();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRevisionVersion() {
        this.revisionVersion_ = getDefaultInstance().getRevisionVersion();
    }

    public static Revision getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static Revision parseDelimitedFrom(InputStream inputStream) {
        return (Revision) AbstractC0269h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Revision parseFrom(ByteBuffer byteBuffer) {
        return (Revision) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHierarchyId(String str) {
        str.getClass();
        this.hierarchyId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHierarchyIdBytes(gva gvaVar) {
        AbstractC2118m8.checkByteStringIsUtf8(gvaVar);
        this.hierarchyId_ = gvaVar.m45892u();
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
    public void setRevisionVersion(String str) {
        str.getClass();
        this.revisionVersion_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRevisionVersionBytes(gva gvaVar) {
        AbstractC2118m8.checkByteStringIsUtf8(gvaVar);
        this.revisionVersion_ = gvaVar.m45892u();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ", new Object[]{"hierarchyId_", "revision_", "revisionVersion_"});
        }
        if (iOrdinal == 3) {
            return new Revision();
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
        synchronized (Revision.class) {
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

    @Override // com.spotify.campfire.datasource.impl.proto.RevisionOrBuilder
    public String getHierarchyId() {
        return this.hierarchyId_;
    }

    @Override // com.spotify.campfire.datasource.impl.proto.RevisionOrBuilder
    public gva getHierarchyIdBytes() {
        return gva.m45888f(this.hierarchyId_);
    }

    @Override // com.spotify.campfire.datasource.impl.proto.RevisionOrBuilder
    public String getRevision() {
        return this.revision_;
    }

    @Override // com.spotify.campfire.datasource.impl.proto.RevisionOrBuilder
    public gva getRevisionBytes() {
        return gva.m45888f(this.revision_);
    }

    @Override // com.spotify.campfire.datasource.impl.proto.RevisionOrBuilder
    public String getRevisionVersion() {
        return this.revisionVersion_;
    }

    @Override // com.spotify.campfire.datasource.impl.proto.RevisionOrBuilder
    public gva getRevisionVersionBytes() {
        return gva.m45888f(this.revisionVersion_);
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }

    public static Builder newBuilder(Revision revision) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(revision);
    }

    public static Revision parseDelimitedFrom(InputStream inputStream, aux auxVar) {
        return (Revision) AbstractC0269h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, auxVar);
    }

    public static Revision parseFrom(ByteBuffer byteBuffer, aux auxVar) {
        return (Revision) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, byteBuffer, auxVar);
    }

    public static Revision parseFrom(gva gvaVar) {
        return (Revision) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, gvaVar);
    }

    public static Revision parseFrom(gva gvaVar, aux auxVar) {
        return (Revision) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, gvaVar, auxVar);
    }

    public static Revision parseFrom(byte[] bArr) {
        return (Revision) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Revision parseFrom(byte[] bArr, aux auxVar) {
        return (Revision) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr, auxVar);
    }

    public static Revision parseFrom(InputStream inputStream) {
        return (Revision) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Revision parseFrom(InputStream inputStream, aux auxVar) {
        return (Revision) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, inputStream, auxVar);
    }

    public static Revision parseFrom(owe oweVar) {
        return (Revision) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, oweVar);
    }

    public static Revision parseFrom(owe oweVar, aux auxVar) {
        return (Revision) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, oweVar, auxVar);
    }
}
