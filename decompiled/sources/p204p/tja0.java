package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class tja0 extends jka0 {

    /* JADX INFO: renamed from: a */
    public final List f220865a;

    public tja0(List list) {
        this.f220865a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof tja0) && wj50.m88271j(this.f220865a, ((tja0) obj).f220865a);
    }

    public final int hashCode() {
        return this.f220865a.hashCode();
    }
}
