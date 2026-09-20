package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes10.dex */
public final class fkk {

    /* JADX INFO: renamed from: a */
    public final String f70555a;

    /* JADX INFO: renamed from: b */
    public final ArrayList f70556b;

    public fkk(String str, ArrayList arrayList) {
        this.f70555a = str;
        this.f70556b = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fkk)) {
            return false;
        }
        fkk fkkVar = (fkk) obj;
        return wj50.m88271j(this.f70555a, fkkVar.f70555a) && this.f70556b.equals(fkkVar.f70556b);
    }

    public final int hashCode() {
        String str = this.f70555a;
        return this.f70556b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }
}
