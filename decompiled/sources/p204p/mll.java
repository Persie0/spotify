package p204p;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class mll implements pll {

    /* JADX INFO: renamed from: a */
    public final dil f144856a;

    /* JADX INFO: renamed from: b */
    public final dil f144857b;

    /* JADX INFO: renamed from: c */
    public final List f144858c;

    public mll(dil dilVar, dil dilVar2) {
        this.f144856a = dilVar;
        this.f144857b = dilVar2;
        this.f144858c = Collections.singletonList(dilVar2);
    }

    @Override // p204p.pll
    /* JADX INFO: renamed from: a */
    public final List mo62235a() {
        return this.f144858c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mll)) {
            return false;
        }
        mll mllVar = (mll) obj;
        return wj50.m88271j(this.f144856a, mllVar.f144856a) && wj50.m88271j(this.f144857b, mllVar.f144857b);
    }

    public final int hashCode() {
        return this.f144857b.hashCode() + (this.f144856a.hashCode() * 31);
    }
}
