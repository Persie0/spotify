package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class blt implements bnt {

    /* JADX INFO: renamed from: a */
    public final List f28285a;

    public blt(List list) {
        this.f28285a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof blt) && wj50.m88271j(this.f28285a, ((blt) obj).f28285a);
    }

    public final int hashCode() {
        return this.f28285a.hashCode();
    }
}
