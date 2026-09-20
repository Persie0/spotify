package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class twf {

    /* JADX INFO: renamed from: a */
    public final swf f224434a;

    public twf(swf swfVar) {
        this.f224434a = swfVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof twf) && wj50.m88271j(this.f224434a, ((twf) obj).f224434a);
    }

    public final int hashCode() {
        swf swfVar = this.f224434a;
        if (swfVar == null) {
            return 0;
        }
        return swfVar.hashCode();
    }
}
