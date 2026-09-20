package com.spotify.playlist.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.ae50;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;
import p204p.zmp0;

/* JADX INFO: loaded from: classes2.dex */
public final class PlaylistRequest$LensState extends AbstractC0269h implements sre0 {
    public static final int APPLIED_LENSES_FIELD_NUMBER = 2;
    private static final PlaylistRequest$LensState DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER = null;
    public static final int REQUESTED_LENSES_FIELD_NUMBER = 1;
    private ae50 requestedLenses_ = AbstractC0269h.emptyProtobufList();
    private ae50 appliedLenses_ = AbstractC0269h.emptyProtobufList();

    static {
        PlaylistRequest$LensState playlistRequest$LensState = new PlaylistRequest$LensState();
        DEFAULT_INSTANCE = playlistRequest$LensState;
        AbstractC0269h.registerDefaultInstance(PlaylistRequest$LensState.class, playlistRequest$LensState);
    }

    private PlaylistRequest$LensState() {
    }

    /* JADX INFO: renamed from: o */
    public static PlaylistRequest$LensState m18607o() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0002\u0000\u0001\u001b\u0002\u001b", new Object[]{"requestedLenses_", PlaylistRequest$Lens.class, "appliedLenses_", PlaylistRequest$Lens.class});
        }
        if (iOrdinal == 3) {
            return new PlaylistRequest$LensState();
        }
        if (iOrdinal == 4) {
            return new zmp0(14);
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
        synchronized (PlaylistRequest$LensState.class) {
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

    /* JADX INFO: renamed from: p */
    public final ae50 m18608p() {
        return this.requestedLenses_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
