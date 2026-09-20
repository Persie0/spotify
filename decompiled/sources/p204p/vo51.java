package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class vo51 {

    /* JADX INFO: renamed from: a */
    public final String f243375a;

    public vo51(String str) {
        this.f243375a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vo51) && wj50.m88271j(this.f243375a, ((vo51) obj).f243375a);
    }

    public final int hashCode() {
        return this.f243375a.hashCode();
    }
}
