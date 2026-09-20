package com.spotify.messages;

import com.google.protobuf.AbstractC0269h;
import java.util.ArrayList;
import p204p.AbstractC1733c9;
import p204p.AbstractC2118m8;
import p204p.ae50;
import p204p.cb0;
import p204p.lau;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes8.dex */
public final class ActivePlaylistEntityPlugins extends AbstractC0269h implements sre0 {
    public static final int ALL_SONGS_CONFIGURATION_FIELD_NUMBER = 11;
    public static final int COMPONENT_CONFIGURATION_FIELD_NUMBER = 13;
    public static final int CONTEXT_MENU_HEADER_FIELD_NUMBER = 21;
    public static final int CONTEXT_MENU_ITEMS_FIELD_NUMBER = 14;
    public static final int DATA_SOURCE_FIELD_NUMBER = 6;
    private static final ActivePlaylistEntityPlugins DEFAULT_INSTANCE;
    public static final int DERIVED_FORMAT_LIST_TYPE_FIELD_NUMBER = 3;
    public static final int ENTITY_METADATA_EXTENSIONS_FIELD_NUMBER = 26;
    public static final int FILTERCHIPS_FIELD_NUMBER = 30;
    public static final int HEADER_ACTIONS_FIELD_NUMBER = 17;
    public static final int HEADER_CREATOR_FIELD_NUMBER = 28;
    public static final int HEADER_FIELD_NUMBER = 4;
    public static final int HEADER_METADATA_FIELD_NUMBER = 18;
    public static final int HEADER_PLAY_BUTTON_FIELD_NUMBER = 19;
    public static final int HEADER_PRE_TITLE_FIELD_NUMBER = 29;
    public static final int HEADER_STORY_FIELD_NUMBER = 31;
    public static final int ITEM_CONTEXT_MENU_CONFIGURATION_FIELD_NUMBER = 23;
    public static final int ITEM_LIST_CONFIGURATION_FIELD_NUMBER = 12;
    public static final int ITEM_LIST_FIELD_NUMBER = 5;
    public static final int ITEM_LIST_ROWS_FIELD_NUMBER = 8;
    public static final int ITEM_LIST_ROW_INTERACTIONS_FIELD_NUMBER = 25;
    public static final int ITEM_METADATA_EXTENSIONS_FIELD_NUMBER = 24;
    public static final int LICENSE_LAYOUT_FIELD_NUMBER = 1;
    public static final int PAGE_IDENTIFIER_FIELD_NUMBER = 7;
    private static volatile r2n0 PARSER = null;
    public static final int PLAYBACK_CONFIGURATION_FIELD_NUMBER = 22;
    public static final int PLAYLIST_COMPONENTS_FIELD_NUMBER = 16;
    public static final int RAW_FORMAT_LIST_TYPE_FIELD_NUMBER = 2;
    public static final int SECTIONS_ABOVE_FIELD_NUMBER = 9;
    public static final int SECTIONS_BELOW_FIELD_NUMBER = 10;
    public static final int SECTIONS_INLINE_FIELD_NUMBER = 20;
    public static final int SORT_ITEMS_FIELD_NUMBER = 27;
    public static final int TRACK_CLOUD_CONFIGURATION_FIELD_NUMBER = 15;
    private int bitField0_;
    private String licenseLayout_ = "";
    private String rawFormatListType_ = "";
    private String derivedFormatListType_ = "";
    private String header_ = "";
    private String itemList_ = "";
    private String dataSource_ = "";
    private String pageIdentifier_ = "";
    private ae50 itemListRows_ = AbstractC0269h.emptyProtobufList();
    private ae50 sectionsAbove_ = AbstractC0269h.emptyProtobufList();
    private ae50 sectionsBelow_ = AbstractC0269h.emptyProtobufList();
    private String allSongsConfiguration_ = "";
    private String itemListConfiguration_ = "";
    private String componentConfiguration_ = "";
    private ae50 contextMenuItems_ = AbstractC0269h.emptyProtobufList();
    private String trackCloudConfiguration_ = "";
    private ae50 playlistComponents_ = AbstractC0269h.emptyProtobufList();
    private ae50 headerActions_ = AbstractC0269h.emptyProtobufList();
    private String headerMetadata_ = "";
    private String headerPlayButton_ = "";
    private ae50 sectionsInline_ = AbstractC0269h.emptyProtobufList();
    private String contextMenuHeader_ = "";
    private String playbackConfiguration_ = "";
    private String itemContextMenuConfiguration_ = "";
    private ae50 itemMetadataExtensions_ = AbstractC0269h.emptyProtobufList();
    private ae50 itemListRowInteractions_ = AbstractC0269h.emptyProtobufList();
    private ae50 entityMetadataExtensions_ = AbstractC0269h.emptyProtobufList();
    private ae50 sortItems_ = AbstractC0269h.emptyProtobufList();
    private String headerCreator_ = "";
    private String headerPreTitle_ = "";
    private String filterchips_ = "";
    private String headerStory_ = "";

