package com.spotify.upcomingreleases.p172v1;

import com.google.protobuf.AbstractC0269h;
import p204p.ae50;
import p204p.jyq0;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.x2q0;
import p204p.z110;

/* JADX INFO: loaded from: classes6.dex */
public final class PrereleasesSection extends AbstractC0269h implements sre0 {
    private static final PrereleasesSection DEFAULT_INSTANCE;
    public static final int ID_FIELD_NUMBER = 1;
    private static volatile r2n0 PARSER = null;
    public static final int PRERELEASES_FIELD_NUMBER = 2;
    public static final int USER_METADATA_FIELD_NUMBER = 3;
    private int bitField0_;
    private int id_;
    private ae50 prereleases_ = AbstractC0269h.emptyProtobufList();
    private UserMetadata userMetadata_;

    static {
        PrereleasesSection prereleasesSection = new PrereleasesSection();
        DEFAULT_INSTANCE = prereleasesSection;
        AbstractC0269h.registerDefaultInstance(PrereleasesSection.class, prereleasesSection);
    }

    private PrereleasesSection() {
    }

    /* JADX INFO: renamed from: n */
    public static PrereleasesSection m22021n() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001\f\u0002\u001b\u0003ဉ\u0000", new Object[]{"bitField0_", "id_", "prereleases_", Prerelease.class, "userMetadata_"});
        }
        if (iOrdinal == 3) {
            return new PrereleasesSection();
        }
        if (iOrdinal == 4) {
            return new x2q0(DEFAULT_INSTANCE, 24);
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
        synchronized (PrereleasesSection.class) {
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

    /* JADX INFO: renamed from: o */
    public final jyq0 m22022o() {
        jyq0 jyq0Var;
        int i = this.id_;
        if (i == 0) {
            jyq0Var = jyq0.UNSPECIFIED;
        } else if (i != 1) {
            jyq0Var = i != 2 ? null : jyq0.TOP_PRESAVED;
        } else {
            jyq0Var = jyq0.PERSONALIZED;
        }
        return jyq0Var == null ? jyq0.UNRECOGNIZED : jyq0Var;
    }

    /* JADX INFO: renamed from: p */
    public final ae50 m22023p() {
        return this.prereleases_;
    }

    /* JADX INFO: renamed from: q */
    public final UserMetadata m22024q() {
        UserMetadata userMetadata = this.userMetadata_;
        return userMetadata == null ? UserMetadata.m22030n() : userMetadata;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
