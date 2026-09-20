package com.spotify.p010ad.detection.esperanto.proto;

import com.google.protobuf.AbstractC0269h;
import java.util.Collections;
import java.util.Map;
import p204p.C1997j;
import p204p.bm0;
import p204p.ihc0;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;
import p204p.zl0;

/* JADX INFO: loaded from: classes4.dex */
public final class AdDetectionOuterClass$SubscribeCreatorToUserTimestampResponse extends AbstractC0269h implements sre0 {
    public static final int CREATOR_TO_USER_TIMESTAMPS_FIELD_NUMBER = 1;
    private static final AdDetectionOuterClass$SubscribeCreatorToUserTimestampResponse DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER = null;
    public static final int PRECISION_FIELD_NUMBER = 2;
    public static final int STATUS_FIELD_NUMBER = 3;
    private ihc0 creatorToUserTimestamps_ = ihc0.f102235b;
    private int precision_;
    private int status_;

    static {
        AdDetectionOuterClass$SubscribeCreatorToUserTimestampResponse adDetectionOuterClass$SubscribeCreatorToUserTimestampResponse = new AdDetectionOuterClass$SubscribeCreatorToUserTimestampResponse();
        DEFAULT_INSTANCE = adDetectionOuterClass$SubscribeCreatorToUserTimestampResponse;
        AbstractC0269h.registerDefaultInstance(AdDetectionOuterClass$SubscribeCreatorToUserTimestampResponse.class, adDetectionOuterClass$SubscribeCreatorToUserTimestampResponse);
    }

    private AdDetectionOuterClass$SubscribeCreatorToUserTimestampResponse() {
    }

    /* JADX INFO: renamed from: p */
    public static AdDetectionOuterClass$SubscribeCreatorToUserTimestampResponse m2296p(byte[] bArr) {
        return (AdDetectionOuterClass$SubscribeCreatorToUserTimestampResponse) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr);
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0001\u0000\u0000\u00012\u0002\f\u0003\f", new Object[]{"creatorToUserTimestamps_", bm0.f28343a, "precision_", "status_"});
        }
        if (iOrdinal == 3) {
            return new AdDetectionOuterClass$SubscribeCreatorToUserTimestampResponse();
        }
        if (iOrdinal == 4) {
            return new C1997j(DEFAULT_INSTANCE, 24);
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
        synchronized (AdDetectionOuterClass$SubscribeCreatorToUserTimestampResponse.class) {
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
    public final Map m2297n() {
        return Collections.unmodifiableMap(this.creatorToUserTimestamps_);
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final zl0 m2298o() {
        zl0 zl0VarM96348a = zl0.m96348a(this.precision_);
        return zl0VarM96348a == null ? zl0.UNRECOGNIZED : zl0VarM96348a;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
