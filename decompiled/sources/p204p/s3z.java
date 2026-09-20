package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public final class s3z implements u3z {

    /* JADX INFO: renamed from: a */
    public final List f205369a;

    public s3z(List list) {
        this.f205369a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof s3z) && wj50.m88271j(this.f205369a, ((s3z) obj).f205369a);
    }

    public final int hashCode() {
        return this.f205369a.hashCode();
    }
}
