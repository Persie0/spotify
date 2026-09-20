package p204p;

/* JADX INFO: loaded from: classes9.dex */
@rtz0
public final class v6q0 {
    public static final u6q0 Companion = new u6q0();

    /* JADX INFO: renamed from: a */
    public final dso f237934a;

    public /* synthetic */ v6q0(int i, dso dsoVar) {
        if ((i & 1) == 0) {
            this.f237934a = null;
        } else {
            this.f237934a = dsoVar;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof v6q0) && wj50.m88271j(this.f237934a, ((v6q0) obj).f237934a);
    }

    public final int hashCode() {
        dso dsoVar = this.f237934a;
        if (dsoVar == null) {
            return 0;
        }
        return dsoVar.hashCode();
    }

    public v6q0(dso dsoVar) {
        this.f237934a = dsoVar;
    }
}
