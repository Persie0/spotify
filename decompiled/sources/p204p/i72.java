package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class i72 extends j72 {

    /* JADX INFO: renamed from: a */
    public final List f99407a;

    public i72(List list) {
        this.f99407a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i72) && wj50.m88271j(this.f99407a, ((i72) obj).f99407a);
    }

    public final int hashCode() {
        return this.f99407a.hashCode();
    }
}
