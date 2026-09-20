package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class rac1 implements ktx {

    /* JADX INFO: renamed from: a */
    public final String f197263a;

    public rac1(String str) {
        this.f197263a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rac1) && wj50.m88271j(this.f197263a, ((rac1) obj).f197263a);
    }

    public final int hashCode() {
        String str = this.f197263a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }
}
