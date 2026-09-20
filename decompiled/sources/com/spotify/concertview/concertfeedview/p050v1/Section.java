package com.spotify.concertview.concertfeedview.p050v1;

import com.google.protobuf.AbstractC0269h;
import java.util.List;
import p204p.ae50;
import p204p.i2z0;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.t5z0;
import p204p.z110;

/* JADX INFO: loaded from: classes6.dex */
public final class Section extends AbstractC0269h implements sre0 {
    private static final Section DEFAULT_INSTANCE;
    public static final int EMPTY_VIEW_FIELD_NUMBER = 5;
    public static final int ITEMS_FIELD_NUMBER = 4;
    public static final int KIND_FIELD_NUMBER = 3;
    public static final int METADATA_FIELD_NUMBER = 7;
    private static volatile r2n0 PARSER = null;
    public static final int TITLE_FIELD_NUMBER = 1;
    public static final int UBI_IDENTIFIER_FIELD_NUMBER = 6;
    private int bitField0_;
    private EmptyView emptyView_;
    private int kind_;
    private SectionMetadata metadata_;
    private SectionTitle title_;
    private ae50 items_ = AbstractC0269h.emptyProtobufList();
    private String ubiIdentifier_ = "";

    static {
        Section section = new Section();
        DEFAULT_INSTANCE = section;
        AbstractC0269h.registerDefaultInstance(Section.class, section);
    }

    private Section() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0001\u0001\u0007\u0006\u0000\u0001\u0000\u0001ဉ\u0000\u0003\f\u0004\u001b\u0005ဉ\u0001\u0006ለ\u0002\u0007ဉ\u0003", new Object[]{"bitField0_", "title_", "kind_", "items_", Item.class, "emptyView_", "ubiIdentifier_", "metadata_"});
        }
        if (iOrdinal == 3) {
            return new Section();
        }
        if (iOrdinal == 4) {
            return new i2z0(DEFAULT_INSTANCE, 10);
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
        synchronized (Section.class) {
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

    public final List getItemsList() {
        return this.items_;
    }

    /* JADX INFO: renamed from: n */
    public final t5z0 m7263n() {
        t5z0 t5z0Var;
        switch (this.kind_) {
            case 0:
                t5z0Var = t5z0.FEED_SECTION_KIND_UNSPECIFIED;
                break;
            case 1:
                t5z0Var = t5z0.FEED_SECTION_KIND_GRID;
                break;
            case 2:
                t5z0Var = t5z0.FEED_SECTION_KIND_CAROUSEL;
                break;
            case 3:
                t5z0Var = t5z0.FEED_SECTION_KIND_LIST;
                break;
            case 4:
                t5z0Var = t5z0.FEED_SECTION_KIND_LIST_HERO;
                break;
            case 5:
                t5z0Var = t5z0.FEED_SECTION_KIND_LIST_WIDE;
                break;
            case 6:
                t5z0Var = t5z0.FEED_SECTION_KIND_LIST_DATE_LOCATION;
                break;
            default:
                t5z0Var = null;
                break;
        }
        return t5z0Var == null ? t5z0.UNRECOGNIZED : t5z0Var;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final SectionMetadata m7264o() {
        SectionMetadata sectionMetadata = this.metadata_;
        return sectionMetadata == null ? SectionMetadata.m7271n() : sectionMetadata;
    }

    /* JADX INFO: renamed from: p */
    public final SectionTitle m7265p() {
        SectionTitle sectionTitle = this.title_;
        return sectionTitle == null ? SectionTitle.m7273p() : sectionTitle;
    }

    /* JADX INFO: renamed from: q */
    public final String m7266q() {
        return this.ubiIdentifier_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
