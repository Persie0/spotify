package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes9.dex */
public final class ts11 extends ys11 {

    /* JADX INFO: renamed from: a */
    public final String f223187a;

    /* JADX INFO: renamed from: b */
    public final ArrayList f223188b;

    public ts11(String str, ArrayList arrayList) {
        this.f223187a = str;
        this.f223188b = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ts11)) {
            return false;
        }
        ts11 ts11Var = (ts11) obj;
        return this.f223187a.equals(ts11Var.f223187a) && this.f223188b.equals(ts11Var.f223188b);
    }

    public final int hashCode() {
        return this.f223188b.hashCode() + (this.f223187a.hashCode() * 31);
    }
}
