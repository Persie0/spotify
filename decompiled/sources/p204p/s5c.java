package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class s5c {

    /* JADX INFO: renamed from: a */
    public final List f205769a;

    /* JADX INFO: renamed from: b */
    public final int f205770b;

    public s5c(int i, List list) {
        this.f205769a = list;
        this.f205770b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s5c)) {
            return false;
        }
        s5c s5cVar = (s5c) obj;
        return wj50.m88271j(this.f205769a, s5cVar.f205769a) && this.f205770b == s5cVar.f205770b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f205770b) + (this.f205769a.hashCode() * 31);
    }
}
