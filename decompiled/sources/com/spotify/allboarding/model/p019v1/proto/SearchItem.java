package com.spotify.allboarding.model.p019v1.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.dxy0;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.six0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes3.dex */
public final class SearchItem extends AbstractC0269h implements sre0 {
    public static final int CONTENT_PICKER_ITEM_FIELD_NUMBER = 6;
    private static final SearchItem DEFAULT_INSTANCE;
    public static final int IMAGE_URL_FIELD_NUMBER = 5;
    public static final int LOGGING_FIELD_NUMBER = 7;
    private static volatile r2n0 PARSER = null;
    public static final int SECTION_IDENTIFIER_FIELD_NUMBER = 8;
    public static final int SUBTITLE_FIELD_NUMBER = 4;
    public static final int TITLE_FIELD_NUMBER = 3;
    public static final int TYPE_FIELD_NUMBER = 1;
    public static final int URI_FIELD_NUMBER = 2;
    private int bitField0_;
    private Item contentPickerItem_;
    private NullableString imageUrl_;
    private Logging logging_;
    private NullableString subtitle_;
    private int type_;
    private String uri_ = "";
    private String title_ = "";
    private String sectionIdentifier_ = "";

    static {
        SearchItem searchItem = new SearchItem();
        DEFAULT_INSTANCE = searchItem;
        AbstractC0269h.registerDefaultInstance(SearchItem.class, searchItem);
    }

    private SearchItem() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001\f\u0002Ȉ\u0003Ȉ\u0004ဉ\u0000\u0005ဉ\u0001\u0006ဉ\u0002\u0007ဉ\u0003\bȈ", new Object[]{"bitField0_", "type_", "uri_", "title_", "subtitle_", "imageUrl_", "contentPickerItem_", "logging_", "sectionIdentifier_"});
        }
        if (iOrdinal == 3) {
            return new SearchItem();
        }
        if (iOrdinal == 4) {
            return new six0(DEFAULT_INSTANCE, 22);
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
        synchronized (SearchItem.class) {
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

    public final String getTitle() {
        return this.title_;
    }

    public final String getUri() {
        return this.uri_;
    }

    /* JADX INFO: renamed from: n */
    public final Item m3136n() {
        Item item = this.contentPickerItem_;
        return item == null ? Item.m3121o() : item;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final NullableString m3137o() {
        NullableString nullableString = this.imageUrl_;
        return nullableString == null ? NullableString.m3129n() : nullableString;
    }

    /* JADX INFO: renamed from: p */
    public final String m3138p() {
        return this.sectionIdentifier_;
    }

    /* JADX INFO: renamed from: q */
    public final NullableString m3139q() {
        NullableString nullableString = this.subtitle_;
        return nullableString == null ? NullableString.m3129n() : nullableString;
    }

    /* JADX INFO: renamed from: r */
    public final dxy0 m3140r() {
        dxy0 dxy0Var;
        int i = this.type_;
        if (i == 0) {
            dxy0Var = dxy0.DEFAULT;
        } else if (i == 1) {
            dxy0Var = dxy0.ARTIST;
        } else if (i != 2) {
            dxy0Var = i != 3 ? null : dxy0.TRACK;
        } else {
            dxy0Var = dxy0.SHOW;
        }
        return dxy0Var == null ? dxy0.UNRECOGNIZED : dxy0Var;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
