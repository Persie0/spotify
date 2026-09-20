package com.spotify.playlist.policy.proto;

import com.google.protobuf.AbstractC0269h;
import java.util.List;
import p204p.AbstractC1733c9;
import p204p.AbstractC2118m8;
import p204p.ae50;
import p204p.amp0;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes2.dex */
public final class PlaylistItemDecorationPolicy extends AbstractC0269h implements sre0 {
    public static final int ADDED_BY_FIELD_NUMBER = 11;
    public static final int ADD_TIME_FIELD_NUMBER = 10;
    public static final int COLLECTION_STATE_FIELD_NUMBER = 4;
    public static final int CURATION_STATE_FIELD_NUMBER = 6;
    private static final PlaylistItemDecorationPolicy DEFAULT_INSTANCE;
    public static final int EXTENSION_POLICY_FIELD_NUMBER = 2;
    public static final int FORMAT_LIST_ATTRIBUTES_FIELD_NUMBER = 8;
    public static final int METADATA_FIELD_NUMBER = 5;
    public static final int OBFUSCATION_STATE_FIELD_NUMBER = 7;
    public static final int OFFLINE_STATE_FIELD_NUMBER = 3;
    private static volatile r2n0 PARSER = null;
    public static final int ROW_ID_FIELD_NUMBER = 9;
    public static final int SAVE_SOURCE_FIELD_NUMBER = 13;
    public static final int SIGNALS_FIELD_NUMBER = 12;
    public static final int URI_FIELD_NUMBER = 1;
    private boolean addTime_;
    private UserDecorationPolicy addedBy_;
    private int bitField0_;
    private boolean collectionState_;
    private ItemCurationStatePolicy curationState_;
    private ae50 extensionPolicy_ = AbstractC0269h.emptyProtobufList();
    private boolean formatListAttributes_;
    private ItemMetadataPolicy metadata_;
    private boolean obfuscationState_;
    private ItemOfflineStateDecorationPolicy offlineState_;
    private boolean rowId_;
    private boolean saveSource_;
    private boolean signals_;
    private boolean uri_;

    static {
        PlaylistItemDecorationPolicy playlistItemDecorationPolicy = new PlaylistItemDecorationPolicy();
        DEFAULT_INSTANCE = playlistItemDecorationPolicy;
        AbstractC0269h.registerDefaultInstance(PlaylistItemDecorationPolicy.class, playlistItemDecorationPolicy);
    }

    private PlaylistItemDecorationPolicy() {
    }

    /* JADX INFO: renamed from: C */
    public static PlaylistItemDecorationPolicy m18395C() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: renamed from: H */
    public static amp0 m18396H() {
        return (amp0) DEFAULT_INSTANCE.createBuilder();
    }

    /* JADX INFO: renamed from: n */
    public static void m18397n(PlaylistItemDecorationPolicy playlistItemDecorationPolicy, Iterable iterable) {
        ae50 ae50Var = playlistItemDecorationPolicy.extensionPolicy_;
        if (!((AbstractC1733c9) ae50Var).f35342a) {
            playlistItemDecorationPolicy.extensionPolicy_ = AbstractC0269h.mutableCopy(ae50Var);
        }
        AbstractC2118m8.addAll(iterable, playlistItemDecorationPolicy.extensionPolicy_);
    }

    /* JADX INFO: renamed from: o */
    public static void m18398o(PlaylistItemDecorationPolicy playlistItemDecorationPolicy) {
        playlistItemDecorationPolicy.addTime_ = true;
    }

