package com.spotify.pam.p118v2;

import com.google.protobuf.AbstractC0269h;
import p204p.ae50;
import p204p.dbd0;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes9.dex */
public final class MembershipVerification extends AbstractC0269h implements sre0 {
    public static final int ACTION_FIELD_NUMBER = 3;
    public static final int DEADLINE_FIELD_NUMBER = 4;
    private static final MembershipVerification DEFAULT_INSTANCE;
    public static final int DESCRIPTION_FIELD_NUMBER = 2;
    public static final int MEMBERS_FIELD_NUMBER = 5;
    private static volatile r2n0 PARSER = null;
    public static final int TITLE_FIELD_NUMBER = 1;
    private Action action_;
    private int bitField0_;
    private long deadline_;
    private String title_ = "";
    private String description_ = "";
    private ae50 members_ = AbstractC0269h.emptyProtobufList();

    static {
        MembershipVerification membershipVerification = new MembershipVerification();
        DEFAULT_INSTANCE = membershipVerification;
        AbstractC0269h.registerDefaultInstance(MembershipVerification.class, membershipVerification);
    }

    private MembershipVerification() {
    }

    /* JADX INFO: renamed from: p */
    public static MembershipVerification m16535p() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001Ȉ\u0002Ȉ\u0003ဉ\u0000\u0004ဃ\u0001\u0005\u001b", new Object[]{"bitField0_", "title_", "description_", "action_", "deadline_", "members_", Member.class});
        }
        if (iOrdinal == 3) {
            return new MembershipVerification();
        }
        if (iOrdinal == 4) {
            return new dbd0(DEFAULT_INSTANCE, 10);
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
        synchronized (MembershipVerification.class) {
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

    public final String getTitle() {
        return this.title_;
    }

    /* JADX INFO: renamed from: n */
    public final Action m16536n() {
        Action action = this.action_;
        return action == null ? Action.m16391o() : action;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final long m16537o() {
        return this.deadline_;
    }

    /* JADX INFO: renamed from: q */
    public final ae50 m16538q() {
        return this.members_;
    }

    /* JADX INFO: renamed from: r */
    public final boolean m16539r() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
