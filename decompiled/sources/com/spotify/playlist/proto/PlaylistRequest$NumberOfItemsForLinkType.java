package com.spotify.playlist.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.hn80;
import p204p.nq6;
import p204p.ore0;
import p204p.pop0;
import p204p.pre0;
import p204p.qop0;
import p204p.r110;
import p204p.r2n0;
import p204p.z110;

/* JADX INFO: loaded from: classes2.dex */
public final class PlaylistRequest$NumberOfItemsForLinkType extends AbstractC0269h implements qop0 {
    private static final PlaylistRequest$NumberOfItemsForLinkType DEFAULT_INSTANCE;
    public static final int LINK_TYPE_FIELD_NUMBER = 1;
    public static final int NUM_ITEMS_FIELD_NUMBER = 2;
    private static volatile r2n0 PARSER;
    private int bitField0_;
    private int linkType_;
    private int numItems_;

    static {
        PlaylistRequest$NumberOfItemsForLinkType playlistRequest$NumberOfItemsForLinkType = new PlaylistRequest$NumberOfItemsForLinkType();
        DEFAULT_INSTANCE = playlistRequest$NumberOfItemsForLinkType;
        AbstractC0269h.registerDefaultInstance(PlaylistRequest$NumberOfItemsForLinkType.class, playlistRequest$NumberOfItemsForLinkType);
    }

    private PlaylistRequest$NumberOfItemsForLinkType() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002င\u0001", new Object[]{"bitField0_", "linkType_", nq6.f157151h, "numItems_"});
        }
        if (iOrdinal == 3) {
            return new PlaylistRequest$NumberOfItemsForLinkType();
        }
        if (iOrdinal == 4) {
            return new pop0();
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
        synchronized (PlaylistRequest$NumberOfItemsForLinkType.class) {
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

    @Override // p204p.qop0
    /* JADX INFO: renamed from: h */
    public final hn80 mo18610h() {
        hn80 hn80VarM47999a = hn80.m47999a(this.linkType_);
        return hn80VarM47999a == null ? hn80.EMPTY : hn80VarM47999a;
    }

    @Override // p204p.qop0
    /* JADX INFO: renamed from: i */
    public final int mo18611i() {
        return this.numItems_;
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
