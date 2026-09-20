package com.spotify.pam.showvalue;

import com.google.protobuf.AbstractC0269h;
import p204p.ae50;
import p204p.ne21;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes9.dex */
public final class SongDNACard extends AbstractC0269h implements sre0 {
    public static final int ACTION_TITLE_FIELD_NUMBER = 8;
    public static final int CONTRIBUTORS_FIELD_NUMBER = 4;
    private static final SongDNACard DEFAULT_INSTANCE;
    public static final int NAVIGATION_URI_FIELD_NUMBER = 7;
    private static volatile r2n0 PARSER = null;
    public static final int TOTAL_CONTRIBUTORS_FIELD_NUMBER = 5;
    public static final int TOTAL_SAMPLES_FIELD_NUMBER = 6;
    public static final int TRACK_IMAGE_URL_FIELD_NUMBER = 2;
    public static final int TRACK_NAME_FIELD_NUMBER = 1;
    public static final int TRACK_URI_FIELD_NUMBER = 3;
    private int bitField0_;
    private int totalContributors_;
    private int totalSamples_;
    private String trackName_ = "";
    private String trackImageUrl_ = "";
    private String trackUri_ = "";
    private ae50 contributors_ = AbstractC0269h.emptyProtobufList();
    private String navigationUri_ = "";
    private String actionTitle_ = "";

    static {
        SongDNACard songDNACard = new SongDNACard();
        DEFAULT_INSTANCE = songDNACard;
        AbstractC0269h.registerDefaultInstance(SongDNACard.class, songDNACard);
    }

    private SongDNACard() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\b\u0000\u0001\u0001\b\b\u0000\u0001\u0000\u0001Ȉ\u0002ለ\u0000\u0003Ȉ\u0004\u001b\u0005\u0004\u0006\u0004\u0007Ȉ\bȈ", new Object[]{"bitField0_", "trackName_", "trackImageUrl_", "trackUri_", "contributors_", SongDNAContributor.class, "totalContributors_", "totalSamples_", "navigationUri_", "actionTitle_"});
        }
        if (iOrdinal == 3) {
            return new SongDNACard();
        }
        if (iOrdinal == 4) {
            return new ne21(DEFAULT_INSTANCE, 24);
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
        synchronized (SongDNACard.class) {
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

    /* JADX INFO: renamed from: n */
    public final String m16303n() {
        return this.actionTitle_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final ae50 m16304o() {
        return this.contributors_;
    }

    /* JADX INFO: renamed from: p */
    public final String m16305p() {
        return this.navigationUri_;
    }

    /* JADX INFO: renamed from: q */
    public final int m16306q() {
        return this.totalContributors_;
    }

    /* JADX INFO: renamed from: r */
    public final int m16307r() {
        return this.totalSamples_;
    }

    /* JADX INFO: renamed from: s */
    public final String m16308s() {
        return this.trackImageUrl_;
    }

    /* JADX INFO: renamed from: t */
    public final String m16309t() {
        return this.trackName_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }

    /* JADX INFO: renamed from: u */
    public final String m16310u() {
        return this.trackUri_;
    }

    /* JADX INFO: renamed from: v */
    public final boolean m16311v() {
        return (this.bitField0_ & 1) != 0;
    }
}
