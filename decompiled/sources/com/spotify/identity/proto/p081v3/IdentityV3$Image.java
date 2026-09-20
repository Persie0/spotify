package com.spotify.identity.proto.p081v3;

import com.google.protobuf.AbstractC0269h;
import p204p.a530;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes2.dex */
public final class IdentityV3$Image extends AbstractC0269h implements sre0 {
    private static final IdentityV3$Image DEFAULT_INSTANCE;
    public static final int MAX_HEIGHT_FIELD_NUMBER = 2;
    public static final int MAX_WIDTH_FIELD_NUMBER = 1;
    private static volatile r2n0 PARSER = null;
    public static final int URL_FIELD_NUMBER = 3;
    private int maxHeight_;
    private int maxWidth_;
    private String url_ = "";

    static {
        IdentityV3$Image identityV3$Image = new IdentityV3$Image();
        DEFAULT_INSTANCE = identityV3$Image;
        AbstractC0269h.registerDefaultInstance(IdentityV3$Image.class, identityV3$Image);
    }

    private IdentityV3$Image() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0004\u0002\u0004\u0003Ȉ", new Object[]{"maxWidth_", "maxHeight_", "url_"});
        }
        if (iOrdinal == 3) {
            return new IdentityV3$Image();
        }
        if (iOrdinal == 4) {
            return new a530(23);
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
        synchronized (IdentityV3$Image.class) {
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

    public final String getUrl() {
        return this.url_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final int m11959o() {
        return this.maxHeight_;
    }

    /* JADX INFO: renamed from: p */
    public final int m11960p() {
        return this.maxWidth_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
