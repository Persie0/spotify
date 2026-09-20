package com.spotify.campfire.contribution.proto.p037v1;

import com.google.protobuf.AbstractC0269h;
import com.google.protobuf.Timestamp;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.v9k;
import p204p.z110;
import p204p.zik;

/* JADX INFO: loaded from: classes5.dex */
public final class Contribution extends AbstractC0269h implements sre0 {
    public static final int CONTRIBUTION_REFERENCE_FIELD_NUMBER = 1;
    public static final int CREATED_AT_FIELD_NUMBER = 5;
    public static final int CREATOR_URI_FIELD_NUMBER = 4;
    private static final Contribution DEFAULT_INSTANCE;
    public static final int MODIFIED_AT_FIELD_NUMBER = 6;
    private static volatile r2n0 PARSER = null;
    public static final int PAYLOAD_FIELD_NUMBER = 3;
    public static final int SOURCE_FIELD_NUMBER = 7;
    public static final int TARGET_FIELD_NUMBER = 2;
    private int bitField0_;
    private ContributionReference contributionReference_;
    private Timestamp createdAt_;
    private String creatorUri_ = "";
    private Timestamp modifiedAt_;
    private ContributionPayload payload_;
    private int source_;
    private ContributionTarget target_;

    static {
        Contribution contribution = new Contribution();
        DEFAULT_INSTANCE = contribution;
        AbstractC0269h.registerDefaultInstance(Contribution.class, contribution);
    }

    private Contribution() {
    }

    /* JADX INFO: renamed from: p */
    public static Contribution m4252p() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004Ȉ\u0005ဉ\u0003\u0006ဉ\u0004\u0007\f", new Object[]{"bitField0_", "contributionReference_", "target_", "payload_", "creatorUri_", "createdAt_", "modifiedAt_", "source_"});
        }
        if (iOrdinal == 3) {
            return new Contribution();
        }
        if (iOrdinal == 4) {
            return new v9k(DEFAULT_INSTANCE, 1);
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
        synchronized (Contribution.class) {
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

    public final Timestamp getCreatedAt() {
        Timestamp timestamp = this.createdAt_;
        return timestamp == null ? Timestamp.m1965q() : timestamp;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.sre0
    public final /* bridge */ /* synthetic */ pre0 getDefaultInstanceForType() {
        return getDefaultInstanceForType();
    }

    public final Timestamp getModifiedAt() {
        Timestamp timestamp = this.modifiedAt_;
        return timestamp == null ? Timestamp.m1965q() : timestamp;
    }

    public final boolean hasCreatedAt() {
        return (this.bitField0_ & 8) != 0;
    }

    public final boolean hasModifiedAt() {
        return (this.bitField0_ & 16) != 0;
    }

    /* JADX INFO: renamed from: n */
    public final ContributionReference m4253n() {
        ContributionReference contributionReference = this.contributionReference_;
        return contributionReference == null ? ContributionReference.m4290p() : contributionReference;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final String m4254o() {
        return this.creatorUri_;
    }

    /* JADX INFO: renamed from: q */
    public final ContributionPayload m4255q() {
        ContributionPayload contributionPayload = this.payload_;
        return contributionPayload == null ? ContributionPayload.m4283r() : contributionPayload;
    }

    /* JADX INFO: renamed from: r */
    public final zik m4256r() {
        zik zikVarM96221a = zik.m96221a(this.source_);
        return zikVarM96221a == null ? zik.UNRECOGNIZED : zikVarM96221a;
    }

    /* JADX INFO: renamed from: s */
    public final ContributionTarget m4257s() {
        ContributionTarget contributionTarget = this.target_;
        return contributionTarget == null ? ContributionTarget.m4297t() : contributionTarget;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
