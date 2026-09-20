package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
public final class hni0 implements j0w0 {

    /* JADX INFO: renamed from: a */
    public final ArrayList f93345a;

    public hni0(ArrayList arrayList) {
        this.f93345a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hni0) && this.f93345a.equals(((hni0) obj).f93345a);
    }

    public final int hashCode() {
        return this.f93345a.hashCode();
    }
}
