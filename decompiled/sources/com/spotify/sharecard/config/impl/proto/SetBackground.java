package com.spotify.sharecard.config.impl.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.o401;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes10.dex */
public final class SetBackground extends AbstractC0269h implements sre0 {
    public static final int ASPECT_RATIO_FIELD_NUMBER = 4;
    public static final int COLOR_FIELD_NUMBER = 1;
    private static final SetBackground DEFAULT_INSTANCE;
    public static final int IMAGE_FIELD_NUMBER = 3;
    private static volatile r2n0 PARSER = null;
    public static final int VIDEO_FIELD_NUMBER = 2;
    private Object format_;
    private int formatCase_ = 0;
    private String aspectRatio_ = "";

    static {
        SetBackground setBackground = new SetBackground();
        DEFAULT_INSTANCE = setBackground;
        AbstractC0269h.registerDefaultInstance(SetBackground.class, setBackground);
    }

    private SetBackground() {
    }

    /* JADX INFO: renamed from: n */
    public static void m21162n(SetBackground setBackground, String str) {
        setBackground.getClass();
        str.getClass();
        setBackground.aspectRatio_ = str;
    }

    /* JADX INFO: renamed from: o */
    public static void m21163o(SetBackground setBackground, Color color) {
        setBackground.getClass();
        color.getClass();
        setBackground.format_ = color;
        setBackground.formatCase_ = 1;
    }

    /* JADX INFO: renamed from: p */
    public static void m21164p(SetBackground setBackground, SetImage setImage) {
        setBackground.getClass();
        setImage.getClass();
        setBackground.format_ = setImage;
        setBackground.formatCase_ = 3;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static void m21165q(SetBackground setBackground, Video video) {
        setBackground.getClass();
        video.getClass();
        setBackground.format_ = video;
        setBackground.formatCase_ = 2;
    }

    /* JADX INFO: renamed from: r */
    public static o401 m21166r() {
        return (o401) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0001\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000\u0004Ȉ", new Object[]{"format_", "formatCase_", Color.class, Video.class, SetImage.class, "aspectRatio_"});
        }
        if (iOrdinal == 3) {
            return new SetBackground();
        }
        if (iOrdinal == 4) {
            return new o401(DEFAULT_INSTANCE);
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
        synchronized (SetBackground.class) {
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

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
