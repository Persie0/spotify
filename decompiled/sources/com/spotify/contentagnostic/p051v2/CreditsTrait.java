package com.spotify.contentagnostic.p051v2;

import com.google.protobuf.AbstractC0269h;
import p204p.ae50;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.xbl;
import p204p.z110;

/* JADX INFO: loaded from: classes6.dex */
public final class CreditsTrait extends AbstractC0269h implements sre0 {
    public static final int CONTRIBUTORS_FIELD_NUMBER = 1;
    private static final CreditsTrait DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER = null;
    public static final int SOURCES_FIELD_NUMBER = 2;
    private ae50 contributors_ = AbstractC0269h.emptyProtobufList();
    private ae50 sources_ = AbstractC0269h.emptyProtobufList();

    static {
        CreditsTrait creditsTrait = new CreditsTrait();
        DEFAULT_INSTANCE = creditsTrait;
        AbstractC0269h.registerDefaultInstance(CreditsTrait.class, creditsTrait);
    }

    private CreditsTrait() {
    }

    /* JADX INFO: renamed from: p */
    public static CreditsTrait m7830p(byte[] bArr) {
        return (CreditsTrait) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr);
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0002\u0000\u0001\u001b\u0002\u001b", new Object[]{"contributors_", Contributor.class, "sources_", CreditsSource.class});
        }
        if (iOrdinal == 3) {
            return new CreditsTrait();
        }
        if (iOrdinal == 4) {
            return new xbl(DEFAULT_INSTANCE, 19);
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
        synchronized (CreditsTrait.class) {
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
    public final ae50 m7831n() {
        return this.contributors_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final ae50 m7832o() {
        return this.sources_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
