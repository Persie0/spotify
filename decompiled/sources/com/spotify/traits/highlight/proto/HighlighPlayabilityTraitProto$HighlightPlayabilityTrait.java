package com.spotify.traits.highlight.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.og20;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes2.dex */
public final class HighlighPlayabilityTraitProto$HighlightPlayabilityTrait extends AbstractC0269h implements sre0 {
    private static final HighlighPlayabilityTraitProto$HighlightPlayabilityTrait DEFAULT_INSTANCE;
    public static final int IS_PLAYABLE_FIELD_NUMBER = 1;
    public static final int PARENT_URI_FIELD_NUMBER = 2;
    private static volatile r2n0 PARSER = null;
    public static final int SEGMENT_BEGINNING_MILLIS_FIELD_NUMBER = 3;
    public static final int SEGMENT_END_MILLIS_FIELD_NUMBER = 4;
    private boolean isPlayable_;
    private String parentUri_ = "";
    private int segmentBeginningMillis_;
    private int segmentEndMillis_;

    static {
        HighlighPlayabilityTraitProto$HighlightPlayabilityTrait highlighPlayabilityTraitProto$HighlightPlayabilityTrait = new HighlighPlayabilityTraitProto$HighlightPlayabilityTrait();
        DEFAULT_INSTANCE = highlighPlayabilityTraitProto$HighlightPlayabilityTrait;
        AbstractC0269h.registerDefaultInstance(HighlighPlayabilityTraitProto$HighlightPlayabilityTrait.class, highlighPlayabilityTraitProto$HighlightPlayabilityTrait);
    }

    private HighlighPlayabilityTraitProto$HighlightPlayabilityTrait() {
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: r */
    public static HighlighPlayabilityTraitProto$HighlightPlayabilityTrait m21829r(byte[] bArr) {
        return (HighlighPlayabilityTraitProto$HighlightPlayabilityTrait) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u0007\u0002Ȉ\u0003\u0004\u0004\u0004", new Object[]{"isPlayable_", "parentUri_", "segmentBeginningMillis_", "segmentEndMillis_"});
        }
        if (iOrdinal == 3) {
            return new HighlighPlayabilityTraitProto$HighlightPlayabilityTrait();
        }
        if (iOrdinal == 4) {
            return new og20(13);
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
        synchronized (HighlighPlayabilityTraitProto$HighlightPlayabilityTrait.class) {
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

    public final boolean getIsPlayable() {
        return this.isPlayable_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final String m21830o() {
        return this.parentUri_;
    }

    /* JADX INFO: renamed from: p */
    public final int m21831p() {
        return this.segmentBeginningMillis_;
    }

    /* JADX INFO: renamed from: q */
    public final int m21832q() {
        return this.segmentEndMillis_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
