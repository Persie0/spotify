package spotify.identity.p207v3;

import com.google.protobuf.AbstractC0269h;
import p204p.kea1;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes11.dex */
public final class UserProfileV2OuterClass$Image extends AbstractC0269h implements sre0 {
    private static final UserProfileV2OuterClass$Image DEFAULT_INSTANCE;
    public static final int MAX_HEIGHT_FIELD_NUMBER = 2;
    public static final int MAX_WIDTH_FIELD_NUMBER = 1;
    private static volatile r2n0 PARSER = null;
    public static final int URL_FIELD_NUMBER = 3;
    private int maxHeight_;
    private int maxWidth_;
    private String url_ = "";

    static {
        UserProfileV2OuterClass$Image userProfileV2OuterClass$Image = new UserProfileV2OuterClass$Image();
        DEFAULT_INSTANCE = userProfileV2OuterClass$Image;
        AbstractC0269h.registerDefaultInstance(UserProfileV2OuterClass$Image.class, userProfileV2OuterClass$Image);
    }

    private UserProfileV2OuterClass$Image() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0004\u0002\u0004\u0003Ȉ", new Object[]{"maxWidth_", "maxHeight_", "url_"});
        }
        if (iOrdinal == 3) {
            return new UserProfileV2OuterClass$Image();
        }
        if (iOrdinal == 4) {
            return new kea1(DEFAULT_INSTANCE, 12);
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
        synchronized (UserProfileV2OuterClass$Image.class) {
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

    public final String getUrl() {
        return this.url_;
    }

    /* JADX INFO: renamed from: n */
    public final int m97611n() {
        return this.maxHeight_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final int m97612o() {
        return this.maxWidth_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
