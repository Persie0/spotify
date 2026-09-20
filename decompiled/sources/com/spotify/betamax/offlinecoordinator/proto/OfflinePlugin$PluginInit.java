package com.spotify.betamax.offlinecoordinator.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.AbstractC1733c9;
import p204p.ae50;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.s0l0;
import p204p.sre0;
import p204p.u0l0;
import p204p.z110;

/* JADX INFO: loaded from: classes.dex */
public final class OfflinePlugin$PluginInit extends AbstractC0269h implements sre0 {
    private static final OfflinePlugin$PluginInit DEFAULT_INSTANCE;
    public static final int ID_FIELD_NUMBER = 1;
    private static volatile r2n0 PARSER = null;
    public static final int RESOURCE_TYPE_FIELD_NUMBER = 3;
    public static final int SUPPORTED_LINK_TYPES_FIELD_NUMBER = 2;
    private int resourceType_;
    private String id_ = "";
    private ae50 supportedLinkTypes_ = AbstractC0269h.emptyProtobufList();

    static {
        OfflinePlugin$PluginInit offlinePlugin$PluginInit = new OfflinePlugin$PluginInit();
        DEFAULT_INSTANCE = offlinePlugin$PluginInit;
        AbstractC0269h.registerDefaultInstance(OfflinePlugin$PluginInit.class, offlinePlugin$PluginInit);
    }

    private OfflinePlugin$PluginInit() {
    }

    /* JADX INFO: renamed from: n */
    public static void m4004n(OfflinePlugin$PluginInit offlinePlugin$PluginInit) {
        offlinePlugin$PluginInit.getClass();
        ae50 ae50Var = offlinePlugin$PluginInit.supportedLinkTypes_;
        if (!((AbstractC1733c9) ae50Var).f35342a) {
            offlinePlugin$PluginInit.supportedLinkTypes_ = AbstractC0269h.mutableCopy(ae50Var);
        }
        offlinePlugin$PluginInit.supportedLinkTypes_.add("episodes");
    }

    /* JADX INFO: renamed from: o */
    public static void m4005o(OfflinePlugin$PluginInit offlinePlugin$PluginInit) {
        offlinePlugin$PluginInit.getClass();
        offlinePlugin$PluginInit.id_ = "betamax-offline";
    }

    /* JADX INFO: renamed from: p */
    public static void m4006p(OfflinePlugin$PluginInit offlinePlugin$PluginInit) {
        offlinePlugin$PluginInit.getClass();
        offlinePlugin$PluginInit.resourceType_ = u0l0.VIDEO.getNumber();
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static s0l0 m4007q() {
        return (s0l0) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0001\u0000\u0001Ȉ\u0002Ț\u0003\f", new Object[]{"id_", "supportedLinkTypes_", "resourceType_"});
        }
        if (iOrdinal == 3) {
            return new OfflinePlugin$PluginInit();
        }
        if (iOrdinal == 4) {
            return new s0l0(DEFAULT_INSTANCE);
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
        synchronized (OfflinePlugin$PluginInit.class) {
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
