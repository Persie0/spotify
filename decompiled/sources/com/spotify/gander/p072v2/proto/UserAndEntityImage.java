package com.spotify.gander.p072v2.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.hna1;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes7.dex */
public final class UserAndEntityImage extends AbstractC0269h implements sre0 {
    private static final UserAndEntityImage DEFAULT_INSTANCE;
    public static final int ENTITY_IMAGE_FIELD_NUMBER = 2;
    private static volatile r2n0 PARSER = null;
    public static final int USER_IMAGE_FIELD_NUMBER = 1;
    private int bitField0_;
    private EntityImage entityImage_;
    private UserImage userImage_;

    static {
        UserAndEntityImage userAndEntityImage = new UserAndEntityImage();
        DEFAULT_INSTANCE = userAndEntityImage;
        AbstractC0269h.registerDefaultInstance(UserAndEntityImage.class, userAndEntityImage);
    }

    private UserAndEntityImage() {
    }

    /* JADX INFO: renamed from: n */
    public static void m11138n(UserAndEntityImage userAndEntityImage, EntityImage entityImage) {
        userAndEntityImage.getClass();
        entityImage.getClass();
        userAndEntityImage.entityImage_ = entityImage;
        userAndEntityImage.bitField0_ |= 2;
    }

    /* JADX INFO: renamed from: o */
    public static void m11139o(UserAndEntityImage userAndEntityImage, UserImage userImage) {
        userAndEntityImage.getClass();
        userImage.getClass();
        userAndEntityImage.userImage_ = userImage;
        userAndEntityImage.bitField0_ |= 1;
    }

    /* JADX INFO: renamed from: p */
    public static UserAndEntityImage m11140p() {
        return DEFAULT_INSTANCE;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: s */
    public static hna1 m11141s() {
        return (hna1) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"bitField0_", "userImage_", "entityImage_"});
        }
        if (iOrdinal == 3) {
            return new UserAndEntityImage();
        }
        if (iOrdinal == 4) {
            return new hna1(DEFAULT_INSTANCE);
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
        synchronized (UserAndEntityImage.class) {
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

    /* JADX INFO: renamed from: q */
    public final EntityImage m11142q() {
        EntityImage entityImage = this.entityImage_;
        return entityImage == null ? EntityImage.m11073p() : entityImage;
    }

    /* JADX INFO: renamed from: r */
    public final UserImage m11143r() {
        UserImage userImage = this.userImage_;
        return userImage == null ? UserImage.m11146p() : userImage;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
