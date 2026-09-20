package com.spotify.songdna.credits.p154v1;

import com.google.protobuf.AbstractC0269h;
import p204p.ae50;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.v9k;
import p204p.z110;

/* JADX INFO: loaded from: classes10.dex */
public final class Contributor extends AbstractC0269h implements sre0 {
    private static final Contributor DEFAULT_INSTANCE;
    public static final int IS_SONGWRITER_FIELD_NUMBER = 5;
    public static final int NAME_FIELD_NUMBER = 2;
    private static volatile r2n0 PARSER = null;
    public static final int ROLE_FIELD_NUMBER = 3;
    public static final int SOURCES_FIELD_NUMBER = 4;
    public static final int URI_FIELD_NUMBER = 1;
    private int bitField0_;
    private boolean isSongwriter_;
    private Role role_;
    private String uri_ = "";
    private String name_ = "";
    private ae50 sources_ = AbstractC0269h.emptyProtobufList();

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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001ለ\u0000\u0002Ȉ\u0003ဉ\u0001\u0004\u001b\u0005\u0007", new Object[]{"bitField0_", "uri_", "name_", "role_", "sources_", Source.class, "isSongwriter_"});
        }
        if (iOrdinal == 3) {
            return new Contributor();
        }
        if (iOrdinal == 4) {
            return new v9k(DEFAULT_INSTANCE, 4);
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

    public final String getUri() {
        return this.uri_;
    }

    public final boolean hasUri() {
        return (this.bitField0_ & 1) != 0;
    }

    /* JADX INFO: renamed from: n */
    public final boolean m21473n() {
        return this.isSongwriter_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final Role m21474o() {
        Role role = this.role_;
        return role == null ? Role.m21478n() : role;
    }

    /* JADX INFO: renamed from: p */
    public final ae50 m21475p() {
        return this.sources_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
