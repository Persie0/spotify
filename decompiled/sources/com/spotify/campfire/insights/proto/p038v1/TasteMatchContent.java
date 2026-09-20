package com.spotify.campfire.insights.proto.p038v1;

import com.google.protobuf.AbstractC0269h;
import p204p.ae50;
import p204p.by40;
import p204p.nv61;
import p204p.ore0;
import p204p.pre0;
import p204p.qn61;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes5.dex */
public final class TasteMatchContent extends AbstractC0269h implements sre0 {
    private static final TasteMatchContent DEFAULT_INSTANCE;
    public static final int MATCH_PERCENTAGE_FIELD_NUMBER = 2;
    public static final int MATCH_TIER_FIELD_NUMBER = 4;
    private static volatile r2n0 PARSER = null;
    public static final int TYPE_FIELD_NUMBER = 3;
    public static final int USERNAMES_FIELD_NUMBER = 1;
    private int matchPercentage_;
    private int matchTier_;
    private int type_;
    private ae50 usernames_ = AbstractC0269h.emptyProtobufList();

    static {
        TasteMatchContent tasteMatchContent = new TasteMatchContent();
        DEFAULT_INSTANCE = tasteMatchContent;
        AbstractC0269h.registerDefaultInstance(TasteMatchContent.class, tasteMatchContent);
    }

    private TasteMatchContent() {
    }

    /* JADX INFO: renamed from: n */
    public static TasteMatchContent m5479n() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0001\u0000\u0001Ț\u0002\u000b\u0003\f\u0004\f", new Object[]{"usernames_", "matchPercentage_", "type_", "matchTier_"});
        }
        if (iOrdinal == 3) {
            return new TasteMatchContent();
        }
        if (iOrdinal == 4) {
            return new qn61(DEFAULT_INSTANCE, 6);
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
        synchronized (TasteMatchContent.class) {
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
    public final int m5480o() {
        return this.matchPercentage_;
    }

    /* JADX INFO: renamed from: p */
    public final by40 m5481p() {
        by40 by40Var;
        int i = this.matchTier_;
        if (i == 0) {
            by40Var = by40.INSIGHT_TASTE_MATCH_TIER_UNSPECIFIED;
        } else if (i == 1) {
            by40Var = by40.INSIGHT_TASTE_MATCH_TIER_VERY_LOW;
        } else if (i == 2) {
            by40Var = by40.INSIGHT_TASTE_MATCH_TIER_LOW;
        } else if (i == 3) {
            by40Var = by40.INSIGHT_TASTE_MATCH_TIER_MEDIUM;
        } else if (i != 4) {
            by40Var = i != 5 ? null : by40.INSIGHT_TASTE_MATCH_TIER_VERY_HIGH;
        } else {
            by40Var = by40.INSIGHT_TASTE_MATCH_TIER_HIGH;
        }
        return by40Var == null ? by40.UNRECOGNIZED : by40Var;
    }

    /* JADX INFO: renamed from: q */
    public final nv61 m5482q() {
        nv61 nv61Var;
        int i = this.type_;
        if (i == 0) {
            nv61Var = nv61.TASTE_MATCH_TYPE_UNSPECIFIED;
        } else if (i == 1) {
            nv61Var = nv61.TASTE_MATCH_TYPE_TASTE_MATCH;
        } else if (i != 2) {
            nv61Var = i != 3 ? null : nv61.TASTE_MATCH_TYPE_MOST_TASTE_MATCH;
        } else {
            nv61Var = nv61.TASTE_MATCH_TYPE_LEAST_TASTE_MATCH;
        }
        return nv61Var == null ? nv61.UNRECOGNIZED : nv61Var;
    }

    /* JADX INFO: renamed from: r */
    public final ae50 m5483r() {
        return this.usernames_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
