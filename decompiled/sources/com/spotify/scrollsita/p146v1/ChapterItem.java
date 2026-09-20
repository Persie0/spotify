package com.spotify.scrollsita.p146v1;

import com.google.protobuf.AbstractC0269h;
import com.google.protobuf.Duration;
import p204p.ioc;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes10.dex */
public final class ChapterItem extends AbstractC0269h implements sre0 {
    private static final ChapterItem DEFAULT_INSTANCE;
    public static final int END_FIELD_NUMBER = 3;
    public static final int HAS_CREATOR_TIMESTAMPS_FIELD_NUMBER = 4;
    private static volatile r2n0 PARSER = null;
    public static final int START_FIELD_NUMBER = 2;
    public static final int URI_FIELD_NUMBER = 1;
    private int bitField0_;
    private Duration end_;
    private boolean hasCreatorTimestamps_;
    private Duration start_;
    private String uri_ = "";

    static {
        ChapterItem chapterItem = new ChapterItem();
        DEFAULT_INSTANCE = chapterItem;
        AbstractC0269h.registerDefaultInstance(ChapterItem.class, chapterItem);
    }

    private ChapterItem() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002ဉ\u0000\u0003ဉ\u0001\u0004\u0007", new Object[]{"bitField0_", "uri_", "start_", "end_", "hasCreatorTimestamps_"});
        }
        if (iOrdinal == 3) {
            return new ChapterItem();
        }
        if (iOrdinal == 4) {
            return new ioc(DEFAULT_INSTANCE, 3);
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
        synchronized (ChapterItem.class) {
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

    public final String getUri() {
        return this.uri_;
    }

    /* JADX INFO: renamed from: n */
    public final Duration m20449n() {
        Duration duration = this.end_;
        return duration == null ? Duration.m1928p() : duration;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final boolean m20450o() {
        return this.hasCreatorTimestamps_;
    }

    /* JADX INFO: renamed from: p */
    public final Duration m20451p() {
        Duration duration = this.start_;
        return duration == null ? Duration.m1928p() : duration;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
