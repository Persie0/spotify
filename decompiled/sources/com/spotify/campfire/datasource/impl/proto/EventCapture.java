package com.spotify.campfire.datasource.impl.proto;

import com.google.protobuf.AbstractC0268g;
import com.google.protobuf.AbstractC0269h;
import com.google.protobuf.Timestamp;
import java.io.InputStream;
import java.nio.ByteBuffer;
import p204p.AbstractC2081l8;
import p204p.AbstractC2118m8;
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
public final class EventCapture extends AbstractC0269h implements EventCaptureOrBuilder {
    private static final EventCapture DEFAULT_INSTANCE;
    public static final int EVENT_ID_FIELD_NUMBER = 2;
    public static final int EVENT_TYPE_FIELD_NUMBER = 3;
    public static final int OCCURRED_AT_FIELD_NUMBER = 1;
    private static volatile r2n0 PARSER;
    private int bitField0_;
    private String eventId_ = "";
    private int eventType_;
    private Timestamp occurredAt_;

    /* JADX INFO: renamed from: com.spotify.campfire.datasource.impl.proto.EventCapture$1 */
    public static /* synthetic */ class C03691 {

        /* JADX INFO: renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f3196xa1df5c61;

        static {
            int[] iArr = new int[z110.values().length];
            f3196xa1df5c61 = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f3196xa1df5c61[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f3196xa1df5c61[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f3196xa1df5c61[5] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f3196xa1df5c61[6] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f3196xa1df5c61[0] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f3196xa1df5c61[1] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class Builder extends AbstractC0268g implements EventCaptureOrBuilder {
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

        public Builder clearEventId() {
            copyOnWrite();
            ((EventCapture) this.instance).clearEventId();
            return this;
        }

        public Builder clearEventType() {
            copyOnWrite();
            ((EventCapture) this.instance).clearEventType();
            return this;
        }

        public Builder clearOccurredAt() {
            copyOnWrite();
            ((EventCapture) this.instance).clearOccurredAt();
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

        @Override // com.spotify.campfire.datasource.impl.proto.EventCaptureOrBuilder
        public String getEventId() {
            return ((EventCapture) this.instance).getEventId();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.EventCaptureOrBuilder
        public gva getEventIdBytes() {
            return ((EventCapture) this.instance).getEventIdBytes();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.EventCaptureOrBuilder
        public EventType getEventType() {
            return ((EventCapture) this.instance).getEventType();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.EventCaptureOrBuilder
        public int getEventTypeValue() {
            return ((EventCapture) this.instance).getEventTypeValue();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.EventCaptureOrBuilder
        public Timestamp getOccurredAt() {
            return ((EventCapture) this.instance).getOccurredAt();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.EventCaptureOrBuilder
        public boolean hasOccurredAt() {
            return ((EventCapture) this.instance).hasOccurredAt();
        }

        @Override // com.google.protobuf.AbstractC0268g, p204p.AbstractC2081l8
        public /* bridge */ /* synthetic */ AbstractC2081l8 internalMergeFrom(AbstractC2118m8 abstractC2118m8) {
            return super.internalMergeFrom((AbstractC0269h) abstractC2118m8);
        }

        @Override // com.google.protobuf.AbstractC0268g, p204p.AbstractC2081l8, p204p.ore0
        public /* bridge */ /* synthetic */ AbstractC2081l8 mergeFrom(owe oweVar, aux auxVar) {
            return super.mergeFrom(oweVar, auxVar);
        }

        public Builder mergeOccurredAt(Timestamp timestamp) {
            copyOnWrite();
            ((EventCapture) this.instance).mergeOccurredAt(timestamp);
            return this;
        }

        public Builder setEventId(String str) {
            copyOnWrite();
            ((EventCapture) this.instance).setEventId(str);
            return this;
        }

        public Builder setEventIdBytes(gva gvaVar) {
            copyOnWrite();
            ((EventCapture) this.instance).setEventIdBytes(gvaVar);
            return this;
        }

        public Builder setEventType(EventType eventType) {
            copyOnWrite();
            ((EventCapture) this.instance).setEventType(eventType);
            return this;
        }

        public Builder setEventTypeValue(int i) {
            copyOnWrite();
            ((EventCapture) this.instance).setEventTypeValue(i);
            return this;
        }

        public Builder setOccurredAt(Timestamp timestamp) {
            copyOnWrite();
            ((EventCapture) this.instance).setOccurredAt(timestamp);
            return this;
        }

        private Builder() {
            super(EventCapture.DEFAULT_INSTANCE);
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

        public Builder setOccurredAt(lu71 lu71Var) {
            copyOnWrite();
            ((EventCapture) this.instance).setOccurredAt((Timestamp) lu71Var.build());
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
        EventCapture eventCapture = new EventCapture();
        DEFAULT_INSTANCE = eventCapture;
        AbstractC0269h.registerDefaultInstance(EventCapture.class, eventCapture);
    }

    private EventCapture() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEventId() {
        this.eventId_ = getDefaultInstance().getEventId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEventType() {
        this.eventType_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearOccurredAt() {
        this.occurredAt_ = null;
        this.bitField0_ &= -2;
    }

    public static EventCapture getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeOccurredAt(Timestamp timestamp) {
        timestamp.getClass();
        Timestamp timestamp2 = this.occurredAt_;
        if (timestamp2 == null || timestamp2 == Timestamp.m1965q()) {
            this.occurredAt_ = timestamp;
        } else {
            this.occurredAt_ = (Timestamp) ((lu71) Timestamp.m1967u(this.occurredAt_).mergeFrom((AbstractC0269h) timestamp)).buildPartial();
        }
        this.bitField0_ |= 1;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static EventCapture parseDelimitedFrom(InputStream inputStream) {
        return (EventCapture) AbstractC0269h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static EventCapture parseFrom(ByteBuffer byteBuffer) {
        return (EventCapture) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEventId(String str) {
        str.getClass();
        this.eventId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEventIdBytes(gva gvaVar) {
        AbstractC2118m8.checkByteStringIsUtf8(gvaVar);
        this.eventId_ = gvaVar.m45892u();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEventType(EventType eventType) {
        this.eventType_ = eventType.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEventTypeValue(int i) {
        this.eventType_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOccurredAt(Timestamp timestamp) {
        timestamp.getClass();
        this.occurredAt_ = timestamp;
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002Ȉ\u0003\f", new Object[]{"bitField0_", "occurredAt_", "eventId_", "eventType_"});
        }
        if (iOrdinal == 3) {
            return new EventCapture();
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
        synchronized (EventCapture.class) {
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

    @Override // com.spotify.campfire.datasource.impl.proto.EventCaptureOrBuilder
    public String getEventId() {
        return this.eventId_;
    }

    @Override // com.spotify.campfire.datasource.impl.proto.EventCaptureOrBuilder
    public gva getEventIdBytes() {
        return gva.m45888f(this.eventId_);
    }

    @Override // com.spotify.campfire.datasource.impl.proto.EventCaptureOrBuilder
    public EventType getEventType() {
        EventType eventTypeForNumber = EventType.forNumber(this.eventType_);
        return eventTypeForNumber == null ? EventType.UNRECOGNIZED : eventTypeForNumber;
    }

    @Override // com.spotify.campfire.datasource.impl.proto.EventCaptureOrBuilder
    public int getEventTypeValue() {
        return this.eventType_;
    }

    @Override // com.spotify.campfire.datasource.impl.proto.EventCaptureOrBuilder
    public Timestamp getOccurredAt() {
        Timestamp timestamp = this.occurredAt_;
        return timestamp == null ? Timestamp.m1965q() : timestamp;
    }

    @Override // com.spotify.campfire.datasource.impl.proto.EventCaptureOrBuilder
    public boolean hasOccurredAt() {
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

    public static Builder newBuilder(EventCapture eventCapture) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(eventCapture);
    }

    public static EventCapture parseDelimitedFrom(InputStream inputStream, aux auxVar) {
        return (EventCapture) AbstractC0269h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, auxVar);
    }

    public static EventCapture parseFrom(ByteBuffer byteBuffer, aux auxVar) {
        return (EventCapture) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, byteBuffer, auxVar);
    }

    public static EventCapture parseFrom(gva gvaVar) {
        return (EventCapture) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, gvaVar);
    }

    public static EventCapture parseFrom(gva gvaVar, aux auxVar) {
        return (EventCapture) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, gvaVar, auxVar);
    }

    public static EventCapture parseFrom(byte[] bArr) {
        return (EventCapture) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static EventCapture parseFrom(byte[] bArr, aux auxVar) {
        return (EventCapture) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr, auxVar);
    }

    public static EventCapture parseFrom(InputStream inputStream) {
        return (EventCapture) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static EventCapture parseFrom(InputStream inputStream, aux auxVar) {
        return (EventCapture) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, inputStream, auxVar);
    }

    public static EventCapture parseFrom(owe oweVar) {
        return (EventCapture) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, oweVar);
    }

    public static EventCapture parseFrom(owe oweVar, aux auxVar) {
        return (EventCapture) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, oweVar, auxVar);
    }
}
