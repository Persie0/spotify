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
public final class ChatInvite extends AbstractC0269h implements ChatInviteOrBuilder {
    private static final ChatInvite DEFAULT_INSTANCE;
    public static final int DESTINATION_FIELD_NUMBER = 3;
    public static final int INVITING_USER_ID_FIELD_NUMBER = 4;
    private static volatile r2n0 PARSER = null;
    public static final int SHARE_ID_FIELD_NUMBER = 2;
    public static final int URI_FIELD_NUMBER = 1;
    private String shareId_ = "";
    private String uri_ = "";
    private String destination_ = "";
    private String invitingUserId_ = "";

    /* JADX INFO: renamed from: com.spotify.campfire.datasource.impl.proto.ChatInvite$1 */
    public static /* synthetic */ class C03401 {

        /* JADX INFO: renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f3168xa1df5c61;

        static {
            int[] iArr = new int[z110.values().length];
            f3168xa1df5c61 = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f3168xa1df5c61[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f3168xa1df5c61[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f3168xa1df5c61[5] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f3168xa1df5c61[6] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f3168xa1df5c61[0] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f3168xa1df5c61[1] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class Builder extends AbstractC0268g implements ChatInviteOrBuilder {
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

        public Builder clearDestination() {
            copyOnWrite();
            ((ChatInvite) this.instance).clearDestination();
            return this;
        }

        public Builder clearInvitingUserId() {
            copyOnWrite();
            ((ChatInvite) this.instance).clearInvitingUserId();
            return this;
        }

        public Builder clearShareId() {
            copyOnWrite();
            ((ChatInvite) this.instance).clearShareId();
            return this;
        }

        public Builder clearUri() {
            copyOnWrite();
            ((ChatInvite) this.instance).clearUri();
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

        @Override // com.spotify.campfire.datasource.impl.proto.ChatInviteOrBuilder
        public String getDestination() {
            return ((ChatInvite) this.instance).getDestination();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.ChatInviteOrBuilder
        public gva getDestinationBytes() {
            return ((ChatInvite) this.instance).getDestinationBytes();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.ChatInviteOrBuilder
        public String getInvitingUserId() {
            return ((ChatInvite) this.instance).getInvitingUserId();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.ChatInviteOrBuilder
        public gva getInvitingUserIdBytes() {
            return ((ChatInvite) this.instance).getInvitingUserIdBytes();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.ChatInviteOrBuilder
        public String getShareId() {
            return ((ChatInvite) this.instance).getShareId();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.ChatInviteOrBuilder
        public gva getShareIdBytes() {
            return ((ChatInvite) this.instance).getShareIdBytes();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.ChatInviteOrBuilder
        public String getUri() {
            return ((ChatInvite) this.instance).getUri();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.ChatInviteOrBuilder
        public gva getUriBytes() {
            return ((ChatInvite) this.instance).getUriBytes();
        }

        @Override // com.google.protobuf.AbstractC0268g, p204p.AbstractC2081l8
        public /* bridge */ /* synthetic */ AbstractC2081l8 internalMergeFrom(AbstractC2118m8 abstractC2118m8) {
            return super.internalMergeFrom((AbstractC0269h) abstractC2118m8);
        }

        @Override // com.google.protobuf.AbstractC0268g, p204p.AbstractC2081l8, p204p.ore0
        public /* bridge */ /* synthetic */ AbstractC2081l8 mergeFrom(owe oweVar, aux auxVar) {
            return super.mergeFrom(oweVar, auxVar);
        }

        public Builder setDestination(String str) {
            copyOnWrite();
            ((ChatInvite) this.instance).setDestination(str);
            return this;
        }

        public Builder setDestinationBytes(gva gvaVar) {
            copyOnWrite();
            ((ChatInvite) this.instance).setDestinationBytes(gvaVar);
            return this;
        }

        public Builder setInvitingUserId(String str) {
            copyOnWrite();
            ((ChatInvite) this.instance).setInvitingUserId(str);
            return this;
        }

        public Builder setInvitingUserIdBytes(gva gvaVar) {
            copyOnWrite();
            ((ChatInvite) this.instance).setInvitingUserIdBytes(gvaVar);
            return this;
        }

        public Builder setShareId(String str) {
            copyOnWrite();
            ((ChatInvite) this.instance).setShareId(str);
            return this;
        }

        public Builder setShareIdBytes(gva gvaVar) {
            copyOnWrite();
            ((ChatInvite) this.instance).setShareIdBytes(gvaVar);
            return this;
        }

        public Builder setUri(String str) {
            copyOnWrite();
            ((ChatInvite) this.instance).setUri(str);
            return this;
        }

        public Builder setUriBytes(gva gvaVar) {
            copyOnWrite();
            ((ChatInvite) this.instance).setUriBytes(gvaVar);
            return this;
        }

        private Builder() {
            super(ChatInvite.DEFAULT_INSTANCE);
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
        ChatInvite chatInvite = new ChatInvite();
        DEFAULT_INSTANCE = chatInvite;
        AbstractC0269h.registerDefaultInstance(ChatInvite.class, chatInvite);
    }

    private ChatInvite() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDestination() {
        this.destination_ = getDefaultInstance().getDestination();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearInvitingUserId() {
        this.invitingUserId_ = getDefaultInstance().getInvitingUserId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearShareId() {
        this.shareId_ = getDefaultInstance().getShareId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUri() {
        this.uri_ = getDefaultInstance().getUri();
    }

    public static ChatInvite getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static ChatInvite parseDelimitedFrom(InputStream inputStream) {
        return (ChatInvite) AbstractC0269h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ChatInvite parseFrom(ByteBuffer byteBuffer) {
        return (ChatInvite) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDestination(String str) {
        str.getClass();
        this.destination_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDestinationBytes(gva gvaVar) {
        AbstractC2118m8.checkByteStringIsUtf8(gvaVar);
        this.destination_ = gvaVar.m45892u();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setInvitingUserId(String str) {
        str.getClass();
        this.invitingUserId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setInvitingUserIdBytes(gva gvaVar) {
        AbstractC2118m8.checkByteStringIsUtf8(gvaVar);
        this.invitingUserId_ = gvaVar.m45892u();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setShareId(String str) {
        str.getClass();
        this.shareId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setShareIdBytes(gva gvaVar) {
        AbstractC2118m8.checkByteStringIsUtf8(gvaVar);
        this.shareId_ = gvaVar.m45892u();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUri(String str) {
        str.getClass();
        this.uri_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUriBytes(gva gvaVar) {
        AbstractC2118m8.checkByteStringIsUtf8(gvaVar);
        this.uri_ = gvaVar.m45892u();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004Ȉ", new Object[]{"uri_", "shareId_", "destination_", "invitingUserId_"});
        }
        if (iOrdinal == 3) {
            return new ChatInvite();
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
        synchronized (ChatInvite.class) {
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

    @Override // com.spotify.campfire.datasource.impl.proto.ChatInviteOrBuilder
    public String getDestination() {
        return this.destination_;
    }

    @Override // com.spotify.campfire.datasource.impl.proto.ChatInviteOrBuilder
    public gva getDestinationBytes() {
        return gva.m45888f(this.destination_);
    }

    @Override // com.spotify.campfire.datasource.impl.proto.ChatInviteOrBuilder
    public String getInvitingUserId() {
        return this.invitingUserId_;
    }

    @Override // com.spotify.campfire.datasource.impl.proto.ChatInviteOrBuilder
    public gva getInvitingUserIdBytes() {
        return gva.m45888f(this.invitingUserId_);
    }

    @Override // com.spotify.campfire.datasource.impl.proto.ChatInviteOrBuilder
    public String getShareId() {
        return this.shareId_;
    }

    @Override // com.spotify.campfire.datasource.impl.proto.ChatInviteOrBuilder
    public gva getShareIdBytes() {
        return gva.m45888f(this.shareId_);
    }

    @Override // com.spotify.campfire.datasource.impl.proto.ChatInviteOrBuilder
    public String getUri() {
        return this.uri_;
    }

    @Override // com.spotify.campfire.datasource.impl.proto.ChatInviteOrBuilder
    public gva getUriBytes() {
        return gva.m45888f(this.uri_);
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }

    public static Builder newBuilder(ChatInvite chatInvite) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(chatInvite);
    }

    public static ChatInvite parseDelimitedFrom(InputStream inputStream, aux auxVar) {
        return (ChatInvite) AbstractC0269h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, auxVar);
    }

    public static ChatInvite parseFrom(ByteBuffer byteBuffer, aux auxVar) {
        return (ChatInvite) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, byteBuffer, auxVar);
    }

    public static ChatInvite parseFrom(gva gvaVar) {
        return (ChatInvite) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, gvaVar);
    }

    public static ChatInvite parseFrom(gva gvaVar, aux auxVar) {
        return (ChatInvite) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, gvaVar, auxVar);
    }

    public static ChatInvite parseFrom(byte[] bArr) {
        return (ChatInvite) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ChatInvite parseFrom(byte[] bArr, aux auxVar) {
        return (ChatInvite) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr, auxVar);
    }

    public static ChatInvite parseFrom(InputStream inputStream) {
        return (ChatInvite) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ChatInvite parseFrom(InputStream inputStream, aux auxVar) {
        return (ChatInvite) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, inputStream, auxVar);
    }

    public static ChatInvite parseFrom(owe oweVar) {
        return (ChatInvite) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, oweVar);
    }

    public static ChatInvite parseFrom(owe oweVar, aux auxVar) {
        return (ChatInvite) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, oweVar, auxVar);
    }
}