    static {
        ActivePlaylistEntityPlugins activePlaylistEntityPlugins = new ActivePlaylistEntityPlugins();
        DEFAULT_INSTANCE = activePlaylistEntityPlugins;
        AbstractC0269h.registerDefaultInstance(ActivePlaylistEntityPlugins.class, activePlaylistEntityPlugins);
    }

    private ActivePlaylistEntityPlugins() {
    }

    /* JADX INFO: renamed from: A */
    public static void m13509A(ActivePlaylistEntityPlugins activePlaylistEntityPlugins, String str) {
        activePlaylistEntityPlugins.getClass();
        str.getClass();
        activePlaylistEntityPlugins.bitField0_ |= 4;
        activePlaylistEntityPlugins.derivedFormatListType_ = str;
    }

    /* JADX INFO: renamed from: B */
    public static void m13510B(ActivePlaylistEntityPlugins activePlaylistEntityPlugins, String str) {
        activePlaylistEntityPlugins.getClass();
        activePlaylistEntityPlugins.bitField0_ |= 8;
        activePlaylistEntityPlugins.header_ = str;
    }

    /* JADX INFO: renamed from: C */
    public static void m13511C(ActivePlaylistEntityPlugins activePlaylistEntityPlugins, String str) {
        activePlaylistEntityPlugins.getClass();
        activePlaylistEntityPlugins.bitField0_ |= 65536;
        activePlaylistEntityPlugins.headerCreator_ = str;
    }

    /* JADX INFO: renamed from: D */
    public static void m13512D(ActivePlaylistEntityPlugins activePlaylistEntityPlugins, String str) {
        activePlaylistEntityPlugins.getClass();
        activePlaylistEntityPlugins.bitField0_ |= 2048;
        activePlaylistEntityPlugins.headerMetadata_ = str;
    }

    /* JADX INFO: renamed from: E */
    public static void m13513E(ActivePlaylistEntityPlugins activePlaylistEntityPlugins, String str) {
        activePlaylistEntityPlugins.getClass();
        activePlaylistEntityPlugins.bitField0_ |= 4096;
        activePlaylistEntityPlugins.headerPlayButton_ = str;
    }

    /* JADX INFO: renamed from: F */
    public static void m13514F(ActivePlaylistEntityPlugins activePlaylistEntityPlugins, String str) {
        activePlaylistEntityPlugins.getClass();
        activePlaylistEntityPlugins.bitField0_ |= 131072;
        activePlaylistEntityPlugins.headerPreTitle_ = str;
    }

    /* JADX INFO: renamed from: G */
    public static void m13515G(ActivePlaylistEntityPlugins activePlaylistEntityPlugins, String str) {
        activePlaylistEntityPlugins.getClass();
        activePlaylistEntityPlugins.bitField0_ |= 524288;
        activePlaylistEntityPlugins.headerStory_ = str;
    }

    /* JADX INFO: renamed from: H */
    public static void m13516H(ActivePlaylistEntityPlugins activePlaylistEntityPlugins, String str) {
        activePlaylistEntityPlugins.getClass();
        activePlaylistEntityPlugins.bitField0_ |= 32768;
        activePlaylistEntityPlugins.itemContextMenuConfiguration_ = str;
    }

    /* JADX INFO: renamed from: I */
    public static void m13517I(ActivePlaylistEntityPlugins activePlaylistEntityPlugins) {
        activePlaylistEntityPlugins.getClass();
        activePlaylistEntityPlugins.bitField0_ |= 16;
        activePlaylistEntityPlugins.itemList_ = "none";
    }

    /* JADX INFO: renamed from: J */
    public static void m13518J(ActivePlaylistEntityPlugins activePlaylistEntityPlugins, String str) {
        activePlaylistEntityPlugins.getClass();
        str.getClass();
        activePlaylistEntityPlugins.bitField0_ |= 1;
        activePlaylistEntityPlugins.licenseLayout_ = str;
    }

    /* JADX INFO: renamed from: K */
    public static void m13519K(ActivePlaylistEntityPlugins activePlaylistEntityPlugins, String str) {
        activePlaylistEntityPlugins.getClass();
        activePlaylistEntityPlugins.bitField0_ |= 64;
        activePlaylistEntityPlugins.pageIdentifier_ = str;
    }

