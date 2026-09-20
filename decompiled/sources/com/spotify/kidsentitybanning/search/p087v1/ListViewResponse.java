package com.spotify.kidsentitybanning.search.p087v1;

import com.google.protobuf.AbstractC0269h;
import java.util.List;
import p204p.ae50;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sj80;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes7.dex */
public final class ListViewResponse extends AbstractC0269h implements sre0 {
    public static final int ARTISTS_FIELD_NUMBER = 4;
    public static final int CHILD_DISPLAY_NAME_FIELD_NUMBER = 1;
    private static final ListViewResponse DEFAULT_INSTANCE;
    public static final int IS_EXPLICIT_ALLOWED_FIELD_NUMBER = 2;
    private static volatile r2n0 PARSER = null;
    public static final int TRACKS_FIELD_NUMBER = 3;
    private boolean isExplicitAllowed_;
    private String childDisplayName_ = "";
    private ae50 tracks_ = AbstractC0269h.emptyProtobufList();
    private ae50 artists_ = AbstractC0269h.emptyProtobufList();

    static {
        ListViewResponse listViewResponse = new ListViewResponse();
        DEFAULT_INSTANCE = listViewResponse;
        AbstractC0269h.registerDefaultInstance(ListViewResponse.class, listViewResponse);
    }

    private ListViewResponse() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0002\u0000\u0001Ȉ\u0002\u0007\u0003\u001b\u0004\u001b", new Object[]{"childDisplayName_", "isExplicitAllowed_", "tracks_", HubTrack.class, "artists_", HubArtist.class});
        }
        if (iOrdinal == 3) {
            return new ListViewResponse();
        }
        if (iOrdinal == 4) {
            return new sj80(DEFAULT_INSTANCE, 21);
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
        synchronized (ListViewResponse.class) {
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

    public final List getTracksList() {
        return this.tracks_;
    }

    /* JADX INFO: renamed from: n */
    public final String m12191n() {
        return this.childDisplayName_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final boolean m12192o() {
        return this.isExplicitAllowed_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
