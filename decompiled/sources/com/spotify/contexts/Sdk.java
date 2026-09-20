package com.spotify.contexts;

import com.google.protobuf.AbstractC0269h;
import p204p.moy0;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes.dex */
public final class Sdk extends AbstractC0269h implements sre0 {
    private static final Sdk DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER = null;
    public static final int TYPE_FIELD_NUMBER = 2;
    public static final int VERSION_NAME_FIELD_NUMBER = 1;
    private int bitField0_;
    private String versionName_ = "";
    private String type_ = "";

    static {
        Sdk sdk = new Sdk();
        DEFAULT_INSTANCE = sdk;
        AbstractC0269h.registerDefaultInstance(Sdk.class, sdk);
    }

    private Sdk() {
    }

    /* JADX INFO: renamed from: n */
    public static void m8023n(Sdk sdk) {
        sdk.getClass();
        sdk.bitField0_ |= 2;
        sdk.type_ = "java-android";
    }

    /* JADX INFO: renamed from: o */
    public static void m8024o(Sdk sdk, String str) {
        sdk.getClass();
        str.getClass();
        sdk.bitField0_ |= 1;
        sdk.versionName_ = str;
    }

    /* JADX INFO: renamed from: p */
    public static moy0 m8025p() {
        return (moy0) DEFAULT_INSTANCE.createBuilder();
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"bitField0_", "versionName_", "type_"});
        }
        if (iOrdinal == 3) {
            return new Sdk();
        }
        if (iOrdinal == 4) {
            return new moy0(DEFAULT_INSTANCE);
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
        synchronized (Sdk.class) {
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
