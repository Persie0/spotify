package com.spotify.watchfeedextensions.component.item.p192v1;

import com.google.protobuf.AbstractC0269h;
import com.spotify.contentagnostic.p051v2.ColorSetContrastOptions;
import com.spotify.watchfeedextensions.component.model.p193v1.Image;
import com.spotify.watchfeedextensions.component.model.p193v1.VideoFile;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;
import p204p.z5u;

/* JADX INFO: loaded from: classes11.dex */
public final class EntityExplorerButtonComponent extends AbstractC0269h implements sre0 {
    public static final int ACCESSIBILITY_TEXT_FIELD_NUMBER = 5;
    private static final EntityExplorerButtonComponent DEFAULT_INSTANCE;
    public static final int EXTRACTED_COLOR_SET_FIELD_NUMBER = 8;
    public static final int NAVIGATION_URI_FIELD_NUMBER = 1;
    private static volatile r2n0 PARSER = null;
    public static final int SUBTITLE_FIELD_NUMBER = 7;
    public static final int THUMBNAIL_IMAGE_FIELD_NUMBER = 3;
    public static final int TITLE_FIELD_NUMBER = 6;
    public static final int TOOLTIP_TEXT_FIELD_NUMBER = 4;
    public static final int VIDEO_FILE_FIELD_NUMBER = 2;
    private int bitField0_;
    private ColorSetContrastOptions extractedColorSet_;
    private Image thumbnailImage_;
    private VideoFile videoFile_;
    private String navigationUri_ = "";
    private String tooltipText_ = "";
    private String accessibilityText_ = "";
    private String title_ = "";
    private String subtitle_ = "";

    static {
        EntityExplorerButtonComponent entityExplorerButtonComponent = new EntityExplorerButtonComponent();
        DEFAULT_INSTANCE = entityExplorerButtonComponent;
        AbstractC0269h.registerDefaultInstance(EntityExplorerButtonComponent.class, entityExplorerButtonComponent);
    }

    private EntityExplorerButtonComponent() {
    }

    /* JADX INFO: renamed from: o */
    public static EntityExplorerButtonComponent m23004o() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001Ȉ\u0002ဉ\u0000\u0003ဉ\u0001\u0004Ȉ\u0005Ȉ\u0006Ȉ\u0007Ȉ\bဉ\u0002", new Object[]{"bitField0_", "navigationUri_", "videoFile_", "thumbnailImage_", "tooltipText_", "accessibilityText_", "title_", "subtitle_", "extractedColorSet_"});
        }
        if (iOrdinal == 3) {
            return new EntityExplorerButtonComponent();
        }
        if (iOrdinal == 4) {
            return new z5u(DEFAULT_INSTANCE, 22);
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
        synchronized (EntityExplorerButtonComponent.class) {
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
    public final String m23005n() {
        return this.accessibilityText_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: p */
    public final ColorSetContrastOptions m23006p() {
        ColorSetContrastOptions colorSetContrastOptions = this.extractedColorSet_;
        return colorSetContrastOptions == null ? ColorSetContrastOptions.m7804o() : colorSetContrastOptions;
    }

    /* JADX INFO: renamed from: q */
    public final String m23007q() {
        return this.navigationUri_;
    }

    /* JADX INFO: renamed from: r */
    public final Image m23008r() {
        Image image = this.thumbnailImage_;
        return image == null ? Image.m23040n() : image;
    }

    /* JADX INFO: renamed from: s */
    public final String m23009s() {
        return this.tooltipText_;
    }

    /* JADX INFO: renamed from: t */
    public final VideoFile m23010t() {
        VideoFile videoFile = this.videoFile_;
        return videoFile == null ? VideoFile.m23042n() : videoFile;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }

    /* JADX INFO: renamed from: u */
    public final boolean m23011u() {
        return (this.bitField0_ & 4) != 0;
    }
}
