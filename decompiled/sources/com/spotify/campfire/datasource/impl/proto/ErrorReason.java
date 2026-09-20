package com.spotify.campfire.datasource.impl.proto;

import com.google.protobuf.AbstractC0268g;
import com.google.protobuf.AbstractC0269h;
import java.io.InputStream;
import java.nio.ByteBuffer;
import p204p.AbstractC2081l8;
import p204p.AbstractC2118m8;
import p204p.aux;
import p204p.gva;
import p204p.od50;
import p204p.ore0;
import p204p.owe;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.rd50;
import p204p.sd50;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes5.dex */
public final class ErrorReason extends AbstractC0269h implements ErrorReasonOrBuilder {
    private static final ErrorReason DEFAULT_INSTANCE;
    public static final int DESCRIPTION_FIELD_NUMBER = 7;
    public static final int FAILED_USER_FIELD_NUMBER = 10;
    public static final int GROUPS_NOT_ENABLED_FIELD_NUMBER = 11;
    public static final int JOIN_LIMIT_EXCEEDED_FIELD_NUMBER = 13;
    public static final int LINK_EXPIRED_FIELD_NUMBER = 5;
    public static final int MEMBER_LIMIT_EXCEEDED_FIELD_NUMBER = 12;
    public static final int NOT_AN_ADMIN_FIELD_NUMBER = 15;
    public static final int NOT_TRUSTED_FIELD_NUMBER = 16;
    public static final int OPT_OUT_FIELD_NUMBER = 3;
    private static volatile r2n0 PARSER = null;
    public static final int PARTICIPATION_STATUS_FIELD_NUMBER = 6;
    public static final int RESTRICTED_FROM_MESSAGING_FIELD_NUMBER = 4;
    public static final int SHOULD_ASSURE_AGE_FIELD_NUMBER = 2;
    public static final int TOO_YOUNG_FIELD_NUMBER = 9;
    public static final int UNRELEASED_MARKET_FIELD_NUMBER = 8;
    public static final int UNSPECIFIED_FIELD_NUMBER = 1;
    public static final int USER_BLOCKED_FIELD_NUMBER = 17;
    public static final int VIOLATIVE_CONTENT_FIELD_NUMBER = 14;

    /* JADX INFO: renamed from: e_ */
    private Object f3194e_;
    private int failedUser_;
    private int eCase_ = 0;
    private String description_ = "";

