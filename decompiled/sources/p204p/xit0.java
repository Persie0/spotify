package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes7.dex */
public final class xit0 {

    /* JADX INFO: renamed from: a */
    public final String f261937a;

    /* JADX INFO: renamed from: b */
    public final String f261938b;

    /* JADX INFO: renamed from: c */
    public final ArrayList f261939c;

    /* JADX INFO: renamed from: d */
    public final String f261940d;

    public xit0(String str, String str2, String str3, ArrayList arrayList) {
        this.f261937a = str;
        this.f261938b = str2;
        this.f261939c = arrayList;
        this.f261940d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xit0)) {
            return false;
        }
        xit0 xit0Var = (xit0) obj;
        return this.f261937a.equals(xit0Var.f261937a) && wj50.m88271j(this.f261938b, xit0Var.f261938b) && this.f261939c.equals(xit0Var.f261939c) && wj50.m88271j(this.f261940d, xit0Var.f261940d);
    }

    public final int hashCode() {
        return this.f261940d.hashCode() + lq51.m59700f(this.f261939c, s571.m77243b(this.f261937a.hashCode() * 31, 31, this.f261938b), 31);
    }
}
