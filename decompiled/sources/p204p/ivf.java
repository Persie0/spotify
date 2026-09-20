package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public final class ivf extends rvf {

    /* JADX INFO: renamed from: a */
    public final Object f106208a;

    public ivf(List list) {
        this.f106208a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ivf) && this.f106208a.equals(((ivf) obj).f106208a);
    }

    public final int hashCode() {
        return this.f106208a.hashCode();
    }
}
