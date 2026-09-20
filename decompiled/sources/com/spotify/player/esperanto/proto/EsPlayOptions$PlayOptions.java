package com.spotify.player.esperanto.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.anw;
import p204p.bnw;
import p204p.cnw;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes9.dex */
public final class EsPlayOptions$PlayOptions extends AbstractC0269h implements sre0 {
    private static final EsPlayOptions$PlayOptions DEFAULT_INSTANCE;
    public static final int OPERATION_FIELD_NUMBER = 2;
    private static volatile r2n0 PARSER = null;
    public static final int PLAYBACK_SPEED_FIELD_NUMBER = 4;
    public static final int REASON_FIELD_NUMBER = 1;
    public static final int TRIGGER_FIELD_NUMBER = 3;
    private int bitField0_;
    private int operation_;
    private float playbackSpeed_;
    private int reason_;
    private int trigger_;

    static {
        EsPlayOptions$PlayOptions esPlayOptions$PlayOptions = new EsPlayOptions$PlayOptions();
        DEFAULT_INSTANCE = esPlayOptions$PlayOptions;
        AbstractC0269h.registerDefaultInstance(EsPlayOptions$PlayOptions.class, esPlayOptions$PlayOptions);
    }

    private EsPlayOptions$PlayOptions() {
    }

    /* JADX INFO: renamed from: n */
    public static void m17798n(EsPlayOptions$PlayOptions esPlayOptions$PlayOptions, bnw bnwVar) {
        esPlayOptions$PlayOptions.getClass();
        esPlayOptions$PlayOptions.operation_ = bnwVar.getNumber();
    }

    /* JADX INFO: renamed from: o */
    public static void m17799o(EsPlayOptions$PlayOptions esPlayOptions$PlayOptions) {
        esPlayOptions$PlayOptions.reason_ = 0;
    }

    /* JADX INFO: renamed from: p */
    public static void m17800p(EsPlayOptions$PlayOptions esPlayOptions$PlayOptions, cnw cnwVar) {
        esPlayOptions$PlayOptions.getClass();
        esPlayOptions$PlayOptions.trigger_ = cnwVar.getNumber();
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static void m17801q(EsPlayOptions$PlayOptions esPlayOptions$PlayOptions) {
        esPlayOptions$PlayOptions.trigger_ = 0;
    }

    /* JADX INFO: renamed from: r */
    public static EsPlayOptions$PlayOptions m17802r() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: renamed from: s */
    public static anw m17803s() {
        return (anw) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\f\u0002\f\u0003\f\u0004ခ\u0000", new Object[]{"bitField0_", "reason_", "operation_", "trigger_", "playbackSpeed_"});
        }
        if (iOrdinal == 3) {
            return new EsPlayOptions$PlayOptions();
        }
        if (iOrdinal == 4) {
            return new anw(DEFAULT_INSTANCE);
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
        synchronized (EsPlayOptions$PlayOptions.class) {
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
