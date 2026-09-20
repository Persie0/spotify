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
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes5.dex */
public final class InviteLinkOpenResponse extends AbstractC0269h implements InviteLinkOpenResponseOrBuilder {
    private static final InviteLinkOpenResponse DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER = null;
    public static final int REDIRECT_FIELD_NUMBER = 1;
    private int bitField0_;
    private Redirect redirect_;

    /* JADX INFO: renamed from: com.spotify.campfire.datasource.impl.proto.InviteLinkOpenResponse$1 */
    public static /* synthetic */ class C03981 {

        /* JADX INFO: renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f3215xa1df5c61;

        static {
            int[] iArr = new int[z110.values().length];
            f3215xa1df5c61 = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f3215xa1df5c61[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f3215xa1df5c61[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f3215xa1df5c61[5] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f3215xa1df5c61[6] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f3215xa1df5c61[0] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f3215xa1df5c61[1] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class Builder extends AbstractC0268g implements InviteLinkOpenResponseOrBuilder {
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

        public Builder clearRedirect() {
            copyOnWrite();
            ((InviteLinkOpenResponse) this.instance).clearRedirect();
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

        @Override // com.spotify.campfire.datasource.impl.proto.InviteLinkOpenResponseOrBuilder
        public Redirect getRedirect() {
            return ((InviteLinkOpenResponse) this.instance).getRedirect();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.InviteLinkOpenResponseOrBuilder
        public boolean hasRedirect() {
            return ((InviteLinkOpenResponse) this.instance).hasRedirect();
        }

        @Override // com.google.protobuf.AbstractC0268g, p204p.AbstractC2081l8
        public /* bridge */ /* synthetic */ AbstractC2081l8 internalMergeFrom(AbstractC2118m8 abstractC2118m8) {
            return super.internalMergeFrom((AbstractC0269h) abstractC2118m8);
        }

        @Override // com.google.protobuf.AbstractC0268g, p204p.AbstractC2081l8, p204p.ore0
        public /* bridge */ /* synthetic */ AbstractC2081l8 mergeFrom(owe oweVar, aux auxVar) {
            return super.mergeFrom(oweVar, auxVar);
        }

        public Builder mergeRedirect(Redirect redirect) {
            copyOnWrite();
            ((InviteLinkOpenResponse) this.instance).mergeRedirect(redirect);
            return this;
        }

        public Builder setRedirect(Redirect redirect) {
            copyOnWrite();
            ((InviteLinkOpenResponse) this.instance).setRedirect(redirect);
            return this;
        }

        private Builder() {
            super(InviteLinkOpenResponse.DEFAULT_INSTANCE);
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

        public Builder setRedirect(Redirect.Builder builder) {
            copyOnWrite();
            ((InviteLinkOpenResponse) this.instance).setRedirect((Redirect) builder.build());
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

    public static final class Redirect extends AbstractC0269h implements RedirectOrBuilder {
        private static final Redirect DEFAULT_INSTANCE;
        public static final int HIERARCHY_ID_FIELD_NUMBER = 3;
        public static final int NODE_PATH_ID_FIELD_NUMBER = 2;
        private static volatile r2n0 PARSER;
        private String nodePathId_ = "";
        private String hierarchyId_ = "";

        public static final class Builder extends AbstractC0268g implements RedirectOrBuilder {
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
                ((Redirect) this.instance).clearHierarchyId();
                return this;
            }

            public Builder clearNodePathId() {
                copyOnWrite();
                ((Redirect) this.instance).clearNodePathId();
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

            @Override // com.spotify.campfire.datasource.impl.proto.InviteLinkOpenResponse.RedirectOrBuilder
            public String getHierarchyId() {
                return ((Redirect) this.instance).getHierarchyId();
            }

            @Override // com.spotify.campfire.datasource.impl.proto.InviteLinkOpenResponse.RedirectOrBuilder
            public gva getHierarchyIdBytes() {
                return ((Redirect) this.instance).getHierarchyIdBytes();
            }

            @Override // com.spotify.campfire.datasource.impl.proto.InviteLinkOpenResponse.RedirectOrBuilder
            public String getNodePathId() {
                return ((Redirect) this.instance).getNodePathId();
            }

            @Override // com.spotify.campfire.datasource.impl.proto.InviteLinkOpenResponse.RedirectOrBuilder
            public gva getNodePathIdBytes() {
                return ((Redirect) this.instance).getNodePathIdBytes();
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
                ((Redirect) this.instance).setHierarchyId(str);
                return this;
            }

            public Builder setHierarchyIdBytes(gva gvaVar) {
                copyOnWrite();
                ((Redirect) this.instance).setHierarchyIdBytes(gvaVar);
                return this;
            }

            public Builder setNodePathId(String str) {
                copyOnWrite();
                ((Redirect) this.instance).setNodePathId(str);
                return this;
            }

            public Builder setNodePathIdBytes(gva gvaVar) {
                copyOnWrite();
                ((Redirect) this.instance).setNodePathIdBytes(gvaVar);
                return this;
            }

            private Builder() {
                super(Redirect.DEFAULT_INSTANCE);
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
            Redirect redirect = new Redirect();
            DEFAULT_INSTANCE = redirect;
            AbstractC0269h.registerDefaultInstance(Redirect.class, redirect);
        }

        private Redirect() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearHierarchyId() {
            this.hierarchyId_ = getDefaultInstance().getHierarchyId();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearNodePathId() {
            this.nodePathId_ = getDefaultInstance().getNodePathId();
        }

        public static Redirect getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static Redirect parseDelimitedFrom(InputStream inputStream) {
            return (Redirect) AbstractC0269h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Redirect parseFrom(ByteBuffer byteBuffer) {
            return (Redirect) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, byteBuffer);
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
        public void setNodePathId(String str) {
            str.getClass();
            this.nodePathId_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setNodePathIdBytes(gva gvaVar) {
            AbstractC2118m8.checkByteStringIsUtf8(gvaVar);
            this.nodePathId_ = gvaVar.m45892u();
        }

        @Override // com.google.protobuf.AbstractC0269h
        public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
            r2n0 r110Var;
            int iOrdinal = z110Var.ordinal();
            if (iOrdinal == 0) {
                return (byte) 1;
            }
            if (iOrdinal == 2) {
                return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0002\u0003\u0002\u0000\u0000\u0000\u0002Ȉ\u0003Ȉ", new Object[]{"nodePathId_", "hierarchyId_"});
            }
            if (iOrdinal == 3) {
                return new Redirect();
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
            synchronized (Redirect.class) {
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

        @Override // com.spotify.campfire.datasource.impl.proto.InviteLinkOpenResponse.RedirectOrBuilder
        public String getHierarchyId() {
            return this.hierarchyId_;
        }

        @Override // com.spotify.campfire.datasource.impl.proto.InviteLinkOpenResponse.RedirectOrBuilder
        public gva getHierarchyIdBytes() {
            return gva.m45888f(this.hierarchyId_);
        }

        @Override // com.spotify.campfire.datasource.impl.proto.InviteLinkOpenResponse.RedirectOrBuilder
        public String getNodePathId() {
            return this.nodePathId_;
        }

        @Override // com.spotify.campfire.datasource.impl.proto.InviteLinkOpenResponse.RedirectOrBuilder
        public gva getNodePathIdBytes() {
            return gva.m45888f(this.nodePathId_);
        }

        @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
        public /* bridge */ /* synthetic */ ore0 newBuilderForType() {
            return newBuilderForType();
        }

        @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
        public /* bridge */ /* synthetic */ ore0 toBuilder() {
            return toBuilder();
        }

        public static Builder newBuilder(Redirect redirect) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(redirect);
        }

        public static Redirect parseDelimitedFrom(InputStream inputStream, aux auxVar) {
            return (Redirect) AbstractC0269h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, auxVar);
        }

        public static Redirect parseFrom(ByteBuffer byteBuffer, aux auxVar) {
            return (Redirect) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, byteBuffer, auxVar);
        }

        public static Redirect parseFrom(gva gvaVar) {
            return (Redirect) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, gvaVar);
        }

        public static Redirect parseFrom(gva gvaVar, aux auxVar) {
            return (Redirect) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, gvaVar, auxVar);
        }

        public static Redirect parseFrom(byte[] bArr) {
            return (Redirect) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static Redirect parseFrom(byte[] bArr, aux auxVar) {
            return (Redirect) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr, auxVar);
        }

        public static Redirect parseFrom(InputStream inputStream) {
            return (Redirect) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Redirect parseFrom(InputStream inputStream, aux auxVar) {
            return (Redirect) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, inputStream, auxVar);
        }

        public static Redirect parseFrom(owe oweVar) {
            return (Redirect) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, oweVar);
        }

        public static Redirect parseFrom(owe oweVar, aux auxVar) {
            return (Redirect) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, oweVar, auxVar);
        }
    }

    public interface RedirectOrBuilder extends sre0 {
        @Override // p204p.sre0
        /* synthetic */ pre0 getDefaultInstanceForType();

        String getHierarchyId();

        gva getHierarchyIdBytes();

        String getNodePathId();

        gva getNodePathIdBytes();

        @Override // p204p.sre0
        /* synthetic */ boolean isInitialized();
    }

    static {
        InviteLinkOpenResponse inviteLinkOpenResponse = new InviteLinkOpenResponse();
        DEFAULT_INSTANCE = inviteLinkOpenResponse;
        AbstractC0269h.registerDefaultInstance(InviteLinkOpenResponse.class, inviteLinkOpenResponse);
    }

    private InviteLinkOpenResponse() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRedirect() {
        this.redirect_ = null;
        this.bitField0_ &= -2;
    }

    public static InviteLinkOpenResponse getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeRedirect(Redirect redirect) {
        redirect.getClass();
        Redirect redirect2 = this.redirect_;
        if (redirect2 == null || redirect2 == Redirect.getDefaultInstance()) {
            this.redirect_ = redirect;
        } else {
            this.redirect_ = (Redirect) ((Redirect.Builder) Redirect.newBuilder(this.redirect_).mergeFrom((AbstractC0269h) redirect)).buildPartial();
        }
        this.bitField0_ |= 1;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static InviteLinkOpenResponse parseDelimitedFrom(InputStream inputStream) {
        return (InviteLinkOpenResponse) AbstractC0269h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static InviteLinkOpenResponse parseFrom(ByteBuffer byteBuffer) {
        return (InviteLinkOpenResponse) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRedirect(Redirect redirect) {
        redirect.getClass();
        this.redirect_ = redirect;
        this.bitField0_ |= 1;
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"bitField0_", "redirect_"});
        }
        if (iOrdinal == 3) {
            return new InviteLinkOpenResponse();
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
        synchronized (InviteLinkOpenResponse.class) {
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

    @Override // com.spotify.campfire.datasource.impl.proto.InviteLinkOpenResponseOrBuilder
    public Redirect getRedirect() {
        Redirect redirect = this.redirect_;
        return redirect == null ? Redirect.getDefaultInstance() : redirect;
    }

    @Override // com.spotify.campfire.datasource.impl.proto.InviteLinkOpenResponseOrBuilder
    public boolean hasRedirect() {
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

    public static Builder newBuilder(InviteLinkOpenResponse inviteLinkOpenResponse) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(inviteLinkOpenResponse);
    }

    public static InviteLinkOpenResponse parseDelimitedFrom(InputStream inputStream, aux auxVar) {
        return (InviteLinkOpenResponse) AbstractC0269h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, auxVar);
    }

    public static InviteLinkOpenResponse parseFrom(ByteBuffer byteBuffer, aux auxVar) {
        return (InviteLinkOpenResponse) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, byteBuffer, auxVar);
    }

    public static InviteLinkOpenResponse parseFrom(gva gvaVar) {
        return (InviteLinkOpenResponse) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, gvaVar);
    }

    public static InviteLinkOpenResponse parseFrom(gva gvaVar, aux auxVar) {
        return (InviteLinkOpenResponse) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, gvaVar, auxVar);
    }

    public static InviteLinkOpenResponse parseFrom(byte[] bArr) {
        return (InviteLinkOpenResponse) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static InviteLinkOpenResponse parseFrom(byte[] bArr, aux auxVar) {
        return (InviteLinkOpenResponse) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr, auxVar);
    }

    public static InviteLinkOpenResponse parseFrom(InputStream inputStream) {
        return (InviteLinkOpenResponse) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static InviteLinkOpenResponse parseFrom(InputStream inputStream, aux auxVar) {
        return (InviteLinkOpenResponse) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, inputStream, auxVar);
    }

    public static InviteLinkOpenResponse parseFrom(owe oweVar) {
        return (InviteLinkOpenResponse) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, oweVar);
    }

    public static InviteLinkOpenResponse parseFrom(owe oweVar, aux auxVar) {
        return (InviteLinkOpenResponse) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, oweVar, auxVar);
    }
}
