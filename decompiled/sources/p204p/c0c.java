package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class c0c extends i0c {

    /* JADX INFO: renamed from: a */
    public final AbstractC1961i f32734a;

    /* JADX INFO: renamed from: b */
    public final ArrayList f32735b;

    public c0c(AbstractC1961i abstractC1961i, ArrayList arrayList) {
        this.f32734a = abstractC1961i;
        this.f32735b = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c0c)) {
            return false;
        }
        c0c c0cVar = (c0c) obj;
        return wj50.m88271j(this.f32734a, c0cVar.f32734a) && this.f32735b.equals(c0cVar.f32735b);
    }

    public final int hashCode() {
        return this.f32735b.hashCode() + (this.f32734a.hashCode() * 31);
    }
}
