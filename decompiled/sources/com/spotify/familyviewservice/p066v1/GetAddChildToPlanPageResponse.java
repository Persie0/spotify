package com.spotify.familyviewservice.p066v1;

import com.google.protobuf.AbstractC0269h;
import p204p.ie00;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes6.dex */
public final class GetAddChildToPlanPageResponse extends AbstractC0269h implements sre0 {
    public static final int CHANGE_SECTION_FIELD_NUMBER = 3;
    public static final int CONFIRMATIONMESSAGE_FIELD_NUMBER = 2;
    private static final GetAddChildToPlanPageResponse DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER = null;
    public static final int PROFILE_FIELD_NUMBER = 1;
    public static final int REMAIN_SECTION_FIELD_NUMBER = 4;
    private int bitField0_;
    private ItemizedSection changeSection_;
    private String confirmationMessage_ = "";
    private MemberProfile profile_;
    private ItemizedSection remainSection_;

    static {
        GetAddChildToPlanPageResponse getAddChildToPlanPageResponse = new GetAddChildToPlanPageResponse();
        DEFAULT_INSTANCE = getAddChildToPlanPageResponse;
        AbstractC0269h.registerDefaultInstance(GetAddChildToPlanPageResponse.class, getAddChildToPlanPageResponse);
    }

    private GetAddChildToPlanPageResponse() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002Ȉ\u0003ဉ\u0001\u0004ဉ\u0002", new Object[]{"bitField0_", "profile_", "confirmationMessage_", "changeSection_", "remainSection_"});
        }
        if (iOrdinal == 3) {
            return new GetAddChildToPlanPageResponse();
        }
        if (iOrdinal == 4) {
            return new ie00(DEFAULT_INSTANCE, 23);
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
        synchronized (GetAddChildToPlanPageResponse.class) {
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
    public final ItemizedSection m10707n() {
        ItemizedSection itemizedSection = this.changeSection_;
        return itemizedSection == null ? ItemizedSection.m10744n() : itemizedSection;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final String m10708o() {
        return this.confirmationMessage_;
    }

    /* JADX INFO: renamed from: p */
    public final MemberProfile m10709p() {
        MemberProfile memberProfile = this.profile_;
        return memberProfile == null ? MemberProfile.m10748n() : memberProfile;
    }

    /* JADX INFO: renamed from: q */
    public final ItemizedSection m10710q() {
        ItemizedSection itemizedSection = this.remainSection_;
        return itemizedSection == null ? ItemizedSection.m10744n() : itemizedSection;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
