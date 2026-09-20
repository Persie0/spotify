package com.spotify.highlightsstats.data.proto.timeline.view.p075v1;

import com.google.protobuf.AbstractC0269h;
import com.spotify.highlightsstats.ShareConfiguration;
import p204p.ae50;
import p204p.nr41;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes7.dex */
public final class Stats extends AbstractC0269h implements sre0 {
    private static final Stats DEFAULT_INSTANCE;
    public static final int LAST_UPDATED_MESSAGE_FIELD_NUMBER = 3;
    private static volatile r2n0 PARSER = null;
    public static final int SHARE_CONFIGURATION_FIELD_NUMBER = 4;
    public static final int SOCIAL_STATS_ITEMS_FIELD_NUMBER = 6;
    public static final int STATSITEMS_FIELD_NUMBER = 1;
    public static final int STATSSTATUS_FIELD_NUMBER = 2;
    public static final int STATS_AVAILABILITY_FIELD_NUMBER = 5;
    private int bitField0_;
    private ShareConfiguration shareConfiguration_;
    private StatsAvailabilityDetails statsAvailability_;
    private int statsStatus_;
    private ae50 statsItems_ = AbstractC0269h.emptyProtobufList();
    private String lastUpdatedMessage_ = "";
    private ae50 socialStatsItems_ = AbstractC0269h.emptyProtobufList();

    static {
        Stats stats = new Stats();
        DEFAULT_INSTANCE = stats;
        AbstractC0269h.registerDefaultInstance(Stats.class, stats);
    }

    private Stats() {
    }

    /* JADX INFO: renamed from: n */
    public static Stats m11420n() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0002\u0000\u0001\u001b\u0002\f\u0003Ȉ\u0004ဉ\u0000\u0005ဉ\u0001\u0006\u001b", new Object[]{"bitField0_", "statsItems_", StatsItem.class, "statsStatus_", "lastUpdatedMessage_", "shareConfiguration_", "statsAvailability_", "socialStatsItems_", SocialStatsItem.class});
        }
        if (iOrdinal == 3) {
            return new Stats();
        }
        if (iOrdinal == 4) {
            return new nr41(DEFAULT_INSTANCE, 4);
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
        synchronized (Stats.class) {
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
    public final String m11421o() {
        return this.lastUpdatedMessage_;
    }

    /* JADX INFO: renamed from: p */
    public final ShareConfiguration m11422p() {
        ShareConfiguration shareConfiguration = this.shareConfiguration_;
        return shareConfiguration == null ? ShareConfiguration.m11293n() : shareConfiguration;
    }

    /* JADX INFO: renamed from: q */
    public final ae50 m11423q() {
        return this.socialStatsItems_;
    }

    /* JADX INFO: renamed from: r */
    public final StatsAvailabilityDetails m11424r() {
        StatsAvailabilityDetails statsAvailabilityDetails = this.statsAvailability_;
        return statsAvailabilityDetails == null ? StatsAvailabilityDetails.m11426n() : statsAvailabilityDetails;
    }

    /* JADX INFO: renamed from: s */
    public final ae50 m11425s() {
        return this.statsItems_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
