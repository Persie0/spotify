package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
public final class t0w0 {

    /* JADX INFO: renamed from: a */
    public final String f216016a;

    /* JADX INFO: renamed from: b */
    public final ArrayList f216017b;

    public t0w0(String str, ArrayList arrayList) {
        this.f216016a = str;
        this.f216017b = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t0w0)) {
            return false;
        }
        t0w0 t0w0Var = (t0w0) obj;
        return wj50.m88271j(this.f216016a, t0w0Var.f216016a) && this.f216017b.equals(t0w0Var.f216017b);
    }

    public final int hashCode() {
        return this.f216017b.hashCode() + (this.f216016a.hashCode() * 31);
    }
}
