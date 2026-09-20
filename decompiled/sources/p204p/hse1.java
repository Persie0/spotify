package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public final class hse1 {

    /* JADX INFO: renamed from: a */
    public final List f94685a;

    public hse1(ae50 ae50Var) {
        this.f94685a = ae50Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hse1) && wj50.m88271j(this.f94685a, ((hse1) obj).f94685a);
    }

    public final int hashCode() {
        return this.f94685a.hashCode();
    }
}