    /* JADX INFO: renamed from: p */
    public static void m18399p(PlaylistItemDecorationPolicy playlistItemDecorationPolicy, UserDecorationPolicy userDecorationPolicy) {
        playlistItemDecorationPolicy.getClass();
        userDecorationPolicy.getClass();
        playlistItemDecorationPolicy.addedBy_ = userDecorationPolicy;
        playlistItemDecorationPolicy.bitField0_ |= 8;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static void m18400q(PlaylistItemDecorationPolicy playlistItemDecorationPolicy, boolean z) {
        playlistItemDecorationPolicy.collectionState_ = z;
    }

    /* JADX INFO: renamed from: r */
    public static void m18401r(PlaylistItemDecorationPolicy playlistItemDecorationPolicy, ItemCurationStatePolicy itemCurationStatePolicy) {
        playlistItemDecorationPolicy.getClass();
        itemCurationStatePolicy.getClass();
        playlistItemDecorationPolicy.curationState_ = itemCurationStatePolicy;
        playlistItemDecorationPolicy.bitField0_ |= 4;
    }

    /* JADX INFO: renamed from: s */
    public static void m18402s(PlaylistItemDecorationPolicy playlistItemDecorationPolicy) {
        playlistItemDecorationPolicy.formatListAttributes_ = true;
    }

    /* JADX INFO: renamed from: t */
    public static void m18403t(PlaylistItemDecorationPolicy playlistItemDecorationPolicy, ItemMetadataPolicy itemMetadataPolicy) {
        playlistItemDecorationPolicy.getClass();
        itemMetadataPolicy.getClass();
        playlistItemDecorationPolicy.metadata_ = itemMetadataPolicy;
        playlistItemDecorationPolicy.bitField0_ |= 2;
    }

    /* JADX INFO: renamed from: u */
    public static void m18404u(PlaylistItemDecorationPolicy playlistItemDecorationPolicy) {
        playlistItemDecorationPolicy.obfuscationState_ = true;
    }

    /* JADX INFO: renamed from: v */
    public static void m18405v(PlaylistItemDecorationPolicy playlistItemDecorationPolicy, ItemOfflineStateDecorationPolicy itemOfflineStateDecorationPolicy) {
        playlistItemDecorationPolicy.getClass();
        itemOfflineStateDecorationPolicy.getClass();
        playlistItemDecorationPolicy.offlineState_ = itemOfflineStateDecorationPolicy;
        playlistItemDecorationPolicy.bitField0_ |= 1;
    }

    /* JADX INFO: renamed from: w */
    public static void m18406w(PlaylistItemDecorationPolicy playlistItemDecorationPolicy) {
        playlistItemDecorationPolicy.rowId_ = true;
    }

    /* JADX INFO: renamed from: x */
    public static void m18407x(PlaylistItemDecorationPolicy playlistItemDecorationPolicy) {
        playlistItemDecorationPolicy.saveSource_ = true;
    }

    /* JADX INFO: renamed from: y */
    public static void m18408y(PlaylistItemDecorationPolicy playlistItemDecorationPolicy) {
        playlistItemDecorationPolicy.signals_ = true;
    }

    /* JADX INFO: renamed from: z */
    public static void m18409z(PlaylistItemDecorationPolicy playlistItemDecorationPolicy, boolean z) {
        playlistItemDecorationPolicy.uri_ = z;
    }

    /* JADX INFO: renamed from: A */
    public final boolean m18410A() {
        return this.collectionState_;
    }

    /* JADX INFO: renamed from: B */
    public final ItemCurationStatePolicy m18411B() {
        ItemCurationStatePolicy itemCurationStatePolicy = this.curationState_;
        return itemCurationStatePolicy == null ? ItemCurationStatePolicy.m18311p() : itemCurationStatePolicy;
    }

    /* JADX INFO: renamed from: D */
    public final List m18412D() {
        return this.extensionPolicy_;
    }

    /* JADX INFO: renamed from: E */
    public final ItemMetadataPolicy m18413E() {
        ItemMetadataPolicy itemMetadataPolicy = this.metadata_;
        return itemMetadataPolicy == null ? ItemMetadataPolicy.m18320q() : itemMetadataPolicy;
    }

    /* JADX INFO: renamed from: F */
    public final ItemOfflineStateDecorationPolicy m18414F() {
        ItemOfflineStateDecorationPolicy itemOfflineStateDecorationPolicy = this.offlineState_;
        return itemOfflineStateDecorationPolicy == null ? ItemOfflineStateDecorationPolicy.m18325q() : itemOfflineStateDecorationPolicy;
    }

    /* JADX INFO: renamed from: G */
    public final boolean m18415G() {
        return this.uri_;
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\r\u0000\u0001\u0001\r\r\u0000\u0001\u0000\u0001\u0007\u0002\u001b\u0003ဉ\u0000\u0004\u0007\u0005ဉ\u0001\u0006ဉ\u0002\u0007\u0007\b\u0007\t\u0007\n\u0007\u000bဉ\u0003\f\u0007\r\u0007", new Object[]{"bitField0_", "uri_", "extensionPolicy_", ItemExtensionPolicy.class, "offlineState_", "collectionState_", "metadata_", "curationState_", "obfuscationState_", "formatListAttributes_", "rowId_", "addTime_", "addedBy_", "signals_", "saveSource_"});
        }
        if (iOrdinal == 3) {
            return new PlaylistItemDecorationPolicy();
        }
        if (iOrdinal == 4) {
            return new amp0(DEFAULT_INSTANCE);
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
        synchronized (PlaylistItemDecorationPolicy.class) {
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
