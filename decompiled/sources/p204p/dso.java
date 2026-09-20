package p204p;

/* JADX INFO: loaded from: classes9.dex */
@rtz0
public final class dso {
    public static final xro Companion = new xro();

    /* JADX INFO: renamed from: a */
    public final a2w f52608a;

    public /* synthetic */ dso(int i, a2w a2wVar) {
        if ((i & 1) == 0) {
            this.f52608a = null;
        } else {
            this.f52608a = a2wVar;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dso) && wj50.m88271j(this.f52608a, ((dso) obj).f52608a);
    }

    public final int hashCode() {
        a2w a2wVar = this.f52608a;
        if (a2wVar == null) {
            return 0;
        }
        return a2wVar.hashCode();
    }

    public dso(a2w a2wVar) {
        this.f52608a = a2wVar;
    }
}
