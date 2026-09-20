package p204p;

import androidx.car.app.model.Row;
import androidx.car.app.model.RowSection;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class qrx0 extends n5z0 {

    /* JADX INFO: renamed from: f */
    public final int f191923f = -1;

    /* JADX INFO: renamed from: a */
    public final RowSection m73661a() {
        ArrayList arrayList = this.f150642a;
        int i = this.f191923f;
        if (i >= 0) {
            if (!arrayList.isEmpty() && i >= arrayList.size()) {
                StringBuilder sbM56838j = klh.m56838j(i, "The set initial selected index (", ") cannot be larger than the size of the list (");
                sbM56838j.append(arrayList.size());
                sbM56838j.append(")");
                throw new IllegalArgumentException(sbM56838j.toString());
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                if (((Row) it.next()).getToggle() != null) {
                    throw new IllegalArgumentException("A row that has a toggle set cannot be added to a RowSection that has an onSelectedListener.");
                }
            }
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            nox0.f156809k.m65252a((Row) it2.next());
        }
        return new RowSection(this, 0);
    }
}
