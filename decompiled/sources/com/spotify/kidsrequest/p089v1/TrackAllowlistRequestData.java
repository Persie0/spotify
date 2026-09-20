package com.spotify.kidsrequest.p089v1;

import com.google.protobuf.AbstractC0269h;
import p204p.ore0;
import p204p.p981;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes7.dex */
public final class TrackAllowlistRequestData extends AbstractC0269h implements sre0 {
    public static final int ARTIST_URI_FIELD_NUMBER = 2;
    public static final int CLEAN_VERSION_AVAILABLE_FIELD_NUMBER = 3;
    private static final TrackAllowlistRequestData DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER = null;
    public static final int TRACK_URI_FIELD_NUMBER = 1;
    private boolean cleanVersionAvailable_;
    private String trackUri_ = "";
    private String artistUri_ = "";

    static {
        TrackAllowlistRequestData trackAllowlistRequestData = new TrackAllowlistRequestData();
        DEFAULT_INSTANCE = trackAllowlistRequestData;
        AbstractC0269h.registerDefaultInstance(TrackAllowlistRequestData.class, trackAllowlistRequestData);
    }

    private TrackAllowlistRequestData() {
    }

    /* JADX INFO: renamed from: p */
    public static TrackAllowlistRequestData m12247p() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003\u0007", new Object[]{"trackUri_", "artistUri_", "cleanVersionAvailable_"});
        }
        if (iOrdinal == 3) {
            return new TrackAllowlistRequestData();
        }
        if (iOrdinal == 4) {
            return new p981(DEFAULT_INSTANCE, 9);
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
        synchronized (TrackAllowlistRequestData.class) {
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
    public final String m12248n() {
        return this.artistUri_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final boolean m12249o() {
        return this.cleanVersionAvailable_;
    }

    /* JADX INFO: renamed from: q */
    public final String m12250q() {
        return this.trackUri_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
