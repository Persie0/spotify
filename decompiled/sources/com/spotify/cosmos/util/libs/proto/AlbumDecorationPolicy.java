package com.spotify.cosmos.util.libs.proto;

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
public final class AlbumDecorationPolicy extends AbstractC0269h implements AlbumDecorationPolicyOrBuilder {
    public static final int COPYRIGHTS_FIELD_NUMBER = 3;
    public static final int COVERS_FIELD_NUMBER = 4;
    private static final AlbumDecorationPolicy DEFAULT_INSTANCE;
    public static final int IS_PREMIUM_ONLY_FIELD_NUMBER = 9;
    public static final int LINK_FIELD_NUMBER = 1;
    public static final int NAME_FIELD_NUMBER = 2;
    public static final int NUM_DISCS_FIELD_NUMBER = 6;
    public static final int NUM_TRACKS_FIELD_NUMBER = 7;
    private static volatile r2n0 PARSER = null;
    public static final int PLAYABILITY_FIELD_NUMBER = 8;
    public static final int YEAR_FIELD_NUMBER = 5;
    private boolean copyrights_;
    private boolean covers_;
    private boolean isPremiumOnly_;
    private boolean link_;
    private boolean name_;
    private boolean numDiscs_;
    private boolean numTracks_;
    private boolean playability_;
    private boolean year_;

