package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes10.dex */
public final class vix0 {

    /* JADX INFO: renamed from: a */
    public final String f241805a;

    /* JADX INFO: renamed from: b */
    public final ArrayList f241806b;

    public vix0(String str, ArrayList arrayList) {
        this.f241805a = str;
        this.f241806b = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vix0)) {
            return false;
        }
        vix0 vix0Var = (vix0) obj;
        return wj50.m88271j(this.f241805a, vix0Var.f241805a) && this.f241806b.equals(vix0Var.f241806b);
    }

    public final int hashCode() {
        return this.f241806b.hashCode() + (this.f241805a.hashCode() * 31);
    }
}
