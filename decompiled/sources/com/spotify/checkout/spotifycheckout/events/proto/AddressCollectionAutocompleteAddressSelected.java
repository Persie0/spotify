package com.spotify.checkout.spotifycheckout.events.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.aw1;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes5.dex */
public final class AddressCollectionAutocompleteAddressSelected extends AbstractC0269h implements sre0 {
    public static final int ADDRESS_COLLECTION_VIEW_ID_FIELD_NUMBER = 1;
    private static final AddressCollectionAutocompleteAddressSelected DEFAULT_INSTANCE;
    public static final int IS_FORM_POPULATED_FIELD_NUMBER = 2;
    private static volatile r2n0 PARSER;
    private String addressCollectionViewId_ = "";
    private int bitField0_;
    private boolean isFormPopulated_;

    static {
        AddressCollectionAutocompleteAddressSelected addressCollectionAutocompleteAddressSelected = new AddressCollectionAutocompleteAddressSelected();
        DEFAULT_INSTANCE = addressCollectionAutocompleteAddressSelected;
        AbstractC0269h.registerDefaultInstance(AddressCollectionAutocompleteAddressSelected.class, addressCollectionAutocompleteAddressSelected);
    }

    private AddressCollectionAutocompleteAddressSelected() {
    }

    /* JADX INFO: renamed from: n */
    public static void m6705n(AddressCollectionAutocompleteAddressSelected addressCollectionAutocompleteAddressSelected, String str) {
        addressCollectionAutocompleteAddressSelected.getClass();
        str.getClass();
        addressCollectionAutocompleteAddressSelected.bitField0_ |= 1;
        addressCollectionAutocompleteAddressSelected.addressCollectionViewId_ = str;
    }

    /* JADX INFO: renamed from: o */
    public static void m6706o(AddressCollectionAutocompleteAddressSelected addressCollectionAutocompleteAddressSelected, boolean z) {
        addressCollectionAutocompleteAddressSelected.bitField0_ |= 2;
        addressCollectionAutocompleteAddressSelected.isFormPopulated_ = z;
    }

    /* JADX INFO: renamed from: p */
    public static aw1 m6707p() {
        return (aw1) DEFAULT_INSTANCE.createBuilder();
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဇ\u0001", new Object[]{"bitField0_", "addressCollectionViewId_", "isFormPopulated_"});
        }
        if (iOrdinal == 3) {
            return new AddressCollectionAutocompleteAddressSelected();
        }
        if (iOrdinal == 4) {
            return new aw1(DEFAULT_INSTANCE);
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
        synchronized (AddressCollectionAutocompleteAddressSelected.class) {
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
