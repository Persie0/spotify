package com.spotify.metadata.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.dbd0;
import p204p.gva;
import p204p.nq6;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes8.dex */
public final class Metadata$Audio extends AbstractC0269h implements sre0 {
    private static final Metadata$Audio DEFAULT_INSTANCE;
    public static final int FORMAT_FIELD_NUMBER = 2;
    private static volatile r2n0 PARSER = null;
    public static final int UUID_FIELD_NUMBER = 1;
    private int bitField0_;
    private int format_;
    private gva uuid_ = gva.f84678b;

    static {
        Metadata$Audio metadata$Audio = new Metadata$Audio();
        DEFAULT_INSTANCE = metadata$Audio;
        AbstractC0269h.registerDefaultInstance(Metadata$Audio.class, metadata$Audio);
    }

    private Metadata$Audio() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ည\u0000\u0002᠌\u0001", new Object[]{"bitField0_", "uuid_", "format_", nq6.f157157n});
        }
        if (iOrdinal == 3) {
            return new Metadata$Audio();
        }
        if (iOrdinal == 4) {
            return new dbd0(DEFAULT_INSTANCE, 25);
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
        synchronized (Metadata$Audio.class) {
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
