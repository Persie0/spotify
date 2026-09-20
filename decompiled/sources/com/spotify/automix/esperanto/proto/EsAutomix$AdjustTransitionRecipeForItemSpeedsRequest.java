package com.spotify.automix.esperanto.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.hiw;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes5.dex */
public final class EsAutomix$AdjustTransitionRecipeForItemSpeedsRequest extends AbstractC0269h implements sre0 {
    private static final EsAutomix$AdjustTransitionRecipeForItemSpeedsRequest DEFAULT_INSTANCE;
    public static final int NEW_ITEM_SPEED_A_FIELD_NUMBER = 2;
    public static final int NEW_ITEM_SPEED_B_FIELD_NUMBER = 3;
    private static volatile r2n0 PARSER = null;
    public static final int TRANSITION_RECIPE_FIELD_NUMBER = 1;
    private int bitField0_;
    private double newItemSpeedA_;
    private double newItemSpeedB_;
    private String transitionRecipe_ = "";

    static {
        EsAutomix$AdjustTransitionRecipeForItemSpeedsRequest esAutomix$AdjustTransitionRecipeForItemSpeedsRequest = new EsAutomix$AdjustTransitionRecipeForItemSpeedsRequest();
        DEFAULT_INSTANCE = esAutomix$AdjustTransitionRecipeForItemSpeedsRequest;
        AbstractC0269h.registerDefaultInstance(EsAutomix$AdjustTransitionRecipeForItemSpeedsRequest.class, esAutomix$AdjustTransitionRecipeForItemSpeedsRequest);
    }

    private EsAutomix$AdjustTransitionRecipeForItemSpeedsRequest() {
    }

    /* JADX INFO: renamed from: n */
    public static void m3659n(EsAutomix$AdjustTransitionRecipeForItemSpeedsRequest esAutomix$AdjustTransitionRecipeForItemSpeedsRequest, double d) {
        esAutomix$AdjustTransitionRecipeForItemSpeedsRequest.bitField0_ |= 1;
        esAutomix$AdjustTransitionRecipeForItemSpeedsRequest.newItemSpeedA_ = d;
    }

    /* JADX INFO: renamed from: o */
    public static void m3660o(EsAutomix$AdjustTransitionRecipeForItemSpeedsRequest esAutomix$AdjustTransitionRecipeForItemSpeedsRequest, double d) {
        esAutomix$AdjustTransitionRecipeForItemSpeedsRequest.bitField0_ |= 2;
        esAutomix$AdjustTransitionRecipeForItemSpeedsRequest.newItemSpeedB_ = d;
    }

    /* JADX INFO: renamed from: p */
    public static void m3661p(EsAutomix$AdjustTransitionRecipeForItemSpeedsRequest esAutomix$AdjustTransitionRecipeForItemSpeedsRequest, String str) {
        esAutomix$AdjustTransitionRecipeForItemSpeedsRequest.getClass();
        esAutomix$AdjustTransitionRecipeForItemSpeedsRequest.transitionRecipe_ = str;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static hiw m3662q() {
        return (hiw) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002က\u0000\u0003က\u0001", new Object[]{"bitField0_", "transitionRecipe_", "newItemSpeedA_", "newItemSpeedB_"});
        }
        if (iOrdinal == 3) {
            return new EsAutomix$AdjustTransitionRecipeForItemSpeedsRequest();
        }
        if (iOrdinal == 4) {
            return new hiw(DEFAULT_INSTANCE);
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
        synchronized (EsAutomix$AdjustTransitionRecipeForItemSpeedsRequest.class) {
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
