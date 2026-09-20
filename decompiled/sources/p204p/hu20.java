package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes7.dex */
public final class hu20 {

    /* JADX INFO: renamed from: a */
    public final String f95239a;

    /* JADX INFO: renamed from: b */
    public final ArrayList f95240b;

    /* JADX INFO: renamed from: c */
    public final e2r f95241c;

    public hu20(String str, ArrayList arrayList, e2r e2rVar) {
        this.f95239a = str;
        this.f95240b = arrayList;
        this.f95241c = e2rVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hu20)) {
            return false;
        }
        hu20 hu20Var = (hu20) obj;
        return wj50.m88271j(this.f95239a, hu20Var.f95239a) && this.f95240b.equals(hu20Var.f95240b) && this.f95241c.equals(hu20Var.f95241c);
    }

    public final int hashCode() {
        return this.f95241c.hashCode() + lq51.m59700f(this.f95240b, this.f95239a.hashCode() * 31, 31);
    }
}
