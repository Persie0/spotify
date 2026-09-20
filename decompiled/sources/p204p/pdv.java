package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
public final class pdv implements qdv {

    /* JADX INFO: renamed from: a */
    public final String f176550a;

    /* JADX INFO: renamed from: b */
    public final ArrayList f176551b;

    public pdv(String str, ArrayList arrayList) {
        this.f176550a = str;
        this.f176551b = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pdv)) {
            return false;
        }
        pdv pdvVar = (pdv) obj;
        return wj50.m88271j(this.f176550a, pdvVar.f176550a) && this.f176551b.equals(pdvVar.f176551b);
    }

    public final int hashCode() {
        return this.f176551b.hashCode() + (this.f176550a.hashCode() * 31);
    }
}
