package com.spotify.contentagnostic.p051v2;

import com.google.protobuf.AbstractC0269h;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.v9k;
import p204p.z110;

/* JADX INFO: loaded from: classes6.dex */
public final class Contributor extends AbstractC0269h implements sre0 {
    public static final int AI_ATTRIBUTION_FIELD_NUMBER = 7;
    private static final Contributor DEFAULT_INSTANCE;
    public static final int NAME_FIELD_NUMBER = 1;
    private static volatile r2n0 PARSER = null;
    public static final int REFERENCE_FIELD_NUMBER = 4;
    public static final int ROLE_FIELD_NUMBER = 2;
    public static final int ROLE_GROUP_FIELD_NUMBER = 6;
    public static final int URI_FIELD_NUMBER = 3;
    public static final int URL_FIELD_NUMBER = 5;
    private AiAttribution aiAttribution_;
    private int bitField0_;
    private Reference reference_;
    private RoleGroup roleGroup_;
    private String name_ = "";
    private String role_ = "";
    private String uri_ = "";
    private String url_ = "";

    static {
        Contributor contributor = new Contributor();
        DEFAULT_INSTANCE = contributor;
        AbstractC0269h.registerDefaultInstance(Contributor.class, contributor);
    }

    private Contributor() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003ለ\u0001\u0004ဉ\u0002\u0005ለ\u0003\u0006ဉ\u0000\u0007ဉ\u0004", new Object[]{"bitField0_", "name_", "role_", "uri_", "reference_", "url_", "roleGroup_", "aiAttribution_"});
        }
        if (iOrdinal == 3) {
            return new Contributor();
        }
        if (iOrdinal == 4) {
            return new v9k(DEFAULT_INSTANCE, 5);
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
        synchronized (Contributor.class) {
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

    public final String getName() {
        return this.name_;
    }

    public final String getRole() {
        return this.role_;
    }

    public final String getUri() {
        return this.uri_;
    }

    public final String getUrl() {
        return this.url_;
    }

    public final boolean hasUri() {
        return (this.bitField0_ & 2) != 0;
    }

    public final boolean hasUrl() {
        return (this.bitField0_ & 8) != 0;
    }

    /* JADX INFO: renamed from: n */
    public final RoleGroup m7826n() {
        RoleGroup roleGroup = this.roleGroup_;
        return roleGroup == null ? RoleGroup.m7938n() : roleGroup;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final boolean m7827o() {
        return (this.bitField0_ & 16) != 0;
    }

    /* JADX INFO: renamed from: p */
    public final boolean m7828p() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
