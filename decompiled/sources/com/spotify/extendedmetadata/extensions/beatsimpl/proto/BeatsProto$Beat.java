package com.spotify.extendedmetadata.extensions.beatsimpl.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.az8;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes6.dex */
public final class BeatsProto$Beat extends AbstractC0269h implements sre0 {
    public static final int BEAT_CONFIDENCE_FIELD_NUMBER = 4;
    private static final BeatsProto$Beat DEFAULT_INSTANCE;
    public static final int DOWNBEAT_CONFIDENCE_FIELD_NUMBER = 5;
    public static final int DURATION_FIELD_NUMBER = 2;
    private static volatile r2n0 PARSER = null;
    public static final int TIME_FIELD_NUMBER = 1;
    public static final int VALUE_FIELD_NUMBER = 3;
    private float beatConfidence_;
    private float downbeatConfidence_;
    private float duration_;
    private float time_;
    private int value_;

    static {
        BeatsProto$Beat beatsProto$Beat = new BeatsProto$Beat();
        DEFAULT_INSTANCE = beatsProto$Beat;
        AbstractC0269h.registerDefaultInstance(BeatsProto$Beat.class, beatsProto$Beat);
    }

    private BeatsProto$Beat() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001\u0001\u0002\u0001\u0003\u0004\u0004\u0001\u0005\u0001", new Object[]{"time_", "duration_", "value_", "beatConfidence_", "downbeatConfidence_"});
        }
        if (iOrdinal == 3) {
            return new BeatsProto$Beat();
        }
        if (iOrdinal == 4) {
            return new az8(DEFAULT_INSTANCE, 22);
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
        synchronized (BeatsProto$Beat.class) {
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

    public final int getValue() {
        return this.value_;
    }

    /* JADX INFO: renamed from: n */
    public final float m9885n() {
        return this.beatConfidence_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final float m9886o() {
        return this.downbeatConfidence_;
    }

    /* JADX INFO: renamed from: p */
    public final float m9887p() {
        return this.duration_;
    }

    /* JADX INFO: renamed from: q */
    public final float m9888q() {
        return this.time_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
