package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class qr9 {

    /* JADX INFO: renamed from: a */
    public final Object f191775a;

    /* JADX INFO: renamed from: b */
    public final k3c0 f191776b;

    public qr9(List list, k3c0 k3c0Var) {
        this.f191775a = list;
        this.f191776b = k3c0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qr9)) {
            return false;
        }
        qr9 qr9Var = (qr9) obj;
        return this.f191775a.equals(qr9Var.f191775a) && this.f191776b == qr9Var.f191776b;
    }

    public final int hashCode() {
        return this.f191776b.hashCode() + (this.f191775a.hashCode() * 31);
    }
}
