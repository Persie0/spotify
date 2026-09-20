package com.spotify.showcase.p149v2;

import com.google.protobuf.AbstractC0269h;
import p204p.ore0;
import p204p.pof;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes10.dex */
public final class CompanionVideo extends AbstractC0269h implements sre0 {
    private static final CompanionVideo DEFAULT_INSTANCE;
    public static final int MEDIA_URL_FIELD_NUMBER = 1;
    private static volatile r2n0 PARSER = null;
    public static final int THUMBNAIL_URL_FIELD_NUMBER = 2;
    private String mediaUrl_ = "";
    private String thumbnailUrl_ = "";

    static {
        CompanionVideo companionVideo = new CompanionVideo();
        DEFAULT_INSTANCE = companionVideo;
        AbstractC0269h.registerDefaultInstance(CompanionVideo.class, companionVideo);
    }

    private CompanionVideo() {
    }

    /* JADX INFO: renamed from: n */
    public static CompanionVideo m21290n() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ", new Object[]{"mediaUrl_", "thumbnailUrl_"});
        }
        if (iOrdinal == 3) {
            return new CompanionVideo();
        }
        if (iOrdinal == 4) {
            return new pof(DEFAULT_INSTANCE, 10);
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
        synchronized (CompanionVideo.class) {
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
    public final String m21291o() {
        return this.mediaUrl_;
    }

    /* JADX INFO: renamed from: p */
    public final String m21292p() {
        return this.thumbnailUrl_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
