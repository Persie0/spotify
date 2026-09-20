package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes5.dex */
public final class a3s {

    /* JADX INFO: renamed from: a */
    public final ArrayList f12034a;

    /* JADX INFO: renamed from: b */
    public final ArrayList f12035b;

    /* JADX INFO: renamed from: c */
    public final eh00 f12036c;

    public a3s(ArrayList arrayList, ArrayList arrayList2, eh00 eh00Var) {
        this.f12034a = arrayList;
        this.f12035b = arrayList2;
        this.f12036c = eh00Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a3s)) {
            return false;
        }
        a3s a3sVar = (a3s) obj;
        return this.f12034a.equals(a3sVar.f12034a) && this.f12035b.equals(a3sVar.f12035b) && wj50.m88271j(this.f12036c, a3sVar.f12036c);
    }

    public final int hashCode() {
        return this.f12036c.hashCode() + lq51.m59700f(this.f12035b, this.f12034a.hashCode() * 31, 31);
    }
}
