package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes9.dex */
public final class y79 {

    /* JADX INFO: renamed from: a */
    public final String f269994a;

    /* JADX INFO: renamed from: b */
    public final ArrayList f269995b;

    public y79(String str, ArrayList arrayList) {
        this.f269994a = str;
        this.f269995b = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y79)) {
            return false;
        }
        y79 y79Var = (y79) obj;
        return this.f269994a.equals(y79Var.f269994a) && this.f269995b.equals(y79Var.f269995b);
    }

    public final int hashCode() {
        return this.f269995b.hashCode() + (this.f269994a.hashCode() * 31);
    }
}
