package com.spotify.campfire.contribution.proto.p037v1;

import com.google.protobuf.AbstractC0269h;
import p204p.AbstractC1733c9;
import p204p.cu5;
import p204p.gjk;
import p204p.ly5;
import p204p.n350;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.ud50;
import p204p.vd50;
import p204p.z110;
import p204p.zdk;
import p204p.zik;

/* JADX INFO: loaded from: classes5.dex */
public final class ContributionFilters extends AbstractC0269h implements sre0 {
    private static final ContributionFilters DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER = null;
    public static final int SOURCES_FIELD_NUMBER = 2;
    public static final int TIME_FILTER_FIELD_NUMBER = 3;
    public static final int TYPES_FIELD_NUMBER = 1;
    private static final vd50 sources_converter_;
    private static final vd50 types_converter_;
    private int bitField0_;
    private int sourcesMemoizedSerializedSize;
    private TimeFilter timeFilter_;
    private int typesMemoizedSerializedSize;
    private ud50 types_ = AbstractC0269h.emptyIntList();
    private ud50 sources_ = AbstractC0269h.emptyIntList();

    static {
        int i = 4;
        types_converter_ = new cu5(i);
        sources_converter_ = new ly5(i);
        ContributionFilters contributionFilters = new ContributionFilters();
        DEFAULT_INSTANCE = contributionFilters;
        AbstractC0269h.registerDefaultInstance(ContributionFilters.class, contributionFilters);
    }

    private ContributionFilters() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: n */
    public static void m4267n(ContributionFilters contributionFilters, zik zikVar) {
        contributionFilters.getClass();
        ud50 ud50Var = contributionFilters.sources_;
        if (!((AbstractC1733c9) ud50Var).f35342a) {
            contributionFilters.sources_ = AbstractC0269h.mutableCopy(ud50Var);
        }
        ((n350) contributionFilters.sources_).m63581b(zikVar.getNumber());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: o */
    public static void m4268o(ContributionFilters contributionFilters, gjk gjkVar) {
        contributionFilters.getClass();
        ud50 ud50Var = contributionFilters.types_;
        if (!((AbstractC1733c9) ud50Var).f35342a) {
            contributionFilters.types_ = AbstractC0269h.mutableCopy(ud50Var);
        }
        ((n350) contributionFilters.types_).m63581b(gjkVar.getNumber());
    }

    /* JADX INFO: renamed from: p */
    public static void m4269p(ContributionFilters contributionFilters, TimeFilter timeFilter) {
        contributionFilters.getClass();
        timeFilter.getClass();
        contributionFilters.timeFilter_ = timeFilter;
        contributionFilters.bitField0_ |= 1;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static zdk m4270q() {
        return (zdk) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0002\u0000\u0001,\u0002,\u0003ဉ\u0000", new Object[]{"bitField0_", "types_", "sources_", "timeFilter_"});
        }
        if (iOrdinal == 3) {
            return new ContributionFilters();
        }
        if (iOrdinal == 4) {
            return new zdk(DEFAULT_INSTANCE);
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
        synchronized (ContributionFilters.class) {
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
