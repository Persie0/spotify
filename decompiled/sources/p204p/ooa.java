package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes5.dex */
public final class ooa {

    /* JADX INFO: renamed from: a */
    public final String f167519a;

    /* JADX INFO: renamed from: b */
    public final ArrayList f167520b;

    /* JADX INFO: renamed from: c */
    public final rzd1 f167521c;

    public ooa(String str, ArrayList arrayList, rzd1 rzd1Var) {
        this.f167519a = str;
        this.f167520b = arrayList;
        this.f167521c = rzd1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ooa)) {
            return false;
        }
        ooa ooaVar = (ooa) obj;
        return wj50.m88271j(this.f167519a, ooaVar.f167519a) && this.f167520b.equals(ooaVar.f167520b) && this.f167521c.equals(ooaVar.f167521c);
    }

    public final int hashCode() {
        return this.f167521c.hashCode() + lq51.m59700f(this.f167520b, this.f167519a.hashCode() * 31, 31);
    }
}