    /* JADX INFO: renamed from: com.spotify.campfire.datasource.impl.proto.ErrorReason$1 */
    public static /* synthetic */ class C03671 {

        /* JADX INFO: renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f3195xa1df5c61;

        static {
            int[] iArr = new int[z110.values().length];
            f3195xa1df5c61 = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f3195xa1df5c61[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f3195xa1df5c61[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f3195xa1df5c61[5] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f3195xa1df5c61[6] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f3195xa1df5c61[0] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f3195xa1df5c61[1] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class Builder extends AbstractC0268g implements ErrorReasonOrBuilder {
        public /* synthetic */ Builder(int i) {
            this();
        }

        @Override // com.google.protobuf.AbstractC0268g, p204p.ore0
        public /* bridge */ /* synthetic */ pre0 build() {
            return build();
        }

        @Override // com.google.protobuf.AbstractC0268g, p204p.ore0
        public /* bridge */ /* synthetic */ pre0 buildPartial() {
            return super.buildPartial();
        }

        @Override // com.google.protobuf.AbstractC0268g
        /* JADX INFO: renamed from: clear */
        public /* bridge */ /* synthetic */ ore0 mo98325clear() {
            return mo98325clear();
        }

        public Builder clearDescription() {
            copyOnWrite();
            ((ErrorReason) this.instance).clearDescription();
            return this;
        }

        public Builder clearE() {
            copyOnWrite();
            ((ErrorReason) this.instance).clearE();
            return this;
        }

        public Builder clearFailedUser() {
            copyOnWrite();
            ((ErrorReason) this.instance).clearFailedUser();
            return this;
        }

        public Builder clearGroupsNotEnabled() {
            copyOnWrite();
            ((ErrorReason) this.instance).clearGroupsNotEnabled();
            return this;
        }

        public Builder clearJoinLimitExceeded() {
            copyOnWrite();
            ((ErrorReason) this.instance).clearJoinLimitExceeded();
            return this;
        }

        public Builder clearLinkExpired() {
            copyOnWrite();
            ((ErrorReason) this.instance).clearLinkExpired();
            return this;
        }

        public Builder clearMemberLimitExceeded() {
            copyOnWrite();
            ((ErrorReason) this.instance).clearMemberLimitExceeded();
            return this;
        }

        public Builder clearNotAnAdmin() {
            copyOnWrite();
            ((ErrorReason) this.instance).clearNotAnAdmin();
            return this;
        }

        public Builder clearNotTrusted() {
            copyOnWrite();
            ((ErrorReason) this.instance).clearNotTrusted();
            return this;
        }

        public Builder clearOptOut() {
            copyOnWrite();
            ((ErrorReason) this.instance).clearOptOut();
            return this;
        }

        public Builder clearParticipationStatus() {
            copyOnWrite();
            ((ErrorReason) this.instance).clearParticipationStatus();
            return this;
        }

        public Builder clearRestrictedFromMessaging() {
            copyOnWrite();
            ((ErrorReason) this.instance).clearRestrictedFromMessaging();
            return this;
        }

        public Builder clearShouldAssureAge() {
            copyOnWrite();
            ((ErrorReason) this.instance).clearShouldAssureAge();
            return this;
        }

        public Builder clearTooYoung() {
            copyOnWrite();
            ((ErrorReason) this.instance).clearTooYoung();
            return this;
        }

        public Builder clearUnreleasedMarket() {
            copyOnWrite();
            ((ErrorReason) this.instance).clearUnreleasedMarket();
            return this;
        }

        public Builder clearUnspecified() {
            copyOnWrite();
            ((ErrorReason) this.instance).clearUnspecified();
            return this;
        }

        public Builder clearUserBlocked() {
            copyOnWrite();
            ((ErrorReason) this.instance).clearUserBlocked();
            return this;
        }

        public Builder clearViolativeContent() {
            copyOnWrite();
            ((ErrorReason) this.instance).clearViolativeContent();
            return this;
        }

        @Override // com.google.protobuf.AbstractC0268g
        /* JADX INFO: renamed from: clone */
        public /* bridge */ /* synthetic */ Object mo98327clone() {
            return super.mo98326clone();
        }

        @Override // com.google.protobuf.AbstractC0268g, p204p.sre0
        public /* bridge */ /* synthetic */ pre0 getDefaultInstanceForType() {
            return super.getDefaultInstanceForType();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.ErrorReasonOrBuilder
        public String getDescription() {
            return ((ErrorReason) this.instance).getDescription();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.ErrorReasonOrBuilder
        public gva getDescriptionBytes() {
            return ((ErrorReason) this.instance).getDescriptionBytes();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.ErrorReasonOrBuilder
        public ECase getECase() {
            return ((ErrorReason) this.instance).getECase();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.ErrorReasonOrBuilder
        public UserRole getFailedUser() {
            return ((ErrorReason) this.instance).getFailedUser();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.ErrorReasonOrBuilder
        public int getFailedUserValue() {
            return ((ErrorReason) this.instance).getFailedUserValue();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.ErrorReasonOrBuilder
        public GroupsNotEnabled getGroupsNotEnabled() {
            return ((ErrorReason) this.instance).getGroupsNotEnabled();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.ErrorReasonOrBuilder
        public JoinLimitExceeded getJoinLimitExceeded() {
            return ((ErrorReason) this.instance).getJoinLimitExceeded();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.ErrorReasonOrBuilder
        public LinkExpired getLinkExpired() {
            return ((ErrorReason) this.instance).getLinkExpired();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.ErrorReasonOrBuilder
        public MemberLimitExceeded getMemberLimitExceeded() {
            return ((ErrorReason) this.instance).getMemberLimitExceeded();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.ErrorReasonOrBuilder
        public NotAnAdmin getNotAnAdmin() {
            return ((ErrorReason) this.instance).getNotAnAdmin();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.ErrorReasonOrBuilder
        public NotTrusted getNotTrusted() {
            return ((ErrorReason) this.instance).getNotTrusted();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.ErrorReasonOrBuilder
        public OptOut getOptOut() {
            return ((ErrorReason) this.instance).getOptOut();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.ErrorReasonOrBuilder
        public ChatParticipationStatus getParticipationStatus() {
            return ((ErrorReason) this.instance).getParticipationStatus();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.ErrorReasonOrBuilder
        public RestrictedFromMessaging getRestrictedFromMessaging() {
            return ((ErrorReason) this.instance).getRestrictedFromMessaging();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.ErrorReasonOrBuilder
        public ShouldAssureAge getShouldAssureAge() {
            return ((ErrorReason) this.instance).getShouldAssureAge();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.ErrorReasonOrBuilder
        public TooYoung getTooYoung() {
            return ((ErrorReason) this.instance).getTooYoung();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.ErrorReasonOrBuilder
        public UnreleasedMarket getUnreleasedMarket() {
            return ((ErrorReason) this.instance).getUnreleasedMarket();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.ErrorReasonOrBuilder
        public Unspecified getUnspecified() {
            return ((ErrorReason) this.instance).getUnspecified();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.ErrorReasonOrBuilder
        public UserBlocked getUserBlocked() {
            return ((ErrorReason) this.instance).getUserBlocked();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.ErrorReasonOrBuilder
        public ViolativeContent getViolativeContent() {
            return ((ErrorReason) this.instance).getViolativeContent();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.ErrorReasonOrBuilder
        public boolean hasGroupsNotEnabled() {
            return ((ErrorReason) this.instance).hasGroupsNotEnabled();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.ErrorReasonOrBuilder
        public boolean hasJoinLimitExceeded() {
            return ((ErrorReason) this.instance).hasJoinLimitExceeded();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.ErrorReasonOrBuilder
        public boolean hasLinkExpired() {
            return ((ErrorReason) this.instance).hasLinkExpired();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.ErrorReasonOrBuilder
        public boolean hasMemberLimitExceeded() {
            return ((ErrorReason) this.instance).hasMemberLimitExceeded();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.ErrorReasonOrBuilder
        public boolean hasNotAnAdmin() {
            return ((ErrorReason) this.instance).hasNotAnAdmin();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.ErrorReasonOrBuilder
        public boolean hasNotTrusted() {
            return ((ErrorReason) this.instance).hasNotTrusted();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.ErrorReasonOrBuilder
        public boolean hasOptOut() {
            return ((ErrorReason) this.instance).hasOptOut();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.ErrorReasonOrBuilder
        public boolean hasParticipationStatus() {
            return ((ErrorReason) this.instance).hasParticipationStatus();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.ErrorReasonOrBuilder
        public boolean hasRestrictedFromMessaging() {
            return ((ErrorReason) this.instance).hasRestrictedFromMessaging();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.ErrorReasonOrBuilder
        public boolean hasShouldAssureAge() {
            return ((ErrorReason) this.instance).hasShouldAssureAge();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.ErrorReasonOrBuilder
        public boolean hasTooYoung() {
            return ((ErrorReason) this.instance).hasTooYoung();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.ErrorReasonOrBuilder
        public boolean hasUnreleasedMarket() {
            return ((ErrorReason) this.instance).hasUnreleasedMarket();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.ErrorReasonOrBuilder
        public boolean hasUnspecified() {
            return ((ErrorReason) this.instance).hasUnspecified();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.ErrorReasonOrBuilder
        public boolean hasUserBlocked() {
            return ((ErrorReason) this.instance).hasUserBlocked();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.ErrorReasonOrBuilder
        public boolean hasViolativeContent() {
            return ((ErrorReason) this.instance).hasViolativeContent();
        }

        @Override // com.google.protobuf.AbstractC0268g, p204p.AbstractC2081l8
        public /* bridge */ /* synthetic */ AbstractC2081l8 internalMergeFrom(AbstractC2118m8 abstractC2118m8) {
            return super.internalMergeFrom((AbstractC0269h) abstractC2118m8);
        }

        @Override // com.google.protobuf.AbstractC0268g, p204p.AbstractC2081l8, p204p.ore0
        public /* bridge */ /* synthetic */ AbstractC2081l8 mergeFrom(owe oweVar, aux auxVar) {
            return super.mergeFrom(oweVar, auxVar);
        }

        public Builder mergeGroupsNotEnabled(GroupsNotEnabled groupsNotEnabled) {
            copyOnWrite();
            ((ErrorReason) this.instance).mergeGroupsNotEnabled(groupsNotEnabled);
            return this;
        }

        public Builder mergeJoinLimitExceeded(JoinLimitExceeded joinLimitExceeded) {
            copyOnWrite();
            ((ErrorReason) this.instance).mergeJoinLimitExceeded(joinLimitExceeded);
            return this;
        }

        public Builder mergeLinkExpired(LinkExpired linkExpired) {
            copyOnWrite();
            ((ErrorReason) this.instance).mergeLinkExpired(linkExpired);
            return this;
        }

        public Builder mergeMemberLimitExceeded(MemberLimitExceeded memberLimitExceeded) {
            copyOnWrite();
            ((ErrorReason) this.instance).mergeMemberLimitExceeded(memberLimitExceeded);
            return this;
        }

        public Builder mergeNotAnAdmin(NotAnAdmin notAnAdmin) {
            copyOnWrite();
            ((ErrorReason) this.instance).mergeNotAnAdmin(notAnAdmin);
            return this;
        }

        public Builder mergeNotTrusted(NotTrusted notTrusted) {
            copyOnWrite();
            ((ErrorReason) this.instance).mergeNotTrusted(notTrusted);
            return this;
        }

        public Builder mergeOptOut(OptOut optOut) {
            copyOnWrite();
            ((ErrorReason) this.instance).mergeOptOut(optOut);
            return this;
        }

        public Builder mergeParticipationStatus(ChatParticipationStatus chatParticipationStatus) {
            copyOnWrite();
            ((ErrorReason) this.instance).mergeParticipationStatus(chatParticipationStatus);
            return this;
        }

        public Builder mergeRestrictedFromMessaging(RestrictedFromMessaging restrictedFromMessaging) {
            copyOnWrite();
            ((ErrorReason) this.instance).mergeRestrictedFromMessaging(restrictedFromMessaging);
            return this;
        }

        public Builder mergeShouldAssureAge(ShouldAssureAge shouldAssureAge) {
            copyOnWrite();
            ((ErrorReason) this.instance).mergeShouldAssureAge(shouldAssureAge);
            return this;
        }

        public Builder mergeTooYoung(TooYoung tooYoung) {
            copyOnWrite();
            ((ErrorReason) this.instance).mergeTooYoung(tooYoung);
            return this;
        }

        public Builder mergeUnreleasedMarket(UnreleasedMarket unreleasedMarket) {
            copyOnWrite();
            ((ErrorReason) this.instance).mergeUnreleasedMarket(unreleasedMarket);
            return this;
        }

        public Builder mergeUnspecified(Unspecified unspecified) {
            copyOnWrite();
            ((ErrorReason) this.instance).mergeUnspecified(unspecified);
            return this;
        }

        public Builder mergeUserBlocked(UserBlocked userBlocked) {
            copyOnWrite();
            ((ErrorReason) this.instance).mergeUserBlocked(userBlocked);
            return this;
        }

        public Builder mergeViolativeContent(ViolativeContent violativeContent) {
            copyOnWrite();
            ((ErrorReason) this.instance).mergeViolativeContent(violativeContent);
            return this;
        }

        public Builder setDescription(String str) {
            copyOnWrite();
            ((ErrorReason) this.instance).setDescription(str);
            return this;
        }

        public Builder setDescriptionBytes(gva gvaVar) {
            copyOnWrite();
            ((ErrorReason) this.instance).setDescriptionBytes(gvaVar);
            return this;
        }

        public Builder setFailedUser(UserRole userRole) {
            copyOnWrite();
            ((ErrorReason) this.instance).setFailedUser(userRole);
            return this;
        }

        public Builder setFailedUserValue(int i) {
            copyOnWrite();
            ((ErrorReason) this.instance).setFailedUserValue(i);
            return this;
        }

        public Builder setGroupsNotEnabled(GroupsNotEnabled groupsNotEnabled) {
            copyOnWrite();
            ((ErrorReason) this.instance).setGroupsNotEnabled(groupsNotEnabled);
            return this;
        }

        public Builder setJoinLimitExceeded(JoinLimitExceeded joinLimitExceeded) {
            copyOnWrite();
            ((ErrorReason) this.instance).setJoinLimitExceeded(joinLimitExceeded);
            return this;
        }

        public Builder setLinkExpired(LinkExpired linkExpired) {
            copyOnWrite();
            ((ErrorReason) this.instance).setLinkExpired(linkExpired);
            return this;
        }

        public Builder setMemberLimitExceeded(MemberLimitExceeded memberLimitExceeded) {
            copyOnWrite();
            ((ErrorReason) this.instance).setMemberLimitExceeded(memberLimitExceeded);
            return this;
        }

        public Builder setNotAnAdmin(NotAnAdmin notAnAdmin) {
            copyOnWrite();
            ((ErrorReason) this.instance).setNotAnAdmin(notAnAdmin);
            return this;
        }

        public Builder setNotTrusted(NotTrusted notTrusted) {
            copyOnWrite();
            ((ErrorReason) this.instance).setNotTrusted(notTrusted);
            return this;
        }

        public Builder setOptOut(OptOut optOut) {
            copyOnWrite();
            ((ErrorReason) this.instance).setOptOut(optOut);
            return this;
        }

        public Builder setParticipationStatus(ChatParticipationStatus chatParticipationStatus) {
            copyOnWrite();
            ((ErrorReason) this.instance).setParticipationStatus(chatParticipationStatus);
            return this;
        }

        public Builder setRestrictedFromMessaging(RestrictedFromMessaging restrictedFromMessaging) {
            copyOnWrite();
            ((ErrorReason) this.instance).setRestrictedFromMessaging(restrictedFromMessaging);
            return this;
        }

        public Builder setShouldAssureAge(ShouldAssureAge shouldAssureAge) {
            copyOnWrite();
            ((ErrorReason) this.instance).setShouldAssureAge(shouldAssureAge);
            return this;
        }

        public Builder setTooYoung(TooYoung tooYoung) {
            copyOnWrite();
            ((ErrorReason) this.instance).setTooYoung(tooYoung);
            return this;
        }

        public Builder setUnreleasedMarket(UnreleasedMarket unreleasedMarket) {
            copyOnWrite();
            ((ErrorReason) this.instance).setUnreleasedMarket(unreleasedMarket);
            return this;
        }

        public Builder setUnspecified(Unspecified unspecified) {
            copyOnWrite();
            ((ErrorReason) this.instance).setUnspecified(unspecified);
            return this;
        }

        public Builder setUserBlocked(UserBlocked userBlocked) {
            copyOnWrite();
            ((ErrorReason) this.instance).setUserBlocked(userBlocked);
            return this;
        }

        public Builder setViolativeContent(ViolativeContent violativeContent) {
            copyOnWrite();
            ((ErrorReason) this.instance).setViolativeContent(violativeContent);
            return this;
        }

        private Builder() {
            super(ErrorReason.DEFAULT_INSTANCE);
        }

        @Override // com.google.protobuf.AbstractC0268g
        /* JADX INFO: renamed from: clone */
        public /* bridge */ /* synthetic */ AbstractC2081l8 mo98328clone() {
            return super.mo98326clone();
        }

        @Override // com.google.protobuf.AbstractC0268g, p204p.AbstractC2081l8
        /* JADX INFO: renamed from: mergeFrom */
        public /* bridge */ /* synthetic */ AbstractC2081l8 mo98329mergeFrom(byte[] bArr, int i, int i2) {
            return super.mo98329mergeFrom(bArr, i, i2);
        }

        @Override // com.google.protobuf.AbstractC0268g
        /* JADX INFO: renamed from: clone */
        public /* bridge */ /* synthetic */ ore0 mo98328clone() {
            return super.mo98326clone();
        }

        @Override // com.google.protobuf.AbstractC0268g, p204p.AbstractC2081l8
        /* JADX INFO: renamed from: mergeFrom */
        public /* bridge */ /* synthetic */ AbstractC2081l8 mo98330mergeFrom(byte[] bArr, int i, int i2, aux auxVar) {
            return super.mo98330mergeFrom(bArr, i, i2, auxVar);
        }

        public Builder setGroupsNotEnabled(GroupsNotEnabled.Builder builder) {
            copyOnWrite();
            ((ErrorReason) this.instance).setGroupsNotEnabled((GroupsNotEnabled) builder.build());
            return this;
        }

        public Builder setJoinLimitExceeded(JoinLimitExceeded.Builder builder) {
            copyOnWrite();
            ((ErrorReason) this.instance).setJoinLimitExceeded((JoinLimitExceeded) builder.build());
            return this;
        }

        public Builder setLinkExpired(LinkExpired.Builder builder) {
            copyOnWrite();
            ((ErrorReason) this.instance).setLinkExpired((LinkExpired) builder.build());
            return this;
        }

        public Builder setMemberLimitExceeded(MemberLimitExceeded.Builder builder) {
            copyOnWrite();
            ((ErrorReason) this.instance).setMemberLimitExceeded((MemberLimitExceeded) builder.build());
            return this;
        }

        public Builder setNotAnAdmin(NotAnAdmin.Builder builder) {
            copyOnWrite();
            ((ErrorReason) this.instance).setNotAnAdmin((NotAnAdmin) builder.build());
            return this;
        }

        public Builder setNotTrusted(NotTrusted.Builder builder) {
            copyOnWrite();
            ((ErrorReason) this.instance).setNotTrusted((NotTrusted) builder.build());
            return this;
        }

        public Builder setOptOut(OptOut.Builder builder) {
            copyOnWrite();
            ((ErrorReason) this.instance).setOptOut((OptOut) builder.build());
            return this;
        }

        public Builder setParticipationStatus(ChatParticipationStatus.Builder builder) {
            copyOnWrite();
            ((ErrorReason) this.instance).setParticipationStatus((ChatParticipationStatus) builder.build());
            return this;
        }

        public Builder setRestrictedFromMessaging(RestrictedFromMessaging.Builder builder) {
            copyOnWrite();
            ((ErrorReason) this.instance).setRestrictedFromMessaging((RestrictedFromMessaging) builder.build());
            return this;
        }

        public Builder setShouldAssureAge(ShouldAssureAge.Builder builder) {
            copyOnWrite();
            ((ErrorReason) this.instance).setShouldAssureAge((ShouldAssureAge) builder.build());
            return this;
        }

        public Builder setTooYoung(TooYoung.Builder builder) {
            copyOnWrite();
            ((ErrorReason) this.instance).setTooYoung((TooYoung) builder.build());
            return this;
        }

        public Builder setUnreleasedMarket(UnreleasedMarket.Builder builder) {
            copyOnWrite();
            ((ErrorReason) this.instance).setUnreleasedMarket((UnreleasedMarket) builder.build());
            return this;
        }

        public Builder setUnspecified(Unspecified.Builder builder) {
            copyOnWrite();
            ((ErrorReason) this.instance).setUnspecified((Unspecified) builder.build());
            return this;
        }

        public Builder setUserBlocked(UserBlocked.Builder builder) {
            copyOnWrite();
            ((ErrorReason) this.instance).setUserBlocked((UserBlocked) builder.build());
            return this;
        }

        public Builder setViolativeContent(ViolativeContent.Builder builder) {
            copyOnWrite();
            ((ErrorReason) this.instance).setViolativeContent((ViolativeContent) builder.build());
            return this;
        }

        @Override // p204p.AbstractC2081l8
        /* JADX INFO: renamed from: mergeFrom */
        public /* bridge */ /* synthetic */ ore0 mo98371mergeFrom(InputStream inputStream) {
            return super.mo98371mergeFrom(inputStream);
        }

        @Override // p204p.AbstractC2081l8
        /* JADX INFO: renamed from: mergeFrom */
        public /* bridge */ /* synthetic */ ore0 mo98372mergeFrom(InputStream inputStream, aux auxVar) {
            return super.mo98372mergeFrom(inputStream, auxVar);
        }

        @Override // p204p.AbstractC2081l8
        /* JADX INFO: renamed from: mergeFrom */
        public /* bridge */ /* synthetic */ ore0 mo98373mergeFrom(gva gvaVar) {
            return super.mo98373mergeFrom(gvaVar);
        }

        @Override // p204p.AbstractC2081l8
        /* JADX INFO: renamed from: mergeFrom */
        public /* bridge */ /* synthetic */ ore0 mo98374mergeFrom(gva gvaVar, aux auxVar) {
            return super.mo98374mergeFrom(gvaVar, auxVar);
        }

        @Override // p204p.AbstractC2081l8
        /* JADX INFO: renamed from: mergeFrom */
        public /* bridge */ /* synthetic */ ore0 mo98375mergeFrom(owe oweVar) {
            return super.mo98375mergeFrom(oweVar);
        }

        @Override // com.google.protobuf.AbstractC0268g, p204p.ore0
        public /* bridge */ /* synthetic */ ore0 mergeFrom(owe oweVar, aux auxVar) {
            return super.mergeFrom(oweVar, auxVar);
        }

        @Override // p204p.AbstractC2081l8, p204p.ore0
        public /* bridge */ /* synthetic */ ore0 mergeFrom(pre0 pre0Var) {
            return super.mergeFrom(pre0Var);
        }

        @Override // p204p.AbstractC2081l8
        /* JADX INFO: renamed from: mergeFrom */
        public /* bridge */ /* synthetic */ ore0 mo98376mergeFrom(byte[] bArr) {
            return super.mo98376mergeFrom(bArr);
        }

        @Override // com.google.protobuf.AbstractC0268g
        /* JADX INFO: renamed from: mergeFrom */
        public /* bridge */ /* synthetic */ ore0 mo98329mergeFrom(byte[] bArr, int i, int i2) {
            return super.mo98329mergeFrom(bArr, i, i2);
        }

        @Override // com.google.protobuf.AbstractC0268g
        /* JADX INFO: renamed from: mergeFrom */
        public /* bridge */ /* synthetic */ ore0 mo98330mergeFrom(byte[] bArr, int i, int i2, aux auxVar) {
            return super.mo98330mergeFrom(bArr, i, i2, auxVar);
        }

        @Override // p204p.AbstractC2081l8
        /* JADX INFO: renamed from: mergeFrom */
        public /* bridge */ /* synthetic */ ore0 mo98377mergeFrom(byte[] bArr, aux auxVar) {
            return super.mo98377mergeFrom(bArr, auxVar);
        }
    }

    public static final class ChatParticipationStatus extends AbstractC0269h implements ChatParticipationStatusOrBuilder {
        private static final ChatParticipationStatus DEFAULT_INSTANCE;
        private static volatile r2n0 PARSER;

        public static final class Builder extends AbstractC0268g implements ChatParticipationStatusOrBuilder {
            public /* synthetic */ Builder(int i) {
                this();
            }

            @Override // com.google.protobuf.AbstractC0268g, p204p.ore0
            public /* bridge */ /* synthetic */ pre0 build() {
                return build();
            }

            @Override // com.google.protobuf.AbstractC0268g, p204p.ore0
            public /* bridge */ /* synthetic */ pre0 buildPartial() {
                return super.buildPartial();
            }

            @Override // com.google.protobuf.AbstractC0268g
            /* JADX INFO: renamed from: clear */
            public /* bridge */ /* synthetic */ ore0 mo98325clear() {
                return mo98325clear();
            }

            @Override // com.google.protobuf.AbstractC0268g
            /* JADX INFO: renamed from: clone */
            public /* bridge */ /* synthetic */ Object mo98327clone() {
                return super.mo98326clone();
            }

            @Override // com.google.protobuf.AbstractC0268g, p204p.sre0
            public /* bridge */ /* synthetic */ pre0 getDefaultInstanceForType() {
                return super.getDefaultInstanceForType();
            }

            @Override // com.google.protobuf.AbstractC0268g, p204p.AbstractC2081l8
            public /* bridge */ /* synthetic */ AbstractC2081l8 internalMergeFrom(AbstractC2118m8 abstractC2118m8) {
                return super.internalMergeFrom((AbstractC0269h) abstractC2118m8);
            }

            @Override // com.google.protobuf.AbstractC0268g, p204p.AbstractC2081l8, p204p.ore0
            public /* bridge */ /* synthetic */ AbstractC2081l8 mergeFrom(owe oweVar, aux auxVar) {
                return super.mergeFrom(oweVar, auxVar);
            }

            private Builder() {
                super(ChatParticipationStatus.DEFAULT_INSTANCE);
            }

            @Override // com.google.protobuf.AbstractC0268g
            /* JADX INFO: renamed from: clone */
            public /* bridge */ /* synthetic */ AbstractC2081l8 mo98328clone() {
                return super.mo98326clone();
            }

            @Override // com.google.protobuf.AbstractC0268g, p204p.AbstractC2081l8
            /* JADX INFO: renamed from: mergeFrom */
            public /* bridge */ /* synthetic */ AbstractC2081l8 mo98329mergeFrom(byte[] bArr, int i, int i2) {
                return super.mo98329mergeFrom(bArr, i, i2);
            }

            @Override // com.google.protobuf.AbstractC0268g
            /* JADX INFO: renamed from: clone */
            public /* bridge */ /* synthetic */ ore0 mo98328clone() {
                return super.mo98326clone();
            }

            @Override // com.google.protobuf.AbstractC0268g, p204p.AbstractC2081l8
            /* JADX INFO: renamed from: mergeFrom */
            public /* bridge */ /* synthetic */ AbstractC2081l8 mo98330mergeFrom(byte[] bArr, int i, int i2, aux auxVar) {
                return super.mo98330mergeFrom(bArr, i, i2, auxVar);
            }

            @Override // p204p.AbstractC2081l8
            /* JADX INFO: renamed from: mergeFrom */
            public /* bridge */ /* synthetic */ ore0 mo98371mergeFrom(InputStream inputStream) {
                return super.mo98371mergeFrom(inputStream);
            }

            @Override // p204p.AbstractC2081l8
            /* JADX INFO: renamed from: mergeFrom */
            public /* bridge */ /* synthetic */ ore0 mo98372mergeFrom(InputStream inputStream, aux auxVar) {
                return super.mo98372mergeFrom(inputStream, auxVar);
            }

            @Override // p204p.AbstractC2081l8
            /* JADX INFO: renamed from: mergeFrom */
            public /* bridge */ /* synthetic */ ore0 mo98373mergeFrom(gva gvaVar) {
                return super.mo98373mergeFrom(gvaVar);
            }

            @Override // p204p.AbstractC2081l8
            /* JADX INFO: renamed from: mergeFrom */
            public /* bridge */ /* synthetic */ ore0 mo98374mergeFrom(gva gvaVar, aux auxVar) {
                return super.mo98374mergeFrom(gvaVar, auxVar);
            }

            @Override // p204p.AbstractC2081l8
            /* JADX INFO: renamed from: mergeFrom */
            public /* bridge */ /* synthetic */ ore0 mo98375mergeFrom(owe oweVar) {
                return super.mo98375mergeFrom(oweVar);
            }

            @Override // com.google.protobuf.AbstractC0268g, p204p.ore0
            public /* bridge */ /* synthetic */ ore0 mergeFrom(owe oweVar, aux auxVar) {
                return super.mergeFrom(oweVar, auxVar);
            }

            @Override // p204p.AbstractC2081l8, p204p.ore0
            public /* bridge */ /* synthetic */ ore0 mergeFrom(pre0 pre0Var) {
                return super.mergeFrom(pre0Var);
            }

            @Override // p204p.AbstractC2081l8
            /* JADX INFO: renamed from: mergeFrom */
            public /* bridge */ /* synthetic */ ore0 mo98376mergeFrom(byte[] bArr) {
                return super.mo98376mergeFrom(bArr);
            }

            @Override // com.google.protobuf.AbstractC0268g
            /* JADX INFO: renamed from: mergeFrom */
            public /* bridge */ /* synthetic */ ore0 mo98329mergeFrom(byte[] bArr, int i, int i2) {
                return super.mo98329mergeFrom(bArr, i, i2);
            }

            @Override // com.google.protobuf.AbstractC0268g
            /* JADX INFO: renamed from: mergeFrom */
            public /* bridge */ /* synthetic */ ore0 mo98330mergeFrom(byte[] bArr, int i, int i2, aux auxVar) {
                return super.mo98330mergeFrom(bArr, i, i2, auxVar);
            }

            @Override // p204p.AbstractC2081l8
            /* JADX INFO: renamed from: mergeFrom */
            public /* bridge */ /* synthetic */ ore0 mo98377mergeFrom(byte[] bArr, aux auxVar) {
                return super.mo98377mergeFrom(bArr, auxVar);
            }
        }

        static {
            ChatParticipationStatus chatParticipationStatus = new ChatParticipationStatus();
            DEFAULT_INSTANCE = chatParticipationStatus;
            AbstractC0269h.registerDefaultInstance(ChatParticipationStatus.class, chatParticipationStatus);
        }

        private ChatParticipationStatus() {
        }

        public static ChatParticipationStatus getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static ChatParticipationStatus parseDelimitedFrom(InputStream inputStream) {
            return (ChatParticipationStatus) AbstractC0269h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static ChatParticipationStatus parseFrom(ByteBuffer byteBuffer) {
            return (ChatParticipationStatus) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, byteBuffer);
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
                return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0000", null);
            }
            if (iOrdinal == 3) {
                return new ChatParticipationStatus();
            }
            if (iOrdinal == 4) {
                return new Builder(0);
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
            synchronized (ChatParticipationStatus.class) {
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
        public /* bridge */ /* synthetic */ pre0 getDefaultInstanceForType() {
            return getDefaultInstanceForType();
        }

        @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
        public /* bridge */ /* synthetic */ ore0 newBuilderForType() {
            return newBuilderForType();
        }

        @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
        public /* bridge */ /* synthetic */ ore0 toBuilder() {
            return toBuilder();
        }

        public static Builder newBuilder(ChatParticipationStatus chatParticipationStatus) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(chatParticipationStatus);
        }

        public static ChatParticipationStatus parseDelimitedFrom(InputStream inputStream, aux auxVar) {
            return (ChatParticipationStatus) AbstractC0269h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, auxVar);
        }

        public static ChatParticipationStatus parseFrom(ByteBuffer byteBuffer, aux auxVar) {
            return (ChatParticipationStatus) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, byteBuffer, auxVar);
        }

        public static ChatParticipationStatus parseFrom(gva gvaVar) {
            return (ChatParticipationStatus) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, gvaVar);
        }

        public static ChatParticipationStatus parseFrom(gva gvaVar, aux auxVar) {
            return (ChatParticipationStatus) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, gvaVar, auxVar);
        }

        public static ChatParticipationStatus parseFrom(byte[] bArr) {
            return (ChatParticipationStatus) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static ChatParticipationStatus parseFrom(byte[] bArr, aux auxVar) {
            return (ChatParticipationStatus) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr, auxVar);
        }

        public static ChatParticipationStatus parseFrom(InputStream inputStream) {
            return (ChatParticipationStatus) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static ChatParticipationStatus parseFrom(InputStream inputStream, aux auxVar) {
            return (ChatParticipationStatus) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, inputStream, auxVar);
        }

        public static ChatParticipationStatus parseFrom(owe oweVar) {
            return (ChatParticipationStatus) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, oweVar);
        }

        public static ChatParticipationStatus parseFrom(owe oweVar, aux auxVar) {
            return (ChatParticipationStatus) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, oweVar, auxVar);
        }
    }

    public interface ChatParticipationStatusOrBuilder extends sre0 {
        @Override // p204p.sre0
        /* synthetic */ pre0 getDefaultInstanceForType();

        @Override // p204p.sre0
        /* synthetic */ boolean isInitialized();
    }

    public enum ECase {
        UNSPECIFIED(1),
        SHOULD_ASSURE_AGE(2),
        OPT_OUT(3),
        RESTRICTED_FROM_MESSAGING(4),
        LINK_EXPIRED(5),
        PARTICIPATION_STATUS(6),
        UNRELEASED_MARKET(8),
        TOO_YOUNG(9),
        GROUPS_NOT_ENABLED(11),
        MEMBER_LIMIT_EXCEEDED(12),
        JOIN_LIMIT_EXCEEDED(13),
        VIOLATIVE_CONTENT(14),
        NOT_AN_ADMIN(15),
        NOT_TRUSTED(16),
        USER_BLOCKED(17),
        E_NOT_SET(0);

        private final int value;

        ECase(int i) {
            this.value = i;
        }

        public static ECase forNumber(int i) {
            switch (i) {
                case 0:
                    return E_NOT_SET;
                case 1:
                    return UNSPECIFIED;
                case 2:
                    return SHOULD_ASSURE_AGE;
                case 3:
                    return OPT_OUT;
                case 4:
                    return RESTRICTED_FROM_MESSAGING;
                case 5:
                    return LINK_EXPIRED;
                case 6:
                    return PARTICIPATION_STATUS;
                case 7:
                case 10:
                default:
                    return null;
                case 8:
                    return UNRELEASED_MARKET;
                case 9:
                    return TOO_YOUNG;
                case 11:
                    return GROUPS_NOT_ENABLED;
                case 12:
                    return MEMBER_LIMIT_EXCEEDED;
                case 13:
                    return JOIN_LIMIT_EXCEEDED;
                case 14:
                    return VIOLATIVE_CONTENT;
                case 15:
                    return NOT_AN_ADMIN;
                case 16:
                    return NOT_TRUSTED;
                case 17:
                    return USER_BLOCKED;
            }
        }

        public int getNumber() {
            return this.value;
        }

        @Deprecated
        public static ECase valueOf(int i) {
            return forNumber(i);
        }
    }

    public static final class GroupsNotEnabled extends AbstractC0269h implements GroupsNotEnabledOrBuilder {
        private static final GroupsNotEnabled DEFAULT_INSTANCE;
        private static volatile r2n0 PARSER;

        public static final class Builder extends AbstractC0268g implements GroupsNotEnabledOrBuilder {
            public /* synthetic */ Builder(int i) {
                this();
            }

            @Override // com.google.protobuf.AbstractC0268g, p204p.ore0
            public /* bridge */ /* synthetic */ pre0 build() {
                return build();
            }

            @Override // com.google.protobuf.AbstractC0268g, p204p.ore0
            public /* bridge */ /* synthetic */ pre0 buildPartial() {
                return super.buildPartial();
            }

            @Override // com.google.protobuf.AbstractC0268g
            /* JADX INFO: renamed from: clear */
            public /* bridge */ /* synthetic */ ore0 mo98325clear() {
                return mo98325clear();
            }

            @Override // com.google.protobuf.AbstractC0268g
            /* JADX INFO: renamed from: clone */
            public /* bridge */ /* synthetic */ Object mo98327clone() {
                return super.mo98326clone();
            }

            @Override // com.google.protobuf.AbstractC0268g, p204p.sre0
            public /* bridge */ /* synthetic */ pre0 getDefaultInstanceForType() {
                return super.getDefaultInstanceForType();
            }

            @Override // com.google.protobuf.AbstractC0268g, p204p.AbstractC2081l8
            public /* bridge */ /* synthetic */ AbstractC2081l8 internalMergeFrom(AbstractC2118m8 abstractC2118m8) {
                return super.internalMergeFrom((AbstractC0269h) abstractC2118m8);
            }

            @Override // com.google.protobuf.AbstractC0268g, p204p.AbstractC2081l8, p204p.ore0
            public /* bridge */ /* synthetic */ AbstractC2081l8 mergeFrom(owe oweVar, aux auxVar) {
                return super.mergeFrom(oweVar, auxVar);
            }

            private Builder() {
                super(GroupsNotEnabled.DEFAULT_INSTANCE);
            }

            @Override // com.google.protobuf.AbstractC0268g
            /* JADX INFO: renamed from: clone */
            public /* bridge */ /* synthetic */ AbstractC2081l8 mo98328clone() {
                return super.mo98326clone();
            }

            @Override // com.google.protobuf.AbstractC0268g, p204p.AbstractC2081l8
            /* JADX INFO: renamed from: mergeFrom */
            public /* bridge */ /* synthetic */ AbstractC2081l8 mo98329mergeFrom(byte[] bArr, int i, int i2) {
                return super.mo98329mergeFrom(bArr, i, i2);
            }

            @Override // com.google.protobuf.AbstractC0268g
            /* JADX INFO: renamed from: clone */
            public /* bridge */ /* synthetic */ ore0 mo98328clone() {
                return super.mo98326clone();
            }

            @Override // com.google.protobuf.AbstractC0268g, p204p.AbstractC2081l8
            /* JADX INFO: renamed from: mergeFrom */
            public /* bridge */ /* synthetic */ AbstractC2081l8 mo98330mergeFrom(byte[] bArr, int i, int i2, aux auxVar) {
                return super.mo98330mergeFrom(bArr, i, i2, auxVar);
            }

            @Override // p204p.AbstractC2081l8
            /* JADX INFO: renamed from: mergeFrom */
            public /* bridge */ /* synthetic */ ore0 mo98371mergeFrom(InputStream inputStream) {
                return super.mo98371mergeFrom(inputStream);
            }

            @Override // p204p.AbstractC2081l8
            /* JADX INFO: renamed from: mergeFrom */
            public /* bridge */ /* synthetic */ ore0 mo98372mergeFrom(InputStream inputStream, aux auxVar) {
                return super.mo98372mergeFrom(inputStream, auxVar);
            }

            @Override // p204p.AbstractC2081l8
            /* JADX INFO: renamed from: mergeFrom */
            public /* bridge */ /* synthetic */ ore0 mo98373mergeFrom(gva gvaVar) {
                return super.mo98373mergeFrom(gvaVar);
            }

            @Override // p204p.AbstractC2081l8
            /* JADX INFO: renamed from: mergeFrom */
            public /* bridge */ /* synthetic */ ore0 mo98374mergeFrom(gva gvaVar, aux auxVar) {
                return super.mo98374mergeFrom(gvaVar, auxVar);
            }

            @Override // p204p.AbstractC2081l8
            /* JADX INFO: renamed from: mergeFrom */
            public /* bridge */ /* synthetic */ ore0 mo98375mergeFrom(owe oweVar) {
                return super.mo98375mergeFrom(oweVar);
            }

            @Override // com.google.protobuf.AbstractC0268g, p204p.ore0
            public /* bridge */ /* synthetic */ ore0 mergeFrom(owe oweVar, aux auxVar) {
                return super.mergeFrom(oweVar, auxVar);
            }

            @Override // p204p.AbstractC2081l8, p204p.ore0
            public /* bridge */ /* synthetic */ ore0 mergeFrom(pre0 pre0Var) {
                return super.mergeFrom(pre0Var);
            }

            @Override // p204p.AbstractC2081l8
            /* JADX INFO: renamed from: mergeFrom */
            public /* bridge */ /* synthetic */ ore0 mo98376mergeFrom(byte[] bArr) {
                return super.mo98376mergeFrom(bArr);
            }

            @Override // com.google.protobuf.AbstractC0268g
            /* JADX INFO: renamed from: mergeFrom */
            public /* bridge */ /* synthetic */ ore0 mo98329mergeFrom(byte[] bArr, int i, int i2) {
                return super.mo98329mergeFrom(bArr, i, i2);
            }

            @Override // com.google.protobuf.AbstractC0268g
            /* JADX INFO: renamed from: mergeFrom */
            public /* bridge */ /* synthetic */ ore0 mo98330mergeFrom(byte[] bArr, int i, int i2, aux auxVar) {
                return super.mo98330mergeFrom(bArr, i, i2, auxVar);
            }

            @Override // p204p.AbstractC2081l8
            /* JADX INFO: renamed from: mergeFrom */
            public /* bridge */ /* synthetic */ ore0 mo98377mergeFrom(byte[] bArr, aux auxVar) {
                return super.mo98377mergeFrom(bArr, auxVar);
            }
        }

        static {
            GroupsNotEnabled groupsNotEnabled = new GroupsNotEnabled();
            DEFAULT_INSTANCE = groupsNotEnabled;
            AbstractC0269h.registerDefaultInstance(GroupsNotEnabled.class, groupsNotEnabled);
        }

        private GroupsNotEnabled() {
        }

        public static GroupsNotEnabled getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static GroupsNotEnabled parseDelimitedFrom(InputStream inputStream) {
            return (GroupsNotEnabled) AbstractC0269h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static GroupsNotEnabled parseFrom(ByteBuffer byteBuffer) {
            return (GroupsNotEnabled) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, byteBuffer);
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
                return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0000", null);
            }
            if (iOrdinal == 3) {
                return new GroupsNotEnabled();
            }
            if (iOrdinal == 4) {
                return new Builder(0);
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
            synchronized (GroupsNotEnabled.class) {
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
        public /* bridge */ /* synthetic */ pre0 getDefaultInstanceForType() {
            return getDefaultInstanceForType();
        }

        @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
        public /* bridge */ /* synthetic */ ore0 newBuilderForType() {
            return newBuilderForType();
        }

        @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
        public /* bridge */ /* synthetic */ ore0 toBuilder() {
            return toBuilder();
        }

        public static Builder newBuilder(GroupsNotEnabled groupsNotEnabled) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(groupsNotEnabled);
        }

        public static GroupsNotEnabled parseDelimitedFrom(InputStream inputStream, aux auxVar) {
            return (GroupsNotEnabled) AbstractC0269h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, auxVar);
        }

        public static GroupsNotEnabled parseFrom(ByteBuffer byteBuffer, aux auxVar) {
            return (GroupsNotEnabled) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, byteBuffer, auxVar);
        }

        public static GroupsNotEnabled parseFrom(gva gvaVar) {
            return (GroupsNotEnabled) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, gvaVar);
        }

        public static GroupsNotEnabled parseFrom(gva gvaVar, aux auxVar) {
            return (GroupsNotEnabled) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, gvaVar, auxVar);
        }

        public static GroupsNotEnabled parseFrom(byte[] bArr) {
            return (GroupsNotEnabled) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static GroupsNotEnabled parseFrom(byte[] bArr, aux auxVar) {
            return (GroupsNotEnabled) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr, auxVar);
        }

        public static GroupsNotEnabled parseFrom(InputStream inputStream) {
            return (GroupsNotEnabled) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static GroupsNotEnabled parseFrom(InputStream inputStream, aux auxVar) {
            return (GroupsNotEnabled) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, inputStream, auxVar);
        }

        public static GroupsNotEnabled parseFrom(owe oweVar) {
            return (GroupsNotEnabled) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, oweVar);
        }

        public static GroupsNotEnabled parseFrom(owe oweVar, aux auxVar) {
            return (GroupsNotEnabled) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, oweVar, auxVar);
        }
    }

    public interface GroupsNotEnabledOrBuilder extends sre0 {
        @Override // p204p.sre0
        /* synthetic */ pre0 getDefaultInstanceForType();

        @Override // p204p.sre0
        /* synthetic */ boolean isInitialized();
    }

    public static final class JoinLimitExceeded extends AbstractC0269h implements JoinLimitExceededOrBuilder {
        private static final JoinLimitExceeded DEFAULT_INSTANCE;
        private static volatile r2n0 PARSER;

        public static final class Builder extends AbstractC0268g implements JoinLimitExceededOrBuilder {
            public /* synthetic */ Builder(int i) {
                this();
            }

            @Override // com.google.protobuf.AbstractC0268g, p204p.ore0
            public /* bridge */ /* synthetic */ pre0 build() {
                return build();
            }

            @Override // com.google.protobuf.AbstractC0268g, p204p.ore0
            public /* bridge */ /* synthetic */ pre0 buildPartial() {
                return super.buildPartial();
            }

            @Override // com.google.protobuf.AbstractC0268g
            /* JADX INFO: renamed from: clear */
            public /* bridge */ /* synthetic */ ore0 mo98325clear() {
                return mo98325clear();
            }

            @Override // com.google.protobuf.AbstractC0268g
            /* JADX INFO: renamed from: clone */
            public /* bridge */ /* synthetic */ Object mo98327clone() {
                return super.mo98326clone();
            }

            @Override // com.google.protobuf.AbstractC0268g, p204p.sre0
            public /* bridge */ /* synthetic */ pre0 getDefaultInstanceForType() {
                return super.getDefaultInstanceForType();
            }

            @Override // com.google.protobuf.AbstractC0268g, p204p.AbstractC2081l8
            public /* bridge */ /* synthetic */ AbstractC2081l8 internalMergeFrom(AbstractC2118m8 abstractC2118m8) {
                return super.internalMergeFrom((AbstractC0269h) abstractC2118m8);
            }

            @Override // com.google.protobuf.AbstractC0268g, p204p.AbstractC2081l8, p204p.ore0
            public /* bridge */ /* synthetic */ AbstractC2081l8 mergeFrom(owe oweVar, aux auxVar) {
                return super.mergeFrom(oweVar, auxVar);
            }

            private Builder() {
                super(JoinLimitExceeded.DEFAULT_INSTANCE);
            }

            @Override // com.google.protobuf.AbstractC0268g
            /* JADX INFO: renamed from: clone */
            public /* bridge */ /* synthetic */ AbstractC2081l8 mo98328clone() {
                return super.mo98326clone();
            }

            @Override // com.google.protobuf.AbstractC0268g, p204p.AbstractC2081l8
            /* JADX INFO: renamed from: mergeFrom */
            public /* bridge */ /* synthetic */ AbstractC2081l8 mo98329mergeFrom(byte[] bArr, int i, int i2) {
                return super.mo98329mergeFrom(bArr, i, i2);
            }

            @Override // com.google.protobuf.AbstractC0268g
            /* JADX INFO: renamed from: clone */
            public /* bridge */ /* synthetic */ ore0 mo98328clone() {
                return super.mo98326clone();
            }

            @Override // com.google.protobuf.AbstractC0268g, p204p.AbstractC2081l8
            /* JADX INFO: renamed from: mergeFrom */
            public /* bridge */ /* synthetic */ AbstractC2081l8 mo98330mergeFrom(byte[] bArr, int i, int i2, aux auxVar) {
                return super.mo98330mergeFrom(bArr, i, i2, auxVar);
            }

            @Override // p204p.AbstractC2081l8
            /* JADX INFO: renamed from: mergeFrom */
            public /* bridge */ /* synthetic */ ore0 mo98371mergeFrom(InputStream inputStream) {
                return super.mo98371mergeFrom(inputStream);
            }

            @Override // p204p.AbstractC2081l8
            /* JADX INFO: renamed from: mergeFrom */
            public /* bridge */ /* synthetic */ ore0 mo98372mergeFrom(InputStream inputStream, aux auxVar) {
                return super.mo98372mergeFrom(inputStream, auxVar);
            }

            @Override // p204p.AbstractC2081l8
            /* JADX INFO: renamed from: mergeFrom */
            public /* bridge */ /* synthetic */ ore0 mo98373mergeFrom(gva gvaVar) {
                return super.mo98373mergeFrom(gvaVar);
            }

            @Override // p204p.AbstractC2081l8
            /* JADX INFO: renamed from: mergeFrom */
            public /* bridge */ /* synthetic */ ore0 mo98374mergeFrom(gva gvaVar, aux auxVar) {
                return super.mo98374mergeFrom(gvaVar, auxVar);
            }

            @Override // p204p.AbstractC2081l8
            /* JADX INFO: renamed from: mergeFrom */
            public /* bridge */ /* synthetic */ ore0 mo98375mergeFrom(owe oweVar) {
                return super.mo98375mergeFrom(oweVar);
            }

            @Override // com.google.protobuf.AbstractC0268g, p204p.ore0
            public /* bridge */ /* synthetic */ ore0 mergeFrom(owe oweVar, aux auxVar) {
                return super.mergeFrom(oweVar, auxVar);
            }

            @Override // p204p.AbstractC2081l8, p204p.ore0
            public /* bridge */ /* synthetic */ ore0 mergeFrom(pre0 pre0Var) {
                return super.mergeFrom(pre0Var);
            }

            @Override // p204p.AbstractC2081l8
            /* JADX INFO: renamed from: mergeFrom */
            public /* bridge */ /* synthetic */ ore0 mo98376mergeFrom(byte[] bArr) {
                return super.mo98376mergeFrom(bArr);
            }

            @Override // com.google.protobuf.AbstractC0268g
            /* JADX INFO: renamed from: mergeFrom */
            public /* bridge */ /* synthetic */ ore0 mo98329mergeFrom(byte[] bArr, int i, int i2) {
                return super.mo98329mergeFrom(bArr, i, i2);
            }

            @Override // com.google.protobuf.AbstractC0268g
            /* JADX INFO: renamed from: mergeFrom */
            public /* bridge */ /* synthetic */ ore0 mo98330mergeFrom(byte[] bArr, int i, int i2, aux auxVar) {
                return super.mo98330mergeFrom(bArr, i, i2, auxVar);
            }

            @Override // p204p.AbstractC2081l8
            /* JADX INFO: renamed from: mergeFrom */
            public /* bridge */ /* synthetic */ ore0 mo98377mergeFrom(byte[] bArr, aux auxVar) {
                return super.mo98377mergeFrom(bArr, auxVar);
            }
        }

        static {
            JoinLimitExceeded joinLimitExceeded = new JoinLimitExceeded();
            DEFAULT_INSTANCE = joinLimitExceeded;
            AbstractC0269h.registerDefaultInstance(JoinLimitExceeded.class, joinLimitExceeded);
        }

        private JoinLimitExceeded() {
        }

        public static JoinLimitExceeded getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static JoinLimitExceeded parseDelimitedFrom(InputStream inputStream) {
            return (JoinLimitExceeded) AbstractC0269h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static JoinLimitExceeded parseFrom(ByteBuffer byteBuffer) {
            return (JoinLimitExceeded) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, byteBuffer);
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
                return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0000", null);
            }
            if (iOrdinal == 3) {
                return new JoinLimitExceeded();
            }
            if (iOrdinal == 4) {
                return new Builder(0);
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
            synchronized (JoinLimitExceeded.class) {
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
        public /* bridge */ /* synthetic */ pre0 getDefaultInstanceForType() {
            return getDefaultInstanceForType();
        }

        @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
        public /* bridge */ /* synthetic */ ore0 newBuilderForType() {
            return newBuilderForType();
        }

        @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
        public /* bridge */ /* synthetic */ ore0 toBuilder() {
            return toBuilder();
        }

        public static Builder newBuilder(JoinLimitExceeded joinLimitExceeded) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(joinLimitExceeded);
        }

        public static JoinLimitExceeded parseDelimitedFrom(InputStream inputStream, aux auxVar) {
            return (JoinLimitExceeded) AbstractC0269h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, auxVar);
        }

        public static JoinLimitExceeded parseFrom(ByteBuffer byteBuffer, aux auxVar) {
            return (JoinLimitExceeded) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, byteBuffer, auxVar);
        }

        public static JoinLimitExceeded parseFrom(gva gvaVar) {
            return (JoinLimitExceeded) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, gvaVar);
        }

        public static JoinLimitExceeded parseFrom(gva gvaVar, aux auxVar) {
            return (JoinLimitExceeded) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, gvaVar, auxVar);
        }

        public static JoinLimitExceeded parseFrom(byte[] bArr) {
            return (JoinLimitExceeded) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static JoinLimitExceeded parseFrom(byte[] bArr, aux auxVar) {
            return (JoinLimitExceeded) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr, auxVar);
        }

        public static JoinLimitExceeded parseFrom(InputStream inputStream) {
            return (JoinLimitExceeded) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static JoinLimitExceeded parseFrom(InputStream inputStream, aux auxVar) {
            return (JoinLimitExceeded) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, inputStream, auxVar);
        }

        public static JoinLimitExceeded parseFrom(owe oweVar) {
            return (JoinLimitExceeded) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, oweVar);
        }

        public static JoinLimitExceeded parseFrom(owe oweVar, aux auxVar) {
            return (JoinLimitExceeded) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, oweVar, auxVar);
        }
    }

    public interface JoinLimitExceededOrBuilder extends sre0 {
        @Override // p204p.sre0
        /* synthetic */ pre0 getDefaultInstanceForType();

        @Override // p204p.sre0
        /* synthetic */ boolean isInitialized();
    }

    public static final class LinkExpired extends AbstractC0269h implements LinkExpiredOrBuilder {
        private static final LinkExpired DEFAULT_INSTANCE;
        private static volatile r2n0 PARSER;

        public static final class Builder extends AbstractC0268g implements LinkExpiredOrBuilder {
            public /* synthetic */ Builder(int i) {
                this();
            }

            @Override // com.google.protobuf.AbstractC0268g, p204p.ore0
            public /* bridge */ /* synthetic */ pre0 build() {
                return build();
            }

            @Override // com.google.protobuf.AbstractC0268g, p204p.ore0
            public /* bridge */ /* synthetic */ pre0 buildPartial() {
                return super.buildPartial();
            }

            @Override // com.google.protobuf.AbstractC0268g
            /* JADX INFO: renamed from: clear */
            public /* bridge */ /* synthetic */ ore0 mo98325clear() {
                return mo98325clear();
            }

            @Override // com.google.protobuf.AbstractC0268g
            /* JADX INFO: renamed from: clone */
            public /* bridge */ /* synthetic */ Object mo98327clone() {
                return super.mo98326clone();
            }

            @Override // com.google.protobuf.AbstractC0268g, p204p.sre0
            public /* bridge */ /* synthetic */ pre0 getDefaultInstanceForType() {
                return super.getDefaultInstanceForType();
            }

            @Override // com.google.protobuf.AbstractC0268g, p204p.AbstractC2081l8
            public /* bridge */ /* synthetic */ AbstractC2081l8 internalMergeFrom(AbstractC2118m8 abstractC2118m8) {
                return super.internalMergeFrom((AbstractC0269h) abstractC2118m8);
            }

            @Override // com.google.protobuf.AbstractC0268g, p204p.AbstractC2081l8, p204p.ore0
            public /* bridge */ /* synthetic */ AbstractC2081l8 mergeFrom(owe oweVar, aux auxVar) {
                return super.mergeFrom(oweVar, auxVar);
            }

            private Builder() {
                super(LinkExpired.DEFAULT_INSTANCE);
            }

            @Override // com.google.protobuf.AbstractC0268g
            /* JADX INFO: renamed from: clone */
            public /* bridge */ /* synthetic */ AbstractC2081l8 mo98328clone() {
                return super.mo98326clone();
            }

            @Override // com.google.protobuf.AbstractC0268g, p204p.AbstractC2081l8
            /* JADX INFO: renamed from: mergeFrom */
            public /* bridge */ /* synthetic */ AbstractC2081l8 mo98329mergeFrom(byte[] bArr, int i, int i2) {
                return super.mo98329mergeFrom(bArr, i, i2);
            }

            @Override // com.google.protobuf.AbstractC0268g
            /* JADX INFO: renamed from: clone */
            public /* bridge */ /* synthetic */ ore0 mo98328clone() {
                return super.mo98326clone();
            }

            @Override // com.google.protobuf.AbstractC0268g, p204p.AbstractC2081l8
            /* JADX INFO: renamed from: mergeFrom */
            public /* bridge */ /* synthetic */ AbstractC2081l8 mo98330mergeFrom(byte[] bArr, int i, int i2, aux auxVar) {
                return super.mo98330mergeFrom(bArr, i, i2, auxVar);
            }

            @Override // p204p.AbstractC2081l8
            /* JADX INFO: renamed from: mergeFrom */
            public /* bridge */ /* synthetic */ ore0 mo98371mergeFrom(InputStream inputStream) {
                return super.mo98371mergeFrom(inputStream);
            }

            @Override // p204p.AbstractC2081l8
            /* JADX INFO: renamed from: mergeFrom */
            public /* bridge */ /* synthetic */ ore0 mo98372mergeFrom(InputStream inputStream, aux auxVar) {
                return super.mo98372mergeFrom(inputStream, auxVar);
            }

            @Override // p204p.AbstractC2081l8
            /* JADX INFO: renamed from: mergeFrom */
            public /* bridge */ /* synthetic */ ore0 mo98373mergeFrom(gva gvaVar) {
                return super.mo98373mergeFrom(gvaVar);
            }

            @Override // p204p.AbstractC2081l8
            /* JADX INFO: renamed from: mergeFrom */
            public /* bridge */ /* synthetic */ ore0 mo98374mergeFrom(gva gvaVar, aux auxVar) {
                return super.mo98374mergeFrom(gvaVar, auxVar);
            }

            @Override // p204p.AbstractC2081l8
            /* JADX INFO: renamed from: mergeFrom */
            public /* bridge */ /* synthetic */ ore0 mo98375mergeFrom(owe oweVar) {
                return super.mo98375mergeFrom(oweVar);
            }

            @Override // com.google.protobuf.AbstractC0268g, p204p.ore0
            public /* bridge */ /* synthetic */ ore0 mergeFrom(owe oweVar, aux auxVar) {
                return super.mergeFrom(oweVar, auxVar);
            }

            @Override // p204p.AbstractC2081l8, p204p.ore0
            public /* bridge */ /* synthetic */ ore0 mergeFrom(pre0 pre0Var) {
                return super.mergeFrom(pre0Var);
            }

            @Override // p204p.AbstractC2081l8
            /* JADX INFO: renamed from: mergeFrom */
            public /* bridge */ /* synthetic */ ore0 mo98376mergeFrom(byte[] bArr) {
                return super.mo98376mergeFrom(bArr);
            }

            @Override // com.google.protobuf.AbstractC0268g
            /* JADX INFO: renamed from: mergeFrom */
            public /* bridge */ /* synthetic */ ore0 mo98329mergeFrom(byte[] bArr, int i, int i2) {
                return super.mo98329mergeFrom(bArr, i, i2);
            }

            @Override // com.google.protobuf.AbstractC0268g
            /* JADX INFO: renamed from: mergeFrom */
            public /* bridge */ /* synthetic */ ore0 mo98330mergeFrom(byte[] bArr, int i, int i2, aux auxVar) {
                return super.mo98330mergeFrom(bArr, i, i2, auxVar);
            }

            @Override // p204p.AbstractC2081l8
            /* JADX INFO: renamed from: mergeFrom */
            public /* bridge */ /* synthetic */ ore0 mo98377mergeFrom(byte[] bArr, aux auxVar) {
                return super.mo98377mergeFrom(bArr, auxVar);
            }
        }

        static {
            LinkExpired linkExpired = new LinkExpired();
            DEFAULT_INSTANCE = linkExpired;
            AbstractC0269h.registerDefaultInstance(LinkExpired.class, linkExpired);
        }

        private LinkExpired() {
        }

        public static LinkExpired getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static LinkExpired parseDelimitedFrom(InputStream inputStream) {
            return (LinkExpired) AbstractC0269h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static LinkExpired parseFrom(ByteBuffer byteBuffer) {
            return (LinkExpired) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, byteBuffer);
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
                return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0000", null);
            }
            if (iOrdinal == 3) {
                return new LinkExpired();
            }
            if (iOrdinal == 4) {
                return new Builder(0);
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
            synchronized (LinkExpired.class) {
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
        public /* bridge */ /* synthetic */ pre0 getDefaultInstanceForType() {
            return getDefaultInstanceForType();
        }

        @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
        public /* bridge */ /* synthetic */ ore0 newBuilderForType() {
            return newBuilderForType();
        }

        @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
        public /* bridge */ /* synthetic */ ore0 toBuilder() {
            return toBuilder();
        }

        public static Builder newBuilder(LinkExpired linkExpired) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(linkExpired);
        }

        public static LinkExpired parseDelimitedFrom(InputStream inputStream, aux auxVar) {
            return (LinkExpired) AbstractC0269h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, auxVar);
        }

        public static LinkExpired parseFrom(ByteBuffer byteBuffer, aux auxVar) {
            return (LinkExpired) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, byteBuffer, auxVar);
        }

        public static LinkExpired parseFrom(gva gvaVar) {
            return (LinkExpired) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, gvaVar);
        }

        public static LinkExpired parseFrom(gva gvaVar, aux auxVar) {
            return (LinkExpired) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, gvaVar, auxVar);
        }

        public static LinkExpired parseFrom(byte[] bArr) {
            return (LinkExpired) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static LinkExpired parseFrom(byte[] bArr, aux auxVar) {
            return (LinkExpired) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr, auxVar);
        }

        public static LinkExpired parseFrom(InputStream inputStream) {
            return (LinkExpired) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static LinkExpired parseFrom(InputStream inputStream, aux auxVar) {
            return (LinkExpired) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, inputStream, auxVar);
        }

        public static LinkExpired parseFrom(owe oweVar) {
            return (LinkExpired) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, oweVar);
        }

        public static LinkExpired parseFrom(owe oweVar, aux auxVar) {
            return (LinkExpired) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, oweVar, auxVar);
        }
    }

    public interface LinkExpiredOrBuilder extends sre0 {
        @Override // p204p.sre0
        /* synthetic */ pre0 getDefaultInstanceForType();

        @Override // p204p.sre0
        /* synthetic */ boolean isInitialized();
    }

    public static final class MemberLimitExceeded extends AbstractC0269h implements MemberLimitExceededOrBuilder {
        private static final MemberLimitExceeded DEFAULT_INSTANCE;
        private static volatile r2n0 PARSER;

        public static final class Builder extends AbstractC0268g implements MemberLimitExceededOrBuilder {
            public /* synthetic */ Builder(int i) {
                this();
            }

            @Override // com.google.protobuf.AbstractC0268g, p204p.ore0
            public /* bridge */ /* synthetic */ pre0 build() {
                return build();
            }

            @Override // com.google.protobuf.AbstractC0268g, p204p.ore0
            public /* bridge */ /* synthetic */ pre0 buildPartial() {
                return super.buildPartial();
            }

            @Override // com.google.protobuf.AbstractC0268g
            /* JADX INFO: renamed from: clear */
            public /* bridge */ /* synthetic */ ore0 mo98325clear() {
                return mo98325clear();
            }

            @Override // com.google.protobuf.AbstractC0268g
            /* JADX INFO: renamed from: clone */
            public /* bridge */ /* synthetic */ Object mo98327clone() {
                return super.mo98326clone();
            }

            @Override // com.google.protobuf.AbstractC0268g, p204p.sre0
            public /* bridge */ /* synthetic */ pre0 getDefaultInstanceForType() {
                return super.getDefaultInstanceForType();
            }

            @Override // com.google.protobuf.AbstractC0268g, p204p.AbstractC2081l8
            public /* bridge */ /* synthetic */ AbstractC2081l8 internalMergeFrom(AbstractC2118m8 abstractC2118m8) {
                return super.internalMergeFrom((AbstractC0269h) abstractC2118m8);
            }

            @Override // com.google.protobuf.AbstractC0268g, p204p.AbstractC2081l8, p204p.ore0
            public /* bridge */ /* synthetic */ AbstractC2081l8 mergeFrom(owe oweVar, aux auxVar) {
                return super.mergeFrom(oweVar, auxVar);
            }

            private Builder() {
                super(MemberLimitExceeded.DEFAULT_INSTANCE);
            }

            @Override // com.google.protobuf.AbstractC0268g
            /* JADX INFO: renamed from: clone */
            public /* bridge */ /* synthetic */ AbstractC2081l8 mo98328clone() {
                return super.mo98326clone();
            }

            @Override // com.google.protobuf.AbstractC0268g, p204p.AbstractC2081l8
            /* JADX INFO: renamed from: mergeFrom */
            public /* bridge */ /* synthetic */ AbstractC2081l8 mo98329mergeFrom(byte[] bArr, int i, int i2) {
                return super.mo98329mergeFrom(bArr, i, i2);
            }

            @Override // com.google.protobuf.AbstractC0268g
            /* JADX INFO: renamed from: clone */
            public /* bridge */ /* synthetic */ ore0 mo98328clone() {
                return super.mo98326clone();
            }

            @Override // com.google.protobuf.AbstractC0268g, p204p.AbstractC2081l8
            /* JADX INFO: renamed from: mergeFrom */
            public /* bridge */ /* synthetic */ AbstractC2081l8 mo98330mergeFrom(byte[] bArr, int i, int i2, aux auxVar) {
                return super.mo98330mergeFrom(bArr, i, i2, auxVar);
            }

            @Override // p204p.AbstractC2081l8
            /* JADX INFO: renamed from: mergeFrom */
            public /* bridge */ /* synthetic */ ore0 mo98371mergeFrom(InputStream inputStream) {
                return super.mo98371mergeFrom(inputStream);
            }

            @Override // p204p.AbstractC2081l8
            /* JADX INFO: renamed from: mergeFrom */
            public /* bridge */ /* synthetic */ ore0 mo98372mergeFrom(InputStream inputStream, aux auxVar) {
                return super.mo98372mergeFrom(inputStream, auxVar);
            }

            @Override // p204p.AbstractC2081l8
            /* JADX INFO: renamed from: mergeFrom */
            public /* bridge */ /* synthetic */ ore0 mo98373mergeFrom(gva gvaVar) {
                return super.mo98373mergeFrom(gvaVar);
            }

            @Override // p204p.AbstractC2081l8
            /* JADX INFO: renamed from: mergeFrom */
            public /* bridge */ /* synthetic */ ore0 mo98374mergeFrom(gva gvaVar, aux auxVar) {
                return super.mo98374mergeFrom(gvaVar, auxVar);
            }

            @Override // p204p.AbstractC2081l8
            /* JADX INFO: renamed from: mergeFrom */
            public /* bridge */ /* synthetic */ ore0 mo98375mergeFrom(owe oweVar) {
                return super.mo98375mergeFrom(oweVar);
            }

            @Override // com.google.protobuf.AbstractC0268g, p204p.ore0
            public /* bridge */ /* synthetic */ ore0 mergeFrom(owe oweVar, aux auxVar) {
                return super.mergeFrom(oweVar, auxVar);
            }

            @Override // p204p.AbstractC2081l8, p204p.ore0
            public /* bridge */ /* synthetic */ ore0 mergeFrom(pre0 pre0Var) {
                return super.mergeFrom(pre0Var);
            }

            @Override // p204p.AbstractC2081l8
            /* JADX INFO: renamed from: mergeFrom */
            public /* bridge */ /* synthetic */ ore0 mo98376mergeFrom(byte[] bArr) {
                return super.mo98376mergeFrom(bArr);
            }

            @Override // com.google.protobuf.AbstractC0268g
            /* JADX INFO: renamed from: mergeFrom */
            public /* bridge */ /* synthetic */ ore0 mo98329mergeFrom(byte[] bArr, int i, int i2) {
                return super.mo98329mergeFrom(bArr, i, i2);
            }

            @Override // com.google.protobuf.AbstractC0268g
            /* JADX INFO: renamed from: mergeFrom */
            public /* bridge */ /* synthetic */ ore0 mo98330mergeFrom(byte[] bArr, int i, int i2, aux auxVar) {
                return super.mo98330mergeFrom(bArr, i, i2, auxVar);
            }

            @Override // p204p.AbstractC2081l8
            /* JADX INFO: renamed from: mergeFrom */
            public /* bridge */ /* synthetic */ ore0 mo98377mergeFrom(byte[] bArr, aux auxVar) {
                return super.mo98377mergeFrom(bArr, auxVar);
            }
        }

        static {
            MemberLimitExceeded memberLimitExceeded = new MemberLimitExceeded();
            DEFAULT_INSTANCE = memberLimitExceeded;
            AbstractC0269h.registerDefaultInstance(MemberLimitExceeded.class, memberLimitExceeded);
        }

        private MemberLimitExceeded() {
        }

        public static MemberLimitExceeded getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static MemberLimitExceeded parseDelimitedFrom(InputStream inputStream) {
            return (MemberLimitExceeded) AbstractC0269h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static MemberLimitExceeded parseFrom(ByteBuffer byteBuffer) {
            return (MemberLimitExceeded) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, byteBuffer);
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
                return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0000", null);
            }
            if (iOrdinal == 3) {
                return new MemberLimitExceeded();
            }
            if (iOrdinal == 4) {
                return new Builder(0);
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
            synchronized (MemberLimitExceeded.class) {
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
        public /* bridge */ /* synthetic */ pre0 getDefaultInstanceForType() {
            return getDefaultInstanceForType();
        }

        @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
        public /* bridge */ /* synthetic */ ore0 newBuilderForType() {
            return newBuilderForType();
        }

        @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
        public /* bridge */ /* synthetic */ ore0 toBuilder() {
            return toBuilder();
        }

        public static Builder newBuilder(MemberLimitExceeded memberLimitExceeded) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(memberLimitExceeded);
        }

        public static MemberLimitExceeded parseDelimitedFrom(InputStream inputStream, aux auxVar) {
            return (MemberLimitExceeded) AbstractC0269h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, auxVar);
        }

        public static MemberLimitExceeded parseFrom(ByteBuffer byteBuffer, aux auxVar) {
            return (MemberLimitExceeded) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, byteBuffer, auxVar);
        }

        public static MemberLimitExceeded parseFrom(gva gvaVar) {
            return (MemberLimitExceeded) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, gvaVar);
        }

        public static MemberLimitExceeded parseFrom(gva gvaVar, aux auxVar) {
            return (MemberLimitExceeded) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, gvaVar, auxVar);
        }

        public static MemberLimitExceeded parseFrom(byte[] bArr) {
            return (MemberLimitExceeded) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static MemberLimitExceeded parseFrom(byte[] bArr, aux auxVar) {
            return (MemberLimitExceeded) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr, auxVar);
        }

        public static MemberLimitExceeded parseFrom(InputStream inputStream) {
            return (MemberLimitExceeded) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static MemberLimitExceeded parseFrom(InputStream inputStream, aux auxVar) {
            return (MemberLimitExceeded) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, inputStream, auxVar);
        }

        public static MemberLimitExceeded parseFrom(owe oweVar) {
            return (MemberLimitExceeded) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, oweVar);
        }

        public static MemberLimitExceeded parseFrom(owe oweVar, aux auxVar) {
            return (MemberLimitExceeded) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, oweVar, auxVar);
        }
    }

    public interface MemberLimitExceededOrBuilder extends sre0 {
        @Override // p204p.sre0
        /* synthetic */ pre0 getDefaultInstanceForType();

        @Override // p204p.sre0
        /* synthetic */ boolean isInitialized();
    }

    public static final class NotAnAdmin extends AbstractC0269h implements NotAnAdminOrBuilder {
        private static final NotAnAdmin DEFAULT_INSTANCE;
        private static volatile r2n0 PARSER;

        public static final class Builder extends AbstractC0268g implements NotAnAdminOrBuilder {
            public /* synthetic */ Builder(int i) {
                this();
            }

            @Override // com.google.protobuf.AbstractC0268g, p204p.ore0
            public /* bridge */ /* synthetic */ pre0 build() {
                return build();
            }

            @Override // com.google.protobuf.AbstractC0268g, p204p.ore0
            public /* bridge */ /* synthetic */ pre0 buildPartial() {
                return super.buildPartial();
            }

            @Override // com.google.protobuf.AbstractC0268g
            /* JADX INFO: renamed from: clear */
            public /* bridge */ /* synthetic */ ore0 mo98325clear() {
                return mo98325clear();
            }

            @Override // com.google.protobuf.AbstractC0268g
            /* JADX INFO: renamed from: clone */
            public /* bridge */ /* synthetic */ Object mo98327clone() {
                return super.mo98326clone();
            }

            @Override // com.google.protobuf.AbstractC0268g, p204p.sre0
            public /* bridge */ /* synthetic */ pre0 getDefaultInstanceForType() {
                return super.getDefaultInstanceForType();
            }

            @Override // com.google.protobuf.AbstractC0268g, p204p.AbstractC2081l8
            public /* bridge */ /* synthetic */ AbstractC2081l8 internalMergeFrom(AbstractC2118m8 abstractC2118m8) {
                return super.internalMergeFrom((AbstractC0269h) abstractC2118m8);
            }

            @Override // com.google.protobuf.AbstractC0268g, p204p.AbstractC2081l8, p204p.ore0
            public /* bridge */ /* synthetic */ AbstractC2081l8 mergeFrom(owe oweVar, aux auxVar) {
                return super.mergeFrom(oweVar, auxVar);
            }

            private Builder() {
                super(NotAnAdmin.DEFAULT_INSTANCE);
            }

            @Override // com.google.protobuf.AbstractC0268g
            /* JADX INFO: renamed from: clone */
            public /* bridge */ /* synthetic */ AbstractC2081l8 mo98328clone() {
                return super.mo98326clone();
            }

            @Override // com.google.protobuf.AbstractC0268g, p204p.AbstractC2081l8
            /* JADX INFO: renamed from: mergeFrom */
            public /* bridge */ /* synthetic */ AbstractC2081l8 mo98329mergeFrom(byte[] bArr, int i, int i2) {
                return super.mo98329mergeFrom(bArr, i, i2);
            }

            @Override // com.google.protobuf.AbstractC0268g
            /* JADX INFO: renamed from: clone */
            public /* bridge */ /* synthetic */ ore0 mo98328clone() {
                return super.mo98326clone();
            }

            @Override // com.google.protobuf.AbstractC0268g, p204p.AbstractC2081l8
            /* JADX INFO: renamed from: mergeFrom */
            public /* bridge */ /* synthetic */ AbstractC2081l8 mo98330mergeFrom(byte[] bArr, int i, int i2, aux auxVar) {
                return super.mo98330mergeFrom(bArr, i, i2, auxVar);
            }

            @Override // p204p.AbstractC2081l8
            /* JADX INFO: renamed from: mergeFrom */
            public /* bridge */ /* synthetic */ ore0 mo98371mergeFrom(InputStream inputStream) {
                return super.mo98371mergeFrom(inputStream);
            }

            @Override // p204p.AbstractC2081l8
            /* JADX INFO: renamed from: mergeFrom */
            public /* bridge */ /* synthetic */ ore0 mo98372mergeFrom(InputStream inputStream, aux auxVar) {
                return super.mo98372mergeFrom(inputStream, auxVar);
            }

            @Override // p204p.AbstractC2081l8
            /* JADX INFO: renamed from: mergeFrom */
            public /* bridge */ /* synthetic */ ore0 mo98373mergeFrom(gva gvaVar) {
                return super.mo98373mergeFrom(gvaVar);
            }

            @Override // p204p.AbstractC2081l8
            /* JADX INFO: renamed from: mergeFrom */
            public /* bridge */ /* synthetic */ ore0 mo98374mergeFrom(gva gvaVar, aux auxVar) {
                return super.mo98374mergeFrom(gvaVar, auxVar);
            }

            @Override // p204p.AbstractC2081l8
            /* JADX INFO: renamed from: mergeFrom */
            public /* bridge */ /* synthetic */ ore0 mo98375mergeFrom(owe oweVar) {
                return super.mo98375mergeFrom(oweVar);
            }

            @Override // com.google.protobuf.AbstractC0268g, p204p.ore0
            public /* bridge */ /* synthetic */ ore0 mergeFrom(owe oweVar, aux auxVar) {
                return super.mergeFrom(oweVar, auxVar);
            }

            @Override // p204p.AbstractC2081l8, p204p.ore0
            public /* bridge */ /* synthetic */ ore0 mergeFrom(pre0 pre0Var) {
                return super.mergeFrom(pre0Var);
            }

            @Override // p204p.AbstractC2081l8
            /* JADX INFO: renamed from: mergeFrom */
            public /* bridge */ /* synthetic */ ore0 mo98376mergeFrom(byte[] bArr) {
                return super.mo98376mergeFrom(bArr);
            }

            @Override // com.google.protobuf.AbstractC0268g
            /* JADX INFO: renamed from: mergeFrom */
            public /* bridge */ /* synthetic */ ore0 mo98329mergeFrom(byte[] bArr, int i, int i2) {
                return super.mo98329mergeFrom(bArr, i, i2);
            }

            @Override // com.google.protobuf.AbstractC0268g
            /* JADX INFO: renamed from: mergeFrom */
            public /* bridge */ /* synthetic */ ore0 mo98330mergeFrom(byte[] bArr, int i, int i2, aux auxVar) {
                return super.mo98330mergeFrom(bArr, i, i2, auxVar);
            }

            @Override // p204p.AbstractC2081l8
            /* JADX INFO: renamed from: mergeFrom */
            public /* bridge */ /* synthetic */ ore0 mo98377mergeFrom(byte[] bArr, aux auxVar) {
                return super.mo98377mergeFrom(bArr, auxVar);
            }
        }

        static {
            NotAnAdmin notAnAdmin = new NotAnAdmin();
            DEFAULT_INSTANCE = notAnAdmin;
            AbstractC0269h.registerDefaultInstance(NotAnAdmin.class, notAnAdmin);
        }

        private NotAnAdmin() {
        }

        public static NotAnAdmin getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static NotAnAdmin parseDelimitedFrom(InputStream inputStream) {
            return (NotAnAdmin) AbstractC0269h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static NotAnAdmin parseFrom(ByteBuffer byteBuffer) {
            return (NotAnAdmin) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, byteBuffer);
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
                return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0000", null);
            }
            if (iOrdinal == 3) {
                return new NotAnAdmin();
            }
            if (iOrdinal == 4) {
                return new Builder(0);
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
            synchronized (NotAnAdmin.class) {
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
        public /* bridge */ /* synthetic */ pre0 getDefaultInstanceForType() {
            return getDefaultInstanceForType();
        }

        @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
        public /* bridge */ /* synthetic */ ore0 newBuilderForType() {
            return newBuilderForType();
        }

        @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
        public /* bridge */ /* synthetic */ ore0 toBuilder() {
            return toBuilder();
        }

        public static Builder newBuilder(NotAnAdmin notAnAdmin) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(notAnAdmin);
        }

        public static NotAnAdmin parseDelimitedFrom(InputStream inputStream, aux auxVar) {
            return (NotAnAdmin) AbstractC0269h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, auxVar);
        }

        public static NotAnAdmin parseFrom(ByteBuffer byteBuffer, aux auxVar) {
            return (NotAnAdmin) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, byteBuffer, auxVar);
        }

        public static NotAnAdmin parseFrom(gva gvaVar) {
            return (NotAnAdmin) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, gvaVar);
        }

        public static NotAnAdmin parseFrom(gva gvaVar, aux auxVar) {
            return (NotAnAdmin) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, gvaVar, auxVar);
        }

        public static NotAnAdmin parseFrom(byte[] bArr) {
            return (NotAnAdmin) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static NotAnAdmin parseFrom(byte[] bArr, aux auxVar) {
            return (NotAnAdmin) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr, auxVar);
        }

        public static NotAnAdmin parseFrom(InputStream inputStream) {
            return (NotAnAdmin) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static NotAnAdmin parseFrom(InputStream inputStream, aux auxVar) {
            return (NotAnAdmin) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, inputStream, auxVar);
        }

        public static NotAnAdmin parseFrom(owe oweVar) {
            return (NotAnAdmin) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, oweVar);
        }

        public static NotAnAdmin parseFrom(owe oweVar, aux auxVar) {
            return (NotAnAdmin) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, oweVar, auxVar);
        }
    }

    public interface NotAnAdminOrBuilder extends sre0 {
        @Override // p204p.sre0
        /* synthetic */ pre0 getDefaultInstanceForType();

        @Override // p204p.sre0
        /* synthetic */ boolean isInitialized();
    }

    public static final class NotTrusted extends AbstractC0269h implements NotTrustedOrBuilder {
        private static final NotTrusted DEFAULT_INSTANCE;
        private static volatile r2n0 PARSER;

        public static final class Builder extends AbstractC0268g implements NotTrustedOrBuilder {
            public /* synthetic */ Builder(int i) {
                this();
            }

            @Override // com.google.protobuf.AbstractC0268g, p204p.ore0
            public /* bridge */ /* synthetic */ pre0 build() {
                return build();
            }

            @Override // com.google.protobuf.AbstractC0268g, p204p.ore0
            public /* bridge */ /* synthetic */ pre0 buildPartial() {
                return super.buildPartial();
            }

            @Override // com.google.protobuf.AbstractC0268g
            /* JADX INFO: renamed from: clear */
            public /* bridge */ /* synthetic */ ore0 mo98325clear() {
                return mo98325clear();
            }

            @Override // com.google.protobuf.AbstractC0268g
            /* JADX INFO: renamed from: clone */
            public /* bridge */ /* synthetic */ Object mo98327clone() {
                return super.mo98326clone();
            }

            @Override // com.google.protobuf.AbstractC0268g, p204p.sre0
            public /* bridge */ /* synthetic */ pre0 getDefaultInstanceForType() {
                return super.getDefaultInstanceForType();
            }

            @Override // com.google.protobuf.AbstractC0268g, p204p.AbstractC2081l8
            public /* bridge */ /* synthetic */ AbstractC2081l8 internalMergeFrom(AbstractC2118m8 abstractC2118m8) {
                return super.internalMergeFrom((AbstractC0269h) abstractC2118m8);
            }

            @Override // com.google.protobuf.AbstractC0268g, p204p.AbstractC2081l8, p204p.ore0
            public /* bridge */ /* synthetic */ AbstractC2081l8 mergeFrom(owe oweVar, aux auxVar) {
                return super.mergeFrom(oweVar, auxVar);
            }

            private Builder() {
                super(NotTrusted.DEFAULT_INSTANCE);
            }

            @Override // com.google.protobuf.AbstractC0268g
            /* JADX INFO: renamed from: clone */
            public /* bridge */ /* synthetic */ AbstractC2081l8 mo98328clone() {
                return super.mo98326clone();
            }

            @Override // com.google.protobuf.AbstractC0268g, p204p.AbstractC2081l8
            /* JADX INFO: renamed from: mergeFrom */
            public /* bridge */ /* synthetic */ AbstractC2081l8 mo98329mergeFrom(byte[] bArr, int i, int i2) {
                return super.mo98329mergeFrom(bArr, i, i2);
            }

            @Override // com.google.protobuf.AbstractC0268g
            /* JADX INFO: renamed from: clone */
            public /* bridge */ /* synthetic */ ore0 mo98328clone() {
                return super.mo98326clone();
            }

            @Override // com.google.protobuf.AbstractC0268g, p204p.AbstractC2081l8
            /* JADX INFO: renamed from: mergeFrom */
            public /* bridge */ /* synthetic */ AbstractC2081l8 mo98330mergeFrom(byte[] bArr, int i, int i2, aux auxVar) {
                return super.mo98330mergeFrom(bArr, i, i2, auxVar);
            }

            @Override // p204p.AbstractC2081l8
            /* JADX INFO: renamed from: mergeFrom */
            public /* bridge */ /* synthetic */ ore0 mo98371mergeFrom(InputStream inputStream) {
                return super.mo98371mergeFrom(inputStream);
            }

            @Override // p204p.AbstractC2081l8
            /* JADX INFO: renamed from: mergeFrom */
            public /* bridge */ /* synthetic */ ore0 mo98372mergeFrom(InputStream inputStream, aux auxVar) {
                return super.mo98372mergeFrom(inputStream, auxVar);
            }

            @Override // p204p.AbstractC2081l8
            /* JADX INFO: renamed from: mergeFrom */
            public /* bridge */ /* synthetic */ ore0 mo98373mergeFrom(gva gvaVar) {
                return super.mo98373mergeFrom(gvaVar);
            }

            @Override // p204p.AbstractC2081l8
            /* JADX INFO: renamed from: mergeFrom */
            public /* bridge */ /* synthetic */ ore0 mo98374mergeFrom(gva gvaVar, aux auxVar) {
                return super.mo98374mergeFrom(gvaVar, auxVar);
            }

            @Override // p204p.AbstractC2081l8
            /* JADX INFO: renamed from: mergeFrom */
            public /* bridge */ /* synthetic */ ore0 mo98375mergeFrom(owe oweVar) {
                return super.mo98375mergeFrom(oweVar);
            }

            @Override // com.google.protobuf.AbstractC0268g, p204p.ore0
            public /* bridge */ /* synthetic */ ore0 mergeFrom(owe oweVar, aux auxVar) {
                return super.mergeFrom(oweVar, auxVar);
            }

            @Override // p204p.AbstractC2081l8, p204p.ore0
            public /* bridge */ /* synthetic */ ore0 mergeFrom(pre0 pre0Var) {
                return super.mergeFrom(pre0Var);
            }

            @Override // p204p.AbstractC2081l8
            /* JADX INFO: renamed from: mergeFrom */
            public /* bridge */ /* synthetic */ ore0 mo98376mergeFrom(byte[] bArr) {
                return super.mo98376mergeFrom(bArr);
            }

            @Override // com.google.protobuf.AbstractC0268g
            /* JADX INFO: renamed from: mergeFrom */
            public /* bridge */ /* synthetic */ ore0 mo98329mergeFrom(byte[] bArr, int i, int i2) {
                return super.mo98329mergeFrom(bArr, i, i2);
            }

            @Override // com.google.protobuf.AbstractC0268g
            /* JADX INFO: renamed from: mergeFrom */
            public /* bridge */ /* synthetic */ ore0 mo98330mergeFrom(byte[] bArr, int i, int i2, aux auxVar) {
                return super.mo98330mergeFrom(bArr, i, i2, auxVar);
            }

            @Override // p204p.AbstractC2081l8
            /* JADX INFO: renamed from: mergeFrom */
            public /* bridge */ /* synthetic */ ore0 mo98377mergeFrom(byte[] bArr, aux auxVar) {
                return super.mo98377mergeFrom(bArr, auxVar);
            }
        }

        static {
            NotTrusted notTrusted = new NotTrusted();
            DEFAULT_INSTANCE = notTrusted;
            AbstractC0269h.registerDefaultInstance(NotTrusted.class, notTrusted);
        }

        private NotTrusted() {
        }

        public static NotTrusted getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static NotTrusted parseDelimitedFrom(InputStream inputStream) {
            return (NotTrusted) AbstractC0269h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static NotTrusted parseFrom(ByteBuffer byteBuffer) {
            return (NotTrusted) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, byteBuffer);
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
                return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0000", null);
            }
            if (iOrdinal == 3) {
                return new NotTrusted();
            }
            if (iOrdinal == 4) {
                return new Builder(0);
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
            synchronized (NotTrusted.class) {
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
        public /* bridge */ /* synthetic */ pre0 getDefaultInstanceForType() {
            return getDefaultInstanceForType();
        }

        @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
        public /* bridge */ /* synthetic */ ore0 newBuilderForType() {
            return newBuilderForType();
        }

        @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
        public /* bridge */ /* synthetic */ ore0 toBuilder() {
            return toBuilder();
        }

        public static Builder newBuilder(NotTrusted notTrusted) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(notTrusted);
        }

        public static NotTrusted parseDelimitedFrom(InputStream inputStream, aux auxVar) {
            return (NotTrusted) AbstractC0269h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, auxVar);
        }

        public static NotTrusted parseFrom(ByteBuffer byteBuffer, aux auxVar) {
            return (NotTrusted) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, byteBuffer, auxVar);
        }

        public static NotTrusted parseFrom(gva gvaVar) {
            return (NotTrusted) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, gvaVar);
        }

        public static NotTrusted parseFrom(gva gvaVar, aux auxVar) {
            return (NotTrusted) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, gvaVar, auxVar);
        }

        public static NotTrusted parseFrom(byte[] bArr) {
            return (NotTrusted) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static NotTrusted parseFrom(byte[] bArr, aux auxVar) {
            return (NotTrusted) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr, auxVar);
        }

        public static NotTrusted parseFrom(InputStream inputStream) {
            return (NotTrusted) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static NotTrusted parseFrom(InputStream inputStream, aux auxVar) {
            return (NotTrusted) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, inputStream, auxVar);
        }

        public static NotTrusted parseFrom(owe oweVar) {
            return (NotTrusted) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, oweVar);
        }

        public static NotTrusted parseFrom(owe oweVar, aux auxVar) {
            return (NotTrusted) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, oweVar, auxVar);
        }
    }

