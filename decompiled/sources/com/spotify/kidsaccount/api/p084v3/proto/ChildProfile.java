package com.spotify.kidsaccount.api.p084v3.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.h4e;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes7.dex */
public final class ChildProfile extends AbstractC0269h implements sre0 {
    public static final int AVATAR_FIELD_NUMBER = 3;
    public static final int DATE_OF_BIRTH_FIELD_NUMBER = 2;
    private static final ChildProfile DEFAULT_INSTANCE;
    public static final int NAME_FIELD_NUMBER = 1;
    private static volatile r2n0 PARSER;
    private int avatar_;
    private int bitField0_;
    private String name_ = "";
    private String dateOfBirth_ = "";

    static {
        ChildProfile childProfile = new ChildProfile();
        DEFAULT_INSTANCE = childProfile;
        AbstractC0269h.registerDefaultInstance(ChildProfile.class, childProfile);
    }

    private ChildProfile() {
    }

    /* JADX INFO: renamed from: n */
    public static void m12128n(ChildProfile childProfile, String str) {
        childProfile.getClass();
        str.getClass();
        childProfile.dateOfBirth_ = str;
    }

    /* JADX INFO: renamed from: o */
    public static void m12129o(ChildProfile childProfile, String str) {
        childProfile.getClass();
        str.getClass();
        childProfile.name_ = str;
    }

    /* JADX INFO: renamed from: p */
    public static h4e m12130p() {
        return (h4e) DEFAULT_INSTANCE.createBuilder();
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003ဌ\u0000", new Object[]{"bitField0_", "name_", "dateOfBirth_", "avatar_"});
        }
        if (iOrdinal == 3) {
            return new ChildProfile();
        }
        if (iOrdinal == 4) {
            return new h4e(DEFAULT_INSTANCE);
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
        synchronized (ChildProfile.class) {
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
