package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class gh80 implements jh80 {

    /* JADX INFO: renamed from: a */
    public final String f79852a;

    public gh80(String str) {
        this.f79852a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gh80) && wj50.m88271j(this.f79852a, ((gh80) obj).f79852a);
    }

    public final int hashCode() {
        return this.f79852a.hashCode();
    }
}