    public interface NotTrustedOrBuilder extends sre0 {
        @Override // p204p.sre0
        /* synthetic */ pre0 getDefaultInstanceForType();

        @Override // p204p.sre0
        /* synthetic */ boolean isInitialized();
    }

    public static final class OptOut extends AbstractC0269h implements OptOutOrBuilder {
        private static final OptOut DEFAULT_INSTANCE;
        private static volatile r2n0 PARSER;

        public static final class Builder extends AbstractC0268g implements OptOutOrBuilder {
            public /* synthetic */ Builder(int i) {
                this();
            }

            @Override // com.google.protobuf.AbstractC0268g, p204p.ore0
            public /* bridge */ /* synthetic */ pre0 build() {
                return build();
            }

            @Override // com.google.protobuf.AbstractC0268g, p204p.ore0
            public /* bridge */ /* synthetic */ pre0 buildPartial() {
                return super.buildPartial();
            }

            @Override // com.google.protobuf.AbstractC0268g
            /* JADX INFO: renamed from: clear */
            public /* bridge */ /* synthetic */ ore0 mo98325clear() {
                return mo98325clear();
            }

            @Override // com.google.protobuf.AbstractC0268g
            /* JADX INFO: renamed from: clone */
            public /* bridge */ /* synthetic */ Object mo98327clone() {
                return super.mo98326clone();
            }

