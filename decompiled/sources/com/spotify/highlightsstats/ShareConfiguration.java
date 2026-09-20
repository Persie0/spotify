package com.spotify.highlightsstats;

import com.google.protobuf.AbstractC0269h;
import p204p.gg5;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.ud50;
import p204p.ui01;
import p204p.vd50;
import p204p.wd50;
import p204p.z110;

/* JADX INFO: loaded from: classes7.dex */
public final class ShareConfiguration extends AbstractC0269h implements sre0 {
    private static final ShareConfiguration DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER = null;
    public static final int SHARE_DESTINATIONS_FIELD_NUMBER = 1;
    private static final vd50 shareDestinations_converter_ = new gg5(25);
    private int shareDestinationsMemoizedSerializedSize;
    private ud50 shareDestinations_ = AbstractC0269h.emptyIntList();

    static {
        ShareConfiguration shareConfiguration = new ShareConfiguration();
        DEFAULT_INSTANCE = shareConfiguration;
        AbstractC0269h.registerDefaultInstance(ShareConfiguration.class, shareConfiguration);
    }

    private ShareConfiguration() {
    }

    /* JADX INFO: renamed from: n */
    public static ShareConfiguration m11293n() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001,", new Object[]{"shareDestinations_"});
        }
        if (iOrdinal == 3) {
            return new ShareConfiguration();
        }
        if (iOrdinal == 4) {
            return new ui01(DEFAULT_INSTANCE, 5);
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
        synchronized (ShareConfiguration.class) {
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
    public final wd50 m11294o() {
        return new wd50(this.shareDestinations_, shareDestinations_converter_);
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
