package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes9.dex */
public final class k9z extends l9z {

    /* JADX INFO: renamed from: a */
    public final String f120721a;

    /* JADX INFO: renamed from: b */
    public final boolean f120722b;

    /* JADX INFO: renamed from: c */
    public final ArrayList f120723c;

    public k9z(String str, ArrayList arrayList, boolean z) {
        this.f120721a = str;
        this.f120722b = z;
        this.f120723c = arrayList;
    }

    @Override // p204p.l9z
    /* JADX INFO: renamed from: a */
    public final boolean mo50003a() {
        return this.f120722b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k9z)) {
            return false;
        }
        k9z k9zVar = (k9z) obj;
        return wj50.m88271j(this.f120721a, k9zVar.f120721a) && this.f120722b == k9zVar.f120722b && this.f120723c.equals(k9zVar.f120723c);
    }

    public final int hashCode() {
        String str = this.f120721a;
        return this.f120723c.hashCode() + s571.m77245d((str == null ? 0 : str.hashCode()) * 31, 31, this.f120722b);
    }
}
