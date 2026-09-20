package p204p;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class dx61 {

    /* JADX INFO: renamed from: a */
    public final String f53859a;

    /* JADX INFO: renamed from: b */
    public final String f53860b;

    /* JADX INFO: renamed from: c */
    public final List f53861c;

    /* JADX INFO: renamed from: d */
    public final ArrayList f53862d;

    /* JADX INFO: renamed from: e */
    public final String f53863e;

    /* JADX INFO: renamed from: f */
    public final List f53864f;

    public dx61(String str, String str2, List list, ArrayList arrayList, String str3, List list2) {
        this.f53859a = str;
        this.f53860b = str2;
        this.f53861c = list;
        this.f53862d = arrayList;
        this.f53863e = str3;
        this.f53864f = list2;
    }

    /* JADX INFO: renamed from: a */
    public static dx61 m37195a(dx61 dx61Var, List list, ArrayList arrayList, int i) {
        String str = dx61Var.f53859a;
        String str2 = dx61Var.f53860b;
        if ((i & 4) != 0) {
            list = dx61Var.f53861c;
        }
        return new dx61(str, str2, list, arrayList, dx61Var.f53863e, dx61Var.f53864f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dx61)) {
            return false;
        }
        dx61 dx61Var = (dx61) obj;
        return wj50.m88271j(this.f53859a, dx61Var.f53859a) && wj50.m88271j(this.f53860b, dx61Var.f53860b) && wj50.m88271j(this.f53861c, dx61Var.f53861c) && this.f53862d.equals(dx61Var.f53862d) && wj50.m88271j(this.f53863e, dx61Var.f53863e) && wj50.m88271j(this.f53864f, dx61Var.f53864f);
    }

    public final int hashCode() {
        int iHashCode = this.f53859a.hashCode() * 31;
        String str = this.f53860b;
        return this.f53864f.hashCode() + s571.m77243b(lq51.m59700f(this.f53862d, s571.m77244c((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.f53861c), 31), 31, this.f53863e);
    }
}
