package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes5.dex */
public final class s5z0 extends j6z0 {

    /* JADX INFO: renamed from: a */
    public final String f205960a;

    /* JADX INFO: renamed from: b */
    public final String f205961b;

    /* JADX INFO: renamed from: c */
    public final String f205962c;

    /* JADX INFO: renamed from: d */
    public final ArrayList f205963d;

    public s5z0(String str, String str2, String str3, ArrayList arrayList) {
        this.f205960a = str;
        this.f205961b = str2;
        this.f205962c = str3;
        this.f205963d = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s5z0)) {
            return false;
        }
        s5z0 s5z0Var = (s5z0) obj;
        return wj50.m88271j(this.f205960a, s5z0Var.f205960a) && wj50.m88271j(this.f205961b, s5z0Var.f205961b) && wj50.m88271j(this.f205962c, s5z0Var.f205962c) && this.f205963d.equals(s5z0Var.f205963d);
    }

    public final int hashCode() {
        return this.f205963d.hashCode() + s571.m77243b(s571.m77243b(this.f205960a.hashCode() * 31, 31, this.f205961b), 31, this.f205962c);
    }
}
