package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes8.dex */
public final class bc30 {

    /* JADX INFO: renamed from: a */
    public final ArrayList f25761a;

    /* JADX INFO: renamed from: b */
    public final String f25762b;

    /* JADX INFO: renamed from: c */
    public final boolean f25763c;

    /* JADX INFO: renamed from: d */
    public final int f25764d;

    /* JADX INFO: renamed from: e */
    public final String f25765e;

    public bc30(int i, String str, String str2, ArrayList arrayList, boolean z) {
        this.f25761a = arrayList;
        this.f25762b = str;
        this.f25763c = z;
        this.f25764d = i;
        this.f25765e = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bc30)) {
            return false;
        }
        bc30 bc30Var = (bc30) obj;
        return this.f25761a.equals(bc30Var.f25761a) && wj50.m88271j(this.f25762b, bc30Var.f25762b) && this.f25763c == bc30Var.f25763c && this.f25764d == bc30Var.f25764d && wj50.m88271j(this.f25765e, bc30Var.f25765e);
    }

    public final int hashCode() {
        return this.f25765e.hashCode() + mt60.m62800g(this.f25764d, s571.m77245d(s571.m77243b(this.f25761a.hashCode() * 31, 31, this.f25762b), 31, this.f25763c), 31);
    }
}
