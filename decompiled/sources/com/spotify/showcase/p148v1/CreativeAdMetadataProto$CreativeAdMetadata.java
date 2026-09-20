package com.spotify.showcase.p148v1;

import com.google.protobuf.AbstractC0269h;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.xbl;
import p204p.z110;

/* JADX INFO: loaded from: classes10.dex */
@Deprecated
public final class CreativeAdMetadataProto$CreativeAdMetadata extends AbstractC0269h implements sre0 {
    public static final int COMPANION_VIDEO_FIELD_NUMBER = 1;
    private static final CreativeAdMetadataProto$CreativeAdMetadata DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER;
    private int bitField0_;
    private CreativeAdMetadataProto$CompanionVideo companionVideo_;

    static {
        CreativeAdMetadataProto$CreativeAdMetadata creativeAdMetadataProto$CreativeAdMetadata = new CreativeAdMetadataProto$CreativeAdMetadata();
        DEFAULT_INSTANCE = creativeAdMetadataProto$CreativeAdMetadata;
        AbstractC0269h.registerDefaultInstance(CreativeAdMetadataProto$CreativeAdMetadata.class, creativeAdMetadataProto$CreativeAdMetadata);
    }

    private CreativeAdMetadataProto$CreativeAdMetadata() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"bitField0_", "companionVideo_"});
        }
        if (iOrdinal == 3) {
            return new CreativeAdMetadataProto$CreativeAdMetadata();
        }
        if (iOrdinal == 4) {
            return new xbl(DEFAULT_INSTANCE, 10);
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
        synchronized (CreativeAdMetadataProto$CreativeAdMetadata.class) {
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
