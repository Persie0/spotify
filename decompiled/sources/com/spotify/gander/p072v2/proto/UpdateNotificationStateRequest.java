package com.spotify.gander.p072v2.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.AbstractC1733c9;
import p204p.AbstractC2118m8;
import p204p.ae50;
import p204p.cca1;
import p204p.dca1;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes2.dex */
public final class UpdateNotificationStateRequest extends AbstractC0269h implements sre0 {
    private static final UpdateNotificationStateRequest DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER = null;
    public static final int STATE_FIELD_NUMBER = 2;
    public static final int STORAGE_IDS_FIELD_NUMBER = 1;
    private int state_;
    private ae50 storageIds_ = AbstractC0269h.emptyProtobufList();

    static {
        UpdateNotificationStateRequest updateNotificationStateRequest = new UpdateNotificationStateRequest();
        DEFAULT_INSTANCE = updateNotificationStateRequest;
        AbstractC0269h.registerDefaultInstance(UpdateNotificationStateRequest.class, updateNotificationStateRequest);
    }

    private UpdateNotificationStateRequest() {
    }

    /* JADX INFO: renamed from: n */
    public static void m11132n(UpdateNotificationStateRequest updateNotificationStateRequest, Iterable iterable) {
        ae50 ae50Var = updateNotificationStateRequest.storageIds_;
        if (!((AbstractC1733c9) ae50Var).f35342a) {
            updateNotificationStateRequest.storageIds_ = AbstractC0269h.mutableCopy(ae50Var);
        }
        AbstractC2118m8.addAll(iterable, updateNotificationStateRequest.storageIds_);
    }

    /* JADX INFO: renamed from: o */
    public static void m11133o(UpdateNotificationStateRequest updateNotificationStateRequest, String str) {
        updateNotificationStateRequest.getClass();
        str.getClass();
        ae50 ae50Var = updateNotificationStateRequest.storageIds_;
        if (!((AbstractC1733c9) ae50Var).f35342a) {
            updateNotificationStateRequest.storageIds_ = AbstractC0269h.mutableCopy(ae50Var);
        }
        updateNotificationStateRequest.storageIds_.add(str);
    }

    /* JADX INFO: renamed from: p */
    public static void m11134p(UpdateNotificationStateRequest updateNotificationStateRequest, dca1 dca1Var) {
        updateNotificationStateRequest.getClass();
        updateNotificationStateRequest.state_ = dca1Var.getNumber();
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: r */
    public static cca1 m11136r() {
        return (cca1) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001Ț\u0002\f", new Object[]{"storageIds_", "state_"});
        }
        if (iOrdinal == 3) {
            return new UpdateNotificationStateRequest();
        }
        if (iOrdinal == 4) {
            return new cca1();
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
        synchronized (UpdateNotificationStateRequest.class) {
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
