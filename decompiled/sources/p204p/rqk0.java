package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class rqk0 extends zqk0 {

    /* JADX INFO: renamed from: a */
    public final tqi f201841a;

    public rqk0(tqi tqiVar) {
        this.f201841a = tqiVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rqk0) && wj50.m88271j(this.f201841a, ((rqk0) obj).f201841a);
    }

    public final int hashCode() {
        tqi tqiVar = this.f201841a;
        if (tqiVar == null) {
            return 0;
        }
        return tqiVar.hashCode();
    }
}
