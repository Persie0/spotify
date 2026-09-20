package com.spotify.familyviewservice.p066v1;

import com.google.protobuf.AbstractC0269h;
import p204p.k810;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes6.dex */
public final class GetMemberDetailsResponse extends AbstractC0269h implements sre0 {
    private static final GetMemberDetailsResponse DEFAULT_INSTANCE;
    public static final int GEN_ALPHA_MANAGED_FIELD_NUMBER = 3;
    public static final int LEGACY_MANAGED_FIELD_NUMBER = 4;
    public static final int MEMBER_ID_FIELD_NUMBER = 1;
    private static volatile r2n0 PARSER = null;
    public static final int PLAN_CAPACITY_FIELD_NUMBER = 11;
    public static final int PLAN_NAME_FIELD_NUMBER = 10;
    public static final int REMOVE_ACCOUNT_URL_FIELD_NUMBER = 12;
    public static final int SELF_MANAGED_FIELD_NUMBER = 2;
    private int bitField0_;
    private Object pageData_;
    private int planCapacity_;
    private int pageDataCase_ = 0;
    private String memberId_ = "";
    private String planName_ = "";
    private String removeAccountUrl_ = "";

    static {
        GetMemberDetailsResponse getMemberDetailsResponse = new GetMemberDetailsResponse();
        DEFAULT_INSTANCE = getMemberDetailsResponse;
        AbstractC0269h.registerDefaultInstance(GetMemberDetailsResponse.class, getMemberDetailsResponse);
    }

    private GetMemberDetailsResponse() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0007\u0001\u0001\u0001\f\u0007\u0000\u0000\u0000\u0001Ȉ\u0002<\u0000\u0003<\u0000\u0004<\u0000\nȈ\u000b\u0004\fለ\u0000", new Object[]{"pageData_", "pageDataCase_", "bitField0_", "memberId_", SelfManaged.class, GenAlphaManaged.class, LegacyManaged.class, "planName_", "planCapacity_", "removeAccountUrl_"});
        }
        if (iOrdinal == 3) {
            return new GetMemberDetailsResponse();
        }
        if (iOrdinal == 4) {
            return new k810(DEFAULT_INSTANCE, 22);
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
        synchronized (GetMemberDetailsResponse.class) {
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

    public final String getPlanName() {
        return this.planName_;
    }

    /* JADX INFO: renamed from: n */
    public final GenAlphaManaged m10714n() {
        return this.pageDataCase_ == 3 ? (GenAlphaManaged) this.pageData_ : GenAlphaManaged.m10695n();
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final LegacyManaged m10715o() {
        return this.pageDataCase_ == 4 ? (LegacyManaged) this.pageData_ : LegacyManaged.m10745n();
    }

    /* JADX INFO: renamed from: p */
    public final int m10716p() {
        int i = this.pageDataCase_;
        if (i == 0) {
            return 4;
        }
        if (i == 2) {
            return 1;
        }
        if (i != 3) {
            return i != 4 ? 0 : 3;
        }
        return 2;
    }

    /* JADX INFO: renamed from: q */
    public final int m10717q() {
        return this.planCapacity_;
    }

    /* JADX INFO: renamed from: r */
    public final String m10718r() {
        return this.removeAccountUrl_;
    }

    /* JADX INFO: renamed from: s */
    public final SelfManaged m10719s() {
        return this.pageDataCase_ == 2 ? (SelfManaged) this.pageData_ : SelfManaged.m10769t();
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
