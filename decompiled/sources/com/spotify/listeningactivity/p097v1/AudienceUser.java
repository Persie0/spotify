package com.spotify.listeningactivity.p097v1;

import com.google.protobuf.AbstractC0269h;
import p204p.hr6;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;
import p204p.zr6;

/* JADX INFO: loaded from: classes7.dex */
public final class AudienceUser extends AbstractC0269h implements sre0 {
    private static final AudienceUser DEFAULT_INSTANCE;
    public static final int HIDDEN_FIELD_NUMBER = 4;
    private static volatile r2n0 PARSER = null;
    public static final int RESTRICTED_FIELD_NUMBER = 2;
    public static final int SOURCE_FIELD_NUMBER = 3;
    public static final int USERNAME_FIELD_NUMBER = 1;
    private boolean hidden_;
    private boolean restricted_;
    private int source_;
    private String username_ = "";

    static {
        AudienceUser audienceUser = new AudienceUser();
        DEFAULT_INSTANCE = audienceUser;
        AbstractC0269h.registerDefaultInstance(AudienceUser.class, audienceUser);
    }

    private AudienceUser() {
    }

    /* JADX INFO: renamed from: n */
    public static AudienceUser m12908n() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002\u0007\u0003\f\u0004\u0007", new Object[]{"username_", "restricted_", "source_", "hidden_"});
        }
        if (iOrdinal == 3) {
            return new AudienceUser();
        }
        if (iOrdinal == 4) {
            return new hr6(DEFAULT_INSTANCE, 5);
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
        synchronized (AudienceUser.class) {
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

    public final String getUsername() {
        return this.username_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final boolean m12909o() {
        return this.restricted_;
    }

    /* JADX INFO: renamed from: p */
    public final zr6 m12910p() {
        zr6 zr6Var;
        int i = this.source_;
        if (i == 0) {
            zr6Var = zr6.AUDIENCE_SOURCE_UNSPECIFIED;
        } else if (i != 1) {
            zr6Var = i != 2 ? null : zr6.AUDIENCE_SOURCE_GROUP;
        } else {
            zr6Var = zr6.AUDIENCE_SOURCE_DM;
        }
        return zr6Var == null ? zr6.UNRECOGNIZED : zr6Var;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
