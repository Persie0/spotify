package com.spotify.scrollsita.p146v1;

import com.google.protobuf.AbstractC0269h;
import com.spotify.scrollsita.p146v1.watchfeed.DecoratedEntrypointMetadata;
import p204p.omr;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes10.dex */
public final class DiscoveryFeedItem extends AbstractC0269h implements sre0 {
    private static final DiscoveryFeedItem DEFAULT_INSTANCE;
    public static final int METADATA_FIELD_NUMBER = 1;
    private static volatile r2n0 PARSER;
    private int bitField0_;
    private DecoratedEntrypointMetadata metadata_;

    static {
        DiscoveryFeedItem discoveryFeedItem = new DiscoveryFeedItem();
        DEFAULT_INSTANCE = discoveryFeedItem;
        AbstractC0269h.registerDefaultInstance(DiscoveryFeedItem.class, discoveryFeedItem);
    }

    private DiscoveryFeedItem() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"bitField0_", "metadata_"});
        }
        if (iOrdinal == 3) {
            return new DiscoveryFeedItem();
        }
        if (iOrdinal == 4) {
            return new omr(DEFAULT_INSTANCE, 2);
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
        synchronized (DiscoveryFeedItem.class) {
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
    public final DecoratedEntrypointMetadata m20479n() {
        DecoratedEntrypointMetadata decoratedEntrypointMetadata = this.metadata_;
        return decoratedEntrypointMetadata == null ? DecoratedEntrypointMetadata.m20688p() : decoratedEntrypointMetadata;
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
