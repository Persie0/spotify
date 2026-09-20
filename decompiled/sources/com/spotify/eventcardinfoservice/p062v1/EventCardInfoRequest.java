package com.spotify.eventcardinfoservice.p062v1;

import com.google.protobuf.AbstractC0269h;
import p204p.i4x;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes6.dex */
public final class EventCardInfoRequest extends AbstractC0269h implements sre0 {
    public static final int ARTISTID_FIELD_NUMBER = 1;
    private static final EventCardInfoRequest DEFAULT_INSTANCE;
    public static final int ENABLENEARBY_FIELD_NUMBER = 2;
    private static volatile r2n0 PARSER;
    private String artistId_ = "";
    private boolean enableNearby_;

    static {
        EventCardInfoRequest eventCardInfoRequest = new EventCardInfoRequest();
        DEFAULT_INSTANCE = eventCardInfoRequest;
        AbstractC0269h.registerDefaultInstance(EventCardInfoRequest.class, eventCardInfoRequest);
    }

    private EventCardInfoRequest() {
    }

    /* JADX INFO: renamed from: n */
    public static void m9736n(EventCardInfoRequest eventCardInfoRequest, String str) {
        eventCardInfoRequest.getClass();
        str.getClass();
        eventCardInfoRequest.artistId_ = str;
    }

    /* JADX INFO: renamed from: o */
    public static void m9737o(EventCardInfoRequest eventCardInfoRequest, boolean z) {
        eventCardInfoRequest.enableNearby_ = z;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static i4x m9738q() {
        return (i4x) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002\u0007", new Object[]{"artistId_", "enableNearby_"});
        }
        if (iOrdinal == 3) {
            return new EventCardInfoRequest();
        }
        if (iOrdinal == 4) {
            return new i4x(DEFAULT_INSTANCE);
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
        synchronized (EventCardInfoRequest.class) {
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

    /* JADX INFO: renamed from: p */
    public final String m9739p() {
        return this.artistId_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
