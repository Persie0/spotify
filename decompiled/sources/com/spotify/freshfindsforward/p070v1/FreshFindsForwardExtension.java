package com.spotify.freshfindsforward.p070v1;

import com.google.protobuf.AbstractC0269h;
import p204p.byy;
import p204p.dd00;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes6.dex */
public final class FreshFindsForwardExtension extends AbstractC0269h implements sre0 {
    public static final int BADGE_URL_FIELD_NUMBER = 3;
    public static final int COHORT_YEAR_FIELD_NUMBER = 4;
    private static final FreshFindsForwardExtension DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER = null;
    public static final int SHOW_ENTITY_BANNER_FIELD_NUMBER = 2;
    public static final int STATUS_FIELD_NUMBER = 1;
    private String badgeUrl_ = "";
    private String cohortYear_ = "";
    private boolean showEntityBanner_;
    private int status_;

    static {
        FreshFindsForwardExtension freshFindsForwardExtension = new FreshFindsForwardExtension();
        DEFAULT_INSTANCE = freshFindsForwardExtension;
        AbstractC0269h.registerDefaultInstance(FreshFindsForwardExtension.class, freshFindsForwardExtension);
    }

    private FreshFindsForwardExtension() {
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: r */
    public static FreshFindsForwardExtension m10979r(byte[] bArr) {
        return (FreshFindsForwardExtension) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\f\u0002\u0007\u0003Ȉ\u0004Ȉ", new Object[]{"status_", "showEntityBanner_", "badgeUrl_", "cohortYear_"});
        }
        if (iOrdinal == 3) {
            return new FreshFindsForwardExtension();
        }
        if (iOrdinal == 4) {
            return new byy(DEFAULT_INSTANCE, 27);
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
        synchronized (FreshFindsForwardExtension.class) {
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
    public final String m10980n() {
        return this.badgeUrl_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final String m10981o() {
        return this.cohortYear_;
    }

    /* JADX INFO: renamed from: p */
    public final boolean m10982p() {
        return this.showEntityBanner_;
    }

    /* JADX INFO: renamed from: q */
    public final dd00 m10983q() {
        dd00 dd00Var;
        int i = this.status_;
        if (i == 0) {
            dd00Var = dd00.FRESH_FINDS_FORWARD_STATUS_UNSPECIFIED;
        } else if (i != 1) {
            dd00Var = i != 2 ? null : dd00.FRESH_FINDS_FORWARD_STATUS_ALUMNI;
        } else {
            dd00Var = dd00.FRESH_FINDS_FORWARD_STATUS_ACTIVE;
        }
        return dd00Var == null ? dd00.UNRECOGNIZED : dd00Var;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
