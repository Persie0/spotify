package com.spotify.pendragon.p123v1.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.az8;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes9.dex */
public final class BasicWebview extends AbstractC0269h implements sre0 {
    private static final BasicWebview DEFAULT_INSTANCE;
    public static final int DISMISS_URI_SUFFIX_FIELD_NUMBER = 2;
    private static volatile r2n0 PARSER = null;
    public static final int WEB_MODAL_URI_FIELD_NUMBER = 1;
    private int bitField0_;
    private String webModalUri_ = "";
    private String dismissUriSuffix_ = "";

    static {
        BasicWebview basicWebview = new BasicWebview();
        DEFAULT_INSTANCE = basicWebview;
        AbstractC0269h.registerDefaultInstance(BasicWebview.class, basicWebview);
    }

    private BasicWebview() {
    }

    /* JADX INFO: renamed from: n */
    public static BasicWebview m17110n() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002ለ\u0000", new Object[]{"bitField0_", "webModalUri_", "dismissUriSuffix_"});
        }
        if (iOrdinal == 3) {
            return new BasicWebview();
        }
        if (iOrdinal == 4) {
            return new az8(DEFAULT_INSTANCE, 11);
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
        synchronized (BasicWebview.class) {
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
    public final String m17111o() {
        return this.dismissUriSuffix_;
    }

    /* JADX INFO: renamed from: p */
    public final String m17112p() {
        return this.webModalUri_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
