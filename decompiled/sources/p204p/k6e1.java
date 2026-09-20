package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class k6e1 implements l6e1 {

    /* JADX INFO: renamed from: a */
    public final String f119745a;

    public k6e1(String str) {
        this.f119745a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof k6e1) && wj50.m88271j(this.f119745a, ((k6e1) obj).f119745a);
    }

    public final int hashCode() {
        return this.f119745a.hashCode();
    }
}
