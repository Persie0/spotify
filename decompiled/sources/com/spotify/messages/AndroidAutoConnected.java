package com.spotify.messages;

import com.google.protobuf.AbstractC0269h;
import p204p.fw3;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes8.dex */
public final class AndroidAutoConnected extends AbstractC0269h implements sre0 {
    private static final AndroidAutoConnected DEFAULT_INSTANCE;
    public static final int IS_CONNECTED_FIELD_NUMBER = 1;
    private static volatile r2n0 PARSER;
    private int bitField0_;
    private boolean isConnected_;

    static {
        AndroidAutoConnected androidAutoConnected = new AndroidAutoConnected();
        DEFAULT_INSTANCE = androidAutoConnected;
        AbstractC0269h.registerDefaultInstance(AndroidAutoConnected.class, androidAutoConnected);
    }

    private AndroidAutoConnected() {
    }

    /* JADX INFO: renamed from: n */
    public static void m13564n(AndroidAutoConnected androidAutoConnected, boolean z) {
        androidAutoConnected.bitField0_ |= 1;
        androidAutoConnected.isConnected_ = z;
    }

    /* JADX INFO: renamed from: o */
    public static fw3 m13565o() {
        return (fw3) DEFAULT_INSTANCE.createBuilder();
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဇ\u0000", new Object[]{"bitField0_", "isConnected_"});
        }
        if (iOrdinal == 3) {
            return new AndroidAutoConnected();
        }
        if (iOrdinal == 4) {
            return new fw3(DEFAULT_INSTANCE);
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
        synchronized (AndroidAutoConnected.class) {
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
