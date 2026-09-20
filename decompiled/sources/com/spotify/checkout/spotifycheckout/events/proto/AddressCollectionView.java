package com.spotify.checkout.spotifycheckout.events.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.kw1;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes5.dex */
public final class AddressCollectionView extends AbstractC0269h implements sre0 {
    public static final int ADDRESS_COLLECTION_VIEW_ID_FIELD_NUMBER = 1;
    public static final int ADDRESS_VIEW_FIELD_NUMBER = 6;
    public static final int CHECKOUT_VIEW_ID_FIELD_NUMBER = 4;
    public static final int CONTEXT_FIELD_NUMBER = 2;
    public static final int COUNTRY_FIELD_NUMBER = 3;
    private static final AddressCollectionView DEFAULT_INSTANCE;
    public static final int EXTERNAL_ID_FIELD_NUMBER = 5;
    private static volatile r2n0 PARSER;
    private int bitField0_;
    private String addressCollectionViewId_ = "";
    private String context_ = "";
    private String country_ = "";
    private String checkoutViewId_ = "";
    private String externalId_ = "";
    private String addressView_ = "";

    static {
        AddressCollectionView addressCollectionView = new AddressCollectionView();
        DEFAULT_INSTANCE = addressCollectionView;
        AbstractC0269h.registerDefaultInstance(AddressCollectionView.class, addressCollectionView);
    }

    private AddressCollectionView() {
    }

    /* JADX INFO: renamed from: n */
    public static void m6730n(AddressCollectionView addressCollectionView, String str) {
        addressCollectionView.getClass();
        str.getClass();
        addressCollectionView.bitField0_ |= 1;
        addressCollectionView.addressCollectionViewId_ = str;
    }

    /* JADX INFO: renamed from: o */
    public static void m6731o(AddressCollectionView addressCollectionView, String str) {
        addressCollectionView.getClass();
        addressCollectionView.bitField0_ |= 32;
        addressCollectionView.addressView_ = str;
    }

    /* JADX INFO: renamed from: p */
    public static void m6732p(AddressCollectionView addressCollectionView, String str) {
        addressCollectionView.getClass();
        addressCollectionView.bitField0_ |= 2;
        addressCollectionView.context_ = str;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static void m6733q(AddressCollectionView addressCollectionView, String str) {
        addressCollectionView.getClass();
        str.getClass();
        addressCollectionView.bitField0_ |= 4;
        addressCollectionView.country_ = str;
    }

    /* JADX INFO: renamed from: r */
    public static void m6734r(AddressCollectionView addressCollectionView, String str) {
        addressCollectionView.getClass();
        str.getClass();
        addressCollectionView.bitField0_ |= 16;
        addressCollectionView.externalId_ = str;
    }

    /* JADX INFO: renamed from: s */
    public static kw1 m6735s() {
        return (kw1) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဈ\u0005", new Object[]{"bitField0_", "addressCollectionViewId_", "context_", "country_", "checkoutViewId_", "externalId_", "addressView_"});
        }
        if (iOrdinal == 3) {
            return new AddressCollectionView();
        }
        if (iOrdinal == 4) {
            return new kw1(DEFAULT_INSTANCE);
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
        synchronized (AddressCollectionView.class) {
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
