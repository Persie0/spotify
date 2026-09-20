package com.spotify.pses.p134v1.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.ae50;
import p204p.dji;
import p204p.fwy;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.tfe;
import p204p.z110;

/* JADX INFO: loaded from: classes2.dex */
public final class ConfigurationResponse extends AbstractC0269h implements sre0 {
    private static final ConfigurationResponse DEFAULT_INSTANCE;
    public static final int DEFAULT_LAYOUT_FIELD_NUMBER = 3;
    public static final int FLAGS_FIELD_NUMBER = 1;
    public static final int GUEST_LAYOUT_FIELD_NUMBER = 8;
    public static final int INTENT_LED_LAYOUT_FIELD_NUMBER = 5;
    public static final int METHOD_LED_LAYOUT_FIELD_NUMBER = 6;
    private static volatile r2n0 PARSER = null;
    public static final int REQUEST_ID_FIELD_NUMBER = 4;
    private Object layout_;
    private int layoutCase_ = 0;
    private ae50 flags_ = AbstractC0269h.emptyProtobufList();
    private String requestId_ = "";

    static {
        ConfigurationResponse configurationResponse = new ConfigurationResponse();
        DEFAULT_INSTANCE = configurationResponse;
        AbstractC0269h.registerDefaultInstance(ConfigurationResponse.class, configurationResponse);
    }

    private ConfigurationResponse() {
    }

    /* JADX INFO: renamed from: n */
    public static void m19960n(ConfigurationResponse configurationResponse, IntentLedLayout intentLedLayout) {
        configurationResponse.getClass();
        intentLedLayout.getClass();
        configurationResponse.layout_ = intentLedLayout;
        configurationResponse.layoutCase_ = 5;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: t */
    public static dji m19962t() {
        return (dji) DEFAULT_INSTANCE.createBuilder();
    }

    /* JADX INFO: renamed from: u */
    public static ConfigurationResponse m19963u(fwy fwyVar) {
        return (ConfigurationResponse) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, fwyVar);
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0001\u0000\u0001\b\u0006\u0000\u0001\u0000\u0001Ț\u0003<\u0000\u0004Ȉ\u0005<\u0000\u0006<\u0000\b<\u0000", new Object[]{"layout_", "layoutCase_", "flags_", DefaultLayout.class, "requestId_", IntentLedLayout.class, MethodLedLayout.class, GuestLayout.class});
        }
        if (iOrdinal == 3) {
            return new ConfigurationResponse();
        }
        if (iOrdinal == 4) {
            return new dji();
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
        synchronized (ConfigurationResponse.class) {
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
    public final ae50 m19964p() {
        return this.flags_;
    }

    /* JADX INFO: renamed from: q */
    public final IntentLedLayout m19965q() {
        return this.layoutCase_ == 5 ? (IntentLedLayout) this.layout_ : IntentLedLayout.m19982r();
    }

    /* JADX INFO: renamed from: r */
    public final int m19966r() {
        return tfe.m80643a(this.layoutCase_);
    }

    /* JADX INFO: renamed from: s */
    public final String m19967s() {
        return this.requestId_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
