package com.spotify.extendedmetadata.extensions.companioncontentimpl.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.ore0;
import p204p.pof;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes6.dex */
public final class Component extends AbstractC0269h implements sre0 {
    private static final Component DEFAULT_INSTANCE;
    public static final int END_MS_FIELD_NUMBER = 2;
    public static final int ENTITY_COMPONENT_FIELD_NUMBER = 5;
    public static final int EXTERNAL_LINK_FIELD_NUMBER = 6;
    public static final int IMAGE_FIELD_NUMBER = 3;
    public static final int LOOPING_VIDEO_FIELD_NUMBER = 4;
    private static volatile r2n0 PARSER = null;
    public static final int START_MS_FIELD_NUMBER = 1;
    private int bitField0_;
    private int bodyCase_ = 0;
    private Object body_;
    private int endMs_;
    private int startMs_;

    static {
        Component component = new Component();
        DEFAULT_INSTANCE = component;
        AbstractC0269h.registerDefaultInstance(Component.class, component);
    }

    private Component() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0001\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001\u0004\u0002င\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000\u0006<\u0000", new Object[]{"body_", "bodyCase_", "bitField0_", "startMs_", "endMs_", ImageComponent.class, LoopingVideoComponent.class, EntityComponent.class, ExternalLinkComponent.class});
        }
        if (iOrdinal == 3) {
            return new Component();
        }
        if (iOrdinal == 4) {
            return new pof(DEFAULT_INSTANCE, 17);
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
        synchronized (Component.class) {
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
    public final int m9934n() {
        int i = this.bodyCase_;
        if (i == 0) {
            return 5;
        }
        if (i == 3) {
            return 1;
        }
        if (i == 4) {
            return 2;
        }
        if (i != 5) {
            return i != 6 ? 0 : 4;
        }
        return 3;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final int m9935o() {
        return this.endMs_;
    }

    /* JADX INFO: renamed from: p */
    public final EntityComponent m9936p() {
        return this.bodyCase_ == 5 ? (EntityComponent) this.body_ : EntityComponent.m9942o();
    }

    /* JADX INFO: renamed from: q */
    public final ExternalLinkComponent m9937q() {
        return this.bodyCase_ == 6 ? (ExternalLinkComponent) this.body_ : ExternalLinkComponent.m9952n();
    }

    /* JADX INFO: renamed from: r */
    public final ImageComponent m9938r() {
        return this.bodyCase_ == 3 ? (ImageComponent) this.body_ : ImageComponent.m9956q();
    }

    /* JADX INFO: renamed from: s */
    public final LoopingVideoComponent m9939s() {
        return this.bodyCase_ == 4 ? (LoopingVideoComponent) this.body_ : LoopingVideoComponent.m9965p();
    }

    /* JADX INFO: renamed from: t */
    public final int m9940t() {
        return this.startMs_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }

    /* JADX INFO: renamed from: u */
    public final boolean m9941u() {
        return (this.bitField0_ & 1) != 0;
    }
}
