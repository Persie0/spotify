package com.spotify.familyviewservice.p066v1;

import com.google.protobuf.AbstractC0269h;
import p204p.ae50;
import p204p.ca10;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes6.dex */
public final class GetRegularMemberDetailsResponse extends AbstractC0269h implements sre0 {
    public static final int ALLOCATIONS_FIELD_NUMBER = 7;
    public static final int ALLOW_EXPLICIT_CONTENT_FIELD_NUMBER = 3;
    public static final int AUDIOBOOK_TOP_UP_URL_FIELD_NUMBER = 9;
    public static final int CAN_CHANGE_EXPLICIT_CONTENT_FIELD_NUMBER = 6;
    public static final int CAN_SET_PARENTAL_CONTROLS_FIELD_NUMBER = 10;
    public static final int CAN_TOP_UP_AUDIOBOOK_HOURS_FIELD_NUMBER = 8;
    public static final int CAN_TRANSITION_FIELD_NUMBER = 5;
    private static final GetRegularMemberDetailsResponse DEFAULT_INSTANCE;
    public static final int IN_TRANSITION_FIELD_NUMBER = 4;
    public static final int MEMBER_ID_FIELD_NUMBER = 1;
    public static final int PARENTAL_CONTROLS_FIELD_NUMBER = 11;
    private static volatile r2n0 PARSER = null;
    public static final int PROFILE_FIELD_NUMBER = 2;
    private boolean allowExplicitContent_;
    private int bitField0_;
    private boolean canChangeExplicitContent_;
    private boolean canSetParentalControls_;
    private boolean canTopUpAudiobookHours_;
    private boolean canTransition_;
    private boolean inTransition_;
    private ParentalControls parentalControls_;
    private MemberProfile profile_;
    private String memberId_ = "";
    private ae50 allocations_ = AbstractC0269h.emptyProtobufList();
    private String audiobookTopUpUrl_ = "";

    static {
        GetRegularMemberDetailsResponse getRegularMemberDetailsResponse = new GetRegularMemberDetailsResponse();
        DEFAULT_INSTANCE = getRegularMemberDetailsResponse;
        AbstractC0269h.registerDefaultInstance(GetRegularMemberDetailsResponse.class, getRegularMemberDetailsResponse);
    }

    private GetRegularMemberDetailsResponse() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u000b\u0000\u0001\u0001\u000b\u000b\u0000\u0001\u0000\u0001Ȉ\u0002ဉ\u0000\u0003\u0007\u0004\u0007\u0005\u0007\u0006\u0007\u0007\u001b\bဇ\u0001\tለ\u0002\n\u0007\u000bဉ\u0003", new Object[]{"bitField0_", "memberId_", "profile_", "allowExplicitContent_", "inTransition_", "canTransition_", "canChangeExplicitContent_", "allocations_", Allocation.class, "canTopUpAudiobookHours_", "audiobookTopUpUrl_", "canSetParentalControls_", "parentalControls_"});
        }
        if (iOrdinal == 3) {
            return new GetRegularMemberDetailsResponse();
        }
        if (iOrdinal == 4) {
            return new ca10(DEFAULT_INSTANCE, 16);
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
        synchronized (GetRegularMemberDetailsResponse.class) {
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

    public final String getMemberId() {
        return this.memberId_;
    }

    /* JADX INFO: renamed from: n */
    public final ae50 m10727n() {
        return this.allocations_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final String m10728o() {
        return this.audiobookTopUpUrl_;
    }

    /* JADX INFO: renamed from: p */
    public final boolean m10729p() {
        return this.canSetParentalControls_;
    }

    /* JADX INFO: renamed from: q */
    public final boolean m10730q() {
        return this.canTopUpAudiobookHours_;
    }

    /* JADX INFO: renamed from: r */
    public final boolean m10731r() {
        return this.canTransition_;
    }

    /* JADX INFO: renamed from: s */
    public final boolean m10732s() {
        return this.inTransition_;
    }

    /* JADX INFO: renamed from: t */
    public final ParentalControls m10733t() {
        ParentalControls parentalControls = this.parentalControls_;
        return parentalControls == null ? ParentalControls.m10749o() : parentalControls;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }

    /* JADX INFO: renamed from: u */
    public final MemberProfile m10734u() {
        MemberProfile memberProfile = this.profile_;
        return memberProfile == null ? MemberProfile.m10748n() : memberProfile;
    }
}
