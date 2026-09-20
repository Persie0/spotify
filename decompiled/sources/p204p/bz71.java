package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class bz71 extends jz71 {

    /* JADX INFO: renamed from: a */
    public final String f32430a;

    public bz71(String str) {
        this.f32430a = str;
    }

    @Override // p204p.jz71
    /* JADX INFO: renamed from: a */
    public final String mo30975a() {
        return this.f32430a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bz71) && wj50.m88271j(this.f32430a, ((bz71) obj).f32430a);
    }

    public final int hashCode() {
        return this.f32430a.hashCode();
    }
}
