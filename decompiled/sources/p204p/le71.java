package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
public final class le71 implements i4a {

    /* JADX INFO: renamed from: a */
    public final String f132483a;

    /* JADX INFO: renamed from: b */
    public final ArrayList f132484b;

    public le71(String str, ArrayList arrayList) {
        this.f132483a = str;
        this.f132484b = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof le71)) {
            return false;
        }
        le71 le71Var = (le71) obj;
        return this.f132483a.equals(le71Var.f132483a) && this.f132484b.equals(le71Var.f132484b);
    }

    public final int hashCode() {
        return this.f132484b.hashCode() + (this.f132483a.hashCode() * 31);
    }
}
