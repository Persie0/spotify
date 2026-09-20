package com.spotify.ads.esperanto.proto;

import com.google.protobuf.AbstractC0269h;
import java.util.Collections;
import java.util.Map;
import p204p.ihc0;
import p204p.ore0;
import p204p.pre0;
import p204p.qn61;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.yu61;
import p204p.z110;

/* JADX INFO: loaded from: classes.dex */
public final class TargetingResponse extends AbstractC0269h implements sre0 {
    private static final TargetingResponse DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER = null;
    public static final int TARGETING_MAP_FIELD_NUMBER = 1;
    private ihc0 targetingMap_ = ihc0.f102235b;

    static {
        TargetingResponse targetingResponse = new TargetingResponse();
        DEFAULT_INSTANCE = targetingResponse;
        AbstractC0269h.registerDefaultInstance(TargetingResponse.class, targetingResponse);
    }

    private TargetingResponse() {
    }

    /* JADX INFO: renamed from: p */
    public static TargetingResponse m2729p(byte[] bArr) {
        return (TargetingResponse) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr);
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"targetingMap_", yu61.f276279a});
        }
        if (iOrdinal == 3) {
            return new TargetingResponse();
        }
        if (iOrdinal == 4) {
            return new qn61();
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
        synchronized (TargetingResponse.class) {
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

    /* JADX INFO: renamed from: o */
    public final Map m2730o() {
        return Collections.unmodifiableMap(this.targetingMap_);
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
