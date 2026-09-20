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
public final class ClientEventCapture extends AbstractC0269h implements ClientEventCaptureOrBuilder {
    public static final int AGENT_CONTEXT_FIELD_NUMBER = 3;
    private static final ClientEventCapture DEFAULT_INSTANCE;
    public static final int EVENT_CAPTURE_FIELD_NUMBER = 2;
    public static final int INIT_USERNAME_FIELD_NUMBER = 1;
    private static volatile r2n0 PARSER;
    private AgentContext agentContext_;
    private int bitField0_;
    private EventCapture eventCapture_;
    private String initUsername_ = "";

    /* JADX INFO: renamed from: com.spotify.campfire.datasource.impl.proto.ClientEventCapture$1 */
    public static /* synthetic */ class C03431 {

        /* JADX INFO: renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f3171xa1df5c61;

        static {
            int[] iArr = new int[z110.values().length];
            f3171xa1df5c61 = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f3171xa1df5c61[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f3171xa1df5c61[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f3171xa1df5c61[5] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f3171xa1df5c61[6] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f3171xa1df5c61[0] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f3171xa1df5c61[1] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class Builder extends AbstractC0268g implements ClientEventCaptureOrBuilder {
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

        public Builder clearAgentContext() {
            copyOnWrite();
            ((ClientEventCapture) this.instance).clearAgentContext();
            return this;
        }

        public Builder clearEventCapture() {
            copyOnWrite();
            ((ClientEventCapture) this.instance).clearEventCapture();
            return this;
        }

        public Builder clearInitUsername() {
            copyOnWrite();
            ((ClientEventCapture) this.instance).clearInitUsername();
            return this;
        }

        @Override // com.google.protobuf.AbstractC0268g
        /* JADX INFO: renamed from: clone */
        public /* bridge */ /* synthetic */ Object mo98328clone() {
            return super.mo98326clone();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.ClientEventCaptureOrBuilder
        public AgentContext getAgentContext() {
            return ((ClientEventCapture) this.instance).getAgentContext();
        }

        @Override // com.google.protobuf.AbstractC0268g, p204p.sre0
        public /* bridge */ /* synthetic */ pre0 getDefaultInstanceForType() {
            return super.getDefaultInstanceForType();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.ClientEventCaptureOrBuilder
        public EventCapture getEventCapture() {
            return ((ClientEventCapture) this.instance).getEventCapture();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.ClientEventCaptureOrBuilder
        public String getInitUsername() {
            return ((ClientEventCapture) this.instance).getInitUsername();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.ClientEventCaptureOrBuilder
        public gva getInitUsernameBytes() {
            return ((ClientEventCapture) this.instance).getInitUsernameBytes();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.ClientEventCaptureOrBuilder
        public boolean hasAgentContext() {
            return ((ClientEventCapture) this.instance).hasAgentContext();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.ClientEventCaptureOrBuilder
        public boolean hasEventCapture() {
            return ((ClientEventCapture) this.instance).hasEventCapture();
        }

        @Override // com.google.protobuf.AbstractC0268g, p204p.AbstractC2081l8
        public /* bridge */ /* synthetic */ AbstractC2081l8 internalMergeFrom(AbstractC2118m8 abstractC2118m8) {
            return super.internalMergeFrom((AbstractC0269h) abstractC2118m8);
        }

        public Builder mergeAgentContext(AgentContext agentContext) {
            copyOnWrite();
            ((ClientEventCapture) this.instance).mergeAgentContext(agentContext);
            return this;
        }

        public Builder mergeEventCapture(EventCapture eventCapture) {
            copyOnWrite();
            ((ClientEventCapture) this.instance).mergeEventCapture(eventCapture);
            return this;
        }

        @Override // com.google.protobuf.AbstractC0268g, p204p.AbstractC2081l8, p204p.ore0
        public /* bridge */ /* synthetic */ AbstractC2081l8 mergeFrom(owe oweVar, aux auxVar) {
            return super.mergeFrom(oweVar, auxVar);
        }

        public Builder setAgentContext(AgentContext agentContext) {
            copyOnWrite();
            ((ClientEventCapture) this.instance).setAgentContext(agentContext);
            return this;
        }

        public Builder setEventCapture(EventCapture eventCapture) {
            copyOnWrite();
            ((ClientEventCapture) this.instance).setEventCapture(eventCapture);
            return this;
        }

        public Builder setInitUsername(String str) {
            copyOnWrite();
            ((ClientEventCapture) this.instance).setInitUsername(str);
            return this;
        }

        public Builder setInitUsernameBytes(gva gvaVar) {
            copyOnWrite();
            ((ClientEventCapture) this.instance).setInitUsernameBytes(gvaVar);
            return this;
        }

        private Builder() {
            super(ClientEventCapture.DEFAULT_INSTANCE);
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

        public Builder setAgentContext(AgentContext.Builder builder) {
            copyOnWrite();
            ((ClientEventCapture) this.instance).setAgentContext((AgentContext) builder.build());
            return this;
        }

        public Builder setEventCapture(EventCapture.Builder builder) {
            copyOnWrite();
            ((ClientEventCapture) this.instance).setEventCapture((EventCapture) builder.build());
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

    static {
        ClientEventCapture clientEventCapture = new ClientEventCapture();
        DEFAULT_INSTANCE = clientEventCapture;
        AbstractC0269h.registerDefaultInstance(ClientEventCapture.class, clientEventCapture);
    }

    private ClientEventCapture() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAgentContext() {
        this.agentContext_ = null;
        this.bitField0_ &= -3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEventCapture() {
        this.eventCapture_ = null;
        this.bitField0_ &= -2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearInitUsername() {
        this.initUsername_ = getDefaultInstance().getInitUsername();
    }

    public static ClientEventCapture getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeAgentContext(AgentContext agentContext) {
        agentContext.getClass();
        AgentContext agentContext2 = this.agentContext_;
        if (agentContext2 == null || agentContext2 == AgentContext.getDefaultInstance()) {
            this.agentContext_ = agentContext;
        } else {
            this.agentContext_ = (AgentContext) ((AgentContext.Builder) AgentContext.newBuilder(this.agentContext_).mergeFrom((AbstractC0269h) agentContext)).buildPartial();
        }
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeEventCapture(EventCapture eventCapture) {
        eventCapture.getClass();
        EventCapture eventCapture2 = this.eventCapture_;
        if (eventCapture2 == null || eventCapture2 == EventCapture.getDefaultInstance()) {
            this.eventCapture_ = eventCapture;
        } else {
            this.eventCapture_ = (EventCapture) ((EventCapture.Builder) EventCapture.newBuilder(this.eventCapture_).mergeFrom((AbstractC0269h) eventCapture)).buildPartial();
        }
        this.bitField0_ |= 1;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static ClientEventCapture parseDelimitedFrom(InputStream inputStream) {
        return (ClientEventCapture) AbstractC0269h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ClientEventCapture parseFrom(ByteBuffer byteBuffer) {
        return (ClientEventCapture) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAgentContext(AgentContext agentContext) {
        agentContext.getClass();
        this.agentContext_ = agentContext;
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEventCapture(EventCapture eventCapture) {
        eventCapture.getClass();
        this.eventCapture_ = eventCapture;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setInitUsername(String str) {
        str.getClass();
        this.initUsername_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setInitUsernameBytes(gva gvaVar) {
        AbstractC2118m8.checkByteStringIsUtf8(gvaVar);
        this.initUsername_ = gvaVar.m45892u();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002ဉ\u0000\u0003ဉ\u0001", new Object[]{"bitField0_", "initUsername_", "eventCapture_", "agentContext_"});
        }
        if (iOrdinal == 3) {
            return new ClientEventCapture();
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
        synchronized (ClientEventCapture.class) {
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

    @Override // com.spotify.campfire.datasource.impl.proto.ClientEventCaptureOrBuilder
    public AgentContext getAgentContext() {
        AgentContext agentContext = this.agentContext_;
        return agentContext == null ? AgentContext.getDefaultInstance() : agentContext;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.sre0
    public /* bridge */ /* synthetic */ pre0 getDefaultInstanceForType() {
        return getDefaultInstanceForType();
    }

    @Override // com.spotify.campfire.datasource.impl.proto.ClientEventCaptureOrBuilder
    public EventCapture getEventCapture() {
        EventCapture eventCapture = this.eventCapture_;
        return eventCapture == null ? EventCapture.getDefaultInstance() : eventCapture;
    }

    @Override // com.spotify.campfire.datasource.impl.proto.ClientEventCaptureOrBuilder
    public String getInitUsername() {
        return this.initUsername_;
    }

    @Override // com.spotify.campfire.datasource.impl.proto.ClientEventCaptureOrBuilder
    public gva getInitUsernameBytes() {
        return gva.m45888f(this.initUsername_);
    }

    @Override // com.spotify.campfire.datasource.impl.proto.ClientEventCaptureOrBuilder
    public boolean hasAgentContext() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override // com.spotify.campfire.datasource.impl.proto.ClientEventCaptureOrBuilder
    public boolean hasEventCapture() {
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

    public static Builder newBuilder(ClientEventCapture clientEventCapture) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(clientEventCapture);
    }

    public static ClientEventCapture parseDelimitedFrom(InputStream inputStream, aux auxVar) {
        return (ClientEventCapture) AbstractC0269h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, auxVar);
    }

    public static ClientEventCapture parseFrom(ByteBuffer byteBuffer, aux auxVar) {
        return (ClientEventCapture) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, byteBuffer, auxVar);
    }

    public static ClientEventCapture parseFrom(gva gvaVar) {
        return (ClientEventCapture) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, gvaVar);
    }

    public static ClientEventCapture parseFrom(gva gvaVar, aux auxVar) {
        return (ClientEventCapture) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, gvaVar, auxVar);
    }

    public static ClientEventCapture parseFrom(byte[] bArr) {
        return (ClientEventCapture) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ClientEventCapture parseFrom(byte[] bArr, aux auxVar) {
        return (ClientEventCapture) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr, auxVar);
    }

    public static ClientEventCapture parseFrom(InputStream inputStream) {
        return (ClientEventCapture) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ClientEventCapture parseFrom(InputStream inputStream, aux auxVar) {
        return (ClientEventCapture) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, inputStream, auxVar);
    }

    public static ClientEventCapture parseFrom(owe oweVar) {
        return (ClientEventCapture) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, oweVar);
    }

    public static ClientEventCapture parseFrom(owe oweVar, aux auxVar) {
        return (ClientEventCapture) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, oweVar, auxVar);
    }
}
