package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes8.dex */
public final class dwe extends fwe {

    /* JADX INFO: renamed from: a */
    public final String f53683a;

    /* JADX INFO: renamed from: b */
    public final ArrayList f53684b;

    public dwe(String str, ArrayList arrayList) {
        this.f53683a = str;
        this.f53684b = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dwe)) {
            return false;
        }
        dwe dweVar = (dwe) obj;
        return this.f53683a.equals(dweVar.f53683a) && this.f53684b.equals(dweVar.f53684b);
    }

    public final int hashCode() {
        return this.f53684b.hashCode() + (this.f53683a.hashCode() * 31);
    }
}
