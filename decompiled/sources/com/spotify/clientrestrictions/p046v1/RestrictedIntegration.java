package com.spotify.clientrestrictions.p046v1;

import com.google.protobuf.AbstractC0269h;
import p204p.h4x0;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes5.dex */
public final class RestrictedIntegration extends AbstractC0269h implements sre0 {
    private static final RestrictedIntegration DEFAULT_INSTANCE;
    public static final int MATCHER_FIELD_NUMBER = 1;
    private static volatile r2n0 PARSER = null;
    public static final int RESTRICTION_ID_FIELD_NUMBER = 2;
    private int bitField0_;
    private ExternalAccessoryDescription matcher_;
    private String restrictionId_ = "";

    static {
        RestrictedIntegration restrictedIntegration = new RestrictedIntegration();
        DEFAULT_INSTANCE = restrictedIntegration;
        AbstractC0269h.registerDefaultInstance(RestrictedIntegration.class, restrictedIntegration);
    }

    private RestrictedIntegration() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002Ȉ", new Object[]{"bitField0_", "matcher_", "restrictionId_"});
        }
        if (iOrdinal == 3) {
            return new RestrictedIntegration();
        }
        if (iOrdinal == 4) {
            return new h4x0(DEFAULT_INSTANCE, 0);
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
        synchronized (RestrictedIntegration.class) {
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
    public final ExternalAccessoryDescription m6791n() {
        ExternalAccessoryDescription externalAccessoryDescription = this.matcher_;
        return externalAccessoryDescription == null ? ExternalAccessoryDescription.m6776p() : externalAccessoryDescription;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final String m6792o() {
        return this.restrictionId_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
