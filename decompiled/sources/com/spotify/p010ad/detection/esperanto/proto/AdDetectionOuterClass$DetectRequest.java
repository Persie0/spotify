package com.spotify.p010ad.detection.esperanto.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.wl0;
import p204p.z110;

/* JADX INFO: loaded from: classes4.dex */
public final class AdDetectionOuterClass$DetectRequest extends AbstractC0269h implements sre0 {
    private static final AdDetectionOuterClass$DetectRequest DEFAULT_INSTANCE;
    public static final int EPISODE_URI_FIELD_NUMBER = 2;
    private static volatile r2n0 PARSER = null;
    public static final int PLAYBACK_ID_FIELD_NUMBER = 3;
    private String episodeUri_ = "";
    private String playbackId_ = "";

    static {
        AdDetectionOuterClass$DetectRequest adDetectionOuterClass$DetectRequest = new AdDetectionOuterClass$DetectRequest();
        DEFAULT_INSTANCE = adDetectionOuterClass$DetectRequest;
        AbstractC0269h.registerDefaultInstance(AdDetectionOuterClass$DetectRequest.class, adDetectionOuterClass$DetectRequest);
    }

    private AdDetectionOuterClass$DetectRequest() {
    }

    /* JADX INFO: renamed from: n */
    public static void m2264n(AdDetectionOuterClass$DetectRequest adDetectionOuterClass$DetectRequest, String str) {
        adDetectionOuterClass$DetectRequest.getClass();
        str.getClass();
        adDetectionOuterClass$DetectRequest.episodeUri_ = str;
    }

    /* JADX INFO: renamed from: o */
    public static void m2265o(AdDetectionOuterClass$DetectRequest adDetectionOuterClass$DetectRequest, String str) {
        adDetectionOuterClass$DetectRequest.getClass();
        str.getClass();
        adDetectionOuterClass$DetectRequest.playbackId_ = str;
    }

    /* JADX INFO: renamed from: p */
    public static wl0 m2266p() {
        return (wl0) DEFAULT_INSTANCE.createBuilder();
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0002\u0003\u0002\u0000\u0000\u0000\u0002Ȉ\u0003Ȉ", new Object[]{"episodeUri_", "playbackId_"});
        }
        if (iOrdinal == 3) {
            return new AdDetectionOuterClass$DetectRequest();
        }
        if (iOrdinal == 4) {
            return new wl0(DEFAULT_INSTANCE);
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
        synchronized (AdDetectionOuterClass$DetectRequest.class) {
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
