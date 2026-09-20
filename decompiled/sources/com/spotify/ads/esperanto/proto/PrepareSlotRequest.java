package com.spotify.ads.esperanto.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.ihc0;
import p204p.lrq0;
import p204p.mrq0;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes.dex */
public final class PrepareSlotRequest extends AbstractC0269h implements sre0 {
    private static final PrepareSlotRequest DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER = null;
    public static final int SLOT_ID_FIELD_NUMBER = 1;
    public static final int TARGETING_MAP_FIELD_NUMBER = 2;
    private ihc0 targetingMap_ = ihc0.f102235b;
    private String slotId_ = "";

    static {
        PrepareSlotRequest prepareSlotRequest = new PrepareSlotRequest();
        DEFAULT_INSTANCE = prepareSlotRequest;
        AbstractC0269h.registerDefaultInstance(PrepareSlotRequest.class, prepareSlotRequest);
    }

    private PrepareSlotRequest() {
    }

    /* JADX INFO: renamed from: n */
    public static ihc0 m2677n(PrepareSlotRequest prepareSlotRequest) {
        ihc0 ihc0Var = prepareSlotRequest.targetingMap_;
        if (!ihc0Var.f102236a) {
            prepareSlotRequest.targetingMap_ = ihc0Var.m50613h();
        }
        return prepareSlotRequest.targetingMap_;
    }

    /* JADX INFO: renamed from: o */
    public static void m2678o(PrepareSlotRequest prepareSlotRequest, String str) {
        prepareSlotRequest.getClass();
        str.getClass();
        prepareSlotRequest.slotId_ = str;
    }

    /* JADX INFO: renamed from: p */
    public static lrq0 m2679p() {
        return (lrq0) DEFAULT_INSTANCE.createBuilder();
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0001Ȉ\u00022", new Object[]{"slotId_", "targetingMap_", mrq0.f146593a});
        }
        if (iOrdinal == 3) {
            return new PrepareSlotRequest();
        }
        if (iOrdinal == 4) {
            return new lrq0(DEFAULT_INSTANCE);
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
        synchronized (PrepareSlotRequest.class) {
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
