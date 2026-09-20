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
public final class GenAlphaManaged extends AbstractC0269h implements sre0 {
    public static final int ALLOW_CONNECT_FIELD_NUMBER = 5;
    public static final int ALLOW_EXPLICIT_CONTENT_FIELD_NUMBER = 3;
    public static final int ALLOW_VIDEO_FIELD_NUMBER = 4;
    public static final int CHILD_ID_FIELD_NUMBER = 1;
    public static final int DATE_OF_BIRTH_FIELD_NUMBER = 6;
    public static final int DATE_OF_BIRTH_MAX_DATE_FIELD_NUMBER = 8;
    public static final int DATE_OF_BIRTH_MIN_DATE_FIELD_NUMBER = 7;
    private static final GenAlphaManaged DEFAULT_INSTANCE;
    public static final int GRADUATION_BANNER_FIELD_NUMBER = 10;
    public static final int IS_EXPIRING_FIELD_NUMBER = 11;
    private static volatile r2n0 PARSER = null;
    public static final int PROFILE_FIELD_NUMBER = 2;
    private boolean allowConnect_;
    private boolean allowExplicitContent_;
    private boolean allowVideo_;
    private int bitField0_;
    private GraduationBanner graduationBanner_;
    private boolean isExpiring_;
    private MemberProfile profile_;
    private String childId_ = "";
    private String dateOfBirth_ = "";
    private String dateOfBirthMinDate_ = "";
    private String dateOfBirthMaxDate_ = "";

    static {
        GenAlphaManaged genAlphaManaged = new GenAlphaManaged();
        DEFAULT_INSTANCE = genAlphaManaged;
        AbstractC0269h.registerDefaultInstance(GenAlphaManaged.class, genAlphaManaged);
    }

    private GenAlphaManaged() {
    }

    /* JADX INFO: renamed from: n */
    public static GenAlphaManaged m10695n() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\n\u0000\u0001\u0001\u000b\n\u0000\u0000\u0000\u0001Ȉ\u0002ဉ\u0000\u0003\u0007\u0004\u0007\u0005ဇ\u0001\u0006Ȉ\u0007Ȉ\bȈ\nဉ\u0002\u000bဇ\u0003", new Object[]{"bitField0_", "childId_", "profile_", "allowExplicitContent_", "allowVideo_", "allowConnect_", "dateOfBirth_", "dateOfBirthMinDate_", "dateOfBirthMaxDate_", "graduationBanner_", "isExpiring_"});
        }
        if (iOrdinal == 3) {
            return new GenAlphaManaged();
        }
        if (iOrdinal == 4) {
            return new ie00(DEFAULT_INSTANCE, 9);
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
        synchronized (GenAlphaManaged.class) {
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

    public final boolean getAllowConnect() {
        return this.allowConnect_;
    }

    public final boolean getAllowExplicitContent() {
        return this.allowExplicitContent_;
    }

    public final boolean getAllowVideo() {
        return this.allowVideo_;
    }

    public final String getChildId() {
        return this.childId_;
    }

    public final String getDateOfBirth() {
        return this.dateOfBirth_;
    }

    public final String getDateOfBirthMaxDate() {
        return this.dateOfBirthMaxDate_;
    }

    public final String getDateOfBirthMinDate() {
        return this.dateOfBirthMinDate_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.sre0
    public final /* bridge */ /* synthetic */ pre0 getDefaultInstanceForType() {
        return getDefaultInstanceForType();
    }

    public final boolean getIsExpiring() {
        return this.isExpiring_;
    }

    public final boolean hasAllowConnect() {
        return (this.bitField0_ & 2) != 0;
    }

    public final boolean hasGraduationBanner() {
        return (this.bitField0_ & 4) != 0;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final GraduationBanner m10696o() {
        GraduationBanner graduationBanner = this.graduationBanner_;
        return graduationBanner == null ? GraduationBanner.m10743n() : graduationBanner;
    }

    /* JADX INFO: renamed from: p */
    public final MemberProfile m10697p() {
        MemberProfile memberProfile = this.profile_;
        return memberProfile == null ? MemberProfile.m10748n() : memberProfile;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
