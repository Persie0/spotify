package com.spotify.idj.p082v1;

import com.google.protobuf.AbstractC0269h;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.uro;
import p204p.z110;

/* JADX INFO: loaded from: classes7.dex */
public final class Description extends AbstractC0269h implements sre0 {
    private static final Description DEFAULT_INSTANCE;
    public static final int DESCRIPTION_LOCALIZED_TEXT_FIELD_NUMBER = 1;
    public static final int LINK_LOCALIZED_TEXT_FIELD_NUMBER = 2;
    public static final int NAV_URI_FIELD_NUMBER = 3;
    private static volatile r2n0 PARSER;
    private String descriptionLocalizedText_ = "";
    private String linkLocalizedText_ = "";
    private String navUri_ = "";

    static {
        Description description = new Description();
        DEFAULT_INSTANCE = description;
        AbstractC0269h.registerDefaultInstance(Description.class, description);
    }

    private Description() {
    }

    /* JADX INFO: renamed from: n */
    public static Description m11976n() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ", new Object[]{"descriptionLocalizedText_", "linkLocalizedText_", "navUri_"});
        }
        if (iOrdinal == 3) {
            return new Description();
        }
        if (iOrdinal == 4) {
            return new uro(DEFAULT_INSTANCE, 15);
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
        synchronized (Description.class) {
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
    public final String m11977o() {
        return this.descriptionLocalizedText_;
    }

    /* JADX INFO: renamed from: p */
    public final String m11978p() {
        return this.linkLocalizedText_;
    }

    /* JADX INFO: renamed from: q */
    public final String m11979q() {
        return this.navUri_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
