package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class jw60 implements sw60 {

    /* JADX INFO: renamed from: a */
    public final String f116597a;

    public jw60(String str) {
        this.f116597a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jw60) && wj50.m88271j(this.f116597a, ((jw60) obj).f116597a);
    }

    public final int hashCode() {
        return this.f116597a.hashCode();
    }
}
