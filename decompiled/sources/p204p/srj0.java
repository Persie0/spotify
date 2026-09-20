package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class srj0 implements urj0 {

    /* JADX INFO: renamed from: a */
    public final List f213329a;

    public srj0(List list) {
        this.f213329a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof srj0) && wj50.m88271j(this.f213329a, ((srj0) obj).f213329a);
    }

    public final int hashCode() {
        return this.f213329a.hashCode();
    }
}
