package com.spotify.extendedmetadata.extensions.listtuneraudioanalysis;

import com.google.protobuf.AbstractC0269h;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sj80;
import p204p.sre0;
import p204p.ud50;
import p204p.z110;

/* JADX INFO: loaded from: classes2.dex */
public final class ListTunerAudioAnalysisProto$ListTunerAudioAnalysis extends AbstractC0269h implements sre0 {
    private static final ListTunerAudioAnalysisProto$ListTunerAudioAnalysis DEFAULT_INSTANCE;
    public static final int LOUDNESS_FIELD_NUMBER = 3;
    private static volatile r2n0 PARSER = null;
    public static final int PERIOD_MS_FIELD_NUMBER = 2;
    public static final int START_MS_FIELD_NUMBER = 1;
    private int loudnessMemoizedSerializedSize = -1;
    private ud50 loudness_ = AbstractC0269h.emptyIntList();
    private int periodMs_;
    private int startMs_;

    static {
        ListTunerAudioAnalysisProto$ListTunerAudioAnalysis listTunerAudioAnalysisProto$ListTunerAudioAnalysis = new ListTunerAudioAnalysisProto$ListTunerAudioAnalysis();
        DEFAULT_INSTANCE = listTunerAudioAnalysisProto$ListTunerAudioAnalysis;
        AbstractC0269h.registerDefaultInstance(ListTunerAudioAnalysisProto$ListTunerAudioAnalysis.class, listTunerAudioAnalysisProto$ListTunerAudioAnalysis);
    }

    private ListTunerAudioAnalysisProto$ListTunerAudioAnalysis() {
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: r */
    public static ListTunerAudioAnalysisProto$ListTunerAudioAnalysis m10211r(byte[] bArr) {
        return (ListTunerAudioAnalysisProto$ListTunerAudioAnalysis) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u0004\u0002\u0004\u0003'", new Object[]{"startMs_", "periodMs_", "loudness_"});
        }
        if (iOrdinal == 3) {
            return new ListTunerAudioAnalysisProto$ListTunerAudioAnalysis();
        }
        if (iOrdinal == 4) {
            return new sj80(20);
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
        synchronized (ListTunerAudioAnalysisProto$ListTunerAudioAnalysis.class) {
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
    public final ud50 m10212o() {
        return this.loudness_;
    }

    /* JADX INFO: renamed from: p */
    public final int m10213p() {
        return this.periodMs_;
    }

    /* JADX INFO: renamed from: q */
    public final int m10214q() {
        return this.startMs_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
