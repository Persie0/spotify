package com.spotify.prefetch_esperanto.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.AbstractC1733c9;
import p204p.hp3;
import p204p.klw;
import p204p.n350;
import p204p.olw;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.rlw;
import p204p.so3;
import p204p.sre0;
import p204p.ud50;
import p204p.vd50;
import p204p.z110;

/* JADX INFO: loaded from: classes2.dex */
public final class EsMediaPrefetch$SegmentProfileSelectionConfig extends AbstractC0269h implements sre0 {
    private static final EsMediaPrefetch$SegmentProfileSelectionConfig DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER = null;
    public static final int SUPPORTED_ENCRYPTION_SCHEMES_FIELD_NUMBER = 1;
    public static final int SUPPORTED_VIDEO_CODECS_FIELD_NUMBER = 2;
    public static final int VIDEO_CODECS_ARE_PRIORITY_ORDERED_FIELD_NUMBER = 3;
    private static final vd50 supportedEncryptionSchemes_converter_ = new so3(11);
    private static final vd50 supportedVideoCodecs_converter_ = new hp3();
    private int supportedEncryptionSchemesMemoizedSerializedSize;
    private int supportedVideoCodecsMemoizedSerializedSize;
    private boolean videoCodecsArePriorityOrdered_;
    private ud50 supportedEncryptionSchemes_ = AbstractC0269h.emptyIntList();
    private ud50 supportedVideoCodecs_ = AbstractC0269h.emptyIntList();

    static {
        EsMediaPrefetch$SegmentProfileSelectionConfig esMediaPrefetch$SegmentProfileSelectionConfig = new EsMediaPrefetch$SegmentProfileSelectionConfig();
        DEFAULT_INSTANCE = esMediaPrefetch$SegmentProfileSelectionConfig;
        AbstractC0269h.registerDefaultInstance(EsMediaPrefetch$SegmentProfileSelectionConfig.class, esMediaPrefetch$SegmentProfileSelectionConfig);
    }

    private EsMediaPrefetch$SegmentProfileSelectionConfig() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: n */
    public static void m19500n(EsMediaPrefetch$SegmentProfileSelectionConfig esMediaPrefetch$SegmentProfileSelectionConfig, klw klwVar) {
        esMediaPrefetch$SegmentProfileSelectionConfig.getClass();
        ud50 ud50Var = esMediaPrefetch$SegmentProfileSelectionConfig.supportedEncryptionSchemes_;
        if (!((AbstractC1733c9) ud50Var).f35342a) {
            esMediaPrefetch$SegmentProfileSelectionConfig.supportedEncryptionSchemes_ = AbstractC0269h.mutableCopy(ud50Var);
        }
        ((n350) esMediaPrefetch$SegmentProfileSelectionConfig.supportedEncryptionSchemes_).m63581b(klwVar.getNumber());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: o */
    public static void m19501o(EsMediaPrefetch$SegmentProfileSelectionConfig esMediaPrefetch$SegmentProfileSelectionConfig, rlw rlwVar) {
        esMediaPrefetch$SegmentProfileSelectionConfig.getClass();
        ud50 ud50Var = esMediaPrefetch$SegmentProfileSelectionConfig.supportedVideoCodecs_;
        if (!((AbstractC1733c9) ud50Var).f35342a) {
            esMediaPrefetch$SegmentProfileSelectionConfig.supportedVideoCodecs_ = AbstractC0269h.mutableCopy(ud50Var);
        }
        ((n350) esMediaPrefetch$SegmentProfileSelectionConfig.supportedVideoCodecs_).m63581b(rlwVar.getNumber());
    }

    /* JADX INFO: renamed from: p */
    public static void m19502p(EsMediaPrefetch$SegmentProfileSelectionConfig esMediaPrefetch$SegmentProfileSelectionConfig, boolean z) {
        esMediaPrefetch$SegmentProfileSelectionConfig.videoCodecsArePriorityOrdered_ = z;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static olw m19503q() {
        return (olw) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0002\u0000\u0001,\u0002,\u0003\u0007", new Object[]{"supportedEncryptionSchemes_", "supportedVideoCodecs_", "videoCodecsArePriorityOrdered_"});
        }
        if (iOrdinal == 3) {
            return new EsMediaPrefetch$SegmentProfileSelectionConfig();
        }
        if (iOrdinal == 4) {
            return new olw(DEFAULT_INSTANCE);
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
        synchronized (EsMediaPrefetch$SegmentProfileSelectionConfig.class) {
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
