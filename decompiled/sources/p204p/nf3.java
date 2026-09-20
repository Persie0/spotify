package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public final class nf3 extends ig3 {

    /* JADX INFO: renamed from: a */
    public final List f153234a;

    public nf3(List list) {
        this.f153234a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof nf3) && wj50.m88271j(this.f153234a, ((nf3) obj).f153234a);
    }

    public final int hashCode() {
        return this.f153234a.hashCode();
    }
}
