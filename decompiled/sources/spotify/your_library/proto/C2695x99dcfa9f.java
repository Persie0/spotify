package spotify.your_library.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.ebe1;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: renamed from: spotify.your_library.proto.YourLibraryDecoratedEntityOuterClass$YourLibraryLocalFilesExtraInfo */
/* JADX INFO: loaded from: classes11.dex */
public final class C2695x99dcfa9f extends AbstractC0269h implements sre0 {
    private static final C2695x99dcfa9f DEFAULT_INSTANCE;
    public static final int NUMBER_OF_FILES_FIELD_NUMBER = 1;
    private static volatile r2n0 PARSER;
    private int numberOfFiles_;

    static {
        C2695x99dcfa9f c2695x99dcfa9f = new C2695x99dcfa9f();
        DEFAULT_INSTANCE = c2695x99dcfa9f;
        AbstractC0269h.registerDefaultInstance(C2695x99dcfa9f.class, c2695x99dcfa9f);
    }

    private C2695x99dcfa9f() {
    }

    /* JADX INFO: renamed from: n */
    public static C2695x99dcfa9f m98287n() {
        return DEFAULT_INSTANCE;
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0004", new Object[]{"numberOfFiles_"});
        }
        if (iOrdinal == 3) {
            return new C2695x99dcfa9f();
        }
        if (iOrdinal == 4) {
            return new ebe1(DEFAULT_INSTANCE, 20);
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
        synchronized (C2695x99dcfa9f.class) {
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

    /* JADX INFO: renamed from: o */
    public final int m98288o() {
        return this.numberOfFiles_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
