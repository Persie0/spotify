package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class e0c extends i0c {

    /* JADX INFO: renamed from: a */
    public final String f54935a;

    /* JADX INFO: renamed from: b */
    public final AbstractC1961i f54936b;

    /* JADX INFO: renamed from: c */
    public final ArrayList f54937c;

    public e0c(String str, AbstractC1961i abstractC1961i, ArrayList arrayList) {
        this.f54935a = str;
        this.f54936b = abstractC1961i;
        this.f54937c = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e0c)) {
            return false;
        }
        e0c e0cVar = (e0c) obj;
        return wj50.m88271j(this.f54935a, e0cVar.f54935a) && this.f54936b.equals(e0cVar.f54936b) && this.f54937c.equals(e0cVar.f54937c);
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + lq51.m59700f(this.f54937c, (this.f54936b.hashCode() + (this.f54935a.hashCode() * 31)) * 31, 31);
    }
}
