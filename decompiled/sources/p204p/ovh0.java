package p204p;

import com.spotify.home.evopage.structureapi.DismissedEntity;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class ovh0 {

    /* JADX INFO: renamed from: a */
    public final List f170502a;

    /* JADX INFO: renamed from: b */
    public final Set f170503b;

    /* JADX INFO: renamed from: c */
    public final Set f170504c;

    /* JADX INFO: renamed from: d */
    public final ebf0 f170505d;

    /* JADX INFO: renamed from: e */
    public final List f170506e;

    /* JADX INFO: renamed from: f */
    public final String f170507f;

    public ovh0(List list, Set set, Set set2, ebf0 ebf0Var, List list2, String str) {
        this.f170502a = list;
        this.f170503b = set;
        this.f170504c = set2;
        this.f170505d = ebf0Var;
        this.f170506e = list2;
        this.f170507f = str;
    }

    /* JADX INFO: renamed from: a */
    public static ovh0 m68131a(ovh0 ovh0Var, ArrayList arrayList, Set set, Set set2, List list, String str, int i) {
        List list2 = arrayList;
        if ((i & 1) != 0) {
            list2 = ovh0Var.f170502a;
        }
        List list3 = list2;
        if ((i & 2) != 0) {
            set = ovh0Var.f170503b;
        }
        Set set3 = set;
        if ((i & 4) != 0) {
            set2 = ovh0Var.f170504c;
        }
        Set set4 = set2;
        ebf0 ebf0Var = ovh0Var.f170505d;
        if ((i & 16) != 0) {
            list = ovh0Var.f170506e;
        }
        List list4 = list;
        if ((i & 32) != 0) {
            str = ovh0Var.f170507f;
        }
        ovh0Var.getClass();
        return new ovh0(list3, set3, set4, ebf0Var, list4, str);
    }

    /* JADX INFO: renamed from: b */
    public final ArrayList m68132b() {
        ArrayList arrayList = new ArrayList();
        for (Object obj : this.f170502a) {
            k330 k330Var = (k330) obj;
            if (!(k330Var instanceof ru11)) {
                Set set = this.f170503b;
                if (!(set instanceof Collection) || !set.isEmpty()) {
                    Iterator it = set.iterator();
                    do {
                        if (it.hasNext()) {
                        }
                    } while (!wj50.m88271j(((DismissedEntity) it.next()).getId(), k330Var.getId()));
                }
                arrayList.add(obj);
                break;
                break;
            }
            Set set2 = this.f170504c;
            if (!(set2 instanceof Collection) || !set2.isEmpty()) {
                Iterator it2 = set2.iterator();
                do {
                    if (it2.hasNext()) {
                    }
                } while (!wj50.m88271j(((DismissedEntity) it2.next()).getId(), ((ru11) k330Var).f202725a));
            }
            arrayList.add(obj);
            break;
        }
        List list = this.f170506e;
        ArrayList arrayList2 = new ArrayList(i6f.m49804T(list, 10));
        Iterator it3 = list.iterator();
        while (it3.hasNext()) {
            arrayList2.add(((uyk0) it3.next()).m84273a());
        }
        return q191.m71906p(arrayList, arrayList2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ovh0)) {
            return false;
        }
        ovh0 ovh0Var = (ovh0) obj;
        return wj50.m88271j(this.f170502a, ovh0Var.f170502a) && wj50.m88271j(this.f170503b, ovh0Var.f170503b) && wj50.m88271j(this.f170504c, ovh0Var.f170504c) && wj50.m88271j(this.f170505d, ovh0Var.f170505d) && wj50.m88271j(this.f170506e, ovh0Var.f170506e) && wj50.m88271j(this.f170507f, ovh0Var.f170507f);
    }

    public final int hashCode() {
        int iM56830b = klh.m56830b(klh.m56830b(this.f170502a.hashCode() * 31, 31, this.f170503b), 31, this.f170504c);
        ebf0 ebf0Var = this.f170505d;
        return this.f170507f.hashCode() + s571.m77244c((iM56830b + (ebf0Var == null ? 0 : ebf0Var.f57921a.hashCode())) * 31, 31, this.f170506e);
    }
}
