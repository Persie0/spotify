package com.spotify.extendedmetadata.extensions.beatsimpl.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.ae50;
import p204p.az8;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes6.dex */
public final class BeatsProto$Beats extends AbstractC0269h implements sre0 {
    public static final int BEATS_FIELD_NUMBER = 2;
    public static final int BEATS_HASH_FIELD_NUMBER = 3;
    public static final int BEATS_PER_BAR_FIELD_NUMBER = 1;
    private static final BeatsProto$Beats DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER;
    private int beatsPerBar_;
    private ae50 beats_ = AbstractC0269h.emptyProtobufList();
    private String beatsHash_ = "";

    static {
        BeatsProto$Beats beatsProto$Beats = new BeatsProto$Beats();
        DEFAULT_INSTANCE = beatsProto$Beats;
        AbstractC0269h.registerDefaultInstance(BeatsProto$Beats.class, beatsProto$Beats);
    }

    private BeatsProto$Beats() {
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static BeatsProto$Beats m9889q(byte[] bArr) {
        return (BeatsProto$Beats) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u0004\u0002\u001b\u0003Ȉ", new Object[]{"beatsPerBar_", "beats_", BeatsProto$Beat.class, "beatsHash_"});
        }
        if (iOrdinal == 3) {
            return new BeatsProto$Beats();
        }
        if (iOrdinal == 4) {
            return new az8(DEFAULT_INSTANCE, 23);
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
        synchronized (BeatsProto$Beats.class) {
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
    public final String m9890n() {
        return this.beatsHash_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final ae50 m9891o() {
        return this.beats_;
    }

    /* JADX INFO: renamed from: p */
    public final int m9892p() {
        return this.beatsPerBar_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
