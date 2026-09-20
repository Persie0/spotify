package com.spotify.upcomingreleases.p172v1;

import com.google.protobuf.AbstractC0269h;
import com.google.protobuf.Timestamp;
import java.util.List;
import p204p.ae50;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sj80;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes6.dex */
public final class ListeningParty extends AbstractC0269h implements sre0 {
    public static final int ARTISTS_FIELD_NUMBER = 4;
    private static final ListeningParty DEFAULT_INSTANCE;
    public static final int IMAGE_URL_FIELD_NUMBER = 2;
    private static volatile r2n0 PARSER = null;
    public static final int SCHEDULED_DATE_FIELD_NUMBER = 3;
    public static final int URI_FIELD_NUMBER = 1;
    private int bitField0_;
    private Timestamp scheduledDate_;
    private String uri_ = "";
    private String imageUrl_ = "";
    private ae50 artists_ = AbstractC0269h.emptyProtobufList();

    static {
        ListeningParty listeningParty = new ListeningParty();
        DEFAULT_INSTANCE = listeningParty;
        AbstractC0269h.registerDefaultInstance(ListeningParty.class, listeningParty);
    }

    private ListeningParty() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001Ȉ\u0002Ȉ\u0003ဉ\u0000\u0004\u001b", new Object[]{"bitField0_", "uri_", "imageUrl_", "scheduledDate_", "artists_", Artist.class});
        }
        if (iOrdinal == 3) {
            return new ListeningParty();
        }
        if (iOrdinal == 4) {
            return new sj80(DEFAULT_INSTANCE, 24);
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
        synchronized (ListeningParty.class) {
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

    public final String getImageUrl() {
        return this.imageUrl_;
    }

    public final String getUri() {
        return this.uri_;
    }

    /* JADX INFO: renamed from: n */
    public final Timestamp m22015n() {
        Timestamp timestamp = this.scheduledDate_;
        return timestamp == null ? Timestamp.m1965q() : timestamp;
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
