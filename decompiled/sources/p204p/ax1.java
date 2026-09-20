package p204p;

import com.spotify.address.endpoint.model.p012v1.proto.AddressForm;
import com.spotify.address.endpoint.model.p012v1.proto.C0283d;
import com.spotify.address.endpoint.model.p012v1.proto.C0284e;
import com.spotify.address.endpoint.model.p012v1.proto.C0285f;
import com.spotify.address.endpoint.model.p012v1.proto.C0287h;
import com.spotify.address.endpoint.model.p012v1.proto.FormField;
import java.util.ArrayList;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes4.dex */
public abstract class ax1 {
    /* JADX INFO: renamed from: a */
    public static AddressForm m27355a(AddressForm addressForm, Map map) {
        mw1 mw1Var = (mw1) addressForm.toBuilder();
        mw1Var.m62976q();
        ae50<FormField> ae50VarM2358u = addressForm.m2358u();
        ArrayList arrayList = new ArrayList();
        for (FormField formField : ae50VarM2358u) {
            String str = (String) map.get(formField.getId());
            if (str != null) {
                int iM2385v = formField.m2385v();
                int i = iM2385v == 0 ? -1 : zw1.f286875a[edb.m38547C(iM2385v)];
                if (i == -1) {
                    formField = null;
                } else if (i == 1) {
                    C0284e c0284e = (C0284e) formField.toBuilder();
                    C0287h c0287h = (C0287h) formField.m2387x().toBuilder();
                    c0287h.m2524m(str);
                    c0284e.m2518v(c0287h);
                    formField = (FormField) c0284e.build();
                } else if (i == 2) {
                    C0284e c0284e2 = (C0284e) formField.toBuilder();
                    C0285f c0285f = (C0285f) formField.m2384u().toBuilder();
                    c0285f.m2520q(str);
                    c0284e2.m2515s(c0285f);
                    formField = (FormField) c0284e2.build();
                } else if (i != 3) {
                    if (i != 4) {
                        throw new NoWhenBranchMatchedException();
                    }
                    formField = null;
                } else {
                    C0284e c0284e3 = (C0284e) formField.toBuilder();
                    C0283d c0283d = (C0283d) formField.m2383t().toBuilder();
                    c0283d.m2508q(str);
                    c0284e3.m2513q(c0283d);
                    formField = (FormField) c0284e3.build();
                }
            }
            if (formField != null) {
                arrayList.add(formField);
            }
        }
        mw1Var.m62975m(arrayList);
        return (AddressForm) mw1Var.build();
    }
}
