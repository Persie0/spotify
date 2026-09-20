package com.spotify.casita.p040v1.resolved;

import com.google.protobuf.AbstractC0269h;
import p204p.i8w0;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes.dex */
public final class ResolvedHome extends AbstractC0269h implements sre0 {
    public static final int DEBUG_INFO_FIELD_NUMBER = 4;
    private static final ResolvedHome DEFAULT_INSTANCE;
    public static final int EAGERLY_LOADED_TRAITS_FIELD_NUMBER = 2;
    public static final int ONDEMAND_SET_FIELD_NUMBER = 999;
    private static volatile r2n0 PARSER = null;
    public static final int RESPONSE_INFO_FIELD_NUMBER = 3;
    public static final int SANDBOX_DEBUG_INFO_FIELD_NUMBER = 5;
    public static final int STRUCTURE_FIELD_NUMBER = 1;
    private int bitField0_;
    private DebugInfo debugInfo_;
    private EagerlyLoadedTraits eagerlyLoadedTraits_;
    private OndemandSet ondemandSet_;
    private ResponseInfo responseInfo_;
    private SandboxDebugInfo sandboxDebugInfo_;
    private HomeStructure structure_;

    static {
        ResolvedHome resolvedHome = new ResolvedHome();
        DEFAULT_INSTANCE = resolvedHome;
        AbstractC0269h.registerDefaultInstance(ResolvedHome.class, resolvedHome);
    }

    private ResolvedHome() {
    }

    /* JADX INFO: renamed from: o */
    public static ResolvedHome m5767o() {
        return DEFAULT_INSTANCE;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0001\u0001ϧ\u0006\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003\u0005ဉ\u0004ϧဉ\u0005", new Object[]{"bitField0_", "structure_", "eagerlyLoadedTraits_", "responseInfo_", "debugInfo_", "sandboxDebugInfo_", "ondemandSet_"});
        }
        if (iOrdinal == 3) {
            return new ResolvedHome();
        }
        if (iOrdinal == 4) {
            return new i8w0(18);
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
        synchronized (ResolvedHome.class) {
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

    /* JADX INFO: renamed from: p */
    public final EagerlyLoadedTraits m5768p() {
        EagerlyLoadedTraits eagerlyLoadedTraits = this.eagerlyLoadedTraits_;
        return eagerlyLoadedTraits == null ? EagerlyLoadedTraits.m5617o() : eagerlyLoadedTraits;
    }

    /* JADX INFO: renamed from: q */
    public final OndemandSet m5769q() {
        OndemandSet ondemandSet = this.ondemandSet_;
        return ondemandSet == null ? OndemandSet.m5711o() : ondemandSet;
    }

    /* JADX INFO: renamed from: r */
    public final ResponseInfo m5770r() {
        ResponseInfo responseInfo = this.responseInfo_;
        return responseInfo == null ? ResponseInfo.m5774o() : responseInfo;
    }

    /* JADX INFO: renamed from: s */
    public final HomeStructure m5771s() {
        HomeStructure homeStructure = this.structure_;
        return homeStructure == null ? HomeStructure.m5666o() : homeStructure;
    }

    /* JADX INFO: renamed from: t */
    public final boolean m5772t() {
        return (this.bitField0_ & 32) != 0;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
