package com.spotify.cardconfig.p039v1.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.gjb;
import p204p.gva;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes5.dex */
public final class CardConfigProto$CardConfig extends AbstractC0269h implements sre0 {
    public static final int CARD_DATA_FIELD_NUMBER = 3;
    private static final CardConfigProto$CardConfig DEFAULT_INSTANCE;
    public static final int ENTITY_URI_FIELD_NUMBER = 2;
    private static volatile r2n0 PARSER = null;
    public static final int SHARE_FORMAT_ID_FIELD_NUMBER = 1;
    private String shareFormatId_ = "";
    private String entityUri_ = "";
    private gva cardData_ = gva.f84678b;

    static {
        CardConfigProto$CardConfig cardConfigProto$CardConfig = new CardConfigProto$CardConfig();
        DEFAULT_INSTANCE = cardConfigProto$CardConfig;
        AbstractC0269h.registerDefaultInstance(CardConfigProto$CardConfig.class, cardConfigProto$CardConfig);
    }

    private CardConfigProto$CardConfig() {
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static CardConfigProto$CardConfig m5544q(byte[] bArr) {
        return (CardConfigProto$CardConfig) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003\n", new Object[]{"shareFormatId_", "entityUri_", "cardData_"});
        }
        if (iOrdinal == 3) {
            return new CardConfigProto$CardConfig();
        }
        if (iOrdinal == 4) {
            return new gjb(DEFAULT_INSTANCE, 11);
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
        synchronized (CardConfigProto$CardConfig.class) {
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
    public final gva m5545n() {
        return this.cardData_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final String m5546o() {
        return this.entityUri_;
    }

    /* JADX INFO: renamed from: p */
    public final String m5547p() {
        return this.shareFormatId_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
