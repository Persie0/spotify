package com.spotify.carmobile.jumpstart.events.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.AbstractC1733c9;
import p204p.ae50;
import p204p.dn60;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes5.dex */
public final class JumpstartTrigger extends AbstractC0269h implements sre0 {
    public static final int CONNECTED_ACCESSORIES_FIELD_NUMBER = 4;
    private static final JumpstartTrigger DEFAULT_INSTANCE;
    public static final int INTERACTION_ID_FIELD_NUMBER = 3;
    private static volatile r2n0 PARSER = null;
    public static final int TRIGGER_FEATURE_IDENTIFIER_FIELD_NUMBER = 1;
    public static final int TRIGGER_METHOD_FIELD_NUMBER = 2;
    private int bitField0_;
    private String triggerFeatureIdentifier_ = "";
    private String triggerMethod_ = "";
    private String interactionId_ = "";
    private ae50 connectedAccessories_ = AbstractC0269h.emptyProtobufList();

    static {
        JumpstartTrigger jumpstartTrigger = new JumpstartTrigger();
        DEFAULT_INSTANCE = jumpstartTrigger;
        AbstractC0269h.registerDefaultInstance(JumpstartTrigger.class, jumpstartTrigger);
    }

    private JumpstartTrigger() {
    }

    /* JADX INFO: renamed from: n */
    public static void m5557n(JumpstartTrigger jumpstartTrigger, String str) {
        jumpstartTrigger.getClass();
        str.getClass();
        ae50 ae50Var = jumpstartTrigger.connectedAccessories_;
        if (!((AbstractC1733c9) ae50Var).f35342a) {
            jumpstartTrigger.connectedAccessories_ = AbstractC0269h.mutableCopy(ae50Var);
        }
        jumpstartTrigger.connectedAccessories_.add(str);
    }

    /* JADX INFO: renamed from: o */
    public static void m5558o(JumpstartTrigger jumpstartTrigger, String str) {
        jumpstartTrigger.getClass();
        str.getClass();
        jumpstartTrigger.bitField0_ |= 4;
        jumpstartTrigger.interactionId_ = str;
    }

    /* JADX INFO: renamed from: p */
    public static void m5559p(JumpstartTrigger jumpstartTrigger) {
        jumpstartTrigger.getClass();
        jumpstartTrigger.bitField0_ |= 1;
        jumpstartTrigger.triggerFeatureIdentifier_ = "car_detection";
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static void m5560q(JumpstartTrigger jumpstartTrigger) {
        jumpstartTrigger.getClass();
        jumpstartTrigger.bitField0_ |= 2;
        jumpstartTrigger.triggerMethod_ = "play";
    }

    /* JADX INFO: renamed from: r */
    public static dn60 m5561r() {
        return (dn60) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004\u001a", new Object[]{"bitField0_", "triggerFeatureIdentifier_", "triggerMethod_", "interactionId_", "connectedAccessories_"});
        }
        if (iOrdinal == 3) {
            return new JumpstartTrigger();
        }
        if (iOrdinal == 4) {
            return new dn60(DEFAULT_INSTANCE);
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
        synchronized (JumpstartTrigger.class) {
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
