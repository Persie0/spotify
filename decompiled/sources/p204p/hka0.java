package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes10.dex */
public final class hka0 extends ika0 {

    /* JADX INFO: renamed from: a */
    public final String f92402a;

    /* JADX INFO: renamed from: b */
    public final ArrayList f92403b;

    public hka0(String str, ArrayList arrayList) {
        this.f92402a = str;
        this.f92403b = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hka0)) {
            return false;
        }
        hka0 hka0Var = (hka0) obj;
        return wj50.m88271j(this.f92402a, hka0Var.f92402a) && this.f92403b.equals(hka0Var.f92403b);
    }

    public final int hashCode() {
        return this.f92403b.hashCode() + (this.f92402a.hashCode() * 31);
    }
}
