package com.spotify.listuxplatformconsumers.standard.sections.extender.datasource.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.AbstractC1733c9;
import p204p.AbstractC2118m8;
import p204p.ae50;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.ujp0;
import p204p.z110;

/* JADX INFO: loaded from: classes7.dex */
public final class PlaylistExtender extends AbstractC0269h implements sre0 {
    private static final PlaylistExtender DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER = null;
    public static final int PREVIOUS_REC_URIS_FIELD_NUMBER = 2;
    public static final int SESSION_ID_FIELD_NUMBER = 1;
    private String sessionId_ = "";
    private ae50 previousRecUris_ = AbstractC0269h.emptyProtobufList();

    static {
        PlaylistExtender playlistExtender = new PlaylistExtender();
        DEFAULT_INSTANCE = playlistExtender;
        AbstractC0269h.registerDefaultInstance(PlaylistExtender.class, playlistExtender);
    }

    private PlaylistExtender() {
    }

    /* JADX INFO: renamed from: n */
    public static void m13032n(PlaylistExtender playlistExtender, Iterable iterable) {
        ae50 ae50Var = playlistExtender.previousRecUris_;
        if (!((AbstractC1733c9) ae50Var).f35342a) {
            playlistExtender.previousRecUris_ = AbstractC0269h.mutableCopy(ae50Var);
        }
        AbstractC2118m8.addAll(iterable, playlistExtender.previousRecUris_);
    }

    /* JADX INFO: renamed from: o */
    public static void m13033o(PlaylistExtender playlistExtender, String str) {
        playlistExtender.getClass();
        str.getClass();
        playlistExtender.sessionId_ = str;
    }

    /* JADX INFO: renamed from: p */
    public static ujp0 m13034p() {
        return (ujp0) DEFAULT_INSTANCE.createBuilder();
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001Ȉ\u0002Ț", new Object[]{"sessionId_", "previousRecUris_"});
        }
        if (iOrdinal == 3) {
            return new PlaylistExtender();
        }
        if (iOrdinal == 4) {
            return new ujp0(DEFAULT_INSTANCE);
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
        synchronized (PlaylistExtender.class) {
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
