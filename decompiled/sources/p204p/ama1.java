package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class ama1 implements gma1 {

    /* JADX INFO: renamed from: a */
    public final String f17076a;

    public ama1(String str) {
        this.f17076a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ama1) && wj50.m88271j(this.f17076a, ((ama1) obj).f17076a);
    }

    public final int hashCode() {
        return this.f17076a.hashCode();
    }
}
