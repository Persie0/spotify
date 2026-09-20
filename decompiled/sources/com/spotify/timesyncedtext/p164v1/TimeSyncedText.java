package com.spotify.timesyncedtext.p164v1;

import com.google.protobuf.AbstractC0269h;
import p204p.ore0;
import p204p.pre0;
import p204p.qm71;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes10.dex */
public final class TimeSyncedText extends AbstractC0269h implements sre0 {
    private static final TimeSyncedText DEFAULT_INSTANCE;
    public static final int END_TIME_MS_FIELD_NUMBER = 3;
    private static volatile r2n0 PARSER = null;
    public static final int SEGMENT_ID_FIELD_NUMBER = 5;
    public static final int START_TIME_MS_FIELD_NUMBER = 2;
    public static final int WORD_FIELD_NUMBER = 1;
    private int endTimeMs_;
    private int segmentId_;
    private int startTimeMs_;
    private String word_ = "";

    static {
        TimeSyncedText timeSyncedText = new TimeSyncedText();
        DEFAULT_INSTANCE = timeSyncedText;
        AbstractC0269h.registerDefaultInstance(TimeSyncedText.class, timeSyncedText);
    }

    private TimeSyncedText() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0005\u0004\u0000\u0000\u0000\u0001Ȉ\u0002\u000b\u0003\u000b\u0005\u0004", new Object[]{"word_", "startTimeMs_", "endTimeMs_", "segmentId_"});
        }
        if (iOrdinal == 3) {
            return new TimeSyncedText();
        }
        if (iOrdinal == 4) {
            return new qm71(DEFAULT_INSTANCE, 2);
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
        synchronized (TimeSyncedText.class) {
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
    public final int m21819n() {
        return this.endTimeMs_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final int m21820o() {
        return this.startTimeMs_;
    }

    /* JADX INFO: renamed from: p */
    public final String m21821p() {
        return this.word_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
