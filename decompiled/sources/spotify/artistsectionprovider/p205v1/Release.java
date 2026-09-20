package spotify.artistsectionprovider.p205v1;

import com.google.protobuf.AbstractC0269h;
import java.util.List;
import p204p.ly5;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.ud50;
import p204p.vd50;
import p204p.vev0;
import p204p.wd50;
import p204p.z110;

/* JADX INFO: loaded from: classes11.dex */
public final class Release extends AbstractC0269h implements sre0 {
    private static final Release DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER = null;
    public static final int TAGS_FIELD_NUMBER = 2;
    public static final int URI_FIELD_NUMBER = 1;
    private static final vd50 tags_converter_ = new ly5(23);
    private int tagsMemoizedSerializedSize;
    private String uri_ = "";
    private ud50 tags_ = AbstractC0269h.emptyIntList();

    static {
        Release release = new Release();
        DEFAULT_INSTANCE = release;
        AbstractC0269h.registerDefaultInstance(Release.class, release);
    }

    private Release() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001Ȉ\u0002,", new Object[]{"uri_", "tags_"});
        }
        if (iOrdinal == 3) {
            return new Release();
        }
        if (iOrdinal == 4) {
            return new vev0(DEFAULT_INSTANCE, 25);
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
        synchronized (Release.class) {
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

    public final String getUri() {
        return this.uri_;
    }

    /* JADX INFO: renamed from: n */
    public final List m97391n() {
        return new wd50(this.tags_, tags_converter_);
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
