package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes5.dex */
public final class nvz0 {

    /* JADX INFO: renamed from: a */
    public final ArrayList f158982a;

    /* JADX INFO: renamed from: b */
    public final String f158983b;

    public nvz0(ArrayList arrayList, String str) {
        this.f158982a = arrayList;
        this.f158983b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nvz0)) {
            return false;
        }
        nvz0 nvz0Var = (nvz0) obj;
        return this.f158982a.equals(nvz0Var.f158982a) && wj50.m88271j(this.f158983b, nvz0Var.f158983b);
    }

    public final int hashCode() {
        return this.f158983b.hashCode() + (this.f158982a.hashCode() * 31);
    }
}
