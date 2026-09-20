package com.spotify.share.destinations.smartsorting.networking.request;

import com.google.protobuf.AbstractC0269h;
import java.util.Collections;
import java.util.Map;
import p204p.ihc0;
import p204p.ne21;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.xs31;
import p204p.z110;

/* JADX INFO: loaded from: classes10.dex */
public final class SortedDestinationsProtoResponse extends AbstractC0269h implements sre0 {
    public static final int AGGREGATION_FIELD_NUMBER = 1;
    private static final SortedDestinationsProtoResponse DEFAULT_INSTANCE;
    public static final int DESTINATIONS_FIELD_NUMBER = 2;
    private static volatile r2n0 PARSER;
    private int aggregation_;
    private ihc0 destinations_ = ihc0.f102235b;

    static {
        SortedDestinationsProtoResponse sortedDestinationsProtoResponse = new SortedDestinationsProtoResponse();
        DEFAULT_INSTANCE = sortedDestinationsProtoResponse;
        AbstractC0269h.registerDefaultInstance(SortedDestinationsProtoResponse.class, sortedDestinationsProtoResponse);
    }

    private SortedDestinationsProtoResponse() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0001\f\u00022", new Object[]{"aggregation_", "destinations_", xs31.f265469a});
        }
        if (iOrdinal == 3) {
            return new SortedDestinationsProtoResponse();
        }
        if (iOrdinal == 4) {
            return new ne21(DEFAULT_INSTANCE, 28);
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
        synchronized (SortedDestinationsProtoResponse.class) {
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
    public final Map m21000n() {
        return Collections.unmodifiableMap(this.destinations_);
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
