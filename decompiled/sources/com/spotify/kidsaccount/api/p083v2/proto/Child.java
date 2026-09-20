package com.spotify.kidsaccount.api.p083v2.proto;

import com.google.protobuf.AbstractC0269h;
import com.google.protobuf.StringValue;
import p204p.ioc;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes7.dex */
public final class Child extends AbstractC0269h implements sre0 {
    public static final int CHILD_ID_FIELD_NUMBER = 1;
    private static final Child DEFAULT_INSTANCE;
    public static final int IMAGE_URI_FIELD_NUMBER = 3;
    private static volatile r2n0 PARSER = null;
    public static final int PROFILE_FIELD_NUMBER = 2;
    private int bitField0_;
    private String childId_ = "";
    private StringValue imageUri_;
    private Profile profile_;

    static {
        Child child = new Child();
        DEFAULT_INSTANCE = child;
        AbstractC0269h.registerDefaultInstance(Child.class, child);
    }

    private Child() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002ဉ\u0000\u0003ဉ\u0001", new Object[]{"bitField0_", "childId_", "profile_", "imageUri_"});
        }
        if (iOrdinal == 3) {
            return new Child();
        }
        if (iOrdinal == 4) {
            return new ioc(DEFAULT_INSTANCE, 17);
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
        synchronized (Child.class) {
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

    public final String getChildId() {
        return this.childId_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.sre0
    public final /* bridge */ /* synthetic */ pre0 getDefaultInstanceForType() {
        return getDefaultInstanceForType();
    }

    public final StringValue getImageUri() {
        StringValue stringValue = this.imageUri_;
        return stringValue == null ? StringValue.m1959p() : stringValue;
    }

    /* JADX INFO: renamed from: n */
    public final Profile m12072n() {
        Profile profile = this.profile_;
        return profile == null ? Profile.m12097n() : profile;
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
