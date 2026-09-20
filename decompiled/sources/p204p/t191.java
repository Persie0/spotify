package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes10.dex */
public final class t191 {

    /* JADX INFO: renamed from: a */
    public final String f216199a;

    /* JADX INFO: renamed from: b */
    public final ArrayList f216200b;

    public t191(String str, ArrayList arrayList) {
        this.f216199a = str;
        this.f216200b = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t191)) {
            return false;
        }
        t191 t191Var = (t191) obj;
        return wj50.m88271j(this.f216199a, t191Var.f216199a) && this.f216200b.equals(t191Var.f216200b);
    }

    public final int hashCode() {
        return this.f216200b.hashCode() + (this.f216199a.hashCode() * 31);
    }
}
