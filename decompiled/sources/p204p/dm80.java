package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class dm80 implements fm80 {

    /* JADX INFO: renamed from: a */
    public final String f50474a;

    public dm80(String str) {
        this.f50474a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dm80) && wj50.m88271j(this.f50474a, ((dm80) obj).f50474a);
    }

    public final int hashCode() {
        return this.f50474a.hashCode();
    }
}
