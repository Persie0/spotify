package com.spotify.p010ad.detection.esperanto.proto;

import com.google.protobuf.AbstractC0269h;
import java.util.ArrayList;
import p204p.AbstractC1733c9;
import p204p.AbstractC2118m8;
import p204p.am0;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.ud50;
import p204p.z110;

/* JADX INFO: loaded from: classes4.dex */
public final class AdDetectionOuterClass$SubscribeCreatorToUserTimestampRequest extends AbstractC0269h implements sre0 {
    public static final int CREATOR_TIMESTAMPS_MS_FIELD_NUMBER = 2;
    private static final AdDetectionOuterClass$SubscribeCreatorToUserTimestampRequest DEFAULT_INSTANCE;
    public static final int EPISODE_URI_FIELD_NUMBER = 1;
    private static volatile r2n0 PARSER = null;
    public static final int PLAYBACK_ID_FIELD_NUMBER = 3;
    private int creatorTimestampsMsMemoizedSerializedSize = -1;
    private String episodeUri_ = "";
    private ud50 creatorTimestampsMs_ = AbstractC0269h.emptyIntList();
    private String playbackId_ = "";

    static {
        AdDetectionOuterClass$SubscribeCreatorToUserTimestampRequest adDetectionOuterClass$SubscribeCreatorToUserTimestampRequest = new AdDetectionOuterClass$SubscribeCreatorToUserTimestampRequest();
        DEFAULT_INSTANCE = adDetectionOuterClass$SubscribeCreatorToUserTimestampRequest;
        AbstractC0269h.registerDefaultInstance(AdDetectionOuterClass$SubscribeCreatorToUserTimestampRequest.class, adDetectionOuterClass$SubscribeCreatorToUserTimestampRequest);
    }

    private AdDetectionOuterClass$SubscribeCreatorToUserTimestampRequest() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: n */
    public static void m2292n(AdDetectionOuterClass$SubscribeCreatorToUserTimestampRequest adDetectionOuterClass$SubscribeCreatorToUserTimestampRequest, ArrayList arrayList) {
        ud50 ud50Var = adDetectionOuterClass$SubscribeCreatorToUserTimestampRequest.creatorTimestampsMs_;
        if (!((AbstractC1733c9) ud50Var).f35342a) {
            adDetectionOuterClass$SubscribeCreatorToUserTimestampRequest.creatorTimestampsMs_ = AbstractC0269h.mutableCopy(ud50Var);
        }
        AbstractC2118m8.addAll(arrayList, adDetectionOuterClass$SubscribeCreatorToUserTimestampRequest.creatorTimestampsMs_);
    }

    /* JADX INFO: renamed from: o */
    public static void m2293o(AdDetectionOuterClass$SubscribeCreatorToUserTimestampRequest adDetectionOuterClass$SubscribeCreatorToUserTimestampRequest, String str) {
        adDetectionOuterClass$SubscribeCreatorToUserTimestampRequest.getClass();
        str.getClass();
        adDetectionOuterClass$SubscribeCreatorToUserTimestampRequest.episodeUri_ = str;
    }

    /* JADX INFO: renamed from: p */
    public static void m2294p(AdDetectionOuterClass$SubscribeCreatorToUserTimestampRequest adDetectionOuterClass$SubscribeCreatorToUserTimestampRequest, String str) {
        adDetectionOuterClass$SubscribeCreatorToUserTimestampRequest.getClass();
        str.getClass();
        adDetectionOuterClass$SubscribeCreatorToUserTimestampRequest.playbackId_ = str;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static am0 m2295q() {
        return (am0) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0001\u0000\u0001Ȉ\u0002'\u0003Ȉ", new Object[]{"episodeUri_", "creatorTimestampsMs_", "playbackId_"});
        }
        if (iOrdinal == 3) {
            return new AdDetectionOuterClass$SubscribeCreatorToUserTimestampRequest();
        }
        if (iOrdinal == 4) {
            return new am0(DEFAULT_INSTANCE);
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
        synchronized (AdDetectionOuterClass$SubscribeCreatorToUserTimestampRequest.class) {
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
