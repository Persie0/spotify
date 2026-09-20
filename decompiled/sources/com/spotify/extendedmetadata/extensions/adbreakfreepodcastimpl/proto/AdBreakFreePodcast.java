package com.spotify.extendedmetadata.extensions.adbreakfreepodcastimpl.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.C1997j;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes6.dex */
public final class AdBreakFreePodcast extends AbstractC0269h implements sre0 {
    private static final AdBreakFreePodcast DEFAULT_INSTANCE;
    public static final int IS_SHOW_AD_BREAK_FREE_FIELD_NUMBER = 1;
    private static volatile r2n0 PARSER;
    private boolean isShowAdBreakFree_;

    static {
        AdBreakFreePodcast adBreakFreePodcast = new AdBreakFreePodcast();
        DEFAULT_INSTANCE = adBreakFreePodcast;
        AbstractC0269h.registerDefaultInstance(AdBreakFreePodcast.class, adBreakFreePodcast);
    }

    private AdBreakFreePodcast() {
    }

    /* JADX INFO: renamed from: o */
    public static AdBreakFreePodcast m9822o(byte[] bArr) {
        return (AdBreakFreePodcast) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr);
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0007", new Object[]{"isShowAdBreakFree_"});
        }
        if (iOrdinal == 3) {
            return new AdBreakFreePodcast();
        }
        if (iOrdinal == 4) {
            return new C1997j(DEFAULT_INSTANCE, 21);
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
        synchronized (AdBreakFreePodcast.class) {
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
    public final boolean m9823n() {
        return this.isShowAdBreakFree_;
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
