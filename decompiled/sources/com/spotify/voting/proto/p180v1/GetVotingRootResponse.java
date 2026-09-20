package com.spotify.voting.proto.p180v1;

import com.google.protobuf.AbstractC0269h;
import p204p.ae50;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes11.dex */
public final class GetVotingRootResponse extends AbstractC0269h implements sre0 {
    public static final int AWARD_ID_FIELD_NUMBER = 11;
    public static final int BOTTOM_SHEET_FIELD_NUMBER = 6;
    public static final int CONFIRMATION_PAGE_FIELD_NUMBER = 7;
    public static final int CONTEST_ID_FIELD_NUMBER = 10;
    private static final GetVotingRootResponse DEFAULT_INSTANCE;
    public static final int ENTRYPOINT_URI_FIELD_NUMBER = 9;
    public static final int ERROR_MESSAGE_FIELD_NUMBER = 8;
    public static final int FAQ_URI_FIELD_NUMBER = 3;
    private static volatile r2n0 PARSER = null;
    public static final int PREMIUM_UPSELL_FIELD_NUMBER = 4;
    public static final int SUBTITLE_FIELD_NUMBER = 2;
    public static final int TITLE_FIELD_NUMBER = 1;
    public static final int VOTING_SECTION_FIELD_NUMBER = 5;
    private int bitField0_;
    private BottomSheet bottomSheet_;
    private ConfirmationPage confirmationPage_;
    private ErrorMessage errorMessage_;
    private PremiumUpsell premiumUpsell_;
    private VotingSection votingSection_;
    private String title_ = "";
    private String subtitle_ = "";
    private String faqUri_ = "";
    private String entrypointUri_ = "";
    private String contestId_ = "";
    private String awardId_ = "";

    public static final class BottomSheet extends AbstractC0269h implements sre0 {
        public static final int CANCEL_BUTTON_ACCESSIBILITY_ACTION_FIELD_NUMBER = 6;
        public static final int CANCEL_BUTTON_TITLE_FIELD_NUMBER = 2;
        public static final int CONFIRM_VOTE_PLURAL_FIELD_NUMBER = 4;
        public static final int CONFIRM_VOTE_SINGULAR_FIELD_NUMBER = 3;
        private static final BottomSheet DEFAULT_INSTANCE;
        public static final int DEFAULT_TITLE_FIELD_NUMBER = 5;
        private static volatile r2n0 PARSER = null;
        public static final int VOTE_BUTTON_ACCESSIBILITY_ACTION_FIELD_NUMBER = 7;
        public static final int VOTE_BUTTON_TITLE_FIELD_NUMBER = 1;
        private String voteButtonTitle_ = "";
        private String cancelButtonTitle_ = "";
        private String confirmVoteSingular_ = "";
        private String confirmVotePlural_ = "";
        private String defaultTitle_ = "";
        private String cancelButtonAccessibilityAction_ = "";
        private String voteButtonAccessibilityAction_ = "";

        static {
            BottomSheet bottomSheet = new BottomSheet();
            DEFAULT_INSTANCE = bottomSheet;
            AbstractC0269h.registerDefaultInstance(BottomSheet.class, bottomSheet);
        }

        private BottomSheet() {
        }

