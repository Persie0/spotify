package com.spotify.decipher.agent.p057v1;

import com.google.protobuf.AbstractC0269h;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.syy0;
import p204p.z110;

/* JADX INFO: loaded from: classes6.dex */
public final class SearchPlayableItemTappedEvent extends AbstractC0269h implements sre0 {
    private static final SearchPlayableItemTappedEvent DEFAULT_INSTANCE;
    public static final int MESSAGE_OPPORTUNITY_ID_FIELD_NUMBER = 5;
    private static volatile r2n0 PARSER = null;
    public static final int RESCUE_SESSION_ID_FIELD_NUMBER = 2;
    public static final int SUGGESTION_ID_FIELD_NUMBER = 3;
    public static final int TRIGGER_CORRELATION_ID_FIELD_NUMBER = 4;
    public static final int URI_FIELD_NUMBER = 1;
    private String uri_ = "";
    private String rescueSessionId_ = "";
    private String suggestionId_ = "";
    private String triggerCorrelationId_ = "";
    private String messageOpportunityId_ = "";

    static {
        SearchPlayableItemTappedEvent searchPlayableItemTappedEvent = new SearchPlayableItemTappedEvent();
        DEFAULT_INSTANCE = searchPlayableItemTappedEvent;
        AbstractC0269h.registerDefaultInstance(SearchPlayableItemTappedEvent.class, searchPlayableItemTappedEvent);
    }

    private SearchPlayableItemTappedEvent() {
    }

    /* JADX INFO: renamed from: n */
    public static void m9150n(SearchPlayableItemTappedEvent searchPlayableItemTappedEvent, String str) {
        searchPlayableItemTappedEvent.getClass();
        str.getClass();
        searchPlayableItemTappedEvent.uri_ = str;
    }

    /* JADX INFO: renamed from: o */
    public static syy0 m9151o() {
        return (syy0) DEFAULT_INSTANCE.createBuilder();
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004Ȉ\u0005Ȉ", new Object[]{"uri_", "rescueSessionId_", "suggestionId_", "triggerCorrelationId_", "messageOpportunityId_"});
        }
        if (iOrdinal == 3) {
            return new SearchPlayableItemTappedEvent();
        }
        if (iOrdinal == 4) {
            return new syy0(DEFAULT_INSTANCE);
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
        synchronized (SearchPlayableItemTappedEvent.class) {
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
