package com.spotify.automix.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.n991;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.s791;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes5.dex */
public final class TransitionOuterClass$StyleBlock extends AbstractC0269h implements sre0 {
    public static final int BEATS_FIELD_NUMBER = 2;
    private static final TransitionOuterClass$StyleBlock DEFAULT_INSTANCE;
    public static final int END_FIELD_NUMBER = 4;
    private static volatile r2n0 PARSER = null;
    public static final int START_FIELD_NUMBER = 3;
    public static final int TYPE_FIELD_NUMBER = 1;
    private float beats_;
    private float end_;
    private float start_;
    private int type_;

    static {
        TransitionOuterClass$StyleBlock transitionOuterClass$StyleBlock = new TransitionOuterClass$StyleBlock();
        DEFAULT_INSTANCE = transitionOuterClass$StyleBlock;
        AbstractC0269h.registerDefaultInstance(TransitionOuterClass$StyleBlock.class, transitionOuterClass$StyleBlock);
    }

    private TransitionOuterClass$StyleBlock() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\f\u0002\u0001\u0003\u0001\u0004\u0001", new Object[]{"type_", "beats_", "start_", "end_"});
        }
        if (iOrdinal == 3) {
            return new TransitionOuterClass$StyleBlock();
        }
        if (iOrdinal == 4) {
            return new s791(DEFAULT_INSTANCE, 7);
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
        synchronized (TransitionOuterClass$StyleBlock.class) {
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
    public final float m3944n() {
        return this.beats_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final float m3945o() {
        return this.end_;
    }

    /* JADX INFO: renamed from: p */
    public final float m3946p() {
        return this.start_;
    }

    /* JADX INFO: renamed from: q */
    public final n991 m3947q() {
        n991 n991Var;
        int i = this.type_;
        if (i == 0) {
            n991Var = n991.STYLE_BLOCK_TYPE_UNSPECIFIED;
        } else if (i == 1) {
            n991Var = n991.STYLE_BLOCK_TYPE_LOOP;
        } else if (i != 2) {
            n991Var = i != 3 ? null : n991.STYLE_BLOCK_TYPE_VINYL_STOP;
        } else {
            n991Var = n991.STYLE_BLOCK_TYPE_SPINBACK;
        }
        return n991Var == null ? n991.UNRECOGNIZED : n991Var;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
