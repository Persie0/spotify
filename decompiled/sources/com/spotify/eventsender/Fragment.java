package com.spotify.eventsender;

import com.google.protobuf.AbstractC0269h;
import p204p.f500;
import p204p.gva;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes.dex */
public final class Fragment extends AbstractC0269h implements sre0 {
    public static final int DATA_FIELD_NUMBER = 2;
    private static final Fragment DEFAULT_INSTANCE;
    public static final int NAME_FIELD_NUMBER = 1;
    private static volatile r2n0 PARSER;
    private int bitField0_;
    private String name_ = "";
    private gva data_ = gva.f84678b;

    static {
        Fragment fragment = new Fragment();
        DEFAULT_INSTANCE = fragment;
        AbstractC0269h.registerDefaultInstance(Fragment.class, fragment);
    }

    private Fragment() {
    }

    /* JADX INFO: renamed from: n */
    public static void m9758n(Fragment fragment, gva gvaVar) {
        fragment.getClass();
        gvaVar.getClass();
        fragment.bitField0_ |= 2;
        fragment.data_ = gvaVar;
    }

    /* JADX INFO: renamed from: o */
    public static void m9759o(Fragment fragment, String str) {
        fragment.getClass();
        str.getClass();
        fragment.bitField0_ |= 1;
        fragment.name_ = str;
    }

    /* JADX INFO: renamed from: p */
    public static f500 m9760p() {
        return (f500) DEFAULT_INSTANCE.createBuilder();
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ည\u0001", new Object[]{"bitField0_", "name_", "data_"});
        }
        if (iOrdinal == 3) {
            return new Fragment();
        }
        if (iOrdinal == 4) {
            return new f500(DEFAULT_INSTANCE);
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
        synchronized (Fragment.class) {
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

    public final gva getData() {
        return this.data_;
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

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
