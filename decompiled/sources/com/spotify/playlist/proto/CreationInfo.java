package com.spotify.playlist.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.fdl;
import p204p.gdl;
import p204p.nq6;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes9.dex */
public final class CreationInfo extends AbstractC0269h implements sre0 {
    private static final CreationInfo DEFAULT_INSTANCE;
    public static final int ORIGIN_TYPE_FIELD_NUMBER = 1;
    public static final int ORIGIN_URI_FIELD_NUMBER = 2;
    private static volatile r2n0 PARSER;
    private int bitField0_;
    private int originType_;
    private String originUri_ = "";

    static {
        CreationInfo creationInfo = new CreationInfo();
        DEFAULT_INSTANCE = creationInfo;
        AbstractC0269h.registerDefaultInstance(CreationInfo.class, creationInfo);
    }

    private CreationInfo() {
    }

    /* JADX INFO: renamed from: n */
    public static void m18472n(CreationInfo creationInfo, gdl gdlVar) {
        creationInfo.getClass();
        creationInfo.originType_ = gdlVar.f78894a;
        creationInfo.bitField0_ |= 1;
    }

    /* JADX INFO: renamed from: o */
    public static void m18473o(CreationInfo creationInfo, String str) {
        creationInfo.getClass();
        str.getClass();
        creationInfo.bitField0_ |= 2;
        creationInfo.originUri_ = str;
    }

    /* JADX INFO: renamed from: p */
    public static fdl m18474p() {
        return (fdl) DEFAULT_INSTANCE.createBuilder();
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002ဈ\u0001", new Object[]{"bitField0_", "originType_", nq6.f157147d, "originUri_"});
        }
        if (iOrdinal == 3) {
            return new CreationInfo();
        }
        if (iOrdinal == 4) {
            return new fdl(DEFAULT_INSTANCE);
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
        synchronized (CreationInfo.class) {
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
