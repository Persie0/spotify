package com.spotify.pses.p134v1.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.n550;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes2.dex */
public final class IntentLedLayout extends AbstractC0269h implements sre0 {
    public static final int AUTHENTICATION_FIELD_NUMBER = 3;
    private static final IntentLedLayout DEFAULT_INSTANCE;
    public static final int HEADER_FIELD_NUMBER = 1;
    public static final int NAME_FIELD_NUMBER = 2;
    private static volatile r2n0 PARSER = null;
    public static final int VALUE_PROPOSITION_FIELD_NUMBER = 4;
    private Authentication authentication_;
    private int bitField0_;
    private Header header_;
    private String name_ = "";
    private ValueProposition valueProposition_;

    static {
        IntentLedLayout intentLedLayout = new IntentLedLayout();
        DEFAULT_INSTANCE = intentLedLayout;
        AbstractC0269h.registerDefaultInstance(IntentLedLayout.class, intentLedLayout);
    }

    private IntentLedLayout() {
    }

    /* JADX INFO: renamed from: n */
    public static void m19979n(IntentLedLayout intentLedLayout, Authentication authentication) {
        intentLedLayout.getClass();
        authentication.getClass();
        intentLedLayout.authentication_ = authentication;
        intentLedLayout.bitField0_ |= 2;
    }

    /* JADX INFO: renamed from: o */
    public static void m19980o(IntentLedLayout intentLedLayout, ValueProposition valueProposition) {
        intentLedLayout.getClass();
        valueProposition.getClass();
        intentLedLayout.valueProposition_ = valueProposition;
        intentLedLayout.bitField0_ |= 4;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: r */
    public static IntentLedLayout m19982r() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: renamed from: u */
    public static n550 m19983u() {
        return (n550) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002Ȉ\u0003ဉ\u0001\u0004ဉ\u0002", new Object[]{"bitField0_", "header_", "name_", "authentication_", "valueProposition_"});
        }
        if (iOrdinal == 3) {
            return new IntentLedLayout();
        }
        if (iOrdinal == 4) {
            return new n550();
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
        synchronized (IntentLedLayout.class) {
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

    public final String getName() {
        return this.name_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: q */
    public final Authentication m19984q() {
        Authentication authentication = this.authentication_;
        return authentication == null ? Authentication.m19945r() : authentication;
    }

    /* JADX INFO: renamed from: s */
    public final Header m19985s() {
        Header header = this.header_;
        return header == null ? Header.m19978o() : header;
    }

    /* JADX INFO: renamed from: t */
    public final ValueProposition m19986t() {
        ValueProposition valueProposition = this.valueProposition_;
        return valueProposition == null ? ValueProposition.m19995q() : valueProposition;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
