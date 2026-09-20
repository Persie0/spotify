package com.spotify.sharecard.config.impl.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.ehb1;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes10.dex */
public final class Video extends AbstractC0269h implements sre0 {
    private static final Video DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER = null;
    public static final int URL_FIELD_NUMBER = 1;
    private String url_ = "";

    static {
        Video video = new Video();
        DEFAULT_INSTANCE = video;
        AbstractC0269h.registerDefaultInstance(Video.class, video);
    }

    private Video() {
    }

    /* JADX INFO: renamed from: n */
    public static void m21186n(Video video, String str) {
        video.getClass();
        str.getClass();
        video.url_ = str;
    }

    /* JADX INFO: renamed from: o */
    public static Video m21187o() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: renamed from: p */
    public static ehb1 m21188p() {
        return (ehb1) DEFAULT_INSTANCE.createBuilder();
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"url_"});
        }
        if (iOrdinal == 3) {
            return new Video();
        }
        if (iOrdinal == 4) {
            return new ehb1(DEFAULT_INSTANCE);
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
        synchronized (Video.class) {
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

    public final String getUrl() {
        return this.url_;
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
