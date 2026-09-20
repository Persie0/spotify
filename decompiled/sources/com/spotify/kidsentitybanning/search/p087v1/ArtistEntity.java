package com.spotify.kidsentitybanning.search.p087v1;

import com.google.protobuf.AbstractC0269h;
import p204p.aw2;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.rs8;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes7.dex */
public final class ArtistEntity extends AbstractC0269h implements sre0 {
    public static final int BAN_STATUS_FIELD_NUMBER = 3;
    private static final ArtistEntity DEFAULT_INSTANCE;
    public static final int IS_BANNED_FIELD_NUMBER = 2;
    private static volatile r2n0 PARSER = null;
    public static final int URI_FIELD_NUMBER = 1;
    private int banStatus_;
    private boolean isBanned_;
    private String uri_ = "";

    static {
        ArtistEntity artistEntity = new ArtistEntity();
        DEFAULT_INSTANCE = artistEntity;
        AbstractC0269h.registerDefaultInstance(ArtistEntity.class, artistEntity);
    }

    private ArtistEntity() {
    }

    /* JADX INFO: renamed from: o */
    public static ArtistEntity m12184o() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\u0007\u0003\f", new Object[]{"uri_", "isBanned_", "banStatus_"});
        }
        if (iOrdinal == 3) {
            return new ArtistEntity();
        }
        if (iOrdinal == 4) {
            return new aw2(DEFAULT_INSTANCE, 28);
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
        synchronized (ArtistEntity.class) {
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

    public final boolean getIsBanned() {
        return this.isBanned_;
    }

    public final String getUri() {
        return this.uri_;
    }

    /* JADX INFO: renamed from: n */
    public final rs8 m12185n() {
        rs8 rs8VarM76314a = rs8.m76314a(this.banStatus_);
        return rs8VarM76314a == null ? rs8.UNRECOGNIZED : rs8VarM76314a;
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
