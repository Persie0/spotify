package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class yrj extends dsj {

    /* JADX INFO: renamed from: a */
    public final int f275487a;

    /* JADX INFO: renamed from: b */
    public final ArrayList f275488b;

    public yrj(int i, ArrayList arrayList) {
        this.f275487a = i;
        this.f275488b = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yrj)) {
            return false;
        }
        yrj yrjVar = (yrj) obj;
        return this.f275487a == yrjVar.f275487a && this.f275488b.equals(yrjVar.f275488b);
    }

    public final int hashCode() {
        return this.f275488b.hashCode() + (edb.m38547C(this.f275487a) * 31);
    }
}
