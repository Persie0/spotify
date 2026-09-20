package com.spotify.checkout.spotifycheckout.events.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.ew1;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes5.dex */
public final class AddressCollectionError extends AbstractC0269h implements sre0 {
    public static final int ADDRESS_COLLECTION_VIEW_ID_FIELD_NUMBER = 1;
    private static final AddressCollectionError DEFAULT_INSTANCE;
    public static final int ERROR_ID_FIELD_NUMBER = 4;
    public static final int ERROR_INPUT_FIELD_FIELD_NUMBER = 2;
    public static final int ERROR_KEY_FIELD_NUMBER = 3;
    private static volatile r2n0 PARSER;
    private int bitField0_;
    private String addressCollectionViewId_ = "";
    private String errorInputField_ = "";
    private String errorKey_ = "";
    private String errorId_ = "";

    static {
        AddressCollectionError addressCollectionError = new AddressCollectionError();
        DEFAULT_INSTANCE = addressCollectionError;
        AbstractC0269h.registerDefaultInstance(AddressCollectionError.class, addressCollectionError);
    }

    private AddressCollectionError() {
    }

    /* JADX INFO: renamed from: n */
    public static void m6714n(AddressCollectionError addressCollectionError, String str) {
        addressCollectionError.getClass();
        str.getClass();
        addressCollectionError.bitField0_ |= 1;
        addressCollectionError.addressCollectionViewId_ = str;
    }

    /* JADX INFO: renamed from: o */
    public static void m6715o(AddressCollectionError addressCollectionError, String str) {
        addressCollectionError.getClass();
        str.getClass();
        addressCollectionError.bitField0_ |= 8;
        addressCollectionError.errorId_ = str;
    }

    /* JADX INFO: renamed from: p */
    public static void m6716p(AddressCollectionError addressCollectionError, String str) {
        addressCollectionError.getClass();
        str.getClass();
        addressCollectionError.bitField0_ |= 2;
        addressCollectionError.errorInputField_ = str;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static ew1 m6717q() {
        return (ew1) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003", new Object[]{"bitField0_", "addressCollectionViewId_", "errorInputField_", "errorKey_", "errorId_"});
        }
        if (iOrdinal == 3) {
            return new AddressCollectionError();
        }
        if (iOrdinal == 4) {
            return new ew1(DEFAULT_INSTANCE);
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
        synchronized (AddressCollectionError.class) {
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
