package p204p;

import com.spotify.campfire.datasource.impl.proto.ChatEventType;
import com.spotify.campfire.datasource.impl.proto.ContributionPayload;
import com.spotify.campfire.datasource.impl.proto.ErrorReason;
import com.spotify.campfire.datasource.impl.proto.GroupMemberStatus;
import com.spotify.campfire.datasource.impl.proto.HierarchySource;
import com.spotify.campfire.datasource.impl.proto.HierarchyStatus;
import com.spotify.campfire.datasource.impl.proto.HierarchyType;
import com.spotify.campfire.datasource.impl.proto.HierarchyUserParticipationStatus;
import com.spotify.campfire.datasource.impl.proto.HierarchyUserRole;
import com.spotify.campfire.datasource.impl.proto.MessagePayload;
import com.spotify.campfire.datasource.impl.proto.ModerationStatus;
import com.spotify.campfire.datasource.impl.proto.ReceiptType;

/* JADX INFO: loaded from: classes5.dex */
public abstract /* synthetic */ class aob {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f17628a;

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ int[] f17629b;

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ int[] f17630c;

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ int[] f17631d;

    /* JADX INFO: renamed from: e */
    public static final /* synthetic */ int[] f17632e;

    /* JADX INFO: renamed from: f */
    public static final /* synthetic */ int[] f17633f;

    /* JADX INFO: renamed from: g */
    public static final /* synthetic */ int[] f17634g;

    /* JADX INFO: renamed from: h */
    public static final /* synthetic */ int[] f17635h;

    /* JADX INFO: renamed from: i */
    public static final /* synthetic */ int[] f17636i;

    /* JADX INFO: renamed from: j */
    public static final /* synthetic */ int[] f17637j;

    /* JADX INFO: renamed from: k */
    public static final /* synthetic */ int[] f17638k;

    /* JADX INFO: renamed from: l */
    public static final /* synthetic */ int[] f17639l;

    static {
        int[] iArr = new int[MessagePayload.CmpCase.values().length];
        try {
            iArr[MessagePayload.CmpCase.ACTIVITY_PAYLOAD.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[MessagePayload.CmpCase.CONTRIBUTION_PAYLOAD.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[MessagePayload.CmpCase.CMP_NOT_SET.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f17628a = iArr;
        int[] iArr2 = new int[HierarchyType.values().length];
        try {
            iArr2[HierarchyType.HIERARCHY_TYPE_DM.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[HierarchyType.HIERARCHY_TYPE_GROUP.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[HierarchyType.UNRECOGNIZED.ordinal()] = 3;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[HierarchyType.HIERARCHY_TYPE_UNSPECIFIED.ordinal()] = 4;
        } catch (NoSuchFieldError unused7) {
        }
        f17629b = iArr2;
        int[] iArr3 = new int[HierarchySource.values().length];
        try {
            iArr3[HierarchySource.UNRECOGNIZED.ordinal()] = 1;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr3[HierarchySource.HIERARCHY_SOURCE_UNSPECIFIED.ordinal()] = 2;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr3[HierarchySource.HIERARCHY_SOURCE_USER_CREATED.ordinal()] = 3;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr3[HierarchySource.HIERARCHY_SOURCE_IN_APP_SHARE.ordinal()] = 4;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            iArr3[HierarchySource.HIERARCHY_SOURCE_OFF_PLATFORM_SHARE.ordinal()] = 5;
        } catch (NoSuchFieldError unused12) {
        }
        try {
            iArr3[HierarchySource.HIERARCHY_SOURCE_CHAT_INVITE.ordinal()] = 6;
        } catch (NoSuchFieldError unused13) {
        }
        try {
            iArr3[HierarchySource.HIERARCHY_SOURCE_FRIEND_REQUEST.ordinal()] = 7;
        } catch (NoSuchFieldError unused14) {
        }
        f17630c = iArr3;
        int[] iArr4 = new int[HierarchyStatus.values().length];
        try {
            iArr4[HierarchyStatus.HIERARCHY_STATUS_BLOCKED.ordinal()] = 1;
        } catch (NoSuchFieldError unused15) {
        }
        try {
            iArr4[HierarchyStatus.HIERARCHY_STATUS_UNSPECIFIED.ordinal()] = 2;
        } catch (NoSuchFieldError unused16) {
        }
        try {
            iArr4[HierarchyStatus.UNRECOGNIZED.ordinal()] = 3;
        } catch (NoSuchFieldError unused17) {
        }
        try {
            iArr4[HierarchyStatus.HIERARCHY_STATUS_INACTIVE.ordinal()] = 4;
        } catch (NoSuchFieldError unused18) {
        }
        try {
            iArr4[HierarchyStatus.HIERARCHY_STATUS_DRAFT.ordinal()] = 5;
        } catch (NoSuchFieldError unused19) {
        }
        try {
            iArr4[HierarchyStatus.HIERARCHY_STATUS_ACTIVE.ordinal()] = 6;
        } catch (NoSuchFieldError unused20) {
        }
        try {
            iArr4[HierarchyStatus.HIERARCHY_STATUS_CANCELED.ordinal()] = 7;
        } catch (NoSuchFieldError unused21) {
        }
        try {
            iArr4[HierarchyStatus.HIERARCHY_STATUS_DELETED.ordinal()] = 8;
        } catch (NoSuchFieldError unused22) {
        }
        try {
            iArr4[HierarchyStatus.HIERARCHY_STATUS_REJECTED.ordinal()] = 9;
        } catch (NoSuchFieldError unused23) {
        }
        f17631d = iArr4;
        int[] iArr5 = new int[HierarchyUserParticipationStatus.values().length];
        try {
            iArr5[HierarchyUserParticipationStatus.HIERARCHY_USER_PARTICIPATION_STATUS_INITIATOR.ordinal()] = 1;
        } catch (NoSuchFieldError unused24) {
        }
        try {
            iArr5[HierarchyUserParticipationStatus.HIERARCHY_USER_PARTICIPATION_STATUS_ACCEPTED.ordinal()] = 2;
        } catch (NoSuchFieldError unused25) {
        }
        try {
            iArr5[HierarchyUserParticipationStatus.HIERARCHY_USER_PARTICIPATION_STATUS_PENDING.ordinal()] = 3;
        } catch (NoSuchFieldError unused26) {
        }
        try {
            iArr5[HierarchyUserParticipationStatus.HIERARCHY_USER_PARTICIPATION_STATUS_REJECTED.ordinal()] = 4;
        } catch (NoSuchFieldError unused27) {
        }
        try {
            iArr5[HierarchyUserParticipationStatus.HIERARCHY_USER_PARTICIPATION_STATUS_DELETED.ordinal()] = 5;
        } catch (NoSuchFieldError unused28) {
        }
        try {
            iArr5[HierarchyUserParticipationStatus.HIERARCHY_USER_PARTICIPATION_STATUS_LEFT.ordinal()] = 6;
        } catch (NoSuchFieldError unused29) {
        }
        try {
            iArr5[HierarchyUserParticipationStatus.HIERARCHY_USER_PARTICIPATION_STATUS_BLOCKED.ordinal()] = 7;
        } catch (NoSuchFieldError unused30) {
        }
        try {
            iArr5[HierarchyUserParticipationStatus.HIERARCHY_USER_PARTICIPATION_STATUS_UNSPECIFIED.ordinal()] = 8;
        } catch (NoSuchFieldError unused31) {
        }
        try {
            iArr5[HierarchyUserParticipationStatus.UNRECOGNIZED.ordinal()] = 9;
        } catch (NoSuchFieldError unused32) {
        }
        f17632e = iArr5;
        int[] iArr6 = new int[HierarchyUserRole.values().length];
        try {
            iArr6[HierarchyUserRole.HIERARCHY_USER_ROLE_ADMIN.ordinal()] = 1;
        } catch (NoSuchFieldError unused33) {
        }
        try {
            iArr6[HierarchyUserRole.UNRECOGNIZED.ordinal()] = 2;
        } catch (NoSuchFieldError unused34) {
        }
        try {
            iArr6[HierarchyUserRole.HIERARCHY_USER_ROLE_MEMBER.ordinal()] = 3;
        } catch (NoSuchFieldError unused35) {
        }
        try {
            iArr6[HierarchyUserRole.HIERARCHY_USER_ROLE_UNSPECIFIED.ordinal()] = 4;
        } catch (NoSuchFieldError unused36) {
        }
        f17633f = iArr6;
        int[] iArr7 = new int[GroupMemberStatus.values().length];
        try {
            iArr7[GroupMemberStatus.OPTED_OUT.ordinal()] = 1;
        } catch (NoSuchFieldError unused37) {
        }
        try {
            iArr7[GroupMemberStatus.PENDING.ordinal()] = 2;
        } catch (NoSuchFieldError unused38) {
        }
        try {
            iArr7[GroupMemberStatus.LEFT.ordinal()] = 3;
        } catch (NoSuchFieldError unused39) {
        }
        try {
            iArr7[GroupMemberStatus.UNSPECIFIED.ordinal()] = 4;
        } catch (NoSuchFieldError unused40) {
        }
        try {
            iArr7[GroupMemberStatus.UNRECOGNIZED.ordinal()] = 5;
        } catch (NoSuchFieldError unused41) {
        }
        f17634g = iArr7;
        int[] iArr8 = new int[ModerationStatus.StatusCase.values().length];
        try {
            iArr8[ModerationStatus.StatusCase.REPORTED.ordinal()] = 1;
        } catch (NoSuchFieldError unused42) {
        }
        try {
            iArr8[ModerationStatus.StatusCase.REMOVED.ordinal()] = 2;
        } catch (NoSuchFieldError unused43) {
        }
        try {
            iArr8[ModerationStatus.StatusCase.HIDDEN.ordinal()] = 3;
        } catch (NoSuchFieldError unused44) {
        }
        try {
            iArr8[ModerationStatus.StatusCase.DELETED_FOR_USER.ordinal()] = 4;
        } catch (NoSuchFieldError unused45) {
        }
        try {
            iArr8[ModerationStatus.StatusCase.DELETED_FOR_ALL.ordinal()] = 5;
        } catch (NoSuchFieldError unused46) {
        }
        f17635h = iArr8;
        int[] iArr9 = new int[ContributionPayload.CcpCase.values().length];
        try {
            iArr9[ContributionPayload.CcpCase.FREE_TEXT.ordinal()] = 1;
        } catch (NoSuchFieldError unused47) {
        }
        try {
            iArr9[ContributionPayload.CcpCase.TRACKED_SHARE.ordinal()] = 2;
        } catch (NoSuchFieldError unused48) {
        }
        try {
            iArr9[ContributionPayload.CcpCase.OP_TRACKED_SHARE.ordinal()] = 3;
        } catch (NoSuchFieldError unused49) {
        }
        try {
            iArr9[ContributionPayload.CcpCase.CHAT_INVITE.ordinal()] = 4;
        } catch (NoSuchFieldError unused50) {
        }
        try {
            iArr9[ContributionPayload.CcpCase.CHAT_EVENT.ordinal()] = 5;
        } catch (NoSuchFieldError unused51) {
        }
        try {
            iArr9[ContributionPayload.CcpCase.RICH_MEDIA.ordinal()] = 6;
        } catch (NoSuchFieldError unused52) {
        }
        try {
            iArr9[ContributionPayload.CcpCase.CCP_NOT_SET.ordinal()] = 7;
        } catch (NoSuchFieldError unused53) {
        }
        f17636i = iArr9;
        int[] iArr10 = new int[ChatEventType.CetCase.values().length];
        try {
            iArr10[ChatEventType.CetCase.CREATE_EVENT.ordinal()] = 1;
        } catch (NoSuchFieldError unused54) {
        }
        try {
            iArr10[ChatEventType.CetCase.USER_INVITE.ordinal()] = 2;
        } catch (NoSuchFieldError unused55) {
        }
        try {
            iArr10[ChatEventType.CetCase.REMOVE_USER.ordinal()] = 3;
        } catch (NoSuchFieldError unused56) {
        }
        try {
            iArr10[ChatEventType.CetCase.JOIN_EVENT.ordinal()] = 4;
        } catch (NoSuchFieldError unused57) {
        }
        try {
            iArr10[ChatEventType.CetCase.LEAVE_EVENT.ordinal()] = 5;
        } catch (NoSuchFieldError unused58) {
        }
        try {
            iArr10[ChatEventType.CetCase.NAME_CHANGE.ordinal()] = 6;
        } catch (NoSuchFieldError unused59) {
        }
        try {
            iArr10[ChatEventType.CetCase.NEW_ADMIN_EVENT.ordinal()] = 7;
        } catch (NoSuchFieldError unused60) {
        }
        try {
            iArr10[ChatEventType.CetCase.PHOTO_CHANGE.ordinal()] = 8;
        } catch (NoSuchFieldError unused61) {
        }
        try {
            iArr10[ChatEventType.CetCase.INVITE_LINK.ordinal()] = 9;
        } catch (NoSuchFieldError unused62) {
        }
        try {
            iArr10[ChatEventType.CetCase.CET_NOT_SET.ordinal()] = 10;
        } catch (NoSuchFieldError unused63) {
        }
        try {
            iArr10[ChatEventType.CetCase.REPORT_CHAT_EVENT.ordinal()] = 11;
        } catch (NoSuchFieldError unused64) {
        }
        f17637j = iArr10;
        int[] iArr11 = new int[ReceiptType.values().length];
        try {
            iArr11[ReceiptType.RECEIPT_TYPE_PLAYED.ordinal()] = 1;
        } catch (NoSuchFieldError unused65) {
        }
        try {
            iArr11[ReceiptType.RECEIPT_TYPE_SAVED.ordinal()] = 2;
        } catch (NoSuchFieldError unused66) {
        }
        try {
            iArr11[ReceiptType.RECEIPT_TYPE_SEEN.ordinal()] = 3;
        } catch (NoSuchFieldError unused67) {
        }
        try {
            iArr11[ReceiptType.RECEIPT_TYPE_UNDEFINED.ordinal()] = 4;
        } catch (NoSuchFieldError unused68) {
        }
        try {
            iArr11[ReceiptType.UNRECOGNIZED.ordinal()] = 5;
        } catch (NoSuchFieldError unused69) {
        }
        f17638k = iArr11;
        int[] iArr12 = new int[ErrorReason.ECase.values().length];
        try {
            iArr12[ErrorReason.ECase.TOO_YOUNG.ordinal()] = 1;
        } catch (NoSuchFieldError unused70) {
        }
        try {
            iArr12[ErrorReason.ECase.SHOULD_ASSURE_AGE.ordinal()] = 2;
        } catch (NoSuchFieldError unused71) {
        }
        try {
            iArr12[ErrorReason.ECase.OPT_OUT.ordinal()] = 3;
        } catch (NoSuchFieldError unused72) {
        }
        try {
            iArr12[ErrorReason.ECase.RESTRICTED_FROM_MESSAGING.ordinal()] = 4;
        } catch (NoSuchFieldError unused73) {
        }
        try {
            iArr12[ErrorReason.ECase.LINK_EXPIRED.ordinal()] = 5;
        } catch (NoSuchFieldError unused74) {
        }
        try {
            iArr12[ErrorReason.ECase.UNRELEASED_MARKET.ordinal()] = 6;
        } catch (NoSuchFieldError unused75) {
        }
        try {
            iArr12[ErrorReason.ECase.MEMBER_LIMIT_EXCEEDED.ordinal()] = 7;
        } catch (NoSuchFieldError unused76) {
        }
        try {
            iArr12[ErrorReason.ECase.PARTICIPATION_STATUS.ordinal()] = 8;
        } catch (NoSuchFieldError unused77) {
        }
        try {
            iArr12[ErrorReason.ECase.UNSPECIFIED.ordinal()] = 9;
        } catch (NoSuchFieldError unused78) {
        }
        try {
            iArr12[ErrorReason.ECase.GROUPS_NOT_ENABLED.ordinal()] = 10;
        } catch (NoSuchFieldError unused79) {
        }
        try {
            iArr12[ErrorReason.ECase.JOIN_LIMIT_EXCEEDED.ordinal()] = 11;
        } catch (NoSuchFieldError unused80) {
        }
        try {
            iArr12[ErrorReason.ECase.VIOLATIVE_CONTENT.ordinal()] = 12;
        } catch (NoSuchFieldError unused81) {
        }
        try {
            iArr12[ErrorReason.ECase.NOT_AN_ADMIN.ordinal()] = 13;
        } catch (NoSuchFieldError unused82) {
        }
        try {
            iArr12[ErrorReason.ECase.NOT_TRUSTED.ordinal()] = 14;
        } catch (NoSuchFieldError unused83) {
        }
        try {
            iArr12[ErrorReason.ECase.USER_BLOCKED.ordinal()] = 15;
        } catch (NoSuchFieldError unused84) {
        }
        try {
            iArr12[ErrorReason.ECase.E_NOT_SET.ordinal()] = 16;
        } catch (NoSuchFieldError unused85) {
        }
        f17639l = iArr12;
    }
}
