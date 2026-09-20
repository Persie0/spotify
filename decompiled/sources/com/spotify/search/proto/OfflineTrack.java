package com.spotify.search.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.ae50;
import p204p.bpj0;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes10.dex */
public final class OfflineTrack extends AbstractC0269h implements sre0 {
    public static final int ALBUM_NAME_FIELD_NUMBER = 4;
    public static final int ARTIST_NAMES_FIELD_NUMBER = 5;
    private static final OfflineTrack DEFAULT_INSTANCE;
    public static final int EXPLICIT_FIELD_NUMBER = 6;
    public static final int IMAGE_URI_FIELD_NUMBER = 3;
    public static final int MOGEF19_FIELD_NUMBER = 7;
    public static final int NAME_FIELD_NUMBER = 1;
    private static volatile r2n0 PARSER = null;
    public static final int PREMIUM_ONLY_FIELD_NUMBER = 8;
    public static final int URI_FIELD_NUMBER = 2;
    private boolean explicit_;
    private boolean mogef19_;
    private boolean premiumOnly_;
    private String name_ = "";
    private String uri_ = "";
    private String imageUri_ = "";
    private String albumName_ = "";
    private ae50 artistNames_ = AbstractC0269h.emptyProtobufList();

    static {
        OfflineTrack offlineTrack = new OfflineTrack();
        DEFAULT_INSTANCE = offlineTrack;
        AbstractC0269h.registerDefaultInstance(OfflineTrack.class, offlineTrack);
    }

    private OfflineTrack() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\b\u0000\u0000\u0001\b\b\u0000\u0001\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004Ȉ\u0005Ț\u0006\u0007\u0007\u0007\b\u0007", new Object[]{"name_", "uri_", "imageUri_", "albumName_", "artistNames_", "explicit_", "mogef19_", "premiumOnly_"});
        }
        if (iOrdinal == 3) {
            return new OfflineTrack();
        }
        if (iOrdinal == 4) {
            return new bpj0(DEFAULT_INSTANCE, 27);
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
        synchronized (OfflineTrack.class) {
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

    public final String getName() {
        return this.name_;
    }

    public final String getUri() {
        return this.uri_;
    }

    /* JADX INFO: renamed from: n */
    public final String m20717n() {
        return this.albumName_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final ae50 m20718o() {
        return this.artistNames_;
    }

    /* JADX INFO: renamed from: p */
    public final boolean m20719p() {
        return this.explicit_;
    }

    /* JADX INFO: renamed from: q */
    public final String m20720q() {
        return this.imageUri_;
    }

    /* JADX INFO: renamed from: r */
    public final boolean m20721r() {
        return this.mogef19_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
