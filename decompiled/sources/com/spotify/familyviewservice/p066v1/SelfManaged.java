package com.spotify.familyviewservice.p066v1;

import com.google.protobuf.AbstractC0269h;
import p204p.ae50;
import p204p.h8z0;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes6.dex */
public final class SelfManaged extends AbstractC0269h implements sre0 {
    public static final int ALLOCATIONS_FIELD_NUMBER = 10;
    public static final int ALLOW_EXPLICIT_CONTENT_FIELD_NUMBER = 3;
    public static final int AUDIOBOOK_TOP_UP_URL_FIELD_NUMBER = 8;
    public static final int CAN_CHANGE_EXPLICIT_CONTENT_FIELD_NUMBER = 6;
    public static final int CAN_SET_PARENTAL_CONTROLS_FIELD_NUMBER = 12;
    public static final int CAN_TOP_UP_AUDIOBOOK_HOURS_FIELD_NUMBER = 7;
    public static final int CAN_TRANSITION_FIELD_NUMBER = 5;
    private static final SelfManaged DEFAULT_INSTANCE;
    public static final int IN_TRANSITION_FIELD_NUMBER = 4;
    public static final int IS_EXPIRING_FIELD_NUMBER = 11;
    public static final int PARENTAL_CONTROLS_FIELD_NUMBER = 13;
    private static volatile r2n0 PARSER = null;
    public static final int PROFILE_FIELD_NUMBER = 2;
    public static final int USERNAME_FIELD_NUMBER = 1;
    private boolean allowExplicitContent_;
    private int bitField0_;
    private boolean canChangeExplicitContent_;
    private boolean canSetParentalControls_;
    private boolean canTopUpAudiobookHours_;
    private boolean canTransition_;
    private boolean inTransition_;
    private boolean isExpiring_;
    private ParentalControls parentalControls_;
    private MemberProfile profile_;
    private String username_ = "";
    private String audiobookTopUpUrl_ = "";
    private ae50 allocations_ = AbstractC0269h.emptyProtobufList();

    static {
        SelfManaged selfManaged = new SelfManaged();
        DEFAULT_INSTANCE = selfManaged;
        AbstractC0269h.registerDefaultInstance(SelfManaged.class, selfManaged);
    }

    private SelfManaged() {
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: t */
    public static SelfManaged m10769t() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\f\u0000\u0001\u0001\r\f\u0000\u0001\u0000\u0001Ȉ\u0002ဉ\u0000\u0003\u0007\u0004\u0007\u0005\u0007\u0006\u0007\u0007ဇ\u0001\bለ\u0002\n\u001b\u000bဇ\u0003\f\u0007\rဉ\u0004", new Object[]{"bitField0_", "username_", "profile_", "allowExplicitContent_", "inTransition_", "canTransition_", "canChangeExplicitContent_", "canTopUpAudiobookHours_", "audiobookTopUpUrl_", "allocations_", Allocation.class, "isExpiring_", "canSetParentalControls_", "parentalControls_"});
        }
        if (iOrdinal == 3) {
            return new SelfManaged();
        }
        if (iOrdinal == 4) {
            return new h8z0(DEFAULT_INSTANCE, 10);
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
        synchronized (SelfManaged.class) {
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

    public final boolean getAllowExplicitContent() {
        return this.allowExplicitContent_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.sre0
    public final /* bridge */ /* synthetic */ pre0 getDefaultInstanceForType() {
        return getDefaultInstanceForType();
    }

    public final boolean getIsExpiring() {
        return this.isExpiring_;
    }

    public final String getUsername() {
        return this.username_;
    }

    /* JADX INFO: renamed from: n */
    public final ae50 m10770n() {
        return this.allocations_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final String m10771o() {
        return this.audiobookTopUpUrl_;
    }

    /* JADX INFO: renamed from: p */
    public final boolean m10772p() {
        return this.canChangeExplicitContent_;
    }

    /* JADX INFO: renamed from: q */
    public final boolean m10773q() {
        return this.canSetParentalControls_;
    }

    /* JADX INFO: renamed from: r */
    public final boolean m10774r() {
        return this.canTopUpAudiobookHours_;
    }

    /* JADX INFO: renamed from: s */
    public final boolean m10775s() {
        return this.canTransition_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }

    /* JADX INFO: renamed from: u */
    public final boolean m10776u() {
        return this.inTransition_;
    }

    /* JADX INFO: renamed from: v */
    public final MemberProfile m10777v() {
        MemberProfile memberProfile = this.profile_;
        return memberProfile == null ? MemberProfile.m10748n() : memberProfile;
    }
}