        public static r2n0 parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: renamed from: r */
        public static BottomSheet m22360r() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.google.protobuf.AbstractC0269h
        public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
            r2n0 r110Var;
            int iOrdinal = z110Var.ordinal();
            if (iOrdinal == 0) {
                return (byte) 1;
            }
            if (iOrdinal == 2) {
                return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0007\u0000\u0000\u0001\u0007\u0007\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004Ȉ\u0005Ȉ\u0006Ȉ\u0007Ȉ", new Object[]{"voteButtonTitle_", "cancelButtonTitle_", "confirmVoteSingular_", "confirmVotePlural_", "defaultTitle_", "cancelButtonAccessibilityAction_", "voteButtonAccessibilityAction_"});
            }
            if (iOrdinal == 3) {
                return new BottomSheet();
            }
            if (iOrdinal == 4) {
                return new C1325a(DEFAULT_INSTANCE);
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
            synchronized (BottomSheet.class) {
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
        public final String m22361n() {
            return this.cancelButtonAccessibilityAction_;
        }

        @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
        public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
            return newBuilderForType();
        }

        /* JADX INFO: renamed from: o */
        public final String m22362o() {
            return this.cancelButtonTitle_;
        }

        /* JADX INFO: renamed from: p */
        public final String m22363p() {
            return this.confirmVotePlural_;
        }

        /* JADX INFO: renamed from: q */
        public final String m22364q() {
            return this.confirmVoteSingular_;
        }

        /* JADX INFO: renamed from: s */
        public final String m22365s() {
            return this.defaultTitle_;
        }

        /* JADX INFO: renamed from: t */
        public final String m22366t() {
            return this.voteButtonAccessibilityAction_;
        }

        @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
        public final /* bridge */ /* synthetic */ ore0 toBuilder() {
            return toBuilder();
        }

        /* JADX INFO: renamed from: u */
        public final String m22367u() {
            return this.voteButtonTitle_;
        }
    }

    public static final class ConfirmationPage extends AbstractC0269h implements sre0 {
        private static final ConfirmationPage DEFAULT_INSTANCE;
        private static volatile r2n0 PARSER = null;
        public static final int SUBTITLE_FIELD_NUMBER = 2;
        public static final int SUBTITLE_PLURAL_FIELD_NUMBER = 3;
        public static final int TITLE_FIELD_NUMBER = 1;
        private String title_ = "";
        private String subtitle_ = "";
        private String subtitlePlural_ = "";

        static {
            ConfirmationPage confirmationPage = new ConfirmationPage();
            DEFAULT_INSTANCE = confirmationPage;
            AbstractC0269h.registerDefaultInstance(ConfirmationPage.class, confirmationPage);
        }

