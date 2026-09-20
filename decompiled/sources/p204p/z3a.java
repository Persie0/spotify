package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
public final class z3a implements a4a {

    /* JADX INFO: renamed from: a */
    public final ArrayList f278821a;

    /* JADX INFO: renamed from: b */
    public final b4a f278822b;

    public z3a(ArrayList arrayList, b4a b4aVar) {
        this.f278821a = arrayList;
        this.f278822b = b4aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z3a)) {
            return false;
        }
        z3a z3aVar = (z3a) obj;
        return this.f278821a.equals(z3aVar.f278821a) && this.f278822b.equals(z3aVar.f278822b);
    }

    public final int hashCode() {
        return this.f278822b.hashCode() + (this.f278821a.hashCode() * 31);
    }
}
