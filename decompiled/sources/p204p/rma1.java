package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class rma1 implements sma1 {

    /* JADX INFO: renamed from: a */
    public final String f200487a;

    public rma1(String str) {
        this.f200487a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rma1) && wj50.m88271j(this.f200487a, ((rma1) obj).f200487a);
    }

    public final int hashCode() {
        return this.f200487a.hashCode();
    }
}
