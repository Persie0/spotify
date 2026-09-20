package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class keq0 implements qeq0 {

    /* JADX INFO: renamed from: a */
    public final String f121933a;

    public keq0(String str) {
        this.f121933a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof keq0) && wj50.m88271j(this.f121933a, ((keq0) obj).f121933a);
    }

    public final int hashCode() {
        return this.f121933a.hashCode();
    }
}
