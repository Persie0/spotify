package spotify.playlist.local_list_config_esperanto.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.tda0;
import p204p.z110;

/* JADX INFO: loaded from: classes3.dex */
public final class LocalListConfig extends AbstractC0269h implements sre0 {
    private static final LocalListConfig DEFAULT_INSTANCE;
    public static final int DESCRIPTION_FIELD_NUMBER = 4;
    public static final int IMAGE_URI_FIELD_NUMBER = 3;
    public static final int NAME_FIELD_NUMBER = 2;
    private static volatile r2n0 PARSER = null;
    public static final int URI_FIELD_NUMBER = 1;
    private String uri_ = "";
    private String name_ = "";
    private String imageUri_ = "";
    private String description_ = "";

    static {
        LocalListConfig localListConfig = new LocalListConfig();
        DEFAULT_INSTANCE = localListConfig;
        AbstractC0269h.registerDefaultInstance(LocalListConfig.class, localListConfig);
    }

    private LocalListConfig() {
    }

    /* JADX INFO: renamed from: n */
    public static void m97806n(LocalListConfig localListConfig, String str) {
        localListConfig.getClass();
        str.getClass();
        localListConfig.description_ = str;
    }

    /* JADX INFO: renamed from: o */
    public static void m97807o(LocalListConfig localListConfig, String str) {
        localListConfig.getClass();
        localListConfig.imageUri_ = str;
    }

    /* JADX INFO: renamed from: p */
    public static void m97808p(LocalListConfig localListConfig, String str) {
        localListConfig.getClass();
        str.getClass();
        localListConfig.name_ = str;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static void m97809q(LocalListConfig localListConfig, String str) {
        localListConfig.getClass();
        str.getClass();
        localListConfig.uri_ = str;
    }

    /* JADX INFO: renamed from: r */
    public static tda0 m97810r() {
        return (tda0) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004Ȉ", new Object[]{"uri_", "name_", "imageUri_", "description_"});
        }
        if (iOrdinal == 3) {
            return new LocalListConfig();
        }
        if (iOrdinal == 4) {
            return new tda0(DEFAULT_INSTANCE);
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
        synchronized (LocalListConfig.class) {
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
