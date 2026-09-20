package spotify.profile_esperanto.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.AbstractC1733c9;
import p204p.AbstractC2118m8;
import p204p.ae50;
import p204p.ja10;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes3.dex */
public final class GetProfilesRequest extends AbstractC0269h implements sre0 {
    private static final GetProfilesRequest DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER = null;
    public static final int USERNAMES_FIELD_NUMBER = 1;
    private ae50 usernames_ = AbstractC0269h.emptyProtobufList();

    static {
        GetProfilesRequest getProfilesRequest = new GetProfilesRequest();
        DEFAULT_INSTANCE = getProfilesRequest;
        AbstractC0269h.registerDefaultInstance(GetProfilesRequest.class, getProfilesRequest);
    }

    private GetProfilesRequest() {
    }

    /* JADX INFO: renamed from: n */
    public static void m97819n(GetProfilesRequest getProfilesRequest, Iterable iterable) {
        ae50 ae50Var = getProfilesRequest.usernames_;
        if (!((AbstractC1733c9) ae50Var).f35342a) {
            getProfilesRequest.usernames_ = AbstractC0269h.mutableCopy(ae50Var);
        }
        AbstractC2118m8.addAll(iterable, getProfilesRequest.usernames_);
    }

    /* JADX INFO: renamed from: o */
    public static void m97820o(GetProfilesRequest getProfilesRequest, String str) {
        getProfilesRequest.getClass();
        str.getClass();
        ae50 ae50Var = getProfilesRequest.usernames_;
        if (!((AbstractC1733c9) ae50Var).f35342a) {
            getProfilesRequest.usernames_ = AbstractC0269h.mutableCopy(ae50Var);
        }
        getProfilesRequest.usernames_.add(str);
    }

    /* JADX INFO: renamed from: p */
    public static ja10 m97821p() {
        return (ja10) DEFAULT_INSTANCE.createBuilder();
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001Ț", new Object[]{"usernames_"});
        }
        if (iOrdinal == 3) {
            return new GetProfilesRequest();
        }
        if (iOrdinal == 4) {
            return new ja10(DEFAULT_INSTANCE);
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
        synchronized (GetProfilesRequest.class) {
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
