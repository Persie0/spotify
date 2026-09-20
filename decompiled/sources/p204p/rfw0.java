package p204p;

import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class rfw0 implements sfw0 {

    /* JADX INFO: renamed from: a */
    public final Set f198756a;

    public rfw0(Set set) {
        this.f198756a = set;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rfw0) && wj50.m88271j(this.f198756a, ((rfw0) obj).f198756a);
    }

    public final int hashCode() {
        return this.f198756a.hashCode();
    }
}
