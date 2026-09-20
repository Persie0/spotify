package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class z3z {

    /* JADX INFO: renamed from: a */
    public final String f279060a;

    /* JADX INFO: renamed from: b */
    public final String f279061b;

    /* JADX INFO: renamed from: c */
    public final wfz f279062c;

    /* JADX INFO: renamed from: d */
    public final int f279063d;

    /* JADX INFO: renamed from: e */
    public final String f279064e;

    /* JADX INFO: renamed from: f */
    public final nuf f279065f;

    public z3z(String str, String str2, wfz wfzVar, int i, String str3, nuf nufVar) {
        this.f279060a = str;
        this.f279061b = str2;
        this.f279062c = wfzVar;
        this.f279063d = i;
        this.f279064e = str3;
        this.f279065f = nufVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z3z)) {
            return false;
        }
        z3z z3zVar = (z3z) obj;
        return wj50.m88271j(this.f279060a, z3zVar.f279060a) && wj50.m88271j(this.f279061b, z3zVar.f279061b) && wj50.m88271j(this.f279062c, z3zVar.f279062c) && this.f279063d == z3zVar.f279063d && wj50.m88271j(this.f279064e, z3zVar.f279064e) && this.f279065f == z3zVar.f279065f;
    }

    public final int hashCode() {
        return this.f279065f.hashCode() + s571.m77243b(mt60.m62800g(this.f279063d, (this.f279062c.hashCode() + s571.m77243b(this.f279060a.hashCode() * 31, 31, this.f279061b)) * 31, 31), 31, this.f279064e);
    }
}
