package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes9.dex */
public final class ss11 extends ys11 {

    /* JADX INFO: renamed from: a */
    public final String f213455a;

    /* JADX INFO: renamed from: b */
    public final String f213456b;

    /* JADX INFO: renamed from: c */
    public final String f213457c;

    /* JADX INFO: renamed from: d */
    public final ArrayList f213458d;

    public ss11(String str, String str2, String str3, ArrayList arrayList) {
        this.f213455a = str;
        this.f213456b = str2;
        this.f213457c = str3;
        this.f213458d = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ss11)) {
            return false;
        }
        ss11 ss11Var = (ss11) obj;
        return this.f213455a.equals(ss11Var.f213455a) && wj50.m88271j(this.f213456b, ss11Var.f213456b) && wj50.m88271j(this.f213457c, ss11Var.f213457c) && this.f213458d.equals(ss11Var.f213458d);
    }

    public final int hashCode() {
        return this.f213458d.hashCode() + s571.m77243b(s571.m77243b(this.f213455a.hashCode() * 31, 31, this.f213456b), 31, this.f213457c);
    }
}
