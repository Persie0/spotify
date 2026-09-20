package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class w2c1 implements b3c1 {

    /* JADX INFO: renamed from: a */
    public final String f247321a;

    public w2c1(String str) {
        this.f247321a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof w2c1) && wj50.m88271j(this.f247321a, ((w2c1) obj).f247321a);
    }

    public final int hashCode() {
        return this.f247321a.hashCode();
    }
}
