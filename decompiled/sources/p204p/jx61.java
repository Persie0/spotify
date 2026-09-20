package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class jx61 {

    /* JADX INFO: renamed from: a */
    public final List f116819a;

    public jx61(List list) {
        this.f116819a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jx61) && wj50.m88271j(this.f116819a, ((jx61) obj).f116819a);
    }

    public final int hashCode() {
        return this.f116819a.hashCode();
    }
}
