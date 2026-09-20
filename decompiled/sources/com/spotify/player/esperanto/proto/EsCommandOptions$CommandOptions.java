package com.spotify.player.esperanto.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.cva;
import p204p.gva;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.xiw;
import p204p.z110;

/* JADX INFO: loaded from: classes9.dex */
public final class EsCommandOptions$CommandOptions extends AbstractC0269h implements sre0 {
    private static final EsCommandOptions$CommandOptions DEFAULT_INSTANCE;
    public static final int ONLY_FOR_LOCAL_DEVICE_FIELD_NUMBER = 2;
    public static final int ONLY_FOR_PLAYBACK_ID_FIELD_NUMBER = 4;
    public static final int OVERRIDE_RESTRICTIONS_FIELD_NUMBER = 1;
    private static volatile r2n0 PARSER = null;
    public static final int SYSTEM_INITIATED_FIELD_NUMBER = 3;
    private boolean onlyForLocalDevice_;
    private gva onlyForPlaybackId_ = gva.f84678b;
    private boolean overrideRestrictions_;
    private boolean systemInitiated_;

    static {
        EsCommandOptions$CommandOptions esCommandOptions$CommandOptions = new EsCommandOptions$CommandOptions();
        DEFAULT_INSTANCE = esCommandOptions$CommandOptions;
        AbstractC0269h.registerDefaultInstance(EsCommandOptions$CommandOptions.class, esCommandOptions$CommandOptions);
    }

    private EsCommandOptions$CommandOptions() {
    }

    /* JADX INFO: renamed from: n */
    public static void m17664n(EsCommandOptions$CommandOptions esCommandOptions$CommandOptions, boolean z) {
        esCommandOptions$CommandOptions.onlyForLocalDevice_ = z;
    }

    /* JADX INFO: renamed from: o */
    public static void m17665o(EsCommandOptions$CommandOptions esCommandOptions$CommandOptions, cva cvaVar) {
        esCommandOptions$CommandOptions.getClass();
        esCommandOptions$CommandOptions.onlyForPlaybackId_ = cvaVar;
    }

    /* JADX INFO: renamed from: p */
    public static void m17666p(EsCommandOptions$CommandOptions esCommandOptions$CommandOptions, boolean z) {
        esCommandOptions$CommandOptions.overrideRestrictions_ = z;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static void m17667q(EsCommandOptions$CommandOptions esCommandOptions$CommandOptions, boolean z) {
        esCommandOptions$CommandOptions.systemInitiated_ = z;
    }

    /* JADX INFO: renamed from: r */
    public static xiw m17668r() {
        return (xiw) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u0007\u0002\u0007\u0003\u0007\u0004\n", new Object[]{"overrideRestrictions_", "onlyForLocalDevice_", "systemInitiated_", "onlyForPlaybackId_"});
        }
        if (iOrdinal == 3) {
            return new EsCommandOptions$CommandOptions();
        }
        if (iOrdinal == 4) {
            return new xiw(DEFAULT_INSTANCE);
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
        synchronized (EsCommandOptions$CommandOptions.class) {
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
