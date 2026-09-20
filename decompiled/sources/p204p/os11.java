package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes9.dex */
public final class os11 {

    /* JADX INFO: renamed from: a */
    public final String f168708a;

    /* JADX INFO: renamed from: b */
    public final String f168709b;

    /* JADX INFO: renamed from: c */
    public final ArrayList f168710c;

    public os11(String str, String str2, ArrayList arrayList) {
        this.f168708a = str;
        this.f168709b = str2;
        this.f168710c = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof os11)) {
            return false;
        }
        os11 os11Var = (os11) obj;
        return wj50.m88271j(this.f168708a, os11Var.f168708a) && wj50.m88271j(this.f168709b, os11Var.f168709b) && this.f168710c.equals(os11Var.f168710c);
    }

    public final int hashCode() {
        return this.f168710c.hashCode() + s571.m77243b(this.f168708a.hashCode() * 31, 31, this.f168709b);
    }
}
