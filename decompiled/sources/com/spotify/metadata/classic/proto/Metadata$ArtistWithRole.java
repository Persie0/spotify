package com.spotify.metadata.classic.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.ae50;
import p204p.dbd0;
import p204p.gva;
import p204p.j5f0;
import p204p.nq6;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes8.dex */
public final class Metadata$ArtistWithRole extends AbstractC0269h implements sre0 {
    public static final int ARTIST_GID_FIELD_NUMBER = 1;
    public static final int ARTIST_NAME_FIELD_NUMBER = 2;
    private static final Metadata$ArtistWithRole DEFAULT_INSTANCE;
    public static final int LOCALIZED_NAME_FIELD_NUMBER = 4;
    private static volatile r2n0 PARSER = null;
    public static final int ROLE_FIELD_NUMBER = 3;
    private int bitField0_;
    private int role_;
    private gva artistGid_ = gva.f84678b;
    private String artistName_ = "";
    private ae50 localizedName_ = AbstractC0269h.emptyProtobufList();

    static {
        Metadata$ArtistWithRole metadata$ArtistWithRole = new Metadata$ArtistWithRole();
        DEFAULT_INSTANCE = metadata$ArtistWithRole;
        AbstractC0269h.registerDefaultInstance(Metadata$ArtistWithRole.class, metadata$ArtistWithRole);
    }

    private Metadata$ArtistWithRole() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ည\u0000\u0002ဈ\u0001\u0003᠌\u0002\u0004\u001b", new Object[]{"bitField0_", "artistGid_", "artistName_", "role_", nq6.f157156m, "localizedName_", Metadata$LocalizedString.class});
        }
        if (iOrdinal == 3) {
            return new Metadata$ArtistWithRole();
        }
        if (iOrdinal == 4) {
            return new dbd0(DEFAULT_INSTANCE, 24);
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
        synchronized (Metadata$ArtistWithRole.class) {
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
    public final gva m15346n() {
        return this.artistGid_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final String m15347o() {
        return this.artistName_;
    }

    /* JADX INFO: renamed from: p */
    public final j5f0 m15348p() {
        j5f0 j5f0VarM52456a = j5f0.m52456a(this.role_);
        return j5f0VarM52456a == null ? j5f0.ARTIST_ROLE_UNKNOWN : j5f0VarM52456a;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
