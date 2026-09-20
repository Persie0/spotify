package com.spotify.musicquizservice.p113v1;

import com.google.protobuf.AbstractC0269h;
import p204p.ae50;
import p204p.d2i0;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes8.dex */
public final class MotivationalMessages extends AbstractC0269h implements sre0 {
    private static final MotivationalMessages DEFAULT_INSTANCE;
    public static final int GOOD_PERFORMANCE_FIELD_NUMBER = 1;
    public static final int MESSAGES_FIELD_NUMBER = 4;
    private static volatile r2n0 PARSER = null;
    public static final int STRUGGLING_FIELD_NUMBER = 2;
    public static final int TRICKY_ROUND_FIELD_NUMBER = 3;
    private String goodPerformance_ = "";
    private String struggling_ = "";
    private String trickyRound_ = "";
    private ae50 messages_ = AbstractC0269h.emptyProtobufList();

    static {
        MotivationalMessages motivationalMessages = new MotivationalMessages();
        DEFAULT_INSTANCE = motivationalMessages;
        AbstractC0269h.registerDefaultInstance(MotivationalMessages.class, motivationalMessages);
    }

    private MotivationalMessages() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0001\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004\u001b", new Object[]{"goodPerformance_", "struggling_", "trickyRound_", "messages_", MotivationalMessage.class});
        }
        if (iOrdinal == 3) {
            return new MotivationalMessages();
        }
        if (iOrdinal == 4) {
            return new d2i0(DEFAULT_INSTANCE, 0);
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
        synchronized (MotivationalMessages.class) {
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
