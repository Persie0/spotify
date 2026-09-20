package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes10.dex */
public final class uop0 {

    /* JADX INFO: renamed from: a */
    public final boolean f232500a;

    /* JADX INFO: renamed from: b */
    public final int f232501b;

    /* JADX INFO: renamed from: c */
    public final ArrayList f232502c;

    public uop0(int i, ArrayList arrayList, boolean z) {
        this.f232500a = z;
        this.f232501b = i;
        this.f232502c = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uop0)) {
            return false;
        }
        uop0 uop0Var = (uop0) obj;
        return this.f232500a == uop0Var.f232500a && this.f232501b == uop0Var.f232501b && this.f232502c.equals(uop0Var.f232502c);
    }

    public final int hashCode() {
        return this.f232502c.hashCode() + mt60.m62800g(this.f232501b, Boolean.hashCode(this.f232500a) * 31, 31);
    }
}
