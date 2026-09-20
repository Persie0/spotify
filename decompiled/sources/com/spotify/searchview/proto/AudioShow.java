package com.spotify.searchview.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.hr6;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes10.dex */
public final class AudioShow extends AbstractC0269h implements sre0 {
    public static final int CATEGORY_FIELD_NUMBER = 4;
    private static final AudioShow DEFAULT_INSTANCE;
    public static final int MUSIC_AND_TALK_FIELD_NUMBER = 3;
    private static volatile r2n0 PARSER = null;
    public static final int PUBLISHER_NAME_FIELD_NUMBER = 1;
    public static final int VERIFIED_FIELD_NUMBER = 6;
    private boolean musicAndTalk_;
    private boolean verified_;
    private String publisherName_ = "";
    private String category_ = "";

    static {
        AudioShow audioShow = new AudioShow();
        DEFAULT_INSTANCE = audioShow;
        AbstractC0269h.registerDefaultInstance(AudioShow.class, audioShow);
    }

    private AudioShow() {
    }

    /* JADX INFO: renamed from: o */
    public static AudioShow m20760o() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0006\u0004\u0000\u0000\u0000\u0001Ȉ\u0003\u0007\u0004Ȉ\u0006\u0007", new Object[]{"publisherName_", "musicAndTalk_", "category_", "verified_"});
        }
        if (iOrdinal == 3) {
            return new AudioShow();
        }
        if (iOrdinal == 4) {
            return new hr6(DEFAULT_INSTANCE, 26);
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
        synchronized (AudioShow.class) {
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
    public final String m20761n() {
        return this.category_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: p */
    public final String m20762p() {
        return this.publisherName_;
    }

    /* JADX INFO: renamed from: q */
    public final boolean m20763q() {
        return this.verified_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
