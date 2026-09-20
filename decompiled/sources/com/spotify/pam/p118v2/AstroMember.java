package com.spotify.pam.p118v2;

import com.google.protobuf.AbstractC0269h;
import p204p.ore0;
import p204p.pre0;
import p204p.qw5;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes9.dex */
public final class AstroMember extends AbstractC0269h implements sre0 {
    public static final int ADD_MEMBER_FIELD_NUMBER = 5;
    public static final int CHANGE_DENOMINATION_FIELD_NUMBER = 6;
    private static final AstroMember DEFAULT_INSTANCE;
    public static final int DESCRIPTION_COLOR_FIELD_NUMBER = 8;
    public static final int DESCRIPTION_FIELD_NUMBER = 2;
    public static final int IMAGE_URI_FIELD_NUMBER = 4;
    public static final int IS_CHILD_FIELD_NUMBER = 7;
    public static final int NAME_FIELD_NUMBER = 1;
    private static volatile r2n0 PARSER = null;
    public static final int REMOVE_MEMBER_FIELD_NUMBER = 3;
    private Action addMember_;
    private int bitField0_;
    private Action changeDenomination_;
    private boolean isChild_;
    private Action removeMember_;
    private String name_ = "";
    private String description_ = "";
    private String imageUri_ = "";
    private String descriptionColor_ = "";

    static {
        AstroMember astroMember = new AstroMember();
        DEFAULT_INSTANCE = astroMember;
        AbstractC0269h.registerDefaultInstance(AstroMember.class, astroMember);
    }

    private AstroMember() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003ဉ\u0000\u0004Ȉ\u0005ဉ\u0001\u0006ဉ\u0002\u0007\u0007\bለ\u0003", new Object[]{"bitField0_", "name_", "description_", "removeMember_", "imageUri_", "addMember_", "changeDenomination_", "isChild_", "descriptionColor_"});
        }
        if (iOrdinal == 3) {
            return new AstroMember();
        }
        if (iOrdinal == 4) {
            return new qw5(DEFAULT_INSTANCE, 21);
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
        synchronized (AstroMember.class) {
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

    public final String getDescription() {
        return this.description_;
    }

    public final String getName() {
        return this.name_;
    }

    /* JADX INFO: renamed from: n */
    public final Action m16397n() {
        Action action = this.addMember_;
        return action == null ? Action.m16391o() : action;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final Action m16398o() {
        Action action = this.changeDenomination_;
        return action == null ? Action.m16391o() : action;
    }

    /* JADX INFO: renamed from: p */
    public final String m16399p() {
        return this.descriptionColor_;
    }

    /* JADX INFO: renamed from: q */
    public final String m16400q() {
        return this.imageUri_;
    }

    /* JADX INFO: renamed from: r */
    public final boolean m16401r() {
        return this.isChild_;
    }

    /* JADX INFO: renamed from: s */
    public final Action m16402s() {
        Action action = this.removeMember_;
        return action == null ? Action.m16391o() : action;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
