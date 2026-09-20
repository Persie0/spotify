package com.spotify.pendragon.p123v1.proto;

import com.google.protobuf.AbstractC0269h;
import java.util.Collections;
import java.util.Map;
import p204p.ihc0;
import p204p.ioc;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.whe;
import p204p.xhe;
import p204p.z110;

/* JADX INFO: loaded from: classes2.dex */
public final class ClickAction extends AbstractC0269h implements sre0 {
    public static final int ACTIONURL_FIELD_NUMBER = 2;
    public static final int CLICKACTIONIDENTIFIER_FIELD_NUMBER = 1;
    public static final int CLICK_ACTION_TYPE_FIELD_NUMBER = 4;
    private static final ClickAction DEFAULT_INSTANCE;
    public static final int METADATA_FIELD_NUMBER = 3;
    private static volatile r2n0 PARSER;
    private int bitField0_;
    private int clickActionType_;
    private ihc0 metadata_ = ihc0.f102235b;
    private String clickActionIdentifier_ = "";
    private String actionUrl_ = "";

    static {
        ClickAction clickAction = new ClickAction();
        DEFAULT_INSTANCE = clickAction;
        AbstractC0269h.registerDefaultInstance(ClickAction.class, clickAction);
    }

    private ClickAction() {
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: r */
    public static ClickAction m17140r() {
        return DEFAULT_INSTANCE;
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0001\u0000\u0000\u0001Ȉ\u0002ለ\u0000\u00032\u0004\f", new Object[]{"bitField0_", "clickActionIdentifier_", "actionUrl_", "metadata_", whe.f251339a, "clickActionType_"});
        }
        if (iOrdinal == 3) {
            return new ClickAction();
        }
        if (iOrdinal == 4) {
            return new ioc(20);
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
        synchronized (ClickAction.class) {
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

    public final Map getMetadataMap() {
        return Collections.unmodifiableMap(this.metadata_);
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final String m17141o() {
        return this.actionUrl_;
    }

    /* JADX INFO: renamed from: p */
    public final String m17142p() {
        return this.clickActionIdentifier_;
    }

    /* JADX INFO: renamed from: q */
    public final xhe m17143q() {
        xhe xheVarM90968a = xhe.m90968a(this.clickActionType_);
        return xheVarM90968a == null ? xhe.UNRECOGNIZED : xheVarM90968a;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
