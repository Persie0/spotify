package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class ge8 extends te8 {

    /* JADX INFO: renamed from: a */
    public final String f79049a;

    public ge8(String str) {
        this.f79049a = str;
    }

    @Override // p204p.te8
    /* JADX INFO: renamed from: a */
    public final String mo32497a() {
        return this.f79049a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ge8) && wj50.m88271j(this.f79049a, ((ge8) obj).f79049a);
    }

    public final int hashCode() {
        return this.f79049a.hashCode();
    }
}
