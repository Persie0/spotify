package com.spotify.metadata.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.ae50;
import p204p.n5f0;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes8.dex */
public final class Metadata$ContentRating extends AbstractC0269h implements sre0 {
    public static final int COUNTRY_FIELD_NUMBER = 1;
    private static final Metadata$ContentRating DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER = null;
    public static final int TAG_FIELD_NUMBER = 2;
    private int bitField0_;
    private String country_ = "";
    private ae50 tag_ = AbstractC0269h.emptyProtobufList();

    static {
        Metadata$ContentRating metadata$ContentRating = new Metadata$ContentRating();
        DEFAULT_INSTANCE = metadata$ContentRating;
        AbstractC0269h.registerDefaultInstance(Metadata$ContentRating.class, metadata$ContentRating);
    }

    private Metadata$ContentRating() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001a", new Object[]{"bitField0_", "country_", "tag_"});
        }
        if (iOrdinal == 3) {
            return new Metadata$ContentRating();
        }
        if (iOrdinal == 4) {
            return new n5f0(DEFAULT_INSTANCE, 10);
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
        synchronized (Metadata$ContentRating.class) {
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
