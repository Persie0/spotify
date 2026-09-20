package com.spotify.music.podcastinteractivity.polls.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.x2q0;
import p204p.z110;

/* JADX INFO: loaded from: classes8.dex */
public final class PollOption extends AbstractC0269h implements sre0 {
    private static final PollOption DEFAULT_INSTANCE;
    public static final int OPTION_FIELD_NUMBER = 1;
    public static final int OPTION_ID_FIELD_NUMBER = 4;
    private static volatile r2n0 PARSER = null;
    public static final int POLL_ID_FIELD_NUMBER = 3;
    public static final int TOTAL_VOTES_FIELD_NUMBER = 2;
    private int optionId_;
    private String option_ = "";
    private int pollId_;
    private int totalVotes_;

    static {
        PollOption pollOption = new PollOption();
        DEFAULT_INSTANCE = pollOption;
        AbstractC0269h.registerDefaultInstance(PollOption.class, pollOption);
    }

    private PollOption() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002\u0004\u0003\u0004\u0004\u0004", new Object[]{"option_", "totalVotes_", "pollId_", "optionId_"});
        }
        if (iOrdinal == 3) {
            return new PollOption();
        }
        if (iOrdinal == 4) {
            return new x2q0(DEFAULT_INSTANCE, 6);
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
        synchronized (PollOption.class) {
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
    public final String m15747n() {
        return this.option_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final int m15748o() {
        return this.optionId_;
    }

    /* JADX INFO: renamed from: p */
    public final int m15749p() {
        return this.totalVotes_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
