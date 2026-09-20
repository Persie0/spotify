package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class nvj {

    /* JADX INFO: renamed from: a */
    public final String f158912a;

    /* JADX INFO: renamed from: b */
    public final lvj f158913b;

    public nvj(String str, lvj lvjVar) {
        this.f158912a = str;
        this.f158913b = lvjVar;
    }

    /* JADX INFO: renamed from: a */
    public static nvj m65746a(nvj nvjVar, String str, lvj lvjVar, int i) {
        if ((i & 1) != 0) {
            str = nvjVar.f158912a;
        }
        if ((i & 2) != 0) {
            lvjVar = nvjVar.f158913b;
        }
        nvjVar.getClass();
        return new nvj(str, lvjVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nvj)) {
            return false;
        }
        nvj nvjVar = (nvj) obj;
        return wj50.m88271j(this.f158912a, nvjVar.f158912a) && wj50.m88271j(this.f158913b, nvjVar.f158913b);
    }

    public final int hashCode() {
        return this.f158913b.hashCode() + (this.f158912a.hashCode() * 31);
    }
}
