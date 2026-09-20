package com.spotify.playlist.proto;

import com.google.protobuf.AbstractC0269h;
import com.spotify.cosmos.util.proto.Extension;
import com.spotify.cosmos.util.proto.ImageGroup;
import java.util.List;
import p204p.ae50;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.vmp0;
import p204p.z110;

/* JADX INFO: loaded from: classes2.dex */
public final class PlaylistMetadata extends AbstractC0269h implements sre0 {
    public static final int AI_CURATION_REFERENCE_ID_FIELD_NUMBER = 23;
    public static final int ALLOWS_FIELD_NUMBER = 18;
    public static final int BROWSABLE_OFFLINE_FIELD_NUMBER = 11;
    public static final int CAN_REPORT_ANNOTATION_ABUSE_FIELD_NUMBER = 16;
    public static final int COLLABORATIVE_FIELD_NUMBER = 5;
    private static final PlaylistMetadata DEFAULT_INSTANCE;
    public static final int DELETED_BY_OWNER_FIELD_NUMBER = 24;
    public static final int DESCRIPTION_FIELD_NUMBER = 7;
    public static final int DESCRIPTION_FROM_ANNOTATE_FIELD_NUMBER = 12;
    public static final int EXTENSION_FIELD_NUMBER = 21;
    public static final int FOLLOWED_FIELD_NUMBER = 9;
    public static final int FORMAT_LIST_ATTRIBUTES_FIELD_NUMBER = 15;
    public static final int FORMAT_LIST_TYPE_FIELD_NUMBER = 14;
    public static final int IS_LOADED_FIELD_NUMBER = 17;
    public static final int LENGTH_IGNORING_TEXT_FILTER_FIELD_NUMBER = 22;
    public static final int LINK_FIELD_NUMBER = 1;
    public static final int LOAD_STATE_FIELD_NUMBER = 19;
    public static final int MADE_FOR_FIELD_NUMBER = 20;
    public static final int NAME_FIELD_NUMBER = 2;
    public static final int OWNED_BY_SELF_FIELD_NUMBER = 4;
    public static final int OWNER_FIELD_NUMBER = 3;
    private static volatile r2n0 PARSER = null;
    public static final int PICTURES_FIELD_NUMBER = 8;
    public static final int PICTURE_FROM_ANNOTATE_FIELD_NUMBER = 13;
    public static final int PUBLISHED_FIELD_NUMBER = 10;
    public static final int SORT_ORDERS_FIELD_NUMBER = 26;
    public static final int TAG_DEFINITIONS_FIELD_NUMBER = 27;
    public static final int TOTAL_LENGTH_FIELD_NUMBER = 6;
    public static final int USER_CREATED_FIELD_NUMBER = 25;
    private Allows allows_;
    private int bitField0_;
    private boolean browsableOffline_;
    private boolean canReportAnnotationAbuse_;
    private boolean collaborative_;
    private boolean deletedByOwner_;
    private boolean descriptionFromAnnotate_;
    private boolean followed_;
    private boolean isLoaded_;
    private int lengthIgnoringTextFilter_;
    private User madeFor_;
    private boolean ownedBySelf_;
    private User owner_;
    private boolean pictureFromAnnotate_;
    private ImageGroup pictures_;
    private boolean published_;
    private int totalLength_;
    private boolean userCreated_;
    private String link_ = "";
    private String name_ = "";
    private String description_ = "";
    private String formatListType_ = "";
    private ae50 formatListAttributes_ = AbstractC0269h.emptyProtobufList();
    private String loadState_ = "";
    private ae50 extension_ = AbstractC0269h.emptyProtobufList();
    private String aiCurationReferenceId_ = "";
    private ae50 sortOrders_ = AbstractC0269h.emptyProtobufList();
    private ae50 tagDefinitions_ = AbstractC0269h.emptyProtobufList();

    static {
        PlaylistMetadata playlistMetadata = new PlaylistMetadata();
        DEFAULT_INSTANCE = playlistMetadata;
        AbstractC0269h.registerDefaultInstance(PlaylistMetadata.class, playlistMetadata);
    }

