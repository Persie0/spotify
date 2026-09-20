package com.spotify.highlightsstats.data.proto.p076v2;

import com.google.protobuf.AbstractC0269h;
import com.google.protobuf.Timestamp;
import com.spotify.highlightsstats.EntityImage;
import p204p.ore0;
import p204p.pre0;
import p204p.q67;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes7.dex */
public final class AvailablePeriod extends AbstractC0269h implements sre0 {
    public static final int ACCESSIBILITY_DESCRIPTION_FIELD_NUMBER = 6;
    public static final int ADDITIONAL_TEXT_FIELD_NUMBER = 5;
    private static final AvailablePeriod DEFAULT_INSTANCE;
    public static final int IMAGE_FIELD_NUMBER = 2;
    private static volatile r2n0 PARSER = null;
    public static final int SUBTITLE_FIELD_NUMBER = 4;
    public static final int TIMESTAMP_FIELD_NUMBER = 1;
    public static final int TITLE_FIELD_NUMBER = 3;
    private int bitField0_;
    private EntityImage image_;
    private Timestamp timestamp_;
    private String title_ = "";
    private String subtitle_ = "";
    private String additionalText_ = "";
    private String accessibilityDescription_ = "";

    static {
        AvailablePeriod availablePeriod = new AvailablePeriod();
        DEFAULT_INSTANCE = availablePeriod;
        AbstractC0269h.registerDefaultInstance(AvailablePeriod.class, availablePeriod);
    }

    private AvailablePeriod() {
    }

    /* JADX INFO: renamed from: p */
    public static AvailablePeriod m11511p() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003Ȉ\u0004Ȉ\u0005Ȉ\u0006Ȉ", new Object[]{"bitField0_", "timestamp_", "image_", "title_", "subtitle_", "additionalText_", "accessibilityDescription_"});
        }
        if (iOrdinal == 3) {
            return new AvailablePeriod();
        }
        if (iOrdinal == 4) {
            return new q67(DEFAULT_INSTANCE, 24);
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
        synchronized (AvailablePeriod.class) {
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

    /* JADX INFO: renamed from: n */
    public final String m11512n() {
        return this.accessibilityDescription_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final String m11513o() {
        return this.additionalText_;
    }

    /* JADX INFO: renamed from: q */
    public final EntityImage m11514q() {
        EntityImage entityImage = this.image_;
        return entityImage == null ? EntityImage.m11281n() : entityImage;
    }

    /* JADX INFO: renamed from: r */
    public final Timestamp m11515r() {
        Timestamp timestamp = this.timestamp_;
        return timestamp == null ? Timestamp.m1965q() : timestamp;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
