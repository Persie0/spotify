package com.spotify.creativework.p054v1;

import com.google.protobuf.AbstractC0269h;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.s0w0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes6.dex */
public final class Release extends AbstractC0269h implements sre0 {
    private static final Release DEFAULT_INSTANCE;
    public static final int PARENT_FIELD_NUMBER = 5;
    private static volatile r2n0 PARSER = null;
    public static final int TRAITS_FIELD_NUMBER = 2;
    public static final int URI_FIELD_NUMBER = 1;
    private int bitField0_;
    private ParentInfo parent_;
    private ReleaseTraits traits_;
    private String uri_ = "";

    static {
        Release release = new Release();
        DEFAULT_INSTANCE = release;
        AbstractC0269h.registerDefaultInstance(Release.class, release);
    }

    private Release() {
    }

    /* JADX INFO: renamed from: n */
    public static void m9045n(Release release, ParentInfo parentInfo) {
        release.getClass();
        parentInfo.getClass();
        release.parent_ = parentInfo;
        release.bitField0_ |= 2;
    }

    /* JADX INFO: renamed from: o */
    public static void m9046o(Release release, String str) {
        release.getClass();
        str.getClass();
        release.uri_ = str;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static s0w0 m9047q() {
        return (s0w0) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0005\u0003\u0000\u0000\u0000\u0001Ȉ\u0002ဉ\u0000\u0005ဉ\u0001", new Object[]{"bitField0_", "uri_", "traits_", "parent_"});
        }
        if (iOrdinal == 3) {
            return new Release();
        }
        if (iOrdinal == 4) {
            return new s0w0(DEFAULT_INSTANCE);
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
        synchronized (Release.class) {
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

    public final String getUri() {
        return this.uri_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: p */
    public final ParentInfo m9048p() {
        ParentInfo parentInfo = this.parent_;
        return parentInfo == null ? ParentInfo.m9043o() : parentInfo;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