            @Override // com.google.protobuf.AbstractC0268g, p204p.sre0
            public /* bridge */ /* synthetic */ pre0 getDefaultInstanceForType() {
                return super.getDefaultInstanceForType();
            }

            @Override // com.google.protobuf.AbstractC0268g, p204p.AbstractC2081l8
            public /* bridge */ /* synthetic */ AbstractC2081l8 internalMergeFrom(AbstractC2118m8 abstractC2118m8) {
                return super.internalMergeFrom((AbstractC0269h) abstractC2118m8);
            }

            @Override // com.google.protobuf.AbstractC0268g, p204p.AbstractC2081l8, p204p.ore0
            public /* bridge */ /* synthetic */ AbstractC2081l8 mergeFrom(owe oweVar, aux auxVar) {
                return super.mergeFrom(oweVar, auxVar);
            }

            private Builder() {
                super(OptOut.DEFAULT_INSTANCE);
            }

            @Override // com.google.protobuf.AbstractC0268g
            /* JADX INFO: renamed from: clone */
            public /* bridge */ /* synthetic */ AbstractC2081l8 mo98328clone() {
                return super.mo98326clone();
            }

            @Override // com.google.protobuf.AbstractC0268g, p204p.AbstractC2081l8
            /* JADX INFO: renamed from: mergeFrom */
            public /* bridge */ /* synthetic */ AbstractC2081l8 mo98329mergeFrom(byte[] bArr, int i, int i2) {
                return super.mo98329mergeFrom(bArr, i, i2);
            }

            @Override // com.google.protobuf.AbstractC0268g
            /* JADX INFO: renamed from: clone */
            public /* bridge */ /* synthetic */ ore0 mo98328clone() {
                return super.mo98326clone();
            }

            @Override // com.google.protobuf.AbstractC0268g, p204p.AbstractC2081l8
            /* JADX INFO: renamed from: mergeFrom */
            public /* bridge */ /* synthetic */ AbstractC2081l8 mo98330mergeFrom(byte[] bArr, int i, int i2, aux auxVar) {
                return super.mo98330mergeFrom(bArr, i, i2, auxVar);
            }

            @Override // p204p.AbstractC2081l8
            /* JADX INFO: renamed from: mergeFrom */
            public /* bridge */ /* synthetic */ ore0 mo98371mergeFrom(InputStream inputStream) {
                return super.mo98371mergeFrom(inputStream);
            }

            @Override // p204p.AbstractC2081l8
            /* JADX INFO: renamed from: mergeFrom */
            public /* bridge */ /* synthetic */ ore0 mo98372mergeFrom(InputStream inputStream, aux auxVar) {
                return super.mo98372mergeFrom(inputStream, auxVar);
            }

            @Override // p204p.AbstractC2081l8
            /* JADX INFO: renamed from: mergeFrom */
            public /* bridge */ /* synthetic */ ore0 mo98373mergeFrom(gva gvaVar) {
                return super.mo98373mergeFrom(gvaVar);
            }

