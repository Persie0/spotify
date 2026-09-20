package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes5.dex */
public final class c5d implements h5d {

    /* JADX INFO: renamed from: a */
    public final String f34143a;

    /* JADX INFO: renamed from: b */
    public final String f34144b;

    /* JADX INFO: renamed from: c */
    public final ArrayList f34145c;

    public c5d(String str, String str2, ArrayList arrayList) {
        this.f34143a = str;
        this.f34144b = str2;
        this.f34145c = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c5d)) {
            return false;
        }
        c5d c5dVar = (c5d) obj;
        return wj50.m88271j(this.f34143a, c5dVar.f34143a) && wj50.m88271j(this.f34144b, c5dVar.f34144b) && this.f34145c.equals(c5dVar.f34145c);
    }

    public final int hashCode() {
        return this.f34145c.hashCode() + s571.m77243b(this.f34143a.hashCode() * 31, 31, this.f34144b);
    }
}
