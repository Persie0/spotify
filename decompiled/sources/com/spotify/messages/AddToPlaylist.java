package com.spotify.messages;

import com.google.protobuf.AbstractC0269h;
import p204p.AbstractC1733c9;
import p204p.AbstractC2118m8;
import p204p.ae50;
import p204p.ore0;
import p204p.pl1;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes8.dex */
public final class AddToPlaylist extends AbstractC0269h implements sre0 {
    private static final AddToPlaylist DEFAULT_INSTANCE;
    public static final int ITEM_URIS_FIELD_NUMBER = 1;
    public static final int NEW_PLAYLIST_FIELD_NUMBER = 5;
    private static volatile r2n0 PARSER = null;
    public static final int PLAYLIST_URI_FIELD_NUMBER = 4;
    public static final int SOURCE_CONTEXT_URI_FIELD_NUMBER = 3;
    public static final int SOURCE_VIEW_URI_FIELD_NUMBER = 2;
    private int bitField0_;
    private boolean newPlaylist_;
    private ae50 itemUris_ = AbstractC0269h.emptyProtobufList();
    private String sourceViewUri_ = "";
    private String sourceContextUri_ = "";
    private String playlistUri_ = "";

    static {
        AddToPlaylist addToPlaylist = new AddToPlaylist();
        DEFAULT_INSTANCE = addToPlaylist;
        AbstractC0269h.registerDefaultInstance(AddToPlaylist.class, addToPlaylist);
    }

    private AddToPlaylist() {
    }

    /* JADX INFO: renamed from: n */
    public static void m13536n(AddToPlaylist addToPlaylist, Iterable iterable) {
        ae50 ae50Var = addToPlaylist.itemUris_;
        if (!((AbstractC1733c9) ae50Var).f35342a) {
            addToPlaylist.itemUris_ = AbstractC0269h.mutableCopy(ae50Var);
        }
        AbstractC2118m8.addAll(iterable, addToPlaylist.itemUris_);
    }

    /* JADX INFO: renamed from: o */
    public static void m13537o(AddToPlaylist addToPlaylist, boolean z) {
        addToPlaylist.bitField0_ |= 8;
        addToPlaylist.newPlaylist_ = z;
    }

    /* JADX INFO: renamed from: p */
    public static void m13538p(AddToPlaylist addToPlaylist, String str) {
        addToPlaylist.getClass();
        str.getClass();
        addToPlaylist.bitField0_ |= 4;
        addToPlaylist.playlistUri_ = str;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static void m13539q(AddToPlaylist addToPlaylist, String str) {
        addToPlaylist.getClass();
        str.getClass();
        addToPlaylist.bitField0_ |= 2;
        addToPlaylist.sourceContextUri_ = str;
    }

    /* JADX INFO: renamed from: r */
    public static void m13540r(AddToPlaylist addToPlaylist, String str) {
        addToPlaylist.getClass();
        str.getClass();
        addToPlaylist.bitField0_ |= 1;
        addToPlaylist.sourceViewUri_ = str;
    }

    /* JADX INFO: renamed from: s */
    public static pl1 m13541s() {
        return (pl1) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001\u001a\u0002ဈ\u0000\u0003ဈ\u0001\u0004ဈ\u0002\u0005ဇ\u0003", new Object[]{"bitField0_", "itemUris_", "sourceViewUri_", "sourceContextUri_", "playlistUri_", "newPlaylist_"});
        }
        if (iOrdinal == 3) {
            return new AddToPlaylist();
        }
        if (iOrdinal == 4) {
            return new pl1(DEFAULT_INSTANCE);
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
        synchronized (AddToPlaylist.class) {
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
