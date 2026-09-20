package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class kmr0 {

    /* JADX INFO: renamed from: a */
    public final List f124203a;

    public kmr0(List list) {
        this.f124203a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof kmr0) && wj50.m88271j(this.f124203a, ((kmr0) obj).f124203a);
    }

    public final int hashCode() {
        return this.f124203a.hashCode();
    }
}
