package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class qa21 implements ra21 {

    /* JADX INFO: renamed from: a */
    public final String f186722a;

    public qa21(String str) {
        this.f186722a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qa21) && wj50.m88271j(this.f186722a, ((qa21) obj).f186722a);
    }

    public final int hashCode() {
        return this.f186722a.hashCode();
    }
}
