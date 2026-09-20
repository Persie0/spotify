package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class jl01 implements tl01 {

    /* JADX INFO: renamed from: a */
    public final List f113454a;

    public jl01(List list) {
        this.f113454a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jl01) && wj50.m88271j(this.f113454a, ((jl01) obj).f113454a);
    }

    public final int hashCode() {
        return this.f113454a.hashCode();
    }
}
