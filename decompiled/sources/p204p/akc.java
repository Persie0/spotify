package p204p;

import com.spotify.checkout.proto.model.p044v1.proto.ChangeCountry;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes5.dex */
public abstract class akc {
    /* JADX INFO: renamed from: a */
    public static yjc m26210a(ChangeCountry changeCountry) {
        mwk mwkVar;
        ae50<ChangeCountry.PickerForm.CountryType> ae50VarM5954r = changeCountry.m5946q().m5954r();
        ArrayList arrayList = new ArrayList();
        String strM5968p = null;
        for (ChangeCountry.PickerForm.CountryType countryType : ae50VarM5954r) {
            int iM5962r = countryType.m5962r();
            int i = iM5962r == 0 ? -1 : zjc.f283412a[edb.m38547C(iM5962r)];
            if (i == 1) {
                mwkVar = new mwk(countryType.m5961q().m5974q(), countryType.m5961q().getName(), countryType.m5961q().getUrl());
            } else if (i != 2) {
                mwkVar = null;
            } else {
                strM5968p = countryType.m5960p().m5968p();
                mwkVar = new mwk(countryType.m5960p().m5968p(), countryType.m5960p().getName(), null);
            }
            if (mwkVar != null) {
                arrayList.add(mwkVar);
            }
        }
        return new yjc(changeCountry.m5947r(), changeCountry.m5946q().m5955s().m5978p(), new owk(changeCountry.m5946q().getTitle(), arrayList, changeCountry.m5946q().m5956u().m5982p(), strM5968p));
    }
}
