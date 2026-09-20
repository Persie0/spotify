package p204p;

import java.util.UUID;

/* JADX INFO: loaded from: classes5.dex */
public final class nga1 extends oga1 {

    /* JADX INFO: renamed from: a */
    public final UUID f153625a;

    /* JADX INFO: renamed from: b */
    public final String f153626b;

    public nga1(String str, UUID uuid) {
        this.f153625a = uuid;
        this.f153626b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nga1)) {
            return false;
        }
        nga1 nga1Var = (nga1) obj;
        return wj50.m88271j(this.f153625a, nga1Var.f153625a) && wj50.m88271j(this.f153626b, nga1Var.f153626b);
    }

    public final int hashCode() {
        return this.f153626b.hashCode() + (this.f153625a.hashCode() * 31);
    }
}
