package com.spotify.familyviewservice.p066v1;

import com.google.protobuf.AbstractC0269h;
import p204p.ae50;
import p204p.i8w0;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes6.dex */
public final class RemoveMemberBenefits extends AbstractC0269h implements sre0 {
    public static final int BENEFITS_FIELD_NUMBER = 3;
    private static final RemoveMemberBenefits DEFAULT_INSTANCE;
    public static final int FOOTER_FIELD_NUMBER = 4;
    public static final int HEADER_FIELD_NUMBER = 2;
    private static volatile r2n0 PARSER = null;
    public static final int PROFILE_FIELD_NUMBER = 1;
    private int bitField0_;
    private MemberProfile profile_;
    private String header_ = "";
    private ae50 benefits_ = AbstractC0269h.emptyProtobufList();
    private String footer_ = "";

    static {
        RemoveMemberBenefits removeMemberBenefits = new RemoveMemberBenefits();
        DEFAULT_INSTANCE = removeMemberBenefits;
        AbstractC0269h.registerDefaultInstance(RemoveMemberBenefits.class, removeMemberBenefits);
    }

    private RemoveMemberBenefits() {
    }

    /* JADX INFO: renamed from: o */
    public static RemoveMemberBenefits m10757o() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ဉ\u0000\u0002Ȉ\u0003Ț\u0004Ȉ", new Object[]{"bitField0_", "profile_", "header_", "benefits_", "footer_"});
        }
        if (iOrdinal == 3) {
            return new RemoveMemberBenefits();
        }
        if (iOrdinal == 4) {
            return new i8w0(DEFAULT_INSTANCE, 3);
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
        synchronized (RemoveMemberBenefits.class) {
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
    public final ae50 m10758n() {
        return this.benefits_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: p */
    public final String m10759p() {
        return this.footer_;
    }

    /* JADX INFO: renamed from: q */
    public final String m10760q() {
        return this.header_;
    }

    /* JADX INFO: renamed from: r */
    public final MemberProfile m10761r() {
        MemberProfile memberProfile = this.profile_;
        return memberProfile == null ? MemberProfile.m10748n() : memberProfile;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
