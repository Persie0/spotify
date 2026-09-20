package com.spotify.pam.p118v2;

import com.google.protobuf.AbstractC0269h;
import p204p.ae50;
import p204p.aw2;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: renamed from: com.spotify.pam.v2.Ao */
/* JADX INFO: loaded from: classes9.dex */
public final class C1098Ao extends AbstractC0269h implements sre0 {
    public static final int ACTION_URI_FIELD_NUMBER = 9;
    public static final int AO_DETAILS_URI_FIELD_NUMBER = 5;
    public static final int AO_NAME_FIELD_NUMBER = 2;
    public static final int AO_PRICE_FIELD_NUMBER = 3;
    public static final int AO_TYPE_FIELD_NUMBER = 1;
    public static final int BENEFITS_FIELD_NUMBER = 4;
    public static final int COLOR_FIELD_NUMBER = 6;
    private static final C1098Ao DEFAULT_INSTANCE;
    public static final int DISCLAIMER_FIELD_NUMBER = 8;
    public static final int IS_ACTIVE_FIELD_NUMBER = 7;
    private static volatile r2n0 PARSER;
    private int aoType_;
    private int bitField0_;
    private boolean isActive_;
    private String aoName_ = "";
    private String aoPrice_ = "";
    private ae50 benefits_ = AbstractC0269h.emptyProtobufList();
    private String aoDetailsUri_ = "";
    private String color_ = "";
    private String disclaimer_ = "";
    private String actionUri_ = "";

    static {
        C1098Ao c1098Ao = new C1098Ao();
        DEFAULT_INSTANCE = c1098Ao;
        AbstractC0269h.registerDefaultInstance(C1098Ao.class, c1098Ao);
    }

    private C1098Ao() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\t\u0000\u0001\u0001\t\t\u0000\u0001\u0000\u0001\f\u0002Ȉ\u0003Ȉ\u0004Ț\u0005Ȉ\u0006Ȉ\u0007\u0007\bለ\u0000\tȈ", new Object[]{"bitField0_", "aoType_", "aoName_", "aoPrice_", "benefits_", "aoDetailsUri_", "color_", "isActive_", "disclaimer_", "actionUri_"});
        }
        if (iOrdinal == 3) {
            return new C1098Ao();
        }
        if (iOrdinal == 4) {
            return new aw2(DEFAULT_INSTANCE, 15);
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
        synchronized (C1098Ao.class) {
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
