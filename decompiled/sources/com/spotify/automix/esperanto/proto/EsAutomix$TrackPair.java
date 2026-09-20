package com.spotify.automix.esperanto.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.riw;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes5.dex */
public final class EsAutomix$TrackPair extends AbstractC0269h implements sre0 {
    private static final EsAutomix$TrackPair DEFAULT_INSTANCE;
    public static final int ITEM_SPEED_A_FIELD_NUMBER = 3;
    public static final int ITEM_SPEED_B_FIELD_NUMBER = 4;
    private static volatile r2n0 PARSER = null;
    public static final int TRACK_A_URI_FIELD_NUMBER = 1;
    public static final int TRACK_B_URI_FIELD_NUMBER = 2;
    private double itemSpeedA_;
    private double itemSpeedB_;
    private String trackAUri_ = "";
    private String trackBUri_ = "";

    static {
        EsAutomix$TrackPair esAutomix$TrackPair = new EsAutomix$TrackPair();
        DEFAULT_INSTANCE = esAutomix$TrackPair;
        AbstractC0269h.registerDefaultInstance(EsAutomix$TrackPair.class, esAutomix$TrackPair);
    }

    private EsAutomix$TrackPair() {
    }

    /* JADX INFO: renamed from: n */
    public static void m3719n(EsAutomix$TrackPair esAutomix$TrackPair, double d) {
        esAutomix$TrackPair.itemSpeedA_ = d;
    }

    /* JADX INFO: renamed from: o */
    public static void m3720o(EsAutomix$TrackPair esAutomix$TrackPair, double d) {
        esAutomix$TrackPair.itemSpeedB_ = d;
    }

    /* JADX INFO: renamed from: p */
    public static void m3721p(EsAutomix$TrackPair esAutomix$TrackPair, String str) {
        esAutomix$TrackPair.getClass();
        str.getClass();
        esAutomix$TrackPair.trackAUri_ = str;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static void m3722q(EsAutomix$TrackPair esAutomix$TrackPair, String str) {
        esAutomix$TrackPair.getClass();
        str.getClass();
        esAutomix$TrackPair.trackBUri_ = str;
    }

    /* JADX INFO: renamed from: r */
    public static riw m3723r() {
        return (riw) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003\u0000\u0004\u0000", new Object[]{"trackAUri_", "trackBUri_", "itemSpeedA_", "itemSpeedB_"});
        }
        if (iOrdinal == 3) {
            return new EsAutomix$TrackPair();
        }
        if (iOrdinal == 4) {
            return new riw(DEFAULT_INSTANCE);
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
        synchronized (EsAutomix$TrackPair.class) {
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

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
