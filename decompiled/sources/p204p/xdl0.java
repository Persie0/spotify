package p204p;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public final class xdl0 implements bel0 {

    /* JADX INFO: renamed from: a */
    public final ArrayList f260503a;

    /* JADX INFO: renamed from: b */
    public final String f260504b;

    public xdl0(ArrayList arrayList, String str) {
        this.f260503a = arrayList;
        this.f260504b = str;
    }

    @Override // p204p.bel0
    /* JADX INFO: renamed from: a */
    public final String mo28945a() {
        return this.f260504b;
    }

    @Override // p204p.bel0
    /* JADX INFO: renamed from: c */
    public final List mo28946c() {
        return this.f260503a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xdl0)) {
            return false;
        }
        xdl0 xdl0Var = (xdl0) obj;
        return this.f260503a.equals(xdl0Var.f260503a) && wj50.m88271j(this.f260504b, xdl0Var.f260504b);
    }

    public final int hashCode() {
        return this.f260504b.hashCode() + (this.f260503a.hashCode() * 31);
    }
}
