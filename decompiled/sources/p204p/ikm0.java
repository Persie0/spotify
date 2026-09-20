package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
public final class ikm0 {

    /* JADX INFO: renamed from: a */
    public final String f103140a;

    /* JADX INFO: renamed from: b */
    public final String f103141b;

    /* JADX INFO: renamed from: c */
    public final ArrayList f103142c;

    public ikm0(String str, String str2, ArrayList arrayList) {
        this.f103140a = str;
        this.f103141b = str2;
        this.f103142c = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ikm0)) {
            return false;
        }
        ikm0 ikm0Var = (ikm0) obj;
        return wj50.m88271j(this.f103140a, ikm0Var.f103140a) && this.f103141b.equals(ikm0Var.f103141b) && this.f103142c.equals(ikm0Var.f103142c);
    }

    public final int hashCode() {
        return this.f103142c.hashCode() + s571.m77243b(this.f103140a.hashCode() * 31, 31, this.f103141b);
    }
}
