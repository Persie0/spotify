package com.spotify.watchfeed.component.item.p184v1;

import com.google.protobuf.AbstractC0269h;
import p204p.gva;
import p204p.mlx;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes11.dex */
public final class ExplicitBadgeComponent extends AbstractC0269h implements sre0 {
    public static final int ACCESSIBILITY_TEXT_FIELD_NUMBER = 3;
    private static final ExplicitBadgeComponent DEFAULT_INSTANCE;
    public static final int ID_FIELD_NUMBER = 1;
    public static final int IS_19_PLUS_FIELD_NUMBER = 2;
    private static volatile r2n0 PARSER;
    private boolean is19Plus_;
    private String id_ = "";
    private String accessibilityText_ = "";

    static {
        ExplicitBadgeComponent explicitBadgeComponent = new ExplicitBadgeComponent();
        DEFAULT_INSTANCE = explicitBadgeComponent;
        AbstractC0269h.registerDefaultInstance(ExplicitBadgeComponent.class, explicitBadgeComponent);
    }

    private ExplicitBadgeComponent() {
    }

    /* JADX INFO: renamed from: p */
    public static ExplicitBadgeComponent m22650p(gva gvaVar) {
        return (ExplicitBadgeComponent) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, gvaVar);
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\u0007\u0003Ȉ", new Object[]{"id_", "is19Plus_", "accessibilityText_"});
        }
        if (iOrdinal == 3) {
            return new ExplicitBadgeComponent();
        }
        if (iOrdinal == 4) {
            return new mlx(DEFAULT_INSTANCE, 2);
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
        synchronized (ExplicitBadgeComponent.class) {
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

    public final String getId() {
        return this.id_;
    }

    /* JADX INFO: renamed from: n */
    public final String m22651n() {
        return this.accessibilityText_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final boolean m22652o() {
        return this.is19Plus_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
