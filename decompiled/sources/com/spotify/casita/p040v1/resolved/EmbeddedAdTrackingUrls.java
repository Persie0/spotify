package com.spotify.casita.p040v1.resolved;

import com.google.protobuf.AbstractC0269h;
import p204p.ae50;
import p204p.omr;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes.dex */
public final class EmbeddedAdTrackingUrls extends AbstractC0269h implements sre0 {
    private static final EmbeddedAdTrackingUrls DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER = null;
    public static final int URLS_FIELD_NUMBER = 1;
    private ae50 urls_ = AbstractC0269h.emptyProtobufList();

    static {
        EmbeddedAdTrackingUrls embeddedAdTrackingUrls = new EmbeddedAdTrackingUrls();
        DEFAULT_INSTANCE = embeddedAdTrackingUrls;
        AbstractC0269h.registerDefaultInstance(EmbeddedAdTrackingUrls.class, embeddedAdTrackingUrls);
    }

    private EmbeddedAdTrackingUrls() {
    }

    /* JADX INFO: renamed from: o */
    public static EmbeddedAdTrackingUrls m5634o() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001Ț", new Object[]{"urls_"});
        }
        if (iOrdinal == 3) {
            return new EmbeddedAdTrackingUrls();
        }
        if (iOrdinal == 4) {
            return new omr(29);
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
        synchronized (EmbeddedAdTrackingUrls.class) {
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

    /* JADX INFO: renamed from: p */
    public final ae50 m5635p() {
        return this.urls_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
