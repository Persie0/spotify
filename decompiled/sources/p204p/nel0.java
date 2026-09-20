package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes9.dex */
public final class nel0 implements sel0 {

    /* JADX INFO: renamed from: a */
    public final ArrayList f153020a;

    /* JADX INFO: renamed from: b */
    public final String f153021b;

    public nel0(ArrayList arrayList, String str) {
        this.f153020a = arrayList;
        this.f153021b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nel0)) {
            return false;
        }
        nel0 nel0Var = (nel0) obj;
        return this.f153020a.equals(nel0Var.f153020a) && wj50.m88271j(this.f153021b, nel0Var.f153021b);
    }

    public final int hashCode() {
        return this.f153021b.hashCode() + (this.f153020a.hashCode() * 31);
    }
}
