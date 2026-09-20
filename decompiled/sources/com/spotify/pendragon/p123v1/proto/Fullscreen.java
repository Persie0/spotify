package com.spotify.pendragon.p123v1.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.ae50;
import p204p.ie00;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.rbz;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes2.dex */
public final class Fullscreen extends AbstractC0269h implements sre0 {
    public static final int BASE_FULLSCREEN_FIELD_NUMBER = 4;
    public static final int BUTTONS_FIELD_NUMBER = 2;
    private static final Fullscreen DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER = null;
    public static final int TYPE_FIELD_NUMBER = 3;
    private Object fullscreenTemplate_;
    private int fullscreenTemplateCase_ = 0;
    private ae50 buttons_ = AbstractC0269h.emptyProtobufList();
    private String type_ = "";

    static {
        Fullscreen fullscreen = new Fullscreen();
        DEFAULT_INSTANCE = fullscreen;
        AbstractC0269h.registerDefaultInstance(Fullscreen.class, fullscreen);
    }

    private Fullscreen() {
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static Fullscreen m17191q() {
        return DEFAULT_INSTANCE;
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0001\u0000\u0002\u0004\u0003\u0000\u0001\u0000\u0002\u001b\u0003Ȉ\u0004<\u0000", new Object[]{"fullscreenTemplate_", "fullscreenTemplateCase_", "buttons_", Button.class, "type_", BaseFullscreen.class});
        }
        if (iOrdinal == 3) {
            return new Fullscreen();
        }
        if (iOrdinal == 4) {
            return new ie00(2);
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
        synchronized (Fullscreen.class) {
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
    public final BaseFullscreen m17192o() {
        return this.fullscreenTemplateCase_ == 4 ? (BaseFullscreen) this.fullscreenTemplate_ : BaseFullscreen.m17035s();
    }

    /* JADX INFO: renamed from: p */
    public final ae50 m17193p() {
        return this.buttons_;
    }

    /* JADX INFO: renamed from: r */
    public final int m17194r() {
        return rbz.m75184b(this.fullscreenTemplateCase_);
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
