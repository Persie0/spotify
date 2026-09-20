package spotify.socialgraph.esperanto.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.exz;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes11.dex */
public final class FollowRequestV4 extends AbstractC0269h implements sre0 {
    private static final FollowRequestV4 DEFAULT_INSTANCE;
    public static final int FOLLOW_FIELD_NUMBER = 2;
    private static volatile r2n0 PARSER = null;
    public static final int USERNAME_FIELD_NUMBER = 1;
    private boolean follow_;
    private String username_ = "";

    static {
        FollowRequestV4 followRequestV4 = new FollowRequestV4();
        DEFAULT_INSTANCE = followRequestV4;
        AbstractC0269h.registerDefaultInstance(FollowRequestV4.class, followRequestV4);
    }

    private FollowRequestV4() {
    }

    /* JADX INFO: renamed from: n */
    public static void m97967n(FollowRequestV4 followRequestV4, boolean z) {
        followRequestV4.follow_ = z;
    }

    /* JADX INFO: renamed from: o */
    public static void m97968o(FollowRequestV4 followRequestV4, String str) {
        followRequestV4.getClass();
        str.getClass();
        followRequestV4.username_ = str;
    }

    /* JADX INFO: renamed from: p */
    public static exz m97969p() {
        return (exz) DEFAULT_INSTANCE.createBuilder();
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002\u0007", new Object[]{"username_", "follow_"});
        }
        if (iOrdinal == 3) {
            return new FollowRequestV4();
        }
        if (iOrdinal == 4) {
            return new exz(DEFAULT_INSTANCE);
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
        synchronized (FollowRequestV4.class) {
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
