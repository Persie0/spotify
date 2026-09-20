package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class ied1 extends ked1 {

    /* JADX INFO: renamed from: a */
    public final String f101386a;

    public ied1(String str) {
        this.f101386a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ied1) && wj50.m88271j(this.f101386a, ((ied1) obj).f101386a);
    }

    public final int hashCode() {
        return this.f101386a.hashCode();
    }
}
