package spotify.socialgraph.esperanto.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.ae50;
import p204p.byy;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes11.dex */
public final class FollowedUsersResponse extends AbstractC0269h implements sre0 {
    private static final FollowedUsersResponse DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER = null;
    public static final int STATUS_FIELD_NUMBER = 1;
    public static final int USERS_FIELD_NUMBER = 2;
    private int bitField0_;
    private ResponseStatus status_;
    private ae50 users_ = AbstractC0269h.emptyProtobufList();

    static {
        FollowedUsersResponse followedUsersResponse = new FollowedUsersResponse();
        DEFAULT_INSTANCE = followedUsersResponse;
        AbstractC0269h.registerDefaultInstance(FollowedUsersResponse.class, followedUsersResponse);
    }

    private FollowedUsersResponse() {
    }

    /* JADX INFO: renamed from: p */
    public static FollowedUsersResponse m97974p(byte[] bArr) {
        return (FollowedUsersResponse) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr);
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဉ\u0000\u0002Ț", new Object[]{"bitField0_", "status_", "users_"});
        }
        if (iOrdinal == 3) {
            return new FollowedUsersResponse();
        }
        if (iOrdinal == 4) {
            return new byy(DEFAULT_INSTANCE, 18);
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
        synchronized (FollowedUsersResponse.class) {
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
    public final ResponseStatus m97975n() {
        ResponseStatus responseStatus = this.status_;
        return responseStatus == null ? ResponseStatus.m97977n() : responseStatus;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final ae50 m97976o() {
        return this.users_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
