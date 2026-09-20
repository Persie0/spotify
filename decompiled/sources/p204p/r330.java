package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class r330 implements u330 {

    /* JADX INFO: renamed from: a */
    public final String f195415a;

    public r330(String str) {
        this.f195415a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof r330) && wj50.m88271j(this.f195415a, ((r330) obj).f195415a);
    }

    public final int hashCode() {
        return this.f195415a.hashCode();
    }
}
