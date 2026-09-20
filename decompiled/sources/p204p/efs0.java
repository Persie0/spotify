package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class efs0 extends ofs0 {

    /* JADX INFO: renamed from: a */
    public final List f59120a;

    public efs0(List list) {
        this.f59120a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof efs0) && wj50.m88271j(this.f59120a, ((efs0) obj).f59120a);
    }

    public final int hashCode() {
        return this.f59120a.hashCode();
    }
}
