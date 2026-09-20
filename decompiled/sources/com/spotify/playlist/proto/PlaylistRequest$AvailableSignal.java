package com.spotify.playlist.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.g6f0;
import p204p.gva;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sop0;
import p204p.sre0;
import p204p.z110;
import p204p.zmp0;

/* JADX INFO: loaded from: classes2.dex */
public final class PlaylistRequest$AvailableSignal extends AbstractC0269h implements sre0 {
    public static final int DATA_FIELD_NUMBER = 3;
    private static final PlaylistRequest$AvailableSignal DEFAULT_INSTANCE;
    public static final int NAME_FIELD_NUMBER = 1;
    private static volatile r2n0 PARSER = null;
    public static final int STATE_FIELD_NUMBER = 2;
    private int bitField0_;
    private int state_;
    private String name_ = "";
    private gva data_ = gva.f84678b;

    static {
        PlaylistRequest$AvailableSignal playlistRequest$AvailableSignal = new PlaylistRequest$AvailableSignal();
        DEFAULT_INSTANCE = playlistRequest$AvailableSignal;
        AbstractC0269h.registerDefaultInstance(PlaylistRequest$AvailableSignal.class, playlistRequest$AvailableSignal);
    }

    private PlaylistRequest$AvailableSignal() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002᠌\u0001\u0003ည\u0002", new Object[]{"bitField0_", "name_", "state_", g6f0.f77037j, "data_"});
        }
        if (iOrdinal == 3) {
            return new PlaylistRequest$AvailableSignal();
        }
        if (iOrdinal == 4) {
            return new zmp0(6);
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
        synchronized (PlaylistRequest$AvailableSignal.class) {
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

    public final gva getData() {
        return this.data_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.sre0
    public final /* bridge */ /* synthetic */ pre0 getDefaultInstanceForType() {
        return getDefaultInstanceForType();
    }

    public final String getName() {
        return this.name_;
    }

    public final boolean hasData() {
        return (this.bitField0_ & 4) != 0;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final sop0 m18569o() {
        sop0 sop0Var;
        int i = this.state_;
        sop0 sop0Var2 = sop0.READY;
        if (i != 0) {
            sop0Var = i != 1 ? null : sop0.PENDING;
        } else {
            sop0Var = sop0Var2;
        }
        return sop0Var == null ? sop0Var2 : sop0Var;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
