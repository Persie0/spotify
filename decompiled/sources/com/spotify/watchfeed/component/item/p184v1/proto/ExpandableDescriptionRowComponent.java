package com.spotify.watchfeed.component.item.p184v1.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.gva;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.vnw;
import p204p.z110;

/* JADX INFO: loaded from: classes11.dex */
public final class ExpandableDescriptionRowComponent extends AbstractC0269h implements sre0 {
    public static final int BODY_FIELD_NUMBER = 1;
    public static final int COLLAPSE_TEXT_FIELD_NUMBER = 3;
    private static final ExpandableDescriptionRowComponent DEFAULT_INSTANCE;
    public static final int EXPAND_TEXT_FIELD_NUMBER = 2;
    public static final int HEADING_FIELD_NUMBER = 4;
    private static volatile r2n0 PARSER;
    private String body_ = "";
    private String expandText_ = "";
    private String collapseText_ = "";
    private String heading_ = "";

    static {
        ExpandableDescriptionRowComponent expandableDescriptionRowComponent = new ExpandableDescriptionRowComponent();
        DEFAULT_INSTANCE = expandableDescriptionRowComponent;
        AbstractC0269h.registerDefaultInstance(ExpandableDescriptionRowComponent.class, expandableDescriptionRowComponent);
    }

    private ExpandableDescriptionRowComponent() {
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: r */
    public static ExpandableDescriptionRowComponent m22751r(gva gvaVar) {
        return (ExpandableDescriptionRowComponent) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, gvaVar);
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004Ȉ", new Object[]{"body_", "expandText_", "collapseText_", "heading_"});
        }
        if (iOrdinal == 3) {
            return new ExpandableDescriptionRowComponent();
        }
        if (iOrdinal == 4) {
            return new vnw(DEFAULT_INSTANCE, 27);
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
        synchronized (ExpandableDescriptionRowComponent.class) {
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
    public final String m22752n() {
        return this.body_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final String m22753o() {
        return this.collapseText_;
    }

    /* JADX INFO: renamed from: p */
    public final String m22754p() {
        return this.expandText_;
    }

    /* JADX INFO: renamed from: q */
    public final String m22755q() {
        return this.heading_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
