package spotify.your_library.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.ebe1;
import p204p.ore0;
import p204p.poe1;
import p204p.pre0;
import p204p.qoe1;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes11.dex */
public final class YourLibraryDecoratedEntityOuterClass$YourLibraryBookExtraInfo extends AbstractC0269h implements sre0 {
    public static final int ACCESS_FIELD_NUMBER = 2;
    public static final int AUTHOR_NAME_FIELD_NUMBER = 1;
    private static final YourLibraryDecoratedEntityOuterClass$YourLibraryBookExtraInfo DEFAULT_INSTANCE;
    public static final int MILLISECONDS_LEFT_FIELD_NUMBER = 3;
    private static volatile r2n0 PARSER = null;
    public static final int PERCENT_DONE_FIELD_NUMBER = 4;
    public static final int STATE_FIELD_NUMBER = 5;
    private int access_;
    private String authorName_ = "";
    private long millisecondsLeft_;
    private int percentDone_;
    private int state_;

    static {
        YourLibraryDecoratedEntityOuterClass$YourLibraryBookExtraInfo yourLibraryDecoratedEntityOuterClass$YourLibraryBookExtraInfo = new YourLibraryDecoratedEntityOuterClass$YourLibraryBookExtraInfo();
        DEFAULT_INSTANCE = yourLibraryDecoratedEntityOuterClass$YourLibraryBookExtraInfo;
        AbstractC0269h.registerDefaultInstance(YourLibraryDecoratedEntityOuterClass$YourLibraryBookExtraInfo.class, yourLibraryDecoratedEntityOuterClass$YourLibraryBookExtraInfo);
    }

    private YourLibraryDecoratedEntityOuterClass$YourLibraryBookExtraInfo() {
    }

    /* JADX INFO: renamed from: p */
    public static YourLibraryDecoratedEntityOuterClass$YourLibraryBookExtraInfo m98244p() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001Ȉ\u0002\f\u0003\u0002\u0004\u0004\u0005\f", new Object[]{"authorName_", "access_", "millisecondsLeft_", "percentDone_", "state_"});
        }
        if (iOrdinal == 3) {
            return new YourLibraryDecoratedEntityOuterClass$YourLibraryBookExtraInfo();
        }
        if (iOrdinal == 4) {
            return new ebe1(DEFAULT_INSTANCE, 15);
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
        synchronized (YourLibraryDecoratedEntityOuterClass$YourLibraryBookExtraInfo.class) {
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
    public final poe1 m98245n() {
        poe1 poe1Var;
        int i = this.access_;
        if (i == 0) {
            poe1Var = poe1.OPEN;
        } else if (i != 1) {
            poe1Var = i != 2 ? null : poe1.CAPPED;
        } else {
            poe1Var = poe1.LOCKED;
        }
        return poe1Var == null ? poe1.UNRECOGNIZED : poe1Var;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final String m98246o() {
        return this.authorName_;
    }

    /* JADX INFO: renamed from: q */
    public final long m98247q() {
        return this.millisecondsLeft_;
    }

    /* JADX INFO: renamed from: r */
    public final int m98248r() {
        return this.percentDone_;
    }

    /* JADX INFO: renamed from: s */
    public final qoe1 m98249s() {
        qoe1 qoe1Var;
        int i = this.state_;
        if (i == 0) {
            qoe1Var = qoe1.NOT_STARTED;
        } else if (i != 1) {
            qoe1Var = i != 2 ? null : qoe1.FINISHED;
        } else {
            qoe1Var = qoe1.IN_PROGRESS;
        }
        return qoe1Var == null ? qoe1.UNRECOGNIZED : qoe1Var;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
