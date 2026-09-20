package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class ug80 extends xg80 {

    /* JADX INFO: renamed from: a */
    public final String f230015a;

    public ug80(String str) {
        this.f230015a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ug80) && wj50.m88271j(this.f230015a, ((ug80) obj).f230015a);
    }

    public final int hashCode() {
        return this.f230015a.hashCode();
    }
}
