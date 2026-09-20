package com.spotify.profile.editprofile.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.bza1;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes10.dex */
public final class UserprofileviewV4$Bio extends AbstractC0269h implements sre0 {
    private static final UserprofileviewV4$Bio DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER = null;
    public static final int TEXT_FIELD_NUMBER = 1;
    private int bitField0_;
    private String text_ = "";

    static {
        UserprofileviewV4$Bio userprofileviewV4$Bio = new UserprofileviewV4$Bio();
        DEFAULT_INSTANCE = userprofileviewV4$Bio;
        AbstractC0269h.registerDefaultInstance(UserprofileviewV4$Bio.class, userprofileviewV4$Bio);
    }

    private UserprofileviewV4$Bio() {
    }

    /* JADX INFO: renamed from: n */
    public static void m19773n(UserprofileviewV4$Bio userprofileviewV4$Bio, String str) {
        userprofileviewV4$Bio.getClass();
        str.getClass();
        userprofileviewV4$Bio.bitField0_ |= 1;
        userprofileviewV4$Bio.text_ = str;
    }

    /* JADX INFO: renamed from: o */
    public static UserprofileviewV4$Bio m19774o() {
        return DEFAULT_INSTANCE;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: r */
    public static bza1 m19775r() {
        return (bza1) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ለ\u0000", new Object[]{"bitField0_", "text_"});
        }
        if (iOrdinal == 3) {
            return new UserprofileviewV4$Bio();
        }
        if (iOrdinal == 4) {
            return new bza1(DEFAULT_INSTANCE);
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
        synchronized (UserprofileviewV4$Bio.class) {
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

    /* JADX INFO: renamed from: p */
    public final String m19776p() {
        return this.text_;
    }

    /* JADX INFO: renamed from: q */
    public final boolean m19777q() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
