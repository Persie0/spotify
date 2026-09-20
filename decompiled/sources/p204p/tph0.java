package p204p;

import com.spotify.address.endpoint.model.p012v1.proto.AddressForm;
import com.spotify.address.endpoint.model.p012v1.proto.C0283d;
import com.spotify.address.endpoint.model.p012v1.proto.C0284e;
import com.spotify.address.endpoint.model.p012v1.proto.C0285f;
import com.spotify.address.endpoint.model.p012v1.proto.C0286g;
import com.spotify.address.endpoint.model.p012v1.proto.C0288i;
import com.spotify.address.endpoint.model.p012v1.proto.C0290k;
import com.spotify.address.endpoint.model.p012v1.proto.FormField;
import com.spotify.address.endpoint.model.p012v1.proto.SavedAddress;
import com.spotify.connectivity.httpretrofit.RetrofitMaker;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class tph0 {

    /* JADX INFO: renamed from: a */
    public static final tph0 f222546a = new tph0();

    /* JADX INFO: renamed from: b */
    public static final fv31 f222547b = fv31.f73628b.m78183U("address_mock_endpoint_response");

    /* JADX INFO: renamed from: c */
    public static final Object f222548c = kkc0.m56695h0(new pqm0("AL", "Alabama"), new pqm0("AK", "Alaska"), new pqm0("FL", "Florida"), new pqm0("HI", "Hawaii"), new pqm0("OH", "Ohio"), new pqm0("TX", "Texas"), new pqm0("DC", "Washington, DC"), new pqm0("error", "Network Error"), new pqm0("invalid", "Invalid"), new pqm0("suggestion", "Suggestion"));

    /* JADX INFO: renamed from: d */
    public static final SavedAddress f222549d;

    static {
        i8y0 i8y0VarM2453t = SavedAddress.m2453t();
        i8y0VarM2453t.m49961m(h6f.m46715L("1600 Pennsylvania Avenue", "Washington, DC 20500", "US"));
        i8y0VarM2453t.m49963r();
        f222549d = (SavedAddress) i8y0VarM2453t.build();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, java.util.Map] */
    /* JADX INFO: renamed from: a */
    public static final AddressForm m81262a(boolean z) {
        mw1 mw1VarM2356x = AddressForm.m2356x();
        FormField[] formFieldArr = new FormField[4];
        C0284e c0284eM2382z = FormField.m2382z();
        c0284eM2382z.m2516t("street");
        c0284eM2382z.m2517u("Street");
        if (z) {
            C0283d c0283dM2395y = FormField.Autocomplete.m2395y();
            c0283dM2395y.m2511t();
            c0283dM2395y.m2509r();
            c0283dM2395y.m2510s();
            c0283dM2395y.m2507m();
            c0284eM2382z.m2514r((FormField.Autocomplete) c0283dM2395y.build());
        } else {
            c0284eM2382z.m2518v(FormField.Text.m2415q());
        }
        C0288i c0288iM2420u = FormField.ValidationRule.m2420u();
        c0288iM2420u.m2526q(FormField.ValidationRule.Mandatory.m2425n());
        c0288iM2420u.m2525m("Enter a valid address");
        c0284eM2382z.m2512m(Collections.singletonList(c0288iM2420u.build()));
        formFieldArr[0] = c0284eM2382z.build();
        C0284e c0284eM2382z2 = FormField.m2382z();
        c0284eM2382z2.m2516t("city");
        c0284eM2382z2.m2517u("Town/City");
        c0284eM2382z2.m2518v(FormField.Text.m2415q());
        C0288i c0288iM2420u2 = FormField.ValidationRule.m2420u();
        c0288iM2420u2.m2526q(FormField.ValidationRule.Mandatory.m2425n());
        c0288iM2420u2.m2525m("Enter a valid town/city");
        c0284eM2382z2.m2512m(Collections.singletonList(c0288iM2420u2.build()));
        formFieldArr[1] = c0284eM2382z2.build();
        C0284e c0284eM2382z3 = FormField.m2382z();
        c0284eM2382z3.m2516t("state");
        c0284eM2382z3.m2517u("State");
        C0285f c0285fM2405u = FormField.Dropdown.m2405u();
        c0285fM2405u.m2521r();
        ?? r6 = f222548c;
        ArrayList arrayList = new ArrayList(r6.size());
        for (Map.Entry entry : r6.entrySet()) {
            C0286g c0286gM2411q = FormField.Dropdown.Option.m2411q();
            c0286gM2411q.m2523q((String) entry.getKey());
            c0286gM2411q.m2522m((String) entry.getValue());
            arrayList.add((FormField.Dropdown.Option) c0286gM2411q.build());
        }
        c0285fM2405u.m2519m(arrayList);
        c0284eM2382z3.m2515s(c0285fM2405u);
        C0288i c0288iM2420u3 = FormField.ValidationRule.m2420u();
        c0288iM2420u3.m2526q(FormField.ValidationRule.Mandatory.m2425n());
        c0288iM2420u3.m2525m("Select your state");
        c0284eM2382z3.m2512m(Collections.singletonList(c0288iM2420u3.build()));
        formFieldArr[2] = c0284eM2382z3.build();
        C0284e c0284eM2382z4 = FormField.m2382z();
        c0284eM2382z4.m2516t("zip");
        c0284eM2382z4.m2517u("ZIP code");
        c0284eM2382z4.m2518v(FormField.Text.m2415q());
        C0288i c0288iM2420u4 = FormField.ValidationRule.m2420u();
        c0288iM2420u4.m2526q(FormField.ValidationRule.Mandatory.m2425n());
        c0288iM2420u4.m2525m("This field is required");
        C0288i c0288iM2420u5 = FormField.ValidationRule.m2420u();
        C0290k c0290kM2428q = FormField.ValidationRule.RegEx.m2428q();
        c0290kM2428q.m2528m();
        c0288iM2420u5.m2527r(c0290kM2428q);
        c0288iM2420u5.m2525m("Enter a valid 5-digit ZIP Code");
        c0284eM2382z4.m2512m(h6f.m46715L(c0288iM2420u4.build(), c0288iM2420u5.build()));
        formFieldArr[3] = c0284eM2382z4.build();
        mw1VarM2356x.m62975m(h6f.m46715L(formFieldArr));
        mw1VarM2356x.m62978s();
        mw1VarM2356x.m62977r();
        mw1VarM2356x.m62979t();
        return (AddressForm) mw1VarM2356x.build();
    }

    /* JADX WARN: Type inference failed for: r4v3, types: [p.gh00, p.qe70] */
    /* JADX INFO: renamed from: b */
    public static lw1 m81263b(RetrofitMaker retrofitMaker, hv31 hv31Var) {
        oph0 oph0Var;
        try {
            oph0Var = (oph0) oph0.f167937d.get(hv31Var.mo48717l(f222547b, 0));
        } catch (Throwable unused) {
            oph0Var = oph0.REAL_ENDPOINT;
        }
        return (lw1) oph0Var.f167938a.invoke(retrofitMaker);
    }

    /* JADX INFO: renamed from: c */
    public static sph0 m81264c(tph0 tph0Var, gh00 gh00Var, int i) {
        z7g0 z7g0Var = z7g0.f280215a1;
        gh00 noa0Var = z7g0.f280214Z0;
        if ((i & 1) != 0) {
            gh00Var = null;
        }
        if ((i & 2) != 0) {
            z7g0Var = null;
        }
        if ((i & 4) != 0) {
            noa0Var = new noa0(1, f222546a, tph0.class, "buildSubmitFormSuccessResponse", "buildSubmitFormSuccessResponse(Lcom/spotify/address/endpoint/model/v1/proto/SubmitFormRequest;)Lcom/spotify/address/endpoint/model/v1/proto/SubmitFormResponse;", 0, 0, 14);
        }
        return new sph0(gh00Var, z7g0Var, noa0Var);
    }
}
