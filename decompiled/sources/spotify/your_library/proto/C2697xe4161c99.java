package spotify.your_library.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.ae50;
import p204p.ebe1;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.woe1;
import p204p.z110;

/* JADX INFO: renamed from: spotify.your_library.proto.YourLibraryDecoratedEntityOuterClass$YourLibraryPlaylistExtraInfo */
/* JADX INFO: loaded from: classes11.dex */
public final class C2697xe4161c99 extends AbstractC0269h implements sre0 {
    public static final int CAN_ADD_FIELD_NUMBER = 9;
    public static final int CAN_VIEW_FIELD_NUMBER = 6;
    public static final int CREATOR_NAME_FIELD_NUMBER = 1;
    public static final int CREATOR_URI_FIELD_NUMBER = 8;
    private static final C2697xe4161c99 DEFAULT_INSTANCE;
    public static final int FROM_FOLDER_FIELD_NUMBER = 14;
    public static final int IS_EMPTY_PREDEFINED_FIELD_NUMBER = 17;
    public static final int IS_LOADING_FIELD_NUMBER = 5;
    public static final int IS_PRIVATE_FIELD_NUMBER = 22;
    public static final int IS_PROMPT_PLAYLIST_FIELD_NUMBER = 20;
    public static final int IS_PUBLISHED_FIELD_NUMBER = 21;
    public static final int MADE_FOR_NAME_FIELD_NUMBER = 10;
    public static final int MADE_FOR_URI_FIELD_NUMBER = 11;
    public static final int MIXING_ACTIVE_FIELD_NUMBER = 16;
    public static final int NAME_PREFIX_FIELD_NUMBER = 15;
    public static final int NUMBER_OF_ITEMS_PER_LINK_TYPE_FIELD_NUMBER = 12;
    public static final int OWNED_BY_SELF_FIELD_NUMBER = 13;
    private static volatile r2n0 PARSER = null;
    public static final int PROMPT_GENERATION_STATUS_FIELD_NUMBER = 18;
    public static final int PROMPT_IS_PERSONALIZED_FIELD_NUMBER = 19;
    public static final int ROW_ID_FIELD_NUMBER = 7;
    private int bitField0_;
    private boolean canAdd_;
    private boolean canView_;
    private C2698x41f2cde1 fromFolder_;
    private boolean isEmptyPredefined_;
    private boolean isLoading_;
    private boolean isPrivate_;
    private boolean isPromptPlaylist_;
    private boolean isPublished_;
    private boolean mixingActive_;
    private boolean ownedBySelf_;
    private int promptGenerationStatus_;
    private boolean promptIsPersonalized_;
    private String creatorName_ = "";
    private String creatorUri_ = "";
    private String rowId_ = "";
    private String madeForName_ = "";
    private String madeForUri_ = "";
    private ae50 numberOfItemsPerLinkType_ = AbstractC0269h.emptyProtobufList();
    private String namePrefix_ = "";

    static {
        C2697xe4161c99 c2697xe4161c99 = new C2697xe4161c99();
        DEFAULT_INSTANCE = c2697xe4161c99;
        AbstractC0269h.registerDefaultInstance(C2697xe4161c99.class, c2697xe4161c99);
    }

    private C2697xe4161c99() {
    }

    /* JADX INFO: renamed from: p */
    public static C2697xe4161c99 m98290p() {
        return DEFAULT_INSTANCE;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: A */
    public final woe1 m98291A() {
        woe1 woe1Var;
        int i = this.promptGenerationStatus_;
        if (i == 0) {
            woe1Var = woe1.MESSAGE_STATUS_UNKNOWN;
        } else if (i == 1) {
            woe1Var = woe1.MESSAGE_STATUS_SUCCESS;
        } else if (i == 2) {
            woe1Var = woe1.MESSAGE_STATUS_QUEUED;
        } else if (i != 3) {
            woe1Var = i != 4 ? null : woe1.MESSAGE_STATUS_ERROR;
        } else {
            woe1Var = woe1.MESSAGE_STATUS_PROCESSING;
        }
        return woe1Var == null ? woe1.UNRECOGNIZED : woe1Var;
    }

    /* JADX INFO: renamed from: B */
    public final String m98292B() {
        return this.rowId_;
    }

    /* JADX INFO: renamed from: C */
    public final boolean m98293C() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0013\u0000\u0001\u0001\u0016\u0013\u0000\u0001\u0000\u0001Ȉ\u0005\u0007\u0006\u0007\u0007Ȉ\bȈ\t\u0007\nȈ\u000bȈ\f\u001b\r\u0007\u000eဉ\u0000\u000fȈ\u0010\u0007\u0011\u0007\u0012\f\u0013\u0007\u0014\u0007\u0015\u0007\u0016\u0007", new Object[]{"bitField0_", "creatorName_", "isLoading_", "canView_", "rowId_", "creatorUri_", "canAdd_", "madeForName_", "madeForUri_", "numberOfItemsPerLinkType_", YourLibraryDecoratedEntityOuterClass$NumberOfItemsForLinkType.class, "ownedBySelf_", "fromFolder_", "namePrefix_", "mixingActive_", "isEmptyPredefined_", "promptGenerationStatus_", "promptIsPersonalized_", "isPromptPlaylist_", "isPublished_", "isPrivate_"});
        }
        if (iOrdinal == 3) {
            return new C2697xe4161c99();
        }
        if (iOrdinal == 4) {
            return new ebe1(DEFAULT_INSTANCE, 22);
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
        synchronized (C2697xe4161c99.class) {
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

    /* JADX INFO: renamed from: n */
    public final boolean m98294n() {
        return this.canView_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final String m98295o() {
        return this.creatorName_;
    }

    /* JADX INFO: renamed from: q */
    public final C2698x41f2cde1 m98296q() {
        C2698x41f2cde1 c2698x41f2cde1 = this.fromFolder_;
        return c2698x41f2cde1 == null ? C2698x41f2cde1.m98306n() : c2698x41f2cde1;
    }

    /* JADX INFO: renamed from: r */
    public final boolean m98297r() {
        return this.isEmptyPredefined_;
    }

    /* JADX INFO: renamed from: s */
    public final boolean m98298s() {
        return this.isLoading_;
    }

    /* JADX INFO: renamed from: t */
    public final boolean m98299t() {
        return this.isPrivate_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }

    /* JADX INFO: renamed from: u */
    public final boolean m98300u() {
        return this.isPromptPlaylist_;
    }

    /* JADX INFO: renamed from: v */
    public final String m98301v() {
        return this.madeForName_;
    }

    /* JADX INFO: renamed from: w */
    public final boolean m98302w() {
        return this.mixingActive_;
    }

    /* JADX INFO: renamed from: x */
    public final String m98303x() {
        return this.namePrefix_;
    }

    /* JADX INFO: renamed from: y */
    public final ae50 m98304y() {
        return this.numberOfItemsPerLinkType_;
    }

    /* JADX INFO: renamed from: z */
    public final boolean m98305z() {
        return this.ownedBySelf_;
    }
}
