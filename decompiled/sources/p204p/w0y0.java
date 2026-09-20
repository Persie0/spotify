package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class w0y0 implements x0y0 {

    /* JADX INFO: renamed from: a */
    public final String f246888a;

    public w0y0(String str) {
        this.f246888a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof w0y0) && wj50.m88271j(this.f246888a, ((w0y0) obj).f246888a);
    }

    public final int hashCode() {
        return this.f246888a.hashCode();
    }
}
