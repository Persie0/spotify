package p204p;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class dmc0 {

    /* JADX INFO: renamed from: a */
    public final String f50486a;

    /* JADX INFO: renamed from: b */
    public final ArrayList f50487b;

    public dmc0(String str, ArrayList arrayList) {
        this.f50486a = str;
        this.f50487b = arrayList;
    }

    /* JADX INFO: renamed from: a */
    public final List m36407a() {
        return this.f50487b;
    }

    /* JADX INFO: renamed from: b */
    public final String m36408b() {
        return this.f50486a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dmc0)) {
            return false;
        }
        dmc0 dmc0Var = (dmc0) obj;
        return wj50.m88271j(this.f50486a, dmc0Var.f50486a) && this.f50487b.equals(dmc0Var.f50487b);
    }

    public final int hashCode() {
        return this.f50487b.hashCode() + (this.f50486a.hashCode() * 31);
    }
}
