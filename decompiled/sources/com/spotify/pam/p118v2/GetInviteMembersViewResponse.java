package com.spotify.pam.p118v2;

import com.google.protobuf.AbstractC0269h;
import p204p.k810;
import p204p.ore0;
import p204p.pco0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes9.dex */
public final class GetInviteMembersViewResponse extends AbstractC0269h implements sre0 {
    public static final int ADD_KID_ACTION_SUBTITLE_FIELD_NUMBER = 11;
    public static final int ADD_KID_ACTION_TITLE_FIELD_NUMBER = 10;
    public static final int CAN_ADD_KIDS_FIELD_NUMBER = 9;
    public static final int COLOR_FIELD_NUMBER = 1;
    private static final GetInviteMembersViewResponse DEFAULT_INSTANCE;
    public static final int HEADER_IMAGE_URL_FIELD_NUMBER = 3;
    public static final int HEADER_TITLE_FIELD_NUMBER = 4;
    public static final int INVITE_LINK_FIELD_NUMBER = 5;
    public static final int INVITE_MEMBERS_ACTION_SUBTITLE_FIELD_NUMBER = 7;
    public static final int INVITE_MEMBERS_ACTION_TITLE_FIELD_NUMBER = 6;
    public static final int PAGE_TITLE_FIELD_NUMBER = 2;
    private static volatile r2n0 PARSER = null;
    public static final int PLAN_TYPE_FIELD_NUMBER = 12;
    public static final int SHARE_CONTEXT_FIELD_NUMBER = 8;
    private int bitField0_;
    private boolean canAddKids_;
    private int planType_;
    private ShareContext shareContext_;
    private String color_ = "";
    private String pageTitle_ = "";
    private String headerImageUrl_ = "";
    private String headerTitle_ = "";
    private String inviteLink_ = "";
    private String inviteMembersActionTitle_ = "";
    private String inviteMembersActionSubtitle_ = "";
    private String addKidActionTitle_ = "";
    private String addKidActionSubtitle_ = "";

    static {
        GetInviteMembersViewResponse getInviteMembersViewResponse = new GetInviteMembersViewResponse();
        DEFAULT_INSTANCE = getInviteMembersViewResponse;
        AbstractC0269h.registerDefaultInstance(GetInviteMembersViewResponse.class, getInviteMembersViewResponse);
    }

    private GetInviteMembersViewResponse() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\f\u0000\u0001\u0001\f\f\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004Ȉ\u0005Ȉ\u0006Ȉ\u0007Ȉ\bဉ\u0000\t\u0007\nȈ\u000bȈ\f\f", new Object[]{"bitField0_", "color_", "pageTitle_", "headerImageUrl_", "headerTitle_", "inviteLink_", "inviteMembersActionTitle_", "inviteMembersActionSubtitle_", "shareContext_", "canAddKids_", "addKidActionTitle_", "addKidActionSubtitle_", "planType_"});
        }
        if (iOrdinal == 3) {
            return new GetInviteMembersViewResponse();
        }
        if (iOrdinal == 4) {
            return new k810(DEFAULT_INSTANCE, 13);
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
        synchronized (GetInviteMembersViewResponse.class) {
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
    public final String m16486n() {
        return this.addKidActionSubtitle_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final String m16487o() {
        return this.addKidActionTitle_;
    }

    /* JADX INFO: renamed from: p */
    public final boolean m16488p() {
        return this.canAddKids_;
    }

    /* JADX INFO: renamed from: q */
    public final String m16489q() {
        return this.color_;
    }

    /* JADX INFO: renamed from: r */
    public final String m16490r() {
        return this.headerImageUrl_;
    }

    /* JADX INFO: renamed from: s */
    public final String m16491s() {
        return this.headerTitle_;
    }

    /* JADX INFO: renamed from: t */
    public final String m16492t() {
        return this.inviteLink_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }

    /* JADX INFO: renamed from: u */
    public final String m16493u() {
        return this.inviteMembersActionSubtitle_;
    }

    /* JADX INFO: renamed from: v */
    public final String m16494v() {
        return this.inviteMembersActionTitle_;
    }

    /* JADX INFO: renamed from: w */
    public final pco0 m16495w() {
        pco0 pco0VarM69598a = pco0.m69598a(this.planType_);
        return pco0VarM69598a == null ? pco0.UNRECOGNIZED : pco0VarM69598a;
    }

    /* JADX INFO: renamed from: x */
    public final ShareContext m16496x() {
        ShareContext shareContext = this.shareContext_;
        return shareContext == null ? ShareContext.m16594n() : shareContext;
    }
}
