package com.spotify.offline_esperanto.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.vlw;
import p204p.wlw;
import p204p.z110;

/* JADX INFO: loaded from: classes2.dex */
public final class EsOffline$Context extends AbstractC0269h implements sre0 {
    private static final EsOffline$Context DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER = null;
    public static final int PERCENT_COMPLETE_FIELD_NUMBER = 3;
    public static final int STATE_FIELD_NUMBER = 2;
    public static final int URI_FIELD_NUMBER = 1;
    private float percentComplete_;
    private int state_;
    private String uri_ = "";

    static {
        EsOffline$Context esOffline$Context = new EsOffline$Context();
        DEFAULT_INSTANCE = esOffline$Context;
        AbstractC0269h.registerDefaultInstance(EsOffline$Context.class, esOffline$Context);
    }

    private EsOffline$Context() {
    }

    /* JADX INFO: renamed from: o */
    public static EsOffline$Context m16092o() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\f\u0003\u0001", new Object[]{"uri_", "state_", "percentComplete_"});
        }
        if (iOrdinal == 3) {
            return new EsOffline$Context();
        }
        if (iOrdinal == 4) {
            return new vlw(1);
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
        synchronized (EsOffline$Context.class) {
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

    public final String getUri() {
        return this.uri_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: p */
    public final float m16093p() {
        return this.percentComplete_;
    }

    /* JADX INFO: renamed from: q */
    public final wlw m16094q() {
        wlw wlwVar;
        int i = this.state_;
        if (i == 0) {
            wlwVar = wlw.NOT_DOWNLOADED;
        } else if (i == 1) {
            wlwVar = wlw.ERROR;
        } else if (i == 2) {
            wlwVar = wlw.REQUESTED;
        } else if (i == 3) {
            wlwVar = wlw.DOWNLOADED;
        } else if (i != 4) {
            wlwVar = i != 5 ? null : wlw.WAITING;
        } else {
            wlwVar = wlw.DOWNLOADING;
        }
        return wlwVar == null ? wlw.UNRECOGNIZED : wlwVar;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
