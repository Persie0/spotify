package com.spotify.metadata.classic.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.dbd0;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes8.dex */
public final class Metadata$ActivityPeriod extends AbstractC0269h implements sre0 {
    public static final int DECADE_FIELD_NUMBER = 3;
    private static final Metadata$ActivityPeriod DEFAULT_INSTANCE;
    public static final int END_YEAR_FIELD_NUMBER = 2;
    private static volatile r2n0 PARSER = null;
    public static final int START_YEAR_FIELD_NUMBER = 1;
    private int bitField0_;
    private int decade_;
    private int endYear_;
    private int startYear_;

    static {
        Metadata$ActivityPeriod metadata$ActivityPeriod = new Metadata$ActivityPeriod();
        DEFAULT_INSTANCE = metadata$ActivityPeriod;
        AbstractC0269h.registerDefaultInstance(Metadata$ActivityPeriod.class, metadata$ActivityPeriod);
    }

    private Metadata$ActivityPeriod() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဏ\u0000\u0002ဏ\u0001\u0003ဏ\u0002", new Object[]{"bitField0_", "startYear_", "endYear_", "decade_"});
        }
        if (iOrdinal == 3) {
            return new Metadata$ActivityPeriod();
        }
        if (iOrdinal == 4) {
            return new dbd0(DEFAULT_INSTANCE, 16);
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
        synchronized (Metadata$ActivityPeriod.class) {
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
