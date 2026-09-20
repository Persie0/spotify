package com.spotify.extendedmetadata.extensions.localconcertsimpl.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.ae50;
import p204p.lj90;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes2.dex */
public final class LocalConcerts extends AbstractC0269h implements sre0 {
    public static final int CONCERTS_FIELD_NUMBER = 1;
    private static final LocalConcerts DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER;
    private ae50 concerts_ = AbstractC0269h.emptyProtobufList();

    static {
        LocalConcerts localConcerts = new LocalConcerts();
        DEFAULT_INSTANCE = localConcerts;
        AbstractC0269h.registerDefaultInstance(LocalConcerts.class, localConcerts);
    }

    private LocalConcerts() {
    }

    /* JADX INFO: renamed from: p */
    public static LocalConcerts m10230p(byte[] bArr) {
        return (LocalConcerts) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr);
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"concerts_", Concert.class});
        }
        if (iOrdinal == 3) {
            return new LocalConcerts();
        }
        if (iOrdinal == 4) {
            return new lj90(15);
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
        synchronized (LocalConcerts.class) {
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

    /* JADX INFO: renamed from: o */
    public final ae50 m10231o() {
        return this.concerts_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
