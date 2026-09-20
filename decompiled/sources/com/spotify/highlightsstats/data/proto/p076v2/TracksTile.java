package com.spotify.highlightsstats.data.proto.p076v2;

import com.google.protobuf.AbstractC0269h;
import com.spotify.wrapped.p194v1.proto.Paragraph;
import p204p.ore0;
import p204p.p981;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes7.dex */
public final class TracksTile extends AbstractC0269h implements sre0 {
    public static final int ACCESSIBILITY_DESCRIPTION_FIELD_NUMBER = 5;
    private static final TracksTile DEFAULT_INSTANCE;
    public static final int HEADER_FIELD_NUMBER = 1;
    public static final int IMAGE_URL_FIELD_NUMBER = 3;
    public static final int IS_EMPTY_FIELD_NUMBER = 6;
    private static volatile r2n0 PARSER = null;
    public static final int POSITION_CHANGE_FIELD_NUMBER = 4;
    public static final int TITLE_FIELD_NUMBER = 2;
    private int bitField0_;
    private boolean isEmpty_;
    private int positionChange_;
    private Paragraph title_;
    private String header_ = "";
    private String imageUrl_ = "";
    private String accessibilityDescription_ = "";

    static {
        TracksTile tracksTile = new TracksTile();
        DEFAULT_INSTANCE = tracksTile;
        AbstractC0269h.registerDefaultInstance(TracksTile.class, tracksTile);
    }

    private TracksTile() {
    }

    /* JADX INFO: renamed from: o */
    public static TracksTile m11731o() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001Ȉ\u0002ဉ\u0000\u0003Ȉ\u0004\u000f\u0005Ȉ\u0006\u0007", new Object[]{"bitField0_", "header_", "title_", "imageUrl_", "positionChange_", "accessibilityDescription_", "isEmpty_"});
        }
        if (iOrdinal == 3) {
            return new TracksTile();
        }
        if (iOrdinal == 4) {
            return new p981(DEFAULT_INSTANCE, 20);
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
        synchronized (TracksTile.class) {
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

    public final String getImageUrl() {
        return this.imageUrl_;
    }

    /* JADX INFO: renamed from: n */
    public final String m11732n() {
        return this.accessibilityDescription_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: p */
    public final String m11733p() {
        return this.header_;
    }

    /* JADX INFO: renamed from: q */
    public final boolean m11734q() {
        return this.isEmpty_;
    }

    /* JADX INFO: renamed from: r */
    public final int m11735r() {
        return this.positionChange_;
    }

    /* JADX INFO: renamed from: s */
    public final Paragraph m11736s() {
        Paragraph paragraph = this.title_;
        return paragraph == null ? Paragraph.m23150p() : paragraph;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
