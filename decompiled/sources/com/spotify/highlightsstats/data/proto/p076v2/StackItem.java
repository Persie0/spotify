package com.spotify.highlightsstats.data.proto.p076v2;

import com.google.protobuf.AbstractC0269h;
import com.spotify.highlightsstats.EntityImage;
import com.spotify.wrapped.p194v1.proto.Paragraph;
import p204p.ct31;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes7.dex */
public final class StackItem extends AbstractC0269h implements sre0 {
    private static final StackItem DEFAULT_INSTANCE;
    public static final int IMAGE_FIELD_NUMBER = 3;
    private static volatile r2n0 PARSER = null;
    public static final int SUBTITLE_FIELD_NUMBER = 2;
    public static final int TITLE_FIELD_NUMBER = 1;
    private int bitField0_;
    private EntityImage image_;
    private Paragraph subtitle_;
    private Paragraph title_;

    static {
        StackItem stackItem = new StackItem();
        DEFAULT_INSTANCE = stackItem;
        AbstractC0269h.registerDefaultInstance(StackItem.class, stackItem);
    }

    private StackItem() {
    }

    /* JADX INFO: renamed from: n */
    public static StackItem m11650n() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002", new Object[]{"bitField0_", "title_", "subtitle_", "image_"});
        }
        if (iOrdinal == 3) {
            return new StackItem();
        }
        if (iOrdinal == 4) {
            return new ct31(DEFAULT_INSTANCE, 19);
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
        synchronized (StackItem.class) {
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

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final EntityImage m11651o() {
        EntityImage entityImage = this.image_;
        return entityImage == null ? EntityImage.m11281n() : entityImage;
    }

    /* JADX INFO: renamed from: p */
    public final Paragraph m11652p() {
        Paragraph paragraph = this.subtitle_;
        return paragraph == null ? Paragraph.m23150p() : paragraph;
    }

    /* JADX INFO: renamed from: q */
    public final Paragraph m11653q() {
        Paragraph paragraph = this.title_;
        return paragraph == null ? Paragraph.m23150p() : paragraph;
    }

    /* JADX INFO: renamed from: r */
    public final boolean m11654r() {
        return (this.bitField0_ & 4) != 0;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
