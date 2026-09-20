package com.spotify.culturalmoments.stories.p056v1;

import com.google.protobuf.AbstractC0269h;
import p204p.chb1;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes6.dex */
public final class VideoErrorConfiguration extends AbstractC0269h implements sre0 {
    public static final int BACKGROUND_COLOR_FIELD_NUMBER = 3;
    public static final int BUTTON_FIELD_NUMBER = 4;
    private static final VideoErrorConfiguration DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER = null;
    public static final int SUBTITLE_FIELD_NUMBER = 2;
    public static final int TITLE_FIELD_NUMBER = 1;
    private String backgroundColor_ = "";
    private int bitField0_;
    private Button button_;
    private Text subtitle_;
    private Text title_;

    static {
        VideoErrorConfiguration videoErrorConfiguration = new VideoErrorConfiguration();
        DEFAULT_INSTANCE = videoErrorConfiguration;
        AbstractC0269h.registerDefaultInstance(VideoErrorConfiguration.class, videoErrorConfiguration);
    }

    private VideoErrorConfiguration() {
    }

    /* JADX INFO: renamed from: p */
    public static VideoErrorConfiguration m9103p() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003Ȉ\u0004ဉ\u0002", new Object[]{"bitField0_", "title_", "subtitle_", "backgroundColor_", "button_"});
        }
        if (iOrdinal == 3) {
            return new VideoErrorConfiguration();
        }
        if (iOrdinal == 4) {
            return new chb1(DEFAULT_INSTANCE, 13);
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
        synchronized (VideoErrorConfiguration.class) {
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
    public final String m9104n() {
        return this.backgroundColor_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final Button m9105o() {
        Button button = this.button_;
        return button == null ? Button.m9061o() : button;
    }

    /* JADX INFO: renamed from: q */
    public final Text m9106q() {
        Text text = this.subtitle_;
        return text == null ? Text.m9100n() : text;
    }

    /* JADX INFO: renamed from: r */
    public final Text m9107r() {
        Text text = this.title_;
        return text == null ? Text.m9100n() : text;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
