package com.spotify.address.endpoint.model.p012v1.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.gva;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;
import p204p.zv1;

/* JADX INFO: loaded from: classes4.dex */
public final class AddressCollection extends AbstractC0269h implements sre0 {
    public static final int ADDRESS_FORM_FIELD_NUMBER = 2;
    private static final AddressCollection DEFAULT_INSTANCE;
    public static final int ENVIRONMENT_FIELD_NUMBER = 4;
    public static final int EXTRA_FIELDS_FIELD_NUMBER = 6;
    public static final int GENERIC_ERRORS_FIELD_NUMBER = 5;
    private static volatile r2n0 PARSER = null;
    public static final int REQUEST_DETAILS_FIELD_NUMBER = 1;
    public static final int SAVED_ADDRESS_FIELD_NUMBER = 3;
    private AddressForm addressForm_;
    private int bitField0_;
    private int environment_;
    private ExtraFields extraFields_;
    private GenericErrors genericErrors_;
    private RequestDetails requestDetails_;
    private SavedAddress savedAddress_;

    static {
        AddressCollection addressCollection = new AddressCollection();
        DEFAULT_INSTANCE = addressCollection;
        AbstractC0269h.registerDefaultInstance(AddressCollection.class, addressCollection);
    }

    private AddressCollection() {
    }

    /* JADX INFO: renamed from: n */
    public static void m2339n(AddressCollection addressCollection, AddressForm addressForm) {
        addressCollection.getClass();
        addressForm.getClass();
        addressCollection.addressForm_ = addressForm;
        addressCollection.bitField0_ |= 2;
    }

    /* JADX INFO: renamed from: o */
    public static void m2340o(AddressCollection addressCollection, SavedAddress savedAddress) {
        addressCollection.getClass();
        savedAddress.getClass();
        addressCollection.savedAddress_ = savedAddress;
        addressCollection.bitField0_ |= 4;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static AddressCollection m2341q() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: renamed from: v */
    public static zv1 m2342v() {
        return (zv1) DEFAULT_INSTANCE.createBuilder();
    }

    /* JADX INFO: renamed from: w */
    public static AddressCollection m2343w(gva gvaVar) {
        return (AddressCollection) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, gvaVar);
    }

    /* JADX INFO: renamed from: x */
    public static AddressCollection m2344x(byte[] bArr) {
        return (AddressCollection) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004\f\u0005ဉ\u0003\u0006ဉ\u0004", new Object[]{"bitField0_", "requestDetails_", "addressForm_", "savedAddress_", "environment_", "genericErrors_", "extraFields_"});
        }
        if (iOrdinal == 3) {
            return new AddressCollection();
        }
        if (iOrdinal == 4) {
            return new zv1(DEFAULT_INSTANCE);
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
        synchronized (AddressCollection.class) {
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

    /* JADX INFO: renamed from: p */
    public final AddressForm m2345p() {
        AddressForm addressForm = this.addressForm_;
        return addressForm == null ? AddressForm.m2355t() : addressForm;
    }

    /* JADX INFO: renamed from: r */
    public final ExtraFields m2346r() {
        ExtraFields extraFields = this.extraFields_;
        return extraFields == null ? ExtraFields.m2361n() : extraFields;
    }

    /* JADX INFO: renamed from: s */
    public final RequestDetails m2347s() {
        RequestDetails requestDetails = this.requestDetails_;
        return requestDetails == null ? RequestDetails.m2445s() : requestDetails;
    }

    /* JADX INFO: renamed from: t */
    public final SavedAddress m2348t() {
        SavedAddress savedAddress = this.savedAddress_;
        return savedAddress == null ? SavedAddress.m2452r() : savedAddress;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }

    /* JADX INFO: renamed from: u */
    public final boolean m2349u() {
        return (this.bitField0_ & 16) != 0;
    }
}
