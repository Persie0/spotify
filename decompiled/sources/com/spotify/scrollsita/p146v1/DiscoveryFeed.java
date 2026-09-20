package com.spotify.scrollsita.p146v1;

import com.google.protobuf.AbstractC0269h;
import java.util.List;
import p204p.ae50;
import p204p.omr;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes10.dex */
public final class DiscoveryFeed extends AbstractC0269h implements sre0 {
    private static final DiscoveryFeed DEFAULT_INSTANCE;
    public static final int HEADING_FIELD_NUMBER = 1;
    public static final int ITEMS_FIELD_NUMBER = 2;
    private static volatile r2n0 PARSER;
    private int bitField0_;
    private Heading heading_;
    private ae50 items_ = AbstractC0269h.emptyProtobufList();

    static {
        DiscoveryFeed discoveryFeed = new DiscoveryFeed();
        DEFAULT_INSTANCE = discoveryFeed;
        AbstractC0269h.registerDefaultInstance(DiscoveryFeed.class, discoveryFeed);
    }

    private DiscoveryFeed() {
    }

    /* JADX INFO: renamed from: n */
    public static DiscoveryFeed m20477n() {
        return DEFAULT_INSTANCE;
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဉ\u0000\u0002\u001b", new Object[]{"bitField0_", "heading_", "items_", DiscoveryFeedItem.class});
        }
        if (iOrdinal == 3) {
            return new DiscoveryFeed();
        }
        if (iOrdinal == 4) {
            return new omr(DEFAULT_INSTANCE, 0);
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
        synchronized (DiscoveryFeed.class) {
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

    public final List getItemsList() {
        return this.items_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final Heading m20478o() {
        Heading heading = this.heading_;
        return heading == null ? Heading.m20509o() : heading;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
