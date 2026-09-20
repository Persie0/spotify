package spotify.mdata.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.AbstractC1733c9;
import p204p.AbstractC2118m8;
import p204p.ae50;
import p204p.ntx;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;
import p204p.z4d0;

/* JADX INFO: loaded from: classes11.dex */
public final class Mdata$LocalExtensionQuery extends AbstractC0269h implements sre0 {
    private static final Mdata$LocalExtensionQuery DEFAULT_INSTANCE;
    public static final int ENTITY_URI_FIELD_NUMBER = 2;
    public static final int EXTENSION_KIND_FIELD_NUMBER = 1;
    private static volatile r2n0 PARSER;
    private ae50 entityUri_ = AbstractC0269h.emptyProtobufList();
    private int extensionKind_;

    static {
        Mdata$LocalExtensionQuery mdata$LocalExtensionQuery = new Mdata$LocalExtensionQuery();
        DEFAULT_INSTANCE = mdata$LocalExtensionQuery;
        AbstractC0269h.registerDefaultInstance(Mdata$LocalExtensionQuery.class, mdata$LocalExtensionQuery);
    }

    private Mdata$LocalExtensionQuery() {
    }

    /* JADX INFO: renamed from: n */
    public static void m97634n(Mdata$LocalExtensionQuery mdata$LocalExtensionQuery, Iterable iterable) {
        ae50 ae50Var = mdata$LocalExtensionQuery.entityUri_;
        if (!((AbstractC1733c9) ae50Var).f35342a) {
            mdata$LocalExtensionQuery.entityUri_ = AbstractC0269h.mutableCopy(ae50Var);
        }
        AbstractC2118m8.addAll(iterable, mdata$LocalExtensionQuery.entityUri_);
    }

    /* JADX INFO: renamed from: o */
    public static void m97635o(Mdata$LocalExtensionQuery mdata$LocalExtensionQuery, String str) {
        mdata$LocalExtensionQuery.getClass();
        str.getClass();
        ae50 ae50Var = mdata$LocalExtensionQuery.entityUri_;
        if (!((AbstractC1733c9) ae50Var).f35342a) {
            mdata$LocalExtensionQuery.entityUri_ = AbstractC0269h.mutableCopy(ae50Var);
        }
        mdata$LocalExtensionQuery.entityUri_.add(str);
    }

    /* JADX INFO: renamed from: p */
    public static void m97636p(Mdata$LocalExtensionQuery mdata$LocalExtensionQuery, ntx ntxVar) {
        mdata$LocalExtensionQuery.getClass();
        mdata$LocalExtensionQuery.extensionKind_ = ntxVar.getNumber();
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static z4d0 m97637q() {
        return (z4d0) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\f\u0002Ț", new Object[]{"extensionKind_", "entityUri_"});
        }
        if (iOrdinal == 3) {
            return new Mdata$LocalExtensionQuery();
        }
        if (iOrdinal == 4) {
            return new z4d0(DEFAULT_INSTANCE);
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
        synchronized (Mdata$LocalExtensionQuery.class) {
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
