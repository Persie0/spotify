package com.spotify.audiobookgenres.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.ore0;
import p204p.pre0;
import p204p.q67;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes5.dex */
public final class AudiobookGenre extends AbstractC0269h implements sre0 {
    public static final int CONTEXTUAL_NAME_FIELD_NUMBER = 2;
    private static final AudiobookGenre DEFAULT_INSTANCE;
    public static final int DEPTH_FIELD_NUMBER = 3;
    public static final int DESTINATION_URI_FIELD_NUMBER = 5;
    public static final int ID_FIELD_NUMBER = 1;
    public static final int PARENT_ID_FIELD_NUMBER = 4;
    private static volatile r2n0 PARSER = null;
    public static final int SHORT_NAME_FIELD_NUMBER = 6;
    private int depth_;
    private String id_ = "";
    private String contextualName_ = "";
    private String parentId_ = "";
    private String destinationUri_ = "";
    private String shortName_ = "";

    static {
        AudiobookGenre audiobookGenre = new AudiobookGenre();
        DEFAULT_INSTANCE = audiobookGenre;
        AbstractC0269h.registerDefaultInstance(AudiobookGenre.class, audiobookGenre);
    }

    private AudiobookGenre() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0000\u0001\u0006\u0006\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003\u0004\u0004Ȉ\u0005Ȉ\u0006Ȉ", new Object[]{"id_", "contextualName_", "depth_", "parentId_", "destinationUri_", "shortName_"});
        }
        if (iOrdinal == 3) {
            return new AudiobookGenre();
        }
        if (iOrdinal == 4) {
            return new q67(DEFAULT_INSTANCE, 5);
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
        synchronized (AudiobookGenre.class) {
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
    public final String m3417n() {
        return this.contextualName_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final int m3418o() {
        return this.depth_;
    }

    /* JADX INFO: renamed from: p */
    public final String m3419p() {
        return this.destinationUri_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
