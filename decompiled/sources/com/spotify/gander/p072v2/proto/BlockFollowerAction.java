package com.spotify.gander.p072v2.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.mq9;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes7.dex */
public final class BlockFollowerAction extends AbstractC0269h implements sre0 {
    private static final BlockFollowerAction DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER = null;
    public static final int USERNAME_FIELD_NUMBER = 1;
    public static final int USER_DISPLAY_NAME_FIELD_NUMBER = 2;
    private String username_ = "";
    private String userDisplayName_ = "";

    static {
        BlockFollowerAction blockFollowerAction = new BlockFollowerAction();
        DEFAULT_INSTANCE = blockFollowerAction;
        AbstractC0269h.registerDefaultInstance(BlockFollowerAction.class, blockFollowerAction);
    }

    private BlockFollowerAction() {
    }

    /* JADX INFO: renamed from: n */
    public static void m11065n(BlockFollowerAction blockFollowerAction, String str) {
        blockFollowerAction.getClass();
        blockFollowerAction.userDisplayName_ = str;
    }

    /* JADX INFO: renamed from: o */
    public static void m11066o(BlockFollowerAction blockFollowerAction, String str) {
        blockFollowerAction.getClass();
        blockFollowerAction.username_ = str;
    }

    /* JADX INFO: renamed from: p */
    public static BlockFollowerAction m11067p() {
        return DEFAULT_INSTANCE;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: r */
    public static mq9 m11068r() {
        return (mq9) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ", new Object[]{"username_", "userDisplayName_"});
        }
        if (iOrdinal == 3) {
            return new BlockFollowerAction();
        }
        if (iOrdinal == 4) {
            return new mq9(DEFAULT_INSTANCE);
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
        synchronized (BlockFollowerAction.class) {
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

    /* JADX INFO: renamed from: q */
    public final String m11069q() {
        return this.userDisplayName_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
