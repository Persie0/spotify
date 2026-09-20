package com.spotify.checkout.spotifycheckout.events.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.dw1;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes5.dex */
public final class AddressCollectionEdit extends AbstractC0269h implements sre0 {
    public static final int ADDRESS_COLLECTION_VIEW_ID_FIELD_NUMBER = 1;
    private static final AddressCollectionEdit DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER;
    private String addressCollectionViewId_ = "";
    private int bitField0_;

    static {
        AddressCollectionEdit addressCollectionEdit = new AddressCollectionEdit();
        DEFAULT_INSTANCE = addressCollectionEdit;
        AbstractC0269h.registerDefaultInstance(AddressCollectionEdit.class, addressCollectionEdit);
    }

    private AddressCollectionEdit() {
    }

    /* JADX INFO: renamed from: n */
    public static void m6712n(AddressCollectionEdit addressCollectionEdit, String str) {
        addressCollectionEdit.getClass();
        str.getClass();
        addressCollectionEdit.bitField0_ |= 1;
        addressCollectionEdit.addressCollectionViewId_ = str;
    }

    /* JADX INFO: renamed from: o */
    public static dw1 m6713o() {
        return (dw1) DEFAULT_INSTANCE.createBuilder();
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"bitField0_", "addressCollectionViewId_"});
        }
        if (iOrdinal == 3) {
            return new AddressCollectionEdit();
        }
        if (iOrdinal == 4) {
            return new dw1(DEFAULT_INSTANCE);
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
        synchronized (AddressCollectionEdit.class) {
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
