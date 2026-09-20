package com.spotify.casita.p040v1.resolved;

import com.google.protobuf.AbstractC0269h;
import com.spotify.casita.p040v1.resolved.p041dj.DjVisualMetadata;
import p204p.omr;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes5.dex */
public final class DjCallToAction extends AbstractC0269h implements sre0 {
    public static final int ANIMATION_URL_FIELD_NUMBER = 7;
    private static final DjCallToAction DEFAULT_INSTANCE;
    public static final int HEADING_FIELD_NUMBER = 6;
    private static volatile r2n0 PARSER = null;
    public static final int SUBTITLE_FIELD_NUMBER = 3;
    public static final int TITLE_FIELD_NUMBER = 2;
    public static final int TRANSCRIPT_FIELD_NUMBER = 5;
    public static final int TRANSCRIPT_KEY_FIELD_NUMBER = 8;
    public static final int URI_FIELD_NUMBER = 1;
    public static final int VISUAL_METADATA_FIELD_NUMBER = 4;
    private int bitField0_;
    private Heading heading_;
    private DjVisualMetadata visualMetadata_;
    private String uri_ = "";
    private String title_ = "";
    private String subtitle_ = "";
    private String transcript_ = "";
    private String animationUrl_ = "";
    private String transcriptKey_ = "";

    static {
        DjCallToAction djCallToAction = new DjCallToAction();
        DEFAULT_INSTANCE = djCallToAction;
        AbstractC0269h.registerDefaultInstance(DjCallToAction.class, djCallToAction);
    }

    private DjCallToAction() {
    }

    /* JADX INFO: renamed from: o */
    public static DjCallToAction m5610o() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004ဉ\u0000\u0005Ȉ\u0006ဉ\u0001\u0007Ȉ\bȈ", new Object[]{"bitField0_", "uri_", "title_", "subtitle_", "visualMetadata_", "transcript_", "heading_", "animationUrl_", "transcriptKey_"});
        }
        if (iOrdinal == 3) {
            return new DjCallToAction();
        }
        if (iOrdinal == 4) {
            return new omr(DEFAULT_INSTANCE, 9);
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
        synchronized (DjCallToAction.class) {
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
    public final String m5611n() {
        return this.animationUrl_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: p */
    public final Heading m5612p() {
        Heading heading = this.heading_;
        return heading == null ? Heading.m5646o() : heading;
    }

    /* JADX INFO: renamed from: q */
    public final String m5613q() {
        return this.transcript_;
    }

    /* JADX INFO: renamed from: r */
    public final String m5614r() {
        return this.transcriptKey_;
    }

    /* JADX INFO: renamed from: s */
    public final DjVisualMetadata m5615s() {
        DjVisualMetadata djVisualMetadata = this.visualMetadata_;
        return djVisualMetadata == null ? DjVisualMetadata.m5891p() : djVisualMetadata;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
