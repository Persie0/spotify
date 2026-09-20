package com.spotify.messages;

import com.google.protobuf.AbstractC0269h;
import p204p.mal;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes8.dex */
public final class CreatePlaylist extends AbstractC0269h implements sre0 {
    private static final CreatePlaylist DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER = null;
    public static final int PLAYLIST_URI_FIELD_NUMBER = 3;
    public static final int SOURCE_CONTEXT_URI_FIELD_NUMBER = 2;
    public static final int SOURCE_VIEW_URI_FIELD_NUMBER = 1;
    private int bitField0_;
    private String sourceViewUri_ = "";
    private String sourceContextUri_ = "";
    private String playlistUri_ = "";

    static {
        CreatePlaylist createPlaylist = new CreatePlaylist();
        DEFAULT_INSTANCE = createPlaylist;
        AbstractC0269h.registerDefaultInstance(CreatePlaylist.class, createPlaylist);
    }

    private CreatePlaylist() {
    }

    /* JADX INFO: renamed from: n */
    public static void m13824n(CreatePlaylist createPlaylist, String str) {
        createPlaylist.getClass();
        str.getClass();
        createPlaylist.bitField0_ |= 4;
        createPlaylist.playlistUri_ = str;
    }

    /* JADX INFO: renamed from: o */
    public static void m13825o(CreatePlaylist createPlaylist, String str) {
        createPlaylist.getClass();
        str.getClass();
        createPlaylist.bitField0_ |= 2;
        createPlaylist.sourceContextUri_ = str;
    }

    /* JADX INFO: renamed from: p */
    public static void m13826p(CreatePlaylist createPlaylist, String str) {
        createPlaylist.getClass();
        str.getClass();
        createPlaylist.bitField0_ |= 1;
        createPlaylist.sourceViewUri_ = str;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static mal m13827q() {
        return (mal) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002", new Object[]{"bitField0_", "sourceViewUri_", "sourceContextUri_", "playlistUri_"});
        }
        if (iOrdinal == 3) {
            return new CreatePlaylist();
        }
        if (iOrdinal == 4) {
            return new mal(DEFAULT_INSTANCE);
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
        synchronized (CreatePlaylist.class) {
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
