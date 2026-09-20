package com.spotify.allcap.p021v1;

import com.google.protobuf.AbstractC0269h;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.xbl;
import p204p.z110;
import p204p.zta;

/* JADX INFO: loaded from: classes3.dex */
public final class Cta extends AbstractC0269h implements sre0 {
    public static final int BUTTON_TYPE_FIELD_NUMBER = 3;
    private static final Cta DEFAULT_INSTANCE;
    public static final int LABEL_FIELD_NUMBER = 1;
    private static volatile r2n0 PARSER = null;
    public static final int URI_FIELD_NUMBER = 2;
    private int bitField0_;
    private int buttonType_;
    private String label_ = "";
    private String uri_ = "";

    static {
        Cta cta = new Cta();
        DEFAULT_INSTANCE = cta;
        AbstractC0269h.registerDefaultInstance(Cta.class, cta);
    }

    private Cta() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003ဌ\u0000", new Object[]{"bitField0_", "label_", "uri_", "buttonType_"});
        }
        if (iOrdinal == 3) {
            return new Cta();
        }
        if (iOrdinal == 4) {
            return new xbl(DEFAULT_INSTANCE, 20);
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
        synchronized (Cta.class) {
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

    public final String getUri() {
        return this.uri_;
    }

    /* JADX INFO: renamed from: n */
    public final zta m3234n() {
        zta ztaVar;
        int i = this.buttonType_;
        if (i == 0) {
            ztaVar = zta.PRIMARY;
        } else if (i != 1) {
            ztaVar = i != 2 ? null : zta.TERTIARY;
        } else {
            ztaVar = zta.SECONDARY;
        }
        return ztaVar == null ? zta.UNRECOGNIZED : ztaVar;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final String m3235o() {
        return this.label_;
    }

    /* JADX INFO: renamed from: p */
    public final boolean m3236p() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
