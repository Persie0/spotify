package com.spotify.profile.editprofile.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.cza1;
import p204p.kea1;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes10.dex */
public final class UserprofileviewV4$SetBioAudienceResponse extends AbstractC0269h implements sre0 {
    public static final int AUDIENCE_FIELD_NUMBER = 1;
    private static final UserprofileviewV4$SetBioAudienceResponse DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER;
    private int audience_;

    static {
        UserprofileviewV4$SetBioAudienceResponse userprofileviewV4$SetBioAudienceResponse = new UserprofileviewV4$SetBioAudienceResponse();
        DEFAULT_INSTANCE = userprofileviewV4$SetBioAudienceResponse;
        AbstractC0269h.registerDefaultInstance(UserprofileviewV4$SetBioAudienceResponse.class, userprofileviewV4$SetBioAudienceResponse);
    }

    private UserprofileviewV4$SetBioAudienceResponse() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\f", new Object[]{"audience_"});
        }
        if (iOrdinal == 3) {
            return new UserprofileviewV4$SetBioAudienceResponse();
        }
        if (iOrdinal == 4) {
            return new kea1(DEFAULT_INSTANCE, 25);
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
        synchronized (UserprofileviewV4$SetBioAudienceResponse.class) {
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
    public final cza1 m19786n() {
        cza1 cza1VarM34429a = cza1.m34429a(this.audience_);
        return cza1VarM34429a == null ? cza1.UNRECOGNIZED : cza1VarM34429a;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
