package com.spotify.playlistmixing.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.cva;
import p204p.gva;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.u121;
import p204p.z110;

/* JADX INFO: loaded from: classes9.dex */
public final class SignalData extends AbstractC0269h implements sre0 {
    public static final int ADDITIONAL_DATA_FIELD_NUMBER = 4;
    private static final SignalData DEFAULT_INSTANCE;
    public static final int ITEM_ID_FIELD_NUMBER = 3;
    public static final int LENS_IDENTIFIER_FIELD_NUMBER = 1;
    private static volatile r2n0 PARSER = null;
    public static final int URI_FIELD_NUMBER = 2;
    private gva additionalData_;
    private gva itemId_;
    private String lensIdentifier_ = "";
    private String uri_ = "";

    static {
        SignalData signalData = new SignalData();
        DEFAULT_INSTANCE = signalData;
        AbstractC0269h.registerDefaultInstance(SignalData.class, signalData);
    }

    private SignalData() {
        cva cvaVar = gva.f84678b;
        this.itemId_ = cvaVar;
        this.additionalData_ = cvaVar;
    }

    /* JADX INFO: renamed from: n */
    public static void m19432n(SignalData signalData) {
        signalData.getClass();
        signalData.lensIdentifier_ = "mix";
    }

    /* JADX INFO: renamed from: o */
    public static u121 m19433o() {
        return (u121) DEFAULT_INSTANCE.createBuilder();
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003\n\u0004\n", new Object[]{"lensIdentifier_", "uri_", "itemId_", "additionalData_"});
        }
        if (iOrdinal == 3) {
            return new SignalData();
        }
        if (iOrdinal == 4) {
            return new u121(DEFAULT_INSTANCE);
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
        synchronized (SignalData.class) {
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

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
