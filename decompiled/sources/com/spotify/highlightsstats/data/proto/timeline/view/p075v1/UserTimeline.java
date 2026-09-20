package com.spotify.highlightsstats.data.proto.timeline.view.p075v1;

import com.google.protobuf.AbstractC0269h;
import p204p.kea1;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes7.dex */
public final class UserTimeline extends AbstractC0269h implements sre0 {
    public static final int ANALYTICS_PARAMETERS_FIELD_NUMBER = 5;
    private static final UserTimeline DEFAULT_INSTANCE;
    public static final int HIGHLIGHTS_FIELD_NUMBER = 3;
    public static final int NEXT_LOOK_BACK_FIELD_NUMBER = 4;
    private static volatile r2n0 PARSER = null;
    public static final int STATS_FIELD_NUMBER = 2;
    public static final int TIMELINE_DATE_FIELD_NUMBER = 1;
    private PageAnalyticsParameters analyticsParameters_;
    private int bitField0_;
    private Highlights highlights_;
    private int nextLookBack_;
    private Stats stats_;
    private TimelineDate timelineDate_;

    static {
        UserTimeline userTimeline = new UserTimeline();
        DEFAULT_INSTANCE = userTimeline;
        AbstractC0269h.registerDefaultInstance(UserTimeline.class, userTimeline);
    }

    private UserTimeline() {
    }

    /* JADX INFO: renamed from: o */
    public static UserTimeline m11483o() {
        return DEFAULT_INSTANCE;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: t */
    public static UserTimeline m11484t(byte[] bArr) {
        return (UserTimeline) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004\u0004\u0005ဉ\u0003", new Object[]{"bitField0_", "timelineDate_", "stats_", "highlights_", "nextLookBack_", "analyticsParameters_"});
        }
        if (iOrdinal == 3) {
            return new UserTimeline();
        }
        if (iOrdinal == 4) {
            return new kea1(DEFAULT_INSTANCE, 17);
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
        synchronized (UserTimeline.class) {
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

    /* JADX INFO: renamed from: n */
    public final PageAnalyticsParameters m11485n() {
        PageAnalyticsParameters pageAnalyticsParameters = this.analyticsParameters_;
        return pageAnalyticsParameters == null ? PageAnalyticsParameters.m11397n() : pageAnalyticsParameters;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: p */
    public final Highlights m11486p() {
        Highlights highlights = this.highlights_;
        return highlights == null ? Highlights.m11362n() : highlights;
    }

    /* JADX INFO: renamed from: q */
    public final int m11487q() {
        return this.nextLookBack_;
    }

    /* JADX INFO: renamed from: r */
    public final Stats m11488r() {
        Stats stats = this.stats_;
        return stats == null ? Stats.m11420n() : stats;
    }

    /* JADX INFO: renamed from: s */
    public final TimelineDate m11489s() {
        TimelineDate timelineDate = this.timelineDate_;
        return timelineDate == null ? TimelineDate.m11455q() : timelineDate;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
