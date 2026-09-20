package com.spotify.pendragon.p123v1.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.ae50;
import p204p.fve0;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;
import p204p.zc40;

/* JADX INFO: loaded from: classes2.dex */
public final class InAppMessage extends AbstractC0269h implements sre0 {
    public static final int CAPPING_FIELD_NUMBER = 5;
    public static final int CONTROL_FIELD_NUMBER = 6;
    public static final int CREATIVE_FIELD_NUMBER = 4;
    private static final InAppMessage DEFAULT_INSTANCE;
    public static final int END_TIMESTAMP_FIELD_NUMBER = 3;
    public static final int MESSAGE_ID_FIELD_NUMBER = 2;
    public static final int MESSAGE_TYPE_FIELD_NUMBER = 8;
    private static volatile r2n0 PARSER = null;
    public static final int TRIGGERS_FIELD_NUMBER = 7;
    public static final int UUID_FIELD_NUMBER = 1;
    private int bitField0_;
    private Capping capping_;
    private boolean control_;
    private MessageCreative creative_;
    private long endTimestamp_;
    private long messageId_;
    private int messageType_;
    private String uuid_ = "";
    private ae50 triggers_ = AbstractC0269h.emptyProtobufList();

    static {
        InAppMessage inAppMessage = new InAppMessage();
        DEFAULT_INSTANCE = inAppMessage;
        AbstractC0269h.registerDefaultInstance(InAppMessage.class, inAppMessage);
    }

    private InAppMessage() {
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static InAppMessage m17221q() {
        return DEFAULT_INSTANCE;
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\b\u0000\u0001\u0001\b\b\u0000\u0001\u0000\u0001Ȉ\u0002\u0002\u0003ဂ\u0000\u0004ဉ\u0001\u0005ဉ\u0002\u0006\u0007\u0007\u001b\b\f", new Object[]{"bitField0_", "uuid_", "messageId_", "endTimestamp_", "creative_", "capping_", "control_", "triggers_", Trigger.class, "messageType_"});
        }
        if (iOrdinal == 3) {
            return new InAppMessage();
        }
        if (iOrdinal == 4) {
            return new zc40(2);
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
        synchronized (InAppMessage.class) {
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
    public final /* bridge */ /* synthetic */ pre0 getDefaultInstanceForType() {
        return getDefaultInstanceForType();
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final Capping m17222o() {
        Capping capping = this.capping_;
        return capping == null ? Capping.m17137o() : capping;
    }

    /* JADX INFO: renamed from: p */
    public final MessageCreative m17223p() {
        MessageCreative messageCreative = this.creative_;
        return messageCreative == null ? MessageCreative.m17238r() : messageCreative;
    }

    /* JADX INFO: renamed from: r */
    public final long m17224r() {
        return this.endTimestamp_;
    }

    /* JADX INFO: renamed from: s */
    public final long m17225s() {
        return this.messageId_;
    }

    /* JADX INFO: renamed from: t */
    public final fve0 m17226t() {
        fve0 fve0Var;
        int i = this.messageType_;
        if (i != 0) {
            fve0Var = i != 1 ? null : fve0.TRANSACTIONAL;
        } else {
            fve0Var = fve0.MARKETING;
        }
        return fve0Var == null ? fve0.UNRECOGNIZED : fve0Var;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }

    /* JADX INFO: renamed from: u */
    public final ae50 m17227u() {
        return this.triggers_;
    }

    /* JADX INFO: renamed from: v */
    public final String m17228v() {
        return this.uuid_;
    }
}
