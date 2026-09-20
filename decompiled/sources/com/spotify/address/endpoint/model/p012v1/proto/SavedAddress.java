package com.spotify.address.endpoint.model.p012v1.proto;

import com.google.protobuf.AbstractC0269h;
import java.util.List;
import p204p.AbstractC1733c9;
import p204p.AbstractC2118m8;
import p204p.ae50;
import p204p.i8y0;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes4.dex */
public final class SavedAddress extends AbstractC0269h implements sre0 {
    public static final int ADDRESS_LINE_FIELD_NUMBER = 1;
    private static final SavedAddress DEFAULT_INSTANCE;
    public static final int EDIT_CTA_FIELD_NUMBER = 2;
    private static volatile r2n0 PARSER;
    private ae50 addressLine_ = AbstractC0269h.emptyProtobufList();
    private String editCta_ = "";

    static {
        SavedAddress savedAddress = new SavedAddress();
        DEFAULT_INSTANCE = savedAddress;
        AbstractC0269h.registerDefaultInstance(SavedAddress.class, savedAddress);
    }

    private SavedAddress() {
    }

    /* JADX INFO: renamed from: n */
    public static void m2449n(SavedAddress savedAddress, List list) {
        ae50 ae50Var = savedAddress.addressLine_;
        if (!((AbstractC1733c9) ae50Var).f35342a) {
            savedAddress.addressLine_ = AbstractC0269h.mutableCopy(ae50Var);
        }
        AbstractC2118m8.addAll(list, savedAddress.addressLine_);
    }

    /* JADX INFO: renamed from: o */
    public static void m2450o(SavedAddress savedAddress) {
        savedAddress.getClass();
        savedAddress.addressLine_ = AbstractC0269h.emptyProtobufList();
    }

    /* JADX INFO: renamed from: p */
    public static void m2451p(SavedAddress savedAddress) {
        savedAddress.getClass();
        savedAddress.editCta_ = "Edit";
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: r */
    public static SavedAddress m2452r() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: renamed from: t */
    public static i8y0 m2453t() {
        return (i8y0) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001Ț\u0002Ȉ", new Object[]{"addressLine_", "editCta_"});
        }
        if (iOrdinal == 3) {
            return new SavedAddress();
        }
        if (iOrdinal == 4) {
            return new i8y0(DEFAULT_INSTANCE);
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
        synchronized (SavedAddress.class) {
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

    /* JADX INFO: renamed from: q */
    public final ae50 m2454q() {
        return this.addressLine_;
    }

    /* JADX INFO: renamed from: s */
    public final String m2455s() {
        return this.editCta_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
