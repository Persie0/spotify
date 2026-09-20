package com.spotify.allboarding.model.p020v2.proto;

import com.google.protobuf.AbstractC0269h;
import com.spotify.allboarding.model.p019v1.proto.NullableString;
import com.spotify.allboarding.model.p019v1.proto.Tag;
import p204p.ae50;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.saj;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes3.dex */
public final class ContentPicker extends AbstractC0269h implements sre0 {
    private static final ContentPicker DEFAULT_INSTANCE;
    public static final int FILTERS_FIELD_NUMBER = 5;
    public static final int MIN_SELECTIONS_FIELD_NUMBER = 2;
    private static volatile r2n0 PARSER = null;
    public static final int PRIMARY_BUTTON_LABEL_FIELD_NUMBER = 6;
    public static final int SEARCH_FIELD_NUMBER = 4;
    public static final int SECONDARY_BUTTON_LABEL_FIELD_NUMBER = 7;
    public static final int SECTIONS_FIELD_NUMBER = 3;
    public static final int TITLE_FIELD_NUMBER = 1;
    private int bitField0_;
    private int minSelections_;
    private NullableString primaryButtonLabel_;
    private SearchConfiguration search_;
    private NullableString secondaryButtonLabel_;
    private NullableString title_;
    private ae50 sections_ = AbstractC0269h.emptyProtobufList();
    private ae50 filters_ = AbstractC0269h.emptyProtobufList();

    static {
        ContentPicker contentPicker = new ContentPicker();
        DEFAULT_INSTANCE = contentPicker;
        AbstractC0269h.registerDefaultInstance(ContentPicker.class, contentPicker);
    }

    private ContentPicker() {
    }

    /* JADX INFO: renamed from: n */
    public static ContentPicker m3185n() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0002\u0000\u0001ဉ\u0000\u0002\u0004\u0003\u001b\u0004ဉ\u0001\u0005\u001b\u0006ဉ\u0002\u0007ဉ\u0003", new Object[]{"bitField0_", "title_", "minSelections_", "sections_", Section.class, "search_", "filters_", Tag.class, "primaryButtonLabel_", "secondaryButtonLabel_"});
        }
        if (iOrdinal == 3) {
            return new ContentPicker();
        }
        if (iOrdinal == 4) {
            return new saj(DEFAULT_INSTANCE, 18);
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
        synchronized (ContentPicker.class) {
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
    public final ae50 m3186o() {
        return this.filters_;
    }

    /* JADX INFO: renamed from: p */
    public final int m3187p() {
        return this.minSelections_;
    }

    /* JADX INFO: renamed from: q */
    public final NullableString m3188q() {
        NullableString nullableString = this.primaryButtonLabel_;
        return nullableString == null ? NullableString.m3129n() : nullableString;
    }

    /* JADX INFO: renamed from: r */
    public final SearchConfiguration m3189r() {
        SearchConfiguration searchConfiguration = this.search_;
        return searchConfiguration == null ? SearchConfiguration.m3209n() : searchConfiguration;
    }

    /* JADX INFO: renamed from: s */
    public final NullableString m3190s() {
        NullableString nullableString = this.secondaryButtonLabel_;
        return nullableString == null ? NullableString.m3129n() : nullableString;
    }

    /* JADX INFO: renamed from: t */
    public final ae50 m3191t() {
        return this.sections_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }

    /* JADX INFO: renamed from: u */
    public final NullableString m3192u() {
        NullableString nullableString = this.title_;
        return nullableString == null ? NullableString.m3129n() : nullableString;
    }
}
