package p204p;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public final class c8x {

    /* JADX INFO: renamed from: a */
    public final ArrayList f35326a;

    /* JADX INFO: renamed from: b */
    public final LinkedHashMap f35327b;

    /* JADX INFO: renamed from: c */
    public final ArrayList f35328c;

    public c8x(ArrayList arrayList, LinkedHashMap linkedHashMap, ArrayList arrayList2) {
        this.f35326a = arrayList;
        this.f35327b = linkedHashMap;
        this.f35328c = arrayList2;
    }

    /* JADX INFO: renamed from: a */
    public final List m31799a() {
        return this.f35326a;
    }

    /* JADX INFO: renamed from: b */
    public final Map m31800b() {
        return this.f35327b;
    }

    /* JADX INFO: renamed from: c */
    public final List m31801c() {
        return this.f35328c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c8x)) {
            return false;
        }
        c8x c8xVar = (c8x) obj;
        return this.f35326a.equals(c8xVar.f35326a) && this.f35327b.equals(c8xVar.f35327b) && this.f35328c.equals(c8xVar.f35328c);
    }

    public final int hashCode() {
        return this.f35328c.hashCode() + ((this.f35327b.hashCode() + (this.f35326a.hashCode() * 31)) * 31);
    }
}
