package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes5.dex */
public final class jm61 implements mn61 {

    /* JADX INFO: renamed from: a */
    public final String f113778a;

    /* JADX INFO: renamed from: b */
    public final ArrayList f113779b;

    /* JADX INFO: renamed from: c */
    public final String f113780c;

    public jm61(String str, String str2, ArrayList arrayList) {
        this.f113778a = str;
        this.f113779b = arrayList;
        this.f113780c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jm61)) {
            return false;
        }
        jm61 jm61Var = (jm61) obj;
        return wj50.m88271j(this.f113778a, jm61Var.f113778a) && this.f113779b.equals(jm61Var.f113779b) && wj50.m88271j(this.f113780c, jm61Var.f113780c);
    }

    public final int hashCode() {
        int iM59700f = lq51.m59700f(this.f113779b, this.f113778a.hashCode() * 31, 31);
        String str = this.f113780c;
        return iM59700f + (str == null ? 0 : str.hashCode());
    }
}
