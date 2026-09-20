package com.spotify.address.endpoint.model.p012v1.proto;

import com.google.protobuf.AbstractC0269h;
import java.util.List;
import p204p.AbstractC1733c9;
import p204p.AbstractC2118m8;
import p204p.ae50;
import p204p.mw1;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes4.dex */
public final class AddressForm extends AbstractC0269h implements sre0 {
    public static final int CANCEL_CTA_FIELD_NUMBER = 3;
    private static final AddressForm DEFAULT_INSTANCE;
    public static final int FIELDS_FIELD_NUMBER = 1;
    private static volatile r2n0 PARSER = null;
    public static final int SAVE_CTA_FIELD_NUMBER = 2;
    public static final int WARNING_BANNER_FIELD_NUMBER = 4;
    private ae50 fields_ = AbstractC0269h.emptyProtobufList();
    private String saveCta_ = "";
    private String cancelCta_ = "";
    private String warningBanner_ = "";

    static {
        AddressForm addressForm = new AddressForm();
        DEFAULT_INSTANCE = addressForm;
        AbstractC0269h.registerDefaultInstance(AddressForm.class, addressForm);
    }

    private AddressForm() {
    }

    /* JADX INFO: renamed from: n */
    public static void m2350n(AddressForm addressForm, List list) {
        ae50 ae50Var = addressForm.fields_;
        if (!((AbstractC1733c9) ae50Var).f35342a) {
            addressForm.fields_ = AbstractC0269h.mutableCopy(ae50Var);
        }
        AbstractC2118m8.addAll(list, addressForm.fields_);
    }

    /* JADX INFO: renamed from: o */
    public static void m2351o(AddressForm addressForm) {
        addressForm.getClass();
        addressForm.fields_ = AbstractC0269h.emptyProtobufList();
    }

    /* JADX INFO: renamed from: p */
    public static void m2352p(AddressForm addressForm) {
        addressForm.getClass();
        addressForm.cancelCta_ = "Cancel";
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static void m2353q(AddressForm addressForm) {
        addressForm.getClass();
        addressForm.saveCta_ = "Save address";
    }

    /* JADX INFO: renamed from: r */
    public static void m2354r(AddressForm addressForm) {
        addressForm.getClass();
        addressForm.warningBanner_ = "Any updates to the address will also be reflected in your account. This may affect your monthly subscription charge due to tax.";
    }

    /* JADX INFO: renamed from: t */
    public static AddressForm m2355t() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: renamed from: x */
    public static mw1 m2356x() {
        return (mw1) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0001\u0000\u0001\u001b\u0002Ȉ\u0003Ȉ\u0004Ȉ", new Object[]{"fields_", FormField.class, "saveCta_", "cancelCta_", "warningBanner_"});
        }
        if (iOrdinal == 3) {
            return new AddressForm();
        }
        if (iOrdinal == 4) {
            return new mw1(DEFAULT_INSTANCE);
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
        synchronized (AddressForm.class) {
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

    /* JADX INFO: renamed from: s */
    public final String m2357s() {
        return this.cancelCta_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }

    /* JADX INFO: renamed from: u */
    public final ae50 m2358u() {
        return this.fields_;
    }

    /* JADX INFO: renamed from: v */
    public final String m2359v() {
        return this.saveCta_;
    }

    /* JADX INFO: renamed from: w */
    public final String m2360w() {
        return this.warningBanner_;
    }
}
