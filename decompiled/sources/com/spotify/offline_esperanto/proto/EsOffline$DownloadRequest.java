package com.spotify.offline_esperanto.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.AbstractC1733c9;
import p204p.AbstractC2118m8;
import p204p.ae50;
import p204p.amw;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes9.dex */
public final class EsOffline$DownloadRequest extends AbstractC0269h implements sre0 {
    private static final EsOffline$DownloadRequest DEFAULT_INSTANCE;
    public static final int DEVICE_FIELD_NUMBER = 1;
    public static final int MUSIC_VIDEO_URIS_FIELD_NUMBER = 3;
    private static volatile r2n0 PARSER = null;
    public static final int URI_FIELD_NUMBER = 2;
    private int bitField0_;
    private EsOffline$DeviceKey device_;
    private String uri_ = "";
    private ae50 musicVideoUris_ = AbstractC0269h.emptyProtobufList();

    static {
        EsOffline$DownloadRequest esOffline$DownloadRequest = new EsOffline$DownloadRequest();
        DEFAULT_INSTANCE = esOffline$DownloadRequest;
        AbstractC0269h.registerDefaultInstance(EsOffline$DownloadRequest.class, esOffline$DownloadRequest);
    }

    private EsOffline$DownloadRequest() {
    }

    /* JADX INFO: renamed from: n */
    public static void m16122n(EsOffline$DownloadRequest esOffline$DownloadRequest, Iterable iterable) {
        ae50 ae50Var = esOffline$DownloadRequest.musicVideoUris_;
        if (!((AbstractC1733c9) ae50Var).f35342a) {
            esOffline$DownloadRequest.musicVideoUris_ = AbstractC0269h.mutableCopy(ae50Var);
        }
        AbstractC2118m8.addAll(iterable, esOffline$DownloadRequest.musicVideoUris_);
    }

    /* JADX INFO: renamed from: o */
    public static void m16123o(EsOffline$DownloadRequest esOffline$DownloadRequest, EsOffline$DeviceKey esOffline$DeviceKey) {
        esOffline$DownloadRequest.getClass();
        esOffline$DeviceKey.getClass();
        esOffline$DownloadRequest.device_ = esOffline$DeviceKey;
        esOffline$DownloadRequest.bitField0_ |= 1;
    }

    /* JADX INFO: renamed from: p */
    public static void m16124p(EsOffline$DownloadRequest esOffline$DownloadRequest, String str) {
        esOffline$DownloadRequest.getClass();
        str.getClass();
        esOffline$DownloadRequest.uri_ = str;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static amw m16125q() {
        return (amw) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဉ\u0000\u0002Ȉ\u0003Ț", new Object[]{"bitField0_", "device_", "uri_", "musicVideoUris_"});
        }
        if (iOrdinal == 3) {
            return new EsOffline$DownloadRequest();
        }
        if (iOrdinal == 4) {
            return new amw(DEFAULT_INSTANCE);
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
        synchronized (EsOffline$DownloadRequest.class) {
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
