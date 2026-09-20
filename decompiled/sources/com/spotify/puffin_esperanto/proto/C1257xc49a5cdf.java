package com.spotify.puffin_esperanto.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.d5t0;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: renamed from: com.spotify.puffin_esperanto.proto.PuffinProcessingCompatibilityOuterClass$PuffinProcessingCompatibility */
/* JADX INFO: loaded from: classes10.dex */
public final class C1257xc49a5cdf extends AbstractC0269h implements sre0 {
    private static final C1257xc49a5cdf DEFAULT_INSTANCE;
    public static final int IS_COMPATIBLE_FIELD_NUMBER = 1;
    private static volatile r2n0 PARSER;
    private boolean isCompatible_;

    static {
        C1257xc49a5cdf c1257xc49a5cdf = new C1257xc49a5cdf();
        DEFAULT_INSTANCE = c1257xc49a5cdf;
        AbstractC0269h.registerDefaultInstance(C1257xc49a5cdf.class, c1257xc49a5cdf);
    }

    private C1257xc49a5cdf() {
    }

    /* JADX INFO: renamed from: o */
    public static C1257xc49a5cdf m20016o(byte[] bArr) {
        return (C1257xc49a5cdf) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr);
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0007", new Object[]{"isCompatible_"});
        }
        if (iOrdinal == 3) {
            return new C1257xc49a5cdf();
        }
        if (iOrdinal == 4) {
            return new d5t0(DEFAULT_INSTANCE, 5);
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
        synchronized (C1257xc49a5cdf.class) {
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

    /* JADX INFO: renamed from: n */
    public final boolean m20017n() {
        return this.isCompatible_;
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
