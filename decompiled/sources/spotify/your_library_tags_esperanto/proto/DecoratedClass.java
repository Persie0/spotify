package spotify.your_library_tags_esperanto.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.ae50;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.wzl;
import p204p.z110;

/* JADX INFO: loaded from: classes11.dex */
public final class DecoratedClass extends AbstractC0269h implements sre0 {
    public static final int CLASS_NAME_FIELD_NUMBER = 2;
    public static final int CLASS_URI_FIELD_NUMBER = 1;
    private static final DecoratedClass DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER = null;
    public static final int TAG_FIELD_NUMBER = 3;
    private String classUri_ = "";
    private String className_ = "";
    private ae50 tag_ = AbstractC0269h.emptyProtobufList();

    static {
        DecoratedClass decoratedClass = new DecoratedClass();
        DEFAULT_INSTANCE = decoratedClass;
        AbstractC0269h.registerDefaultInstance(DecoratedClass.class, decoratedClass);
    }

    private DecoratedClass() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0001\u0000\u0001Ȉ\u0002Ȉ\u0003\u001b", new Object[]{"classUri_", "className_", "tag_", DecoratedTag.class});
        }
        if (iOrdinal == 3) {
            return new DecoratedClass();
        }
        if (iOrdinal == 4) {
            return new wzl(DEFAULT_INSTANCE, 23);
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
        synchronized (DecoratedClass.class) {
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

    /* JADX INFO: renamed from: n */
    public final String m98316n() {
        return this.className_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final ae50 m98317o() {
        return this.tag_;
    }

    /* JADX INFO: renamed from: p */
    public final ae50 m98318p() {
        return this.tag_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
