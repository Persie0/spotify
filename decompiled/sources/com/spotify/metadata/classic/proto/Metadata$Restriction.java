package com.spotify.metadata.classic.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.ae50;
import p204p.jb5;
import p204p.nq6;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.ud50;
import p204p.vd50;
import p204p.x5f0;
import p204p.z110;

/* JADX INFO: loaded from: classes8.dex */
public final class Metadata$Restriction extends AbstractC0269h implements sre0 {
    public static final int CATALOGUE_FIELD_NUMBER = 1;
    public static final int CATALOGUE_STR_FIELD_NUMBER = 5;
    public static final int COUNTRIES_ALLOWED_FIELD_NUMBER = 2;
    public static final int COUNTRIES_FORBIDDEN_FIELD_NUMBER = 3;
    private static final Metadata$Restriction DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER = null;
    public static final int TYPE_FIELD_NUMBER = 4;
    private static final vd50 catalogue_converter_ = new jb5(17);
    private int bitField0_;
    private Object countryRestriction_;
    private int type_;
    private int countryRestrictionCase_ = 0;
    private ud50 catalogue_ = AbstractC0269h.emptyIntList();
    private ae50 catalogueStr_ = AbstractC0269h.emptyProtobufList();

    static {
        Metadata$Restriction metadata$Restriction = new Metadata$Restriction();
        DEFAULT_INSTANCE = metadata$Restriction;
        AbstractC0269h.registerDefaultInstance(Metadata$Restriction.class, metadata$Restriction);
    }

    private Metadata$Restriction() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0005\u0001\u0001\u0001\u0005\u0005\u0000\u0002\u0000\u0001ࠞ\u0002;\u0000\u0003;\u0000\u0004᠌\u0000\u0005\u001a", new Object[]{"countryRestriction_", "countryRestrictionCase_", "bitField0_", "catalogue_", nq6.f157168y, "type_", nq6.f157140A, "catalogueStr_"});
        }
        if (iOrdinal == 3) {
            return new Metadata$Restriction();
        }
        if (iOrdinal == 4) {
            return new x5f0(DEFAULT_INSTANCE, 2);
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
        synchronized (Metadata$Restriction.class) {
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
