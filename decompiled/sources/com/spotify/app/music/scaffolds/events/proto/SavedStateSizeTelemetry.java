package com.spotify.app.music.scaffolds.events.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.ihc0;
import p204p.j9y0;
import p204p.k9y0;
import p204p.l9y0;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes3.dex */
public final class SavedStateSizeTelemetry extends AbstractC0269h implements sre0 {
    private static final SavedStateSizeTelemetry DEFAULT_INSTANCE;
    public static final int NAVIGATION_DIAGNOSTICS_FIELD_NUMBER = 5;
    private static volatile r2n0 PARSER = null;
    public static final int REGISTRY_KEY_SIZES_FIELD_NUMBER = 4;
    public static final int THRESHOLD_TYPE_FIELD_NUMBER = 2;
    public static final int TOP_LEVEL_KEY_SIZES_FIELD_NUMBER = 3;
    public static final int TOTAL_SIZE_BYTES_FIELD_NUMBER = 1;
    private int bitField0_;
    private String navigationDiagnostics_;
    private ihc0 registryKeySizes_;
    private String thresholdType_;
    private ihc0 topLevelKeySizes_;
    private long totalSizeBytes_;

    static {
        SavedStateSizeTelemetry savedStateSizeTelemetry = new SavedStateSizeTelemetry();
        DEFAULT_INSTANCE = savedStateSizeTelemetry;
        AbstractC0269h.registerDefaultInstance(SavedStateSizeTelemetry.class, savedStateSizeTelemetry);
    }

    private SavedStateSizeTelemetry() {
        ihc0 ihc0Var = ihc0.f102235b;
        this.topLevelKeySizes_ = ihc0Var;
        this.registryKeySizes_ = ihc0Var;
        this.thresholdType_ = "";
        this.navigationDiagnostics_ = "";
    }

    /* JADX INFO: renamed from: n */
    public static ihc0 m3263n(SavedStateSizeTelemetry savedStateSizeTelemetry) {
        ihc0 ihc0Var = savedStateSizeTelemetry.registryKeySizes_;
        if (!ihc0Var.f102236a) {
            savedStateSizeTelemetry.registryKeySizes_ = ihc0Var.m50613h();
        }
        return savedStateSizeTelemetry.registryKeySizes_;
    }

    /* JADX INFO: renamed from: o */
    public static ihc0 m3264o(SavedStateSizeTelemetry savedStateSizeTelemetry) {
        ihc0 ihc0Var = savedStateSizeTelemetry.topLevelKeySizes_;
        if (!ihc0Var.f102236a) {
            savedStateSizeTelemetry.topLevelKeySizes_ = ihc0Var.m50613h();
        }
        return savedStateSizeTelemetry.topLevelKeySizes_;
    }

    /* JADX INFO: renamed from: p */
    public static void m3265p(SavedStateSizeTelemetry savedStateSizeTelemetry, String str) {
        savedStateSizeTelemetry.getClass();
        str.getClass();
        savedStateSizeTelemetry.bitField0_ |= 4;
        savedStateSizeTelemetry.navigationDiagnostics_ = str;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static void m3266q(SavedStateSizeTelemetry savedStateSizeTelemetry, String str) {
        savedStateSizeTelemetry.getClass();
        savedStateSizeTelemetry.bitField0_ |= 2;
        savedStateSizeTelemetry.thresholdType_ = str;
    }

    /* JADX INFO: renamed from: r */
    public static void m3267r(SavedStateSizeTelemetry savedStateSizeTelemetry, long j) {
        savedStateSizeTelemetry.bitField0_ |= 1;
        savedStateSizeTelemetry.totalSizeBytes_ = j;
    }

    /* JADX INFO: renamed from: s */
    public static j9y0 m3268s() {
        return (j9y0) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0002\u0000\u0000\u0001ဂ\u0000\u0002ဈ\u0001\u00032\u00042\u0005ဈ\u0002", new Object[]{"bitField0_", "totalSizeBytes_", "thresholdType_", "topLevelKeySizes_", l9y0.f131194a, "registryKeySizes_", k9y0.f120720a, "navigationDiagnostics_"});
        }
        if (iOrdinal == 3) {
            return new SavedStateSizeTelemetry();
        }
        if (iOrdinal == 4) {
            return new j9y0(DEFAULT_INSTANCE);
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
        synchronized (SavedStateSizeTelemetry.class) {
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
