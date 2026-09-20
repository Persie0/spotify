package com.spotify.campfire.contribution.proto.p037v1;

import com.google.protobuf.AbstractC0269h;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.v9k;
import p204p.z110;

/* JADX INFO: loaded from: classes5.dex */
public final class ContributionCapabilities extends AbstractC0269h implements sre0 {
    public static final int CAN_CREATE_FIELD_NUMBER = 1;
    public static final int CAN_EDIT_FIELD_NUMBER = 2;
    public static final int CAN_REMOVE_FIELD_NUMBER = 3;
    public static final int CAN_VIEW_FIELD_NUMBER = 4;
    private static final ContributionCapabilities DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER;
    private int bitField0_;
    private boolean canCreate_;
    private boolean canEdit_;
    private boolean canRemove_;
    private boolean canView_;

    static {
        ContributionCapabilities contributionCapabilities = new ContributionCapabilities();
        DEFAULT_INSTANCE = contributionCapabilities;
        AbstractC0269h.registerDefaultInstance(ContributionCapabilities.class, contributionCapabilities);
    }

    private ContributionCapabilities() {
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: r */
    public static ContributionCapabilities m4258r() {
        return DEFAULT_INSTANCE;
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004ဇ\u0003", new Object[]{"bitField0_", "canCreate_", "canEdit_", "canRemove_", "canView_"});
        }
        if (iOrdinal == 3) {
            return new ContributionCapabilities();
        }
        if (iOrdinal == 4) {
            return new v9k(DEFAULT_INSTANCE, 2);
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
        synchronized (ContributionCapabilities.class) {
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
    public final boolean m4259n() {
        return this.canCreate_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final boolean m4260o() {
        return this.canEdit_;
    }

    /* JADX INFO: renamed from: p */
    public final boolean m4261p() {
        return this.canRemove_;
    }

    /* JADX INFO: renamed from: q */
    public final boolean m4262q() {
        return this.canView_;
    }

    /* JADX INFO: renamed from: s */
    public final boolean m4263s() {
        return (this.bitField0_ & 1) != 0;
    }

    /* JADX INFO: renamed from: t */
    public final boolean m4264t() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }

    /* JADX INFO: renamed from: u */
    public final boolean m4265u() {
        return (this.bitField0_ & 4) != 0;
    }

    /* JADX INFO: renamed from: v */
    public final boolean m4266v() {
        return (this.bitField0_ & 8) != 0;
    }
}
