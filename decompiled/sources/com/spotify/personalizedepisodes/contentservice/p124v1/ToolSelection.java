package com.spotify.personalizedepisodes.contentservice.p124v1;

import com.google.protobuf.AbstractC0269h;
import p204p.AbstractC1733c9;
import p204p.AbstractC2118m8;
import p204p.ae50;
import p204p.f081;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes9.dex */
public final class ToolSelection extends AbstractC0269h implements sre0 {
    private static final ToolSelection DEFAULT_INSTANCE;
    public static final int ENABLED_TOOLS_FIELD_NUMBER = 1;
    private static volatile r2n0 PARSER;
    private ae50 enabledTools_ = AbstractC0269h.emptyProtobufList();

    static {
        ToolSelection toolSelection = new ToolSelection();
        DEFAULT_INSTANCE = toolSelection;
        AbstractC0269h.registerDefaultInstance(ToolSelection.class, toolSelection);
    }

    private ToolSelection() {
    }

    /* JADX INFO: renamed from: n */
    public static void m17525n(ToolSelection toolSelection, Iterable iterable) {
        ae50 ae50Var = toolSelection.enabledTools_;
        if (!((AbstractC1733c9) ae50Var).f35342a) {
            toolSelection.enabledTools_ = AbstractC0269h.mutableCopy(ae50Var);
        }
        AbstractC2118m8.addAll(iterable, toolSelection.enabledTools_);
    }

    /* JADX INFO: renamed from: o */
    public static ToolSelection m17526o() {
        return DEFAULT_INSTANCE;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static f081 m17527q() {
        return (f081) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001Ț", new Object[]{"enabledTools_"});
        }
        if (iOrdinal == 3) {
            return new ToolSelection();
        }
        if (iOrdinal == 4) {
            return new f081(DEFAULT_INSTANCE);
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
        synchronized (ToolSelection.class) {
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

    /* JADX INFO: renamed from: p */
    public final ae50 m17528p() {
        return this.enabledTools_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
