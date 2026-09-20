package com.spotify.watchfeed.component.item.p184v1;

import com.google.protobuf.AbstractC0269h;
import com.google.protobuf.Timestamp;
import com.spotify.watchfeed.component.model.p187v1.proto.Image;
import p204p.gva;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.x2q0;
import p204p.z110;

/* JADX INFO: loaded from: classes11.dex */
public final class PreReleaseCardComponent extends AbstractC0269h implements sre0 {
    public static final int ACCESSIBILITY_TEXT_FIELD_NUMBER = 8;
    public static final int ALBUM_IMAGE_FIELD_NUMBER = 5;
    public static final int ARTIST_IMAGE_FIELD_NUMBER = 6;
    public static final int COUNTDOWN_TIMESTAMP_FIELD_NUMBER = 7;
    private static final PreReleaseCardComponent DEFAULT_INSTANCE;
    public static final int DESCRIPTION_FIELD_NUMBER = 4;
    private static volatile r2n0 PARSER = null;
    public static final int REASON_FIELD_NUMBER = 11;
    public static final int SUBTITLE_FIELD_NUMBER = 3;
    public static final int TITLE_FIELD_NUMBER = 2;
    public static final int URI_FIELD_NUMBER = 1;
    private Image albumImage_;
    private Image artistImage_;
    private int bitField0_;
    private Timestamp countdownTimestamp_;
    private String uri_ = "";
    private String title_ = "";
    private String subtitle_ = "";
    private String description_ = "";
    private String accessibilityText_ = "";
    private String reason_ = "";

    static {
        PreReleaseCardComponent preReleaseCardComponent = new PreReleaseCardComponent();
        DEFAULT_INSTANCE = preReleaseCardComponent;
        AbstractC0269h.registerDefaultInstance(PreReleaseCardComponent.class, preReleaseCardComponent);
    }

    private PreReleaseCardComponent() {
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: s */
    public static PreReleaseCardComponent m22703s(gva gvaVar) {
        return (PreReleaseCardComponent) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, gvaVar);
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\t\u0000\u0001\u0001\u000b\t\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004Ȉ\u0005ဉ\u0000\u0006ဉ\u0001\u0007ဉ\u0002\bȈ\u000bȈ", new Object[]{"bitField0_", "uri_", "title_", "subtitle_", "description_", "albumImage_", "artistImage_", "countdownTimestamp_", "accessibilityText_", "reason_"});
        }
        if (iOrdinal == 3) {
            return new PreReleaseCardComponent();
        }
        if (iOrdinal == 4) {
            return new x2q0(DEFAULT_INSTANCE, 14);
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
        synchronized (PreReleaseCardComponent.class) {
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

    public final String getDescription() {
        return this.description_;
    }

    public final String getSubtitle() {
        return this.subtitle_;
    }

    public final String getTitle() {
        return this.title_;
    }

    public final String getUri() {
        return this.uri_;
    }

    /* JADX INFO: renamed from: n */
    public final String m22704n() {
        return this.accessibilityText_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final Image m22705o() {
        Image image = this.albumImage_;
        return image == null ? Image.m22897n() : image;
    }

    /* JADX INFO: renamed from: p */
    public final Image m22706p() {
        Image image = this.artistImage_;
        return image == null ? Image.m22897n() : image;
    }

    /* JADX INFO: renamed from: q */
    public final Timestamp m22707q() {
        Timestamp timestamp = this.countdownTimestamp_;
        return timestamp == null ? Timestamp.m1965q() : timestamp;
    }

    /* JADX INFO: renamed from: r */
    public final String m22708r() {
        return this.reason_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
