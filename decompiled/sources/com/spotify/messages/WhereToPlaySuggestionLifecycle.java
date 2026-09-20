package com.spotify.messages;

import com.google.protobuf.AbstractC0269h;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.wsd1;
import p204p.z110;

/* JADX INFO: loaded from: classes8.dex */
public final class WhereToPlaySuggestionLifecycle extends AbstractC0269h implements sre0 {
    public static final int CONFIDENCE_LEVEL_FIELD_NUMBER = 6;
    private static final WhereToPlaySuggestionLifecycle DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER = null;
    public static final int REASON_FIELD_NUMBER = 5;
    public static final int RECOMMENDATION_ID_FIELD_NUMBER = 4;
    public static final int STAGE_FIELD_NUMBER = 1;
    public static final int SURFACE_ID_FIELD_NUMBER = 3;
    public static final int TRIGGER_ID_FIELD_NUMBER = 2;
    private int bitField0_;
    private String stage_ = "";
    private String triggerId_ = "";
    private String surfaceId_ = "";
    private String recommendationId_ = "";
    private String reason_ = "";
    private String confidenceLevel_ = "";

    static {
        WhereToPlaySuggestionLifecycle whereToPlaySuggestionLifecycle = new WhereToPlaySuggestionLifecycle();
        DEFAULT_INSTANCE = whereToPlaySuggestionLifecycle;
        AbstractC0269h.registerDefaultInstance(WhereToPlaySuggestionLifecycle.class, whereToPlaySuggestionLifecycle);
    }

    private WhereToPlaySuggestionLifecycle() {
    }

    /* JADX INFO: renamed from: n */
    public static void m14846n(WhereToPlaySuggestionLifecycle whereToPlaySuggestionLifecycle, String str) {
        whereToPlaySuggestionLifecycle.getClass();
        whereToPlaySuggestionLifecycle.bitField0_ |= 32;
        whereToPlaySuggestionLifecycle.confidenceLevel_ = str;
    }

    /* JADX INFO: renamed from: o */
    public static void m14847o(WhereToPlaySuggestionLifecycle whereToPlaySuggestionLifecycle, String str) {
        whereToPlaySuggestionLifecycle.getClass();
        str.getClass();
        whereToPlaySuggestionLifecycle.bitField0_ |= 16;
        whereToPlaySuggestionLifecycle.reason_ = str;
    }

    /* JADX INFO: renamed from: p */
    public static void m14848p(WhereToPlaySuggestionLifecycle whereToPlaySuggestionLifecycle, String str) {
        whereToPlaySuggestionLifecycle.getClass();
        str.getClass();
        whereToPlaySuggestionLifecycle.bitField0_ |= 8;
        whereToPlaySuggestionLifecycle.recommendationId_ = str;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static void m14849q(WhereToPlaySuggestionLifecycle whereToPlaySuggestionLifecycle, String str) {
        whereToPlaySuggestionLifecycle.getClass();
        whereToPlaySuggestionLifecycle.bitField0_ |= 1;
        whereToPlaySuggestionLifecycle.stage_ = str;
    }

    /* JADX INFO: renamed from: r */
    public static void m14850r(WhereToPlaySuggestionLifecycle whereToPlaySuggestionLifecycle, String str) {
        whereToPlaySuggestionLifecycle.getClass();
        str.getClass();
        whereToPlaySuggestionLifecycle.bitField0_ |= 4;
        whereToPlaySuggestionLifecycle.surfaceId_ = str;
    }

    /* JADX INFO: renamed from: s */
    public static void m14851s(WhereToPlaySuggestionLifecycle whereToPlaySuggestionLifecycle, String str) {
        whereToPlaySuggestionLifecycle.getClass();
        str.getClass();
        whereToPlaySuggestionLifecycle.bitField0_ |= 2;
        whereToPlaySuggestionLifecycle.triggerId_ = str;
    }

    /* JADX INFO: renamed from: t */
    public static wsd1 m14852t() {
        return (wsd1) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဈ\u0005", new Object[]{"bitField0_", "stage_", "triggerId_", "surfaceId_", "recommendationId_", "reason_", "confidenceLevel_"});
        }
        if (iOrdinal == 3) {
            return new WhereToPlaySuggestionLifecycle();
        }
        if (iOrdinal == 4) {
            return new wsd1(DEFAULT_INSTANCE);
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
        synchronized (WhereToPlaySuggestionLifecycle.class) {
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

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
