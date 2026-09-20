package com.spotify.personalizedepisodes.contentservice.p124v1;

import com.google.protobuf.AbstractC0269h;
import p204p.AbstractC1733c9;
import p204p.AbstractC2118m8;
import p204p.ae50;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.y5o0;
import p204p.z110;

/* JADX INFO: loaded from: classes9.dex */
public final class Placeholder extends AbstractC0269h implements sre0 {
    public static final int ARTWORK_FIELD_NUMBER = 3;
    public static final int ARTWORK_OPTIONS_FIELD_NUMBER = 4;
    private static final Placeholder DEFAULT_INSTANCE;
    public static final int ID_FIELD_NUMBER = 1;
    private static volatile r2n0 PARSER = null;
    public static final int TITLE_FIELD_NUMBER = 2;
    private String id_ = "";
    private String title_ = "";
    private String artwork_ = "";
    private ae50 artworkOptions_ = AbstractC0269h.emptyProtobufList();

    static {
        Placeholder placeholder = new Placeholder();
        DEFAULT_INSTANCE = placeholder;
        AbstractC0269h.registerDefaultInstance(Placeholder.class, placeholder);
    }

    private Placeholder() {
    }

    /* JADX INFO: renamed from: n */
    public static void m17438n(Placeholder placeholder, Iterable iterable) {
        ae50 ae50Var = placeholder.artworkOptions_;
        if (!((AbstractC1733c9) ae50Var).f35342a) {
            placeholder.artworkOptions_ = AbstractC0269h.mutableCopy(ae50Var);
        }
        AbstractC2118m8.addAll(iterable, placeholder.artworkOptions_);
    }

    /* JADX INFO: renamed from: o */
    public static void m17439o(Placeholder placeholder, String str) {
        placeholder.getClass();
        str.getClass();
        placeholder.artwork_ = str;
    }

    /* JADX INFO: renamed from: p */
    public static void m17440p(Placeholder placeholder, String str) {
        placeholder.getClass();
        str.getClass();
        placeholder.id_ = str;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static void m17441q(Placeholder placeholder, String str) {
        placeholder.getClass();
        str.getClass();
        placeholder.title_ = str;
    }

    /* JADX INFO: renamed from: t */
    public static Placeholder m17442t() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: renamed from: u */
    public static y5o0 m17443u() {
        return (y5o0) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0001\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004Ț", new Object[]{"id_", "title_", "artwork_", "artworkOptions_"});
        }
        if (iOrdinal == 3) {
            return new Placeholder();
        }
        if (iOrdinal == 4) {
            return new y5o0(DEFAULT_INSTANCE);
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
        synchronized (Placeholder.class) {
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

    public final String getTitle() {
        return this.title_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: r */
    public final String m17444r() {
        return this.artwork_;
    }

    /* JADX INFO: renamed from: s */
    public final ae50 m17445s() {
        return this.artworkOptions_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
