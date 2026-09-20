package com.spotify.liveroom.listeningparty.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.mpk0;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes2.dex */
public final class ObservePartyRequest extends AbstractC0269h implements sre0 {
    private static final ObservePartyRequest DEFAULT_INSTANCE;
    public static final int MESSAGE_TOKEN_FIELD_NUMBER = 2;
    private static volatile r2n0 PARSER = null;
    public static final int PARTY_URI_FIELD_NUMBER = 1;
    private String partyUri_ = "";
    private String messageToken_ = "";

    static {
        ObservePartyRequest observePartyRequest = new ObservePartyRequest();
        DEFAULT_INSTANCE = observePartyRequest;
        AbstractC0269h.registerDefaultInstance(ObservePartyRequest.class, observePartyRequest);
    }

    private ObservePartyRequest() {
    }

    /* JADX INFO: renamed from: n */
    public static void m13077n(ObservePartyRequest observePartyRequest, String str) {
        observePartyRequest.getClass();
        observePartyRequest.messageToken_ = str;
    }

    /* JADX INFO: renamed from: o */
    public static void m13078o(ObservePartyRequest observePartyRequest, String str) {
        observePartyRequest.getClass();
        observePartyRequest.partyUri_ = str;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static mpk0 m13080q() {
        return (mpk0) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ", new Object[]{"partyUri_", "messageToken_"});
        }
        if (iOrdinal == 3) {
            return new ObservePartyRequest();
        }
        if (iOrdinal == 4) {
            return new mpk0();
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
        synchronized (ObservePartyRequest.class) {
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
