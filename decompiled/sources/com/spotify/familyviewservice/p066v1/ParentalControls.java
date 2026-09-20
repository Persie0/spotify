package com.spotify.familyviewservice.p066v1;

import com.google.protobuf.AbstractC0269h;
import p204p.c0n0;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes6.dex */
public final class ParentalControls extends AbstractC0269h implements sre0 {
    public static final int CANVAS_LOCKED_FIELD_NUMBER = 4;
    private static final ParentalControls DEFAULT_INSTANCE;
    public static final int EXPLICIT_CONTENT_LOCKED_FIELD_NUMBER = 1;
    public static final int MUSIC_VIDEOS_LOCKED_FIELD_NUMBER = 2;
    public static final int OTHER_VIDEOS_LOCKED_FIELD_NUMBER = 3;
    private static volatile r2n0 PARSER;
    private boolean canvasLocked_;
    private boolean explicitContentLocked_;
    private boolean musicVideosLocked_;
    private boolean otherVideosLocked_;

    static {
        ParentalControls parentalControls = new ParentalControls();
        DEFAULT_INSTANCE = parentalControls;
        AbstractC0269h.registerDefaultInstance(ParentalControls.class, parentalControls);
    }

    private ParentalControls() {
    }

    /* JADX INFO: renamed from: o */
    public static ParentalControls m10749o() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u0007\u0002\u0007\u0003\u0007\u0004\u0007", new Object[]{"explicitContentLocked_", "musicVideosLocked_", "otherVideosLocked_", "canvasLocked_"});
        }
        if (iOrdinal == 3) {
            return new ParentalControls();
        }
        if (iOrdinal == 4) {
            return new c0n0(DEFAULT_INSTANCE, 1);
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
        synchronized (ParentalControls.class) {
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
    public final boolean m10750n() {
        return this.canvasLocked_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: p */
    public final boolean m10751p() {
        return this.explicitContentLocked_;
    }

    /* JADX INFO: renamed from: q */
    public final boolean m10752q() {
        return this.musicVideosLocked_;
    }

    /* JADX INFO: renamed from: r */
    public final boolean m10753r() {
        return this.otherVideosLocked_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