            @Override // p204p.AbstractC2081l8
            /* JADX INFO: renamed from: mergeFrom */
            public /* bridge */ /* synthetic */ ore0 mo98374mergeFrom(gva gvaVar, aux auxVar) {
                return super.mo98374mergeFrom(gvaVar, auxVar);
            }

            @Override // p204p.AbstractC2081l8
            /* JADX INFO: renamed from: mergeFrom */
            public /* bridge */ /* synthetic */ ore0 mo98375mergeFrom(owe oweVar) {
                return super.mo98375mergeFrom(oweVar);
            }

            @Override // com.google.protobuf.AbstractC0268g, p204p.ore0
            public /* bridge */ /* synthetic */ ore0 mergeFrom(owe oweVar, aux auxVar) {
                return super.mergeFrom(oweVar, auxVar);
            }

            @Override // p204p.AbstractC2081l8, p204p.ore0
            public /* bridge */ /* synthetic */ ore0 mergeFrom(pre0 pre0Var) {
                return super.mergeFrom(pre0Var);
            }

            @Override // p204p.AbstractC2081l8
            /* JADX INFO: renamed from: mergeFrom */
            public /* bridge */ /* synthetic */ ore0 mo98376mergeFrom(byte[] bArr) {
                return super.mo98376mergeFrom(bArr);
            }

            @Override // com.google.protobuf.AbstractC0268g
            /* JADX INFO: renamed from: mergeFrom */
            public /* bridge */ /* synthetic */ ore0 mo98329mergeFrom(byte[] bArr, int i, int i2) {
                return super.mo98329mergeFrom(bArr, i, i2);
            }

            @Override // com.google.protobuf.AbstractC0268g
            /* JADX INFO: renamed from: mergeFrom */
            public /* bridge */ /* synthetic */ ore0 mo98330mergeFrom(byte[] bArr, int i, int i2, aux auxVar) {
                return super.mo98330mergeFrom(bArr, i, i2, auxVar);
            }

            @Override // p204p.AbstractC2081l8
            /* JADX INFO: renamed from: mergeFrom */
            public /* bridge */ /* synthetic */ ore0 mo98377mergeFrom(byte[] bArr, aux auxVar) {
                return super.mo98377mergeFrom(bArr, auxVar);
            }
        }

        static {
            OptOut optOut = new OptOut();
            DEFAULT_INSTANCE = optOut;
            AbstractC0269h.registerDefaultInstance(OptOut.class, optOut);
        }

        private OptOut() {
        }

        public static OptOut getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static OptOut parseDelimitedFrom(InputStream inputStream) {
            return (OptOut) AbstractC0269h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static OptOut parseFrom(ByteBuffer byteBuffer) {
            return (OptOut) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, byteBuffer);
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
                return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0000", null);
            }
            if (iOrdinal == 3) {
                return new OptOut();
            }
            if (iOrdinal == 4) {
                return new Builder(0);
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
            synchronized (OptOut.class) {
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
        public /* bridge */ /* synthetic */ pre0 getDefaultInstanceForType() {
            return getDefaultInstanceForType();
        }

        @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
        public /* bridge */ /* synthetic */ ore0 newBuilderForType() {
            return newBuilderForType();
        }

        @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
        public /* bridge */ /* synthetic */ ore0 toBuilder() {
            return toBuilder();
        }

        public static Builder newBuilder(OptOut optOut) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(optOut);
        }

        public static OptOut parseDelimitedFrom(InputStream inputStream, aux auxVar) {
            return (OptOut) AbstractC0269h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, auxVar);
        }

        public static OptOut parseFrom(ByteBuffer byteBuffer, aux auxVar) {
            return (OptOut) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, byteBuffer, auxVar);
        }

