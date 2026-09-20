package com.spotify.tap.p163go.events.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.cva;
import p204p.gva;
import p204p.ore0;
import p204p.pc41;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes10.dex */
public final class SpotifyGoCommandError extends AbstractC0269h implements sre0 {
    public static final int COMMAND_FIELD_NUMBER = 1;
    private static final SpotifyGoCommandError DEFAULT_INSTANCE;
    public static final int ERROR_MESSAGE_FIELD_NUMBER = 2;
    private static volatile r2n0 PARSER;
    private int bitField0_;
    private gva command_ = gva.f84678b;
    private String errorMessage_ = "";

    static {
        SpotifyGoCommandError spotifyGoCommandError = new SpotifyGoCommandError();
        DEFAULT_INSTANCE = spotifyGoCommandError;
        AbstractC0269h.registerDefaultInstance(SpotifyGoCommandError.class, spotifyGoCommandError);
    }

    private SpotifyGoCommandError() {
    }

    /* JADX INFO: renamed from: n */
    public static void m21785n(SpotifyGoCommandError spotifyGoCommandError, cva cvaVar) {
        spotifyGoCommandError.getClass();
        spotifyGoCommandError.bitField0_ |= 1;
        spotifyGoCommandError.command_ = cvaVar;
    }

    /* JADX INFO: renamed from: o */
    public static void m21786o(SpotifyGoCommandError spotifyGoCommandError, String str) {
        spotifyGoCommandError.getClass();
        str.getClass();
        spotifyGoCommandError.bitField0_ |= 2;
        spotifyGoCommandError.errorMessage_ = str;
    }

    /* JADX INFO: renamed from: p */
    public static pc41 m21787p() {
        return (pc41) DEFAULT_INSTANCE.createBuilder();
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ည\u0000\u0002ဈ\u0001", new Object[]{"bitField0_", "command_", "errorMessage_"});
        }
        if (iOrdinal == 3) {
            return new SpotifyGoCommandError();
        }
        if (iOrdinal == 4) {
            return new pc41(DEFAULT_INSTANCE);
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
        synchronized (SpotifyGoCommandError.class) {
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
