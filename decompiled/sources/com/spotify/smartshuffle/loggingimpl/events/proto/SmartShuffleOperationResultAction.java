package com.spotify.smartshuffle.loggingimpl.events.proto;

import com.google.protobuf.AbstractC0269h;
import java.util.ArrayList;
import p204p.AbstractC1733c9;
import p204p.AbstractC2118m8;
import p204p.ae50;
import p204p.m231;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes10.dex */
public final class SmartShuffleOperationResultAction extends AbstractC0269h implements sre0 {
    private static final SmartShuffleOperationResultAction DEFAULT_INSTANCE;
    public static final int ENTITY_URI_FIELD_NUMBER = 4;
    public static final int FAILURE_REASONS_FIELD_NUMBER = 5;
    public static final int FIRST_REC_POSITION_FIELD_NUMBER = 7;
    public static final int METADATA_KEY_FIELD_NUMBER = 8;
    public static final int OPERATION_REASON_FIELD_NUMBER = 9;
    public static final int OPERATION_SUCCEEDED_FIELD_NUMBER = 2;
    private static volatile r2n0 PARSER = null;
    public static final int PLAY_STATE_FIELD_NUMBER = 6;
    public static final int SMART_SHUFFLE_STATE_FIELD_NUMBER = 1;
    public static final int TECH_STACK_FIELD_NUMBER = 3;
    public static final int USER_INTERACTION_ID_FIELD_NUMBER = 10;
    private int bitField0_;
    private int firstRecPosition_;
    private boolean operationSucceeded_;
    private boolean smartShuffleState_;
    private String techStack_ = "";
    private String entityUri_ = "";
    private ae50 failureReasons_ = AbstractC0269h.emptyProtobufList();
    private String playState_ = "";
    private String metadataKey_ = "";
    private String operationReason_ = "";
    private String userInteractionId_ = "";

    static {
        SmartShuffleOperationResultAction smartShuffleOperationResultAction = new SmartShuffleOperationResultAction();
        DEFAULT_INSTANCE = smartShuffleOperationResultAction;
        AbstractC0269h.registerDefaultInstance(SmartShuffleOperationResultAction.class, smartShuffleOperationResultAction);
    }

    private SmartShuffleOperationResultAction() {
    }

    /* JADX INFO: renamed from: n */
    public static void m21418n(SmartShuffleOperationResultAction smartShuffleOperationResultAction, ArrayList arrayList) {
        ae50 ae50Var = smartShuffleOperationResultAction.failureReasons_;
        if (!((AbstractC1733c9) ae50Var).f35342a) {
            smartShuffleOperationResultAction.failureReasons_ = AbstractC0269h.mutableCopy(ae50Var);
        }
        AbstractC2118m8.addAll(arrayList, smartShuffleOperationResultAction.failureReasons_);
    }

    /* JADX INFO: renamed from: o */
    public static void m21419o(SmartShuffleOperationResultAction smartShuffleOperationResultAction, String str) {
        smartShuffleOperationResultAction.getClass();
        smartShuffleOperationResultAction.bitField0_ |= 8;
        smartShuffleOperationResultAction.entityUri_ = str;
    }

    /* JADX INFO: renamed from: p */
    public static void m21420p(SmartShuffleOperationResultAction smartShuffleOperationResultAction, String str) {
        smartShuffleOperationResultAction.getClass();
        smartShuffleOperationResultAction.bitField0_ |= 128;
        smartShuffleOperationResultAction.operationReason_ = str;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static void m21421q(SmartShuffleOperationResultAction smartShuffleOperationResultAction, boolean z) {
        smartShuffleOperationResultAction.bitField0_ |= 2;
        smartShuffleOperationResultAction.operationSucceeded_ = z;
    }

    /* JADX INFO: renamed from: r */
    public static void m21422r(SmartShuffleOperationResultAction smartShuffleOperationResultAction, String str) {
        smartShuffleOperationResultAction.getClass();
        smartShuffleOperationResultAction.bitField0_ |= 16;
        smartShuffleOperationResultAction.playState_ = str;
    }

    /* JADX INFO: renamed from: s */
    public static void m21423s(SmartShuffleOperationResultAction smartShuffleOperationResultAction, boolean z) {
        smartShuffleOperationResultAction.bitField0_ |= 1;
        smartShuffleOperationResultAction.smartShuffleState_ = z;
    }

    /* JADX INFO: renamed from: t */
    public static void m21424t(SmartShuffleOperationResultAction smartShuffleOperationResultAction) {
        smartShuffleOperationResultAction.getClass();
        smartShuffleOperationResultAction.bitField0_ |= 4;
        smartShuffleOperationResultAction.techStack_ = "PLAYER_API";
    }

    /* JADX INFO: renamed from: u */
    public static void m21425u(SmartShuffleOperationResultAction smartShuffleOperationResultAction, String str) {
        smartShuffleOperationResultAction.getClass();
        str.getClass();
        smartShuffleOperationResultAction.bitField0_ |= 256;
        smartShuffleOperationResultAction.userInteractionId_ = str;
    }

    /* JADX INFO: renamed from: v */
    public static m231 m21426v() {
        return (m231) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\n\u0000\u0001\u0001\n\n\u0000\u0001\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005\u001a\u0006ဈ\u0004\u0007င\u0005\bဈ\u0006\tဈ\u0007\nဈ\b", new Object[]{"bitField0_", "smartShuffleState_", "operationSucceeded_", "techStack_", "entityUri_", "failureReasons_", "playState_", "firstRecPosition_", "metadataKey_", "operationReason_", "userInteractionId_"});
        }
        if (iOrdinal == 3) {
            return new SmartShuffleOperationResultAction();
        }
        if (iOrdinal == 4) {
            return new m231(DEFAULT_INSTANCE);
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
        synchronized (SmartShuffleOperationResultAction.class) {
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
