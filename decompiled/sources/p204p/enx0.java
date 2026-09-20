package p204p;

import android.media.RouteListingPreference;
import android.os.Build;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes8.dex */
public abstract class enx0 {
    /* JADX INFO: renamed from: a */
    public static final RouteListingPreference m39526a(dnx0 dnx0Var) {
        int i;
        RouteListingPreference.Builder builderM25894a = ah30.m25894a();
        List list = dnx0Var.f50887a;
        ArrayList arrayList = new ArrayList(i6f.m49804T(list, 10));
        Iterator it = list.iterator();
        while (true) {
            int i2 = 0;
            if (!it.hasNext()) {
                RouteListingPreference.Builder useSystemOrdering = builderM25894a.setItems(arrayList).setLinkedItemComponentName(dnx0Var.f50888b).setUseSystemOrdering(false);
                if (Build.VERSION.SDK_INT >= 37) {
                    useSystemOrdering.setMissingPermissionsComponentName(dnx0Var.f50889c);
                }
                return useSystemOrdering.build();
            }
            cnx0 cnx0Var = (cnx0) it.next();
            ah30.m25898e();
            RouteListingPreference.Item.Builder builderM25895b = ah30.m25895b(cnx0Var.f40118a);
            int iM38547C = edb.m38547C(cnx0Var.f40119b);
            if (iM38547C == 0) {
                i = 0;
            } else if (iM38547C != 1) {
                i = 2;
                if (iM38547C != 2) {
                    throw new NoWhenBranchMatchedException();
                }
            } else {
                i = 1;
            }
            RouteListingPreference.Item.Builder selectionBehavior = builderM25895b.setSelectionBehavior(i);
            int iM38547C2 = edb.m38547C(cnx0Var.f40120c);
            if (iM38547C2 != 0) {
                if (iM38547C2 != 1) {
                    throw new NoWhenBranchMatchedException();
                }
                i2 = 10000;
            }
            arrayList.add(selectionBehavior.setSubText(i2).setCustomSubtextMessage(cnx0Var.f40121d).setFlags(cnx0Var.f40122e).build());
        }
    }
}
