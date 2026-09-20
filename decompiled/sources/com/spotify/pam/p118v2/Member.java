package com.spotify.pam.p118v2;

import com.google.protobuf.AbstractC0269h;
import p204p.dbd0;
import p204p.jfe0;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes9.dex */
public final class Member extends AbstractC0269h implements sre0 {
    public static final int CHILD_DETAILS_URI_FIELD_NUMBER = 12;
    public static final int CHILD_ID_FIELD_NUMBER = 7;
    public static final int COLOR_SET_FIELD_NUMBER = 9;
    private static final Member DEFAULT_INSTANCE;
    public static final int DESCRIPTION_FIELD_NUMBER = 3;
    public static final int EXPIRATION_DESCRIPTION_FIELD_NUMBER = 11;
    public static final int IMAGE_URI_FIELD_NUMBER = 4;
    public static final int IS_CURRENT_MEMBER_FIELD_NUMBER = 1;
    public static final int MEMBER_DETAILS_URI_FIELD_NUMBER = 8;
    public static final int MEMBER_TYPE_FIELD_NUMBER = 5;
    public static final int NAME_FIELD_NUMBER = 2;
    private static volatile r2n0 PARSER = null;
    public static final int REGULAR_MEMBER_DETAILS_URI_FIELD_NUMBER = 13;
    public static final int REMOVE_MEMBER_URI_FIELD_NUMBER = 6;
    private int bitField0_;
    private boolean isCurrentMember_;
    private int memberType_;
    private String name_ = "";
    private String description_ = "";
    private String imageUri_ = "";
    private String removeMemberUri_ = "";
    private String childId_ = "";
    private String memberDetailsUri_ = "";
    private String colorSet_ = "";
    private String expirationDescription_ = "";
    private String childDetailsUri_ = "";
    private String regularMemberDetailsUri_ = "";

    static {
        Member member = new Member();
        DEFAULT_INSTANCE = member;
        AbstractC0269h.registerDefaultInstance(Member.class, member);
    }

    private Member() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\f\u0000\u0001\u0001\r\f\u0000\u0000\u0000\u0001\u0007\u0002Ȉ\u0003Ȉ\u0004Ȉ\u0005\f\u0006Ȉ\u0007Ȉ\bȈ\tȈ\u000bለ\u0000\fለ\u0001\rለ\u0002", new Object[]{"bitField0_", "isCurrentMember_", "name_", "description_", "imageUri_", "memberType_", "removeMemberUri_", "childId_", "memberDetailsUri_", "colorSet_", "expirationDescription_", "childDetailsUri_", "regularMemberDetailsUri_"});
        }
        if (iOrdinal == 3) {
            return new Member();
        }
        if (iOrdinal == 4) {
            return new dbd0(DEFAULT_INSTANCE, 4);
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
        synchronized (Member.class) {
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

    public final String getChildId() {
        return this.childId_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.sre0
    public final /* bridge */ /* synthetic */ pre0 getDefaultInstanceForType() {
        return getDefaultInstanceForType();
    }

    public final String getDescription() {
        return this.description_;
    }

    public final String getName() {
        return this.name_;
    }

    /* JADX INFO: renamed from: n */
    public final String m16527n() {
        return this.childDetailsUri_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final String m16528o() {
        return this.expirationDescription_;
    }

    /* JADX INFO: renamed from: p */
    public final String m16529p() {
        return this.imageUri_;
    }

    /* JADX INFO: renamed from: q */
    public final boolean m16530q() {
        return this.isCurrentMember_;
    }

    /* JADX INFO: renamed from: r */
    public final String m16531r() {
        return this.memberDetailsUri_;
    }

    /* JADX INFO: renamed from: s */
    public final jfe0 m16532s() {
        jfe0 jfe0Var;
        int i = this.memberType_;
        if (i == 0) {
            jfe0Var = jfe0.MEMBER;
        } else if (i == 1) {
            jfe0Var = jfe0.MANAGER;
        } else if (i != 2) {
            jfe0Var = i != 3 ? null : jfe0.KID_V2;
        } else {
            jfe0Var = jfe0.KID;
        }
        return jfe0Var == null ? jfe0.UNRECOGNIZED : jfe0Var;
    }

    /* JADX INFO: renamed from: t */
    public final String m16533t() {
        return this.regularMemberDetailsUri_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }

    /* JADX INFO: renamed from: u */
    public final String m16534u() {
        return this.removeMemberUri_;
    }
}
