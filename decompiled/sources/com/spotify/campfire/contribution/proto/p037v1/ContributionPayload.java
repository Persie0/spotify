package com.spotify.campfire.contribution.proto.p037v1;

import com.google.protobuf.AbstractC0269h;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.yhk;
import p204p.z110;

/* JADX INFO: loaded from: classes5.dex */
public final class ContributionPayload extends AbstractC0269h implements sre0 {
    public static final int COMMENT_FIELD_NUMBER = 2;
    private static final ContributionPayload DEFAULT_INSTANCE;
    public static final int NOTE_FIELD_NUMBER = 1;
    private static volatile r2n0 PARSER = null;
    public static final int REACTION_FIELD_NUMBER = 3;
    private int payloadCase_ = 0;
    private Object payload_;

    static {
        ContributionPayload contributionPayload = new ContributionPayload();
        DEFAULT_INSTANCE = contributionPayload;
        AbstractC0269h.registerDefaultInstance(ContributionPayload.class, contributionPayload);
    }

    private ContributionPayload() {
    }

    /* JADX INFO: renamed from: n */
    public static void m4280n(ContributionPayload contributionPayload, CommentPayload commentPayload) {
        contributionPayload.getClass();
        commentPayload.getClass();
        contributionPayload.payload_ = commentPayload;
        contributionPayload.payloadCase_ = 2;
    }

    /* JADX INFO: renamed from: o */
    public static void m4281o(ContributionPayload contributionPayload, NotePayload notePayload) {
        contributionPayload.getClass();
        notePayload.getClass();
        contributionPayload.payload_ = notePayload;
        contributionPayload.payloadCase_ = 1;
    }

    /* JADX INFO: renamed from: p */
    public static void m4282p(ContributionPayload contributionPayload, ReactionPayload reactionPayload) {
        contributionPayload.getClass();
        reactionPayload.getClass();
        contributionPayload.payload_ = reactionPayload;
        contributionPayload.payloadCase_ = 3;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: r */
    public static ContributionPayload m4283r() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: renamed from: v */
    public static yhk m4284v() {
        return (yhk) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0001\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000", new Object[]{"payload_", "payloadCase_", NotePayload.class, CommentPayload.class, ReactionPayload.class});
        }
        if (iOrdinal == 3) {
            return new ContributionPayload();
        }
        if (iOrdinal == 4) {
            return new yhk(DEFAULT_INSTANCE);
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
        synchronized (ContributionPayload.class) {
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

    /* JADX INFO: renamed from: q */
    public final CommentPayload m4285q() {
        return this.payloadCase_ == 2 ? (CommentPayload) this.payload_ : CommentPayload.m4240o();
    }

    /* JADX INFO: renamed from: s */
    public final NotePayload m4286s() {
        return this.payloadCase_ == 1 ? (NotePayload) this.payload_ : NotePayload.m4351o();
    }

    /* JADX INFO: renamed from: t */
    public final int m4287t() {
        int i = this.payloadCase_;
        if (i == 0) {
            return 4;
        }
        int i2 = 1;
        if (i != 1) {
            i2 = 2;
            if (i != 2) {
                i2 = 3;
                if (i != 3) {
                    return 0;
                }
            }
        }
        return i2;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }

    /* JADX INFO: renamed from: u */
    public final ReactionPayload m4288u() {
        return this.payloadCase_ == 3 ? (ReactionPayload) this.payload_ : ReactionPayload.m4355o();
    }
}
