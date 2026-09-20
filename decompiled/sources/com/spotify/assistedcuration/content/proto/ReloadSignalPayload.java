package com.spotify.assistedcuration.content.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.v8w0;
import p204p.z110;

/* JADX INFO: loaded from: classes3.dex */
public final class ReloadSignalPayload extends AbstractC0269h implements sre0 {
    public static final int ASSISTED_CURATION_TRACKS_FIELD_NUMBER = 4;
    public static final int BRIDGE_TRACKS_FIELD_NUMBER = 2;
    private static final ReloadSignalPayload DEFAULT_INSTANCE;
    public static final int IS_MIXED_FIELD_NUMBER = 1;
    private static volatile r2n0 PARSER = null;
    public static final int PLAYLIST_EXTENDER_FIELD_NUMBER = 3;
    private int featurePayloadCase_ = 0;
    private Object featurePayload_;
    private boolean isMixed_;

    static {
        ReloadSignalPayload reloadSignalPayload = new ReloadSignalPayload();
        DEFAULT_INSTANCE = reloadSignalPayload;
        AbstractC0269h.registerDefaultInstance(ReloadSignalPayload.class, reloadSignalPayload);
    }

    private ReloadSignalPayload() {
    }

    /* JADX INFO: renamed from: n */
    public static void m3332n(ReloadSignalPayload reloadSignalPayload, AssistedCurationTracks assistedCurationTracks) {
        reloadSignalPayload.getClass();
        assistedCurationTracks.getClass();
        reloadSignalPayload.featurePayload_ = assistedCurationTracks;
        reloadSignalPayload.featurePayloadCase_ = 4;
    }

    /* JADX INFO: renamed from: o */
    public static void m3333o(ReloadSignalPayload reloadSignalPayload) {
        reloadSignalPayload.isMixed_ = true;
    }

    /* JADX INFO: renamed from: p */
    public static v8w0 m3334p() {
        return (v8w0) DEFAULT_INSTANCE.createBuilder();
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0001\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u0007\u0002<\u0000\u0003<\u0000\u0004<\u0000", new Object[]{"featurePayload_", "featurePayloadCase_", "isMixed_", BridgeTracks.class, PlaylistExtender.class, AssistedCurationTracks.class});
        }
        if (iOrdinal == 3) {
            return new ReloadSignalPayload();
        }
        if (iOrdinal == 4) {
            return new v8w0(DEFAULT_INSTANCE);
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
        synchronized (ReloadSignalPayload.class) {
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
