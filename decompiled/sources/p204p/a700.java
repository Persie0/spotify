package p204p;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class a700 implements y600 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ c700 f12911a;

    public a700(c700 c700Var) {
        this.f12911a = c700Var;
    }

    @Override // p204p.y600
    /* JADX INFO: renamed from: a */
    public final boolean mo24881a(ArrayList arrayList, ArrayList arrayList2) {
        ArrayList arrayList3;
        ArrayList arrayList4;
        boolean zM31617Z;
        c700 c700Var = this.f12911a;
        ArrayList<x600> arrayList5 = c700Var.f34680o;
        if (c700.m31595O(2)) {
            Objects.toString(c700Var.f34666a);
        }
        if (c700Var.f34669d.isEmpty()) {
            zM31617Z = false;
            arrayList3 = arrayList;
            arrayList4 = arrayList2;
        } else {
            xi8 xi8Var = (xi8) edb.m38559h(1, c700Var.f34669d);
            c700Var.f34673h = xi8Var;
            Iterator it = xi8Var.f261795c.iterator();
            while (it.hasNext()) {
                i500 i500Var = ((j800) it.next()).f109751b;
                if (i500Var != null) {
                    i500Var.f98689Z = true;
                }
            }
            arrayList3 = arrayList;
            arrayList4 = arrayList2;
            zM31617Z = c700Var.m31617Z(arrayList3, arrayList4, null, -1, 0);
        }
        if (!arrayList5.isEmpty() && arrayList3.size() > 0) {
            boolean zBooleanValue = ((Boolean) arrayList4.get(arrayList3.size() - 1)).booleanValue();
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            Iterator it2 = arrayList3.iterator();
            while (it2.hasNext()) {
                linkedHashSet.addAll(c700.m31594J((xi8) it2.next()));
            }
            for (x600 x600Var : arrayList5) {
                Iterator it3 = linkedHashSet.iterator();
                while (it3.hasNext()) {
                    x600Var.mo87309b((i500) it3.next(), zBooleanValue);
                }
            }
        }
        return zM31617Z;
    }
}
