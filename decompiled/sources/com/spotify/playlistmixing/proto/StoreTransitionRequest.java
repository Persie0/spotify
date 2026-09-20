package com.spotify.playlistmixing.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.cva;
import p204p.f951;
import p204p.gva;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes9.dex */
public final class StoreTransitionRequest extends AbstractC0269h implements sre0 {
    private static final StoreTransitionRequest DEFAULT_INSTANCE;
    public static final int ITEM_ID_FIELD_NUMBER = 2;
    private static volatile r2n0 PARSER = null;
    public static final int PLAYLIST_URI_FIELD_NUMBER = 1;
    public static final int TRANSITION_FIELD_NUMBER = 3;
    private String playlistUri_ = "";
    private gva itemId_ = gva.f84678b;
    private String transition_ = "";

    static {
        StoreTransitionRequest storeTransitionRequest = new StoreTransitionRequest();
        DEFAULT_INSTANCE = storeTransitionRequest;
        AbstractC0269h.registerDefaultInstance(StoreTransitionRequest.class, storeTransitionRequest);
    }

    private StoreTransitionRequest() {
    }

    /* JADX INFO: renamed from: n */
    public static void m19434n(StoreTransitionRequest storeTransitionRequest, cva cvaVar) {
        storeTransitionRequest.getClass();
        storeTransitionRequest.itemId_ = cvaVar;
    }

    /* JADX INFO: renamed from: o */
    public static void m19435o(StoreTransitionRequest storeTransitionRequest, String str) {
        storeTransitionRequest.getClass();
        str.getClass();
        storeTransitionRequest.playlistUri_ = str;
    }

    /* JADX INFO: renamed from: p */
    public static void m19436p(StoreTransitionRequest storeTransitionRequest, String str) {
        storeTransitionRequest.getClass();
        storeTransitionRequest.transition_ = str;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static f951 m19437q() {
        return (f951) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\n\u0003Ȉ", new Object[]{"playlistUri_", "itemId_", "transition_"});
        }
        if (iOrdinal == 3) {
            return new StoreTransitionRequest();
        }
        if (iOrdinal == 4) {
            return new f951(DEFAULT_INSTANCE);
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
        synchronized (StoreTransitionRequest.class) {
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
