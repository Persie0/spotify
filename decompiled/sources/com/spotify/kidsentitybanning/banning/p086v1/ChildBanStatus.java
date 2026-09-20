package com.spotify.kidsentitybanning.banning.p086v1;

import com.google.protobuf.AbstractC0269h;
import p204p.h3e;
import p204p.i3e;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.rs8;
import p204p.z110;

/* JADX INFO: loaded from: classes7.dex */
public final class ChildBanStatus extends AbstractC0269h implements i3e {
    public static final int AVATAR_FIELD_NUMBER = 3;
    public static final int BANNED_FOR_CHILD_FIELD_NUMBER = 4;
    public static final int BAN_STATUS_FIELD_NUMBER = 6;
    public static final int CHILD_ID_FIELD_NUMBER = 1;
    public static final int COLOR_FIELD_NUMBER = 5;
    private static final ChildBanStatus DEFAULT_INSTANCE;
    public static final int NAME_FIELD_NUMBER = 2;
    private static volatile r2n0 PARSER;
    private int banStatus_;
    private boolean bannedForChild_;
    private int bitField0_;
    private int color_;
    private String childId_ = "";
    private String name_ = "";
    private String avatar_ = "";

    static {
        ChildBanStatus childBanStatus = new ChildBanStatus();
        DEFAULT_INSTANCE = childBanStatus;
        AbstractC0269h.registerDefaultInstance(ChildBanStatus.class, childBanStatus);
    }

    private ChildBanStatus() {
    }

    /* JADX INFO: renamed from: n */
    public static void m12175n(ChildBanStatus childBanStatus, rs8 rs8Var) {
        childBanStatus.getClass();
        childBanStatus.banStatus_ = rs8Var.getNumber();
    }

    /* JADX INFO: renamed from: o */
    public static void m12176o(ChildBanStatus childBanStatus, boolean z) {
        childBanStatus.bannedForChild_ = z;
    }

    /* JADX INFO: renamed from: p */
    public static void m12177p(ChildBanStatus childBanStatus, String str) {
        childBanStatus.getClass();
        str.getClass();
        childBanStatus.childId_ = str;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static h3e m12178q() {
        return (h3e) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004\u0007\u0005င\u0000\u0006\f", new Object[]{"bitField0_", "childId_", "name_", "avatar_", "bannedForChild_", "color_", "banStatus_"});
        }
        if (iOrdinal == 3) {
            return new ChildBanStatus();
        }
        if (iOrdinal == 4) {
            return new h3e(DEFAULT_INSTANCE);
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
        synchronized (ChildBanStatus.class) {
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

    @Override // p204p.i3e
    /* JADX INFO: renamed from: g */
    public final boolean mo12179g() {
        return this.bannedForChild_;
    }

    @Override // p204p.i3e
    public final String getAvatar() {
        return this.avatar_;
    }

    @Override // p204p.i3e
    public final String getChildId() {
        return this.childId_;
    }

    @Override // p204p.i3e
    public final int getColor() {
        return this.color_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.sre0
    public final /* bridge */ /* synthetic */ pre0 getDefaultInstanceForType() {
        return getDefaultInstanceForType();
    }

    @Override // p204p.i3e
    public final String getName() {
        return this.name_;
    }

    @Override // p204p.i3e
    public final boolean hasColor() {
        return (this.bitField0_ & 1) != 0;
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
