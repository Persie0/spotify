package com.spotify.musicquizservice.p113v1;

import com.google.protobuf.AbstractC0269h;
import com.google.protobuf.Timestamp;
import p204p.ae50;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.six0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes8.dex */
public final class RoundMetadata extends AbstractC0269h implements sre0 {
    private static final RoundMetadata DEFAULT_INSTANCE;
    public static final int DESCRIPTION_FIELD_NUMBER = 4;
    public static final int END_ROUND_FIELD_NUMBER = 8;
    public static final int FACTS_FIELD_NUMBER = 5;
    public static final int FOREGROUND_IMAGE_URL_FIELD_NUMBER = 10;
    public static final int IMAGE_URL_FIELD_NUMBER = 3;
    public static final int INDEX_FIELD_NUMBER = 6;
    private static volatile r2n0 PARSER = null;
    public static final int QUESTIONS_FIELD_NUMBER = 7;
    public static final int ROUND_ID_FIELD_NUMBER = 1;
    public static final int TITLE_FIELD_NUMBER = 2;
    public static final int UPDATED_AT_FIELD_NUMBER = 9;
    private int bitField0_;
    private EndRound endRound_;
    private int index_;
    private Timestamp updatedAt_;
    private String roundId_ = "";
    private String title_ = "";
    private String imageUrl_ = "";
    private String description_ = "";
    private ae50 facts_ = AbstractC0269h.emptyProtobufList();
    private ae50 questions_ = AbstractC0269h.emptyProtobufList();
    private String foregroundImageUrl_ = "";

    static {
        RoundMetadata roundMetadata = new RoundMetadata();
        DEFAULT_INSTANCE = roundMetadata;
        AbstractC0269h.registerDefaultInstance(RoundMetadata.class, roundMetadata);
    }

    private RoundMetadata() {
    }

    /* JADX INFO: renamed from: n */
    public static RoundMetadata m15923n() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\n\u0000\u0001\u0001\n\n\u0000\u0002\u0000\u0001Ȉ\u0002Ȉ\u0003ለ\u0000\u0004Ȉ\u0005Ț\u0006\u0004\u0007\u001b\bဉ\u0001\tဉ\u0002\nለ\u0003", new Object[]{"bitField0_", "roundId_", "title_", "imageUrl_", "description_", "facts_", "index_", "questions_", Question.class, "endRound_", "updatedAt_", "foregroundImageUrl_"});
        }
        if (iOrdinal == 3) {
            return new RoundMetadata();
        }
        if (iOrdinal == 4) {
            return new six0(DEFAULT_INSTANCE, 5);
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
        synchronized (RoundMetadata.class) {
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

    public final String getImageUrl() {
        return this.imageUrl_;
    }

    public final int getIndex() {
        return this.index_;
    }

    public final String getTitle() {
        return this.title_;
    }

    public final Timestamp getUpdatedAt() {
        Timestamp timestamp = this.updatedAt_;
        return timestamp == null ? Timestamp.m1965q() : timestamp;
    }

    public final boolean hasImageUrl() {
        return (this.bitField0_ & 1) != 0;
    }

    public final boolean hasUpdatedAt() {
        return (this.bitField0_ & 4) != 0;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final ae50 m15924o() {
        return this.facts_;
    }

    /* JADX INFO: renamed from: p */
    public final ae50 m15925p() {
        return this.questions_;
    }

    /* JADX INFO: renamed from: q */
    public final String m15926q() {
        return this.roundId_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
