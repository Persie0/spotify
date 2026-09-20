package com.spotify.profile.editprofile.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.eza1;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes10.dex */
public final class UserprofileviewV4$GetBioAudienceRequest extends AbstractC0269h implements sre0 {
    private static final UserprofileviewV4$GetBioAudienceRequest DEFAULT_INSTANCE;
    public static final int FORCE_REFRESH_FIELD_NUMBER = 1;
    public static final int HTTP_FIELD_NUMBER = 2;
    private static volatile r2n0 PARSER;
    private boolean forceRefresh_;
    private boolean http_;

    static {
        UserprofileviewV4$GetBioAudienceRequest userprofileviewV4$GetBioAudienceRequest = new UserprofileviewV4$GetBioAudienceRequest();
        DEFAULT_INSTANCE = userprofileviewV4$GetBioAudienceRequest;
        AbstractC0269h.registerDefaultInstance(UserprofileviewV4$GetBioAudienceRequest.class, userprofileviewV4$GetBioAudienceRequest);
    }

    private UserprofileviewV4$GetBioAudienceRequest() {
    }

    /* JADX INFO: renamed from: n */
    public static void m19778n(UserprofileviewV4$GetBioAudienceRequest userprofileviewV4$GetBioAudienceRequest) {
        userprofileviewV4$GetBioAudienceRequest.http_ = true;
    }

    /* JADX INFO: renamed from: o */
    public static eza1 m19779o() {
        return (eza1) DEFAULT_INSTANCE.createBuilder();
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0007\u0002\u0007", new Object[]{"forceRefresh_", "http_"});
        }
        if (iOrdinal == 3) {
            return new UserprofileviewV4$GetBioAudienceRequest();
        }
        if (iOrdinal == 4) {
            return new eza1(DEFAULT_INSTANCE);
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
        synchronized (UserprofileviewV4$GetBioAudienceRequest.class) {
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

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
