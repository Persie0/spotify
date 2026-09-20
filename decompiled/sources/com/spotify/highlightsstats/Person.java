package com.spotify.highlightsstats;

import com.google.protobuf.AbstractC0269h;
import p204p.hnn0;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes7.dex */
public final class Person extends AbstractC0269h implements sre0 {
    private static final Person DEFAULT_INSTANCE;
    public static final int IS_SELF_FIELD_NUMBER = 3;
    public static final int LEADERBOARD_NAME_FIELD_NUMBER = 5;
    public static final int NAME_FIELD_NUMBER = 2;
    private static volatile r2n0 PARSER = null;
    public static final int PROFILE_PICTURE_FIELD_NUMBER = 1;
    public static final int PROFILE_URI_FIELD_NUMBER = 4;
    private boolean isSelf_;
    private String profilePicture_ = "";
    private String name_ = "";
    private String profileUri_ = "";
    private String leaderboardName_ = "";

    static {
        Person person = new Person();
        DEFAULT_INSTANCE = person;
        AbstractC0269h.registerDefaultInstance(Person.class, person);
    }

    private Person() {
    }

    /* JADX INFO: renamed from: n */
    public static Person m11286n() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003\u0007\u0004Ȉ\u0005Ȉ", new Object[]{"profilePicture_", "name_", "isSelf_", "profileUri_", "leaderboardName_"});
        }
        if (iOrdinal == 3) {
            return new Person();
        }
        if (iOrdinal == 4) {
            return new hnn0(DEFAULT_INSTANCE, 5);
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
        synchronized (Person.class) {
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

    public final String getName() {
        return this.name_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final boolean m11287o() {
        return this.isSelf_;
    }

    /* JADX INFO: renamed from: p */
    public final String m11288p() {
        return this.leaderboardName_;
    }

    /* JADX INFO: renamed from: q */
    public final String m11289q() {
        return this.profilePicture_;
    }

    /* JADX INFO: renamed from: r */
    public final String m11290r() {
        return this.profileUri_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
