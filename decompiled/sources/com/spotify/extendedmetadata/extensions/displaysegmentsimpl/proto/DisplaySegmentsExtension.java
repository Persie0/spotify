package com.spotify.extendedmetadata.extensions.displaysegmentsimpl.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.ae50;
import p204p.omr;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes6.dex */
public final class DisplaySegmentsExtension extends AbstractC0269h implements sre0 {
    private static final DisplaySegmentsExtension DEFAULT_INSTANCE;
    public static final int DURATION_MS_FIELD_NUMBER = 3;
    public static final int EPISODE_URI_FIELD_NUMBER = 1;
    public static final int MUSIC_AND_TALK_DECORATION_FIELD_NUMBER = 4;
    private static volatile r2n0 PARSER = null;
    public static final int SEGMENTS_FIELD_NUMBER = 2;
    private Object decoration_;
    private int durationMs_;
    private int decorationCase_ = 0;
    private String episodeUri_ = "";
    private ae50 segments_ = AbstractC0269h.emptyProtobufList();

    static {
        DisplaySegmentsExtension displaySegmentsExtension = new DisplaySegmentsExtension();
        DEFAULT_INSTANCE = displaySegmentsExtension;
        AbstractC0269h.registerDefaultInstance(DisplaySegmentsExtension.class, displaySegmentsExtension);
    }

    private DisplaySegmentsExtension() {
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: r */
    public static DisplaySegmentsExtension m10091r(byte[] bArr) {
        return (DisplaySegmentsExtension) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0001\u0000\u0001\u0004\u0004\u0000\u0001\u0000\u0001Ȉ\u0002\u001b\u0003\u0004\u0004<\u0000", new Object[]{"decoration_", "decorationCase_", "episodeUri_", "segments_", DisplaySegment.class, "durationMs_", MusicAndTalkDecoration.class});
        }
        if (iOrdinal == 3) {
            return new DisplaySegmentsExtension();
        }
        if (iOrdinal == 4) {
            return new omr(DEFAULT_INSTANCE, 7);
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
        synchronized (DisplaySegmentsExtension.class) {
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
    public final int m10092n() {
        return this.durationMs_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final String m10093o() {
        return this.episodeUri_;
    }

    /* JADX INFO: renamed from: p */
    public final MusicAndTalkDecoration m10094p() {
        return this.decorationCase_ == 4 ? (MusicAndTalkDecoration) this.decoration_ : MusicAndTalkDecoration.m10096n();
    }

    /* JADX INFO: renamed from: q */
    public final ae50 m10095q() {
        return this.segments_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
