package com.spotify.corex.readalongtranscript.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.d2i0;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes6.dex */
public final class MusicClosedCaption extends AbstractC0269h implements sre0 {
    private static final MusicClosedCaption DEFAULT_INSTANCE;
    public static final int END_MS_FIELD_NUMBER = 1;
    public static final int OVERLAPS_COMPONENT_FIELD_NUMBER = 3;
    private static volatile r2n0 PARSER = null;
    public static final int TEXT_FIELD_NUMBER = 2;
    private int endMs_;
    private boolean overlapsComponent_;
    private String text_ = "";

    static {
        MusicClosedCaption musicClosedCaption = new MusicClosedCaption();
        DEFAULT_INSTANCE = musicClosedCaption;
        AbstractC0269h.registerDefaultInstance(MusicClosedCaption.class, musicClosedCaption);
    }

    private MusicClosedCaption() {
    }

    /* JADX INFO: renamed from: n */
    public static MusicClosedCaption m8093n() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0004\u0002Ȉ\u0003\u0007", new Object[]{"endMs_", "text_", "overlapsComponent_"});
        }
        if (iOrdinal == 3) {
            return new MusicClosedCaption();
        }
        if (iOrdinal == 4) {
            return new d2i0(DEFAULT_INSTANCE, 11);
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
        synchronized (MusicClosedCaption.class) {
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
    public final int m8094o() {
        return this.endMs_;
    }

    /* JADX INFO: renamed from: p */
    public final boolean m8095p() {
        return this.overlapsComponent_;
    }

    /* JADX INFO: renamed from: q */
    public final String m8096q() {
        return this.text_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
