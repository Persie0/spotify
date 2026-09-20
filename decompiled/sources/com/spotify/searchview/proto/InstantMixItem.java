package com.spotify.searchview.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;
import p204p.zc40;

/* JADX INFO: loaded from: classes10.dex */
public final class InstantMixItem extends AbstractC0269h implements sre0 {
    private static final InstantMixItem DEFAULT_INSTANCE;
    public static final int ENTITY_FIELD_NUMBER = 1;
    public static final int MESSAGEID_FIELD_NUMBER = 3;
    private static volatile r2n0 PARSER = null;
    public static final int SESSIONID_FIELD_NUMBER = 2;
    private int bitField0_;
    private Entity entity_;
    private String sessionId_ = "";
    private String messageId_ = "";

    static {
        InstantMixItem instantMixItem = new InstantMixItem();
        DEFAULT_INSTANCE = instantMixItem;
        AbstractC0269h.registerDefaultInstance(InstantMixItem.class, instantMixItem);
    }

    private InstantMixItem() {
    }

    /* JADX INFO: renamed from: n */
    public static InstantMixItem m20855n() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002Ȉ\u0003Ȉ", new Object[]{"bitField0_", "entity_", "sessionId_", "messageId_"});
        }
        if (iOrdinal == 3) {
            return new InstantMixItem();
        }
        if (iOrdinal == 4) {
            return new zc40(DEFAULT_INSTANCE, 14);
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
        synchronized (InstantMixItem.class) {
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

    public final String getMessageId() {
        return this.messageId_;
    }

    public final String getSessionId() {
        return this.sessionId_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final Entity m20856o() {
        Entity entity = this.entity_;
        return entity == null ? Entity.m20810u() : entity;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
