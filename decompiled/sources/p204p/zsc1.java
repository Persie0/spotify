package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class zsc1 implements etc1 {

    /* JADX INFO: renamed from: a */
    public final String f285919a;

    public zsc1(String str) {
        this.f285919a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zsc1) && wj50.m88271j(this.f285919a, ((zsc1) obj).f285919a);
    }

    public final int hashCode() {
        return this.f285919a.hashCode();
    }
}
