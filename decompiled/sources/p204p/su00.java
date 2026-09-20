package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class su00 {

    /* JADX INFO: renamed from: a */
    public final String f213969a;

    /* JADX INFO: renamed from: b */
    public final ArrayList f213970b;

    /* JADX INFO: renamed from: c */
    public final w3b1 f213971c;

    /* JADX INFO: renamed from: d */
    public final yay f213972d;

    public su00(String str, ArrayList arrayList, w3b1 w3b1Var, yay yayVar) {
        this.f213969a = str;
        this.f213970b = arrayList;
        this.f213971c = w3b1Var;
        this.f213972d = yayVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof su00)) {
            return false;
        }
        su00 su00Var = (su00) obj;
        return wj50.m88271j(this.f213969a, su00Var.f213969a) && this.f213970b.equals(su00Var.f213970b) && this.f213971c.equals(su00Var.f213971c) && this.f213972d.equals(su00Var.f213972d);
    }

    public final int hashCode() {
        return this.f213972d.hashCode() + ((this.f213971c.hashCode() + lq51.m59700f(this.f213970b, this.f213969a.hashCode() * 31, 31)) * 31);
    }
}
