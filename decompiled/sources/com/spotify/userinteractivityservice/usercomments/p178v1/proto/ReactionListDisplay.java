package com.spotify.userinteractivityservice.usercomments.p178v1.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.u6u0;
import p204p.z110;

/* JADX INFO: loaded from: classes11.dex */
public final class ReactionListDisplay extends AbstractC0269h implements sre0 {
    public static final int CREATE_DATE_FIELD_NUMBER = 2;
    private static final ReactionListDisplay DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER = null;
    public static final int REACTION_UNICODE_FIELD_NUMBER = 1;
    public static final int SHOW_AUTHOR_METADATA_FIELD_NUMBER = 102;
    public static final int USER_AUTHOR_METADATA_FIELD_NUMBER = 101;
    private Object authorMetadata_;
    private long createDate_;
    private int authorMetadataCase_ = 0;
    private String reactionUnicode_ = "";

    static {
        ReactionListDisplay reactionListDisplay = new ReactionListDisplay();
        DEFAULT_INSTANCE = reactionListDisplay;
        AbstractC0269h.registerDefaultInstance(ReactionListDisplay.class, reactionListDisplay);
    }

    private ReactionListDisplay() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0001\u0000\u0001f\u0004\u0000\u0000\u0000\u0001Ȉ\u0002\u0002e<\u0000f<\u0000", new Object[]{"authorMetadata_", "authorMetadataCase_", "reactionUnicode_", "createDate_", ReactionUserAuthorMetadata.class, ReactionShowAuthorMetadata.class});
        }
        if (iOrdinal == 3) {
            return new ReactionListDisplay();
        }
        if (iOrdinal == 4) {
            return new u6u0(DEFAULT_INSTANCE, 4);
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
        synchronized (ReactionListDisplay.class) {
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
    public final int m22215n() {
        int i = this.authorMetadataCase_;
        if (i == 0) {
            return 3;
        }
        if (i != 101) {
            return i != 102 ? 0 : 2;
        }
        return 1;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final long m22216o() {
        return this.createDate_;
    }

    /* JADX INFO: renamed from: p */
    public final String m22217p() {
        return this.reactionUnicode_;
    }

    /* JADX INFO: renamed from: q */
    public final ReactionShowAuthorMetadata m22218q() {
        return this.authorMetadataCase_ == 102 ? (ReactionShowAuthorMetadata) this.authorMetadata_ : ReactionShowAuthorMetadata.m22222n();
    }

    /* JADX INFO: renamed from: r */
    public final ReactionUserAuthorMetadata m22219r() {
        return this.authorMetadataCase_ == 101 ? (ReactionUserAuthorMetadata) this.authorMetadata_ : ReactionUserAuthorMetadata.m22226n();
    }

    /* JADX INFO: renamed from: s */
    public final boolean m22220s() {
        return this.authorMetadataCase_ == 102;
    }

    /* JADX INFO: renamed from: t */
    public final boolean m22221t() {
        return this.authorMetadataCase_ == 101;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
