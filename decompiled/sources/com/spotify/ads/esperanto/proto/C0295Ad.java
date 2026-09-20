package com.spotify.ads.esperanto.proto;

import com.google.protobuf.AbstractC0269h;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import p204p.C1997j;
import p204p.ae50;
import p204p.dh0;
import p204p.eh0;
import p204p.ihc0;
import p204p.oo0;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: renamed from: com.spotify.ads.esperanto.proto.Ad */
/* JADX INFO: loaded from: classes4.dex */
public final class C0295Ad extends AbstractC0269h implements sre0 {
    public static final int AD_ID_FIELD_NUMBER = 1;
    public static final int AUDIO_FIELD_NUMBER = 5;
    public static final int CLICKTHROUGH_URL_FIELD_NUMBER = 8;
    public static final int COMPANIONS_FIELD_NUMBER = 14;
    public static final int COVER_ART_FIELD_NUMBER = 4;
    private static final C0295Ad DEFAULT_INSTANCE;
    public static final int DISPLAY_FIELD_NUMBER = 7;
    public static final int FORMAT_FIELD_NUMBER = 12;
    public static final int IS_DSA_ELIGIBLE_FIELD_NUMBER = 13;
    public static final int IS_DUMMY_FIELD_NUMBER = 3;
    public static final int METADATA_FIELD_NUMBER = 2;
    private static volatile r2n0 PARSER = null;
    public static final int REQUEST_ID_FIELD_NUMBER = 11;
    public static final int SLOT_FIELD_NUMBER = 10;
    public static final int TRACKING_EVENTS_FIELD_NUMBER = 9;
    public static final int VERIFICATIONS_FIELD_NUMBER = 15;
    public static final int VIDEO_FIELD_NUMBER = 6;
    private String adId_;
    private ae50 audio_;
    private String clickthroughUrl_;
    private ae50 companions_;
    private ae50 coverArt_;
    private ae50 display_;
    private int format_;
    private boolean isDsaEligible_;
    private boolean isDummy_;
    private ihc0 metadata_;
    private String requestId_;
    private String slot_;
    private ihc0 trackingEvents_;
    private ae50 verifications_;
    private ae50 video_;

    static {
        C0295Ad c0295Ad = new C0295Ad();
        DEFAULT_INSTANCE = c0295Ad;
        AbstractC0269h.registerDefaultInstance(C0295Ad.class, c0295Ad);
    }

    private C0295Ad() {
        ihc0 ihc0Var = ihc0.f102235b;
        this.metadata_ = ihc0Var;
        this.trackingEvents_ = ihc0Var;
        this.adId_ = "";
        this.coverArt_ = AbstractC0269h.emptyProtobufList();
        this.audio_ = AbstractC0269h.emptyProtobufList();
        this.video_ = AbstractC0269h.emptyProtobufList();
        this.display_ = AbstractC0269h.emptyProtobufList();
        this.clickthroughUrl_ = "";
        this.slot_ = "";
        this.requestId_ = "";
        this.companions_ = AbstractC0269h.emptyProtobufList();
        this.verifications_ = AbstractC0269h.emptyProtobufList();
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: r */
    public static C0295Ad m2563r() {
        return DEFAULT_INSTANCE;
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u000f\u0000\u0000\u0001\u000f\u000f\u0002\u0006\u0000\u0001Ȉ\u00022\u0003\u0007\u0004\u001b\u0005\u001b\u0006\u001b\u0007\u001b\bȈ\t2\nȈ\u000bȈ\f\f\r\u0007\u000e\u001b\u000f\u001b", new Object[]{"adId_", "metadata_", dh0.f48932a, "isDummy_", "coverArt_", AdMedia.class, "audio_", AdMedia.class, "video_", AdMedia.class, "display_", AdMedia.class, "clickthroughUrl_", "trackingEvents_", eh0.f59438a, "slot_", "requestId_", "format_", "isDsaEligible_", "companions_", Companion.class, "verifications_", Verification.class});
        }
        if (iOrdinal == 3) {
            return new C0295Ad();
        }
        if (iOrdinal == 4) {
            return new C1997j(DEFAULT_INSTANCE, 20);
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
        synchronized (C0295Ad.class) {
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

    public final Map getMetadataMap() {
        return Collections.unmodifiableMap(this.metadata_);
    }

    public final List getVideoList() {
        return this.video_;
    }

    /* JADX INFO: renamed from: n */
    public final String m2564n() {
        return this.adId_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final String m2565o() {
        return this.clickthroughUrl_;
    }

    /* JADX INFO: renamed from: p */
    public final ae50 m2566p() {
        return this.companions_;
    }

    /* JADX INFO: renamed from: q */
    public final ae50 m2567q() {
        return this.coverArt_;
    }

    /* JADX INFO: renamed from: s */
    public final ae50 m2568s() {
        return this.display_;
    }

    /* JADX INFO: renamed from: t */
    public final oo0 m2569t() {
        oo0 oo0VarM67447a = oo0.m67447a(this.format_);
        return oo0VarM67447a == null ? oo0.UNRECOGNIZED : oo0VarM67447a;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }

    /* JADX INFO: renamed from: u */
    public final boolean m2570u() {
        return this.isDsaEligible_;
    }

    /* JADX INFO: renamed from: v */
    public final boolean m2571v() {
        return this.isDummy_;
    }

    /* JADX INFO: renamed from: w */
    public final String m2572w() {
        return this.requestId_;
    }

    /* JADX INFO: renamed from: x */
    public final String m2573x() {
        return this.slot_;
    }
}
