package p204p;

import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class whc implements yhc {

    /* JADX INFO: renamed from: a */
    public final Set f251302a;

    public whc(Set set) {
        this.f251302a = set;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof whc) && wj50.m88271j(this.f251302a, ((whc) obj).f251302a);
    }

    public final int hashCode() {
        return this.f251302a.hashCode();
    }
}
