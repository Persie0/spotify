package com.spotify.watchfeed.component.model.p187v1.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.chb1;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes11.dex */
public final class Visual extends AbstractC0269h implements sre0 {
    public static final int ARTWORK_FIELD_NUMBER = 1;
    private static final Visual DEFAULT_INSTANCE;
    public static final int ICON_FIELD_NUMBER = 2;
    public static final int LABELED_CIRCLE_FIELD_NUMBER = 3;
    private static volatile r2n0 PARSER;
    private int visualCase_ = 0;
    private Object visual_;

    static {
        Visual visual = new Visual();
        DEFAULT_INSTANCE = visual;
        AbstractC0269h.registerDefaultInstance(Visual.class, visual);
    }

    private Visual() {
    }

    /* JADX INFO: renamed from: o */
    public static Visual m22929o() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0001\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001<\u0000\u0002Ȼ\u0000\u0003<\u0000", new Object[]{"visual_", "visualCase_", Artwork.class, LabeledCircle.class});
        }
        if (iOrdinal == 3) {
            return new Visual();
        }
        if (iOrdinal == 4) {
            return new chb1(DEFAULT_INSTANCE, 27);
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
        synchronized (Visual.class) {
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
    public final Artwork m22930n() {
        return this.visualCase_ == 1 ? (Artwork) this.visual_ : Artwork.m22879o();
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: p */
    public final String m22931p() {
        return this.visualCase_ == 2 ? (String) this.visual_ : "";
    }

    /* JADX INFO: renamed from: q */
    public final LabeledCircle m22932q() {
        return this.visualCase_ == 3 ? (LabeledCircle) this.visual_ : LabeledCircle.m22899o();
    }

    /* JADX INFO: renamed from: r */
    public final boolean m22933r() {
        return this.visualCase_ == 1;
    }

    /* JADX INFO: renamed from: s */
    public final boolean m22934s() {
        return this.visualCase_ == 2;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
