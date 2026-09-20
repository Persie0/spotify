package com.spotify.p010ad.detection.esperanto.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.C1997j;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes4.dex */
public final class AdDetectionOuterClass$SubscribeUserToCreatorTimestampResponse extends AbstractC0269h implements sre0 {
    public static final int CREATOR_TIMESTAMP_FIELD_NUMBER = 1;
    private static final AdDetectionOuterClass$SubscribeUserToCreatorTimestampResponse DEFAULT_INSTANCE;
    public static final int ERROR_FIELD_NUMBER = 3;
    private static volatile r2n0 PARSER = null;
    public static final int PRECISION_FIELD_NUMBER = 2;
    private int bitField0_;
    private AdDetectionOuterClass$CreatorTimestamp creatorTimestamp_;
    private boolean error_;
    private int precision_;

    static {
        AdDetectionOuterClass$SubscribeUserToCreatorTimestampResponse adDetectionOuterClass$SubscribeUserToCreatorTimestampResponse = new AdDetectionOuterClass$SubscribeUserToCreatorTimestampResponse();
        DEFAULT_INSTANCE = adDetectionOuterClass$SubscribeUserToCreatorTimestampResponse;
        AbstractC0269h.registerDefaultInstance(AdDetectionOuterClass$SubscribeUserToCreatorTimestampResponse.class, adDetectionOuterClass$SubscribeUserToCreatorTimestampResponse);
    }

    private AdDetectionOuterClass$SubscribeUserToCreatorTimestampResponse() {
    }

    /* JADX INFO: renamed from: p */
    public static AdDetectionOuterClass$SubscribeUserToCreatorTimestampResponse m2303p(byte[] bArr) {
        return (AdDetectionOuterClass$SubscribeUserToCreatorTimestampResponse) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr);
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002\f\u0003\u0007", new Object[]{"bitField0_", "creatorTimestamp_", "precision_", "error_"});
        }
        if (iOrdinal == 3) {
            return new AdDetectionOuterClass$SubscribeUserToCreatorTimestampResponse();
        }
        if (iOrdinal == 4) {
            return new C1997j(DEFAULT_INSTANCE, 25);
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
        synchronized (AdDetectionOuterClass$SubscribeUserToCreatorTimestampResponse.class) {
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
    public final AdDetectionOuterClass$CreatorTimestamp m2304n() {
        AdDetectionOuterClass$CreatorTimestamp adDetectionOuterClass$CreatorTimestamp = this.creatorTimestamp_;
        return adDetectionOuterClass$CreatorTimestamp == null ? AdDetectionOuterClass$CreatorTimestamp.m2262o() : adDetectionOuterClass$CreatorTimestamp;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final boolean m2305o() {
        return this.error_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
