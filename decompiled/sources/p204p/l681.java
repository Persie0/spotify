package p204p;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class l681 {

    /* JADX INFO: renamed from: a */
    public final String f130272a;

    /* JADX INFO: renamed from: b */
    public final ArrayList f130273b;

    public l681(String str, ArrayList arrayList) {
        this.f130272a = str;
        this.f130273b = arrayList;
    }

    /* JADX INFO: renamed from: a */
    public final List m58322a() {
        return this.f130273b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l681)) {
            return false;
        }
        l681 l681Var = (l681) obj;
        return wj50.m88271j(this.f130272a, l681Var.f130272a) && this.f130273b.equals(l681Var.f130273b);
    }

    public final int hashCode() {
        return this.f130273b.hashCode() + (this.f130272a.hashCode() * 31);
    }
}
