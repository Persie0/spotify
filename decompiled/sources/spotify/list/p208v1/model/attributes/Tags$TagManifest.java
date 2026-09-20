package spotify.list.p208v1.model.attributes;

import com.google.protobuf.AbstractC0269h;
import p204p.ae50;
import p204p.ore0;
import p204p.pre0;
import p204p.ps61;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes11.dex */
public final class Tags$TagManifest extends AbstractC0269h implements sre0 {
    private static final Tags$TagManifest DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER = null;
    public static final int TAGS_FIELD_NUMBER = 1;
    private ae50 tags_ = AbstractC0269h.emptyProtobufList();

    static {
        Tags$TagManifest tags$TagManifest = new Tags$TagManifest();
        DEFAULT_INSTANCE = tags$TagManifest;
        AbstractC0269h.registerDefaultInstance(Tags$TagManifest.class, tags$TagManifest);
    }

    private Tags$TagManifest() {
    }

    /* JADX INFO: renamed from: n */
    public static Tags$TagManifest m97624n() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: renamed from: o */
    public static ps61 m97625o(Tags$TagManifest tags$TagManifest) {
        return (ps61) DEFAULT_INSTANCE.createBuilder(tags$TagManifest);
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"tags_", Tags$TagDefinition.class});
        }
        if (iOrdinal == 3) {
            return new Tags$TagManifest();
        }
        if (iOrdinal == 4) {
            return new ps61(DEFAULT_INSTANCE);
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
        synchronized (Tags$TagManifest.class) {
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
