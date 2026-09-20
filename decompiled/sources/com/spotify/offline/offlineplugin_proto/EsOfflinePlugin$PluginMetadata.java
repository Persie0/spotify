package com.spotify.offline.offlineplugin_proto;

import com.google.protobuf.AbstractC0269h;
import p204p.AbstractC1733c9;
import p204p.ae50;
import p204p.iq3;
import p204p.n350;
import p204p.ntx;
import p204p.ore0;
import p204p.pre0;
import p204p.qmw;
import p204p.r110;
import p204p.r2n0;
import p204p.rmw;
import p204p.smw;
import p204p.sre0;
import p204p.ud50;
import p204p.vd50;
import p204p.wej0;
import p204p.z110;

/* JADX INFO: loaded from: classes2.dex */
public final class EsOfflinePlugin$PluginMetadata extends AbstractC0269h implements sre0 {
    public static final int BEST_EFFORT_FIELD_NUMBER = 5;
    private static final EsOfflinePlugin$PluginMetadata DEFAULT_INSTANCE;
    public static final int EXTENSION_KINDS_FIELD_NUMBER = 4;
    public static final int NAME_FIELD_NUMBER = 1;
    private static volatile r2n0 PARSER = null;
    public static final int REQUIRED_CONTEXT_TAGS_FIELD_NUMBER = 6;
    public static final int RESOURCE_TYPE_FIELD_NUMBER = 3;
    public static final int SUPPORTED_LINK_TYPES_FIELD_NUMBER = 2;
    private boolean bestEffort_;
    private int extensionKindsMemoizedSerializedSize;
    private int resourceType_;
    private int supportedLinkTypesMemoizedSerializedSize;
    private static final vd50 supportedLinkTypes_converter_ = new wej0(25);
    private static final vd50 extensionKinds_converter_ = new iq3(11);
    private String name_ = "";
    private ud50 supportedLinkTypes_ = AbstractC0269h.emptyIntList();
    private ud50 extensionKinds_ = AbstractC0269h.emptyIntList();
    private ae50 requiredContextTags_ = AbstractC0269h.emptyProtobufList();

    static {
        EsOfflinePlugin$PluginMetadata esOfflinePlugin$PluginMetadata = new EsOfflinePlugin$PluginMetadata();
        DEFAULT_INSTANCE = esOfflinePlugin$PluginMetadata;
        AbstractC0269h.registerDefaultInstance(EsOfflinePlugin$PluginMetadata.class, esOfflinePlugin$PluginMetadata);
    }

    private EsOfflinePlugin$PluginMetadata() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: n */
    public static void m16059n(EsOfflinePlugin$PluginMetadata esOfflinePlugin$PluginMetadata) {
        ntx ntxVar = ntx.TRACK_V4;
        esOfflinePlugin$PluginMetadata.getClass();
        ud50 ud50Var = esOfflinePlugin$PluginMetadata.extensionKinds_;
        if (!((AbstractC1733c9) ud50Var).f35342a) {
            esOfflinePlugin$PluginMetadata.extensionKinds_ = AbstractC0269h.mutableCopy(ud50Var);
        }
        ((n350) esOfflinePlugin$PluginMetadata.extensionKinds_).m63581b(ntxVar.getNumber());
    }

    /* JADX INFO: renamed from: o */
    public static void m16060o(EsOfflinePlugin$PluginMetadata esOfflinePlugin$PluginMetadata) {
        esOfflinePlugin$PluginMetadata.getClass();
        ae50 ae50Var = esOfflinePlugin$PluginMetadata.requiredContextTags_;
        if (!((AbstractC1733c9) ae50Var).f35342a) {
            esOfflinePlugin$PluginMetadata.requiredContextTags_ = AbstractC0269h.mutableCopy(ae50Var);
        }
        esOfflinePlugin$PluginMetadata.requiredContextTags_.add("workout");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: p */
    public static void m16061p(EsOfflinePlugin$PluginMetadata esOfflinePlugin$PluginMetadata) {
        esOfflinePlugin$PluginMetadata.getClass();
        ud50 ud50Var = esOfflinePlugin$PluginMetadata.supportedLinkTypes_;
        if (!((AbstractC1733c9) ud50Var).f35342a) {
            esOfflinePlugin$PluginMetadata.supportedLinkTypes_ = AbstractC0269h.mutableCopy(ud50Var);
        }
        ((n350) esOfflinePlugin$PluginMetadata.supportedLinkTypes_).m63581b(qmw.TRACK.getNumber());
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static void m16062q(EsOfflinePlugin$PluginMetadata esOfflinePlugin$PluginMetadata, boolean z) {
        esOfflinePlugin$PluginMetadata.bestEffort_ = z;
    }

    /* JADX INFO: renamed from: r */
    public static void m16063r(EsOfflinePlugin$PluginMetadata esOfflinePlugin$PluginMetadata, String str) {
        esOfflinePlugin$PluginMetadata.getClass();
        esOfflinePlugin$PluginMetadata.name_ = str;
    }

    /* JADX INFO: renamed from: s */
    public static void m16064s(EsOfflinePlugin$PluginMetadata esOfflinePlugin$PluginMetadata) {
        esOfflinePlugin$PluginMetadata.getClass();
        esOfflinePlugin$PluginMetadata.resourceType_ = smw.OTHER.getNumber();
    }

    /* JADX INFO: renamed from: t */
    public static rmw m16065t() {
        return (rmw) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0000\u0001\u0006\u0006\u0000\u0003\u0000\u0001Ȉ\u0002,\u0003\f\u0004,\u0005\u0007\u0006Ț", new Object[]{"name_", "supportedLinkTypes_", "resourceType_", "extensionKinds_", "bestEffort_", "requiredContextTags_"});
        }
        if (iOrdinal == 3) {
            return new EsOfflinePlugin$PluginMetadata();
        }
        if (iOrdinal == 4) {
            return new rmw(DEFAULT_INSTANCE);
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
        synchronized (EsOfflinePlugin$PluginMetadata.class) {
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
