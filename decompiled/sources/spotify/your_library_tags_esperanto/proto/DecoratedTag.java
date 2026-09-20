package spotify.your_library_tags_esperanto.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sro;
import p204p.tro;
import p204p.z110;

/* JADX INFO: loaded from: classes11.dex */
public final class DecoratedTag extends AbstractC0269h implements tro {
    private static final DecoratedTag DEFAULT_INSTANCE;
    public static final int ENTITY_COUNT_FIELD_NUMBER = 4;
    private static volatile r2n0 PARSER = null;
    public static final int TAG_NAME_FIELD_NUMBER = 3;
    public static final int TAG_URI_FIELD_NUMBER = 1;
    private int entityCount_;
    private String tagUri_ = "";
    private String tagName_ = "";

    static {
        DecoratedTag decoratedTag = new DecoratedTag();
        DEFAULT_INSTANCE = decoratedTag;
        AbstractC0269h.registerDefaultInstance(DecoratedTag.class, decoratedTag);
    }

    private DecoratedTag() {
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    @Override // p204p.tro
    /* JADX INFO: renamed from: b */
    public final int mo79122b() {
        return this.entityCount_;
    }

    @Override // p204p.tro
    /* JADX INFO: renamed from: c */
    public final String mo79123c() {
        return this.tagUri_;
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0004\u0003\u0000\u0000\u0000\u0001Ȉ\u0003Ȉ\u0004\u0004", new Object[]{"tagUri_", "tagName_", "entityCount_"});
        }
        if (iOrdinal == 3) {
            return new DecoratedTag();
        }
        if (iOrdinal == 4) {
            return new sro(DEFAULT_INSTANCE);
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
        synchronized (DecoratedTag.class) {
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

    @Override // p204p.tro
    public final String getTagName() {
        return this.tagName_;
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
