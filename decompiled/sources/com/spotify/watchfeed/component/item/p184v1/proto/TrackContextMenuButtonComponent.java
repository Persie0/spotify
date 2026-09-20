package com.spotify.watchfeed.component.item.p184v1.proto;

import com.google.protobuf.AbstractC0269h;
import com.spotify.watchfeed.component.model.p187v1.proto.Album;
import com.spotify.watchfeed.component.model.p187v1.proto.Artist;
import com.spotify.watchfeed.component.model.p187v1.proto.Track;
import java.util.List;
import p204p.ae50;
import p204p.gva;
import p204p.ore0;
import p204p.p981;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes11.dex */
public final class TrackContextMenuButtonComponent extends AbstractC0269h implements sre0 {
    public static final int ACCESSIBILITY_TEXT_FIELD_NUMBER = 5;
    public static final int ALBUM_FIELD_NUMBER = 2;
    public static final int ARTISTS_FIELD_NUMBER = 3;
    private static final TrackContextMenuButtonComponent DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER = null;
    public static final int REPORTING_URI_FIELD_NUMBER = 4;
    public static final int TRACK_FIELD_NUMBER = 1;
    private Album album_;
    private int bitField0_;
    private Track track_;
    private ae50 artists_ = AbstractC0269h.emptyProtobufList();
    private String reportingUri_ = "";
    private String accessibilityText_ = "";

    static {
        TrackContextMenuButtonComponent trackContextMenuButtonComponent = new TrackContextMenuButtonComponent();
        DEFAULT_INSTANCE = trackContextMenuButtonComponent;
        AbstractC0269h.registerDefaultInstance(TrackContextMenuButtonComponent.class, trackContextMenuButtonComponent);
    }

    private TrackContextMenuButtonComponent() {
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: r */
    public static TrackContextMenuButtonComponent m22759r(gva gvaVar) {
        return (TrackContextMenuButtonComponent) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, gvaVar);
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003\u001b\u0004Ȉ\u0005Ȉ", new Object[]{"bitField0_", "track_", "album_", "artists_", Artist.class, "reportingUri_", "accessibilityText_"});
        }
        if (iOrdinal == 3) {
            return new TrackContextMenuButtonComponent();
        }
        if (iOrdinal == 4) {
            return new p981(DEFAULT_INSTANCE, 13);
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
        synchronized (TrackContextMenuButtonComponent.class) {
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

    public final List getArtistsList() {
        return this.artists_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.sre0
    public final /* bridge */ /* synthetic */ pre0 getDefaultInstanceForType() {
        return getDefaultInstanceForType();
    }

    /* JADX INFO: renamed from: n */
    public final String m22760n() {
        return this.accessibilityText_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final Album m22761o() {
        Album album = this.album_;
        return album == null ? Album.m22875o() : album;
    }

    /* JADX INFO: renamed from: p */
    public final String m22762p() {
        return this.reportingUri_;
    }

    /* JADX INFO: renamed from: q */
    public final Track m22763q() {
        Track track = this.track_;
        return track == null ? Track.m22919n() : track;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
