package com.spotify.kidsview.p092v2.proto;

import com.google.protobuf.AbstractC0269h;
import com.spotify.kidsview.p091v1.proto.AccountType;
import com.spotify.kidsview.p091v1.proto.DeleteAction;
import com.spotify.kidsview.p091v1.proto.GraduationBanner;
import com.spotify.kidsview.p091v1.proto.ManagedAccountProfile;
import com.spotify.kidsview.p091v1.proto.PlanMembership;
import p204p.ae50;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.t910;
import p204p.z110;

/* JADX INFO: loaded from: classes7.dex */
public final class GetManagedAccountDetailsViewResponse extends AbstractC0269h implements sre0 {
    public static final int ACCOUNT_CONTROLS_FIELD_NUMBER = 7;
    public static final int ACCOUNT_FIELD_NUMBER = 2;
    public static final int ACCOUNT_TYPE_FIELD_NUMBER = 1;
    public static final int ADD_ONS_FIELD_NUMBER = 13;
    public static final int DATE_OF_BIRTH_FIELD_NUMBER = 4;
    private static final GetManagedAccountDetailsViewResponse DEFAULT_INSTANCE;
    public static final int DELETE_ACTION_FIELD_NUMBER = 9;
    public static final int EDIT_NAME_ACTION_FIELD_NUMBER = 12;
    public static final int GRADUATION_BANNER_FIELD_NUMBER = 11;
    public static final int LOGIN_OPTIONS_ACTION_FIELD_NUMBER = 5;
    public static final int MANAGE_AUDIOBOOK_LISTENING_ACTION_FIELD_NUMBER = 14;
    public static final int MANAGE_CONTENT_ACTION_FIELD_NUMBER = 6;
    private static volatile r2n0 PARSER = null;
    public static final int PLAN_MEMBERSHIP_FIELD_NUMBER = 8;
    public static final int PROFILE_FIELD_NUMBER = 3;
    public static final int STOP_MANAGING_ACTION_FIELD_NUMBER = 10;
    private AccountControls accountControls_;
    private int accountType_;
    private ManagedAccountIdentifier account_;
    private ae50 addOns_ = AbstractC0269h.emptyProtobufList();
    private int bitField0_;
    private DateOfBirth dateOfBirth_;
    private DeleteAction deleteAction_;
    private EditNameAction editNameAction_;
    private GraduationBanner graduationBanner_;
    private LoginOptionsAction loginOptionsAction_;
    private ManageAudiobookListeningAction manageAudiobookListeningAction_;
    private ManageContentAction manageContentAction_;
    private PlanMembership planMembership_;
    private ManagedAccountProfile profile_;
    private StopManagingAction stopManagingAction_;

    static {
        GetManagedAccountDetailsViewResponse getManagedAccountDetailsViewResponse = new GetManagedAccountDetailsViewResponse();
        DEFAULT_INSTANCE = getManagedAccountDetailsViewResponse;
        AbstractC0269h.registerDefaultInstance(GetManagedAccountDetailsViewResponse.class, getManagedAccountDetailsViewResponse);
    }

    private GetManagedAccountDetailsViewResponse() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u000e\u0000\u0001\u0001\u000e\u000e\u0000\u0001\u0000\u0001\f\u0002ဉ\u0000\u0003ဉ\u0001\u0004ဉ\u0002\u0005ဉ\u0003\u0006ဉ\u0004\u0007ဉ\u0006\bဉ\u0007\tဉ\b\nဉ\t\u000bဉ\n\fဉ\u0005\r\u001b\u000eဉ\u000b", new Object[]{"bitField0_", "accountType_", "account_", "profile_", "dateOfBirth_", "loginOptionsAction_", "manageContentAction_", "accountControls_", "planMembership_", "deleteAction_", "stopManagingAction_", "graduationBanner_", "editNameAction_", "addOns_", AddOn.class, "manageAudiobookListeningAction_"});
        }
        if (iOrdinal == 3) {
            return new GetManagedAccountDetailsViewResponse();
        }
        if (iOrdinal == 4) {
            return new t910(DEFAULT_INSTANCE);
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
        synchronized (GetManagedAccountDetailsViewResponse.class) {
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

    public final AccountType getAccountType() {
        AccountType accountTypeForNumber = AccountType.forNumber(this.accountType_);
        return accountTypeForNumber == null ? AccountType.UNRECOGNIZED : accountTypeForNumber;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.sre0
    public final /* bridge */ /* synthetic */ pre0 getDefaultInstanceForType() {
        return getDefaultInstanceForType();
    }

    public final DeleteAction getDeleteAction() {
        DeleteAction deleteAction = this.deleteAction_;
        return deleteAction == null ? DeleteAction.getDefaultInstance() : deleteAction;
    }

    public final GraduationBanner getGraduationBanner() {
        GraduationBanner graduationBanner = this.graduationBanner_;
        return graduationBanner == null ? GraduationBanner.getDefaultInstance() : graduationBanner;
    }

    public final PlanMembership getPlanMembership() {
        PlanMembership planMembership = this.planMembership_;
        return planMembership == null ? PlanMembership.getDefaultInstance() : planMembership;
    }

    public final ManagedAccountProfile getProfile() {
        ManagedAccountProfile managedAccountProfile = this.profile_;
        return managedAccountProfile == null ? ManagedAccountProfile.getDefaultInstance() : managedAccountProfile;
    }

    public final boolean hasDateOfBirth() {
        return (this.bitField0_ & 4) != 0;
    }

    public final boolean hasDeleteAction() {
        return (this.bitField0_ & 256) != 0;
    }

    public final boolean hasGraduationBanner() {
        return (this.bitField0_ & 1024) != 0;
    }

    public final boolean hasPlanMembership() {
        return (this.bitField0_ & 128) != 0;
    }

    /* JADX INFO: renamed from: n */
    public final ManagedAccountIdentifier m12490n() {
        ManagedAccountIdentifier managedAccountIdentifier = this.account_;
        return managedAccountIdentifier == null ? ManagedAccountIdentifier.m12507p() : managedAccountIdentifier;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final AccountControls m12491o() {
        AccountControls accountControls = this.accountControls_;
        return accountControls == null ? AccountControls.m12474z() : accountControls;
    }

    /* JADX INFO: renamed from: p */
    public final ae50 m12492p() {
        return this.addOns_;
    }

    /* JADX INFO: renamed from: q */
    public final DateOfBirth m12493q() {
        DateOfBirth dateOfBirth = this.dateOfBirth_;
        return dateOfBirth == null ? DateOfBirth.m12487o() : dateOfBirth;
    }

    /* JADX INFO: renamed from: r */
    public final ManageContentAction m12494r() {
        ManageContentAction manageContentAction = this.manageContentAction_;
        return manageContentAction == null ? ManageContentAction.m12504n() : manageContentAction;
    }

    /* JADX INFO: renamed from: s */
    public final boolean m12495s() {
        return (this.bitField0_ & 64) != 0;
    }

    /* JADX INFO: renamed from: t */
    public final boolean m12496t() {
        return (this.bitField0_ & 32) != 0;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }

    /* JADX INFO: renamed from: u */
    public final boolean m12497u() {
        return (this.bitField0_ & 8) != 0;
    }

    /* JADX INFO: renamed from: v */
    public final boolean m12498v() {
        return (this.bitField0_ & 2048) != 0;
    }

    /* JADX INFO: renamed from: w */
    public final boolean m12499w() {
        return (this.bitField0_ & 16) != 0;
    }

    /* JADX INFO: renamed from: x */
    public final boolean m12500x() {
        return (this.bitField0_ & 512) != 0;
    }
}
