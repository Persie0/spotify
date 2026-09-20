package spotify.playlist.esperanto.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.v580;
import p204p.z110;

/* JADX INFO: loaded from: classes3.dex */
public final class LensDefinition extends AbstractC0269h implements sre0 {
    public static final int ACTIVE_FIELD_NUMBER = 2;
    private static final LensDefinition DEFAULT_INSTANCE;
    public static final int IDENTIFIER_FIELD_NUMBER = 1;
    private static volatile r2n0 PARSER = null;
    public static final int REMOVE_BY_PREFIX_FIELD_NUMBER = 3;
    private boolean active_;
    private String identifier_ = "";
    private boolean removeByPrefix_;

    static {
        LensDefinition lensDefinition = new LensDefinition();
        DEFAULT_INSTANCE = lensDefinition;
        AbstractC0269h.registerDefaultInstance(LensDefinition.class, lensDefinition);
    }

    private LensDefinition() {
    }

    /* JADX INFO: renamed from: n */
    public static void m97647n(LensDefinition lensDefinition, boolean z) {
        lensDefinition.active_ = z;
    }

    /* JADX INFO: renamed from: o */
    public static void m97648o(LensDefinition lensDefinition, String str) {
        lensDefinition.getClass();
        str.getClass();
        lensDefinition.identifier_ = str;
    }

    /* JADX INFO: renamed from: p */
    public static void m97649p(LensDefinition lensDefinition, boolean z) {
        lensDefinition.removeByPrefix_ = z;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static v580 m97650q() {
        return (v580) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\u0007\u0003\u0007", new Object[]{"identifier_", "active_", "removeByPrefix_"});
        }
        if (iOrdinal == 3) {
            return new LensDefinition();
        }
        if (iOrdinal == 4) {
            return new v580(DEFAULT_INSTANCE);
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
        synchronized (LensDefinition.class) {
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
