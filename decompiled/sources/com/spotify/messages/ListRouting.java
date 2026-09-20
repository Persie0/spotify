package com.spotify.messages;

import com.google.protobuf.AbstractC0269h;
import p204p.i390;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes8.dex */
public final class ListRouting extends AbstractC0269h implements sre0 {
    public static final int DEEPLINK_SESSION_ID_FIELD_NUMBER = 5;
    private static final ListRouting DEFAULT_INSTANCE;
    public static final int EXTERNAL_FIELD_NUMBER = 1;
    public static final int INPUT_FIELD_NUMBER = 3;
    public static final int OUTPUT_FIELD_NUMBER = 4;
    private static volatile r2n0 PARSER = null;
    public static final int REASON_FIELD_NUMBER = 2;
    private int bitField0_;
    private boolean external_;
    private String reason_ = "";
    private String input_ = "";
    private String output_ = "";
    private String deeplinkSessionId_ = "";

    static {
        ListRouting listRouting = new ListRouting();
        DEFAULT_INSTANCE = listRouting;
        AbstractC0269h.registerDefaultInstance(ListRouting.class, listRouting);
    }

    private ListRouting() {
    }

    /* JADX INFO: renamed from: n */
    public static void m13916n(ListRouting listRouting, String str) {
        listRouting.getClass();
        listRouting.bitField0_ |= 16;
        listRouting.deeplinkSessionId_ = str;
    }

    /* JADX INFO: renamed from: o */
    public static void m13917o(ListRouting listRouting, boolean z) {
        listRouting.bitField0_ |= 1;
        listRouting.external_ = z;
    }

    /* JADX INFO: renamed from: p */
    public static void m13918p(ListRouting listRouting, String str) {
        listRouting.getClass();
        listRouting.bitField0_ |= 4;
        listRouting.input_ = str;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static void m13919q(ListRouting listRouting, String str) {
        listRouting.getClass();
        listRouting.bitField0_ |= 8;
        listRouting.output_ = str;
    }

    /* JADX INFO: renamed from: r */
    public static void m13920r(ListRouting listRouting, String str) {
        listRouting.getClass();
        str.getClass();
        listRouting.bitField0_ |= 2;
        listRouting.reason_ = str;
    }

    /* JADX INFO: renamed from: s */
    public static i390 m13921s() {
        return (i390) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004", new Object[]{"bitField0_", "external_", "reason_", "input_", "output_", "deeplinkSessionId_"});
        }
        if (iOrdinal == 3) {
            return new ListRouting();
        }
        if (iOrdinal == 4) {
            return new i390(DEFAULT_INSTANCE);
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
        synchronized (ListRouting.class) {
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
