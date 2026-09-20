package com.spotify.mostplayed.p112v1;

import com.google.protobuf.AbstractC0269h;
import p204p.ae50;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.uro;
import p204p.z110;

/* JADX INFO: loaded from: classes8.dex */
public final class DecorationTrack extends AbstractC0269h implements sre0 {
    public static final int ALBUM_FIELD_NUMBER = 3;
    public static final int ARTISTS_FIELD_NUMBER = 4;
    public static final int CONTENT_RATING_FIELD_NUMBER = 7;
    private static final DecorationTrack DEFAULT_INSTANCE;
    public static final int EXPLICIT_FIELD_NUMBER = 6;
    public static final int NAME_FIELD_NUMBER = 2;
    private static volatile r2n0 PARSER = null;
    public static final int PREVIEW_ID_FIELD_NUMBER = 5;
    public static final int URI_FIELD_NUMBER = 1;
    private DecorationAlbum album_;
    private int bitField0_;
    private boolean explicit_;
    private String uri_ = "";
    private String name_ = "";
    private ae50 artists_ = AbstractC0269h.emptyProtobufList();
    private String previewId_ = "";
    private ae50 contentRating_ = AbstractC0269h.emptyProtobufList();

    static {
        DecorationTrack decorationTrack = new DecorationTrack();
        DEFAULT_INSTANCE = decorationTrack;
        AbstractC0269h.registerDefaultInstance(DecorationTrack.class, decorationTrack);
    }

    private DecorationTrack() {
    }

    /* JADX INFO: renamed from: n */
    public static DecorationTrack m15678n() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0002\u0000\u0001Ȉ\u0002Ȉ\u0003ဉ\u0000\u0004\u001b\u0005Ȉ\u0006\u0007\u0007\u001b", new Object[]{"bitField0_", "uri_", "name_", "album_", "artists_", DecorationArtist.class, "previewId_", "explicit_", "contentRating_", DecorationContentRating.class});
        }
        if (iOrdinal == 3) {
            return new DecorationTrack();
        }
        if (iOrdinal == 4) {
            return new uro(DEFAULT_INSTANCE, 4);
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
        synchronized (DecorationTrack.class) {
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

    public final boolean hasAlbum() {
        return (this.bitField0_ & 1) != 0;
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