    /* JADX INFO: renamed from: com.spotify.cosmos.util.libs.proto.AlbumDecorationPolicy$1 */
    public static /* synthetic */ class C06211 {

        /* JADX INFO: renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f3476xa1df5c61;

        static {
            int[] iArr = new int[z110.values().length];
            f3476xa1df5c61 = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f3476xa1df5c61[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f3476xa1df5c61[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f3476xa1df5c61[5] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f3476xa1df5c61[6] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f3476xa1df5c61[0] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f3476xa1df5c61[1] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class Builder extends AbstractC0268g implements AlbumDecorationPolicyOrBuilder {
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

        public Builder clearCopyrights() {
            copyOnWrite();
            ((AlbumDecorationPolicy) this.instance).clearCopyrights();
            return this;
        }

        public Builder clearCovers() {
            copyOnWrite();
            ((AlbumDecorationPolicy) this.instance).clearCovers();
            return this;
        }

        public Builder clearIsPremiumOnly() {
            copyOnWrite();
            ((AlbumDecorationPolicy) this.instance).clearIsPremiumOnly();
            return this;
        }

        public Builder clearLink() {
            copyOnWrite();
            ((AlbumDecorationPolicy) this.instance).clearLink();
            return this;
        }

        public Builder clearName() {
            copyOnWrite();
            ((AlbumDecorationPolicy) this.instance).clearName();
            return this;
        }

        public Builder clearNumDiscs() {
            copyOnWrite();
            ((AlbumDecorationPolicy) this.instance).clearNumDiscs();
            return this;
        }

        public Builder clearNumTracks() {
            copyOnWrite();
            ((AlbumDecorationPolicy) this.instance).clearNumTracks();
            return this;
        }

        public Builder clearPlayability() {
            copyOnWrite();
            ((AlbumDecorationPolicy) this.instance).clearPlayability();
            return this;
        }

        public Builder clearYear() {
            copyOnWrite();
            ((AlbumDecorationPolicy) this.instance).clearYear();
            return this;
        }

        @Override // com.google.protobuf.AbstractC0268g
        /* JADX INFO: renamed from: clone */
        public /* bridge */ /* synthetic */ Object mo98328clone() {
            return super.mo98326clone();
        }

        @Override // com.spotify.cosmos.util.libs.proto.AlbumDecorationPolicyOrBuilder
        public boolean getCopyrights() {
            return ((AlbumDecorationPolicy) this.instance).getCopyrights();
        }

        @Override // com.spotify.cosmos.util.libs.proto.AlbumDecorationPolicyOrBuilder
        public boolean getCovers() {
            return ((AlbumDecorationPolicy) this.instance).getCovers();
        }

        @Override // com.google.protobuf.AbstractC0268g, p204p.sre0
        public /* bridge */ /* synthetic */ pre0 getDefaultInstanceForType() {
            return super.getDefaultInstanceForType();
        }

        @Override // com.spotify.cosmos.util.libs.proto.AlbumDecorationPolicyOrBuilder
        public boolean getIsPremiumOnly() {
            return ((AlbumDecorationPolicy) this.instance).getIsPremiumOnly();
        }

        @Override // com.spotify.cosmos.util.libs.proto.AlbumDecorationPolicyOrBuilder
        public boolean getLink() {
            return ((AlbumDecorationPolicy) this.instance).getLink();
        }

        @Override // com.spotify.cosmos.util.libs.proto.AlbumDecorationPolicyOrBuilder
        public boolean getName() {
            return ((AlbumDecorationPolicy) this.instance).getName();
        }

        @Override // com.spotify.cosmos.util.libs.proto.AlbumDecorationPolicyOrBuilder
        public boolean getNumDiscs() {
            return ((AlbumDecorationPolicy) this.instance).getNumDiscs();
        }

        @Override // com.spotify.cosmos.util.libs.proto.AlbumDecorationPolicyOrBuilder
        public boolean getNumTracks() {
            return ((AlbumDecorationPolicy) this.instance).getNumTracks();
        }

        @Override // com.spotify.cosmos.util.libs.proto.AlbumDecorationPolicyOrBuilder
        public boolean getPlayability() {
            return ((AlbumDecorationPolicy) this.instance).getPlayability();
        }

        @Override // com.spotify.cosmos.util.libs.proto.AlbumDecorationPolicyOrBuilder
        public boolean getYear() {
            return ((AlbumDecorationPolicy) this.instance).getYear();
        }

        @Override // com.google.protobuf.AbstractC0268g, p204p.AbstractC2081l8
        public /* bridge */ /* synthetic */ AbstractC2081l8 internalMergeFrom(AbstractC2118m8 abstractC2118m8) {
            return super.internalMergeFrom((AbstractC0269h) abstractC2118m8);
        }

        @Override // com.google.protobuf.AbstractC0268g, p204p.AbstractC2081l8, p204p.ore0
        public /* bridge */ /* synthetic */ AbstractC2081l8 mergeFrom(owe oweVar, aux auxVar) {
            return super.mergeFrom(oweVar, auxVar);
        }

        public Builder setCopyrights(boolean z) {
            copyOnWrite();
            ((AlbumDecorationPolicy) this.instance).setCopyrights(z);
            return this;
        }

        public Builder setCovers(boolean z) {
            copyOnWrite();
            ((AlbumDecorationPolicy) this.instance).setCovers(z);
            return this;
        }

        public Builder setIsPremiumOnly(boolean z) {
            copyOnWrite();
            ((AlbumDecorationPolicy) this.instance).setIsPremiumOnly(z);
            return this;
        }

        public Builder setLink(boolean z) {
            copyOnWrite();
            ((AlbumDecorationPolicy) this.instance).setLink(z);
            return this;
        }

        public Builder setName(boolean z) {
            copyOnWrite();
            ((AlbumDecorationPolicy) this.instance).setName(z);
            return this;
        }

        public Builder setNumDiscs(boolean z) {
            copyOnWrite();
            ((AlbumDecorationPolicy) this.instance).setNumDiscs(z);
            return this;
        }

        public Builder setNumTracks(boolean z) {
            copyOnWrite();
            ((AlbumDecorationPolicy) this.instance).setNumTracks(z);
            return this;
        }

        public Builder setPlayability(boolean z) {
            copyOnWrite();
            ((AlbumDecorationPolicy) this.instance).setPlayability(z);
            return this;
        }

        public Builder setYear(boolean z) {
            copyOnWrite();
            ((AlbumDecorationPolicy) this.instance).setYear(z);
            return this;
        }

        private Builder() {
            super(AlbumDecorationPolicy.DEFAULT_INSTANCE);
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
        AlbumDecorationPolicy albumDecorationPolicy = new AlbumDecorationPolicy();
        DEFAULT_INSTANCE = albumDecorationPolicy;
        AbstractC0269h.registerDefaultInstance(AlbumDecorationPolicy.class, albumDecorationPolicy);
    }

    private AlbumDecorationPolicy() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCopyrights() {
        this.copyrights_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCovers() {
        this.covers_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIsPremiumOnly() {
        this.isPremiumOnly_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLink() {
        this.link_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearName() {
        this.name_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearNumDiscs() {
        this.numDiscs_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearNumTracks() {
        this.numTracks_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPlayability() {
        this.playability_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearYear() {
        this.year_ = false;
    }

    public static AlbumDecorationPolicy getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static AlbumDecorationPolicy parseDelimitedFrom(InputStream inputStream) {
        return (AlbumDecorationPolicy) AbstractC0269h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static AlbumDecorationPolicy parseFrom(ByteBuffer byteBuffer) {
        return (AlbumDecorationPolicy) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCopyrights(boolean z) {
        this.copyrights_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCovers(boolean z) {
        this.covers_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIsPremiumOnly(boolean z) {
        this.isPremiumOnly_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLink(boolean z) {
        this.link_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setName(boolean z) {
        this.name_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNumDiscs(boolean z) {
        this.numDiscs_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNumTracks(boolean z) {
        this.numTracks_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPlayability(boolean z) {
        this.playability_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setYear(boolean z) {
        this.year_ = z;
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\t\u0000\u0000\u0001\t\t\u0000\u0000\u0000\u0001\u0007\u0002\u0007\u0003\u0007\u0004\u0007\u0005\u0007\u0006\u0007\u0007\u0007\b\u0007\t\u0007", new Object[]{"link_", "name_", "copyrights_", "covers_", "year_", "numDiscs_", "numTracks_", "playability_", "isPremiumOnly_"});
        }
        if (iOrdinal == 3) {
            return new AlbumDecorationPolicy();
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
        synchronized (AlbumDecorationPolicy.class) {
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

    @Override // com.spotify.cosmos.util.libs.proto.AlbumDecorationPolicyOrBuilder
    public boolean getCopyrights() {
        return this.copyrights_;
    }

    @Override // com.spotify.cosmos.util.libs.proto.AlbumDecorationPolicyOrBuilder
    public boolean getCovers() {
        return this.covers_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.sre0
    public /* bridge */ /* synthetic */ pre0 getDefaultInstanceForType() {
        return getDefaultInstanceForType();
    }

    @Override // com.spotify.cosmos.util.libs.proto.AlbumDecorationPolicyOrBuilder
    public boolean getIsPremiumOnly() {
        return this.isPremiumOnly_;
    }

    @Override // com.spotify.cosmos.util.libs.proto.AlbumDecorationPolicyOrBuilder
    public boolean getLink() {
        return this.link_;
    }

    @Override // com.spotify.cosmos.util.libs.proto.AlbumDecorationPolicyOrBuilder
    public boolean getName() {
        return this.name_;
    }

    @Override // com.spotify.cosmos.util.libs.proto.AlbumDecorationPolicyOrBuilder
    public boolean getNumDiscs() {
        return this.numDiscs_;
    }

    @Override // com.spotify.cosmos.util.libs.proto.AlbumDecorationPolicyOrBuilder
    public boolean getNumTracks() {
        return this.numTracks_;
    }

    @Override // com.spotify.cosmos.util.libs.proto.AlbumDecorationPolicyOrBuilder
    public boolean getPlayability() {
        return this.playability_;
    }

    @Override // com.spotify.cosmos.util.libs.proto.AlbumDecorationPolicyOrBuilder
    public boolean getYear() {
        return this.year_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }

    public static Builder newBuilder(AlbumDecorationPolicy albumDecorationPolicy) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(albumDecorationPolicy);
    }

    public static AlbumDecorationPolicy parseDelimitedFrom(InputStream inputStream, aux auxVar) {
        return (AlbumDecorationPolicy) AbstractC0269h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, auxVar);
    }

    public static AlbumDecorationPolicy parseFrom(ByteBuffer byteBuffer, aux auxVar) {
        return (AlbumDecorationPolicy) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, byteBuffer, auxVar);
    }

    public static AlbumDecorationPolicy parseFrom(gva gvaVar) {
        return (AlbumDecorationPolicy) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, gvaVar);
    }

    public static AlbumDecorationPolicy parseFrom(gva gvaVar, aux auxVar) {
        return (AlbumDecorationPolicy) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, gvaVar, auxVar);
    }

    public static AlbumDecorationPolicy parseFrom(byte[] bArr) {
        return (AlbumDecorationPolicy) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static AlbumDecorationPolicy parseFrom(byte[] bArr, aux auxVar) {
        return (AlbumDecorationPolicy) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr, auxVar);
    }

    public static AlbumDecorationPolicy parseFrom(InputStream inputStream) {
        return (AlbumDecorationPolicy) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static AlbumDecorationPolicy parseFrom(InputStream inputStream, aux auxVar) {
        return (AlbumDecorationPolicy) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, inputStream, auxVar);
    }

    public static AlbumDecorationPolicy parseFrom(owe oweVar) {
        return (AlbumDecorationPolicy) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, oweVar);
    }

    public static AlbumDecorationPolicy parseFrom(owe oweVar, aux auxVar) {
        return (AlbumDecorationPolicy) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, oweVar, auxVar);
    }
}