    /* JADX INFO: renamed from: L */
    public static void m13520L(ActivePlaylistEntityPlugins activePlaylistEntityPlugins, String str) {
        activePlaylistEntityPlugins.getClass();
        activePlaylistEntityPlugins.bitField0_ |= 2;
        activePlaylistEntityPlugins.rawFormatListType_ = str;
    }

    /* JADX INFO: renamed from: M */
    public static void m13521M(ActivePlaylistEntityPlugins activePlaylistEntityPlugins, String str) {
        activePlaylistEntityPlugins.getClass();
        activePlaylistEntityPlugins.bitField0_ |= 1024;
        activePlaylistEntityPlugins.trackCloudConfiguration_ = str;
    }

    /* JADX INFO: renamed from: N */
    public static cb0 m13522N() {
        return (cb0) DEFAULT_INSTANCE.createBuilder();
    }

    /* JADX INFO: renamed from: n */
    public static void m13523n(ActivePlaylistEntityPlugins activePlaylistEntityPlugins) {
        ae50 ae50Var = activePlaylistEntityPlugins.contextMenuItems_;
        if (!((AbstractC1733c9) ae50Var).f35342a) {
            activePlaylistEntityPlugins.contextMenuItems_ = AbstractC0269h.mutableCopy(ae50Var);
        }
        AbstractC2118m8.addAll(lau.f131415a, activePlaylistEntityPlugins.contextMenuItems_);
    }

    /* JADX INFO: renamed from: o */
    public static void m13524o(ActivePlaylistEntityPlugins activePlaylistEntityPlugins, ArrayList arrayList) {
        ae50 ae50Var = activePlaylistEntityPlugins.entityMetadataExtensions_;
        if (!((AbstractC1733c9) ae50Var).f35342a) {
            activePlaylistEntityPlugins.entityMetadataExtensions_ = AbstractC0269h.mutableCopy(ae50Var);
        }
        AbstractC2118m8.addAll(arrayList, activePlaylistEntityPlugins.entityMetadataExtensions_);
    }

