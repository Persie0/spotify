package com.spotify.highlightsstats.data.proto.timeline.view.p075v1;

import com.google.protobuf.AbstractC0269h;
import com.spotify.highlightsstats.ShareConfiguration;
import p204p.ae50;
import p204p.og20;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes7.dex */
public final class Highlights extends AbstractC0269h implements sre0 {
    private static final Highlights DEFAULT_INSTANCE;
    public static final int HIGHLIGHTS_FIELD_NUMBER = 1;
    private static volatile r2n0 PARSER = null;
    public static final int SHARE_CONFIGURATION_FIELD_NUMBER = 3;
    public static final int STATUS_FIELD_NUMBER = 2;
    private int bitField0_;
    private ae50 highlights_ = AbstractC0269h.emptyProtobufList();
    private ShareConfiguration shareConfiguration_;
    private int status_;

    static {
        Highlights highlights = new Highlights();
        DEFAULT_INSTANCE = highlights;
        AbstractC0269h.registerDefaultInstance(Highlights.class, highlights);
    }

    private Highlights() {
    }

    /* JADX INFO: renamed from: n */
    public static Highlights m11362n() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u001b\u0002\f\u0003ဉ\u0000", new Object[]{"bitField0_", "highlights_", Highlight.class, "status_", "shareConfiguration_"});
        }
        if (iOrdinal == 3) {
            return new Highlights();
        }
        if (iOrdinal == 4) {
            return new og20(DEFAULT_INSTANCE, 26);
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
        synchronized (Highlights.class) {
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
    public final ae50 m11363o() {
        return this.highlights_;
    }

    /* JADX INFO: renamed from: p */
    public final ShareConfiguration m11364p() {
        ShareConfiguration shareConfiguration = this.shareConfiguration_;
        return shareConfiguration == null ? ShareConfiguration.m11293n() : shareConfiguration;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
