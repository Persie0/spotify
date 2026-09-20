package com.spotify.sharecard.config.impl.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.y401;
import p204p.z110;

/* JADX INFO: loaded from: classes10.dex */
public final class SetCardConfigRequest extends AbstractC0269h implements sre0 {
    public static final int CARD_DATA_FIELD_NUMBER = 3;
    private static final SetCardConfigRequest DEFAULT_INSTANCE;
    public static final int ENTITY_URI_FIELD_NUMBER = 2;
    private static volatile r2n0 PARSER = null;
    public static final int SHARE_FORMAT_ID_FIELD_NUMBER = 1;
    private int bitField0_;
    private SetCardData cardData_;
    private String shareFormatId_ = "";
    private String entityUri_ = "";

    static {
        SetCardConfigRequest setCardConfigRequest = new SetCardConfigRequest();
        DEFAULT_INSTANCE = setCardConfigRequest;
        AbstractC0269h.registerDefaultInstance(SetCardConfigRequest.class, setCardConfigRequest);
    }

    private SetCardConfigRequest() {
    }

    /* JADX INFO: renamed from: n */
    public static void m21170n(SetCardConfigRequest setCardConfigRequest, SetCardData setCardData) {
        setCardConfigRequest.getClass();
        setCardData.getClass();
        setCardConfigRequest.cardData_ = setCardData;
        setCardConfigRequest.bitField0_ |= 1;
    }

    /* JADX INFO: renamed from: o */
    public static void m21171o(SetCardConfigRequest setCardConfigRequest, String str) {
        setCardConfigRequest.getClass();
        setCardConfigRequest.entityUri_ = str;
    }

    /* JADX INFO: renamed from: p */
    public static void m21172p(SetCardConfigRequest setCardConfigRequest, String str) {
        setCardConfigRequest.getClass();
        setCardConfigRequest.shareFormatId_ = str;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static y401 m21173q() {
        return (y401) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003ဉ\u0000", new Object[]{"bitField0_", "shareFormatId_", "entityUri_", "cardData_"});
        }
        if (iOrdinal == 3) {
            return new SetCardConfigRequest();
        }
        if (iOrdinal == 4) {
            return new y401(DEFAULT_INSTANCE);
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
        synchronized (SetCardConfigRequest.class) {
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
