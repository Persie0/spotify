package com.spotify.checkout.spotifycheckout.events.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.jw1;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes5.dex */
public final class AddressCollectionSuccess extends AbstractC0269h implements sre0 {
    public static final int ADDRESS_COLLECTION_VIEW_ID_FIELD_NUMBER = 1;
    private static final AddressCollectionSuccess DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER = null;
    public static final int USING_AUTOCOMPLETE_FIELD_NUMBER = 2;
    private String addressCollectionViewId_ = "";
    private int bitField0_;
    private boolean usingAutocomplete_;

    static {
        AddressCollectionSuccess addressCollectionSuccess = new AddressCollectionSuccess();
        DEFAULT_INSTANCE = addressCollectionSuccess;
        AbstractC0269h.registerDefaultInstance(AddressCollectionSuccess.class, addressCollectionSuccess);
    }

    private AddressCollectionSuccess() {
    }

    /* JADX INFO: renamed from: n */
    public static void m6727n(AddressCollectionSuccess addressCollectionSuccess, String str) {
        addressCollectionSuccess.getClass();
        str.getClass();
        addressCollectionSuccess.bitField0_ |= 1;
        addressCollectionSuccess.addressCollectionViewId_ = str;
    }

    /* JADX INFO: renamed from: o */
    public static void m6728o(AddressCollectionSuccess addressCollectionSuccess, boolean z) {
        addressCollectionSuccess.bitField0_ |= 2;
        addressCollectionSuccess.usingAutocomplete_ = z;
    }

    /* JADX INFO: renamed from: p */
    public static jw1 m6729p() {
        return (jw1) DEFAULT_INSTANCE.createBuilder();
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဇ\u0001", new Object[]{"bitField0_", "addressCollectionViewId_", "usingAutocomplete_"});
        }
        if (iOrdinal == 3) {
            return new AddressCollectionSuccess();
        }
        if (iOrdinal == 4) {
            return new jw1(DEFAULT_INSTANCE);
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
        synchronized (AddressCollectionSuccess.class) {
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