    /* JADX INFO: renamed from: p */
    public static void m13525p(ActivePlaylistEntityPlugins activePlaylistEntityPlugins, Iterable iterable) {
        ae50 ae50Var = activePlaylistEntityPlugins.headerActions_;
        if (!((AbstractC1733c9) ae50Var).f35342a) {
            activePlaylistEntityPlugins.headerActions_ = AbstractC0269h.mutableCopy(ae50Var);
        }
        AbstractC2118m8.addAll(iterable, activePlaylistEntityPlugins.headerActions_);
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static void m13526q(ActivePlaylistEntityPlugins activePlaylistEntityPlugins, Iterable iterable) {
        ae50 ae50Var = activePlaylistEntityPlugins.itemListRowInteractions_;
        if (!((AbstractC1733c9) ae50Var).f35342a) {
            activePlaylistEntityPlugins.itemListRowInteractions_ = AbstractC0269h.mutableCopy(ae50Var);
        }
        AbstractC2118m8.addAll(iterable, activePlaylistEntityPlugins.itemListRowInteractions_);
    }

    /* JADX INFO: renamed from: r */
    public static void m13527r(ActivePlaylistEntityPlugins activePlaylistEntityPlugins, Iterable iterable) {
        ae50 ae50Var = activePlaylistEntityPlugins.itemListRows_;
        if (!((AbstractC1733c9) ae50Var).f35342a) {
            activePlaylistEntityPlugins.itemListRows_ = AbstractC0269h.mutableCopy(ae50Var);
        }
        AbstractC2118m8.addAll(iterable, activePlaylistEntityPlugins.itemListRows_);
    }

    /* JADX INFO: renamed from: s */
    public static void m13528s(ActivePlaylistEntityPlugins activePlaylistEntityPlugins, ArrayList arrayList) {
        ae50 ae50Var = activePlaylistEntityPlugins.itemMetadataExtensions_;
        if (!((AbstractC1733c9) ae50Var).f35342a) {
            activePlaylistEntityPlugins.itemMetadataExtensions_ = AbstractC0269h.mutableCopy(ae50Var);
        }
        AbstractC2118m8.addAll(arrayList, activePlaylistEntityPlugins.itemMetadataExtensions_);
    }

    /* JADX INFO: renamed from: t */
    public static void m13529t(ActivePlaylistEntityPlugins activePlaylistEntityPlugins, Iterable iterable) {
        ae50 ae50Var = activePlaylistEntityPlugins.playlistComponents_;
        if (!((AbstractC1733c9) ae50Var).f35342a) {
            activePlaylistEntityPlugins.playlistComponents_ = AbstractC0269h.mutableCopy(ae50Var);
        }
        AbstractC2118m8.addAll(iterable, activePlaylistEntityPlugins.playlistComponents_);
    }

    /* JADX INFO: renamed from: u */
    public static void m13530u(ActivePlaylistEntityPlugins activePlaylistEntityPlugins, Iterable iterable) {
        ae50 ae50Var = activePlaylistEntityPlugins.sectionsAbove_;
        if (!((AbstractC1733c9) ae50Var).f35342a) {
            activePlaylistEntityPlugins.sectionsAbove_ = AbstractC0269h.mutableCopy(ae50Var);
        }
        AbstractC2118m8.addAll(iterable, activePlaylistEntityPlugins.sectionsAbove_);
    }

    /* JADX INFO: renamed from: v */
    public static void m13531v(ActivePlaylistEntityPlugins activePlaylistEntityPlugins, Iterable iterable) {
        ae50 ae50Var = activePlaylistEntityPlugins.sectionsBelow_;
        if (!((AbstractC1733c9) ae50Var).f35342a) {
            activePlaylistEntityPlugins.sectionsBelow_ = AbstractC0269h.mutableCopy(ae50Var);
        }
        AbstractC2118m8.addAll(iterable, activePlaylistEntityPlugins.sectionsBelow_);
    }

    /* JADX INFO: renamed from: w */
    public static void m13532w(ActivePlaylistEntityPlugins activePlaylistEntityPlugins) {
        ae50 ae50Var = activePlaylistEntityPlugins.sectionsInline_;
        if (!((AbstractC1733c9) ae50Var).f35342a) {
            activePlaylistEntityPlugins.sectionsInline_ = AbstractC0269h.mutableCopy(ae50Var);
        }
        AbstractC2118m8.addAll(lau.f131415a, activePlaylistEntityPlugins.sectionsInline_);
    }

    /* JADX INFO: renamed from: x */
    public static void m13533x(ActivePlaylistEntityPlugins activePlaylistEntityPlugins, String str) {
        activePlaylistEntityPlugins.getClass();
        activePlaylistEntityPlugins.bitField0_ |= 128;
        activePlaylistEntityPlugins.allSongsConfiguration_ = str;
    }

    /* JADX INFO: renamed from: y */
    public static void m13534y(ActivePlaylistEntityPlugins activePlaylistEntityPlugins, String str) {
        activePlaylistEntityPlugins.getClass();
        activePlaylistEntityPlugins.bitField0_ |= 512;
        activePlaylistEntityPlugins.componentConfiguration_ = str;
    }

    /* JADX INFO: renamed from: z */
    public static void m13535z(ActivePlaylistEntityPlugins activePlaylistEntityPlugins) {
        activePlaylistEntityPlugins.getClass();
        activePlaylistEntityPlugins.bitField0_ |= 8192;
        activePlaylistEntityPlugins.contextMenuHeader_ = "default";
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u001f\u0000\u0001\u0001\u001f\u001f\u0000\u000b\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဈ\u0005\u0007ဈ\u0006\b\u001a\t\u001a\n\u001a\u000bဈ\u0007\fဈ\b\rဈ\t\u000e\u001a\u000fဈ\n\u0010\u001a\u0011\u001a\u0012ဈ\u000b\u0013ဈ\f\u0014\u001a\u0015ဈ\r\u0016ဈ\u000e\u0017ဈ\u000f\u0018\u001a\u0019\u001a\u001a\u001a\u001b\u001a\u001cဈ\u0010\u001dဈ\u0011\u001eဈ\u0012\u001fဈ\u0013", new Object[]{"bitField0_", "licenseLayout_", "rawFormatListType_", "derivedFormatListType_", "header_", "itemList_", "dataSource_", "pageIdentifier_", "itemListRows_", "sectionsAbove_", "sectionsBelow_", "allSongsConfiguration_", "itemListConfiguration_", "componentConfiguration_", "contextMenuItems_", "trackCloudConfiguration_", "playlistComponents_", "headerActions_", "headerMetadata_", "headerPlayButton_", "sectionsInline_", "contextMenuHeader_", "playbackConfiguration_", "itemContextMenuConfiguration_", "itemMetadataExtensions_", "itemListRowInteractions_", "entityMetadataExtensions_", "sortItems_", "headerCreator_", "headerPreTitle_", "filterchips_", "headerStory_"});
        }
        if (iOrdinal == 3) {
            return new ActivePlaylistEntityPlugins();
        }
        if (iOrdinal == 4) {
            return new cb0(DEFAULT_INSTANCE);
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
        synchronized (ActivePlaylistEntityPlugins.class) {
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

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