    private PlaylistMetadata() {
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: r */
    public static PlaylistMetadata m18540r() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: renamed from: A */
    public final boolean m18541A() {
        return this.published_;
    }

    /* JADX INFO: renamed from: B */
    public final int m18542B() {
        return this.sortOrders_.size();
    }

    /* JADX INFO: renamed from: C */
    public final ae50 m18543C() {
        return this.sortOrders_;
    }

    /* JADX INFO: renamed from: D */
    public final int m18544D() {
        return this.tagDefinitions_.size();
    }

    /* JADX INFO: renamed from: E */
    public final ae50 m18545E() {
        return this.tagDefinitions_;
    }

    /* JADX INFO: renamed from: F */
    public final int m18546F() {
        return this.totalLength_;
    }

    /* JADX INFO: renamed from: G */
    public final boolean m18547G() {
        return this.userCreated_;
    }

    /* JADX INFO: renamed from: H */
    public final boolean m18548H() {
        return (this.bitField0_ & 262144) != 0;
    }

    /* JADX INFO: renamed from: I */
    public final boolean m18549I() {
        return (this.bitField0_ & 4) != 0;
    }

    /* JADX INFO: renamed from: J */
    public final boolean m18550J() {
        return (this.bitField0_ & 128) != 0;
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u001b\u0000\u0001\u0001\u001b\u001b\u0000\u0004\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဉ\u0002\u0004ဇ\u0003\u0005ဇ\u0004\u0006ဋ\u0005\u0007ဈ\u0006\bဉ\u0007\tဇ\b\nဇ\t\u000bဇ\n\fဇ\u000b\rဇ\f\u000eဈ\r\u000f\u001b\u0010ဇ\u000e\u0011ဇ\u000f\u0012ဉ\u0010\u0013ဈ\u0011\u0014ဉ\u0012\u0015\u001b\u0016ဋ\u0013\u0017ဈ\u0014\u0018ဇ\u0015\u0019ဇ\u0016\u001a\u001b\u001b\u001b", new Object[]{"bitField0_", "link_", "name_", "owner_", "ownedBySelf_", "collaborative_", "totalLength_", "description_", "pictures_", "followed_", "published_", "browsableOffline_", "descriptionFromAnnotate_", "pictureFromAnnotate_", "formatListType_", "formatListAttributes_", FormatListAttribute.class, "canReportAnnotationAbuse_", "isLoaded_", "allows_", "loadState_", "madeFor_", "extension_", Extension.class, "lengthIgnoringTextFilter_", "aiCurationReferenceId_", "deletedByOwner_", "userCreated_", "sortOrders_", ProvidedSortOrder.class, "tagDefinitions_", ProvidedTagDefinition.class});
        }
        if (iOrdinal == 3) {
            return new PlaylistMetadata();
        }
        if (iOrdinal == 4) {
            return new vmp0();
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
        synchronized (PlaylistMetadata.class) {
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

    public final boolean getCollaborative() {
        return this.collaborative_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.sre0
    public final /* bridge */ /* synthetic */ pre0 getDefaultInstanceForType() {
        return getDefaultInstanceForType();
    }

    public final boolean getDeletedByOwner() {
        return this.deletedByOwner_;
    }

    public final String getDescription() {
        return this.description_;
    }

    public final List getExtensionList() {
        return this.extension_;
    }

    public final boolean getFollowed() {
        return this.followed_;
    }

    public final int getFormatListAttributesCount() {
        return this.formatListAttributes_.size();
    }

    public final List getFormatListAttributesList() {
        return this.formatListAttributes_;
    }

    public final String getLink() {
        return this.link_;
    }

    public final String getName() {
        return this.name_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final String m18551o() {
        return this.aiCurationReferenceId_;
    }

    /* JADX INFO: renamed from: p */
    public final boolean m18552p() {
        return this.browsableOffline_;
    }

    /* JADX INFO: renamed from: q */
    public final boolean m18553q() {
        return this.canReportAnnotationAbuse_;
    }

    /* JADX INFO: renamed from: s */
    public final String m18554s() {
        return this.formatListType_;
    }

    /* JADX INFO: renamed from: t */
    public final boolean m18555t() {
        return this.isLoaded_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }

    /* JADX INFO: renamed from: u */
    public final int m18556u() {
        return this.lengthIgnoringTextFilter_;
    }

    /* JADX INFO: renamed from: v */
    public final User m18557v() {
        User user = this.madeFor_;
        return user == null ? User.m18670o() : user;
    }

    /* JADX INFO: renamed from: w */
    public final boolean m18558w() {
        return this.ownedBySelf_;
    }

    /* JADX INFO: renamed from: x */
    public final User m18559x() {
        User user = this.owner_;
        return user == null ? User.m18670o() : user;
    }

    /* JADX INFO: renamed from: y */
    public final boolean m18560y() {
        return this.pictureFromAnnotate_;
    }

    /* JADX INFO: renamed from: z */
    public final ImageGroup m18561z() {
        ImageGroup imageGroup = this.pictures_;
        return imageGroup == null ? ImageGroup.getDefaultInstance() : imageGroup;
    }
}
