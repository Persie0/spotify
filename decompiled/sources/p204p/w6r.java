package p204p;

import android.os.Bundle;

/* JADX INFO: loaded from: classes8.dex */
public final class w6r {

    /* JADX INFO: renamed from: a */
    public final String f248445a;

    /* JADX INFO: renamed from: b */
    public final String f248446b;

    /* JADX INFO: renamed from: c */
    public final int f248447c;

    public w6r(String str, String str2, int i) {
        Bundle bundle = Bundle.EMPTY;
        this.f248445a = str;
        this.f248446b = str2;
        this.f248447c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w6r)) {
            return false;
        }
        w6r w6rVar = (w6r) obj;
        if (!wj50.m88271j(this.f248445a, w6rVar.f248445a)) {
            return false;
        }
        Bundle bundle = Bundle.EMPTY;
        return wj50.m88271j(bundle, bundle) && this.f248446b.equals(w6rVar.f248446b) && this.f248447c == w6rVar.f248447c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f248447c) + s571.m77243b((Bundle.EMPTY.hashCode() + (this.f248445a.hashCode() * 31)) * 31, 31, this.f248446b);
    }
}
