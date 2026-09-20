package com.spotify.concertpageview.p048v1;

import com.google.protobuf.AbstractC0269h;
import java.util.List;
import p204p.ae50;
import p204p.lj90;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes6.dex */
public final class LivePerformanceRow extends AbstractC0269h implements sre0 {
    private static final LivePerformanceRow DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER = null;
    public static final int PLAYBACK_CONTEXT_URI_FIELD_NUMBER = 3;
    public static final int TRACK_URIS_FIELD_NUMBER = 2;
    private int bitField0_;
    private ae50 trackUris_ = AbstractC0269h.emptyProtobufList();
    private String playbackContextUri_ = "";

    static {
        LivePerformanceRow livePerformanceRow = new LivePerformanceRow();
        DEFAULT_INSTANCE = livePerformanceRow;
        AbstractC0269h.registerDefaultInstance(LivePerformanceRow.class, livePerformanceRow);
    }

    private LivePerformanceRow() {
    }

    /* JADX INFO: renamed from: n */
    public static LivePerformanceRow m7063n() {
        return DEFAULT_INSTANCE;
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0002\u0003\u0002\u0000\u0001\u0000\u0002Ț\u0003ለ\u0000", new Object[]{"bitField0_", "trackUris_", "playbackContextUri_"});
        }
        if (iOrdinal == 3) {
            return new LivePerformanceRow();
        }
        if (iOrdinal == 4) {
            return new lj90(DEFAULT_INSTANCE, 6);
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
        synchronized (LivePerformanceRow.class) {
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

    public final List getTrackUrisList() {
        return this.trackUris_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final String m7064o() {
        return this.playbackContextUri_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
