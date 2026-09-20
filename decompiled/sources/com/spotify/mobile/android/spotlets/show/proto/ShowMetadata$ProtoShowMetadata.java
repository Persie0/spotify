package com.spotify.mobile.android.spotlets.show.proto;

import com.google.protobuf.AbstractC0269h;
import java.util.List;
import p204p.ae50;
import p204p.fi11;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes8.dex */
public final class ShowMetadata$ProtoShowMetadata extends AbstractC0269h implements sre0 {
    public static final int CONSUMPTION_ORDER_FIELD_NUMBER = 10;
    public static final int COPYRIGHT_FIELD_NUMBER = 12;
    public static final int COVERS_FIELD_NUMBER = 8;
    private static final ShowMetadata$ProtoShowMetadata DEFAULT_INSTANCE;
    public static final int DESCRIPTION_FIELD_NUMBER = 3;
    public static final int EXTENSION_FIELD_NUMBER = 15;
    public static final int FORMAT_LIST_ATTRIBUTES_FIELD_NUMBER = 18;
    public static final int IS_BOOK_FIELD_NUMBER = 16;
    public static final int IS_CREATOR_CHANNEL_FIELD_NUMBER = 17;
    public static final int IS_EXPLICIT_FIELD_NUMBER = 7;
    public static final int IS_MUSIC_AND_TALK_FIELD_NUMBER = 14;
    public static final int LANGUAGE_FIELD_NUMBER = 6;
    public static final int LINK_FIELD_NUMBER = 1;
    public static final int MEDIA_TYPE_ENUM_FIELD_NUMBER = 11;
    public static final int NAME_FIELD_NUMBER = 2;
    public static final int NUM_EPISODES_FIELD_NUMBER = 9;
    private static volatile r2n0 PARSER = null;
    public static final int POPULARITY_FIELD_NUMBER = 4;
    public static final int PUBLISHER_FIELD_NUMBER = 5;
    public static final int TRAILER_URI_FIELD_NUMBER = 13;
    private int bitField0_;
    private ImageGroup$ProtoImageGroup covers_;
    private boolean isBook_;
    private boolean isCreatorChannel_;
    private boolean isExplicit_;
    private boolean isMusicAndTalk_;
    private int mediaTypeEnum_;
    private int numEpisodes_;
    private int popularity_;
    private String link_ = "";
    private String name_ = "";
    private String description_ = "";
    private String publisher_ = "";
    private String language_ = "";
    private String consumptionOrder_ = "";
    private String copyright_ = "";
    private String trailerUri_ = "";
    private ae50 extension_ = AbstractC0269h.emptyProtobufList();
    private ae50 formatListAttributes_ = AbstractC0269h.emptyProtobufList();

    static {
        ShowMetadata$ProtoShowMetadata showMetadata$ProtoShowMetadata = new ShowMetadata$ProtoShowMetadata();
        DEFAULT_INSTANCE = showMetadata$ProtoShowMetadata;
        AbstractC0269h.registerDefaultInstance(ShowMetadata$ProtoShowMetadata.class, showMetadata$ProtoShowMetadata);
    }

    private ShowMetadata$ProtoShowMetadata() {
    }

    /* JADX INFO: renamed from: p */
    public static ShowMetadata$ProtoShowMetadata m15493p() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0012\u0000\u0001\u0001\u0012\u0012\u0000\u0002\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဋ\u0003\u0005ဈ\u0004\u0006ဈ\u0005\u0007ဇ\u0006\bဉ\u0007\tဋ\b\nဈ\t\u000bင\n\fဈ\u000b\rဈ\f\u000eဇ\r\u000f\u001b\u0010ဇ\u000e\u0011ဇ\u000f\u0012\u001b", new Object[]{"bitField0_", "link_", "name_", "description_", "popularity_", "publisher_", "language_", "isExplicit_", "covers_", "numEpisodes_", "consumptionOrder_", "mediaTypeEnum_", "copyright_", "trailerUri_", "isMusicAndTalk_", "extension_", Extension.class, "isBook_", "isCreatorChannel_", "formatListAttributes_", ShowMetadata$ProtoFormatListAttribute.class});
        }
        if (iOrdinal == 3) {
            return new ShowMetadata$ProtoShowMetadata();
        }
        if (iOrdinal == 4) {
            return new fi11(DEFAULT_INSTANCE, 16);
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
        synchronized (ShowMetadata$ProtoShowMetadata.class) {
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

    public final String getConsumptionOrder() {
        return this.consumptionOrder_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.sre0
    public final /* bridge */ /* synthetic */ pre0 getDefaultInstanceForType() {
        return getDefaultInstanceForType();
    }

    public final String getDescription() {
        return this.description_;
    }

    public final List getExtensionList() {
        return this.extension_;
    }

    public final List getFormatListAttributesList() {
        return this.formatListAttributes_;
    }

    public final boolean getIsBook() {
        return this.isBook_;
    }

    public final boolean getIsExplicit() {
        return this.isExplicit_;
    }

    public final boolean getIsMusicAndTalk() {
        return this.isMusicAndTalk_;
    }

    public final String getLink() {
        return this.link_;
    }

    public final int getMediaTypeEnum() {
        return this.mediaTypeEnum_;
    }

    public final String getName() {
        return this.name_;
    }

    public final String getPublisher() {
        return this.publisher_;
    }

    public final String getTrailerUri() {
        return this.trailerUri_;
    }

    public final boolean hasCovers() {
        return (this.bitField0_ & 128) != 0;
    }

    public final boolean hasMediaTypeEnum() {
        return (this.bitField0_ & 1024) != 0;
    }

    /* JADX INFO: renamed from: n */
    public final String m15494n() {
        return this.copyright_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final ImageGroup$ProtoImageGroup m15495o() {
        ImageGroup$ProtoImageGroup imageGroup$ProtoImageGroup = this.covers_;
        return imageGroup$ProtoImageGroup == null ? ImageGroup$ProtoImageGroup.m15473n() : imageGroup$ProtoImageGroup;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