        private ConfirmationPage() {
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
                return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ", new Object[]{"title_", "subtitle_", "subtitlePlural_"});
            }
            if (iOrdinal == 3) {
                return new ConfirmationPage();
            }
            if (iOrdinal == 4) {
                return new C1327c(DEFAULT_INSTANCE);
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
            synchronized (ConfirmationPage.class) {
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

    public static final class ErrorMessage extends AbstractC0269h implements sre0 {
        private static final ErrorMessage DEFAULT_INSTANCE;
        private static volatile r2n0 PARSER = null;
        public static final int PRIMARY_BUTTON_TITLE_FIELD_NUMBER = 3;
        public static final int SECONDARY_BUTTON_TITLE_FIELD_NUMBER = 4;
        public static final int SUBTITLE_FIELD_NUMBER = 2;
        public static final int TITLE_FIELD_NUMBER = 1;
        private String title_ = "";
        private String subtitle_ = "";
        private String primaryButtonTitle_ = "";
        private String secondaryButtonTitle_ = "";

        static {
            ErrorMessage errorMessage = new ErrorMessage();
            DEFAULT_INSTANCE = errorMessage;
            AbstractC0269h.registerDefaultInstance(ErrorMessage.class, errorMessage);
        }

        private ErrorMessage() {
        }

        /* JADX INFO: renamed from: n */
        public static ErrorMessage m22368n() {
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
                return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004Ȉ", new Object[]{"title_", "subtitle_", "primaryButtonTitle_", "secondaryButtonTitle_"});
            }
            if (iOrdinal == 3) {
                return new ErrorMessage();
            }
            if (iOrdinal == 4) {
                return new C1328d(DEFAULT_INSTANCE);
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
            synchronized (ErrorMessage.class) {
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

        @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
        public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
            return newBuilderForType();
        }

        /* JADX INFO: renamed from: o */
        public final String m22369o() {
            return this.primaryButtonTitle_;
        }

        /* JADX INFO: renamed from: p */
        public final String m22370p() {
            return this.secondaryButtonTitle_;
        }

        @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
        public final /* bridge */ /* synthetic */ ore0 toBuilder() {
            return toBuilder();
        }
    }

    public static final class Nominee extends AbstractC0269h implements sre0 {
        public static final int ART_URL_FIELD_NUMBER = 2;
        private static final Nominee DEFAULT_INSTANCE;
        public static final int NOMINEE_ID_FIELD_NUMBER = 1;
        public static final int NOMINEE_KIND_FIELD_NUMBER = 6;
        private static volatile r2n0 PARSER = null;
        public static final int PREVIEW_URL_FIELD_NUMBER = 5;
        public static final int SUBTITLE_FIELD_NUMBER = 4;
        public static final int TITLE_FIELD_NUMBER = 3;
        private String nomineeId_ = "";
        private String artUrl_ = "";
        private String title_ = "";
        private String subtitle_ = "";
        private String previewUrl_ = "";
        private String nomineeKind_ = "";

        static {
            Nominee nominee = new Nominee();
            DEFAULT_INSTANCE = nominee;
            AbstractC0269h.registerDefaultInstance(Nominee.class, nominee);
        }

        private Nominee() {
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
                return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0000\u0001\u0006\u0006\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004Ȉ\u0005Ȉ\u0006Ȉ", new Object[]{"nomineeId_", "artUrl_", "title_", "subtitle_", "previewUrl_", "nomineeKind_"});
            }
            if (iOrdinal == 3) {
                return new Nominee();
            }
            if (iOrdinal == 4) {
                return new C1329e(DEFAULT_INSTANCE);
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
            synchronized (Nominee.class) {
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
        public final String m22371n() {
            return this.artUrl_;
        }

        @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
        public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
            return newBuilderForType();
        }

        /* JADX INFO: renamed from: o */
        public final String m22372o() {
            return this.nomineeId_;
        }

        @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
        public final /* bridge */ /* synthetic */ ore0 toBuilder() {
            return toBuilder();
        }
    }

    public static final class VotingSection extends AbstractC0269h implements sre0 {
        public static final int ADD_BUTTON_ACCESSIBILITY_ACTION_FIELD_NUMBER = 13;
        public static final int ADD_BUTTON_ACCESSIBILITY_TEXT_FIELD_NUMBER = 12;
        private static final VotingSection DEFAULT_INSTANCE;
        public static final int HEADER_FIELD_NUMBER = 3;
        public static final int NOMINEES_FIELD_NUMBER = 7;
        public static final int NOMINEE_VOTE_COUNT_ACCESSIBILITY_TEXT_FIELD_NUMBER = 11;
        private static volatile r2n0 PARSER = null;
        public static final int REMOVE_BUTTON_ACCESSIBILITY_ACTION_FIELD_NUMBER = 10;
        public static final int REMOVE_BUTTON_ACCESSIBILITY_TEXT_FIELD_NUMBER = 9;
        public static final int SUBTITLE_FIELD_NUMBER = 2;
        public static final int TITLE_FIELD_NUMBER = 1;
        public static final int VOTES_REMAINING_FIELD_NUMBER = 6;
        public static final int VOTES_REMAINING_LINES_FIELD_NUMBER = 8;
        private int votesRemaining_;
        private String title_ = "";
        private String subtitle_ = "";
        private String header_ = "";
        private ae50 nominees_ = AbstractC0269h.emptyProtobufList();
        private ae50 votesRemainingLines_ = AbstractC0269h.emptyProtobufList();
        private String removeButtonAccessibilityText_ = "";
        private String removeButtonAccessibilityAction_ = "";
        private ae50 nomineeVoteCountAccessibilityText_ = AbstractC0269h.emptyProtobufList();
        private String addButtonAccessibilityText_ = "";
        private String addButtonAccessibilityAction_ = "";

        static {
            VotingSection votingSection = new VotingSection();
            DEFAULT_INSTANCE = votingSection;
            AbstractC0269h.registerDefaultInstance(VotingSection.class, votingSection);
        }

        private VotingSection() {
        }

        /* JADX INFO: renamed from: p */
        public static VotingSection m22373p() {
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
                return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u000b\u0000\u0000\u0001\r\u000b\u0000\u0003\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0006\u0004\u0007\u001b\bȚ\tȈ\nȈ\u000bȚ\fȈ\rȈ", new Object[]{"title_", "subtitle_", "header_", "votesRemaining_", "nominees_", Nominee.class, "votesRemainingLines_", "removeButtonAccessibilityText_", "removeButtonAccessibilityAction_", "nomineeVoteCountAccessibilityText_", "addButtonAccessibilityText_", "addButtonAccessibilityAction_"});
            }
            if (iOrdinal == 3) {
                return new VotingSection();
            }
            if (iOrdinal == 4) {
                return new C1330f(DEFAULT_INSTANCE);
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
            synchronized (VotingSection.class) {
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
        public final String m22374n() {
            return this.addButtonAccessibilityAction_;
        }

        @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
        public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
            return newBuilderForType();
        }

        /* JADX INFO: renamed from: o */
        public final String m22375o() {
            return this.addButtonAccessibilityText_;
        }

        /* JADX INFO: renamed from: q */
        public final String m22376q() {
            return this.header_;
        }

        /* JADX INFO: renamed from: r */
        public final ae50 m22377r() {
            return this.nomineeVoteCountAccessibilityText_;
        }

        /* JADX INFO: renamed from: s */
        public final ae50 m22378s() {
            return this.nominees_;
        }

        /* JADX INFO: renamed from: t */
        public final String m22379t() {
            return this.removeButtonAccessibilityAction_;
        }

        @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
        public final /* bridge */ /* synthetic */ ore0 toBuilder() {
            return toBuilder();
        }

        /* JADX INFO: renamed from: u */
        public final String m22380u() {
            return this.removeButtonAccessibilityText_;
        }

        /* JADX INFO: renamed from: v */
        public final int m22381v() {
            return this.votesRemaining_;
        }

        /* JADX INFO: renamed from: w */
        public final ae50 m22382w() {
            return this.votesRemainingLines_;
        }
    }

    static {
        GetVotingRootResponse getVotingRootResponse = new GetVotingRootResponse();
        DEFAULT_INSTANCE = getVotingRootResponse;
        AbstractC0269h.registerDefaultInstance(GetVotingRootResponse.class, getVotingRootResponse);
    }

    private GetVotingRootResponse() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u000b\u0000\u0001\u0001\u000b\u000b\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004ဉ\u0000\u0005ဉ\u0001\u0006ဉ\u0002\u0007ဉ\u0003\bဉ\u0004\tȈ\nȈ\u000bȈ", new Object[]{"bitField0_", "title_", "subtitle_", "faqUri_", "premiumUpsell_", "votingSection_", "bottomSheet_", "confirmationPage_", "errorMessage_", "entrypointUri_", "contestId_", "awardId_"});
        }
        if (iOrdinal == 3) {
            return new GetVotingRootResponse();
        }
        if (iOrdinal == 4) {
            return new C1326b(DEFAULT_INSTANCE);
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
        synchronized (GetVotingRootResponse.class) {
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

    /* JADX INFO: renamed from: n */
    public final BottomSheet m22357n() {
        BottomSheet bottomSheet = this.bottomSheet_;
        return bottomSheet == null ? BottomSheet.m22360r() : bottomSheet;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final ErrorMessage m22358o() {
        ErrorMessage errorMessage = this.errorMessage_;
        return errorMessage == null ? ErrorMessage.m22368n() : errorMessage;
    }

    /* JADX INFO: renamed from: p */
    public final VotingSection m22359p() {
        VotingSection votingSection = this.votingSection_;
        return votingSection == null ? VotingSection.m22373p() : votingSection;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
