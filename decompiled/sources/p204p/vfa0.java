package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class vfa0 {

    /* JADX INFO: renamed from: a */
    public final String f240920a;

    public vfa0(String str) {
        this.f240920a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vfa0) && wj50.m88271j(this.f240920a, ((vfa0) obj).f240920a);
    }

    public final int hashCode() {
        String str = this.f240920a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }
}
