package com.spotify.personalizedepisodes.contentservice.p124v1;

import com.google.protobuf.AbstractC0269h;
import java.util.Iterator;
import java.util.List;
import p204p.AbstractC1733c9;
import p204p.hoo;
import p204p.mey0;
import p204p.n350;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.ud50;
import p204p.ufy0;
import p204p.vb5;
import p204p.vd50;
import p204p.wd50;
import p204p.z110;

/* JADX INFO: loaded from: classes9.dex */
public final class Schedule extends AbstractC0269h implements sre0 {
    public static final int DAYS_OF_WEEK_FIELD_NUMBER = 2;
    private static final Schedule DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER = null;
    public static final int TYPE_FIELD_NUMBER = 1;
    private static final vd50 daysOfWeek_converter_ = new vb5(24);
    private int daysOfWeekMemoizedSerializedSize;
    private ud50 daysOfWeek_ = AbstractC0269h.emptyIntList();
    private int type_;

    static {
        Schedule schedule = new Schedule();
        DEFAULT_INSTANCE = schedule;
        AbstractC0269h.registerDefaultInstance(Schedule.class, schedule);
    }

    private Schedule() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: n */
    public static void m17485n(Schedule schedule, List list) {
        ud50 ud50Var = schedule.daysOfWeek_;
        if (!((AbstractC1733c9) ud50Var).f35342a) {
            schedule.daysOfWeek_ = AbstractC0269h.mutableCopy(ud50Var);
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            hoo hooVar = (hoo) it.next();
            ((n350) schedule.daysOfWeek_).m63581b(hooVar.getNumber());
        }
    }

    /* JADX INFO: renamed from: o */
    public static void m17486o(Schedule schedule, ufy0 ufy0Var) {
        schedule.getClass();
        schedule.type_ = ufy0Var.getNumber();
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static Schedule m17487q() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: renamed from: s */
    public static mey0 m17488s() {
        return (mey0) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\f\u0002,", new Object[]{"type_", "daysOfWeek_"});
        }
        if (iOrdinal == 3) {
            return new Schedule();
        }
        if (iOrdinal == 4) {
            return new mey0(DEFAULT_INSTANCE);
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
        synchronized (Schedule.class) {
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
    public final wd50 m17489p() {
        return new wd50(this.daysOfWeek_, daysOfWeek_converter_);
    }

    /* JADX INFO: renamed from: r */
    public final ufy0 m17490r() {
        ufy0 ufy0Var;
        int i = this.type_;
        if (i == 0) {
            ufy0Var = ufy0.SCHEDULE_TYPE_UNSPECIFIED;
        } else if (i == 1) {
            ufy0Var = ufy0.SCHEDULE_TYPE_NONE;
        } else if (i == 2) {
            ufy0Var = ufy0.SCHEDULE_TYPE_DAILY;
        } else if (i != 3) {
            ufy0Var = i != 4 ? null : ufy0.SCHEDULE_TYPE_MONTHLY;
        } else {
            ufy0Var = ufy0.SCHEDULE_TYPE_WEEKLY;
        }
        return ufy0Var == null ? ufy0.UNRECOGNIZED : ufy0Var;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
