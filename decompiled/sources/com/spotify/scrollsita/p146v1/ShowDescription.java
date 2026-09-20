package com.spotify.scrollsita.p146v1;

import com.google.protobuf.AbstractC0269h;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.rl11;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes10.dex */
public final class ShowDescription extends AbstractC0269h implements sre0 {
    private static final ShowDescription DEFAULT_INSTANCE;
    public static final int ENTITY_URI_FIELD_NUMBER = 1;
    public static final int HEADING_FIELD_NUMBER = 2;
    private static volatile r2n0 PARSER;
    private int bitField0_;
    private String entityUri_ = "";
    private Heading heading_;

    static {
        ShowDescription showDescription = new ShowDescription();
        DEFAULT_INSTANCE = showDescription;
        AbstractC0269h.registerDefaultInstance(ShowDescription.class, showDescription);
    }

    private ShowDescription() {
    }

    /* JADX INFO: renamed from: n */
    public static void m20663n(ShowDescription showDescription, String str) {
        showDescription.getClass();
        showDescription.entityUri_ = str;
    }

    /* JADX INFO: renamed from: o */
    public static void m20664o(ShowDescription showDescription, Heading heading) {
        showDescription.getClass();
        heading.getClass();
        showDescription.heading_ = heading;
        showDescription.bitField0_ |= 1;
    }

    /* JADX INFO: renamed from: p */
    public static ShowDescription m20665p() {
        return DEFAULT_INSTANCE;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: s */
    public static rl11 m20666s() {
        return (rl11) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002ဉ\u0000", new Object[]{"bitField0_", "entityUri_", "heading_"});
        }
        if (iOrdinal == 3) {
            return new ShowDescription();
        }
        if (iOrdinal == 4) {
            return new rl11(DEFAULT_INSTANCE);
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
        synchronized (ShowDescription.class) {
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

    /* JADX INFO: renamed from: q */
    public final String m20667q() {
        return this.entityUri_;
    }

    /* JADX INFO: renamed from: r */
    public final Heading m20668r() {
        Heading heading = this.heading_;
        return heading == null ? Heading.m20509o() : heading;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
