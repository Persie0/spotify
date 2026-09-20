package spotify.your_library.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.ebe1;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.xoe1;
import p204p.z110;

/* JADX INFO: renamed from: spotify.your_library.proto.YourLibraryDecoratedEntityOuterClass$YourLibraryPreReleaseExtraInfo */
/* JADX INFO: loaded from: classes11.dex */
public final class C2699x53bf4b87 extends AbstractC0269h implements sre0 {
    public static final int ALBUM_TYPE_FIELD_NUMBER = 4;
    public static final int ARTIST_NAME_FIELD_NUMBER = 1;
    public static final int ARTIST_URI_FIELD_NUMBER = 2;
    private static final C2699x53bf4b87 DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER = null;
    public static final int TYPE_FIELD_NUMBER = 3;
    private int albumType_;
    private String artistName_ = "";
    private String artistUri_ = "";
    private int type_;

    static {
        C2699x53bf4b87 c2699x53bf4b87 = new C2699x53bf4b87();
        DEFAULT_INSTANCE = c2699x53bf4b87;
        AbstractC0269h.registerDefaultInstance(C2699x53bf4b87.class, c2699x53bf4b87);
    }

    private C2699x53bf4b87() {
    }

    /* JADX INFO: renamed from: o */
    public static C2699x53bf4b87 m98307o() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003\f\u0004\f", new Object[]{"artistName_", "artistUri_", "type_", "albumType_"});
        }
        if (iOrdinal == 3) {
            return new C2699x53bf4b87();
        }
        if (iOrdinal == 4) {
            return new ebe1(DEFAULT_INSTANCE, 24);
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
        synchronized (C2699x53bf4b87.class) {
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
    public final String m98308n() {
        return this.artistName_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: p */
    public final xoe1 m98309p() {
        xoe1 xoe1Var;
        int i = this.type_;
        if (i != 0) {
            xoe1Var = i != 1 ? null : xoe1.BOOK;
        } else {
            xoe1Var = xoe1.ALBUM;
        }
        return xoe1Var == null ? xoe1.UNRECOGNIZED : xoe1Var;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
