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
public final class ContributionKindCapabilities extends AbstractC0269h implements sre0 {
    public static final int COMMENTS_FIELD_NUMBER = 3;
    private static final ContributionKindCapabilities DEFAULT_INSTANCE;
    public static final int NOTES_FIELD_NUMBER = 1;
    private static volatile r2n0 PARSER = null;
    public static final int REACTIONS_FIELD_NUMBER = 2;
    private int bitField0_;
    private ContributionCapabilities comments_;
    private ContributionCapabilities notes_;
    private ContributionCapabilities reactions_;

    static {
        ContributionKindCapabilities contributionKindCapabilities = new ContributionKindCapabilities();
        DEFAULT_INSTANCE = contributionKindCapabilities;
        AbstractC0269h.registerDefaultInstance(ContributionKindCapabilities.class, contributionKindCapabilities);
    }

    private ContributionKindCapabilities() {
    }

    /* JADX INFO: renamed from: o */
    public static ContributionKindCapabilities m4271o() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002", new Object[]{"bitField0_", "notes_", "reactions_", "comments_"});
        }
        if (iOrdinal == 3) {
            return new ContributionKindCapabilities();
        }
        if (iOrdinal == 4) {
            return new v9k(DEFAULT_INSTANCE, 3);
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
        synchronized (ContributionKindCapabilities.class) {
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
    public final ContributionCapabilities m4272n() {
        ContributionCapabilities contributionCapabilities = this.comments_;
        return contributionCapabilities == null ? ContributionCapabilities.m4258r() : contributionCapabilities;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: p */
    public final ContributionCapabilities m4273p() {
        ContributionCapabilities contributionCapabilities = this.notes_;
        return contributionCapabilities == null ? ContributionCapabilities.m4258r() : contributionCapabilities;
    }

    /* JADX INFO: renamed from: q */
    public final ContributionCapabilities m4274q() {
        ContributionCapabilities contributionCapabilities = this.reactions_;
        return contributionCapabilities == null ? ContributionCapabilities.m4258r() : contributionCapabilities;
    }

    /* JADX INFO: renamed from: r */
    public final boolean m4275r() {
        return (this.bitField0_ & 4) != 0;
    }

    /* JADX INFO: renamed from: s */
    public final boolean m4276s() {
        return (this.bitField0_ & 1) != 0;
    }

    /* JADX INFO: renamed from: t */
    public final boolean m4277t() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
