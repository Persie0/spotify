package spotify.your_library.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.ebe1;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.roe1;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: renamed from: spotify.your_library.proto.YourLibraryDecoratedEntityOuterClass$YourLibraryConcertCampaignExtraInfo */
/* JADX INFO: loaded from: classes11.dex */
public final class C2694xa58ea99b extends AbstractC0269h implements sre0 {
    private static final C2694xa58ea99b DEFAULT_INSTANCE;
    public static final int END_TIME_FIELD_NUMBER = 3;
    private static volatile r2n0 PARSER = null;
    public static final int START_TIME_FIELD_NUMBER = 2;
    public static final int STATUS_FIELD_NUMBER = 1;
    private long endTime_;
    private long startTime_;
    private int status_;

    static {
        C2694xa58ea99b c2694xa58ea99b = new C2694xa58ea99b();
        DEFAULT_INSTANCE = c2694xa58ea99b;
        AbstractC0269h.registerDefaultInstance(C2694xa58ea99b.class, c2694xa58ea99b);
    }

    private C2694xa58ea99b() {
    }

    /* JADX INFO: renamed from: n */
    public static C2694xa58ea99b m98250n() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\f\u0002\u0002\u0003\u0002", new Object[]{"status_", "startTime_", "endTime_"});
        }
        if (iOrdinal == 3) {
            return new C2694xa58ea99b();
        }
        if (iOrdinal == 4) {
            return new ebe1(DEFAULT_INSTANCE, 16);
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
        synchronized (C2694xa58ea99b.class) {
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
    public final long m98251o() {
        return this.endTime_;
    }

    /* JADX INFO: renamed from: p */
    public final long m98252p() {
        return this.startTime_;
    }

    /* JADX INFO: renamed from: q */
    public final roe1 m98253q() {
        roe1 roe1Var;
        switch (this.status_) {
            case 0:
                roe1Var = roe1.UNSPECIFIED;
                break;
            case 1:
                roe1Var = roe1.RESERVED;
                break;
            case 2:
                roe1Var = roe1.FCFS;
                break;
            case 3:
                roe1Var = roe1.WAITLISTED;
                break;
            case 4:
                roe1Var = roe1.PURCHASED;
                break;
            case 5:
                roe1Var = roe1.INELIGIBLE;
                break;
            case 6:
                roe1Var = roe1.SOLD_OUT;
                break;
            case 7:
                roe1Var = roe1.CANCELLED;
                break;
            case 8:
                roe1Var = roe1.SALE_ENDED;
                break;
            default:
                roe1Var = null;
                break;
        }
        return roe1Var == null ? roe1.UNRECOGNIZED : roe1Var;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
