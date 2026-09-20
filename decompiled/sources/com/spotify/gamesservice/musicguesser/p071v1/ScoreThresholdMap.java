package com.spotify.gamesservice.musicguesser.p071v1;

import com.google.protobuf.AbstractC0269h;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.six0;
import p204p.sre0;
import p204p.z110;
import p204p.zhy0;

/* JADX INFO: loaded from: classes7.dex */
public final class ScoreThresholdMap extends AbstractC0269h implements sre0 {
    private static final ScoreThresholdMap DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER = null;
    public static final int SCORE_THRESHOLD_FIELD_NUMBER = 1;
    public static final int VALUE_FIELD_NUMBER = 2;
    private int scoreThreshold_;
    private String value_ = "";

    static {
        ScoreThresholdMap scoreThresholdMap = new ScoreThresholdMap();
        DEFAULT_INSTANCE = scoreThresholdMap;
        AbstractC0269h.registerDefaultInstance(ScoreThresholdMap.class, scoreThresholdMap);
    }

    private ScoreThresholdMap() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002Ȉ", new Object[]{"scoreThreshold_", "value_"});
        }
        if (iOrdinal == 3) {
            return new ScoreThresholdMap();
        }
        if (iOrdinal == 4) {
            return new six0(DEFAULT_INSTANCE, 17);
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
        synchronized (ScoreThresholdMap.class) {
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

    public final String getValue() {
        return this.value_;
    }

    /* JADX INFO: renamed from: n */
    public final zhy0 m11062n() {
        zhy0 zhy0VarM96182a = zhy0.m96182a(this.scoreThreshold_);
        return zhy0VarM96182a == null ? zhy0.UNRECOGNIZED : zhy0VarM96182a;
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
