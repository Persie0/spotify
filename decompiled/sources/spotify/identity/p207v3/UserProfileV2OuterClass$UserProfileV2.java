package spotify.identity.p207v3;

import com.google.protobuf.AbstractC0269h;
import com.google.protobuf.Int32Value;
import com.google.protobuf.StringValue;
import p204p.ae50;
import p204p.kea1;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes11.dex */
public final class UserProfileV2OuterClass$UserProfileV2 extends AbstractC0269h implements sre0 {
    public static final int ACCOUNT_ID_FIELD_NUMBER = 24;
    public static final int COLOR_FIELD_NUMBER = 11;
    private static final UserProfileV2OuterClass$UserProfileV2 DEFAULT_INSTANCE;
    public static final int IMAGES_FIELD_NUMBER = 3;
    public static final int NAME_FIELD_NUMBER = 2;
    private static volatile r2n0 PARSER = null;
    public static final int SOCIAL_HANDLE_FIELD_NUMBER = 22;
    public static final int USERNAME_FIELD_NUMBER = 1;
    private StringValue accountId_;
    private int bitField0_;
    private Int32Value color_;
    private ae50 images_ = AbstractC0269h.emptyProtobufList();
    private StringValue name_;
    private StringValue socialHandle_;
    private StringValue username_;

    static {
        UserProfileV2OuterClass$UserProfileV2 userProfileV2OuterClass$UserProfileV2 = new UserProfileV2OuterClass$UserProfileV2();
        DEFAULT_INSTANCE = userProfileV2OuterClass$UserProfileV2;
        AbstractC0269h.registerDefaultInstance(UserProfileV2OuterClass$UserProfileV2.class, userProfileV2OuterClass$UserProfileV2);
    }

    private UserProfileV2OuterClass$UserProfileV2() {
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: t */
    public static UserProfileV2OuterClass$UserProfileV2 m97613t(byte[] bArr) {
        return (UserProfileV2OuterClass$UserProfileV2) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0001\u0001\u0018\u0006\u0000\u0001\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003\u001b\u000bဉ\u0002\u0016ဉ\u0003\u0018ဉ\u0004", new Object[]{"bitField0_", "username_", "name_", "images_", UserProfileV2OuterClass$Image.class, "color_", "socialHandle_", "accountId_"});
        }
        if (iOrdinal == 3) {
            return new UserProfileV2OuterClass$UserProfileV2();
        }
        if (iOrdinal == 4) {
            return new kea1(DEFAULT_INSTANCE, 13);
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
        synchronized (UserProfileV2OuterClass$UserProfileV2.class) {
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

    public final Int32Value getColor() {
        Int32Value int32Value = this.color_;
        return int32Value == null ? Int32Value.m1943p() : int32Value;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.sre0
    public final /* bridge */ /* synthetic */ pre0 getDefaultInstanceForType() {
        return getDefaultInstanceForType();
    }

    public final boolean hasColor() {
        return (this.bitField0_ & 4) != 0;
    }

    /* JADX INFO: renamed from: n */
    public final StringValue m97614n() {
        StringValue stringValue = this.accountId_;
        return stringValue == null ? StringValue.m1959p() : stringValue;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final ae50 m97615o() {
        return this.images_;
    }

    /* JADX INFO: renamed from: p */
    public final StringValue m97616p() {
        StringValue stringValue = this.name_;
        return stringValue == null ? StringValue.m1959p() : stringValue;
    }

    /* JADX INFO: renamed from: q */
    public final StringValue m97617q() {
        StringValue stringValue = this.socialHandle_;
        return stringValue == null ? StringValue.m1959p() : stringValue;
    }

    /* JADX INFO: renamed from: r */
    public final StringValue m97618r() {
        StringValue stringValue = this.username_;
        return stringValue == null ? StringValue.m1959p() : stringValue;
    }

    /* JADX INFO: renamed from: s */
    public final boolean m97619s() {
        return (this.bitField0_ & 8) != 0;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
