package com.spotify.automix.esperanto.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.dbw;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes5.dex */
public final class EsAutomix$AdjustTransitionRecipeForItemSpeedsResponse extends AbstractC0269h implements sre0 {
    private static final EsAutomix$AdjustTransitionRecipeForItemSpeedsResponse DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER = null;
    public static final int TRANSITION_RECIPE_FIELD_NUMBER = 1;
    private String transitionRecipe_ = "";

    static {
        EsAutomix$AdjustTransitionRecipeForItemSpeedsResponse esAutomix$AdjustTransitionRecipeForItemSpeedsResponse = new EsAutomix$AdjustTransitionRecipeForItemSpeedsResponse();
        DEFAULT_INSTANCE = esAutomix$AdjustTransitionRecipeForItemSpeedsResponse;
        AbstractC0269h.registerDefaultInstance(EsAutomix$AdjustTransitionRecipeForItemSpeedsResponse.class, esAutomix$AdjustTransitionRecipeForItemSpeedsResponse);
    }

    private EsAutomix$AdjustTransitionRecipeForItemSpeedsResponse() {
    }

    /* JADX INFO: renamed from: o */
    public static EsAutomix$AdjustTransitionRecipeForItemSpeedsResponse m3663o(byte[] bArr) {
        return (EsAutomix$AdjustTransitionRecipeForItemSpeedsResponse) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr);
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"transitionRecipe_"});
        }
        if (iOrdinal == 3) {
            return new EsAutomix$AdjustTransitionRecipeForItemSpeedsResponse();
        }
        if (iOrdinal == 4) {
            return new dbw(DEFAULT_INSTANCE, 29);
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
        synchronized (EsAutomix$AdjustTransitionRecipeForItemSpeedsResponse.class) {
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
    public final String m3664n() {
        return this.transitionRecipe_;
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
