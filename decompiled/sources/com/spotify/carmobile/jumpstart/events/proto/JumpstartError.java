package com.spotify.carmobile.jumpstart.events.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.AbstractC1733c9;
import p204p.AbstractC2118m8;
import p204p.ae50;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.ym60;
import p204p.z110;

/* JADX INFO: loaded from: classes5.dex */
public final class JumpstartError extends AbstractC0269h implements sre0 {
    private static final JumpstartError DEFAULT_INSTANCE;
    public static final int MESSAGE_FIELD_NUMBER = 4;
    private static volatile r2n0 PARSER = null;
    public static final int REASON_FIELD_NUMBER = 3;
    public static final int RESTRICTIONS_FIELD_NUMBER = 5;
    public static final int TRIGGER_FEATURE_IDENTIFIER_FIELD_NUMBER = 1;
    public static final int TRIGGER_METHOD_FIELD_NUMBER = 2;
    private int bitField0_;
    private String triggerFeatureIdentifier_ = "";
    private String triggerMethod_ = "";
    private String reason_ = "";
    private String message_ = "";
    private ae50 restrictions_ = AbstractC0269h.emptyProtobufList();

    static {
        JumpstartError jumpstartError = new JumpstartError();
        DEFAULT_INSTANCE = jumpstartError;
        AbstractC0269h.registerDefaultInstance(JumpstartError.class, jumpstartError);
    }

    private JumpstartError() {
    }

    /* JADX INFO: renamed from: n */
    public static void m5551n(JumpstartError jumpstartError, Iterable iterable) {
        ae50 ae50Var = jumpstartError.restrictions_;
        if (!((AbstractC1733c9) ae50Var).f35342a) {
            jumpstartError.restrictions_ = AbstractC0269h.mutableCopy(ae50Var);
        }
        AbstractC2118m8.addAll(iterable, jumpstartError.restrictions_);
    }

    /* JADX INFO: renamed from: o */
    public static void m5552o(JumpstartError jumpstartError, String str) {
        jumpstartError.getClass();
        str.getClass();
        jumpstartError.bitField0_ |= 8;
        jumpstartError.message_ = str;
    }

    /* JADX INFO: renamed from: p */
    public static void m5553p(JumpstartError jumpstartError, String str) {
        jumpstartError.getClass();
        str.getClass();
        jumpstartError.bitField0_ |= 4;
        jumpstartError.reason_ = str;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static void m5554q(JumpstartError jumpstartError) {
        jumpstartError.getClass();
        jumpstartError.bitField0_ |= 1;
        jumpstartError.triggerFeatureIdentifier_ = "car_detection";
    }

    /* JADX INFO: renamed from: r */
    public static void m5555r(JumpstartError jumpstartError) {
        jumpstartError.getClass();
        jumpstartError.bitField0_ |= 2;
        jumpstartError.triggerMethod_ = "play";
    }

    /* JADX INFO: renamed from: s */
    public static ym60 m5556s() {
        return (ym60) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005\u001a", new Object[]{"bitField0_", "triggerFeatureIdentifier_", "triggerMethod_", "reason_", "message_", "restrictions_"});
        }
        if (iOrdinal == 3) {
            return new JumpstartError();
        }
        if (iOrdinal == 4) {
            return new ym60(DEFAULT_INSTANCE);
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
        synchronized (JumpstartError.class) {
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

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
