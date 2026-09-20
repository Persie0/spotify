package com.spotify.extendedmetadata.extensions.simplecardtrait.proto;

import com.google.protobuf.AbstractC0269h;
import com.google.protobuf.Duration;
import com.google.protobuf.Timestamp;
import p204p.ae50;
import p204p.ore0;
import p204p.pre0;
import p204p.qr11;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.x4x0;
import p204p.z110;

/* JADX INFO: loaded from: classes2.dex */
public final class SimpleCardTrait extends AbstractC0269h implements sre0 {
    public static final int ACCESSIBILITY_FIELD_NUMBER = 6;
    public static final int ANIMATION_URL_FIELD_NUMBER = 11;
    public static final int CREATORS_FIELD_NUMBER = 8;
    private static final SimpleCardTrait DEFAULT_INSTANCE;
    public static final int DURATION_FIELD_NUMBER = 10;
    public static final int IMAGE_URI_FIELD_NUMBER = 1;
    public static final int LABELS_FIELD_NUMBER = 5;
    public static final int NAVIGATION_URI_FIELD_NUMBER = 4;
    private static volatile r2n0 PARSER = null;
    public static final int PUBLISH_TIME_FIELD_NUMBER = 9;
    public static final int RESTRICTION_FIELD_NUMBER = 7;
    public static final int SUBTITLE_FIELD_NUMBER = 3;
    public static final int TITLE_FIELD_NUMBER = 2;
    public static final int TITLE_TEXT_COLOR_FIELD_NUMBER = 12;
    private int bitField0_;
    private Duration duration_;
    private Timestamp publishTime_;
    private int restriction_;
    private String imageUri_ = "";
    private String title_ = "";
    private String subtitle_ = "";
    private String navigationUri_ = "";
    private ae50 labels_ = AbstractC0269h.emptyProtobufList();
    private String accessibility_ = "";
    private ae50 creators_ = AbstractC0269h.emptyProtobufList();
    private String animationUrl_ = "";
    private String titleTextColor_ = "";

    static {
        SimpleCardTrait simpleCardTrait = new SimpleCardTrait();
        DEFAULT_INSTANCE = simpleCardTrait;
        AbstractC0269h.registerDefaultInstance(SimpleCardTrait.class, simpleCardTrait);
    }

    private SimpleCardTrait() {
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: y */
    public static SimpleCardTrait m10475y(byte[] bArr) {
        return (SimpleCardTrait) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\f\u0000\u0001\u0001\f\f\u0000\u0002\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004Ȉ\u0005\u001b\u0006Ȉ\u0007\f\b\u001b\tဉ\u0000\nဉ\u0001\u000bለ\u0002\fለ\u0003", new Object[]{"bitField0_", "imageUri_", "title_", "subtitle_", "navigationUri_", "labels_", Label.class, "accessibility_", "restriction_", "creators_", Creator.class, "publishTime_", "duration_", "animationUrl_", "titleTextColor_"});
        }
        if (iOrdinal == 3) {
            return new SimpleCardTrait();
        }
        if (iOrdinal == 4) {
            return new qr11(25);
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
        synchronized (SimpleCardTrait.class) {
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

    public final Duration getDuration() {
        Duration duration = this.duration_;
        return duration == null ? Duration.m1928p() : duration;
    }

    public final String getSubtitle() {
        return this.subtitle_;
    }

    public final String getTitle() {
        return this.title_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final String m10476o() {
        return this.accessibility_;
    }

    /* JADX INFO: renamed from: p */
    public final String m10477p() {
        return this.animationUrl_;
    }

    /* JADX INFO: renamed from: q */
    public final ae50 m10478q() {
        return this.creators_;
    }

    /* JADX INFO: renamed from: r */
    public final String m10479r() {
        return this.imageUri_;
    }

    /* JADX INFO: renamed from: s */
    public final ae50 m10480s() {
        return this.labels_;
    }

    /* JADX INFO: renamed from: t */
    public final String m10481t() {
        return this.navigationUri_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }

    /* JADX INFO: renamed from: u */
    public final Timestamp m10482u() {
        Timestamp timestamp = this.publishTime_;
        return timestamp == null ? Timestamp.m1965q() : timestamp;
    }

    /* JADX INFO: renamed from: v */
    public final x4x0 m10483v() {
        x4x0 x4x0Var;
        int i = this.restriction_;
        if (i == 0) {
            x4x0Var = x4x0.NONE;
        } else if (i != 1) {
            x4x0Var = i != 2 ? null : x4x0.IS_19_PLUS;
        } else {
            x4x0Var = x4x0.IS_EXPLICIT;
        }
        return x4x0Var == null ? x4x0.UNRECOGNIZED : x4x0Var;
    }

    /* JADX INFO: renamed from: w */
    public final String m10484w() {
        return this.titleTextColor_;
    }

    /* JADX INFO: renamed from: x */
    public final boolean m10485x() {
        return (this.bitField0_ & 8) != 0;
    }
}
