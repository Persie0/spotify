package com.spotify.adsinternal.p015v1;

import com.google.protobuf.AbstractC0269h;
import p204p.eme;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes4.dex */
public final class ClientPayload extends AbstractC0269h implements sre0 {
    public static final int CAROUSEL_ITEM_FIELD_NUMBER = 2;
    private static final ClientPayload DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER = null;
    public static final int SURVEY_FIELD_NUMBER = 1;
    private int maybePayloadCase_ = 0;
    private Object maybePayload_;

    static {
        ClientPayload clientPayload = new ClientPayload();
        DEFAULT_INSTANCE = clientPayload;
        AbstractC0269h.registerDefaultInstance(ClientPayload.class, clientPayload);
    }

    private ClientPayload() {
    }

    /* JADX INFO: renamed from: n */
    public static void m2847n(ClientPayload clientPayload, CarouselItem carouselItem) {
        clientPayload.getClass();
        carouselItem.getClass();
        clientPayload.maybePayload_ = carouselItem;
        clientPayload.maybePayloadCase_ = 2;
    }

    /* JADX INFO: renamed from: o */
    public static void m2848o(ClientPayload clientPayload, Survey survey) {
        clientPayload.getClass();
        survey.getClass();
        clientPayload.maybePayload_ = survey;
        clientPayload.maybePayloadCase_ = 1;
    }

    /* JADX INFO: renamed from: p */
    public static eme m2849p() {
        return (eme) DEFAULT_INSTANCE.createBuilder();
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000", new Object[]{"maybePayload_", "maybePayloadCase_", Survey.class, CarouselItem.class});
        }
        if (iOrdinal == 3) {
            return new ClientPayload();
        }
        if (iOrdinal == 4) {
            return new eme(DEFAULT_INSTANCE);
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
        synchronized (ClientPayload.class) {
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
