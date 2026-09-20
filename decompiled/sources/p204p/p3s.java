package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class p3s {

    /* JADX INFO: renamed from: a */
    public final qas f173699a;

    /* JADX INFO: renamed from: b */
    public final String f173700b;

    /* JADX INFO: renamed from: c */
    public final u3s f173701c;

    /* JADX INFO: renamed from: d */
    public final u3s f173702d;

    /* JADX INFO: renamed from: e */
    public final u3s f173703e;

    /* JADX INFO: renamed from: f */
    public final u3s f173704f;

    public p3s(qas qasVar, String str, u3s u3sVar, u3s u3sVar2, u3s u3sVar3, u3s u3sVar4) {
        this.f173699a = qasVar;
        this.f173700b = str;
        this.f173701c = u3sVar;
        this.f173702d = u3sVar2;
        this.f173703e = u3sVar3;
        this.f173704f = u3sVar4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p3s)) {
            return false;
        }
        p3s p3sVar = (p3s) obj;
        return wj50.m88271j(this.f173699a, p3sVar.f173699a) && wj50.m88271j(this.f173700b, p3sVar.f173700b) && wj50.m88271j(this.f173701c, p3sVar.f173701c) && wj50.m88271j(this.f173702d, p3sVar.f173702d) && wj50.m88271j(this.f173703e, p3sVar.f173703e) && wj50.m88271j(this.f173704f, p3sVar.f173704f);
    }

    public final int hashCode() {
        qas qasVar = this.f173699a;
        int iHashCode = (qasVar == null ? 0 : qasVar.hashCode()) * 31;
        String str = this.f173700b;
        return this.f173704f.hashCode() + ((this.f173703e.hashCode() + ((this.f173702d.hashCode() + ((this.f173701c.hashCode() + ((iHashCode + (str != null ? str.hashCode() : 0)) * 31)) * 31)) * 31)) * 31);
    }
}
