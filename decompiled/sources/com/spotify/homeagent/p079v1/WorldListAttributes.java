package com.spotify.homeagent.p079v1;

import com.google.protobuf.AbstractC0269h;
import p204p.eyc1;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.yae1;
import p204p.z110;

/* JADX INFO: loaded from: classes7.dex */
public final class WorldListAttributes extends AbstractC0269h implements sre0 {
    private static final WorldListAttributes DEFAULT_INSTANCE;
    public static final int ERROR_FIELD_NUMBER = 4;
    public static final int GENERATION_ID_FIELD_NUMBER = 5;
    public static final int HERO_URI_FIELD_NUMBER = 1;
    public static final int NAVIGATION_URI_FIELD_NUMBER = 6;
    private static volatile r2n0 PARSER = null;
    public static final int SEED_FIELD_NUMBER = 3;
    public static final int STATE_FIELD_NUMBER = 2;
    private int bitField0_;
    private WorldError error_;
    private Seed seed_;
    private int state_;
    private String heroUri_ = "";
    private String generationId_ = "";
    private String navigationUri_ = "";

    static {
        WorldListAttributes worldListAttributes = new WorldListAttributes();
        DEFAULT_INSTANCE = worldListAttributes;
        AbstractC0269h.registerDefaultInstance(WorldListAttributes.class, worldListAttributes);
    }

    private WorldListAttributes() {
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: u */
    public static WorldListAttributes m11848u(byte[] bArr) {
        return (WorldListAttributes) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001Ȉ\u0002\f\u0003ဉ\u0000\u0004ဉ\u0001\u0005Ȉ\u0006Ȉ", new Object[]{"bitField0_", "heroUri_", "state_", "seed_", "error_", "generationId_", "navigationUri_"});
        }
        if (iOrdinal == 3) {
            return new WorldListAttributes();
        }
        if (iOrdinal == 4) {
            return new eyc1(DEFAULT_INSTANCE, 28);
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
        synchronized (WorldListAttributes.class) {
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
    public final WorldError m11849n() {
        WorldError worldError = this.error_;
        return worldError == null ? WorldError.m11845n() : worldError;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final String m11850o() {
        return this.generationId_;
    }

    /* JADX INFO: renamed from: p */
    public final String m11851p() {
        return this.heroUri_;
    }

    /* JADX INFO: renamed from: q */
    public final String m11852q() {
        return this.navigationUri_;
    }

    /* JADX INFO: renamed from: r */
    public final Seed m11853r() {
        Seed seed = this.seed_;
        return seed == null ? Seed.m11841n() : seed;
    }

    /* JADX INFO: renamed from: s */
    public final yae1 m11854s() {
        yae1 yae1Var;
        int i = this.state_;
        if (i == 0) {
            yae1Var = yae1.WORLD_STATE_UNDEFINED;
        } else if (i == 1) {
            yae1Var = yae1.WORLD_STATE_EMPTY;
        } else if (i != 2) {
            yae1Var = i != 3 ? null : yae1.WORLD_STATE_POPULATED;
        } else {
            yae1Var = yae1.WORLD_STATE_IN_PROGRESS;
        }
        return yae1Var == null ? yae1.UNRECOGNIZED : yae1Var;
    }

    /* JADX INFO: renamed from: t */
    public final boolean m11855t() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
