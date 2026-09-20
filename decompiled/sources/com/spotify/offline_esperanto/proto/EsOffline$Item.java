package com.spotify.offline_esperanto.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.gmw;
import p204p.hmw;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.vlw;
import p204p.z110;

/* JADX INFO: loaded from: classes2.dex */
public final class EsOffline$Item extends AbstractC0269h implements sre0 {
    private static final EsOffline$Item DEFAULT_INSTANCE;
    public static final int KIND_FIELD_NUMBER = 5;
    private static volatile r2n0 PARSER = null;
    public static final int STATE_FIELD_NUMBER = 2;
    public static final int SYNC_PROGRESS_FIELD_NUMBER = 4;
    public static final int URI_FIELD_NUMBER = 1;
    public static final int VIDEO_STATE_FIELD_NUMBER = 3;
    private int kind_;
    private int state_;
    private int syncProgress_;
    private String uri_ = "";
    private int videoState_;

    static {
        EsOffline$Item esOffline$Item = new EsOffline$Item();
        DEFAULT_INSTANCE = esOffline$Item;
        AbstractC0269h.registerDefaultInstance(EsOffline$Item.class, esOffline$Item);
    }

    private EsOffline$Item() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001Ȉ\u0002\f\u0003\f\u0004\u000b\u0005\f", new Object[]{"uri_", "state_", "videoState_", "syncProgress_", "kind_"});
        }
        if (iOrdinal == 3) {
            return new EsOffline$Item();
        }
        if (iOrdinal == 4) {
            return new vlw(14);
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
        synchronized (EsOffline$Item.class) {
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

    public final int getSyncProgress() {
        return this.syncProgress_;
    }

    public final String getUri() {
        return this.uri_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final gmw m16166o() {
        gmw gmwVarM45283a = gmw.m45283a(this.kind_);
        return gmwVarM45283a == null ? gmw.UNRECOGNIZED : gmwVarM45283a;
    }

    /* JADX INFO: renamed from: p */
    public final hmw m16167p() {
        hmw hmwVar;
        switch (this.state_) {
            case 0:
                hmwVar = hmw.NOT_DOWNLOADED;
                break;
            case 1:
                hmwVar = hmw.ERROR;
                break;
            case 2:
                hmwVar = hmw.DOWNLOADED_EXPIRED;
                break;
            case 3:
                hmwVar = hmw.DOWNLOADED;
                break;
            case 4:
                hmwVar = hmw.WAITING_FOR_REDOWNLOAD;
                break;
            case 5:
                hmwVar = hmw.DOWNLOADING;
                break;
            case 6:
                hmwVar = hmw.WAITING;
                break;
            case 7:
                hmwVar = hmw.WAITING_LIMIT_EXCEEDED;
                break;
            default:
                hmwVar = null;
                break;
        }
        return hmwVar == null ? hmw.UNRECOGNIZED : hmwVar;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
