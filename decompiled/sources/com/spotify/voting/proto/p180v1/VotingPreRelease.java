package com.spotify.voting.proto.p180v1;

import com.google.protobuf.AbstractC0269h;
import com.google.protobuf.Timestamp;
import p204p.eyc1;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes11.dex */
public final class VotingPreRelease extends AbstractC0269h implements sre0 {
    private static final VotingPreRelease DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER = null;
    public static final int VOTING_SECTION_TEXT_FIELD_NUMBER = 1;
    public static final int VOTING_STARTS_UTC_FIELD_NUMBER = 2;
    private int bitField0_;
    private VotingSectionText votingSectionText_;
    private Timestamp votingStartsUtc_;

    static {
        VotingPreRelease votingPreRelease = new VotingPreRelease();
        DEFAULT_INSTANCE = votingPreRelease;
        AbstractC0269h.registerDefaultInstance(VotingPreRelease.class, votingPreRelease);
    }

    private VotingPreRelease() {
    }

    /* JADX INFO: renamed from: n */
    public static VotingPreRelease m22441n() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"bitField0_", "votingSectionText_", "votingStartsUtc_"});
        }
        if (iOrdinal == 3) {
            return new VotingPreRelease();
        }
        if (iOrdinal == 4) {
            return new eyc1(DEFAULT_INSTANCE, 6);
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
        synchronized (VotingPreRelease.class) {
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

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final VotingSectionText m22442o() {
        VotingSectionText votingSectionText = this.votingSectionText_;
        return votingSectionText == null ? VotingSectionText.m22447o() : votingSectionText;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
