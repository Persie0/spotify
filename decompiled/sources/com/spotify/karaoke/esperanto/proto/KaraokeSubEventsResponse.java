package com.spotify.karaoke.esperanto.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.dt60;
import p204p.dv50;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes7.dex */
public final class KaraokeSubEventsResponse extends AbstractC0269h implements sre0 {
    private static final KaraokeSubEventsResponse DEFAULT_INSTANCE;
    public static final int ERROR_CODE_FIELD_NUMBER = 4;
    public static final int ERROR_MESSAGE_FIELD_NUMBER = 3;
    public static final int ID_FIELD_NUMBER = 1;
    private static volatile r2n0 PARSER = null;
    public static final int TRACK_URI_FIELD_NUMBER = 2;
    private int errorCode_;
    private int id_;
    private String trackUri_ = "";
    private String errorMessage_ = "";

    static {
        KaraokeSubEventsResponse karaokeSubEventsResponse = new KaraokeSubEventsResponse();
        DEFAULT_INSTANCE = karaokeSubEventsResponse;
        AbstractC0269h.registerDefaultInstance(KaraokeSubEventsResponse.class, karaokeSubEventsResponse);
    }

    private KaraokeSubEventsResponse() {
    }

    /* JADX INFO: renamed from: p */
    public static KaraokeSubEventsResponse m12069p(byte[] bArr) {
        return (KaraokeSubEventsResponse) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr);
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\f\u0002Ȉ\u0003Ȉ\u0004\u0004", new Object[]{"id_", "trackUri_", "errorMessage_", "errorCode_"});
        }
        if (iOrdinal == 3) {
            return new KaraokeSubEventsResponse();
        }
        if (iOrdinal == 4) {
            return new dv50(DEFAULT_INSTANCE, 9);
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
        synchronized (KaraokeSubEventsResponse.class) {
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

    /* JADX INFO: renamed from: n */
    public final String m12070n() {
        return this.errorMessage_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final dt60 m12071o() {
        dt60 dt60Var;
        int i = this.id_;
        if (i != 0) {
            dt60Var = i != 1 ? null : dt60.ERROR;
        } else {
            dt60Var = dt60.MASK_READY;
        }
        return dt60Var == null ? dt60.UNRECOGNIZED : dt60Var;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
