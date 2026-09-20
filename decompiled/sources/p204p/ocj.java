package p204p;

import android.widget.Filter;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class ocj extends Filter {

    /* JADX INFO: renamed from: a */
    public final Object f163933a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ pcj f163934b;

    public ocj(pcj pcjVar, List list) {
        this.f163934b = pcjVar;
        this.f163933a = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Iterable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6 */
    @Override // android.widget.Filter
    public final Filter.FilterResults performFiltering(CharSequence charSequence) {
        ?? r0 = this.f163933a;
        ?? r1 = r0;
        if (charSequence != null && !wl51.m88460J0(charSequence)) {
            r1 = r0;
            String string = wl51.m88491o1(charSequence.toString()).toString();
            ArrayList arrayList = new ArrayList();
            for (Object obj : r0) {
                if (wl51.m88496t0((String) obj, string, true)) {
                    arrayList.add(obj);
                }
            }
            r1 = arrayList;
        }
        r1 = r0;
        Filter.FilterResults filterResults = new Filter.FilterResults();
        filterResults.values = r1;
        filterResults.count = r1.size();
        return filterResults;
    }

    @Override // android.widget.Filter
    public final void publishResults(CharSequence charSequence, Filter.FilterResults filterResults) {
        Object obj = filterResults != null ? filterResults.values : null;
        pcj pcjVar = this.f163934b;
        pcjVar.f176136a = (List) obj;
        pcjVar.notifyDataSetChanged();
    }
}
