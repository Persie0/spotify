package spotify.spotbot.p212v2.promptable_playlist;

import com.google.protobuf.AbstractC0269h;
import p204p.ore0;
import p204p.pre0;
import p204p.qos0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes11.dex */
public final class Promptableplaylist$AttributeUpdate extends AbstractC0269h implements sre0 {
    private static final Promptableplaylist$AttributeUpdate DEFAULT_INSTANCE;
    public static final int IS_PRIVATE_FIELD_NUMBER = 6;
    private static volatile r2n0 PARSER = null;
    public static final int PLAYLIST_TITLE_FIELD_NUMBER = 2;
    public static final int PROMPT_FIELD_NUMBER = 1;
    public static final int PROMPT_SUMMARY_FIELD_NUMBER = 3;
    public static final int REFRESH_VALUE_FIELD_NUMBER = 4;
    public static final int STOP_PERSONALIZING_PLAYLIST_FIELD_NUMBER = 5;
    private int valueCase_ = 0;
    private Object value_;

    static {
        Promptableplaylist$AttributeUpdate promptableplaylist$AttributeUpdate = new Promptableplaylist$AttributeUpdate();
        DEFAULT_INSTANCE = promptableplaylist$AttributeUpdate;
        AbstractC0269h.registerDefaultInstance(Promptableplaylist$AttributeUpdate.class, promptableplaylist$AttributeUpdate);
    }

    private Promptableplaylist$AttributeUpdate() {
    }

    /* JADX INFO: renamed from: n */
    public static void m98009n(Promptableplaylist$AttributeUpdate promptableplaylist$AttributeUpdate, String str) {
        promptableplaylist$AttributeUpdate.getClass();
        str.getClass();
        promptableplaylist$AttributeUpdate.valueCase_ = 1;
        promptableplaylist$AttributeUpdate.value_ = str;
    }

    /* JADX INFO: renamed from: o */
    public static qos0 m98010o() {
        return (qos0) DEFAULT_INSTANCE.createBuilder();
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0001\u0000\u0001\u0006\u0006\u0000\u0000\u0000\u0001Ȼ\u0000\u0002Ȼ\u0000\u0003Ȼ\u0000\u0004<\u0000\u0005:\u0000\u0006:\u0000", new Object[]{"value_", "valueCase_", Promptableplaylist$RefreshMetadata.class});
        }
        if (iOrdinal == 3) {
            return new Promptableplaylist$AttributeUpdate();
        }
        if (iOrdinal == 4) {
            return new qos0(DEFAULT_INSTANCE);
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
        synchronized (Promptableplaylist$AttributeUpdate.class) {
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