        public static OptOut parseFrom(gva gvaVar) {
            return (OptOut) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, gvaVar);
        }

        public static OptOut parseFrom(gva gvaVar, aux auxVar) {
            return (OptOut) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, gvaVar, auxVar);
        }

        public static OptOut parseFrom(byte[] bArr) {
            return (OptOut) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static OptOut parseFrom(byte[] bArr, aux auxVar) {
            return (OptOut) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr, auxVar);
        }

        public static OptOut parseFrom(InputStream inputStream) {
            return (OptOut) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static OptOut parseFrom(InputStream inputStream, aux auxVar) {
            return (OptOut) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, inputStream, auxVar);
        }

        public static OptOut parseFrom(owe oweVar) {
            return (OptOut) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, oweVar);
        }

        public static OptOut parseFrom(owe oweVar, aux auxVar) {
            return (OptOut) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, oweVar, auxVar);
        }
    }

    public interface OptOutOrBuilder extends sre0 {
        @Override // p204p.sre0
        /* synthetic */ pre0 getDefaultInstanceForType();

        @Override // p204p.sre0
        /* synthetic */ boolean isInitialized();
    }

    public static final class RestrictedFromMessaging extends AbstractC0269h implements RestrictedFromMessagingOrBuilder {
        private static final RestrictedFromMessaging DEFAULT_INSTANCE;
        private static volatile r2n0 PARSER;

        public static final class Builder extends AbstractC0268g implements RestrictedFromMessagingOrBuilder {
            public /* synthetic */ Builder(int i) {
                this();
            }

            @Override // com.google.protobuf.AbstractC0268g, p204p.ore0
            public /* bridge */ /* synthetic */ pre0 build() {
                return build();
            }

            @Override // com.google.protobuf.AbstractC0268g, p204p.ore0
            public /* bridge */ /* synthetic */ pre0 buildPartial() {
                return super.buildPartial();
            }

            @Override // com.google.protobuf.AbstractC0268g
            /* JADX INFO: renamed from: clear */
            public /* bridge */ /* synthetic */ ore0 mo98325clear() {
                return mo98325clear();
            }

            @Override // com.google.protobuf.AbstractC0268g
            /* JADX INFO: renamed from: clone */
            public /* bridge */ /* synthetic */ Object mo98327clone() {
                return super.mo98326clone();
            }

            @Override // com.google.protobuf.AbstractC0268g, p204p.sre0
            public /* bridge */ /* synthetic */ pre0 getDefaultInstanceForType() {
                return super.getDefaultInstanceForType();
            }

            @Override // com.google.protobuf.AbstractC0268g, p204p.AbstractC2081l8
            public /* bridge */ /* synthetic */ AbstractC2081l8 internalMergeFrom(AbstractC2118m8 abstractC2118m8) {
                return super.internalMergeFrom((AbstractC0269h) abstractC2118m8);
            }

            @Override // com.google.protobuf.AbstractC0268g, p204p.AbstractC2081l8, p204p.ore0
            public /* bridge */ /* synthetic */ AbstractC2081l8 mergeFrom(owe oweVar, aux auxVar) {
                return super.mergeFrom(oweVar, auxVar);
            }

            private Builder() {
                super(RestrictedFromMessaging.DEFAULT_INSTANCE);
            }

            @Override // com.google.protobuf.AbstractC0268g
            /* JADX INFO: renamed from: clone */
            public /* bridge */ /* synthetic */ AbstractC2081l8 mo98328clone() {
                return super.mo98326clone();
            }

            @Override // com.google.protobuf.AbstractC0268g, p204p.AbstractC2081l8
            /* JADX INFO: renamed from: mergeFrom */
            public /* bridge */ /* synthetic */ AbstractC2081l8 mo98329mergeFrom(byte[] bArr, int i, int i2) {
                return super.mo98329mergeFrom(bArr, i, i2);
            }

            @Override // com.google.protobuf.AbstractC0268g
            /* JADX INFO: renamed from: clone */
            public /* bridge */ /* synthetic */ ore0 mo98328clone() {
                return super.mo98326clone();
            }

            @Override // com.google.protobuf.AbstractC0268g, p204p.AbstractC2081l8
            /* JADX INFO: renamed from: mergeFrom */
            public /* bridge */ /* synthetic */ AbstractC2081l8 mo98330mergeFrom(byte[] bArr, int i, int i2, aux auxVar) {
                return super.mo98330mergeFrom(bArr, i, i2, auxVar);
            }

            @Override // p204p.AbstractC2081l8
            /* JADX INFO: renamed from: mergeFrom */
            public /* bridge */ /* synthetic */ ore0 mo98371mergeFrom(InputStream inputStream) {
                return super.mo98371mergeFrom(inputStream);
            }

            @Override // p204p.AbstractC2081l8
            /* JADX INFO: renamed from: mergeFrom */
            public /* bridge */ /* synthetic */ ore0 mo98372mergeFrom(InputStream inputStream, aux auxVar) {
                return super.mo98372mergeFrom(inputStream, auxVar);
            }

            @Override // p204p.AbstractC2081l8
            /* JADX INFO: renamed from: mergeFrom */
            public /* bridge */ /* synthetic */ ore0 mo98373mergeFrom(gva gvaVar) {
                return super.mo98373mergeFrom(gvaVar);
            }

            @Override // p204p.AbstractC2081l8
            /* JADX INFO: renamed from: mergeFrom */
            public /* bridge */ /* synthetic */ ore0 mo98374mergeFrom(gva gvaVar, aux auxVar) {
                return super.mo98374mergeFrom(gvaVar, auxVar);
            }

            @Override // p204p.AbstractC2081l8
            /* JADX INFO: renamed from: mergeFrom */
            public /* bridge */ /* synthetic */ ore0 mo98375mergeFrom(owe oweVar) {
                return super.mo98375mergeFrom(oweVar);
            }

            @Override // com.google.protobuf.AbstractC0268g, p204p.ore0
            public /* bridge */ /* synthetic */ ore0 mergeFrom(owe oweVar, aux auxVar) {
                return super.mergeFrom(oweVar, auxVar);
            }

            @Override // p204p.AbstractC2081l8, p204p.ore0
            public /* bridge */ /* synthetic */ ore0 mergeFrom(pre0 pre0Var) {
                return super.mergeFrom(pre0Var);
            }

            @Override // p204p.AbstractC2081l8
            /* JADX INFO: renamed from: mergeFrom */
            public /* bridge */ /* synthetic */ ore0 mo98376mergeFrom(byte[] bArr) {
                return super.mo98376mergeFrom(bArr);
            }

            @Override // com.google.protobuf.AbstractC0268g
            /* JADX INFO: renamed from: mergeFrom */
            public /* bridge */ /* synthetic */ ore0 mo98329mergeFrom(byte[] bArr, int i, int i2) {
                return super.mo98329mergeFrom(bArr, i, i2);
            }

            @Override // com.google.protobuf.AbstractC0268g
            /* JADX INFO: renamed from: mergeFrom */
            public /* bridge */ /* synthetic */ ore0 mo98330mergeFrom(byte[] bArr, int i, int i2, aux auxVar) {
                return super.mo98330mergeFrom(bArr, i, i2, auxVar);
            }

            @Override // p204p.AbstractC2081l8
            /* JADX INFO: renamed from: mergeFrom */
            public /* bridge */ /* synthetic */ ore0 mo98377mergeFrom(byte[] bArr, aux auxVar) {
                return super.mo98377mergeFrom(bArr, auxVar);
            }
        }

        static {
            RestrictedFromMessaging restrictedFromMessaging = new RestrictedFromMessaging();
            DEFAULT_INSTANCE = restrictedFromMessaging;
            AbstractC0269h.registerDefaultInstance(RestrictedFromMessaging.class, restrictedFromMessaging);
        }

        private RestrictedFromMessaging() {
        }

        public static RestrictedFromMessaging getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static RestrictedFromMessaging parseDelimitedFrom(InputStream inputStream) {
            return (RestrictedFromMessaging) AbstractC0269h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static RestrictedFromMessaging parseFrom(ByteBuffer byteBuffer) {
            return (RestrictedFromMessaging) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, byteBuffer);
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
                return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0000", null);
            }
            if (iOrdinal == 3) {
                return new RestrictedFromMessaging();
            }
            if (iOrdinal == 4) {
                return new Builder(0);
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
            synchronized (RestrictedFromMessaging.class) {
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
        public /* bridge */ /* synthetic */ pre0 getDefaultInstanceForType() {
            return getDefaultInstanceForType();
        }

        @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
        public /* bridge */ /* synthetic */ ore0 newBuilderForType() {
            return newBuilderForType();
        }

        @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
        public /* bridge */ /* synthetic */ ore0 toBuilder() {
            return toBuilder();
        }

        public static Builder newBuilder(RestrictedFromMessaging restrictedFromMessaging) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(restrictedFromMessaging);
        }

        public static RestrictedFromMessaging parseDelimitedFrom(InputStream inputStream, aux auxVar) {
            return (RestrictedFromMessaging) AbstractC0269h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, auxVar);
        }

        public static RestrictedFromMessaging parseFrom(ByteBuffer byteBuffer, aux auxVar) {
            return (RestrictedFromMessaging) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, byteBuffer, auxVar);
        }

        public static RestrictedFromMessaging parseFrom(gva gvaVar) {
            return (RestrictedFromMessaging) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, gvaVar);
        }

        public static RestrictedFromMessaging parseFrom(gva gvaVar, aux auxVar) {
            return (RestrictedFromMessaging) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, gvaVar, auxVar);
        }

        public static RestrictedFromMessaging parseFrom(byte[] bArr) {
            return (RestrictedFromMessaging) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static RestrictedFromMessaging parseFrom(byte[] bArr, aux auxVar) {
            return (RestrictedFromMessaging) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr, auxVar);
        }

        public static RestrictedFromMessaging parseFrom(InputStream inputStream) {
            return (RestrictedFromMessaging) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static RestrictedFromMessaging parseFrom(InputStream inputStream, aux auxVar) {
            return (RestrictedFromMessaging) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, inputStream, auxVar);
        }

        public static RestrictedFromMessaging parseFrom(owe oweVar) {
            return (RestrictedFromMessaging) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, oweVar);
        }

        public static RestrictedFromMessaging parseFrom(owe oweVar, aux auxVar) {
            return (RestrictedFromMessaging) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, oweVar, auxVar);
        }
    }

    public interface RestrictedFromMessagingOrBuilder extends sre0 {
        @Override // p204p.sre0
        /* synthetic */ pre0 getDefaultInstanceForType();

        @Override // p204p.sre0
        /* synthetic */ boolean isInitialized();
    }

    public static final class ShouldAssureAge extends AbstractC0269h implements ShouldAssureAgeOrBuilder {
        public static final int AGE_THRESHOLD_FIELD_NUMBER = 1;
        private static final ShouldAssureAge DEFAULT_INSTANCE;
        private static volatile r2n0 PARSER;
        private int ageThreshold_;

        public static final class Builder extends AbstractC0268g implements ShouldAssureAgeOrBuilder {
            public /* synthetic */ Builder(int i) {
                this();
            }

            @Override // com.google.protobuf.AbstractC0268g, p204p.ore0
            public /* bridge */ /* synthetic */ pre0 build() {
                return build();
            }

            @Override // com.google.protobuf.AbstractC0268g, p204p.ore0
            public /* bridge */ /* synthetic */ pre0 buildPartial() {
                return super.buildPartial();
            }

            @Override // com.google.protobuf.AbstractC0268g
            /* JADX INFO: renamed from: clear */
            public /* bridge */ /* synthetic */ ore0 mo98325clear() {
                return mo98325clear();
            }

            public Builder clearAgeThreshold() {
                copyOnWrite();
                ((ShouldAssureAge) this.instance).clearAgeThreshold();
                return this;
            }

            @Override // com.google.protobuf.AbstractC0268g
            /* JADX INFO: renamed from: clone */
            public /* bridge */ /* synthetic */ Object mo98327clone() {
                return super.mo98326clone();
            }

            @Override // com.spotify.campfire.datasource.impl.proto.ErrorReason.ShouldAssureAgeOrBuilder
            public int getAgeThreshold() {
                return ((ShouldAssureAge) this.instance).getAgeThreshold();
            }

            @Override // com.google.protobuf.AbstractC0268g, p204p.sre0
            public /* bridge */ /* synthetic */ pre0 getDefaultInstanceForType() {
                return super.getDefaultInstanceForType();
            }

            @Override // com.google.protobuf.AbstractC0268g, p204p.AbstractC2081l8
            public /* bridge */ /* synthetic */ AbstractC2081l8 internalMergeFrom(AbstractC2118m8 abstractC2118m8) {
                return super.internalMergeFrom((AbstractC0269h) abstractC2118m8);
            }

            @Override // com.google.protobuf.AbstractC0268g, p204p.AbstractC2081l8, p204p.ore0
            public /* bridge */ /* synthetic */ AbstractC2081l8 mergeFrom(owe oweVar, aux auxVar) {
                return super.mergeFrom(oweVar, auxVar);
            }

            public Builder setAgeThreshold(int i) {
                copyOnWrite();
                ((ShouldAssureAge) this.instance).setAgeThreshold(i);
                return this;
            }

            private Builder() {
                super(ShouldAssureAge.DEFAULT_INSTANCE);
            }

            @Override // com.google.protobuf.AbstractC0268g
            /* JADX INFO: renamed from: clone */
            public /* bridge */ /* synthetic */ AbstractC2081l8 mo98328clone() {
                return super.mo98326clone();
            }

            @Override // com.google.protobuf.AbstractC0268g, p204p.AbstractC2081l8
            /* JADX INFO: renamed from: mergeFrom */
            public /* bridge */ /* synthetic */ AbstractC2081l8 mo98329mergeFrom(byte[] bArr, int i, int i2) {
                return super.mo98329mergeFrom(bArr, i, i2);
            }

            @Override // com.google.protobuf.AbstractC0268g
            /* JADX INFO: renamed from: clone */
            public /* bridge */ /* synthetic */ ore0 mo98328clone() {
                return super.mo98326clone();
            }

            @Override // com.google.protobuf.AbstractC0268g, p204p.AbstractC2081l8
            /* JADX INFO: renamed from: mergeFrom */
            public /* bridge */ /* synthetic */ AbstractC2081l8 mo98330mergeFrom(byte[] bArr, int i, int i2, aux auxVar) {
                return super.mo98330mergeFrom(bArr, i, i2, auxVar);
            }

            @Override // p204p.AbstractC2081l8
            /* JADX INFO: renamed from: mergeFrom */
            public /* bridge */ /* synthetic */ ore0 mo98371mergeFrom(InputStream inputStream) {
                return super.mo98371mergeFrom(inputStream);
            }

            @Override // p204p.AbstractC2081l8
            /* JADX INFO: renamed from: mergeFrom */
            public /* bridge */ /* synthetic */ ore0 mo98372mergeFrom(InputStream inputStream, aux auxVar) {
                return super.mo98372mergeFrom(inputStream, auxVar);
            }

            @Override // p204p.AbstractC2081l8
            /* JADX INFO: renamed from: mergeFrom */
            public /* bridge */ /* synthetic */ ore0 mo98373mergeFrom(gva gvaVar) {
                return super.mo98373mergeFrom(gvaVar);
            }

            @Override // p204p.AbstractC2081l8
            /* JADX INFO: renamed from: mergeFrom */
            public /* bridge */ /* synthetic */ ore0 mo98374mergeFrom(gva gvaVar, aux auxVar) {
                return super.mo98374mergeFrom(gvaVar, auxVar);
            }

            @Override // p204p.AbstractC2081l8
            /* JADX INFO: renamed from: mergeFrom */
            public /* bridge */ /* synthetic */ ore0 mo98375mergeFrom(owe oweVar) {
                return super.mo98375mergeFrom(oweVar);
            }

            @Override // com.google.protobuf.AbstractC0268g, p204p.ore0
            public /* bridge */ /* synthetic */ ore0 mergeFrom(owe oweVar, aux auxVar) {
                return super.mergeFrom(oweVar, auxVar);
            }

            @Override // p204p.AbstractC2081l8, p204p.ore0
            public /* bridge */ /* synthetic */ ore0 mergeFrom(pre0 pre0Var) {
                return super.mergeFrom(pre0Var);
            }

            @Override // p204p.AbstractC2081l8
            /* JADX INFO: renamed from: mergeFrom */
            public /* bridge */ /* synthetic */ ore0 mo98376mergeFrom(byte[] bArr) {
                return super.mo98376mergeFrom(bArr);
            }

            @Override // com.google.protobuf.AbstractC0268g
            /* JADX INFO: renamed from: mergeFrom */
            public /* bridge */ /* synthetic */ ore0 mo98329mergeFrom(byte[] bArr, int i, int i2) {
                return super.mo98329mergeFrom(bArr, i, i2);
            }

            @Override // com.google.protobuf.AbstractC0268g
            /* JADX INFO: renamed from: mergeFrom */
            public /* bridge */ /* synthetic */ ore0 mo98330mergeFrom(byte[] bArr, int i, int i2, aux auxVar) {
                return super.mo98330mergeFrom(bArr, i, i2, auxVar);
            }

            @Override // p204p.AbstractC2081l8
            /* JADX INFO: renamed from: mergeFrom */
            public /* bridge */ /* synthetic */ ore0 mo98377mergeFrom(byte[] bArr, aux auxVar) {
                return super.mo98377mergeFrom(bArr, auxVar);
            }
        }

        static {
            ShouldAssureAge shouldAssureAge = new ShouldAssureAge();
            DEFAULT_INSTANCE = shouldAssureAge;
            AbstractC0269h.registerDefaultInstance(ShouldAssureAge.class, shouldAssureAge);
        }

        private ShouldAssureAge() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAgeThreshold() {
            this.ageThreshold_ = 0;
        }

        public static ShouldAssureAge getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static ShouldAssureAge parseDelimitedFrom(InputStream inputStream) {
            return (ShouldAssureAge) AbstractC0269h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static ShouldAssureAge parseFrom(ByteBuffer byteBuffer) {
            return (ShouldAssureAge) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static r2n0 parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAgeThreshold(int i) {
            this.ageThreshold_ = i;
        }

        @Override // com.google.protobuf.AbstractC0269h
        public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
            r2n0 r110Var;
            int iOrdinal = z110Var.ordinal();
            if (iOrdinal == 0) {
                return (byte) 1;
            }
            if (iOrdinal == 2) {
                return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0004", new Object[]{"ageThreshold_"});
            }
            if (iOrdinal == 3) {
                return new ShouldAssureAge();
            }
            if (iOrdinal == 4) {
                return new Builder(0);
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
            synchronized (ShouldAssureAge.class) {
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

        @Override // com.spotify.campfire.datasource.impl.proto.ErrorReason.ShouldAssureAgeOrBuilder
        public int getAgeThreshold() {
            return this.ageThreshold_;
        }

        @Override // com.google.protobuf.AbstractC0269h, p204p.sre0
        public /* bridge */ /* synthetic */ pre0 getDefaultInstanceForType() {
            return getDefaultInstanceForType();
        }

        @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
        public /* bridge */ /* synthetic */ ore0 newBuilderForType() {
            return newBuilderForType();
        }

        @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
        public /* bridge */ /* synthetic */ ore0 toBuilder() {
            return toBuilder();
        }

        public static Builder newBuilder(ShouldAssureAge shouldAssureAge) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(shouldAssureAge);
        }

        public static ShouldAssureAge parseDelimitedFrom(InputStream inputStream, aux auxVar) {
            return (ShouldAssureAge) AbstractC0269h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, auxVar);
        }

        public static ShouldAssureAge parseFrom(ByteBuffer byteBuffer, aux auxVar) {
            return (ShouldAssureAge) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, byteBuffer, auxVar);
        }

        public static ShouldAssureAge parseFrom(gva gvaVar) {
            return (ShouldAssureAge) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, gvaVar);
        }

        public static ShouldAssureAge parseFrom(gva gvaVar, aux auxVar) {
            return (ShouldAssureAge) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, gvaVar, auxVar);
        }

        public static ShouldAssureAge parseFrom(byte[] bArr) {
            return (ShouldAssureAge) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static ShouldAssureAge parseFrom(byte[] bArr, aux auxVar) {
            return (ShouldAssureAge) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr, auxVar);
        }

        public static ShouldAssureAge parseFrom(InputStream inputStream) {
            return (ShouldAssureAge) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static ShouldAssureAge parseFrom(InputStream inputStream, aux auxVar) {
            return (ShouldAssureAge) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, inputStream, auxVar);
        }

        public static ShouldAssureAge parseFrom(owe oweVar) {
            return (ShouldAssureAge) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, oweVar);
        }

        public static ShouldAssureAge parseFrom(owe oweVar, aux auxVar) {
            return (ShouldAssureAge) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, oweVar, auxVar);
        }
    }

    public interface ShouldAssureAgeOrBuilder extends sre0 {
        int getAgeThreshold();

        @Override // p204p.sre0
        /* synthetic */ pre0 getDefaultInstanceForType();

        @Override // p204p.sre0
        /* synthetic */ boolean isInitialized();
    }

    public static final class TooYoung extends AbstractC0269h implements TooYoungOrBuilder {
        private static final TooYoung DEFAULT_INSTANCE;
        private static volatile r2n0 PARSER;

        public static final class Builder extends AbstractC0268g implements TooYoungOrBuilder {
            public /* synthetic */ Builder(int i) {
                this();
            }

            @Override // com.google.protobuf.AbstractC0268g, p204p.ore0
            public /* bridge */ /* synthetic */ pre0 build() {
                return build();
            }

            @Override // com.google.protobuf.AbstractC0268g, p204p.ore0
            public /* bridge */ /* synthetic */ pre0 buildPartial() {
                return super.buildPartial();
            }

            @Override // com.google.protobuf.AbstractC0268g
            /* JADX INFO: renamed from: clear */
            public /* bridge */ /* synthetic */ ore0 mo98325clear() {
                return mo98325clear();
            }

            @Override // com.google.protobuf.AbstractC0268g
            /* JADX INFO: renamed from: clone */
            public /* bridge */ /* synthetic */ Object mo98327clone() {
                return super.mo98326clone();
            }

            @Override // com.google.protobuf.AbstractC0268g, p204p.sre0
            public /* bridge */ /* synthetic */ pre0 getDefaultInstanceForType() {
                return super.getDefaultInstanceForType();
            }

            @Override // com.google.protobuf.AbstractC0268g, p204p.AbstractC2081l8
            public /* bridge */ /* synthetic */ AbstractC2081l8 internalMergeFrom(AbstractC2118m8 abstractC2118m8) {
                return super.internalMergeFrom((AbstractC0269h) abstractC2118m8);
            }

            @Override // com.google.protobuf.AbstractC0268g, p204p.AbstractC2081l8, p204p.ore0
            public /* bridge */ /* synthetic */ AbstractC2081l8 mergeFrom(owe oweVar, aux auxVar) {
                return super.mergeFrom(oweVar, auxVar);
            }

            private Builder() {
                super(TooYoung.DEFAULT_INSTANCE);
            }

            @Override // com.google.protobuf.AbstractC0268g
            /* JADX INFO: renamed from: clone */
            public /* bridge */ /* synthetic */ AbstractC2081l8 mo98328clone() {
                return super.mo98326clone();
            }

            @Override // com.google.protobuf.AbstractC0268g, p204p.AbstractC2081l8
            /* JADX INFO: renamed from: mergeFrom */
            public /* bridge */ /* synthetic */ AbstractC2081l8 mo98329mergeFrom(byte[] bArr, int i, int i2) {
                return super.mo98329mergeFrom(bArr, i, i2);
            }

            @Override // com.google.protobuf.AbstractC0268g
            /* JADX INFO: renamed from: clone */
            public /* bridge */ /* synthetic */ ore0 mo98328clone() {
                return super.mo98326clone();
            }

            @Override // com.google.protobuf.AbstractC0268g, p204p.AbstractC2081l8
            /* JADX INFO: renamed from: mergeFrom */
            public /* bridge */ /* synthetic */ AbstractC2081l8 mo98330mergeFrom(byte[] bArr, int i, int i2, aux auxVar) {
                return super.mo98330mergeFrom(bArr, i, i2, auxVar);
            }

            @Override // p204p.AbstractC2081l8
            /* JADX INFO: renamed from: mergeFrom */
            public /* bridge */ /* synthetic */ ore0 mo98371mergeFrom(InputStream inputStream) {
                return super.mo98371mergeFrom(inputStream);
            }

            @Override // p204p.AbstractC2081l8
            /* JADX INFO: renamed from: mergeFrom */
            public /* bridge */ /* synthetic */ ore0 mo98372mergeFrom(InputStream inputStream, aux auxVar) {
                return super.mo98372mergeFrom(inputStream, auxVar);
            }

            @Override // p204p.AbstractC2081l8
            /* JADX INFO: renamed from: mergeFrom */
            public /* bridge */ /* synthetic */ ore0 mo98373mergeFrom(gva gvaVar) {
                return super.mo98373mergeFrom(gvaVar);
            }

            @Override // p204p.AbstractC2081l8
            /* JADX INFO: renamed from: mergeFrom */
            public /* bridge */ /* synthetic */ ore0 mo98374mergeFrom(gva gvaVar, aux auxVar) {
                return super.mo98374mergeFrom(gvaVar, auxVar);
            }

            @Override // p204p.AbstractC2081l8
            /* JADX INFO: renamed from: mergeFrom */
            public /* bridge */ /* synthetic */ ore0 mo98375mergeFrom(owe oweVar) {
                return super.mo98375mergeFrom(oweVar);
            }

            @Override // com.google.protobuf.AbstractC0268g, p204p.ore0
            public /* bridge */ /* synthetic */ ore0 mergeFrom(owe oweVar, aux auxVar) {
                return super.mergeFrom(oweVar, auxVar);
            }

            @Override // p204p.AbstractC2081l8, p204p.ore0
            public /* bridge */ /* synthetic */ ore0 mergeFrom(pre0 pre0Var) {
                return super.mergeFrom(pre0Var);
            }

            @Override // p204p.AbstractC2081l8
            /* JADX INFO: renamed from: mergeFrom */
            public /* bridge */ /* synthetic */ ore0 mo98376mergeFrom(byte[] bArr) {
                return super.mo98376mergeFrom(bArr);
            }

            @Override // com.google.protobuf.AbstractC0268g
            /* JADX INFO: renamed from: mergeFrom */
            public /* bridge */ /* synthetic */ ore0 mo98329mergeFrom(byte[] bArr, int i, int i2) {
                return super.mo98329mergeFrom(bArr, i, i2);
            }

            @Override // com.google.protobuf.AbstractC0268g
            /* JADX INFO: renamed from: mergeFrom */
            public /* bridge */ /* synthetic */ ore0 mo98330mergeFrom(byte[] bArr, int i, int i2, aux auxVar) {
                return super.mo98330mergeFrom(bArr, i, i2, auxVar);
            }

            @Override // p204p.AbstractC2081l8
            /* JADX INFO: renamed from: mergeFrom */
            public /* bridge */ /* synthetic */ ore0 mo98377mergeFrom(byte[] bArr, aux auxVar) {
                return super.mo98377mergeFrom(bArr, auxVar);
            }
        }

        static {
            TooYoung tooYoung = new TooYoung();
            DEFAULT_INSTANCE = tooYoung;
            AbstractC0269h.registerDefaultInstance(TooYoung.class, tooYoung);
        }

        private TooYoung() {
        }

        public static TooYoung getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static TooYoung parseDelimitedFrom(InputStream inputStream) {
            return (TooYoung) AbstractC0269h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static TooYoung parseFrom(ByteBuffer byteBuffer) {
            return (TooYoung) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, byteBuffer);
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
                return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0000", null);
            }
            if (iOrdinal == 3) {
                return new TooYoung();
            }
            if (iOrdinal == 4) {
                return new Builder(0);
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
            synchronized (TooYoung.class) {
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
        public /* bridge */ /* synthetic */ pre0 getDefaultInstanceForType() {
            return getDefaultInstanceForType();
        }

        @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
        public /* bridge */ /* synthetic */ ore0 newBuilderForType() {
            return newBuilderForType();
        }

        @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
        public /* bridge */ /* synthetic */ ore0 toBuilder() {
            return toBuilder();
        }

        public static Builder newBuilder(TooYoung tooYoung) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(tooYoung);
        }

        public static TooYoung parseDelimitedFrom(InputStream inputStream, aux auxVar) {
            return (TooYoung) AbstractC0269h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, auxVar);
        }

        public static TooYoung parseFrom(ByteBuffer byteBuffer, aux auxVar) {
            return (TooYoung) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, byteBuffer, auxVar);
        }

        public static TooYoung parseFrom(gva gvaVar) {
            return (TooYoung) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, gvaVar);
        }

        public static TooYoung parseFrom(gva gvaVar, aux auxVar) {
            return (TooYoung) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, gvaVar, auxVar);
        }

        public static TooYoung parseFrom(byte[] bArr) {
            return (TooYoung) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static TooYoung parseFrom(byte[] bArr, aux auxVar) {
            return (TooYoung) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr, auxVar);
        }

        public static TooYoung parseFrom(InputStream inputStream) {
            return (TooYoung) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static TooYoung parseFrom(InputStream inputStream, aux auxVar) {
            return (TooYoung) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, inputStream, auxVar);
        }

        public static TooYoung parseFrom(owe oweVar) {
            return (TooYoung) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, oweVar);
        }

        public static TooYoung parseFrom(owe oweVar, aux auxVar) {
            return (TooYoung) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, oweVar, auxVar);
        }
    }

    public interface TooYoungOrBuilder extends sre0 {
        @Override // p204p.sre0
        /* synthetic */ pre0 getDefaultInstanceForType();

        @Override // p204p.sre0
        /* synthetic */ boolean isInitialized();
    }

    public static final class UnreleasedMarket extends AbstractC0269h implements UnreleasedMarketOrBuilder {
        private static final UnreleasedMarket DEFAULT_INSTANCE;
        public static final int MARKET_FIELD_NUMBER = 1;
        private static volatile r2n0 PARSER;
        private String market_ = "";

        public static final class Builder extends AbstractC0268g implements UnreleasedMarketOrBuilder {
            public /* synthetic */ Builder(int i) {
                this();
            }

            @Override // com.google.protobuf.AbstractC0268g, p204p.ore0
            public /* bridge */ /* synthetic */ pre0 build() {
                return build();
            }

            @Override // com.google.protobuf.AbstractC0268g, p204p.ore0
            public /* bridge */ /* synthetic */ pre0 buildPartial() {
                return super.buildPartial();
            }

            @Override // com.google.protobuf.AbstractC0268g
            /* JADX INFO: renamed from: clear */
            public /* bridge */ /* synthetic */ ore0 mo98325clear() {
                return mo98325clear();
            }

            public Builder clearMarket() {
                copyOnWrite();
                ((UnreleasedMarket) this.instance).clearMarket();
                return this;
            }

            @Override // com.google.protobuf.AbstractC0268g
            /* JADX INFO: renamed from: clone */
            public /* bridge */ /* synthetic */ Object mo98327clone() {
                return super.mo98326clone();
            }

            @Override // com.google.protobuf.AbstractC0268g, p204p.sre0
            public /* bridge */ /* synthetic */ pre0 getDefaultInstanceForType() {
                return super.getDefaultInstanceForType();
            }

            @Override // com.spotify.campfire.datasource.impl.proto.ErrorReason.UnreleasedMarketOrBuilder
            public String getMarket() {
                return ((UnreleasedMarket) this.instance).getMarket();
            }

            @Override // com.spotify.campfire.datasource.impl.proto.ErrorReason.UnreleasedMarketOrBuilder
            public gva getMarketBytes() {
                return ((UnreleasedMarket) this.instance).getMarketBytes();
            }

            @Override // com.google.protobuf.AbstractC0268g, p204p.AbstractC2081l8
            public /* bridge */ /* synthetic */ AbstractC2081l8 internalMergeFrom(AbstractC2118m8 abstractC2118m8) {
                return super.internalMergeFrom((AbstractC0269h) abstractC2118m8);
            }

            @Override // com.google.protobuf.AbstractC0268g, p204p.AbstractC2081l8, p204p.ore0
            public /* bridge */ /* synthetic */ AbstractC2081l8 mergeFrom(owe oweVar, aux auxVar) {
                return super.mergeFrom(oweVar, auxVar);
            }

            public Builder setMarket(String str) {
                copyOnWrite();
                ((UnreleasedMarket) this.instance).setMarket(str);
                return this;
            }

            public Builder setMarketBytes(gva gvaVar) {
                copyOnWrite();
                ((UnreleasedMarket) this.instance).setMarketBytes(gvaVar);
                return this;
            }

            private Builder() {
                super(UnreleasedMarket.DEFAULT_INSTANCE);
            }

            @Override // com.google.protobuf.AbstractC0268g
            /* JADX INFO: renamed from: clone */
            public /* bridge */ /* synthetic */ AbstractC2081l8 mo98328clone() {
                return super.mo98326clone();
            }

            @Override // com.google.protobuf.AbstractC0268g, p204p.AbstractC2081l8
            /* JADX INFO: renamed from: mergeFrom */
            public /* bridge */ /* synthetic */ AbstractC2081l8 mo98329mergeFrom(byte[] bArr, int i, int i2) {
                return super.mo98329mergeFrom(bArr, i, i2);
            }

            @Override // com.google.protobuf.AbstractC0268g
            /* JADX INFO: renamed from: clone */
            public /* bridge */ /* synthetic */ ore0 mo98328clone() {
                return super.mo98326clone();
            }

            @Override // com.google.protobuf.AbstractC0268g, p204p.AbstractC2081l8
            /* JADX INFO: renamed from: mergeFrom */
            public /* bridge */ /* synthetic */ AbstractC2081l8 mo98330mergeFrom(byte[] bArr, int i, int i2, aux auxVar) {
                return super.mo98330mergeFrom(bArr, i, i2, auxVar);
            }

            @Override // p204p.AbstractC2081l8
            /* JADX INFO: renamed from: mergeFrom */
            public /* bridge */ /* synthetic */ ore0 mo98371mergeFrom(InputStream inputStream) {
                return super.mo98371mergeFrom(inputStream);
            }

            @Override // p204p.AbstractC2081l8
            /* JADX INFO: renamed from: mergeFrom */
            public /* bridge */ /* synthetic */ ore0 mo98372mergeFrom(InputStream inputStream, aux auxVar) {
                return super.mo98372mergeFrom(inputStream, auxVar);
            }

            @Override // p204p.AbstractC2081l8
            /* JADX INFO: renamed from: mergeFrom */
            public /* bridge */ /* synthetic */ ore0 mo98373mergeFrom(gva gvaVar) {
                return super.mo98373mergeFrom(gvaVar);
            }

            @Override // p204p.AbstractC2081l8
            /* JADX INFO: renamed from: mergeFrom */
            public /* bridge */ /* synthetic */ ore0 mo98374mergeFrom(gva gvaVar, aux auxVar) {
                return super.mo98374mergeFrom(gvaVar, auxVar);
            }

            @Override // p204p.AbstractC2081l8
            /* JADX INFO: renamed from: mergeFrom */
            public /* bridge */ /* synthetic */ ore0 mo98375mergeFrom(owe oweVar) {
                return super.mo98375mergeFrom(oweVar);
            }

            @Override // com.google.protobuf.AbstractC0268g, p204p.ore0
            public /* bridge */ /* synthetic */ ore0 mergeFrom(owe oweVar, aux auxVar) {
                return super.mergeFrom(oweVar, auxVar);
            }

            @Override // p204p.AbstractC2081l8, p204p.ore0
            public /* bridge */ /* synthetic */ ore0 mergeFrom(pre0 pre0Var) {
                return super.mergeFrom(pre0Var);
            }

            @Override // p204p.AbstractC2081l8
            /* JADX INFO: renamed from: mergeFrom */
            public /* bridge */ /* synthetic */ ore0 mo98376mergeFrom(byte[] bArr) {
                return super.mo98376mergeFrom(bArr);
            }

            @Override // com.google.protobuf.AbstractC0268g
            /* JADX INFO: renamed from: mergeFrom */
            public /* bridge */ /* synthetic */ ore0 mo98329mergeFrom(byte[] bArr, int i, int i2) {
                return super.mo98329mergeFrom(bArr, i, i2);
            }

            @Override // com.google.protobuf.AbstractC0268g
            /* JADX INFO: renamed from: mergeFrom */
            public /* bridge */ /* synthetic */ ore0 mo98330mergeFrom(byte[] bArr, int i, int i2, aux auxVar) {
                return super.mo98330mergeFrom(bArr, i, i2, auxVar);
            }

            @Override // p204p.AbstractC2081l8
            /* JADX INFO: renamed from: mergeFrom */
            public /* bridge */ /* synthetic */ ore0 mo98377mergeFrom(byte[] bArr, aux auxVar) {
                return super.mo98377mergeFrom(bArr, auxVar);
            }
        }

        static {
            UnreleasedMarket unreleasedMarket = new UnreleasedMarket();
            DEFAULT_INSTANCE = unreleasedMarket;
            AbstractC0269h.registerDefaultInstance(UnreleasedMarket.class, unreleasedMarket);
        }

        private UnreleasedMarket() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearMarket() {
            this.market_ = getDefaultInstance().getMarket();
        }

        public static UnreleasedMarket getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static UnreleasedMarket parseDelimitedFrom(InputStream inputStream) {
            return (UnreleasedMarket) AbstractC0269h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static UnreleasedMarket parseFrom(ByteBuffer byteBuffer) {
            return (UnreleasedMarket) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static r2n0 parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMarket(String str) {
            str.getClass();
            this.market_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMarketBytes(gva gvaVar) {
            AbstractC2118m8.checkByteStringIsUtf8(gvaVar);
            this.market_ = gvaVar.m45892u();
        }

        @Override // com.google.protobuf.AbstractC0269h
        public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
            r2n0 r110Var;
            int iOrdinal = z110Var.ordinal();
            if (iOrdinal == 0) {
                return (byte) 1;
            }
            if (iOrdinal == 2) {
                return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"market_"});
            }
            if (iOrdinal == 3) {
                return new UnreleasedMarket();
            }
            if (iOrdinal == 4) {
                return new Builder(0);
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
            synchronized (UnreleasedMarket.class) {
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
        public /* bridge */ /* synthetic */ pre0 getDefaultInstanceForType() {
            return getDefaultInstanceForType();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.ErrorReason.UnreleasedMarketOrBuilder
        public String getMarket() {
            return this.market_;
        }

        @Override // com.spotify.campfire.datasource.impl.proto.ErrorReason.UnreleasedMarketOrBuilder
        public gva getMarketBytes() {
            return gva.m45888f(this.market_);
        }

        @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
        public /* bridge */ /* synthetic */ ore0 newBuilderForType() {
            return newBuilderForType();
        }

        @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
        public /* bridge */ /* synthetic */ ore0 toBuilder() {
            return toBuilder();
        }

        public static Builder newBuilder(UnreleasedMarket unreleasedMarket) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(unreleasedMarket);
        }

        public static UnreleasedMarket parseDelimitedFrom(InputStream inputStream, aux auxVar) {
            return (UnreleasedMarket) AbstractC0269h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, auxVar);
        }

        public static UnreleasedMarket parseFrom(ByteBuffer byteBuffer, aux auxVar) {
            return (UnreleasedMarket) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, byteBuffer, auxVar);
        }

        public static UnreleasedMarket parseFrom(gva gvaVar) {
            return (UnreleasedMarket) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, gvaVar);
        }

        public static UnreleasedMarket parseFrom(gva gvaVar, aux auxVar) {
            return (UnreleasedMarket) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, gvaVar, auxVar);
        }

        public static UnreleasedMarket parseFrom(byte[] bArr) {
            return (UnreleasedMarket) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static UnreleasedMarket parseFrom(byte[] bArr, aux auxVar) {
            return (UnreleasedMarket) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr, auxVar);
        }

        public static UnreleasedMarket parseFrom(InputStream inputStream) {
            return (UnreleasedMarket) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static UnreleasedMarket parseFrom(InputStream inputStream, aux auxVar) {
            return (UnreleasedMarket) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, inputStream, auxVar);
        }

        public static UnreleasedMarket parseFrom(owe oweVar) {
            return (UnreleasedMarket) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, oweVar);
        }

        public static UnreleasedMarket parseFrom(owe oweVar, aux auxVar) {
            return (UnreleasedMarket) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, oweVar, auxVar);
        }
    }

    public interface UnreleasedMarketOrBuilder extends sre0 {
        @Override // p204p.sre0
        /* synthetic */ pre0 getDefaultInstanceForType();

        String getMarket();

        gva getMarketBytes();

        @Override // p204p.sre0
        /* synthetic */ boolean isInitialized();
    }

    public static final class Unspecified extends AbstractC0269h implements UnspecifiedOrBuilder {
        private static final Unspecified DEFAULT_INSTANCE;
        private static volatile r2n0 PARSER;

        public static final class Builder extends AbstractC0268g implements UnspecifiedOrBuilder {
            public /* synthetic */ Builder(int i) {
                this();
            }

            @Override // com.google.protobuf.AbstractC0268g, p204p.ore0
            public /* bridge */ /* synthetic */ pre0 build() {
                return build();
            }

            @Override // com.google.protobuf.AbstractC0268g, p204p.ore0
            public /* bridge */ /* synthetic */ pre0 buildPartial() {
                return super.buildPartial();
            }

            @Override // com.google.protobuf.AbstractC0268g
            /* JADX INFO: renamed from: clear */
            public /* bridge */ /* synthetic */ ore0 mo98325clear() {
                return mo98325clear();
            }

            @Override // com.google.protobuf.AbstractC0268g
            /* JADX INFO: renamed from: clone */
            public /* bridge */ /* synthetic */ Object mo98327clone() {
                return super.mo98326clone();
            }

            @Override // com.google.protobuf.AbstractC0268g, p204p.sre0
            public /* bridge */ /* synthetic */ pre0 getDefaultInstanceForType() {
                return super.getDefaultInstanceForType();
            }

            @Override // com.google.protobuf.AbstractC0268g, p204p.AbstractC2081l8
            public /* bridge */ /* synthetic */ AbstractC2081l8 internalMergeFrom(AbstractC2118m8 abstractC2118m8) {
                return super.internalMergeFrom((AbstractC0269h) abstractC2118m8);
            }

            @Override // com.google.protobuf.AbstractC0268g, p204p.AbstractC2081l8, p204p.ore0
            public /* bridge */ /* synthetic */ AbstractC2081l8 mergeFrom(owe oweVar, aux auxVar) {
                return super.mergeFrom(oweVar, auxVar);
            }

            private Builder() {
                super(Unspecified.DEFAULT_INSTANCE);
            }

            @Override // com.google.protobuf.AbstractC0268g
            /* JADX INFO: renamed from: clone */
            public /* bridge */ /* synthetic */ AbstractC2081l8 mo98328clone() {
                return super.mo98326clone();
            }

            @Override // com.google.protobuf.AbstractC0268g, p204p.AbstractC2081l8
            /* JADX INFO: renamed from: mergeFrom */
            public /* bridge */ /* synthetic */ AbstractC2081l8 mo98329mergeFrom(byte[] bArr, int i, int i2) {
                return super.mo98329mergeFrom(bArr, i, i2);
            }

            @Override // com.google.protobuf.AbstractC0268g
            /* JADX INFO: renamed from: clone */
            public /* bridge */ /* synthetic */ ore0 mo98328clone() {
                return super.mo98326clone();
            }

            @Override // com.google.protobuf.AbstractC0268g, p204p.AbstractC2081l8
            /* JADX INFO: renamed from: mergeFrom */
            public /* bridge */ /* synthetic */ AbstractC2081l8 mo98330mergeFrom(byte[] bArr, int i, int i2, aux auxVar) {
                return super.mo98330mergeFrom(bArr, i, i2, auxVar);
            }

            @Override // p204p.AbstractC2081l8
            /* JADX INFO: renamed from: mergeFrom */
            public /* bridge */ /* synthetic */ ore0 mo98371mergeFrom(InputStream inputStream) {
                return super.mo98371mergeFrom(inputStream);
            }

            @Override // p204p.AbstractC2081l8
            /* JADX INFO: renamed from: mergeFrom */
            public /* bridge */ /* synthetic */ ore0 mo98372mergeFrom(InputStream inputStream, aux auxVar) {
                return super.mo98372mergeFrom(inputStream, auxVar);
            }

            @Override // p204p.AbstractC2081l8
            /* JADX INFO: renamed from: mergeFrom */
            public /* bridge */ /* synthetic */ ore0 mo98373mergeFrom(gva gvaVar) {
                return super.mo98373mergeFrom(gvaVar);
            }

            @Override // p204p.AbstractC2081l8
            /* JADX INFO: renamed from: mergeFrom */
            public /* bridge */ /* synthetic */ ore0 mo98374mergeFrom(gva gvaVar, aux auxVar) {
                return super.mo98374mergeFrom(gvaVar, auxVar);
            }

            @Override // p204p.AbstractC2081l8
            /* JADX INFO: renamed from: mergeFrom */
            public /* bridge */ /* synthetic */ ore0 mo98375mergeFrom(owe oweVar) {
                return super.mo98375mergeFrom(oweVar);
            }

            @Override // com.google.protobuf.AbstractC0268g, p204p.ore0
            public /* bridge */ /* synthetic */ ore0 mergeFrom(owe oweVar, aux auxVar) {
                return super.mergeFrom(oweVar, auxVar);
            }

            @Override // p204p.AbstractC2081l8, p204p.ore0
            public /* bridge */ /* synthetic */ ore0 mergeFrom(pre0 pre0Var) {
                return super.mergeFrom(pre0Var);
            }

            @Override // p204p.AbstractC2081l8
            /* JADX INFO: renamed from: mergeFrom */
            public /* bridge */ /* synthetic */ ore0 mo98376mergeFrom(byte[] bArr) {
                return super.mo98376mergeFrom(bArr);
            }

            @Override // com.google.protobuf.AbstractC0268g
            /* JADX INFO: renamed from: mergeFrom */
            public /* bridge */ /* synthetic */ ore0 mo98329mergeFrom(byte[] bArr, int i, int i2) {
                return super.mo98329mergeFrom(bArr, i, i2);
            }

            @Override // com.google.protobuf.AbstractC0268g
            /* JADX INFO: renamed from: mergeFrom */
            public /* bridge */ /* synthetic */ ore0 mo98330mergeFrom(byte[] bArr, int i, int i2, aux auxVar) {
                return super.mo98330mergeFrom(bArr, i, i2, auxVar);
            }

            @Override // p204p.AbstractC2081l8
            /* JADX INFO: renamed from: mergeFrom */
            public /* bridge */ /* synthetic */ ore0 mo98377mergeFrom(byte[] bArr, aux auxVar) {
                return super.mo98377mergeFrom(bArr, auxVar);
            }
        }

        static {
            Unspecified unspecified = new Unspecified();
            DEFAULT_INSTANCE = unspecified;
            AbstractC0269h.registerDefaultInstance(Unspecified.class, unspecified);
        }

        private Unspecified() {
        }

        public static Unspecified getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static Unspecified parseDelimitedFrom(InputStream inputStream) {
            return (Unspecified) AbstractC0269h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Unspecified parseFrom(ByteBuffer byteBuffer) {
            return (Unspecified) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, byteBuffer);
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
                return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0000", null);
            }
            if (iOrdinal == 3) {
                return new Unspecified();
            }
            if (iOrdinal == 4) {
                return new Builder(0);
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
            synchronized (Unspecified.class) {
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
        public /* bridge */ /* synthetic */ pre0 getDefaultInstanceForType() {
            return getDefaultInstanceForType();
        }

        @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
        public /* bridge */ /* synthetic */ ore0 newBuilderForType() {
            return newBuilderForType();
        }

        @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
        public /* bridge */ /* synthetic */ ore0 toBuilder() {
            return toBuilder();
        }

        public static Builder newBuilder(Unspecified unspecified) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(unspecified);
        }

        public static Unspecified parseDelimitedFrom(InputStream inputStream, aux auxVar) {
            return (Unspecified) AbstractC0269h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, auxVar);
        }

        public static Unspecified parseFrom(ByteBuffer byteBuffer, aux auxVar) {
            return (Unspecified) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, byteBuffer, auxVar);
        }

        public static Unspecified parseFrom(gva gvaVar) {
            return (Unspecified) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, gvaVar);
        }

        public static Unspecified parseFrom(gva gvaVar, aux auxVar) {
            return (Unspecified) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, gvaVar, auxVar);
        }

        public static Unspecified parseFrom(byte[] bArr) {
            return (Unspecified) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static Unspecified parseFrom(byte[] bArr, aux auxVar) {
            return (Unspecified) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr, auxVar);
        }

        public static Unspecified parseFrom(InputStream inputStream) {
            return (Unspecified) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Unspecified parseFrom(InputStream inputStream, aux auxVar) {
            return (Unspecified) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, inputStream, auxVar);
        }

        public static Unspecified parseFrom(owe oweVar) {
            return (Unspecified) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, oweVar);
        }

        public static Unspecified parseFrom(owe oweVar, aux auxVar) {
            return (Unspecified) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, oweVar, auxVar);
        }
    }

    public interface UnspecifiedOrBuilder extends sre0 {
        @Override // p204p.sre0
        /* synthetic */ pre0 getDefaultInstanceForType();

        @Override // p204p.sre0
        /* synthetic */ boolean isInitialized();
    }

    public static final class UserBlocked extends AbstractC0269h implements UserBlockedOrBuilder {
        private static final UserBlocked DEFAULT_INSTANCE;
        private static volatile r2n0 PARSER;

        public static final class Builder extends AbstractC0268g implements UserBlockedOrBuilder {
            public /* synthetic */ Builder(int i) {
                this();
            }

            @Override // com.google.protobuf.AbstractC0268g, p204p.ore0
            public /* bridge */ /* synthetic */ pre0 build() {
                return build();
            }

            @Override // com.google.protobuf.AbstractC0268g, p204p.ore0
            public /* bridge */ /* synthetic */ pre0 buildPartial() {
                return super.buildPartial();
            }

            @Override // com.google.protobuf.AbstractC0268g
            /* JADX INFO: renamed from: clear */
            public /* bridge */ /* synthetic */ ore0 mo98325clear() {
                return mo98325clear();
            }

            @Override // com.google.protobuf.AbstractC0268g
            /* JADX INFO: renamed from: clone */
            public /* bridge */ /* synthetic */ Object mo98327clone() {
                return super.mo98326clone();
            }

            @Override // com.google.protobuf.AbstractC0268g, p204p.sre0
            public /* bridge */ /* synthetic */ pre0 getDefaultInstanceForType() {
                return super.getDefaultInstanceForType();
            }

            @Override // com.google.protobuf.AbstractC0268g, p204p.AbstractC2081l8
            public /* bridge */ /* synthetic */ AbstractC2081l8 internalMergeFrom(AbstractC2118m8 abstractC2118m8) {
                return super.internalMergeFrom((AbstractC0269h) abstractC2118m8);
            }

            @Override // com.google.protobuf.AbstractC0268g, p204p.AbstractC2081l8, p204p.ore0
            public /* bridge */ /* synthetic */ AbstractC2081l8 mergeFrom(owe oweVar, aux auxVar) {
                return super.mergeFrom(oweVar, auxVar);
            }

            private Builder() {
                super(UserBlocked.DEFAULT_INSTANCE);
            }

            @Override // com.google.protobuf.AbstractC0268g
            /* JADX INFO: renamed from: clone */
            public /* bridge */ /* synthetic */ AbstractC2081l8 mo98328clone() {
                return super.mo98326clone();
            }

            @Override // com.google.protobuf.AbstractC0268g, p204p.AbstractC2081l8
            /* JADX INFO: renamed from: mergeFrom */
            public /* bridge */ /* synthetic */ AbstractC2081l8 mo98329mergeFrom(byte[] bArr, int i, int i2) {
                return super.mo98329mergeFrom(bArr, i, i2);
            }

            @Override // com.google.protobuf.AbstractC0268g
            /* JADX INFO: renamed from: clone */
            public /* bridge */ /* synthetic */ ore0 mo98328clone() {
                return super.mo98326clone();
            }

            @Override // com.google.protobuf.AbstractC0268g, p204p.AbstractC2081l8
            /* JADX INFO: renamed from: mergeFrom */
            public /* bridge */ /* synthetic */ AbstractC2081l8 mo98330mergeFrom(byte[] bArr, int i, int i2, aux auxVar) {
                return super.mo98330mergeFrom(bArr, i, i2, auxVar);
            }

            @Override // p204p.AbstractC2081l8
            /* JADX INFO: renamed from: mergeFrom */
            public /* bridge */ /* synthetic */ ore0 mo98371mergeFrom(InputStream inputStream) {
                return super.mo98371mergeFrom(inputStream);
            }

            @Override // p204p.AbstractC2081l8
            /* JADX INFO: renamed from: mergeFrom */
            public /* bridge */ /* synthetic */ ore0 mo98372mergeFrom(InputStream inputStream, aux auxVar) {
                return super.mo98372mergeFrom(inputStream, auxVar);
            }

            @Override // p204p.AbstractC2081l8
            /* JADX INFO: renamed from: mergeFrom */
            public /* bridge */ /* synthetic */ ore0 mo98373mergeFrom(gva gvaVar) {
                return super.mo98373mergeFrom(gvaVar);
            }

            @Override // p204p.AbstractC2081l8
            /* JADX INFO: renamed from: mergeFrom */
            public /* bridge */ /* synthetic */ ore0 mo98374mergeFrom(gva gvaVar, aux auxVar) {
                return super.mo98374mergeFrom(gvaVar, auxVar);
            }

            @Override // p204p.AbstractC2081l8
            /* JADX INFO: renamed from: mergeFrom */
            public /* bridge */ /* synthetic */ ore0 mo98375mergeFrom(owe oweVar) {
                return super.mo98375mergeFrom(oweVar);
            }

            @Override // com.google.protobuf.AbstractC0268g, p204p.ore0
            public /* bridge */ /* synthetic */ ore0 mergeFrom(owe oweVar, aux auxVar) {
                return super.mergeFrom(oweVar, auxVar);
            }

            @Override // p204p.AbstractC2081l8, p204p.ore0
            public /* bridge */ /* synthetic */ ore0 mergeFrom(pre0 pre0Var) {
                return super.mergeFrom(pre0Var);
            }

            @Override // p204p.AbstractC2081l8
            /* JADX INFO: renamed from: mergeFrom */
            public /* bridge */ /* synthetic */ ore0 mo98376mergeFrom(byte[] bArr) {
                return super.mo98376mergeFrom(bArr);
            }

            @Override // com.google.protobuf.AbstractC0268g
            /* JADX INFO: renamed from: mergeFrom */
            public /* bridge */ /* synthetic */ ore0 mo98329mergeFrom(byte[] bArr, int i, int i2) {
                return super.mo98329mergeFrom(bArr, i, i2);
            }

            @Override // com.google.protobuf.AbstractC0268g
            /* JADX INFO: renamed from: mergeFrom */
            public /* bridge */ /* synthetic */ ore0 mo98330mergeFrom(byte[] bArr, int i, int i2, aux auxVar) {
                return super.mo98330mergeFrom(bArr, i, i2, auxVar);
            }

            @Override // p204p.AbstractC2081l8
            /* JADX INFO: renamed from: mergeFrom */
            public /* bridge */ /* synthetic */ ore0 mo98377mergeFrom(byte[] bArr, aux auxVar) {
                return super.mo98377mergeFrom(bArr, auxVar);
            }
        }

        static {
            UserBlocked userBlocked = new UserBlocked();
            DEFAULT_INSTANCE = userBlocked;
            AbstractC0269h.registerDefaultInstance(UserBlocked.class, userBlocked);
        }

        private UserBlocked() {
        }

        public static UserBlocked getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static UserBlocked parseDelimitedFrom(InputStream inputStream) {
            return (UserBlocked) AbstractC0269h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static UserBlocked parseFrom(ByteBuffer byteBuffer) {
            return (UserBlocked) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, byteBuffer);
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
                return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0000", null);
            }
            if (iOrdinal == 3) {
                return new UserBlocked();
            }
            if (iOrdinal == 4) {
                return new Builder(0);
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
            synchronized (UserBlocked.class) {
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
        public /* bridge */ /* synthetic */ pre0 getDefaultInstanceForType() {
            return getDefaultInstanceForType();
        }

        @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
        public /* bridge */ /* synthetic */ ore0 newBuilderForType() {
            return newBuilderForType();
        }

        @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
        public /* bridge */ /* synthetic */ ore0 toBuilder() {
            return toBuilder();
        }

        public static Builder newBuilder(UserBlocked userBlocked) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(userBlocked);
        }

        public static UserBlocked parseDelimitedFrom(InputStream inputStream, aux auxVar) {
            return (UserBlocked) AbstractC0269h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, auxVar);
        }

        public static UserBlocked parseFrom(ByteBuffer byteBuffer, aux auxVar) {
            return (UserBlocked) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, byteBuffer, auxVar);
        }

        public static UserBlocked parseFrom(gva gvaVar) {
            return (UserBlocked) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, gvaVar);
        }

        public static UserBlocked parseFrom(gva gvaVar, aux auxVar) {
            return (UserBlocked) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, gvaVar, auxVar);
        }

        public static UserBlocked parseFrom(byte[] bArr) {
            return (UserBlocked) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static UserBlocked parseFrom(byte[] bArr, aux auxVar) {
            return (UserBlocked) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr, auxVar);
        }

        public static UserBlocked parseFrom(InputStream inputStream) {
            return (UserBlocked) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static UserBlocked parseFrom(InputStream inputStream, aux auxVar) {
            return (UserBlocked) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, inputStream, auxVar);
        }

        public static UserBlocked parseFrom(owe oweVar) {
            return (UserBlocked) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, oweVar);
        }

        public static UserBlocked parseFrom(owe oweVar, aux auxVar) {
            return (UserBlocked) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, oweVar, auxVar);
        }
    }

    public interface UserBlockedOrBuilder extends sre0 {
        @Override // p204p.sre0
        /* synthetic */ pre0 getDefaultInstanceForType();

        @Override // p204p.sre0
        /* synthetic */ boolean isInitialized();
    }

    public enum UserRole implements od50 {
        USER_ROLE_UNSPECIFIED(0),
        USER_ROLE_SENDER(1),
        USER_ROLE_RECEIVER(2),
        UNRECOGNIZED(-1);

        public static final int USER_ROLE_RECEIVER_VALUE = 2;
        public static final int USER_ROLE_SENDER_VALUE = 1;
        public static final int USER_ROLE_UNSPECIFIED_VALUE = 0;
        private static final rd50 internalValueMap = new rd50() { // from class: com.spotify.campfire.datasource.impl.proto.ErrorReason.UserRole.1
            @Override // p204p.rd50
            public UserRole findValueByNumber(int i) {
                return UserRole.forNumber(i);
            }
        };
        private final int value;

        public static final class UserRoleVerifier implements sd50 {
            static final sd50 INSTANCE = new UserRoleVerifier();

            private UserRoleVerifier() {
            }

            @Override // p204p.sd50
            public boolean isInRange(int i) {
                return UserRole.forNumber(i) != null;
            }
        }

        UserRole(int i) {
            this.value = i;
        }

        public static UserRole forNumber(int i) {
            if (i == 0) {
                return USER_ROLE_UNSPECIFIED;
            }
            if (i == 1) {
                return USER_ROLE_SENDER;
            }
            if (i != 2) {
                return null;
            }
            return USER_ROLE_RECEIVER;
        }

        public static rd50 internalGetValueMap() {
            return internalValueMap;
        }

        public static sd50 internalGetVerifier() {
            return UserRoleVerifier.INSTANCE;
        }

        @Override // p204p.od50
        public final int getNumber() {
            if (this != UNRECOGNIZED) {
                return this.value;
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }

        @Deprecated
        public static UserRole valueOf(int i) {
            return forNumber(i);
        }
    }

    public static final class ViolativeContent extends AbstractC0269h implements ViolativeContentOrBuilder {
        private static final ViolativeContent DEFAULT_INSTANCE;
        private static volatile r2n0 PARSER;

        public static final class Builder extends AbstractC0268g implements ViolativeContentOrBuilder {
            public /* synthetic */ Builder(int i) {
                this();
            }

            @Override // com.google.protobuf.AbstractC0268g, p204p.ore0
            public /* bridge */ /* synthetic */ pre0 build() {
                return build();
            }

            @Override // com.google.protobuf.AbstractC0268g, p204p.ore0
            public /* bridge */ /* synthetic */ pre0 buildPartial() {
                return super.buildPartial();
            }

            @Override // com.google.protobuf.AbstractC0268g
            /* JADX INFO: renamed from: clear */
            public /* bridge */ /* synthetic */ ore0 mo98325clear() {
                return mo98325clear();
            }

            @Override // com.google.protobuf.AbstractC0268g
            /* JADX INFO: renamed from: clone */
            public /* bridge */ /* synthetic */ Object mo98327clone() {
                return super.mo98326clone();
            }

            @Override // com.google.protobuf.AbstractC0268g, p204p.sre0
            public /* bridge */ /* synthetic */ pre0 getDefaultInstanceForType() {
                return super.getDefaultInstanceForType();
            }

            @Override // com.google.protobuf.AbstractC0268g, p204p.AbstractC2081l8
            public /* bridge */ /* synthetic */ AbstractC2081l8 internalMergeFrom(AbstractC2118m8 abstractC2118m8) {
                return super.internalMergeFrom((AbstractC0269h) abstractC2118m8);
            }

            @Override // com.google.protobuf.AbstractC0268g, p204p.AbstractC2081l8, p204p.ore0
            public /* bridge */ /* synthetic */ AbstractC2081l8 mergeFrom(owe oweVar, aux auxVar) {
                return super.mergeFrom(oweVar, auxVar);
            }

            private Builder() {
                super(ViolativeContent.DEFAULT_INSTANCE);
            }

            @Override // com.google.protobuf.AbstractC0268g
            /* JADX INFO: renamed from: clone */
            public /* bridge */ /* synthetic */ AbstractC2081l8 mo98328clone() {
                return super.mo98326clone();
            }

            @Override // com.google.protobuf.AbstractC0268g, p204p.AbstractC2081l8
            /* JADX INFO: renamed from: mergeFrom */
            public /* bridge */ /* synthetic */ AbstractC2081l8 mo98329mergeFrom(byte[] bArr, int i, int i2) {
                return super.mo98329mergeFrom(bArr, i, i2);
            }

            @Override // com.google.protobuf.AbstractC0268g
            /* JADX INFO: renamed from: clone */
            public /* bridge */ /* synthetic */ ore0 mo98328clone() {
                return super.mo98326clone();
            }

            @Override // com.google.protobuf.AbstractC0268g, p204p.AbstractC2081l8
            /* JADX INFO: renamed from: mergeFrom */
            public /* bridge */ /* synthetic */ AbstractC2081l8 mo98330mergeFrom(byte[] bArr, int i, int i2, aux auxVar) {
                return super.mo98330mergeFrom(bArr, i, i2, auxVar);
            }

            @Override // p204p.AbstractC2081l8
            /* JADX INFO: renamed from: mergeFrom */
            public /* bridge */ /* synthetic */ ore0 mo98371mergeFrom(InputStream inputStream) {
                return super.mo98371mergeFrom(inputStream);
            }

            @Override // p204p.AbstractC2081l8
            /* JADX INFO: renamed from: mergeFrom */
            public /* bridge */ /* synthetic */ ore0 mo98372mergeFrom(InputStream inputStream, aux auxVar) {
                return super.mo98372mergeFrom(inputStream, auxVar);
            }

            @Override // p204p.AbstractC2081l8
            /* JADX INFO: renamed from: mergeFrom */
            public /* bridge */ /* synthetic */ ore0 mo98373mergeFrom(gva gvaVar) {
                return super.mo98373mergeFrom(gvaVar);
            }

            @Override // p204p.AbstractC2081l8
            /* JADX INFO: renamed from: mergeFrom */
            public /* bridge */ /* synthetic */ ore0 mo98374mergeFrom(gva gvaVar, aux auxVar) {
                return super.mo98374mergeFrom(gvaVar, auxVar);
            }

            @Override // p204p.AbstractC2081l8
            /* JADX INFO: renamed from: mergeFrom */
            public /* bridge */ /* synthetic */ ore0 mo98375mergeFrom(owe oweVar) {
                return super.mo98375mergeFrom(oweVar);
            }

            @Override // com.google.protobuf.AbstractC0268g, p204p.ore0
            public /* bridge */ /* synthetic */ ore0 mergeFrom(owe oweVar, aux auxVar) {
                return super.mergeFrom(oweVar, auxVar);
            }

            @Override // p204p.AbstractC2081l8, p204p.ore0
            public /* bridge */ /* synthetic */ ore0 mergeFrom(pre0 pre0Var) {
                return super.mergeFrom(pre0Var);
            }

            @Override // p204p.AbstractC2081l8
            /* JADX INFO: renamed from: mergeFrom */
            public /* bridge */ /* synthetic */ ore0 mo98376mergeFrom(byte[] bArr) {
                return super.mo98376mergeFrom(bArr);
            }

            @Override // com.google.protobuf.AbstractC0268g
            /* JADX INFO: renamed from: mergeFrom */
            public /* bridge */ /* synthetic */ ore0 mo98329mergeFrom(byte[] bArr, int i, int i2) {
                return super.mo98329mergeFrom(bArr, i, i2);
            }

            @Override // com.google.protobuf.AbstractC0268g
            /* JADX INFO: renamed from: mergeFrom */
            public /* bridge */ /* synthetic */ ore0 mo98330mergeFrom(byte[] bArr, int i, int i2, aux auxVar) {
                return super.mo98330mergeFrom(bArr, i, i2, auxVar);
            }

            @Override // p204p.AbstractC2081l8
            /* JADX INFO: renamed from: mergeFrom */
            public /* bridge */ /* synthetic */ ore0 mo98377mergeFrom(byte[] bArr, aux auxVar) {
                return super.mo98377mergeFrom(bArr, auxVar);
            }
        }

        static {
            ViolativeContent violativeContent = new ViolativeContent();
            DEFAULT_INSTANCE = violativeContent;
            AbstractC0269h.registerDefaultInstance(ViolativeContent.class, violativeContent);
        }

        private ViolativeContent() {
        }

        public static ViolativeContent getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static ViolativeContent parseDelimitedFrom(InputStream inputStream) {
            return (ViolativeContent) AbstractC0269h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static ViolativeContent parseFrom(ByteBuffer byteBuffer) {
            return (ViolativeContent) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, byteBuffer);
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
                return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0000", null);
            }
            if (iOrdinal == 3) {
                return new ViolativeContent();
            }
            if (iOrdinal == 4) {
                return new Builder(0);
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
            synchronized (ViolativeContent.class) {
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
        public /* bridge */ /* synthetic */ pre0 getDefaultInstanceForType() {
            return getDefaultInstanceForType();
        }

        @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
        public /* bridge */ /* synthetic */ ore0 newBuilderForType() {
            return newBuilderForType();
        }

        @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
        public /* bridge */ /* synthetic */ ore0 toBuilder() {
            return toBuilder();
        }

        public static Builder newBuilder(ViolativeContent violativeContent) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(violativeContent);
        }

        public static ViolativeContent parseDelimitedFrom(InputStream inputStream, aux auxVar) {
            return (ViolativeContent) AbstractC0269h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, auxVar);
        }

        public static ViolativeContent parseFrom(ByteBuffer byteBuffer, aux auxVar) {
            return (ViolativeContent) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, byteBuffer, auxVar);
        }

        public static ViolativeContent parseFrom(gva gvaVar) {
            return (ViolativeContent) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, gvaVar);
        }

        public static ViolativeContent parseFrom(gva gvaVar, aux auxVar) {
            return (ViolativeContent) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, gvaVar, auxVar);
        }

        public static ViolativeContent parseFrom(byte[] bArr) {
            return (ViolativeContent) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static ViolativeContent parseFrom(byte[] bArr, aux auxVar) {
            return (ViolativeContent) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr, auxVar);
        }

        public static ViolativeContent parseFrom(InputStream inputStream) {
            return (ViolativeContent) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static ViolativeContent parseFrom(InputStream inputStream, aux auxVar) {
            return (ViolativeContent) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, inputStream, auxVar);
        }

        public static ViolativeContent parseFrom(owe oweVar) {
            return (ViolativeContent) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, oweVar);
        }

        public static ViolativeContent parseFrom(owe oweVar, aux auxVar) {
            return (ViolativeContent) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, oweVar, auxVar);
        }
    }

    public interface ViolativeContentOrBuilder extends sre0 {
        @Override // p204p.sre0
        /* synthetic */ pre0 getDefaultInstanceForType();

        @Override // p204p.sre0
        /* synthetic */ boolean isInitialized();
    }

    static {
        ErrorReason errorReason = new ErrorReason();
        DEFAULT_INSTANCE = errorReason;
        AbstractC0269h.registerDefaultInstance(ErrorReason.class, errorReason);
    }

    private ErrorReason() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDescription() {
        this.description_ = getDefaultInstance().getDescription();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearE() {
        this.eCase_ = 0;
        this.f3194e_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFailedUser() {
        this.failedUser_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearGroupsNotEnabled() {
        if (this.eCase_ == 11) {
            this.eCase_ = 0;
            this.f3194e_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearJoinLimitExceeded() {
        if (this.eCase_ == 13) {
            this.eCase_ = 0;
            this.f3194e_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLinkExpired() {
        if (this.eCase_ == 5) {
            this.eCase_ = 0;
            this.f3194e_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMemberLimitExceeded() {
        if (this.eCase_ == 12) {
            this.eCase_ = 0;
            this.f3194e_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearNotAnAdmin() {
        if (this.eCase_ == 15) {
            this.eCase_ = 0;
            this.f3194e_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearNotTrusted() {
        if (this.eCase_ == 16) {
            this.eCase_ = 0;
            this.f3194e_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearOptOut() {
        if (this.eCase_ == 3) {
            this.eCase_ = 0;
            this.f3194e_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearParticipationStatus() {
        if (this.eCase_ == 6) {
            this.eCase_ = 0;
            this.f3194e_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRestrictedFromMessaging() {
        if (this.eCase_ == 4) {
            this.eCase_ = 0;
            this.f3194e_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearShouldAssureAge() {
        if (this.eCase_ == 2) {
            this.eCase_ = 0;
            this.f3194e_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTooYoung() {
        if (this.eCase_ == 9) {
            this.eCase_ = 0;
            this.f3194e_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUnreleasedMarket() {
        if (this.eCase_ == 8) {
            this.eCase_ = 0;
            this.f3194e_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUnspecified() {
        if (this.eCase_ == 1) {
            this.eCase_ = 0;
            this.f3194e_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUserBlocked() {
        if (this.eCase_ == 17) {
            this.eCase_ = 0;
            this.f3194e_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearViolativeContent() {
        if (this.eCase_ == 14) {
            this.eCase_ = 0;
            this.f3194e_ = null;
        }
    }

    public static ErrorReason getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeGroupsNotEnabled(GroupsNotEnabled groupsNotEnabled) {
        groupsNotEnabled.getClass();
        if (this.eCase_ != 11 || this.f3194e_ == GroupsNotEnabled.getDefaultInstance()) {
            this.f3194e_ = groupsNotEnabled;
        } else {
            this.f3194e_ = ((GroupsNotEnabled.Builder) GroupsNotEnabled.newBuilder((GroupsNotEnabled) this.f3194e_).mergeFrom((AbstractC0269h) groupsNotEnabled)).buildPartial();
        }
        this.eCase_ = 11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeJoinLimitExceeded(JoinLimitExceeded joinLimitExceeded) {
        joinLimitExceeded.getClass();
        if (this.eCase_ != 13 || this.f3194e_ == JoinLimitExceeded.getDefaultInstance()) {
            this.f3194e_ = joinLimitExceeded;
        } else {
            this.f3194e_ = ((JoinLimitExceeded.Builder) JoinLimitExceeded.newBuilder((JoinLimitExceeded) this.f3194e_).mergeFrom((AbstractC0269h) joinLimitExceeded)).buildPartial();
        }
        this.eCase_ = 13;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeLinkExpired(LinkExpired linkExpired) {
        linkExpired.getClass();
        if (this.eCase_ != 5 || this.f3194e_ == LinkExpired.getDefaultInstance()) {
            this.f3194e_ = linkExpired;
        } else {
            this.f3194e_ = ((LinkExpired.Builder) LinkExpired.newBuilder((LinkExpired) this.f3194e_).mergeFrom((AbstractC0269h) linkExpired)).buildPartial();
        }
        this.eCase_ = 5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeMemberLimitExceeded(MemberLimitExceeded memberLimitExceeded) {
        memberLimitExceeded.getClass();
        if (this.eCase_ != 12 || this.f3194e_ == MemberLimitExceeded.getDefaultInstance()) {
            this.f3194e_ = memberLimitExceeded;
        } else {
            this.f3194e_ = ((MemberLimitExceeded.Builder) MemberLimitExceeded.newBuilder((MemberLimitExceeded) this.f3194e_).mergeFrom((AbstractC0269h) memberLimitExceeded)).buildPartial();
        }
        this.eCase_ = 12;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeNotAnAdmin(NotAnAdmin notAnAdmin) {
        notAnAdmin.getClass();
        if (this.eCase_ != 15 || this.f3194e_ == NotAnAdmin.getDefaultInstance()) {
            this.f3194e_ = notAnAdmin;
        } else {
            this.f3194e_ = ((NotAnAdmin.Builder) NotAnAdmin.newBuilder((NotAnAdmin) this.f3194e_).mergeFrom((AbstractC0269h) notAnAdmin)).buildPartial();
        }
        this.eCase_ = 15;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeNotTrusted(NotTrusted notTrusted) {
        notTrusted.getClass();
        if (this.eCase_ != 16 || this.f3194e_ == NotTrusted.getDefaultInstance()) {
            this.f3194e_ = notTrusted;
        } else {
            this.f3194e_ = ((NotTrusted.Builder) NotTrusted.newBuilder((NotTrusted) this.f3194e_).mergeFrom((AbstractC0269h) notTrusted)).buildPartial();
        }
        this.eCase_ = 16;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeOptOut(OptOut optOut) {
        optOut.getClass();
        if (this.eCase_ != 3 || this.f3194e_ == OptOut.getDefaultInstance()) {
            this.f3194e_ = optOut;
        } else {
            this.f3194e_ = ((OptOut.Builder) OptOut.newBuilder((OptOut) this.f3194e_).mergeFrom((AbstractC0269h) optOut)).buildPartial();
        }
        this.eCase_ = 3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeParticipationStatus(ChatParticipationStatus chatParticipationStatus) {
        chatParticipationStatus.getClass();
        if (this.eCase_ != 6 || this.f3194e_ == ChatParticipationStatus.getDefaultInstance()) {
            this.f3194e_ = chatParticipationStatus;
        } else {
            this.f3194e_ = ((ChatParticipationStatus.Builder) ChatParticipationStatus.newBuilder((ChatParticipationStatus) this.f3194e_).mergeFrom((AbstractC0269h) chatParticipationStatus)).buildPartial();
        }
        this.eCase_ = 6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeRestrictedFromMessaging(RestrictedFromMessaging restrictedFromMessaging) {
        restrictedFromMessaging.getClass();
        if (this.eCase_ != 4 || this.f3194e_ == RestrictedFromMessaging.getDefaultInstance()) {
            this.f3194e_ = restrictedFromMessaging;
        } else {
            this.f3194e_ = ((RestrictedFromMessaging.Builder) RestrictedFromMessaging.newBuilder((RestrictedFromMessaging) this.f3194e_).mergeFrom((AbstractC0269h) restrictedFromMessaging)).buildPartial();
        }
        this.eCase_ = 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeShouldAssureAge(ShouldAssureAge shouldAssureAge) {
        shouldAssureAge.getClass();
        if (this.eCase_ != 2 || this.f3194e_ == ShouldAssureAge.getDefaultInstance()) {
            this.f3194e_ = shouldAssureAge;
        } else {
            this.f3194e_ = ((ShouldAssureAge.Builder) ShouldAssureAge.newBuilder((ShouldAssureAge) this.f3194e_).mergeFrom((AbstractC0269h) shouldAssureAge)).buildPartial();
        }
        this.eCase_ = 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeTooYoung(TooYoung tooYoung) {
        tooYoung.getClass();
        if (this.eCase_ != 9 || this.f3194e_ == TooYoung.getDefaultInstance()) {
            this.f3194e_ = tooYoung;
        } else {
            this.f3194e_ = ((TooYoung.Builder) TooYoung.newBuilder((TooYoung) this.f3194e_).mergeFrom((AbstractC0269h) tooYoung)).buildPartial();
        }
        this.eCase_ = 9;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeUnreleasedMarket(UnreleasedMarket unreleasedMarket) {
        unreleasedMarket.getClass();
        if (this.eCase_ != 8 || this.f3194e_ == UnreleasedMarket.getDefaultInstance()) {
            this.f3194e_ = unreleasedMarket;
        } else {
            this.f3194e_ = ((UnreleasedMarket.Builder) UnreleasedMarket.newBuilder((UnreleasedMarket) this.f3194e_).mergeFrom((AbstractC0269h) unreleasedMarket)).buildPartial();
        }
        this.eCase_ = 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeUnspecified(Unspecified unspecified) {
        unspecified.getClass();
        if (this.eCase_ != 1 || this.f3194e_ == Unspecified.getDefaultInstance()) {
            this.f3194e_ = unspecified;
        } else {
            this.f3194e_ = ((Unspecified.Builder) Unspecified.newBuilder((Unspecified) this.f3194e_).mergeFrom((AbstractC0269h) unspecified)).buildPartial();
        }
        this.eCase_ = 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeUserBlocked(UserBlocked userBlocked) {
        userBlocked.getClass();
        if (this.eCase_ != 17 || this.f3194e_ == UserBlocked.getDefaultInstance()) {
            this.f3194e_ = userBlocked;
        } else {
            this.f3194e_ = ((UserBlocked.Builder) UserBlocked.newBuilder((UserBlocked) this.f3194e_).mergeFrom((AbstractC0269h) userBlocked)).buildPartial();
        }
        this.eCase_ = 17;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeViolativeContent(ViolativeContent violativeContent) {
        violativeContent.getClass();
        if (this.eCase_ != 14 || this.f3194e_ == ViolativeContent.getDefaultInstance()) {
            this.f3194e_ = violativeContent;
        } else {
            this.f3194e_ = ((ViolativeContent.Builder) ViolativeContent.newBuilder((ViolativeContent) this.f3194e_).mergeFrom((AbstractC0269h) violativeContent)).buildPartial();
        }
        this.eCase_ = 14;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static ErrorReason parseDelimitedFrom(InputStream inputStream) {
        return (ErrorReason) AbstractC0269h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ErrorReason parseFrom(ByteBuffer byteBuffer) {
        return (ErrorReason) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDescription(String str) {
        str.getClass();
        this.description_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDescriptionBytes(gva gvaVar) {
        AbstractC2118m8.checkByteStringIsUtf8(gvaVar);
        this.description_ = gvaVar.m45892u();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFailedUser(UserRole userRole) {
        this.failedUser_ = userRole.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFailedUserValue(int i) {
        this.failedUser_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setGroupsNotEnabled(GroupsNotEnabled groupsNotEnabled) {
        groupsNotEnabled.getClass();
        this.f3194e_ = groupsNotEnabled;
        this.eCase_ = 11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setJoinLimitExceeded(JoinLimitExceeded joinLimitExceeded) {
        joinLimitExceeded.getClass();
        this.f3194e_ = joinLimitExceeded;
        this.eCase_ = 13;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLinkExpired(LinkExpired linkExpired) {
        linkExpired.getClass();
        this.f3194e_ = linkExpired;
        this.eCase_ = 5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMemberLimitExceeded(MemberLimitExceeded memberLimitExceeded) {
        memberLimitExceeded.getClass();
        this.f3194e_ = memberLimitExceeded;
        this.eCase_ = 12;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNotAnAdmin(NotAnAdmin notAnAdmin) {
        notAnAdmin.getClass();
        this.f3194e_ = notAnAdmin;
        this.eCase_ = 15;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNotTrusted(NotTrusted notTrusted) {
        notTrusted.getClass();
        this.f3194e_ = notTrusted;
        this.eCase_ = 16;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOptOut(OptOut optOut) {
        optOut.getClass();
        this.f3194e_ = optOut;
        this.eCase_ = 3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setParticipationStatus(ChatParticipationStatus chatParticipationStatus) {
        chatParticipationStatus.getClass();
        this.f3194e_ = chatParticipationStatus;
        this.eCase_ = 6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRestrictedFromMessaging(RestrictedFromMessaging restrictedFromMessaging) {
        restrictedFromMessaging.getClass();
        this.f3194e_ = restrictedFromMessaging;
        this.eCase_ = 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setShouldAssureAge(ShouldAssureAge shouldAssureAge) {
        shouldAssureAge.getClass();
        this.f3194e_ = shouldAssureAge;
        this.eCase_ = 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTooYoung(TooYoung tooYoung) {
        tooYoung.getClass();
        this.f3194e_ = tooYoung;
        this.eCase_ = 9;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUnreleasedMarket(UnreleasedMarket unreleasedMarket) {
        unreleasedMarket.getClass();
        this.f3194e_ = unreleasedMarket;
        this.eCase_ = 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUnspecified(Unspecified unspecified) {
        unspecified.getClass();
        this.f3194e_ = unspecified;
        this.eCase_ = 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUserBlocked(UserBlocked userBlocked) {
        userBlocked.getClass();
        this.f3194e_ = userBlocked;
        this.eCase_ = 17;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setViolativeContent(ViolativeContent violativeContent) {
        violativeContent.getClass();
        this.f3194e_ = violativeContent;
        this.eCase_ = 14;
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0011\u0001\u0000\u0001\u0011\u0011\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000\u0006<\u0000\u0007Ȉ\b<\u0000\t<\u0000\n\f\u000b<\u0000\f<\u0000\r<\u0000\u000e<\u0000\u000f<\u0000\u0010<\u0000\u0011<\u0000", new Object[]{"e_", "eCase_", Unspecified.class, ShouldAssureAge.class, OptOut.class, RestrictedFromMessaging.class, LinkExpired.class, ChatParticipationStatus.class, "description_", UnreleasedMarket.class, TooYoung.class, "failedUser_", GroupsNotEnabled.class, MemberLimitExceeded.class, JoinLimitExceeded.class, ViolativeContent.class, NotAnAdmin.class, NotTrusted.class, UserBlocked.class});
        }
        if (iOrdinal == 3) {
            return new ErrorReason();
        }
        if (iOrdinal == 4) {
            return new Builder(0);
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
        synchronized (ErrorReason.class) {
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
    public /* bridge */ /* synthetic */ pre0 getDefaultInstanceForType() {
        return getDefaultInstanceForType();
    }

    @Override // com.spotify.campfire.datasource.impl.proto.ErrorReasonOrBuilder
    public String getDescription() {
        return this.description_;
    }

    @Override // com.spotify.campfire.datasource.impl.proto.ErrorReasonOrBuilder
    public gva getDescriptionBytes() {
        return gva.m45888f(this.description_);
    }

    @Override // com.spotify.campfire.datasource.impl.proto.ErrorReasonOrBuilder
    public ECase getECase() {
        return ECase.forNumber(this.eCase_);
    }

    @Override // com.spotify.campfire.datasource.impl.proto.ErrorReasonOrBuilder
    public UserRole getFailedUser() {
        UserRole userRoleForNumber = UserRole.forNumber(this.failedUser_);
        return userRoleForNumber == null ? UserRole.UNRECOGNIZED : userRoleForNumber;
    }

    @Override // com.spotify.campfire.datasource.impl.proto.ErrorReasonOrBuilder
    public int getFailedUserValue() {
        return this.failedUser_;
    }

    @Override // com.spotify.campfire.datasource.impl.proto.ErrorReasonOrBuilder
    public GroupsNotEnabled getGroupsNotEnabled() {
        return this.eCase_ == 11 ? (GroupsNotEnabled) this.f3194e_ : GroupsNotEnabled.getDefaultInstance();
    }

    @Override // com.spotify.campfire.datasource.impl.proto.ErrorReasonOrBuilder
    public JoinLimitExceeded getJoinLimitExceeded() {
        return this.eCase_ == 13 ? (JoinLimitExceeded) this.f3194e_ : JoinLimitExceeded.getDefaultInstance();
    }

    @Override // com.spotify.campfire.datasource.impl.proto.ErrorReasonOrBuilder
    public LinkExpired getLinkExpired() {
        return this.eCase_ == 5 ? (LinkExpired) this.f3194e_ : LinkExpired.getDefaultInstance();
    }

    @Override // com.spotify.campfire.datasource.impl.proto.ErrorReasonOrBuilder
    public MemberLimitExceeded getMemberLimitExceeded() {
        return this.eCase_ == 12 ? (MemberLimitExceeded) this.f3194e_ : MemberLimitExceeded.getDefaultInstance();
    }

    @Override // com.spotify.campfire.datasource.impl.proto.ErrorReasonOrBuilder
    public NotAnAdmin getNotAnAdmin() {
        return this.eCase_ == 15 ? (NotAnAdmin) this.f3194e_ : NotAnAdmin.getDefaultInstance();
    }

    @Override // com.spotify.campfire.datasource.impl.proto.ErrorReasonOrBuilder
    public NotTrusted getNotTrusted() {
        return this.eCase_ == 16 ? (NotTrusted) this.f3194e_ : NotTrusted.getDefaultInstance();
    }

    @Override // com.spotify.campfire.datasource.impl.proto.ErrorReasonOrBuilder
    public OptOut getOptOut() {
        return this.eCase_ == 3 ? (OptOut) this.f3194e_ : OptOut.getDefaultInstance();
    }

    @Override // com.spotify.campfire.datasource.impl.proto.ErrorReasonOrBuilder
    public ChatParticipationStatus getParticipationStatus() {
        return this.eCase_ == 6 ? (ChatParticipationStatus) this.f3194e_ : ChatParticipationStatus.getDefaultInstance();
    }

    @Override // com.spotify.campfire.datasource.impl.proto.ErrorReasonOrBuilder
    public RestrictedFromMessaging getRestrictedFromMessaging() {
        return this.eCase_ == 4 ? (RestrictedFromMessaging) this.f3194e_ : RestrictedFromMessaging.getDefaultInstance();
    }

    @Override // com.spotify.campfire.datasource.impl.proto.ErrorReasonOrBuilder
    public ShouldAssureAge getShouldAssureAge() {
        return this.eCase_ == 2 ? (ShouldAssureAge) this.f3194e_ : ShouldAssureAge.getDefaultInstance();
    }

    @Override // com.spotify.campfire.datasource.impl.proto.ErrorReasonOrBuilder
    public TooYoung getTooYoung() {
        return this.eCase_ == 9 ? (TooYoung) this.f3194e_ : TooYoung.getDefaultInstance();
    }

    @Override // com.spotify.campfire.datasource.impl.proto.ErrorReasonOrBuilder
    public UnreleasedMarket getUnreleasedMarket() {
        return this.eCase_ == 8 ? (UnreleasedMarket) this.f3194e_ : UnreleasedMarket.getDefaultInstance();
    }

    @Override // com.spotify.campfire.datasource.impl.proto.ErrorReasonOrBuilder
    public Unspecified getUnspecified() {
        return this.eCase_ == 1 ? (Unspecified) this.f3194e_ : Unspecified.getDefaultInstance();
    }

    @Override // com.spotify.campfire.datasource.impl.proto.ErrorReasonOrBuilder
    public UserBlocked getUserBlocked() {
        return this.eCase_ == 17 ? (UserBlocked) this.f3194e_ : UserBlocked.getDefaultInstance();
    }

    @Override // com.spotify.campfire.datasource.impl.proto.ErrorReasonOrBuilder
    public ViolativeContent getViolativeContent() {
        return this.eCase_ == 14 ? (ViolativeContent) this.f3194e_ : ViolativeContent.getDefaultInstance();
    }

    @Override // com.spotify.campfire.datasource.impl.proto.ErrorReasonOrBuilder
    public boolean hasGroupsNotEnabled() {
        return this.eCase_ == 11;
    }

    @Override // com.spotify.campfire.datasource.impl.proto.ErrorReasonOrBuilder
    public boolean hasJoinLimitExceeded() {
        return this.eCase_ == 13;
    }

    @Override // com.spotify.campfire.datasource.impl.proto.ErrorReasonOrBuilder
    public boolean hasLinkExpired() {
        return this.eCase_ == 5;
    }

    @Override // com.spotify.campfire.datasource.impl.proto.ErrorReasonOrBuilder
    public boolean hasMemberLimitExceeded() {
        return this.eCase_ == 12;
    }

    @Override // com.spotify.campfire.datasource.impl.proto.ErrorReasonOrBuilder
    public boolean hasNotAnAdmin() {
        return this.eCase_ == 15;
    }

    @Override // com.spotify.campfire.datasource.impl.proto.ErrorReasonOrBuilder
    public boolean hasNotTrusted() {
        return this.eCase_ == 16;
    }

    @Override // com.spotify.campfire.datasource.impl.proto.ErrorReasonOrBuilder
    public boolean hasOptOut() {
        return this.eCase_ == 3;
    }

    @Override // com.spotify.campfire.datasource.impl.proto.ErrorReasonOrBuilder
    public boolean hasParticipationStatus() {
        return this.eCase_ == 6;
    }

    @Override // com.spotify.campfire.datasource.impl.proto.ErrorReasonOrBuilder
    public boolean hasRestrictedFromMessaging() {
        return this.eCase_ == 4;
    }

    @Override // com.spotify.campfire.datasource.impl.proto.ErrorReasonOrBuilder
    public boolean hasShouldAssureAge() {
        return this.eCase_ == 2;
    }

    @Override // com.spotify.campfire.datasource.impl.proto.ErrorReasonOrBuilder
    public boolean hasTooYoung() {
        return this.eCase_ == 9;
    }

    @Override // com.spotify.campfire.datasource.impl.proto.ErrorReasonOrBuilder
    public boolean hasUnreleasedMarket() {
        return this.eCase_ == 8;
    }

    @Override // com.spotify.campfire.datasource.impl.proto.ErrorReasonOrBuilder
    public boolean hasUnspecified() {
        return this.eCase_ == 1;
    }

    @Override // com.spotify.campfire.datasource.impl.proto.ErrorReasonOrBuilder
    public boolean hasUserBlocked() {
        return this.eCase_ == 17;
    }

    @Override // com.spotify.campfire.datasource.impl.proto.ErrorReasonOrBuilder
    public boolean hasViolativeContent() {
        return this.eCase_ == 14;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }

    public static Builder newBuilder(ErrorReason errorReason) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(errorReason);
    }

    public static ErrorReason parseDelimitedFrom(InputStream inputStream, aux auxVar) {
        return (ErrorReason) AbstractC0269h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, auxVar);
    }

    public static ErrorReason parseFrom(ByteBuffer byteBuffer, aux auxVar) {
        return (ErrorReason) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, byteBuffer, auxVar);
    }

    public static ErrorReason parseFrom(gva gvaVar) {
        return (ErrorReason) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, gvaVar);
    }

    public static ErrorReason parseFrom(gva gvaVar, aux auxVar) {
        return (ErrorReason) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, gvaVar, auxVar);
    }

    public static ErrorReason parseFrom(byte[] bArr) {
        return (ErrorReason) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ErrorReason parseFrom(byte[] bArr, aux auxVar) {
        return (ErrorReason) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr, auxVar);
    }

    public static ErrorReason parseFrom(InputStream inputStream) {
        return (ErrorReason) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ErrorReason parseFrom(InputStream inputStream, aux auxVar) {
        return (ErrorReason) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, inputStream, auxVar);
    }

    public static ErrorReason parseFrom(owe oweVar) {
        return (ErrorReason) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, oweVar);
    }

    public static ErrorReason parseFrom(owe oweVar, aux auxVar) {
        return (ErrorReason) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, oweVar, auxVar);
    }
}
