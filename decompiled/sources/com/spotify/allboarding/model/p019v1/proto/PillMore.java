package com.spotify.allboarding.model.p019v1.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.ae50;
import p204p.hnn0;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes3.dex */
public final class PillMore extends AbstractC0269h implements sre0 {
    public static final int COLOR_FIELD_NUMBER = 4;
    private static final PillMore DEFAULT_INSTANCE;
    public static final int EXPANSION_LIMIT_FIELD_NUMBER = 6;
    public static final int LOGGING_FIELD_NUMBER = 7;
    private static volatile r2n0 PARSER = null;
    public static final int RELATED_ITEMS_FIELD_NUMBER = 5;
    public static final int TEXT_FIELD_NUMBER = 2;
    public static final int URI_FIELD_NUMBER = 1;
    private int bitField0_;
    private int expansionLimit_;
    private Logging logging_;
    private String uri_ = "";
    private String text_ = "";
    private String color_ = "";
    private ae50 relatedItems_ = AbstractC0269h.emptyProtobufList();

    static {
        PillMore pillMore = new PillMore();
        DEFAULT_INSTANCE = pillMore;
        AbstractC0269h.registerDefaultInstance(PillMore.class, pillMore);
    }

    private PillMore() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0001\u0001\u0007\u0006\u0000\u0001\u0000\u0001Ȉ\u0002Ȉ\u0004Ȉ\u0005\u001b\u0006\u0004\u0007ဉ\u0000", new Object[]{"bitField0_", "uri_", "text_", "color_", "relatedItems_", Pill.class, "expansionLimit_", "logging_"});
        }
        if (iOrdinal == 3) {
            return new PillMore();
        }
        if (iOrdinal == 4) {
            return new hnn0(DEFAULT_INSTANCE, 12);
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
        synchronized (PillMore.class) {
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
