package spotify.profile_esperanto.proto;

import com.google.protobuf.AbstractC0269h;
import com.spotify.identity.proto.p081v3.IdentityV3$UserProfile;
import p204p.ae50;
import p204p.ca10;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes3.dex */
public final class GetProfilesResponse extends AbstractC0269h implements sre0 {
    private static final GetProfilesResponse DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER = null;
    public static final int PROFILES_FIELD_NUMBER = 1;
    public static final int STATUS_CODE_FIELD_NUMBER = 2;
    private ae50 profiles_ = AbstractC0269h.emptyProtobufList();
    private int statusCode_;

    static {
        GetProfilesResponse getProfilesResponse = new GetProfilesResponse();
        DEFAULT_INSTANCE = getProfilesResponse;
        AbstractC0269h.registerDefaultInstance(GetProfilesResponse.class, getProfilesResponse);
    }

    private GetProfilesResponse() {
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: r */
    public static GetProfilesResponse m97823r(byte[] bArr) {
        return (GetProfilesResponse) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002\u0004", new Object[]{"profiles_", IdentityV3$UserProfile.class, "statusCode_"});
        }
        if (iOrdinal == 3) {
            return new GetProfilesResponse();
        }
        if (iOrdinal == 4) {
            return new ca10(7);
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
        synchronized (GetProfilesResponse.class) {
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

    public final int getStatusCode() {
        return this.statusCode_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final IdentityV3$UserProfile m97824o() {
        return (IdentityV3$UserProfile) this.profiles_.get(0);
    }

    /* JADX INFO: renamed from: p */
    public final int m97825p() {
        return this.profiles_.size();
    }

    /* JADX INFO: renamed from: q */
    public final ae50 m97826q() {
        return this.profiles_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
